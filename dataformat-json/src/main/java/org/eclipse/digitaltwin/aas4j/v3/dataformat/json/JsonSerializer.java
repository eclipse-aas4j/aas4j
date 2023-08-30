/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2022 SAP SE or an SAP affiliate company
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

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *  Class for serializing an instance of AssetAdministrationShellEnvironment or Referables to JSON.
 */
public class JsonSerializer {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    protected final ObjectMapper mapper;

    public JsonSerializer() {
        mapper = ObjectMapperFactory.createMapper();
    }

    /**
     * Serializes a given instance of AssetAdministrationShellEnvironment to string
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to serialize
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    public String write(Environment aasEnvironment) throws SerializationException {
        try {
            return mapper.writeValueAsString(aasEnvironment);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Converts a given instance of AssetAdministrationShellEnvironment as JSON node.
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to serialize
     * @return the JSON node representation of the environment
     */
    public JsonNode toNode(Environment aasEnvironment) {
        return mapper.valueToTree(aasEnvironment);
    }

    /**
     * Serializes a given instance of Environment to an OutputStream using DEFAULT_CHARSET
     *
     * @param out the Outputstream to serialize to
     * @param aasEnvironment the Environment to serialize
     * @throws IOException if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Environment aasEnvironment) throws IOException, SerializationException {
        write(out, DEFAULT_CHARSET, aasEnvironment);
    }

    /**
     * Serializes a given instance of Environment to an OutputStream using given charset
     *
     * @param out the Outputstream to serialize to
     * @param charset the Charset to use for serialization
     * @param aasEnvironment the Environment to serialize
     * @throws IOException if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Charset charset, Environment aasEnvironment)
            throws IOException, SerializationException {
        try (OutputStreamWriter writer = new OutputStreamWriter(out, charset)) {
            writer.write(write(aasEnvironment));
        }
    }

    // Note that the AAS also defines a file class
    /**
     * Serializes a given instance of Environment to a java.io.File using DEFAULT_CHARSET
     *
     * @param file the java.io.File to serialize to
     * @param charset the Charset to use for serialization
     * @param aasEnvironment the Environment to serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws IOException if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    void write(java.io.File file, Charset charset, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
        try (OutputStream out = new FileOutputStream(file)) {
            write(out, charset, aasEnvironment);
        }
    }

    /**
     * Serializes a given instance of Environment to a java.io.File using given charset
     *
     * @param file the java.io.File to serialize to
     * @param aasEnvironment the Environment to serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws IOException if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    void write(java.io.File file, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
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
        try {
            return mapper.writeValueAsString(referable);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("error serializing Referable", ex);
        }
    }

    /**
     * Converts a given instance of a Referable to a JSON node.
     *
     * @param referable the referable to serialize
     * @return the JSON node representation of the referable
     */
    public JsonNode toNode(Referable referable) {
        return mapper.valueToTree(referable);
    }

    /**
     *
     * @param referables the referables to serialize
     * @return the string representation of the list of referables
     * @throws SerializationException if serialization fails
     */
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

    /**
     *
     * @param referables the referables to serialize
     * @return the string representation of the list of referables
     */
    public JsonNode toNode(Collection<? extends Referable> referables) {
        if (referables == null) {
            return null;
        } else if (referables.isEmpty()) {
            return mapper.createArrayNode();
        }
        return mapper.valueToTree(referables);
    }

    public String write(Object aas_element) throws SerializationException {
        try {
            // the new schema (version 3.0.RC02) defines modelType as a string, therefore the ModelTypeProcessor is not needed anymore
            //return mapper.writeValueAsString(ModelTypeProcessor.postprocess(this.mapper.readTree(json)));
            return mapper.writeValueAsString(aas_element);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("Error serializing an aas-element", ex);
        }
    }

}
