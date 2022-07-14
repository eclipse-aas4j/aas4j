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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.mappers;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.AmlParser;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.DefaultMapper;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.MappingContext;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;

import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.rc02.model.Property;
import org.eclipse.aas4j.v3.rc02.model.Qualifier;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultQualifier;

import java.beans.PropertyDescriptor;

/**
 *
 */
public class QualifierMapper extends DefaultMapper<Qualifier> {

    protected static PropertyDescriptor PROPERTY_VALUE_TYPE = AasUtils.getProperty(Property.class, "valueType");

    public static final String VALUE_ATTRIBUTE_NAME = "AAS:Qualifier/value";

    public QualifierMapper() {
        super(PROPERTY_VALUE_TYPE.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }
        setValueDataTypeFromAttributeDataType(parser,parent,VALUE_ATTRIBUTE_NAME,Qualifier.class);
        super.mapProperties(parent, parser, context);
    }


    @Override
    protected Qualifier fromAttribute(AmlParser parser, AttributeType attribute, MappingContext context) throws MappingException {
        if (parser == null || attribute == null || context == null) {
            return null;
        }
        //TODO use Type Factory instead of hardcoded DefaultQualifier.class
        Qualifier result = (Qualifier) newInstance(DefaultQualifier.class, context);
        mapProperties(result, parser, context);
        return result;

    }
}
