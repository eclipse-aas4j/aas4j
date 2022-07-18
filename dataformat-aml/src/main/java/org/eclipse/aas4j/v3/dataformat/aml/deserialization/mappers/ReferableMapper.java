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
import org.eclipse.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.Key;
import org.eclipse.aas4j.v3.model.Referable;
import org.eclipse.aas4j.v3.model.Reference;
import java.beans.PropertyDescriptor;

/**
 *
 */
public class ReferableMapper<T extends Referable> extends DefaultMapper<T> {

    protected static PropertyDescriptor PROPERTY_IDSHORT = AasUtils.getProperty(Referable.class, "idShort");

    public ReferableMapper() {
        super(PROPERTY_IDSHORT.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }
        AttributeType attribute = findAttribute(parser.getCurrent(), PROPERTY_IDSHORT, context);
        ((Referable) parent).setIdShort(String.valueOf(getValue(attribute)));
        Reference reference = AasUtils.toReference(
                context.getParentRef(),
                ((Referable) parent),
                context.getTypeFactory().getImplementationType(Reference.class),
                context.getTypeFactory().getImplementationType(Key.class));
        parser.collectIdMapping(parser.getCurrent().getID(), reference);
        super.mapProperties(parent, parser, context.with(reference));
    }
}
