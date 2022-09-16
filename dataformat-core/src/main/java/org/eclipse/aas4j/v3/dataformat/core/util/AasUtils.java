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
package org.eclipse.aas4j.v3.dataformat.core.util;

import com.google.common.reflect.TypeToken;
import org.eclipse.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.impl.DefaultKey;
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
    private static final String KEY_REGEX_GROUP_ID_TYPE = "idtype";
    private static final String KEY_REGEX_GROUP_VALUE = "value";
    private static final Pattern KEY_REGEX = Pattern.compile(
            String.format("\\((?<%s>\\w+)\\)\\[(?<%s>\\w+)\\](?<%s>.*)",
                    KEY_REGEX_GROUP_TYPE,
                    KEY_REGEX_GROUP_ID_TYPE,
                    KEY_REGEX_GROUP_VALUE));

    private AasUtils() {
    }

    /**
     * Formats a Reference as string
     *
     * @param reference Reference to serialize
     * @return string representation of the reference for serialization, null if
     * reference is null
     */
    public static String asString(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.getKeys().stream()
                .map(x -> String.format("(%s)[%s]%s",
                serializeEnumName(x.getType().name()),
                x.getValue()))
                .collect(Collectors.joining(","));
    }

    /**
     * Parses a given string as Reference. If the given string is not a valid
     * reference, null is returned.
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
     * Parses a given string as Reference using the provided implementation of
     * Reference and Key interface. If the given string is not a valid
     * reference, null is returned.
     *
     * @param value String representation of the reference
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     * @return parsed Reference or null is given value is not a valid Reference
     */
    public static Reference parseReference(String value, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        if (value == null || value.isBlank()) {
            return null;
        }
        try {
            Reference result = referenceType.getConstructor().newInstance();
            result.setKeys(Stream.of(value.split(",")).map(x -> parseKey(x)).collect(Collectors.toList()));
            // TODO: ReferenceType is ignored
            //  result.setType(Stream.of(value.split(",")).map(x -> parseReferenceType(x)).collect(Collectors.toList()));
            return result;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException("error parsing reference - could not instantiate reference type", ex);
        }
    }

    /**
     * Gets property with given name as defined in type of given parent or null
     * if not defined
     *
     * @param parent parent object
     * @param propertyName name of the property
     * @return property with given name as defined in type of given parent or
     * null if not defined
     */
    public static PropertyDescriptor getProperty(Object parent, String propertyName) {
        if (parent == null || propertyName == null || propertyName.isBlank()) {
            return null;
        }
        return getAasProperties(parent.getClass()).stream()
                .filter(x -> x.getName().equals(propertyName))
                .findAny()
                .orElse(null);
    }

    /**
     * Gets the content type of a generic collection type
     *
     * @param genericCollectionType the generic collection type
     * @return the content type of the generic collection type
     */
    public static Class<?> getCollectionContentType(Type genericCollectionType) {
        return TypeToken.of(genericCollectionType).resolveType(Collection.class.getTypeParameters()[0]).getRawType();
    }

    /**
     * Gets property with given name as defined in given type or null if not
     * defined
     *
     * @param type type containing the property
     * @param propertyName name of the property
     * @return property with given name as defined in given type or null if not
     * defined
     */
    public static PropertyDescriptor getProperty(Class<?> type, String propertyName) {
        if (type == null || propertyName == null || propertyName.isBlank()) {
            return null;
        }
        return getAasProperties(type).stream()
                .filter(x -> x.getName().equals(propertyName))
                .findAny()
                .orElse(null);
    }

    /**
     * Parses a given string as Key. If the given string is not a valid key,
     * null is returned.
     *
     * @param value String representation of the key
     * @return parsed Key or null is given value is not a valid Key
     */
    public static Key parseKey(String value) {
        Matcher matcher = KEY_REGEX.matcher(value);
        if (matcher.find()) {
            KeyTypes keyType = KeyTypes.valueOf(deserializeEnumName(matcher.group(KEY_REGEX_GROUP_ID_TYPE)));
            return new DefaultKey.Builder()
                    .type(keyType)
                    .value(matcher.group(KEY_REGEX_GROUP_VALUE))
                    .build();
        }
        return null;
    }

    /**
     * Checks if a reference is a local reference or not. This functionality may
     * not be 100% correct as since v3.0RC01 of the AAS specification there no
     * longer is an isLocal property to check this and no alternative way to
     * determine whether a reference is local or not is introduced. This method
     * only checks for the presence of any Key with type GLOBAL_REFERENCE.
     * Another approach would be to actually try resolving the reference
     * locally.
     *
     * @param reference The reference to check
     * @param environment The environment context the reference resides. In
     * current implementation this is not used
     * @return true if the reference is a local reference to the given
     * environment, false otherwise
     */
    public static boolean isLocal(Reference reference, Environment environment) {
        return !reference.getKeys().stream().anyMatch(x -> x.getType() == KeyTypes.GLOBAL_REFERENCE);
    }

    public static List<Submodel> getSubmodelTemplates(AssetAdministrationShell aas, Environment environment) {
        return aas.getSubmodels().stream()
                .map(ref -> resolve(ref, environment, Submodel.class))
                .filter(sm -> sm != null)
                .filter(sm -> sm.getKind() != ModelingKind.INSTANCE)
                .collect(Collectors.toList());
    }

    public static boolean hasTemplate(AssetAdministrationShell aas, Environment environment) {
        return !getSubmodelTemplates(aas, environment).isEmpty();
    }

    /**
     * Creates a reference for an Identifiable instance using provided
     * implementation types for reference and key
     *
     * @param identifiable the identifiable to create the reference for
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     * @return a reference representing the identifiable
     */
    public static Reference toReference(Identifiable identifiable, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        try {
            Reference reference = referenceType.getConstructor().newInstance();
            Key key = keyType.getConstructor().newInstance();
            key.setType(referableToKeyType(identifiable));
            key.setValue(identifiable.getId());
            reference.setKeys(List.of(key));
            return reference;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException("error parsing reference - could not instantiate reference type", ex);
        }
    }

    /**
     * Creates a reference for an Identifiable instance
     *
     * @param identifiable the identifiable to create the reference for
     * @return a reference representing the identifiable
     */
    public static Reference toReference(Identifiable identifiable) {
        return toReference(identifiable, ReflectionHelper.getDefaultImplementation(Reference.class), ReflectionHelper.getDefaultImplementation(Key.class));
    }

    /**
     * Gets the KeyElements type matching the provided Referable
     *
     * @param referable The referable to convert to KeyElements type
     * @return the most specific KeyElements type representing the Referable,
     * i.e. abstract types like SUBMODEL_ELEMENT or DATA_ELEMENT are never
     * returned; null if there is no corresponding KeyElements type
     */
    public static KeyTypes referableToKeyType(Referable referable) {
        Class<?> aasInterface = ReflectionHelper.getAasInterface(referable.getClass());
        if (aasInterface != null) {
            return KeyTypes.valueOf(deserializeEnumName(aasInterface.getSimpleName()));
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
        result += input.charAt(0);
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
     * @return a Java interface representing the provided KeyElements type or
     * null if no matching Class/interface could be found. It also returns
     * abstract types like SUBMODEL_ELEMENT or DATA_ELEMENT
     */
    public static Class<?> keyTypeToClass(KeyTypes key) {
        return Stream.concat(ReflectionHelper.INTERFACES.stream(), ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream())
                .filter(x -> x.getSimpleName().equals(serializeEnumName(key.name())))
                .findAny()
                .orElse(null);
    }

    /**
     * Creates a reference for an element given a potential parent using
     * provided implementation types for reference and key
     *
     * @param parent Reference to the parent. Can only be null when element is
     * instance of Identifiable, otherwise result will always be null
     * @param element the element to create a reference for
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     *
     * @return A reference representing the element or null if either element is
     * null or parent is null and element not an instance of Identifiable. In
     * case element is an instance of Identifiable, the returned reference will
     * only contain one key pointing directly to the element.
     */
    public static Reference toReference(Reference parent, Referable element, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        if (element == null) {
            return null;
        } else if (Identifiable.class.isAssignableFrom(element.getClass())) {
            return toReference((Identifiable) element, referenceType, keyType);
        } else {
            Reference result = clone(parent, referenceType, keyType);
            if (result != null) {
                try {
                    Key newKey = keyType.getConstructor().newInstance();
                    newKey.setType(AasUtils.referableToKeyType(element));
                    newKey.setValue(element.getIdShort());
                    result.getKeys().add(newKey);
                } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    throw new IllegalArgumentException("error parsing reference - could not instantiate reference type", ex);
                }
            }
            return result;
        }
    }

    /**
     * Creates a reference for an element given a potential parent
     *
     * @param parent Reference to the parent. Can only be null when element is
     * instance of Identifiable, otherwise result will always be null
     * @param element the element to create a reference for
     * @return A reference representing the element or null if either element is
     * null or parent is null and element not an instance of Identifiable. In
     * case element is an instance of Identifiable, the returned reference will
     * only contain one key pointing directly to the element.
     */
    public static Reference toReference(Reference parent, Referable element) {
        return toReference(parent,
                element,
                ReflectionHelper.getDefaultImplementation(Reference.class),
                ReflectionHelper.getDefaultImplementation(Key.class));
    }

    /**
     * Checks if two references are refering to the same element
     *
     * @param ref1 reference 1
     * @param ref2 reference 2
     * @return returns true if both references are refering to the same element,
     * otherwise false
     */
    public static boolean sameAs(Reference ref1, Reference ref2) {
        boolean ref1Empty = ref1 == null || ref1.getKeys() == null || ref1.getKeys().isEmpty();
        boolean ref2Empty = ref2 == null || ref2.getKeys() == null || ref2.getKeys().isEmpty();
        if (ref1Empty && ref2Empty) {
            return true;
        }
        if (ref1Empty != ref2Empty) {
            return false;
        }
        int keyLength = Math.min(ref1.getKeys().size(), ref2.getKeys().size());
        for (int i = 0; i < keyLength; i++) {
            Key ref1Key = ref1.getKeys().get(ref1.getKeys().size() - (i + 1));
            Key ref2Key = ref2.getKeys().get(ref2.getKeys().size() - (i + 1));
            Class<?> ref1Type = keyTypeToClass(ref1Key.getType());
            Class<?> ref2Type = keyTypeToClass(ref2Key.getType());
            if ((ref1Type == null && ref2Type != null)
                    || (ref1Type != null && ref2Type == null)) {
                return false;
            }
            if (ref1Type != ref2Type) {
                if (!(ref1Type.isAssignableFrom(ref2Type)
                        || ref2Type.isAssignableFrom(ref1Type))) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Creates a deep-copy clone of a reference
     *
     * @param reference the reference to clone
     * @return the cloned reference
     */
    public static Reference clone(Reference reference) {
        return clone(reference, ReflectionHelper.getDefaultImplementation(Reference.class), ReflectionHelper.getDefaultImplementation(Key.class));
    }

    /**
     * Creates a deep-copy clone of a reference using provided implementation
     * types for reference and key
     *
     * @param reference the reference to clone
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     *
     * @return the cloned reference
     */
    public static Reference clone(Reference reference, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        if (reference == null || reference.getKeys() == null || reference.getKeys().isEmpty()) {
            return null;
        }
        try {
            Reference result = referenceType.getConstructor().newInstance();
            List<Key> newKeys = new ArrayList<>();
            for (Key key : reference.getKeys()) {
                Key newKey = keyType.getConstructor().newInstance();
                newKey.setType(key.getType());
                newKey.setValue(key.getValue());
                newKeys.add(newKey);
            }
            result.setKeys(newKeys);
            return result;
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException("error parsing reference - could not instantiate reference type", ex);
        }
    }

    /**
     * Resolves a Reference within an AssetAdministrationShellEnvironment and
     * returns the targeted object if available, null otherwise
     *
     *
     * @param reference The reference to resolve
     * @param env The AssetAdministrationShellEnvironment to resolve the
     * reference against
     * @return returns an instance of T if the reference could successfully be
     * resolved, otherwise null
     * @throws IllegalArgumentException if something goes wrong while resolving
     */
    public static Referable resolve(Reference reference, Environment env) {
        return resolve(reference, env, Referable.class);
    }

    /**
     * Resolves a Reference within an AssetAdministrationShellEnvironment and
     * returns the targeted object if available, null otherwise
     *
     * @param <T> sub-type of Referable of the targeted type. If unknown use
     * Referable.class
     * @param reference The reference to resolve
     * @param env The AssetAdministrationShellEnvironment to resolve the
     * reference against
     * @param type desired return type, use Referable.class is unknwon/not
     * needed
     * @return returns an instance of T if the reference could successfully be
     * resolved, otherwise null
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
                    } catch (Exception ex) {
                        throw new IllegalArgumentException("error resolving reference", ex);
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
     * Gets a list of all properties defined for a class implementing at least
     * one AAS interface.
     *
     * @param type A class implementing at least one AAS interface. If it is
     * does not implement any AAS interface the result will be an empty list
     * @return a list of all properties defined in any of AAS interface
     * implemented by type. If type does not implement any AAS interface an
     * empty list is returned.
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
