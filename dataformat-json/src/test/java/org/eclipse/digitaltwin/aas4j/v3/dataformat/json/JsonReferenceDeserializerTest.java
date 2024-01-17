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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class JsonReferenceDeserializerTest {
    private String reference_string;
    private String reference_list_string;


    @Before
    public void prepare() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();
        reference_string = serializer.writeReference(AASFull.ENVIRONMENT.getSubmodels().get(0).getSemanticId());
        reference_list_string = serializer.writeReferences(AASFull.ENVIRONMENT.getAssetAdministrationShells().get(0).getSubmodels());
    }

    @Test
    public void testDeserializeReference() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();

        Reference reference = deserializer.readReference(reference_string);

        assertTrue(!reference.getKeys().get(0).getValue().isEmpty());
    }


    @Test
    public void testDeserializeReferenceList() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();

        List<Reference> referenceList = deserializer.readReferences(reference_list_string);

        assertTrue(referenceList.get(0).getType().equals(ReferenceTypes.EXTERNAL_REFERENCE));
    }
}