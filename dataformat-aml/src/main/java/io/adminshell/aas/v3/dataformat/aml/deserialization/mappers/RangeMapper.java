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
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.DataTypeDefXsd;
import io.adminshell.aas.v3.rc02.model.Range;

import java.beans.PropertyDescriptor;

/**
 *
 */
public class RangeMapper extends DefaultMapper<Range> {

    public static final String MIN_ATTRIBUTE_NAME = "AAS:Range/min";
    public static final String MAX_ATTRIBUTE_NAME = "AAS:Range/max";
    protected static PropertyDescriptor PROPERTY_VALUE_TYPE = AasUtils.getProperty(Range.class, "valueType");

    public RangeMapper() {
        super(PROPERTY_VALUE_TYPE.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        AttributeType attributeTypeMin = findAttributesByCorrespondingAttributePath(parser.getCurrent(), MIN_ATTRIBUTE_NAME)
                .stream()
                .findFirst()
                .orElse(null);

        AttributeType attributeTypeMax = findAttributesByCorrespondingAttributePath(parser.getCurrent(), MAX_ATTRIBUTE_NAME)
                .stream()
                .findFirst()
                .orElse(null);

        if (attributeTypeMax != null || attributeTypeMin != null){
            DataTypeDefXsd dataTypeMin = getDataTypeFromAttribute(attributeTypeMin);
            DataTypeDefXsd dataTypeMax = getDataTypeFromAttribute(attributeTypeMax);

            if (!dataTypeMax.equals(dataTypeMin))
                throw new MappingException(String.format("min/max attributes in range %s %s has different attribute datatypes", parser.getCurrent().getID(), parser.getCurrent().getName()));

            ((Range) parent).setValueType(dataTypeMax);
        }

        super.mapProperties(parent, parser, context);
    }

}
