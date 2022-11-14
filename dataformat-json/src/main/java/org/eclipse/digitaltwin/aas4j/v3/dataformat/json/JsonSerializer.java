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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
// TODO import io.adminshell.aas.v3.dataformat.core.serialization.EmbeddedDataSpecificationSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import java.util.List;

/**
 * Class for serializing an instance of AssetAdministrationShellEnvironment or Referables to
 * JSON.
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
                .addModule(buildCustomSerializerModule())
                .annotationIntrospector(new ReflectionAnnotationIntrospector())
                .build();
        ReflectionHelper.JSON_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
    }

    protected SimpleModule buildCustomSerializerModule() {
        SimpleModule module = new SimpleModule();
        // TODO: module.addSerializer(EmbeddedDataSpecification.class, new EmbeddedDataSpecificationSerializer());
        return module;
    }

    protected SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new EnumSerializer());
        return module;
    }

    @Override
    public String write(Environment aasEnvironment) throws SerializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            // return mapper.writeValueAsString(ModelTypeProcessor.postprocess(mapper.valueToTree(aasEnvironment)));
            return mapper.writeValueAsString(mapper.valueToTree(aasEnvironment));
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        }
    }

    @Override
    public String write(Referable referable) throws SerializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            // return mapper.writeValueAsString(ModelTypeProcessor.postprocess(mapper.valueToTree(referable)));
            return mapper.writeValueAsString(mapper.valueToTree(referable));
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing Referable", ex);
        }
    }

    @Override
    public String write(List<Referable> referables) throws SerializationException {
        if(referables.isEmpty()){
            return null;
        }
        try {
            ObjectWriter objectWriter = mapper.writerFor(mapper.getTypeFactory().constructCollectionType(List.class, referables.get(0).getClass()));
            String json = objectWriter.writeValueAsString(referables);

            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            //return mapper.writeValueAsString(ModelTypeProcessor.postprocess(this.mapper.readTree(json)));
            return mapper.writeValueAsString(this.mapper.readTree(json));

        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing list of Referables", ex);
        }
    }
}
