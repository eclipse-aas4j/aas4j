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
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.View;

import java.beans.PropertyDescriptor;
import java.util.List;

/**
 *
 */
public class ViewMapper extends DefaultMapper<View> {

    private static final String CONTAINED_ELEMENTS = "containedElements";

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        if (!InternalElementType.class.isAssignableFrom(parser.getCurrent().getClass())) return;
        InternalElementType internalElementType_View = (InternalElementType) parser.getCurrent();

        List<InternalElementType> internalElementTypeList = internalElementType_View.getInternalElement();
        internalElementTypeList.stream().forEach(x -> {
            String idToReference = x.getRefBaseSystemUnitPath();
            if (idToReference != null) {
                parser.resolveIdToReferenceLater(parent, AasUtils.getProperty(View.class, CONTAINED_ELEMENTS), idToReference);
            }
        });

        super.mapProperties(parent, parser, context);
    }
}
