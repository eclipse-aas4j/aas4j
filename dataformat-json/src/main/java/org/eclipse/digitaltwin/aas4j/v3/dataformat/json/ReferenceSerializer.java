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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.util.List;

/**
 * Serializer Interface for serialization of referables
 */
public interface ReferenceSerializer {

    /**
     * Serializes a given instance of a Referable to string
     *
     * @param reference the Reference to serialize
     * @return the string representation of the reference
     * @throws SerializationException if serialization fails
     */
    String writeReference(Reference reference) throws SerializationException;

    /**
     *
     * @param references the references to serialize
     * @return the string representation of the list of references
     * @throws SerializationException if serialization fails
     */
    String writeReferences(List<Reference> references) throws SerializationException;

}
