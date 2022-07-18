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
package org.eclipse.aas4j.v3.dataformat.json;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.eclipse.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.dataformat.Deserializer;
import org.eclipse.aas4j.v3.dataformat.core.ReflectionHelper;
// TODO import io.adminshell.aas.v3.dataformat.core.deserialization.EmbeddedDataSpecificationDeserializer;
import org.eclipse.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.aas4j.v3.model.Environment;
// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import org.eclipse.aas4j.v3.model.Referable;

/**
 * Class for deserializing/parsing AAS JSON documents.
 */
public class JsonDeserializer implements Deserializer, ReferableDeserializer {

    protected JsonMapper mapper;
    protected SimpleAbstractTypeResolver typeResolver;
    // TODO
    protected static Map<Class<?>, com.fasterxml.jackson.databind.JsonDeserializer> customDeserializers = Map.of(
           /* EmbeddedDataSpecification.class, new EmbeddedDataSpecificationDeserializer() */);

    public JsonDeserializer() {
        initTypeResolver();
        buildMapper();
    }

    protected void buildMapper() {
        mapper = JsonMapper.builder()
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .annotationIntrospector(new ReflectionAnnotationIntrospector())
                .addModule(buildEnumModule())
                .addModule(buildImplementationModule())
                .addModule(buildCustomDeserializerModule())
                .build();
        ReflectionHelper.JSON_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
    }

    protected SimpleModule buildCustomDeserializerModule() {
        SimpleModule module = new SimpleModule();
        customDeserializers.forEach(module::addDeserializer);
        return module;
    }

    private void initTypeResolver() {
        typeResolver = new SimpleAbstractTypeResolver();
        ReflectionHelper.DEFAULT_IMPLEMENTATIONS
                .stream()
                .filter(x -> !customDeserializers.containsKey(x.getInterfaceType()))
                .forEach(x -> typeResolver.addMapping(x.getInterfaceType(), x.getImplementationType()));
    }

    protected SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        ReflectionHelper.ENUMS.forEach(x -> module.addDeserializer(x, new EnumDeserializer<>(x)));
        return module;
    }

    protected SimpleModule buildImplementationModule() {
        SimpleModule module = new SimpleModule();
        module.setAbstractTypes(typeResolver);
        return module;
    }

    @Override
    public Environment read(String value) throws DeserializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            //return mapper.treeToValue(ModelTypeProcessor.preprocess(value), Environment.class);
            return mapper.treeToValue(new ObjectMapper().readTree(value), Environment.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
        }
    }

    @Override
    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
        typeResolver.addMapping(aasInterface, implementation);
        buildMapper();
    }

    @Override
    public <T extends Referable> T readReferable(String referable, Class<T> outputClass) throws DeserializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            //return mapper.treeToValue(ModelTypeProcessor.preprocess(referable), outputClass);
            return mapper.treeToValue(new ObjectMapper().readTree(referable), outputClass);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing Referable", ex);
        }
    }

    @Override
    public <T extends Referable> List<T> readReferables(String referables, Class<T> outputClass) throws DeserializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            // String parsed = mapper.writeValueAsString(ModelTypeProcessor.preprocess(referables)) ;
            String parsed = mapper.writeValueAsString(new ObjectMapper().readTree(referables)) ;
            return mapper.readValue(parsed,new TypeReference<List<T>>(){});
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }
}
