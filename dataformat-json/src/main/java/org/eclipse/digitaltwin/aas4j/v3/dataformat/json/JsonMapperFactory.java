/*
 * Copyright (c) 2023 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.internal.ReflectionAnnotationIntrospector;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Factory for creating a {@link JsonMapper} configured to produce and consume AAS Version 3 conformant JSON serializations
 * 
 * @author schnicke
 *
 */
public class JsonMapperFactory {

    public JsonMapper create(SimpleAbstractTypeResolver typeResolver) {
        final JsonMapper mapper = JsonMapper.builder().enable(SerializationFeature.INDENT_OUTPUT).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .addModule(buildEnumModule())
                .addModule(buildImplementationModule(typeResolver))
                .annotationIntrospector(new ReflectionAnnotationIntrospector())
                .build();
        ReflectionHelper.JSON_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));

        return mapper;
    }

    protected SimpleModule buildImplementationModule(SimpleAbstractTypeResolver typeResolver) {
        SimpleModule module = new SimpleModule();
        module.setAbstractTypes(typeResolver);
        return module;
    }

    protected SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new EnumSerializer());
        ReflectionHelper.ENUMS.forEach(x -> module.addDeserializer(x, new EnumDeserializer<>(x)));
        return module;
    }
}
