/*
 * Copyright (c) SAP SE 2022
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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;

import java.util.List;

/**
 * Serializer Interface for serialization of any AAS metamodel class
 */
public interface GenericAasDeserializer {

    /**
     * Deserializes a given JSON String of an arbitrary AAS element
     *
     * @param aas_element the AAS-conform JSON object to deserialize
     * @param outputClass the expected class of the aas_element
     * @return the default implementation of the AAS-conform element class
     * @throws DeserializationException if the deserialization fails
     */
    <T> T read(String aas_element, Class<T> outputClass) throws DeserializationException ;


    /**
     * Deserializes a given JSON array to a list of AAS element
     *
     * @param aas_array the AAS-conform JSON array to deserialize
     * @param outputClass the expected type of the aas_array elements
     * @return a list of the default implementations of the aas_array elements
     * @param <T> type of the returned element
     * @throws DeserializationException
     */
    <T> List<T> readList(String aas_array, Class<T> outputClass) throws DeserializationException ;
}
