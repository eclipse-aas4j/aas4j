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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;

/**
 * Class for serializing of AAS instances.
 */
public class JsonSerializer {
    protected JsonMapper mapper;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public JsonSerializer() {
        mapper = new JsonMapperFactory().create(new SimpleAbstractTypeResolverFactory().create());
    }

    /**
     * Serializes a given instance of AAS environment to a string
     *
     * @param aasEnvironment the AAS environment to serialize
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    public String write(Environment aasEnvironment) throws SerializationException {
        return write((Object)aasEnvironment);
    }

    /**
     * Converts a given instance of AAS environment to a JSON node
     *
     * @param aasEnvironment the AAS environment to serialize
     * @return the JSON node representation
     * @throws IllegalArgumentException
     */
    public JsonNode toNode(Environment aasEnvironment) {
        return toNode((Object)aasEnvironment);
    }

    /**
     * Serializes a given AAS environment to an output stream using given charset
     *
     * @param out the output stream to serialize to
     * @param aasEnvironment the AAS environment to serialize
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Environment aasEnvironment) throws SerializationException {
        write(out, DEFAULT_CHARSET, (Object)aasEnvironment);
    }

    /**
     * Serializes a given AAS environment to an output stream using given charset
     *
     * @param out the output stream to serialize to
     * @param charset the charset to use for serialization
     * @param aasEnvironment the AAS environment to serialize
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Charset charset, Environment aasEnvironment) throws SerializationException {
        write(out, charset, (Object)aasEnvironment);
    }

    /**
     * Serializes a given instance of AAS environment to a java.io.File using DEFAULT_CHARSET
     *
     * @param file the java.io.File to serialize to
     * @param charset the Charset to use for serialization
     * @param aasEnvironment the AAS environment to serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws SerializationException if serialization fails
     */
    void write(File file, Charset charset, Environment aasEnvironment)
        throws FileNotFoundException, SerializationException {
        write(new FileOutputStream(file), charset, aasEnvironment);
    }

    /**
     * Serializes a given instance of Environment to a java.io.File using given charset
     *
     * @param file the java.io.File to serialize to
     * @param aasEnvironment the Environment to serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws SerializationException if serialization fails
     */
    void write(File file, Environment aasEnvironment)
        throws FileNotFoundException, SerializationException {
        write(file, DEFAULT_CHARSET, aasEnvironment);
    }

    /**
     * Serializes a given instance of a Referable to string
     *
     * @param referable the referable to serialize
     * @return the string representation of the referable
     * @throws SerializationException if serialization fails
     */
    public String write(Referable referable) throws SerializationException {
        return write((Object)referable);
    }

    /**
     * Converts a given instance of a Referable to a JSON node.
     *
     * @param referable the referable to serialize
     * @return the JSON node representation of the referable
     */
    public JsonNode toNode(Referable referable) {
        return toNode((Object)referable);
    }

    /**
     * Serializes a given collection of referables to string
     * @param referables the collection of referables to serialize
     * @return the string representation of the collection
     * @throws SerializationException if serialization fails
     */
    public String write(Collection<? extends Referable> referables) throws SerializationException {
        return writeList(referables);
    }

    /**
     * Converts a collection of referables to a JSON node.
     * @param referables the referables to serialize
     * @return the string representation of the list of referables
     */
    public JsonNode toNode(Collection<? extends Referable> referables) {
        return toNode((Object)referables);
    }

    /**
     * Serializes a referable to string.
     * @param referable the referable to serialize.
     * @return the string representation.
     * @throws SerializationException
     */
    public String writeReferable(Referable referable) throws SerializationException {
        return write(referable);
    }

    /**
     * Serializes a collection of referables
     * @param referables the collection to serialize
     * @return the string representation.
     * @throws SerializationException
     */
    public String writeReferables(List<Referable> referables) throws SerializationException {
        return write(referables);
    }

    /**
     * Generic method to serialize a given object to a string
     *
     * @param aasInstance the object to serialize
     * @return the string representation
     * @throws SerializationException if serialization fails
     */
    public String write(Object aasInstance) throws SerializationException {
        try {
            return mapper.writeValueAsString(aasInstance);
        } catch (JsonProcessingException ex) {
            throw new SerializationException(
                    String.format("error serializing %s", aasInstance.getClass().getSimpleName()), ex);
        }
    }

    /**
     * Generic method to convert a given object to a JSON node
     *
     * @param aasInstance the object to serialize
     * @return the JSON node representation
     * @throws IllegalArgumentException
     */
    public JsonNode toNode(Object aasInstance) {
        return mapper.valueToTree(aasInstance);
    }

    /**
     * Generic method to serialize a given object to an output stream using given charset
     *
     * @param out the output stream to serialize to
     * @param charset the charset to use for serialization
     * @param aasInstance the object to serialize
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Charset charset, Object aasInstance) throws SerializationException {
        try {
            mapper.writeValue(new OutputStreamWriter(out, charset), aasInstance);
        } catch (IOException ex) {
            throw new SerializationException("error serializing " + aasInstance.getClass().getSimpleName() , ex);
        }
    }

    /**
     * Generic method to serialize a collection.
     * @param collection the collection to serialize
     * @return the string representation of the collection.
     * @throws SerializationException if serialization fails
     */
    public String writeList(Collection<?> collection) throws SerializationException {
        if (collection == null || collection.isEmpty()) {
            try {
                return mapper.writeValueAsString(collection);
            } catch (JsonProcessingException e) {
                throw new SerializationException("error serializing list");
            }
        }

        Class clazz = collection.iterator().next().getClass();
        try {
            return mapper.writerFor(mapper.getTypeFactory().constructCollectionType(List.class, clazz))
                .writeValueAsString(collection);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing list of " + clazz.getSimpleName(), ex);
        }
    }
}