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
package org.eclipse.aas4j.v3.dataformat.aml.deserialization.mappers;

import org.eclipse.aas4j.v3.dataformat.aml.deserialization.AmlParser;
import org.eclipse.aas4j.v3.dataformat.aml.deserialization.DefaultMapper;
import org.eclipse.aas4j.v3.dataformat.aml.deserialization.MappingContext;
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;

public class EnumMapper extends DefaultMapper<Enum> {

    @Override
    public Enum map(AmlParser parser, MappingContext context) throws MappingException {
        if (parser == null
                || parser.getCurrent() == null
                || context.getProperty() == null) {
            return null;
        }
        AttributeType attribute = findAttribute(parser.getCurrent(), context.getProperty(), context);
        if (attribute != null) {
            Class type = context.getProperty().getReadMethod().getReturnType();
            String value = String.valueOf(getValue(attribute));
            if (Enum.class.isAssignableFrom(type) && !value.isBlank()) {
                return Enum.valueOf(type, value);
            }
        }
        return null;
    }

}
