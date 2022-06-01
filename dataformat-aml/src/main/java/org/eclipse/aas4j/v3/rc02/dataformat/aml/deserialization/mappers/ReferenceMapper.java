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
import org.eclipse.aas4j.v3.rc02.model.Key;
import org.eclipse.aas4j.v3.rc02.model.Reference;

public class ReferenceMapper extends DefaultMapper<Reference> {

    @Override
    public Reference map(AmlParser parser, MappingContext context) throws MappingException {
        if (parser == null || parser.getCurrent() == null || context == null) {
            return null;
        }
        AttributeType attribute = null;

        if (context.getProperty() == null) {
            if (AttributeType.class.isAssignableFrom(parser.getCurrent().getClass())) {
                attribute = (AttributeType) parser.getCurrent();
            }
        } else {
            attribute = findAttribute(parser.getCurrent(), context.getProperty(), context);
        }
        if (attribute != null) {
            Reference reference = AasUtils.parseReference(
                    String.valueOf(getValue(attribute)),
                    context.getTypeFactory().getImplementationType(Reference.class),
                    context.getTypeFactory().getImplementationType(Key.class));
            return reference;
            // why is this here again?
//            if (context.getParent() != null) {
//                parser.resolveLater(context.getParent(), context.getProperty(), reference);
//            } else {
//                return reference;
//            }
        }
        return null;
    }
}
