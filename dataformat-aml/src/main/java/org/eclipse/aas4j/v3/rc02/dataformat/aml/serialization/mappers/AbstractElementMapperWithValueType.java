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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.mappers;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.InternalElementType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.AmlGenerator;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.DefaultMapper;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.MappingContext;
import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingException;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Abstract base class for AAS types that have the properties 'value' and
 * 'valueType' that ensures valueType is serialized as attribute of value
 *
 */
public abstract class AbstractElementMapperWithValueType<T> extends DefaultMapper<T> {

    protected static final String PROPERTY_VALUE_NAME = "value";
    protected static final String PROPERTY_VALUE_TYPE_NAME = "valueType";
    protected static final String PROPERTY_VALUE_TYPE_NAMESPACE_PREFIX = "xs:";
    private List<String> typedProperties = List.of(PROPERTY_VALUE_NAME);

    protected AbstractElementMapperWithValueType(String... typedProperties) {
        super(PROPERTY_VALUE_TYPE_NAME);
        this.typedProperties = Arrays.asList(typedProperties);
    }

    protected AbstractElementMapperWithValueType() {
        super(PROPERTY_VALUE_TYPE_NAME);
    }

    @Override
    protected InternalElementType.Builder toInternalElement(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType original = super.toInternalElement(value, generator, context).build();
        Optional<PropertyDescriptor> valueTypeProperty = AasUtils.getAasProperties(value.getClass()).stream()
                .filter(x -> PROPERTY_VALUE_TYPE_NAME.equals(x.getName()))
                .findFirst();
        List<AttributeType> untouchedAttributes = original.getAttribute().stream()
                .filter(x -> !typedProperties.contains(x.getName()))
                .collect(Collectors.toList());
        InternalElementType.Builder builder = InternalElementType
                .copyOf(original)
                .withAttribute(untouchedAttributes);
        for (String property : typedProperties) {
            AttributeType.Builder typedAttributeBuilder;
            Optional<AttributeType> attributeToType = original.getAttribute().stream()
                    .filter(x -> property.equals(x.getName()))
                    .findFirst();
            if (attributeToType.isPresent()) {
                typedAttributeBuilder = AttributeType.copyOf(attributeToType.get());
            } else {
                typedAttributeBuilder = super.toAttribute(null, generator, context.with(AasUtils.getProperty(value, property)));
            }
            Object type = null;
            if (valueTypeProperty.isPresent()) {
                try {
                    type = valueTypeProperty.get().getReadMethod().invoke(value);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    throw new MappingException(String.format("error reading property %s", PROPERTY_VALUE_TYPE_NAME));
                }
            }
            if (attributeToType.isPresent() || type != null) {
                if (type != null) {
                    typedAttributeBuilder = typedAttributeBuilder.withAttributeDataType(PROPERTY_VALUE_TYPE_NAMESPACE_PREFIX + type);
                }
                builder = builder.addAttribute(typedAttributeBuilder.build());
            }
        }
        return builder;
    }

    @Override
    protected AttributeType.Builder toAttribute(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        AttributeType original = super.toAttribute(value, generator, context).build();
        Optional<PropertyDescriptor> valueTypeProperty = AasUtils.getAasProperties(value.getClass()).stream()
                .filter(x -> PROPERTY_VALUE_TYPE_NAME.equals(x.getName()))
                .findFirst();
        List<AttributeType> untouchedAttributes = original.getAttribute().stream()
                .filter(x -> !typedProperties.contains(x.getName()))
                .collect(Collectors.toList());
        AttributeType.Builder builder = AttributeType
                .copyOf(original)
                .withAttribute(untouchedAttributes);
        for (String property : typedProperties) {
            AttributeType.Builder typedAttributeBuilder;
            Optional<AttributeType> attributeToType = original.getAttribute().stream()
                    .filter(x -> property.equals(x.getName()))
                    .findFirst();
            if (attributeToType.isPresent()) {
                typedAttributeBuilder = AttributeType.copyOf(attributeToType.get());
            } else {
                typedAttributeBuilder = super.toAttribute(null, generator, context
                        .with(AasUtils.getProperty(value, property)));
            }
            Object type = null;
            if (valueTypeProperty.isPresent()) {
                try {
                    type = valueTypeProperty.get().getReadMethod().invoke(value);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    throw new MappingException(String.format("error reading property %s", PROPERTY_VALUE_TYPE_NAME));
                }
            }
            if (attributeToType.isPresent() || type != null) {
                if (type != null) {
                    typedAttributeBuilder = typedAttributeBuilder.withAttributeDataType(PROPERTY_VALUE_TYPE_NAMESPACE_PREFIX + type);
                }
                builder = builder.addAttribute(typedAttributeBuilder.build());
            }
        }
        return builder;
    }
}
