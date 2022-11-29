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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import org.eclipse.digitaltwin.aas4j.v3.model.Environment;

/**
 * Generic deserializer interface to deserialize a given string, Outputstream or
 * java.io.File into an instance of AssetAdministrationShellEnvironment
 */
public interface Deserializer {

    /**
     * Default charset that will be used when no charset is specified
     */
    Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    /**
     * Deserializes a given string into an instance of
     * AssetAdministrationShellEnvironment
     *
     * @param value a string representation of the
     * AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    Environment read(String value) throws DeserializationException;

    /**
     * Deserializes a given InputStream into an instance of
     * AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param src an InputStream containing the string representation of the
     * AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    default Environment read(InputStream src) throws DeserializationException {
        return read(src, DEFAULT_CHARSET);
    }

    /**
     * Deserializes a given InputStream into an instance of
     * AssetAdministrationShellEnvironment using a given charset
     *
     * @param src An InputStream containing the string representation of the
     * AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    default Environment read(InputStream src, Charset charset) throws DeserializationException {
        return read(new BufferedReader(
                new InputStreamReader(src, charset))
                .lines()
                .collect(Collectors.joining(System.lineSeparator())));
    }

    /**
     * Deserializes a given File into an instance of
     * AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param file A java.io.File containing the string representation of the
     * AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if file is not present
     * @throws DeserializationException if deserialization fails
     */
    default Environment read(java.io.File file, Charset charset)
            throws FileNotFoundException, DeserializationException {
        return read(new FileInputStream(file), charset);
    }

    /**
     * Deserializes a given File into an instance of
     * AssetAdministrationShellEnvironment using a given charset
     *
     * @param file a java.io.File containing the string representation of the
     * AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if the file is not present
     * @throws DeserializationException if deserialization fails
     */
    default Environment read(java.io.File file) throws FileNotFoundException, DeserializationException {
        return read(file, DEFAULT_CHARSET);
    }

    /**
     * Enables usage of custom implementation to be used for deserialization
     * instead of default implementation, e.g. defining a custom implementation
     * of the Submodel interface {@code class
     * CustomSubmodel implements Submodel {}} and calling
     * {@code useImplementation(Submodel.class, CustomSubmodel.class);} will
     * result in all instances of Submodel will be deserialized as
     * CustomSubmodel. Subsequent class with the same aasInterface parameter
     * will override the effects of all previous calls.
     *
     * @param <T> the type of the interface to replace
     * @param aasInterface the class of the interface to replace
     * @param implementation the class implementing the interface that should be
     * used for deserialization.
     */
    <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation);

}
