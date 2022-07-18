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

import org.eclipse.aas4j.v3.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.AmlGenerator;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.DefaultCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.MappingContext;
import org.eclipse.aas4j.v3.model.LangString;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.stream.Collectors;

public class LangStringCollectionMapper extends DefaultCollectionMapper<LangString> {

    private static final String NAME_PREFIX = "aml-lang=";

    @Override
    public void map(Collection<LangString> value, AmlGenerator generator, MappingContext context) {
        if (context == null || context.getProperty() == null) {
            throw new IllegalArgumentException("context.property must be non-null");
        }
        if (value == null || value.isEmpty()) {
            return;
        }
        Object t = (Class<?>) ((ParameterizedType) context.getProperty().getReadMethod().getGenericReturnType()).getActualTypeArguments()[0];

        generator.addAttribute(AttributeType.builder()
                .withName(context.getPropertyNamingStrategy().getName(
                        context.getProperty().getReadMethod().getDeclaringClass(),
                        value,
                        context.getProperty().getName()))
                .withRefSemantic(generator.refSemantic(
                        context.getProperty(),
                        context.getPropertyNamingStrategy().getNameForRefSemantic(
                                context.getProperty().getReadMethod().getDeclaringClass(),
                                value,
                                context.getProperty().getName())))
                .addAttribute(value.stream()
                        .map(x -> AttributeType.builder()
                        .withName(NAME_PREFIX + x.getLanguage())
                        .withValue(x.getText())
                        .build())
                        .collect(Collectors.toList()))
                .build());
    }

}
