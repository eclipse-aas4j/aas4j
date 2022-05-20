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
package io.adminshell.aas.v3.dataformat.xml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import io.adminshell.aas.v3.dataformat.DeserializationException;
import io.adminshell.aas.v3.dataformat.Deserializer;
import io.adminshell.aas.v3.dataformat.core.ReflectionHelper;
import io.adminshell.aas.v3.dataformat.core.deserialization.EnumDeserializer;
import io.adminshell.aas.v3.dataformat.xml.deserialization.SubmodelElementDeserializer;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.SubmodelElement;

public class XmlDeserializer implements Deserializer {

    protected XmlMapper mapper;
    protected SimpleAbstractTypeResolver typeResolver;
    protected static Map<Class<?>, com.fasterxml.jackson.databind.JsonDeserializer> customDeserializers = Map.of(
            SubmodelElement.class, new SubmodelElementDeserializer());

    public XmlDeserializer() {
        initTypeResolver();
        buildMapper();
    }

    protected void buildMapper() {
        mapper = XmlMapper.builder().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .annotationIntrospector(new XmlDataformatAnnotationIntrospector())
                .addModule(buildImplementationModule())
                .addModule(buildCustomDeserializerModule())
                .addModule(buildEnumModule())
                .build();
        ReflectionHelper.XML_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
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
    public AssetAdministrationShellEnvironment read(String value) throws DeserializationException {
        try {
            return mapper.readValue(value, AssetAdministrationShellEnvironment.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("deserialization failed", ex);
        }
    }

    @Override
    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
        typeResolver.addMapping(aasInterface, implementation);
        buildMapper();
    }
}
