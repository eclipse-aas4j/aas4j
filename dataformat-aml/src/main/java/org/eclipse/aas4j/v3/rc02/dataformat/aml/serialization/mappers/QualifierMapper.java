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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.mappers;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.AmlGenerator;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.MappingContext;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.rc02.model.Qualifier;

public class QualifierMapper extends AbstractElementMapperWithValueType<Qualifier> {

    @Override
    public void map(Qualifier value, AmlGenerator generator, MappingContext context) throws MappingException {
        asAttribute(value, generator, context);
    }

    @Override
    protected String getAttributeName(Qualifier value, MappingContext context) {
        if (value != null && Qualifier.class.isAssignableFrom(value.getClass())) {
            return context.getPropertyNamingStrategy().getName(
                    Qualifier.class,
                    value,
                    context.getProperty().getName());
        }
        return super.getAttributeName(value, context);
    }

    @Override
    protected AttributeType.RefSemantic getRefSemantic(Qualifier value, AmlGenerator generator, MappingContext context) {
        if (value != null && Qualifier.class.isAssignableFrom(value.getClass())) {
            return generator.refSemantic(
                    context.getProperty(),
                    context.getPropertyNamingStrategy().getNameForRefSemantic(
                            Qualifier.class,
                            value,
                            context.getProperty().getName()));
        }
        return super.getRefSemantic(value, generator, context);
    }
}
