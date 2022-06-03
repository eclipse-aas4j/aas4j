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
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
// TODO import io.adminshell.aas.v3.model.DataTypeIEC61360;
import org.apache.xerces.dom.ElementNSImpl;
import org.apache.xerces.dom.TextImpl;

// TODO solve the EmbeddedDataSpecifciation issue
/*
public class EnumDataTypeIEC61360Mapper extends DefaultMapper<DataTypeIEC61360> {

    @Override
    public DataTypeIEC61360 map(AmlParser parser, MappingContext context) throws MappingException {
        if (parser == null
                || parser.getCurrent() == null
                || context.getProperty() == null) {
            return null;
        }
        AttributeType attribute = null;
        if(AttributeType.class.isAssignableFrom(parser.getCurrent().getClass())){
            attribute = (AttributeType) parser.getCurrent();
        } else {
            attribute = findAttribute(parser.getCurrent(),context.getProperty(),context, parser.getRefSemanticPrefix());
        }

        if (attribute != null) {
            Class<?> type = context.getProperty().getReadMethod().getReturnType();
            String value="";
            if(DataTypeIEC61360.class.isAssignableFrom(type)){
                ElementNSImpl elementNS = (ElementNSImpl) attribute.getValue();
                value = ((TextImpl)elementNS.getFirstChild()).getData();
            }

            if (Enum.class.isAssignableFrom(type) && !value.isBlank()) {
                return DataTypeIEC61360.valueOf(value);
            }
        }
        return null;
    }

}*/
