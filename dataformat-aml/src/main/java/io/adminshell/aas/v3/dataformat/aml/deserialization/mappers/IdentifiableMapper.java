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
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.Identifiable;
import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.rc02.model.Reference;
import java.beans.PropertyDescriptor;

/**
 *
 */
public class IdentifiableMapper<T extends Identifiable> extends DefaultMapper<T> {

    protected static PropertyDescriptor PROPERTY_IDENTIFICATION = AasUtils.getProperty(Identifiable.class, "identification");

    public IdentifiableMapper() {
        super(PROPERTY_IDENTIFICATION.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }
        AttributeType attribute = findAttribute(parser.getCurrent(), PROPERTY_IDENTIFICATION, context);
        CAEXObject temp = parser.getCurrent();
        parser.setCurrent(attribute);
        String identification = context.map(String.class, parser);
        parser.setCurrent(temp);
        ((Identifiable) parent).setId(identification);
        Reference reference = AasUtils.toReference((Identifiable) parent,
                context.getTypeFactory().getImplementationType(Reference.class),
                context.getTypeFactory().getImplementationType(Key.class));
        parser.collectIdMapping(parser.getCurrent().getID(), reference);
        super.mapProperties(parent, parser, context.with(reference));
    }
}
