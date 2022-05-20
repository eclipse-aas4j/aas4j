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
package io.adminshell.aas.v3.dataformat.aml.deserialization;

import io.adminshell.aas.v3.dataformat.core.ReflectionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Supports in creating instances of AAS interfaces
 */
public class AasTypeFactory {

    private Map<Class<?>, Class<?>> typeMapping;

    public AasTypeFactory() {
        typeMapping = ReflectionHelper.DEFAULT_IMPLEMENTATIONS.stream().collect(Collectors.toMap(x -> x.getInterfaceType(), x -> x.getImplementationType()));
    }

    /**
     * Defines which implementation class to use when creating instances of
     * aasInterface. Subsequent class with the same aasInterface parameter will
     * override the effects of all previous calls.
     *
     * @param <T> the type of the interface to replace
     * @param aasInterface the class of the interface to replace
     * @param implementation the class implementing the interface that should be
     * used for instantiation
     */
    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
        typeMapping.put(aasInterface, implementation);
    }

    /**
     * Creates a new instance for a given aasInterface. If the
     *
     * @param <T> type to create
     * @param aasInterfaceType class to find instantiate
     * @return an instance of aasInterface
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException if aasInterface is null or no suitable
     * concrete type to instantiate could be found
     * @throws InvocationTargetException
     */
    public <T> T newInstance(Class<T> aasInterfaceType) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<?> constructor = getImplementationType(aasInterfaceType).getConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();
    }

    /**
     * Gets the concrete implementation type to use for a given type. If there
     * is no explicit type mapping and the provided type is concrete, the type
     * itself is returned.
     *
     * @param <T> type information
     * @param aasInterfaceType the type to find a concrete implementation type
     * for
     * @throws IllegalArgumentException if there is no type mapping for the
     * provided type and the type is not concrete
     * @return a concrete implementation type for the given type
     */
    public <T> Class<? extends T> getImplementationType(Class<T> aasInterfaceType) {
        if (aasInterfaceType == null) {
            throw new IllegalArgumentException("aasInterface must be non-null");
        }
        if (typeMapping.containsKey(aasInterfaceType)) {
            return (Class<? extends T>) typeMapping.get(aasInterfaceType);
        }
        if (aasInterfaceType.isInterface()) {
            throw new IllegalArgumentException("could not resolve type for interface " + aasInterfaceType.getName());
        }
        return aasInterfaceType;
    }
}
