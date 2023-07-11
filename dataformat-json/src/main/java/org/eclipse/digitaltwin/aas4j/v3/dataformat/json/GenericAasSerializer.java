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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import java.util.List;

/**
 * Serializer Interface for serialization of any AAS metamodel class
 */
public interface GenericAasSerializer {

    /**
     * Serializes a given instance of an aas element to string
     *
     * @param aas_element the AAS-conform element to serialize
     * @return the string representation of the AAS-conform element
     * @throws SerializationException if serialization fails
     */
    <T> String write(T aas_element) throws SerializationException;


    /**
     * Serializes a list of aas elements to string
     *
     * @param aas_elements a list of AAS-conform elements to serialize
     * @param <T> the type of the AAS elements
     * @return a serialised JSON array as a string
     * @throws SerializationException if serialization fails
     */
    <T> String writeList(List<? extends T> aas_elements, Class<T> outputClass) throws SerializationException;


}
