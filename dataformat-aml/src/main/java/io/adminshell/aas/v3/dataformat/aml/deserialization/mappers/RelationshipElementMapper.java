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
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.RelationshipElement;
import java.beans.PropertyDescriptor;

public class RelationshipElementMapper extends ReferableMapper<RelationshipElement> {

    protected static PropertyDescriptor PROPERTY_FIRST = AasUtils.getProperty(RelationshipElement.class, "first");
    protected static PropertyDescriptor PROPERTY_SECOND = AasUtils.getProperty(RelationshipElement.class, "second");

    @Override
    protected Object fromInternalElement(AmlParser parser, InternalElementType internalElement, MappingContext context) throws MappingException {
        Object result = super.fromInternalElement(parser, internalElement, context);
        parser.resolveIdToReferenceLater(result, PROPERTY_FIRST, findInternalLinkTarget(internalElement, PROPERTY_FIRST));
        parser.resolveIdToReferenceLater(result, PROPERTY_SECOND, findInternalLinkTarget(internalElement, PROPERTY_SECOND));
        return result;
    }
}
