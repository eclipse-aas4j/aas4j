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
package org.eclipse.digitaltwin.aas4j.v3.dataformat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.eclipse.digitaltwin.aas4j.v3.model.Environment;

/**
 * Generic serializer interface to serialize an instance of
 * AssetAdministrationShellEnvironment to a string, Outputstream or java.io.File
 */
public interface Serializer {

    /**
     * Default charset that will be used when no charset is specified
     */
    Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    /**
     * Serializes a given instance of AssetAdministrationShellEnvironment to
     * string
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to
     * serialize
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    String write(Environment aasEnvironment) throws SerializationException;

    /**
     * Serializes a given instance of Environment to an
     * OutputStream using DEFAULT_CHARSET
     *
     * @param out the Outputstream to serialize to
     * @param aasEnvironment the Environment to
     * serialize
     * @throws IOException if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    default void write(OutputStream out, Environment aasEnvironment) throws IOException, SerializationException {
        write(out, DEFAULT_CHARSET, aasEnvironment);
    }

    /**
     * Serializes a given instance of Environment to an
     * OutputStream using given charset
     *
     * @param out the Outputstream to serialize to
     * @param charset the Charset to use for serialization
     * @param aasEnvironment the Environment to
     * serialize
     * @throws IOException if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    default void write(OutputStream out, Charset charset, Environment aasEnvironment)
            throws IOException, SerializationException {
        try (OutputStreamWriter writer = new OutputStreamWriter(out, charset)) {
            writer.write(write(aasEnvironment));
        }
    }

    // Note that the AAS also defines a file class
    /**
     * Serializes a given instance of Environment to a
     * java.io.File using DEFAULT_CHARSET
     *
     * @param file the java.io.File to serialize to
     * @param charset the Charset to use for serialization
     * @param aasEnvironment the Environment to
     * serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws IOException if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    default void write(java.io.File file, Charset charset, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
        try (OutputStream out = new FileOutputStream(file)) {
            write(out, charset, aasEnvironment);
        }
    }

    /**
     * Serializes a given instance of Environment to a
     * java.io.File using given charset
     *
     * @param file the java.io.File to serialize to
     * @param aasEnvironment the Environment to
     * serialize
     * @throws FileNotFoundException if the fail does not exist
     * @throws IOException if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    default void write(java.io.File file, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
        write(file, DEFAULT_CHARSET, aasEnvironment);
    }

}
