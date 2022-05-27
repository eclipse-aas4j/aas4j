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
package io.adminshell.aas.v3.dataformat.aml.serialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.model.caex.AttributeType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.AttributeType.RefSemantic;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConceptDescriptionMapper extends DefaultMapper<ConceptDescription> {

    protected static final String PROPERTY_IS_CASE_OF_NAME = "isCaseOf";
    protected static final String PROPERTY_IS_CASE_OFS_NAME = PROPERTY_IS_CASE_OF_NAME + "s";

    @Override
    protected InternalElementType.Builder toInternalElement(ConceptDescription value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType original = super.toInternalElement(value, generator, context).build();
        List<AttributeType> untouchedAttributes = original.getAttribute().stream()
                .filter(x -> !PROPERTY_IS_CASE_OFS_NAME.equals(x.getName()))
                .collect(Collectors.toList());
        InternalElementType.Builder builder = InternalElementType
                .copyOf(original)
                .withAttribute(untouchedAttributes);
        Optional<AttributeType> isCaseOfAttribute = original.getAttribute().stream()
                .filter(x -> PROPERTY_IS_CASE_OFS_NAME.equals(x.getName()))
                .findFirst();
        if (isCaseOfAttribute.isPresent()) {
            String path = isCaseOfAttribute.get().getRefSemantic().get(0).getCorrespondingAttributePath();
            String newPath = path.substring(0, path.lastIndexOf("/") + 1) + PROPERTY_IS_CASE_OF_NAME;
            builder = builder.addAttribute(AttributeType
                    .copyOf(isCaseOfAttribute.get())
                    .withName(PROPERTY_IS_CASE_OF_NAME)
                    .withRefSemantic(RefSemantic.copyOf(isCaseOfAttribute.get().getRefSemantic().get(0))
                            .withCorrespondingAttributePath(newPath)
                            .build())
                    .build());
        }
        return builder;
    }
}
