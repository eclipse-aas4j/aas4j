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
import io.adminshell.aas.v3.dataformat.aml.deserialization.Mapper;
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.Property;
import io.adminshell.aas.v3.model.Referable;

import java.beans.PropertyDescriptor;

/**
 *
 */
public class PropertyMapper extends DefaultMapper<Property> {

    public static final String VALUE_ATTRIBUTE_NAME = "AAS:Property/value";

    protected static PropertyDescriptor PROPERTY_VALUE_TYPE = AasUtils.getProperty(Property.class, "valueType");

    public PropertyMapper() {
        super(PROPERTY_VALUE_TYPE.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        setValueDataTypeFromAttributeDataType(parser,parent,VALUE_ATTRIBUTE_NAME,Property.class);

        Mapper<?> mapper = context.getMappingProvider().getMapper(Referable.class);
        mapper.map(parser,context);

        super.mapProperties(parent, parser, context);
    }

}
