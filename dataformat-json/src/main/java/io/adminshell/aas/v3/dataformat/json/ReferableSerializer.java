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
package io.adminshell.aas.v3.dataformat.json;

import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.model.Referable;

import java.util.List;

/**
 * Serializer Interface for serialization of referables
 */
public interface ReferableSerializer {

    /**
     * Serializes a given instance of a Referable to string
     *
     * @param referable the referable to serialize
     * @return the string representation of the referable
     * @throws SerializationException if serialization fails
     */
    String write(Referable referable) throws SerializationException;

    /**
     *
     * @param referables the referables to serialize
     * @return the string representation of the list of referables
     * @throws SerializationException if serialization fails
     */
    String write(List<Referable> referables) throws SerializationException;

}
