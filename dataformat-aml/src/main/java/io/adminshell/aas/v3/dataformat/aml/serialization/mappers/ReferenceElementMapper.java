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
import io.adminshell.aas.v3.rc02.model.Referable;
import io.adminshell.aas.v3.rc02.model.ReferenceElement;

public class ReferenceElementMapper extends DefaultMapper<ReferenceElement> {

    private static final String PROPERTY_VALUE_NAME = "value";
    private static final String PROPERTY_VALUE_TYPE = "xs:string";

    public ReferenceElementMapper() {
        super(PROPERTY_VALUE_NAME);
    }

    @Override
    public void map(ReferenceElement element, AmlGenerator generator, MappingContext context) throws MappingException {
        if (element == null) {
            return;
        }
        InternalElementType.Builder builder = InternalElementType.builder()
                .withName(context.getClassNamingStrategy().getName(
                        element.getClass(),
                        element,
                        null))
                .withRoleRequirements(generator.roleRequirement(ReflectionHelper.getModelType(element.getClass())));
        AmlGenerator subGenerator = generator.with(builder);
        mapProperties(element, subGenerator, context);
        Referable resolvedReference = AasUtils.resolve(element.getValue(), context.getEnvironment());
        if (resolvedReference != null) {
            subGenerator.addExternalInterfaceForReference();
            subGenerator.addInternalLink(PROPERTY_VALUE_NAME, element, element.getValue());
        } else {
            if (element.getValue() != null) {
                subGenerator.addExternalInterfaceForUnresolvableReference(PROPERTY_VALUE_NAME, element.getValue());
            }
        }
        subGenerator.appendReferenceTargetInterfaceIfRequired(element, context);
        generator.addInternalElement(builder.build(), element);
    }

}
