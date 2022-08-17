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
package org.eclipse.aas4j.v3.dataformat.core;

import com.google.common.reflect.TypeToken;
import org.eclipse.aas4j.v3.dataformat.core.util.MostSpecificTypeTokenComparator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ClassUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.aas4j.v3.model.Referable;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;

/**
 * Helper class to collect relevant data needed for
 * ReflectionAnnotationIntrospector via reflection.
 */
public class ReflectionHelper {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionHelper.class);
    private static final String ROOT_PACKAGE_NAME = "org.eclipse.aas4j.v3";
    /**
     * Name of package where the generated model classes are defined
     */
    public static final String MODEL_PACKAGE_NAME = ROOT_PACKAGE_NAME + ".model";
    /**
     * Name of package where the generated default implementation files are
     * defined
     */
    public static final String DEFAULT_IMPLEMENTATION_PACKAGE_NAME = MODEL_PACKAGE_NAME + ".impl";
    /**
     * Name of package where the json mixins are defined. These mixins are
     * automatically added to JsonSerializer and JsonDeserializer.
     */
    public static final String JSON_MIXINS_PACKAGE_NAME = ROOT_PACKAGE_NAME + ".dataformat.json.mixins";
    /**
     * Name of package where the xml mixins are defined. These mixins are
     * automatically added to XmlSerializer and XmlDeserializer.
     */
    public static final String XML_MIXINS_PACKAGE_NAME = ROOT_PACKAGE_NAME + ".dataformat.xml.mixins";
    /**
     * Suffix that identifies a class as a mixin.
     */
    public static final String MIXIN_SUFFIX = "Mixin";
    /**
     * Prefix that defines a class as a default implementation
     */
    public static final String DEFAULT_IMPLEMENTATION_PREFIX = "Default";
    /**
     * Distinct root superclasses of which classify a class to include type
     * information via the modelType property
     */
    public static final Set<Class<?>> MODEL_TYPE_SUPERCLASSES = Set.of(Referable.class);
    /**
     * Expanded list of all classes that shall be annotated with the modelType
     * property.
     */
    public static final Set<Class<?>> TYPES_WITH_MODEL_TYPE;
    /**
     * Map of all interfaces and their subinterfaces defined in the
     * MODEL_PACKAGE_NAME package.
     */
    public static final Map<Class<?>, Set<Class<?>>> SUBTYPES;
    /**
     * List of all interfaces classes defined by the AAS.
     */
    public static final Set<Class> INTERFACES;
    /**
     * Expanded list of all mixin classes defined in the
     * JSON_MIXINS_PACKAGE_NAME package together with the corresponding class
     * they should be applied to.
     */
    public static final Map<Class<?>, Class<?>> JSON_MIXINS;
    /**
     * Expanded list of all mixin classes defined in the XML_MIXINS_PACKAGE_NAME
     * package together with the corresponding class they should be applied to.
     */
    public static final Map<Class<?>, Class<?>> XML_MIXINS;
    /**
     * Expanded list of all default implementations in the
     * DEFAULT_IMPLEMENTATION_PACKAGE_NAME package together with the interface
     * from the MODEL_PACKAGE_NAME package they are implementing.
     */
    public static final List<ImplementationInfo> DEFAULT_IMPLEMENTATIONS;
    /**
     * List of interfaces from the MODEL_PACKAGE_NAME package that are known to
     * not have any default implementation and therefore are excluded
     * explicitely.
     */
    public static final Set<Class<?>> INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION;
    /**
     * List of enums from the MODEL_PACKAGE_NAME package.
     */
    public static final List<Class<Enum>> ENUMS;

    public static class ImplementationInfo<T> {

        private final Class<T> interfaceType;
        private final Class<? extends T> implementationType;

        protected ImplementationInfo(Class<T> interfaceType, Class<? extends T> implementationType) {
            this.interfaceType = interfaceType;
            this.implementationType = implementationType;
        }

        public Class<T> getInterfaceType() {
            return interfaceType;
        }

        public Class<? extends T> getImplementationType() {
            return implementationType;
        }
    }

    /**
     * Returns whether the given class is an interface and from within the
     * MODEL_PACKAGE_NAME package
     *
     * @param type the class to check
     * @return whether the given class is an interface and from within the
     * MODEL_PACKAGE_NAME package
     */
    public static boolean isModelInterface(Class<?> type) {
        return type.isInterface() && MODEL_PACKAGE_NAME.equals(type.getPackageName());
    }

    /**
     * Returns whether the given class is a default implementation or not
     *
     * @param type the class to check
     * @return whether the given class is a default implementation or not
     */
    public static boolean isDefaultImplementation(Class<?> type) {
        return DEFAULT_IMPLEMENTATIONS.stream().anyMatch(x -> Objects.equals(x.getImplementationType(), type));
    }

    /**
     * Returns whether the given interface has a default implementation or not
     *
     * @param interfaceType the interface to check
     * @return whether the given interface has a default implementation or not
     */
    public static boolean hasDefaultImplementation(Class<?> interfaceType) {
        return DEFAULT_IMPLEMENTATIONS.stream().anyMatch(x -> x.getInterfaceType().equals(interfaceType));
    }

    /**
     * Returns the default implementation for an aas interface or null if the
     * class is no aas interface or does not have default implementation
     *
     * @param interfaceType the interface to check
     * @return the default implementation type for given interfaceType or null
     * if the class is no aas interface or does not have default implementation
     */
    public static <T> Class<? extends T> getDefaultImplementation(Class<T> interfaceType) {
        if (isDefaultImplementation(interfaceType)) {
            return interfaceType;
        }
        if (hasDefaultImplementation(interfaceType)) {
            return DEFAULT_IMPLEMENTATIONS.stream()
                    .filter(x -> x.getInterfaceType().equals(interfaceType))
                    .findFirst().get()
                    .getImplementationType();
        }
        return null;
    }

    /**
     * Returns whether the given class is an interface from within the
     * MODEL_PACKAGE_NAME package as well as a default implementation or not
     *
     * @param type the class to check
     * @return whether the given class is an interface from within the
     * MODEL_PACKAGE_NAME package as well as a default implementation or not
     */
    public static boolean isModelInterfaceOrDefaultImplementation(Class<?> type) {
        return isModelInterface(type) || isDefaultImplementation(type);
    }

    public static Class<?> getAasInterface(Class<?> type) {
        Set<Class<?>> implementedAasInterfaces = getAasInterfaces(type);
        if (implementedAasInterfaces.isEmpty()) {
            return null;
        }
        if (implementedAasInterfaces.size() == 1) {
            return implementedAasInterfaces.iterator().next();
        }
        logger.warn("class '{}' implements more than one AAS interface, but only most specific one is returned", type.getName());
        return implementedAasInterfaces.stream().map(x -> TypeToken.of(x))
                .sorted(new MostSpecificTypeTokenComparator())
                .findFirst().get()
                .getRawType();
    }

    public static Set<Class<?>> getAasInterfaces(Class<?> type) {
        Set<Class<?>> result = new HashSet<>();
        if (type != null) {
            if (INTERFACES.contains(type)) {
                result.add(type);
            }
            result.addAll(ClassUtils.getAllInterfaces(type).stream().filter(x -> INTERFACES.contains(x)).collect(Collectors.toSet()));
        }
        return result;
    }

    /**
     * Returns the AAS type information used for de-/serialization for a given
     * class or null if type information should not be included
     *
     * @param clazz the class to find the type information for
     * @return the type information for the given class or null if there is no
     * type information or type information should not be included
     */
    public static String getModelType(Class<?> clazz) {
        Class<?> type = getMostSpecificTypeWithModelType(clazz);
        if (type != null) {
            return type.getSimpleName();
        }
        for (Class<?> interfaceClass : clazz.getInterfaces()) {
            String result = getModelType(interfaceClass);
            if (result != null) {
                return result;
            }
        }
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            return getModelType(superClass);
        }
        return null;
    }

    /**
     * Returns the most specific supertype that contains some AAS type
     * information or null if there is none
     *
     * @param clazz the class to find the type for
     * @return the most specific supertype of given class that contains some AAS
     * type information or null if there is none
     */
    public static Class<?> getMostSpecificTypeWithModelType(Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        return TYPES_WITH_MODEL_TYPE.stream()
                .filter(x -> clazz.isInterface() ? x.equals(clazz) : x.isAssignableFrom(clazz))
                .sorted((Class<?> o1, Class<?> o2) -> {
                    // -1: o1 more special than o2
                    // 0: o1 equals o2 or on same samelevel
                    // 1: o2 more special than o1
                    if (o1.isAssignableFrom(o2)) {
                        if (o2.isAssignableFrom(o1)) {
                            return 0;
                        }
                        return 1;
                    }
                    if (o2.isAssignableFrom(o1)) {
                        return -1;
                    }
                    return 0;
                })
                .findFirst()
                .orElse(null);
    }

    static {
        ScanResult modelScan = new ClassGraph()
                .enableClassInfo()
                .acceptPackagesNonRecursive(MODEL_PACKAGE_NAME)
                .scan();
        TYPES_WITH_MODEL_TYPE = scanModelTypes(modelScan);
        SUBTYPES = scanSubtypes(modelScan);
        JSON_MIXINS = scanMixins(modelScan, JSON_MIXINS_PACKAGE_NAME);
        XML_MIXINS = scanMixins(modelScan, XML_MIXINS_PACKAGE_NAME);
        DEFAULT_IMPLEMENTATIONS = scanDefaultImplementations(modelScan);
        INTERFACES = scanAasInterfaces();
        ENUMS = modelScan.getAllEnums().loadClasses(Enum.class);
        INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION = getInterfacesWithoutDefaultImplementation(modelScan);
    }

    private static Set<Class<?>> getInterfacesWithoutDefaultImplementation(ScanResult modelScan) {
        return modelScan.getAllInterfaces().loadClasses().stream()
                .filter(x -> !hasDefaultImplementation(x))
                .collect(Collectors.toSet());
    }

    public static Set<Class<?>> getSuperTypes(Class<?> clazz, boolean recursive) {
        Set<Class<?>> result = SUBTYPES.entrySet().stream()
                .filter(x -> x.getValue().contains(clazz))
                .map(x -> x.getKey())
                .collect(Collectors.toSet());
        if (recursive) {
            result.addAll(result.stream()
                    .flatMap(x -> getSuperTypes(x, true).stream())
                    .collect(Collectors.toSet()));
        }
        return result;
    }

    private static List<ImplementationInfo> scanDefaultImplementations(ScanResult modelScan) {
        ScanResult defaulImplementationScan = new ClassGraph()
                .enableClassInfo()
                .acceptPackagesNonRecursive(DEFAULT_IMPLEMENTATION_PACKAGE_NAME)
                .scan();
        List<ImplementationInfo> defaultImplementations = new ArrayList<>();
        defaulImplementationScan.getAllClasses()
                .filter(x -> x.getSimpleName().startsWith(DEFAULT_IMPLEMENTATION_PREFIX))
                .loadClasses()
                .stream()
                .forEach(x -> {
                    String interfaceName = x.getSimpleName().substring(DEFAULT_IMPLEMENTATION_PREFIX.length());// using conventions
                    ClassInfoList interfaceClassInfos = modelScan.getAllClasses().filter(y -> y.isInterface() && Objects.equals(y.getSimpleName(), interfaceName));
                    if (interfaceClassInfos.isEmpty()) {
                        logger.warn("could not find interface realized by default implementation class '{}'", x.getSimpleName());
                    } else {
                        Class<?> implementedClass = interfaceClassInfos.get(0).loadClass();
                        defaultImplementations.add(new ImplementationInfo(implementedClass, x));
                        logger.debug("using default implementation class '{}' for interface '{}'",
                                x.getSimpleName(),
                                interfaceClassInfos.get(0).getName());

                    }
                });
        return defaultImplementations;
    }

    private static Set<Class> scanAasInterfaces() {
        return DEFAULT_IMPLEMENTATIONS.stream().map(x -> x.interfaceType).collect(Collectors.toSet());
    }

    private static Map<Class<?>, Class<?>> scanMixins(ScanResult modelScan, String packageName) {
        ScanResult mixinScan = new ClassGraph()
                .enableClassInfo()
                .acceptPackagesNonRecursive(packageName)
                .scan();
        Map<Class<?>, Class<?>> mixins = new HashMap<>();
        mixinScan.getAllClasses()
                .filter(x -> x.getSimpleName().endsWith(MIXIN_SUFFIX))
                .loadClasses()
                .forEach(x -> {
                    String modelClassName = x.getSimpleName().substring(0, x.getSimpleName().length() - MIXIN_SUFFIX.length());
                    ClassInfoList modelClassInfos = modelScan.getAllClasses().filter(y -> Objects.equals(y.getSimpleName(), modelClassName));
                    if (modelClassInfos.isEmpty()) {
                        logger.warn("could not auto-resolve target class for mixin '{}'", x.getSimpleName());
                    } else {
                        mixins.put(modelClassInfos.get(0).loadClass(), x);
                        logger.debug("using mixin '{}' for class '{}'",
                                x.getSimpleName(),
                                modelClassInfos.get(0).getName());
                    }
                });
        return mixins;
    }

    private static Map<Class<?>, Set<Class<?>>> scanSubtypes(ScanResult modelScan) {
        return modelScan.getAllInterfaces().stream()
                .filter(ReflectionHelper::hasSubclass)
                .collect(Collectors.toMap(ClassInfo::loadClass, ReflectionHelper::getSubclasses));
    }

    private static Set<Class<?>> getSubclasses(ClassInfo clazzInfo) {
        return clazzInfo.getClassesImplementing()
                .directOnly()
                .filter(ClassInfo::isInterface)
                .loadClasses()
                .stream()
                .collect(Collectors.toSet());
    }

    private static boolean hasSubclass(ClassInfo clazzInfo) {
        return !getSubclasses(clazzInfo).isEmpty();
    }

    private static Set<Class<?>> scanModelTypes(ScanResult modelScan) {
        Set<Class<?>> typesWithModelTypes;
        typesWithModelTypes = MODEL_TYPE_SUPERCLASSES.stream()
                .flatMap(x -> modelScan.getClassesImplementing(x.getName()).loadClasses().stream())
                .collect(Collectors.toSet());
        typesWithModelTypes.addAll(MODEL_TYPE_SUPERCLASSES);
        return typesWithModelTypes;
    }

    private ReflectionHelper() {
    }
}
