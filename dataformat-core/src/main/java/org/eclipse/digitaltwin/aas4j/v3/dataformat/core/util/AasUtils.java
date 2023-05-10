/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util;

import com.google.common.reflect.TypeToken;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Provides utility functions related to AAS
 */
public class AasUtils {

    private static final Logger log = LoggerFactory.getLogger(AasUtils.class);

    private static final char UNDERSCORE = '_';
    private static final String KEY_REGEX_GROUP_TYPE = "type";
    private static final String KEY_REGEX_GROUP_VALUE = "value";
    private static final Pattern KEY_REGEX = Pattern.compile(
            String.format("\\((?<%s>\\w+)\\)(?<%s>.*)",
                    KEY_REGEX_GROUP_TYPE,
                    KEY_REGEX_GROUP_VALUE));
    private static final String REFERENCE_REGEX_GROUP_TYPE = "value";
    private static final Pattern REFERENCE_TYPE_PREFIX_REGEX = Pattern.compile(
            String.format("\\[(?<%s>[a-zA-Z]+)\\].*", REFERENCE_REGEX_GROUP_TYPE));

    private static final String REFERENCE_ELEMENT_DELIMITER = ", ";

    private AasUtils() {
    }

    /**
     * Formats a Reference as string
     *
     * @param reference Reference to serialize
     * @return string representation of the reference for serialization, null if reference is null
     */
    public static String asString(Reference reference) {
        if (reference == null) {
            return null;
        }
        return String.format("[%s]%s", reference.getType(),
                reference.getKeys().stream()
                        .map(x -> String.format("(%s)%s",
                        serializeEnumName(x.getType().name()),
                        x.getValue()))
                        .collect(Collectors.joining(REFERENCE_ELEMENT_DELIMITER)));
    }

    /**
     * Parses a given string as Reference. If the given string is not a valid reference, null is returned.
     *
     * @param value String representation of the reference
     * @return parsed Reference or null is given value is not a valid Reference
     */
    public static Reference parseReference(String value) {
        return parseReference(value,
                ReflectionHelper.getDefaultImplementation(Reference.class),
                ReflectionHelper.getDefaultImplementation(Key.class));
    }

    /**
     * Parses a given string as Reference using the provided implementation of Reference and Key interface. If the given
     * string is not a valid reference, null is returned.
     *
     * @param value String representation of the reference
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     * @return parsed Reference or null is given value is not a valid Reference
     */
    public static Reference parseReference(String value, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        String reference = value;
        if (reference == null || reference.isBlank()) {
            return null;
        }
        try {
            Reference result = referenceType.getConstructor().newInstance();
            // check if optional [<ReferenceTypes>] is present, if so, check for consistency
            Matcher matcher = REFERENCE_TYPE_PREFIX_REGEX.matcher(reference);
            if (matcher.find()) {
                result.setType(ReferenceTypes.valueOf(deserializeEnumName(matcher.group(REFERENCE_REGEX_GROUP_TYPE))));
                reference = reference.substring(reference.indexOf(serializeEnumName(result.getType().name())) + 1);

            }
            result.setKeys(Stream.of(reference.split(REFERENCE_ELEMENT_DELIMITER))
                    .map(x -> parseKey(x))
                    .collect(Collectors.toList()));
            if (!result.getKeys().isEmpty()) {
                if (result.getType() == null) {
                    // deduct from first element
                    result.setType(result.getKeys().get(0).getType() == KeyTypes.GLOBAL_REFERENCE
                            ? ReferenceTypes.EXTERNAL_REFERENCE
                            : ReferenceTypes.MODEL_REFERENCE);
                } else {
                    // validate against first element
                    if (!isCompatible(result.getKeys().get(0).getType(), result.getType())) {
                        throw new IllegalArgumentException(String.format("invalid reference - reference type '%s' is not compatible with type of first key elemenet '%s'",
                                result.getType(), result.getKeys().get(0)));
                    }
                }
            }
            // check that keys following SubmodelElementList have valid index (i.e. are number >= 0)
            validateSubmodelElementListKeyValues(result.getKeys());
            return result;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException("error parsing reference - could not instantiate reference type", ex);
        }
    }

    private static void validateSubmodelElementListKeyValues(List<Key> keys) {
        if (keys == null || keys.size() <= 1) {
            return;
        }
        for (int i = 0; i < keys.size() - 1; i++) {
            if (keys.get(i).getType() == KeyTypes.SUBMODEL_ELEMENT_LIST) {
                try {
                    if (Integer.parseInt(keys.get(i + 1).getValue()) < 0) {
                        throw new IllegalArgumentException(String.format("invalid value for key with index %d, expected integer values >= 0, but found '%s'",
                                i, keys.get(i + 1).getValue()));
                    }
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException(String.format("invalid value for key with index %d, expected integer values >= 0, but found '%s'",
                            i, keys.get(i + 1).getValue()));
                }
            }
        }
    }

