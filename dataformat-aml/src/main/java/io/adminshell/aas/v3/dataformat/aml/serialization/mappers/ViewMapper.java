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

import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.core.ReflectionHelper;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.View;

public class ViewMapper extends DefaultMapper<View> {

    private static final String PROPERTY_CONTAINED_ELEMENTS_NAME = "containedElements";

    public ViewMapper() {
        super(PROPERTY_CONTAINED_ELEMENTS_NAME);
    }

    @Override
    public void map(View view, AmlGenerator generator, MappingContext context) throws MappingException {
        if (view == null) {
            return;
        }
        InternalElementType.Builder builder = toInternalElement(view, generator, context);
        generator.with(builder).appendReferenceTargetInterfaceIfRequired(view, context);
        for (Reference reference : view.getContainedElements()) {
            Referable referable = AasUtils.resolve(reference, context.getEnvironment());
            builder.addInternalElement(InternalElementType.builder()
                    .withName(getInternalElementName(referable, context))
                    .withID(generator.newId())
                    .withRefBaseSystemUnitPath(generator.getId(reference))
                    .build());

        }
        generator.addInternalElement(builder.build(), view);
    }
}
