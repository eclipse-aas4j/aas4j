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

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.IdentifiableCollector;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.MostSpecificTypeTokenComparator;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.reflect.TypeToken;

/**
 * Provides utility functions related to AAS
 */
public class AasUtils {

    private static final Logger log = LoggerFactory.getLogger(AasUtils.class);

	private static final String REFERENCE_ELEMENT_DELIMITER = ", ";

    private AasUtils() {
    }

	/**
	 * Formats a Reference as string
	 *
	 * @param reference
	 *            Reference to serialize
	 * @return string representation of the reference for serialization, null if
	 *         reference is null
	 */
	private static String asString(Reference reference) {
		if (reference == null) {
			return null;
		}
		return String.format("[%s]%s", reference.getType(),
				reference.getKeys().stream().map(x -> String.format("(%s)%s", EnumSerializer.serializeEnumName(x.getType().name()), x.getValue())).collect(Collectors.joining(REFERENCE_ELEMENT_DELIMITER)));
	}

    /**
     * Creates a reference for an Identifiable instance using provided implementation types for reference and key
     *
     * @param identifiable the identifiable to create the reference for
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     * @return a reference representing the identifiable
     */
    public static Reference toReference(Identifiable identifiable, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        try {
            Reference reference = referenceType.getConstructor().newInstance();
            reference.setType(ReferenceTypes.MODEL_REFERENCE);
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
     * @return the most specific KeyElements type representing the Referable, i.e. abstract types like SUBMODEL_ELEMENT
     * or DATA_ELEMENT are never returned; null if there is no corresponding KeyElements type
     */
    public static KeyTypes referableToKeyType(Referable referable) {
        Class<?> aasInterface = ReflectionHelper.getAasInterface(referable.getClass());
        if (aasInterface != null) {
            return KeyTypes.valueOf(EnumDeserializer.deserializeEnumName(aasInterface.getSimpleName()));
        }
        return null;
    }

    /**
     * Gets a Java interface representing the type provided by key.
     *
     * @param key The KeyElements type
     * @return a Java interface representing the provided KeyElements type or null if no matching Class/interface could
     * be found. It also returns abstract types like SUBMODEL_ELEMENT or DATA_ELEMENT
     */
	private static Class<?> keyTypeToClass(KeyTypes key) {
        return Stream.concat(ReflectionHelper.INTERFACES.stream(), ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream())
				.filter(x -> x.getSimpleName().equals(EnumSerializer.serializeEnumName(key.name())))
                .findAny()
                .orElse(null);
    }

    /**
     * Creates a reference for an element given a potential parent using provided implementation types for reference and
     * key
     *
     * @param parent Reference to the parent. Can only be null when element is instance of Identifiable, otherwise
     * result will always be null
     * @param element the element to create a reference for
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     *
     * @return A reference representing the element or null if either element is null or parent is null and element not
     * an instance of Identifiable. In case element is an instance of Identifiable, the returned reference will only
     * contain one key pointing directly to the element.
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
     * @param parent Reference to the parent. Can only be null when element is instance of Identifiable, otherwise
     * result will always be null
     * @param element the element to create a reference for
     * @return A reference representing the element or null if either element is null or parent is null and element not
     * an instance of Identifiable. In case element is an instance of Identifiable, the returned reference will only
     * contain one key pointing directly to the element.
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
     * @return returns true if both references are refering to the same element, otherwise false
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
     * Creates a deep-copy clone of a reference using provided implementation types for reference and key
     *
     * @param reference the reference to clone
     * @param referenceType implementation type of Reference interface
     * @param keyType implementation type of Key interface
     *
     * @return the cloned reference
     */
	private static Reference clone(Reference reference, Class<? extends Reference> referenceType, Class<? extends Key> keyType) {
        if (reference == null || reference.getKeys() == null || reference.getKeys().isEmpty()) {
            return null;
        }
        try {
            Reference result = referenceType.getConstructor().newInstance();
            List<Key> newKeys = new ArrayList<>();
            result.setType(reference.getType());
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
     * Resolves a Reference within an AssetAdministrationShellEnvironment and returns the targeted object if available,
     * null otherwise
     *
     *
     * @param reference The reference to resolve
     * @param env The AssetAdministrationShellEnvironment to resolve the reference against
     * @return returns an instance of T if the reference could successfully be resolved, otherwise null
     * @throws IllegalArgumentException if something goes wrong while resolving
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
	@SuppressWarnings("unchecked")
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
					Collection<?> collection;
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
							collection = (Collection<?>) matchingProperties.get(0).getReadMethod().invoke(current);
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                            throw new IllegalArgumentException("error resolving reference", ex);
                        }
                    }
					Optional<?> next = collection.stream()
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
	private static List<PropertyDescriptor> getAasProperties(Class<?> type) {
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