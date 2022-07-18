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
package org.eclipse.aas4j.v3.dataformat.aml.deserialization;

import org.eclipse.aas4j.v3.dataformat.aml.common.naming.PropertyNamingStrategy;
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.*;
import org.eclipse.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.aas4j.v3.dataformat.aml.model.caex.*;
import org.eclipse.aas4j.v3.model.DataTypeDefXsd;
import org.apache.xerces.dom.ElementNSImpl;

/**
 * Default mapper for mapping AML to AAS. This mapper will be used when there no
 * more specific one is available.
 */
public class DefaultMapper<T> implements Mapper<T> {

    private final Set<String> ignoredProperties = new HashSet<>();

    public DefaultMapper() {
    }

    public DefaultMapper(String... ignoredProperties) {
        this.ignoredProperties.addAll(Arrays.asList(ignoredProperties));
    }

    @Override
    public T map(AmlParser parser, MappingContext context) throws MappingException {
        if (parser == null || parser.getCurrent() == null || context == null) {
            return null;
        }
        if (context.getProperty() == null) {
            if (AttributeType.class.isAssignableFrom(parser.getCurrent().getClass())) {
                return (T) fromAttribute(parser, (AttributeType) parser.getCurrent(), context);
            } else if (InternalElementType.class.isAssignableFrom(parser.getCurrent().getClass())) {
                return (T) fromInternalElement(parser, (InternalElementType) parser.getCurrent(), context);
            } else if (SystemUnitFamilyType.class.isAssignableFrom(parser.getCurrent().getClass())) {
                return (T) fromSystemUnitFamily(parser, (SystemUnitFamilyType) parser.getCurrent(), context);
            }
        } else {
            if (Collection.class.isAssignableFrom(context.getProperty().getReadMethod().getReturnType())) {
                return (T) mapCollectionValueProperty(parser, context);
            } else {
                return (T) mapSingleValueProperty(parser, context);
            }
        }
        return null;
    }

    /**
     * Reads expected object from given attribute.
     *
     * @param parser    the AML parser
     * @param attribute the attribute to read from
     * @param context   the mapping context
     * @return the read object or null if not present
     * @throws MappingException if reading object fails
     */
    protected Object fromAttribute(AmlParser parser, AttributeType attribute, MappingContext context) throws MappingException {
        if (parser == null || attribute == null || context == null) {
            return null;
        }
        Class<?> type = typeFromAttribute(attribute, context);
        if (isAasType(type)) {
            Object result = newInstance(type, context);
            mapProperties(result, parser, context);
            return result;
        }
        return attribute.getValue();
    }

    /**
     * Reads the actual value of an attribute. This is required as used XML
     * library (JAXB) deserializes simple values within strange type. This
     * method removes this wrapped type if present and should always return the
     * actual (unwrapped) value of the attribute.
     *
     * @param attribute the attribute to read the value from
     * @return the value of the attribute or null if attribute or value is null
     */
    protected Object getValue(AttributeType attribute) {
        if (attribute == null || attribute.getValue() == null) {
            return null;
        }
        if (ElementNSImpl.class.isAssignableFrom(attribute.getValue().getClass())) {
            ElementNSImpl element = (ElementNSImpl) attribute.getValue();
            if (element.getFirstChild() != null) {
                return element.getFirstChild().getNodeValue();
            }
            throw new IllegalArgumentException(String.format("could not read value for attribute %s", attribute.getName()));
        }
        return attribute.getValue();
    }

    /**
     * Reads expected object from given InternalElement.
     *
     * @param parser          the AML parser
     * @param internalElement the InternalElement to read from
     * @param context         the mapping context
     * @return the read object or null if not present
     * @throws MappingException if reading object fails
     */
    protected Object fromInternalElement(AmlParser parser, InternalElementType internalElement, MappingContext context) throws MappingException {
        if (parser == null || internalElement == null || context == null) {
            return null;
        }
        Class<?> type = typeFromInternalElement(internalElement);
        Object result = newInstance(type, context);
        mapProperties(result, parser, context);
        return result;
    }

