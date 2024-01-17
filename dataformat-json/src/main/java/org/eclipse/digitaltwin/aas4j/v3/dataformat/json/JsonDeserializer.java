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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

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
     * Deserializes a given string into instance of an AAS type
     *
     * @param value a string representation of the AAS instance
     * @param valueType the class type of the AAS instance
     * @param <T> the AAS type
     * @return the instance
     * @throws DeserializationException if deserialization fails
     */
    public <T> T read(String value, Class<T> valueType) throws DeserializationException {
        try {
            return mapper.readValue(value, valueType);
        } catch (JsonProcessingException ex) {
            throw new DeserializationException("error deserializing "+ valueType.getSimpleName(), ex);
        }
    }

    /**
     * Deserializes a given JSON node into instance of an AAS type
     *
     * @param node the node to parse
     * @param valueType the class type of the AAS instance
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
     * Deserializes a given InputStream into instance of an AAS type, using a given charset
     *
     * @param stream An InputStream containing the string representation of the AAS instance
     * @param charset the charset to use for deserialization
     * @param valueType the class type of the AAS instance
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
     * Deserializes a given string into a list of AAS instances
     *
     * @param value a string representation of the AAS instances list
     * @param valueType the class type of the instance
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
     * Deserializes a given JsonArray into a list of AAS instances
     *
     * @param node a JsonArray representing the AAS instances list
     * @param valueType the class type of the instance
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

    /**
     * Deserializes a given input stream into a list of AAS instances
     *
     * @param stream An InputStream containing the string representation of the AAS instances list
     * @param charset the charset to use for deserialization
     * @param valueType the class type of the AAS instance
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
     * Deserializes a given string into an instance of AAS environment
     *
     * @param value a string representation of the AAS environment
     * @return an instance of AAS environment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(String value) throws DeserializationException {
        return read(value, Environment.class);
    }

    /**
     * Deserializes a given JSON node into an instance of AAS environment
     * @param root root node of the document to parse
     * @return an instance of AAS environment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(JsonNode root) throws DeserializationException {
        return read(root, Environment.class);
    }

    /**
     * Deserializes a given InputStream into an instance of AAS environment using DEFAULT_CHARSET
     *
     * @param src an InputStream containing the string representation of the AAS environment
     * @return an instance of AAS environment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src) throws DeserializationException {
        return read(src, DEFAULT_CHARSET);
    }

    /**
     * Deserializes a given InputStream into an instance of AAS environment using a given charset
     *
     * @param src An InputStream containing the string representation of the AAS environment
     * @param charset the charset to use for deserialization
     * @return an instance of AAS environment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src, Charset charset) throws DeserializationException {
        return read(src, charset, Environment.class);
    }

    /**
     * Deserializes a given File into an instance of AAS environment
     *
     * @param file A java.io.File containing the string representation of the AAS environment
     * @param charset the charset to use for deserialization
     * @return an instance of AAS environment
     * @throws FileNotFoundException if file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(File file, Charset charset)
        throws FileNotFoundException, DeserializationException {
        return read(new FileInputStream(file), charset);
    }

    /**
     * Deserializes a given File into an instance of AAS environment using a given charset
     *
     * @param file a java.io.File containing the string representation of the AAS environment
     * @return an instance of AAS environment
     * @throws FileNotFoundException if the file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(File file) throws FileNotFoundException, DeserializationException {
        return read(file, DEFAULT_CHARSET);
    }

    /**
     * Enables usage of custom implementation to be used for deserialization instead of default implementation, e.g.
     * defining a custom implementation of the Submodel interface {@code class CustomSubmodel implements Submodel {}}
     * and calling {@code useImplementation(Submodel.class, CustomSubmodel.class);} will result in all instances of
     * Submodel will be deserialized as CustomSubmodel. Subsequent class with the same aasInterface parameter will
     * override the effects of all previous calls.
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
        return read(src, outputClass);
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
    public <T extends Referable> T readReferable(InputStream src, Class<T> outputClass)
        throws DeserializationException {
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
        return read(root, outputClass);
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
    public <T extends Referable> T readReferable(InputStream src, Charset charset, Class<T> outputClass)
        throws DeserializationException {
        return read(src, charset, outputClass);
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
    public <T extends Referable> T readReferable(File src, Class<T> outputClass)
        throws DeserializationException, FileNotFoundException {
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
    public <T extends Referable> T readReferable(File src, Charset charset, Class<T> outputClass)
        throws DeserializationException, FileNotFoundException {
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
    public <T extends Referable> List<T> readReferables(String referables, Class<T> outputClass)
        throws DeserializationException {
        return readList(referables, outputClass);
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
    public <T extends Referable> List<T> readReferables(JsonNode root, Class<T> outputClass)
        throws DeserializationException {
        return readList(root, outputClass);
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
    public <T extends Referable> List<T> readReferables(InputStream src, Class<T> outputClass)
        throws DeserializationException {
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
    public <T extends Referable> List<T> readReferables(InputStream src, Charset charset, Class<T> outputClass)
        throws DeserializationException {
        return readList(src, charset, outputClass);
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
    public <T extends Referable> List<T> readReferables(File src, Class<T> outputClass)
        throws DeserializationException, FileNotFoundException {
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
    public <T extends Referable> List<T> readReferables(File src, Charset charset, Class<T> outputClass)
        throws DeserializationException, FileNotFoundException {
        return readList(new FileInputStream(src), charset, outputClass);
    }

    /**
     * Deserializes a given string into an instance of an AAS reference
     *
     * @param reference a string representation of an AAS reference
     * @return an instance of the AAS reference
     * @throws DeserializationException if deserialization fails
     */
    public Reference readReference(String reference) throws DeserializationException {
        return read(reference, Reference.class);
    }

    /**
     * Deserializes a given string into a list of AAS references
     *
     * @param references a string representation of the AAS references list
     * @return a list of AAS references
     * @throws DeserializationException if deserialization fails
     */
    public List<Reference> readReferences(String references) throws DeserializationException {
        return readList(references, Reference.class);
    }

    /**
     * Deserializes a given string into an instance of an AAS specific asset ID
     *
     * @param specificAssetId a string representation of an AAS specific asset ID
     * @return an instance of the AAS specific asset ID
     * @throws DeserializationException if deserialization fails
     */
    public SpecificAssetId readSpecificAssetId(String specificAssetId) throws DeserializationException {
        return read(specificAssetId, SpecificAssetId.class);
    }

    /**
     * Deserializes a given string into a list of AAS references
     *
     * @param specificAssetIds a string representation of the AAS specific asset IDs
     * @return a list of AAS specific asset IDs
     * @throws DeserializationException if deserialization fails
     */
    public List<SpecificAssetId> readSpecificAssetIds(String specificAssetIds) throws DeserializationException {
        return readList(specificAssetIds, SpecificAssetId.class);
    }

    /**
     * Deserializes a given string into an AAS submodel descriptor
     *
     * @param submodelDescriptor a string representation of the AAS submodel descriptor
     * @return an instance of AAS submodel descriptor
     * @throws DeserializationException if deserialization fails
     */
    public SubmodelDescriptor readSubmodelDescriptor(String submodelDescriptor) throws DeserializationException {
        return read(submodelDescriptor, SubmodelDescriptor.class);
    }

    /**
     * Deserializes a given string into a list of AAS submodel descriptors
     *
     * @param submodelDescriptors a string representation of the submodel descriptors
     * @return a list of AAS submodel descriptors
     * @throws DeserializationException if deserialization fails
     */
    public List<SubmodelDescriptor> readSubmodelDescriptors(String submodelDescriptors) throws DeserializationException {
        return readList(submodelDescriptors, SubmodelDescriptor.class);
    }

    /**
     * Deserializes a given string into an AAS submodel descriptor
     *
     * @param shellDescriptor a string representation of the AAS shell descriptor
     * @return an instance of AAS shell descriptor
     * @throws DeserializationException if deserialization fails
     */
    public AssetAdministrationShellDescriptor readAssetAdministrationShellDescriptor(String shellDescriptor)
        throws DeserializationException {
        return read(shellDescriptor, AssetAdministrationShellDescriptor.class);
    }

    /**
     * Deserializes a given string into a list of AAS shell descriptors
     *
     * @param shellDescriptors a string representation of the AAS shell descriptors
     * @return a list of AAS shell descriptors
     * @throws DeserializationException if deserialization fails
     */
    public List<AssetAdministrationShellDescriptor> readAssetAdministrationShellDescriptors(String shellDescriptors)
        throws DeserializationException {
        return readList(shellDescriptors, AssetAdministrationShellDescriptor.class);
    }
}