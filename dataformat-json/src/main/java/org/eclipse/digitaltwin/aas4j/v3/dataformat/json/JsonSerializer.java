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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import java.util.Collection;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Class for serializing an instance of AssetAdministrationShellEnvironment or Referables to JSON.
 */
public class JsonSerializer implements Serializer, ReferableSerializer {

    protected JsonMapper mapper;

    public JsonSerializer() {
        buildMapper();
    }

    protected void buildMapper() {
        mapper = JsonMapper.builder().enable(SerializationFeature.INDENT_OUTPUT)
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .addModule(buildEnumModule())
                .annotationIntrospector(new ReflectionAnnotationIntrospector())
                .build();
        ReflectionHelper.JSON_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
    }

    protected SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new EnumSerializer());
        return module;
    }

    @Override
    public String write(Environment aasEnvironment) throws SerializationException {
        try {
            return mapper.writeValueAsString(aasEnvironment);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        }
    }

    @Override
    public String write(Referable referable) throws SerializationException {
        try {
            return mapper.writeValueAsString(referable);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing Referable", ex);
        }
    }

    @Override
	public String write(Collection<? extends Referable> referables) throws SerializationException {
		if (referables == null) {
            return null;
		} else if (referables.isEmpty()) {
			return mapper.createArrayNode().toString();
		}

        try {
            return mapper.writerFor(mapper.getTypeFactory().constructCollectionType(List.class, referables.iterator().next().getClass()))
                    .writeValueAsString(referables);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing list of Referables", ex);
        }
    }
}