    private static boolean isCompatible(KeyTypes keyType, ReferenceTypes referenceType) {
        if (keyType == null && referenceType == null) {
            return true;
        }
        if (keyType == null ^ referenceType == null) {
            return false;
        }
        return referenceType == ReferenceTypes.EXTERNAL_REFERENCE
                ? keyType == KeyTypes.GLOBAL_REFERENCE
                : keyType != KeyTypes.GLOBAL_REFERENCE;
    }


    /**
     * Parses a given string as Key. If the given string is not a valid key, null is returned.
     *
     * @param value String representation of the key
     * @return parsed Key or null is given value is not a valid Key
     */
    public static Key parseKey(String value) {
        Matcher matcher = KEY_REGEX.matcher(value);
        if (matcher.find()) {
            return new DefaultKey.Builder()
                    .type(KeyTypes.valueOf(deserializeEnumName(matcher.group(KEY_REGEX_GROUP_TYPE))))
                    .value(matcher.group(KEY_REGEX_GROUP_VALUE))
                    .build();
        }
        return null;
    }


    /**
     * Translates an enum value from SCREAMING_SNAKE_CASE to CamelCase
     *
     * @param input input name in SCREAMING_SNAKE_CASE
     * @return name in CamelCase
     */
    public static String serializeEnumName(String input) {
        String result = "";
        boolean capitalize = true;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (UNDERSCORE == currentChar) {
                capitalize = true;
            } else {
                result += capitalize
                        ? currentChar
                        : Character.toLowerCase(currentChar);
                capitalize = false;
            }
        }
        return result;
    }

    /**
     * Translates an enum value from CamelCase to SCREAMING_SNAKE_CASE
     *
     * @param input input name in CamelCase
     * @return name in SCREAMING_SNAKE_CASE
     */
    public static String deserializeEnumName(String input) {
        String result = "";
        if (input == null || input.isEmpty()) {
            return result;
        }
        result += Character.toUpperCase(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i),
                    previousChar = input.charAt(i - 1);
            if (Character.isUpperCase(currentChar) && Character.isLowerCase(previousChar)) {
                result += UNDERSCORE;
            }
            result += Character.toUpperCase(currentChar);
        }
        return result;
    }

    /**
     * Gets a Java interface representing the type provided by key.
     *
     * @param key The KeyElements type
     * @return a Java interface representing the provided KeyElements type or null if no matching Class/interface could
     * be found. It also returns abstract types like SUBMODEL_ELEMENT or DATA_ELEMENT
     */
    public static Class<?> keyTypeToClass(KeyTypes key) {
        return Stream.concat(ReflectionHelper.INTERFACES.stream(), ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream())
                .filter(x -> x.getSimpleName().equals(serializeEnumName(key.name())))
                .findAny()
                .orElse(null);
    }

    /**
     * Resolves a Reference within an AssetAdministrationShellEnvironment and returns the targeted object if available,
     * null otherwise
     *
     *
     * @param reference The reference to resolve
     * @param env The AssetAdministrationShellEnvironment to resolve the reference against
     * @return returns an instance of T if the reference could successfully be resolved, otherwise null
     */
    public static Referable resolve(Reference reference, Environment env) {
        return resolve(reference, env, Referable.class);
    }

    /**
     * Resolves a Reference within an AssetAdministrationShellEnvironment and returns the targeted object if available,
     * null otherwise
     *
     * @param <T> sub-type of Referable of the targeted type. If unknown use Referable.class
     * @param reference The reference to resolve
     * @param env The AssetAdministrationShellEnvironment to resolve the reference against
     * @param type desired return type, use Referable.class is unknwon/not needed
     * @return returns an instance of T if the reference could successfully be resolved, otherwise null
     * @throws IllegalArgumentException if something goes wrong while resolving
     */
    public static <T extends Referable> T resolve(Reference reference, Environment env, Class<T> type) {
        if (reference == null || reference.getKeys() == null || reference.getKeys().isEmpty()) {
            return null;
        }
        Set<Identifiable> identifiables = new IdentifiableCollector(env).collect();
        Object current = null;
        int i = reference.getKeys().size() - 1;
        if (type != null) {
            Class<?> actualType = keyTypeToClass(reference.getKeys().get(i).getType());
            if (actualType == null) {
                log.warn("reference {} could not be resolved as key type has no known class.",
                        asString(reference));
                return null;
            }
            if (!type.isAssignableFrom(actualType)) {
                log.warn("reference {} could not be resolved as target type is not assignable from actual type (target: {}, actual: {})",
                        asString(reference), type.getName(), actualType.getName());
                return null;
            }
        }
        for (; i >= 0; i--) {
            Key key = reference.getKeys().get(i);
            Class<?> referencedType = keyTypeToClass(key.getType());
            if (referencedType != null) {
                List<Identifiable> matchingIdentifiables = identifiables.stream()
                        .filter(x -> referencedType.isAssignableFrom(x.getClass()))
                        .filter(x -> x.getId().equals(key.getValue()))
                        .collect(Collectors.toList());
                if (matchingIdentifiables.size() > 1) {
                    throw new IllegalArgumentException("found multiple matching Identifiables for id '" + key.getValue() + "'");
                }
                if (matchingIdentifiables.size() == 1) {
                    current = matchingIdentifiables.get(0);
                    break;
                }
            }
        }
        if (current == null) {
            return null;
        }
        i++;
        if (i == reference.getKeys().size()) {
            return (T) current;
        }
        // follow idShort path until target
        for (; i < reference.getKeys().size(); i++) {
            Key key = reference.getKeys().get(i);
            Class<?> keyType = keyTypeToClass(key.getType());
            if (keyType != null) {
                if (SubmodelElementList.class.isAssignableFrom(current.getClass())) {
                    try {
                        current = ((SubmodelElementList) current).getValue().get(Integer.parseInt(key.getValue()));
                    } catch (NumberFormatException ex) {
                        throw new IllegalArgumentException(String.format("invalid value for key with index %d, expected integer values >= 0, but found '%s'",
                                i, key.getValue()));
                    } catch (IndexOutOfBoundsException ex) {
                        throw new IllegalArgumentException(String.format("index out of bounds exception for key with index %d, expected integer values >= 0 and < %d, but found '%s'",
                                i,
                                ((SubmodelElementList) current).getValue().size(),
                                key.getValue()));
                    }
                } else {
                    Collection collection;
                    // operation needs special handling because of nested values               
                    if (Operation.class.isAssignableFrom(current.getClass())) {
                        Operation operation = (Operation) current;
                        collection = Stream.of(operation.getInputVariables().stream(),
                                operation.getOutputVariables().stream(),
                                operation.getInoutputVariables().stream())
                                .flatMap(x -> x.map(y -> y.getValue()))
                                .collect(Collectors.toSet());
                    } else {
                        List<PropertyDescriptor> matchingProperties = getAasProperties(current.getClass()).stream()
                                .filter(x -> Collection.class.isAssignableFrom(x.getReadMethod().getReturnType()))
                                .filter(x -> TypeToken.of(x.getReadMethod().getGenericReturnType())
                                .resolveType(Collection.class.getTypeParameters()[0])
                                .isSupertypeOf(keyType))
                                .collect(Collectors.toList());
                        if (matchingProperties.isEmpty()) {
                            throw new IllegalArgumentException(String.format("error resolving reference - could not find matching property for type %s in class %s",
                                    keyType.getSimpleName(),
                                    current.getClass().getSimpleName()));
                        }
                        if (matchingProperties.size() > 1) {
                            throw new IllegalArgumentException(String.format("error resolving reference - found %d possible property paths for class %s (%s)",
                                    matchingProperties.size(),
                                    current.getClass().getSimpleName(),
                                    matchingProperties.stream()
                                            .map(x -> x.getName())
                                            .collect(Collectors.joining(", "))));
                        }
                        try {
                            collection = (Collection) matchingProperties.get(0).getReadMethod().invoke(current);
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                            throw new IllegalArgumentException("error resolving reference", ex);
                        }
                    }
                    Optional next = collection.stream()
                            .filter(x -> ((Referable) x).getIdShort().equals(key.getValue()))
                            .findFirst();
                    if (next.isEmpty()) {
                        throw new IllegalArgumentException("error resolving reference - could not find idShort " + key.getValue());
                    }
                    current = next.get();
                }
            }
        }
        return (T) current;
    }

    /**
     * Gets a list of all properties defined for a class implementing at least one AAS interface.
     *
     * @param type A class implementing at least one AAS interface. If it is does not implement any AAS interface the
     * result will be an empty list
     * @return a list of all properties defined in any of AAS interface implemented by type. If type does not implement
     * any AAS interface an empty list is returned.
     */
    public static List<PropertyDescriptor> getAasProperties(Class<?> type) {
        Class<?> aasType = ReflectionHelper.getAasInterface(type);
        if (aasType == null) {
            aasType = ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream()
                    .filter(x -> x.isAssignableFrom(type))
                    .map(x -> TypeToken.of(x))
                    .sorted(new MostSpecificTypeTokenComparator())
                    .findFirst().get()
                    .getRawType();
        }
        Set<Class<?>> types = new HashSet<>();
        if (aasType != null) {
            types.add(aasType);
            types.addAll(ReflectionHelper.getSuperTypes(aasType, true));
        }
        return types.stream()
                .flatMap(x -> {
                    try {
                        return Stream.of(Introspector.getBeanInfo(x).getPropertyDescriptors());
                    } catch (IntrospectionException ex) {
                        log.warn("error finding properties of class '{}'", type, ex);
                    }
                    return Stream.empty();
                })
                .sorted(Comparator.comparing(x -> x.getName()))
                .collect(Collectors.toList());
    }
}
