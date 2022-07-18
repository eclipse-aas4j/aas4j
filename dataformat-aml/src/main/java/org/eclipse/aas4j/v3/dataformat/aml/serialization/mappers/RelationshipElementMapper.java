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
package org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers;

import org.eclipse.aas4j.v3.dataformat.aml.model.caex.InternalElementType;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.AmlGenerator;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.DefaultMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.MappingContext;
import org.eclipse.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.Referable;
import org.eclipse.aas4j.v3.model.Reference;
import org.eclipse.aas4j.v3.model.RelationshipElement;

public class RelationshipElementMapper extends DefaultMapper<RelationshipElement> {

    private static final String PROPERTY_FIRST_NAME = "first";
    private static final String PROPERTY_SECOND_NAME = "second";

    public RelationshipElementMapper() {
        super(PROPERTY_FIRST_NAME, PROPERTY_SECOND_NAME);
    }

    @Override
    public void map(RelationshipElement element, AmlGenerator generator, MappingContext context) throws MappingException {
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
        mapProperty(element, element.getFirst(), PROPERTY_FIRST_NAME, subGenerator, context);
        mapProperty(element, element.getSecond(), PROPERTY_SECOND_NAME, subGenerator, context);
        generator.with(builder).appendReferenceTargetInterfaceIfRequired(element, context);
        generator.addInternalElement(builder.build(), element);
    }

    private void mapProperty(RelationshipElement element, Reference reference, String name, AmlGenerator generator, MappingContext context) {
        Referable resolvedReference = AasUtils.resolve(reference, context.getEnvironment());
        if (resolvedReference != null) {
            generator.addExternalInterfaceForReference();
            generator.addInternalLink(name, element, reference);
        } else {
            generator.addExternalInterfaceForUnresolvableReference(name, reference);
        }
    }
}
