/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;

/**
 * Class for deserializing/parsing AAS JSON documents.
 */
public class JsonDeserializer {
    protected JsonMapper mapper;
    protected SimpleAbstractTypeResolver typeResolver;
    private JsonMapperFactory jsonMapperFactory;

    public JsonDeserializer() {
        typeResolver = new SimpleAbstractTypeResolverFactory().create();
        jsonMapperFactory = new JsonMapperFactory();
        mapper = jsonMapperFactory.create(typeResolver);
    }

    /**
     * Enables usage of custom implementation to be used for deserialization instead of default implementation, e.g.
     * defining a custom implementation of the Submodel interface {@code class
     * CustomSubmodel implements Submodel {}} and calling
     * {@code useImplementation(Submodel.class, CustomSubmodel.class);} will result in all instances of Submodel will be
     * deserialized as CustomSubmodel. Subsequent class with the same aasInterface parameter will override the effects
     * of all previous calls.
     *
     * @param <T> the type of the interface to replace
     * @param aasInterface the class of the interface to replace
     * @param implementation the class implementing the interface that should be used for deserialization.
     */
    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
        typeResolver.addMapping(aasInterface, implementation);
        mapper = jsonMapperFactory.create(typeResolver);
    }

    /**
     * Generic method to deserialize a given string into instance of an AAS type
     *
     * @param value a string representation of the AAS instance
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return the instance
     * @throws DeserializationException if deserialization fails
     */
    public <T> T read(String value, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.readValue(value, valueType);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing " + valueType.getSimpleName(), ex);
        }
    }

    /**
     * Generic method to deserialize a given string into a list of AAS instances
     *
     * @param value a string representation of the AAS instances list
     * @param valueType the class type of the instance. Not null.
     * @param <T> the AAS type
     * @return a list of AAS instances
     * @throws DeserializationException if deserialization fails
     */
    public <T> List<T> readList(String value, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.readValue(value, mapper.getTypeFactory().constructCollectionLikeType(List.class, valueType));
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of " + valueType.getSimpleName(), ex);
        }
    }

    /**
     * Generic method to deserialize a given InputStream into instance of an AAS type, using the default UTF-8 charset
     *
     * @param stream An InputStream containing the string representation of the AAS instance
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return an AAS instance
     * @throws DeserializationException if deserialization fails
     */
    public <T> T read(InputStream stream, Class<T> valueType) throws DeserializationException {
        return read(stream, StandardCharsets.UTF_8, valueType);
    }

    /**
     * Generic method to deserialize a given InputStream into instance of an AAS type, using a given charset
     *
     * @param stream An InputStream containing the string representation of the AAS instance
     * @param charset the charset to use for deserialization
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return an AAS instance
     * @throws DeserializationException if deserialization fails
     */
    public <T> T read(InputStream stream, Charset charset, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.readValue(new InputStreamReader(stream, charset), valueType);
        } catch (IOException ex) {
            throw new DeserializationException("error deserializing " + valueType.getSimpleName(), ex);
        }
    }

    /**
     * Deserializes a given input stream into a list of AAS instances using the default UTF-8 charset
     *
     * @param stream An InputStream containing the string representation of the AAS instances list
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return a list of AAS instances
     * @throws DeserializationException if deserialization fails
     */
    public <T> List<T> readList(InputStream stream, Class<T> valueType) throws DeserializationException {
        return readList(stream, StandardCharsets.UTF_8, valueType);
    }

    /**
     * Deserializes a given input stream into a list of AAS instances
     *
     * @param stream An InputStream containing the string representation of the AAS instances list
     * @param charset the charset to use for deserialization
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return a list of AAS instances
     * @throws DeserializationException if deserialization fails
     */
    public <T> List<T> readList(InputStream stream, Charset charset, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.readValue(new InputStreamReader(stream, charset),
                    mapper.getTypeFactory().constructCollectionLikeType(List.class, valueType));
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of " + valueType.getSimpleName(), ex);
        }
    }

    /**
     * Generic method to deserialize a given JSON node into instance of an AAS type
     *
     * @param node the node to parse
     * @param valueType the class type of the AAS instance. Not null.
     * @param <T> the AAS type
     * @return an AAS instance
     *
     * @throws DeserializationException if deserialization fails
     */
    public <T> T read(JsonNode node, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.treeToValue(node, valueType);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing " + valueType.getSimpleName(), ex);
        }
    }

    /**
     * Deserializes a given JsonArray into a list of AAS instances
     *
     * @param node a JsonArray representing the AAS instances list
     * @param valueType the class type of the instance. Not null.
     * @param <T> the AAS type
     * @return a list of AAS instances
     * @throws DeserializationException if deserialization fails
     */
    public <T> List<T> readList(JsonNode node, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.treeToValue(node, mapper.getTypeFactory().constructCollectionLikeType(List.class, valueType));
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of " + valueType.getSimpleName(), ex);
        }
    }
}