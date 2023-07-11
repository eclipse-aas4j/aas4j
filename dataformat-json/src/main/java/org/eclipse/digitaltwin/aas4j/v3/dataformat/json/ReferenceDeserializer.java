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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.util.List;

/**
 * Deserializer Interface for deserialization of referables
 */
public interface ReferenceDeserializer {

     /**
      * Deserializes a given string into an instance of
      * the given Referable
      *
      * @param reference a string representation of the
      * Reference
      * @return an instance of the referable
      * @throws DeserializationException
      */
     Reference readReference(String reference) throws DeserializationException;

     /**
      * Deserializes a given string into an instance of
      * a list of the given Referables
      *
      * @param references a string representation of an
      * array of References
      * @return an instance of a list of the references
      * @throws DeserializationException
      */
     List<Reference> readReferences(String references) throws DeserializationException;

}
