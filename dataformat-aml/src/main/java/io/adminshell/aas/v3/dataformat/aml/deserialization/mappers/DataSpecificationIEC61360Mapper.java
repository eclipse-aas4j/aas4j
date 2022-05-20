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
package io.adminshell.aas.v3.dataformat.aml.deserialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.deserialization.AmlParser;
import io.adminshell.aas.v3.dataformat.aml.deserialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.AttributeType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXObject;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.core.DataSpecificationManager;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.DataTypeIEC61360;
import io.adminshell.aas.v3.model.impl.DefaultDataSpecificationIEC61360;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 *
 */
public class DataSpecificationIEC61360Mapper extends DefaultMapper<DataSpecificationIEC61360> {

    @Override
    protected Class<?> typeFromInternalElement(InternalElementType internalElement) throws MappingException {
        if (internalElement.getRoleRequirements() == null || internalElement.getRoleRequirements().getRefBaseRoleClassPath() == null) {
            throw new MappingException(String.format("missing required RoleRequirements/RefBaseRoleClassPath in InternalElement with ID %s", internalElement.getID()));
        }
        return DefaultDataSpecificationIEC61360.class;
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        CAEXObject current = parser.getCurrent();

        List<AttributeType> attributeTypes = findAttributes(parser.getCurrent(), x -> true);
        List<PropertyDescriptor> propertyDescriptors = AasUtils.getAasProperties(DefaultDataSpecificationIEC61360.class);

        parser.setRefSemanticPrefix(DataSpecificationManager.DATA_SPECIFICATION_IEC61360_PREFIX);

        for (AttributeType attributeType : attributeTypes) {
            PropertyDescriptor propertyDescriptor = propertyDescriptors.stream()
                    .filter(x -> x.getName().contains(attributeType.getName()))
                    .findFirst()
                    .orElse(null);
            if (propertyDescriptor != null) {
                try {
                    Object createdObject;
                    Class<?> type = propertyDescriptor.getReadMethod().getReturnType();
                    if (DataTypeIEC61360.class.isAssignableFrom(type) ||
                            List.class.isAssignableFrom(type)) {
                        createdObject = context.with(propertyDescriptor).map(propertyDescriptor.getReadMethod().getGenericReturnType(), parser);
                    } else {
                        parser.setCurrent(attributeType);
                        createdObject = map(parser, context);
                    }
                    if (createdObject != null) propertyDescriptor.getWriteMethod().invoke(parent, createdObject);

                } catch (IllegalAccessException | InvocationTargetException ex) {
                    throw new MappingException(String.format("error setting property value for property %s", propertyDescriptor.getName()), ex);
                }
            }

        }
        parser.setCurrent(current);
        parser.setRefSemanticPrefixToDefault();

    }

    @Override
    protected Class<?> typeFromAttribute(AttributeType attribute, MappingContext context) {
        List<PropertyDescriptor> propertyDescriptors = AasUtils.getAasProperties(DefaultDataSpecificationIEC61360.class);
        PropertyDescriptor propertyDescriptor = propertyDescriptors.stream().filter(x -> x.getName().contains(attribute.getName())).findFirst().orElse(null);

        if (propertyDescriptor != null) {
            return propertyDescriptor.getReadMethod().getReturnType();
        }
        return null;
    }

    @Override
    protected Object fromAttribute(AmlParser parser, AttributeType attribute, MappingContext context) throws MappingException {
        if (parser == null || attribute == null || context == null) {
            return null;
        }
        Class<?> type = typeFromAttribute(attribute, context);
        if (isAasType(type)) {
            return context.getMappingProvider().getMapper(type).map(parser, context);
        }
        return attribute.getValue();
    }


}