    /**
     * Reads expected object from given SystemUnitFamily.
     *
     * @param parser               the AML parser
     * @param systemUnitFamilyType the SystemUnitFamily to read from
     * @param context              the mapping context
     * @return the read object or null if not present
     * @throws MappingException if reading object fails
     */
    protected Object fromSystemUnitFamily(AmlParser parser, SystemUnitFamilyType systemUnitFamilyType, MappingContext context) throws MappingException {
        if (parser == null || systemUnitFamilyType == null || context == null) {
            return null;
        }
        Class<?> type = typeFromSystemUnit(systemUnitFamilyType);
        Object result = newInstance(type, context);
        mapProperties(result, parser, context);
        return result;
    }

    /**
     * Recursively calls context.map(...) on all properties except those
     * explicitely ignored and sets them on the parent.
     *
     * @param parent  the parent object to read all properties for
     * @param parser  the AMLParser
     * @param context the MappingContext
     * @throws MappingException if mapping fails
     */
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }
        for (PropertyDescriptor property : AasUtils.getAasProperties(parent.getClass())) {
            if (!skipProperty(property)) {
                Object propertyValue = context
                        .with(parent)
                        .with(property)
                        .withoutType()
                        .map(property.getReadMethod().getGenericReturnType(), parser);
                if (propertyValue != null) {
                    try {
                        property.getWriteMethod().invoke(parent, propertyValue);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        throw new MappingException(String.format("error setting property value for property %s", property.getName()), ex);
                    }
                }
            }
        }
    }

    /**
     * Helper method to create a new instance for a given type.
     *
     * @param <T>     type information
     * @param type    type to instantiate
     * @param context the MappingContext
     * @return an instance of the provided type
     * @throws MappingException if instantiation fails
     */
    protected <T> T newInstance(Class<T> type, MappingContext context) throws MappingException {
        try {
            return context.getTypeFactory().newInstance(type);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new MappingException(String.format("error instantiating type %s", type.getName()));
        }
    }

    protected Class<?> getAasType(String name) {
        return Stream.concat(ReflectionHelper.INTERFACES.stream(),
                        ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream())
                .filter(x -> x.getSimpleName().equals(name))
                .findAny()
                .orElse(null);
    }

    protected boolean isAasType(Class<?> type) {
        boolean is_interface;
        boolean is_enum;
        is_interface = Stream.concat(ReflectionHelper.INTERFACES.stream(),
                        ReflectionHelper.INTERFACES_WITHOUT_DEFAULT_IMPLEMENTATION.stream())
                .anyMatch(x -> x.equals(type));
        is_enum = ReflectionHelper.ENUMS.stream().anyMatch(x -> x.equals(type));
        return is_interface || is_enum;
    }

    /**
     * Extracts type information from a given attribute based on the refSemantic
     * property
     *
     * @param attribute The attribute to extract the type from
     * @return the type of the attribute
     * @throws MappingException if type information is missing or invalid or
     *                          type could not be resolved
     */
    protected Class<?> typeFromAttribute(AttributeType attribute, MappingContext context) throws MappingException {
        if (attribute.getRefSemantic() == null || attribute.getRefSemantic().isEmpty()) {
            throw new MappingException(String.format("missing required refSemantic in attribute %s", attribute.getName()));
        }
        List<AttributeType.RefSemantic> aasRefSemantics = attribute.getRefSemantic().stream()
                .filter(x -> x.getCorrespondingAttributePath().startsWith("AAS:"))
                .collect(Collectors.toList());
        if (aasRefSemantics.isEmpty()) {
            throw new MappingException(String.format("missing required refSemantic in attribute %s", attribute.getName()));
        }
        if (aasRefSemantics.size() > 1) {
            throw new MappingException(String.format("too many refSemantic in attribute %s", attribute.getName()));
        }
        String attributePath = aasRefSemantics.get(0).getCorrespondingAttributePath();
        String[] attributePathElements = attributePath.substring(attributePath.indexOf(":") + 1).split("/");
        if (attributePathElements.length != 2) {
            throw new MappingException(String.format("refSemantic in attribute %s does not match format AAS:[type name]/[property name]", attribute.getName()));
        }
        Class<?> type = getAasType(attributePathElements[0]);
        if (type == null) {
            throw new MappingException(String.format("unkown type definition %s in refSemantic for attribute %s",
                    attributePathElements[0],
                    attribute.getName()));
        }
        // Need to respect property renaming strategies?
        // alternative way to discover property but more expensive as all properties are considered and not only those defined on class
        // Optional<PropertyDescriptor> property = AasUtils.getAasProperties(type.get()).stream().filter(x -> x.getName().equals(type)).findFirst();        
        try {

            String oldPropertyName = ((PropertyNamingStrategy) context.getPropertyNamingStrategy()).getOldName(type, attribute, attributePathElements[1]);
            Optional<PropertyDescriptor> property = Stream.of(Introspector.getBeanInfo(type).getPropertyDescriptors())
                    .filter(x -> x.getName().equalsIgnoreCase(oldPropertyName == null ? attributePathElements[1] : oldPropertyName)).findFirst();
            if (property.isPresent()) {
                return property.get().getReadMethod().getReturnType();
            } else {
                throw new MappingException(String.format("unkown property definition '%s' in refSemantic for attribute %s",
                        attributePathElements[1],
                        attribute.getName()));
            }
        } catch (IntrospectionException ex) {
            throw new MappingException(String.format("error resolving refSemantic for attribute %s", attribute.getName()), ex);
        }
    }

    /**
     * Extracts type information from a given InternalElement based on the
     * roleRequirements property
     *
     * @param internalElement The InternalElement to extract the type from
     * @return the type of the attribute
     * @throws MappingException if type information is missing or invalid or
     *                          type could not be resolved
     */
    protected Class<?> typeFromInternalElement(InternalElementType internalElement) throws MappingException {
        if (internalElement.getRoleRequirements() == null || internalElement.getRoleRequirements().getRefBaseRoleClassPath() == null) {
            throw new MappingException(String.format("missing required RoleRequirements/RefBaseRoleClassPath in InternalElement with ID %s", internalElement.getID()));
        }
        String roleClassPath = internalElement.getRoleRequirements().getRefBaseRoleClassPath();
        String className = roleClassPath.substring(roleClassPath.indexOf("/") + 1);

        Optional<Class> type = ReflectionHelper.INTERFACES.stream().filter(x -> x.getSimpleName().equals(className)).findAny();
        if (type.isEmpty()) {
            throw new MappingException(String.format("unkown type definition %s in role class path for InternalElement with ID %s",
                    className,
                    internalElement.getID()));
        }
        return type.get();
    }

    /**
     * Extracts type information from a given SystemUnitFamily based on the
     * supportedRoleClass property
     *
     * @param systemUnitFamilyType The SystemUnitFamily to extract the type from
     * @return the type of the attribute
     * @throws MappingException if type information is missing or invalid or
     *                          type could not be resolved
     */
    protected Class<?> typeFromSystemUnit(SystemUnitFamilyType systemUnitFamilyType) throws MappingException {
        if (systemUnitFamilyType.getSupportedRoleClass() == null || systemUnitFamilyType.getSupportedRoleClass().get(0) == null) {
            throw new MappingException(String.format("missing required SupportedRoleClass with ID %s", systemUnitFamilyType.getID()));
        }
        String roleClassPath = systemUnitFamilyType.getSupportedRoleClass().get(0).getRefRoleClassPath();
        String className = roleClassPath.substring(roleClassPath.indexOf("/") + 1);

        Optional<Class> type = ReflectionHelper.INTERFACES.stream().filter(x -> x.getSimpleName().equals(className)).findAny();
        if (type.isEmpty()) {
            throw new MappingException(String.format("unkown type definition %s in role class path for systemUnitFamilyType with ID %s",
                    className,
                    systemUnitFamilyType.getID()));
        }
        return type.get();
    }

    protected Collection mapCollectionValueProperty(AmlParser parser, MappingContext context) throws MappingException {
        if (parser == null || context == null || context.getProperty() == null) {
            return null;
        }

        Class<?> contentType
                = context.getType() != null
                ? AasUtils.getCollectionContentType(context.getType())
                : AasUtils.getCollectionContentType(context.getProperty().getReadMethod().getGenericReturnType());
        List<InternalElementType> internalElements = findInternalElements(parser.getCurrent(), contentType, true, context);
        if (!internalElements.isEmpty()) {
            Collection result = new ArrayList<>();
            for (InternalElementType internalElement : internalElements) {
                result.add(propertyFromInternalElement(parser, internalElement, context));
            }
            return result;
        } else {
            AttributeType attribute = findAttribute(parser.getCurrent(), context.getProperty(), context, parser.getRefSemanticPrefix());
            if (attribute == null) return null;
            List<AttributeType> attributeTypes = attribute.getAttribute();
            Collection result = new ArrayList<>();
            CAEXObject current = parser.getCurrent();
            if (!attributeTypes.isEmpty()) {
                for (AttributeType attributeType : attributeTypes) {
                    parser.setCurrent(attributeType);
                    Object object = context.withoutProperty().map(contentType, parser);
                    result.add(object);
                }
            } else {
                parser.setCurrent(attribute);
                Object object = context.withoutProperty().map(contentType, parser);
                result.add(object);
            }
            parser.setCurrent(current);
            return result.isEmpty() ? null : result;
        }

    }

    protected Object mapSingleValueProperty(AmlParser parser, MappingContext context) throws MappingException {
        Object result = null;
        // deserialize given property within parent
        AttributeType attribute = findAttribute(parser.getCurrent(), context.getProperty(), context);
        if (attribute != null) {
            return propertyFromAttribute(parser, attribute, context);
        }
        // not found as attribute, maybe we find it as internalElement
        List<InternalElementType> internalElements = findInternalElements(parser.getCurrent(), context.getProperty().getReadMethod().getReturnType(), true, context);
        if (internalElements.size() == 1) {
            result = propertyFromInternalElement(parser, internalElements.get(0), context);
        } else if (internalElements.size() > 1) {
            throw new MappingException(String.format("found %d matching internal elements for property %s in element with name %s, expected zero or one",
                    internalElements.size(), context.getProperty().getName(), parser.getCurrent().getName()));
        }
        return result;
    }

    protected Object propertyFromInternalElement(AmlParser parser, InternalElementType internalElement, MappingContext context) throws MappingException {
        CAEXObject current = parser.getCurrent();
        parser.setCurrent(internalElement);
        Object result = context.getMappingProvider()
                .getMapper(typeFromInternalElement(internalElement))
                .map(parser, context.withoutProperty());
        parser.setCurrent(current);
        return result;
    }

    protected Object propertyFromAttribute(AmlParser parser, AttributeType attribute, MappingContext context) throws MappingException {
        Object result = null;
        CAEXObject current = parser.getCurrent();
        parser.setCurrent(attribute);
        result = context.getMappingProvider()
                .getMapper(context.getProperty().getReadMethod().getReturnType())
                .map(parser, context.withoutProperty());
        parser.setCurrent(current);
        return result;
    }

    protected DataTypeDefXsd getDataTypeFromAttribute(AttributeType attributeType) {
        if (attributeType == null || attributeType.getAttributeDataType() == null) {
            return null;
        }
        String attributeDataType = attributeType.getAttributeDataType();
        return DataTypeDefXsd.valueOf(attributeDataType.substring(attributeDataType.lastIndexOf(":") + 1));
    }

    protected void setValueDataTypeFromAttributeDataType(AmlParser parser, Object parent, String attributeRefWithAttributeDataType, Class aasClazz) throws MappingException {
        if (parser == null || parent == null) return;

        AttributeType attributeType = findAttributesByCorrespondingAttributePath(parser.getCurrent(),
                attributeRefWithAttributeDataType).stream().findFirst().orElse(null);
        if (attributeType != null) {
            try {
                DataTypeDefXsd dataType = getDataTypeFromAttribute(attributeType);
                List<Method> methods = List.of(aasClazz.getMethods());
                Method method = methods.stream().filter(x -> x.getName().contains("setValueType")).findFirst().orElse(null);
                if (method == null) return;
                method.invoke(parent, dataType);
            } catch (InvocationTargetException | IllegalAccessException ex) {
                throw new MappingException(String.format("error setting value type for property with ID=%s and Name=%s", parser.getCurrent().getID(), parser.getCurrent().getName()), ex);
            }
        }
    }

    protected boolean skipProperty(PropertyDescriptor property) {
        return ignoredProperties.contains(property.getName());
    }

    protected String findInternalLinkTarget(InternalElementType internalElement, PropertyDescriptor property) throws MappingException {
        Optional<SystemUnitClassType.InternalLink> internalLink = internalElement.getInternalLink().stream()
                .filter(x -> x.getName().equals(property.getName()))
                .findFirst();
        if (internalLink.isPresent()) {
            return internalLink.get().getRefPartnerSideB().substring(0, internalLink.get().getRefPartnerSideB().indexOf(":"));
        }
        return null;
    }

    protected AttributeType findAttribute(CAEXObject parent, PropertyDescriptor property, MappingContext context) throws MappingException {
        return findAttribute(parent, property, context, AmlParser.DEFAULT_REFSEMANTIC_PREFIX);
    }

    protected AttributeType findAttribute(CAEXObject parent, PropertyDescriptor property, MappingContext context, String refSemanticPrefix) throws MappingException {
        List<AttributeType> attributes = findAttributes(parent, property, context, refSemanticPrefix);
        if (attributes.isEmpty()) {
            return null;
        }
        if (attributes.size() == 1) {
            return attributes.get(0);
        }
        throw new MappingException(String.format("found multiple Attribute for property %s in element with name: %s", property.getName(), parent.getName()));
    }


    // TODO not working because of missing property renaming strategy
    protected List<AttributeType> findAttributes(CAEXObject parent, PropertyDescriptor property, MappingContext context) {
        return findAttributes(parent, property, context, AmlParser.DEFAULT_REFSEMANTIC_PREFIX);
    }

    protected List<AttributeType> findAttributes(CAEXObject parent, PropertyDescriptor property, MappingContext context, String refSemanticPrefix) {
        if (property == null) {
            return List.of();
        }
        String refSemantic = refSemanticPrefix + ":" + property.getReadMethod().getDeclaringClass().getSimpleName() + "/"
                + context.getPropertyNamingStrategy().getNameForRefSemantic(property.getReadMethod().getDeclaringClass(), null, property.getName());
        return findAttributesByCorrespondingAttributePath(parent, refSemantic);
    }

    protected List<AttributeType> findAttributesByCorrespondingAttributePath(CAEXObject parent, String correspondingAttributePath) {
        return findAttributes(parent,
                x -> x.getRefSemantic().stream().anyMatch(y -> y.getCorrespondingAttributePath().equalsIgnoreCase(correspondingAttributePath)));
    }

    protected List<AttributeType> findAttributes(CAEXObject parent, Predicate<AttributeType> filter) {
        if (parent == null || filter == null) {
            return List.of();
        }
        if (AttributeType.class.isAssignableFrom(parent.getClass())) {
            return ((AttributeType) parent).getAttribute().stream().filter(filter).collect(Collectors.toList());
        } else if (InternalElementType.class.isAssignableFrom(parent.getClass())) {
            return ((InternalElementType) parent).getAttribute().stream().filter(filter).collect(Collectors.toList());
        } else if (SystemUnitFamilyType.class.isAssignableFrom(parent.getClass())) {
            return ((SystemUnitFamilyType) parent).getAttribute().stream().filter(filter).collect(Collectors.toList());
        }
        return List.of();
    }

    protected List<InternalElementType> findInternalElements(CAEXObject parent, Class desiredType, boolean acceptSubtypes, MappingContext context) {
        if (parent == null || !(SystemUnitClassType.class.isAssignableFrom(parent.getClass()))) {
            return List.of();
        }
        return findInternalElements((SystemUnitClassType) parent, desiredType, acceptSubtypes, context);
    }


    protected List<InternalElementType> findInternalElements(SystemUnitClassType parent, Class desiredType, boolean acceptSubtypes, MappingContext context) {
        if (desiredType == null || context == null) {
            return List.of();
        }
        return getAllMatchingInternalElements(null, parent, desiredType, acceptSubtypes, context);
    }

    protected List<InternalElementType> findInternalElements(CAEXObject parent, Predicate<InternalElementType> filter) {
        if (parent == null || !InternalElementType.class.isAssignableFrom(parent.getClass())) {
            return List.of();
        }
        return findInternalElements((InternalElementType) parent, filter);
    }

    protected List<InternalElementType> findInternalElements(InternalElementType parent, Predicate<InternalElementType> filter) {
        if (parent == null || filter == null) {
            return List.of();
        }
        return getAllInternalElements(null, parent).stream().filter(filter).collect(Collectors.toList());
    }


    //get recursive all internal elements of parent
    private List<InternalElementType> getAllInternalElements(List<InternalElementType> resultList, SystemUnitClassType parent) {
        if (resultList == null) resultList = new ArrayList<>();
        resultList.addAll(parent.getInternalElement());
        for (InternalElementType internalElementType : parent.getInternalElement()) {
            getAllInternalElements(resultList, internalElementType);
        }
        return resultList;
    }

    private List<InternalElementType> getAllMatchingInternalElements(List<InternalElementType> resultList,
                                                                     SystemUnitClassType parent, Class desiredType,
                                                                     boolean acceptSubtypes, MappingContext context) {

        if(resultList == null)resultList= new ArrayList<>();

        List<InternalElementType> internalElementTypes = parent.getInternalElement();
        for(InternalElementType internalElement : internalElementTypes){
            String role = internalElement.getRoleRequirements() != null ? internalElement.getRoleRequirements().getRefBaseRoleClassPath() : "";
            if (role.startsWith(context.getDocumentInfo().getAssetAdministrationShellRoleClassLib())) {
                String actualClassName = role.substring(context.getDocumentInfo().getAssetAdministrationShellRoleClassLib().length() + 1);
                Optional<Class> actualType = ReflectionHelper.INTERFACES.stream().filter(y -> y.getSimpleName().equals(actualClassName)).findFirst();
                if (actualType.isPresent()) {
                    if (acceptSubtypes && desiredType.isAssignableFrom(actualType.get())) {
                        resultList.add(internalElement);
                    } else if(desiredType.equals(actualType.get())){
                        resultList.add(internalElement);
                    }
                }
            } else {
                getAllMatchingInternalElements(resultList, internalElement, desiredType, acceptSubtypes, context);
            }
        }

        return resultList;
    }


    protected List<InterfaceClassType> findExternalInterface(CAEXObject parent, Predicate<InterfaceClassType> filter) {
        if (parent == null || filter == null) {
            return List.of();
        }
        if (InternalElementType.class.isAssignableFrom(parent.getClass())) {
            return ((InternalElementType) parent).getExternalInterface().stream().filter(filter).collect(Collectors.toList());
        }
        return List.of();
    }
}
