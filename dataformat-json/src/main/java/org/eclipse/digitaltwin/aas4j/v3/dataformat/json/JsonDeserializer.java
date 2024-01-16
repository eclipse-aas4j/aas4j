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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Class for deserializing/parsing AAS JSON documents.
 */
public class JsonDeserializer {

    protected JsonMapper mapper;
    protected SimpleAbstractTypeResolver typeResolver;
    private JsonMapperFactory jsonMapperFactory;

    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public JsonDeserializer() {
        typeResolver = new SimpleAbstractTypeResolverFactory().create();
        jsonMapperFactory = new JsonMapperFactory();
        mapper = jsonMapperFactory.create(typeResolver);
    }

    /**
     * Deserializes a given string into an instance of AssetAdministrationShellEnvironment
     *
     * @param value a string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(String value) throws DeserializationException {
        try {
            return mapper.readValue(value, Environment.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Deserializes a given JSON node into an instance of AssetAdministrationShellEnvironment
     *
     * @param root root node of the document to parse
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(JsonNode root) throws DeserializationException {
        try {
            return mapper.treeToValue(root, Environment.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Deserializes a given InputStream into an instance of AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param src an InputStream containing the string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src) throws DeserializationException {
        return read(src, DEFAULT_CHARSET);
    }

    /**
     * Deserializes a given InputStream into an instance of AssetAdministrationShellEnvironment using a given charset
     *
     * @param src An InputStream containing the string representation of the AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src, Charset charset) throws DeserializationException {
        try {
            return mapper.readValue(new InputStreamReader(src, charset), Environment.class);
        } catch (IOException ex) {
            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Deserializes a given File into an instance of AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param file A java.io.File containing the string representation of the AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(java.io.File file, Charset charset)
        throws FileNotFoundException, DeserializationException {
        return read(new FileInputStream(file), charset);
    }

    /**
     * Deserializes a given File into an instance of AssetAdministrationShellEnvironment using a given charset
     *
     * @param file a java.io.File containing the string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if the file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(java.io.File file) throws FileNotFoundException, DeserializationException {
        return read(file, DEFAULT_CHARSET);
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
     * Deserializes a given string into an instance of the given Referable
     *
     * @param src a string representation of the Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(String src, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.readValue(src, outputClass);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param src a input stream representing a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(InputStream src, Class<T> outputClass) throws DeserializationException {
        return readReferable(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param root JSON node representing a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(JsonNode root, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.treeToValue(root, outputClass);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable
     *
     * @param src a input stream representing a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(InputStream src, Charset charset, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.readValue(new InputStreamReader(src, charset), outputClass);
        } catch (IOException ex) {
            throw new DeserializationException("error deserializing Referable", ex);
        }
    }

    /**
     * Deserializes a given file into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param src a file containing string representation of a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> T readReferable(File src, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferable(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given file into an instance of the given Referable
     *
     * @param src a file containing string representation of a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> T readReferable(File src, Charset charset, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferable(new FileInputStream(src), charset, outputClass);
    }

    /**
     * Deserializes a given string into an instance of a list of the given Referables
     *
     * @param referables a string representation of an array of Referables
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of a list of the referables
     * @throws DeserializationException if deserialization of referable fails
     */
    public <T extends Referable> List<T> readReferables(String referables, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.readValue(referables, new TypeReference<List<T>>() {
            });
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given string into an instance of a list of the given Referables
     *
     * @param root JSON node representation of an array of Referables
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of a list of the referables
     * @throws DeserializationException if deserialization of referable fails
     */
    public <T extends Referable> List<T> readReferables(JsonNode root, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.treeToValue(root, mapper.getTypeFactory().constructCollectionLikeType(List.class, outputClass));
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of a list of the given Referable using DEFAULT_CHARSET
     *
     * @param src a input stream representing a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> List<T> readReferables(InputStream src, Class<T> outputClass) throws DeserializationException {
        return readReferables(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given input stream into an instance of a list of the given Referable
     *
     * @param src a input stream representing a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> List<T> readReferables(InputStream src, Charset charset, Class<T> outputClass) throws DeserializationException {
        try {
            return mapper.readValue(new InputStreamReader(src, charset), mapper.getTypeFactory().constructCollectionLikeType(List.class, outputClass));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deserializes a given file into an instance of a list of the given Referable using DEFAULT_CHARSET
     *
     * @param src a file containing string representation of a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> List<T> readReferables(File src, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferables(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given file into an instance of a list of the given Referable
     *
     * @param src a file containing string representation of a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> List<T> readReferables(File src, Charset charset, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferables(new FileInputStream(src), charset, outputClass);
    }

    public Reference readReference(String reference) throws DeserializationException {
        try {
            return mapper.readValue(reference, Reference.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing the Reference", ex);
        }
    }

    public List<Reference> readReferences(String references) throws DeserializationException {
        try {
            return mapper.readValue(references,new TypeReference<List<Reference>>(){});
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of References", ex);
        }
    }


    public SpecificAssetId readSpecificAssetId(String specificAssetId) throws DeserializationException {
        try {
            return mapper.readValue(specificAssetId, SpecificAssetId.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing the SpecificAssetId", ex);
        }
    }

    public List<SpecificAssetId> readSpecificAssetIds(String specificAssetIds) throws DeserializationException {
        try {
            return mapper.readValue(specificAssetIds, new TypeReference<List<SpecificAssetId>>(){});
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of SpecificAssetIds", ex);
        }
    }

    public SubmodelDescriptor readSubmodelDescriptor(String submodelDescriptor) throws DeserializationException {
        try {
            return mapper.readValue(submodelDescriptor, SubmodelDescriptor.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing the SubmodelDescriptor", ex);
        }
    }

    public List<SubmodelDescriptor> readSubmodelDescriptors(String submodelDescriptors) throws DeserializationException {
        try {
            return mapper.readValue(submodelDescriptors, new TypeReference<List<SubmodelDescriptor>>(){});
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of SubmodelDescriptors", ex);
        }
    }

    public AssetAdministrationShellDescriptor readAssetAdministrationShellDescriptor(String assetAdministrationShellDescriptor) throws DeserializationException {
        try {
            return mapper.readValue(assetAdministrationShellDescriptor, AssetAdministrationShellDescriptor.class);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing the AssetAdministrationShellDescriptor", ex);
        }
    }

    public List<AssetAdministrationShellDescriptor> readAssetAdministrationShellDescriptors(String assetAdministrationShellDescriptors) throws DeserializationException {
        try {
            return mapper.readValue(assetAdministrationShellDescriptors, new TypeReference<List<AssetAdministrationShellDescriptor>>(){});
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing list of AssetAdministrationShellDescriptors", ex);
        }
    }
}