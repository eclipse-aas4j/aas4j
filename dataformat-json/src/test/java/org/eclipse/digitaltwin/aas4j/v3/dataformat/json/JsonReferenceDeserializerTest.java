/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonReferenceDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonReferenceDeserializerTest.class);

    private String reference_string;
    private String reference_list_string;
    private String valueReferencePair_string;


    @Before
    public void prepare() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();
        reference_string = serializer.writeReference(AASFull.ENVIRONMENT.getSubmodels().get(0).getSemanticId());
        reference_list_string = serializer.writeReferences(AASFull.ENVIRONMENT.getAssetAdministrationShells().get(0).getSubmodels());
//        valueReferencePair_string = serializer.write(((DataSpecificationIec61360) AASFull.ENVIRONMENT.getConceptDescriptions().get(3).getEmbeddedDataSpecifications().get(0).getDataSpecificationContent()).getValueList().getValueReferencePairs().get(0));
    }


    @Test
    public void testDeserializeReference() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();

        Reference reference = deserializer.readReference(reference_string);

        assertTrue(!reference.getKeys().get(0).getValue().isEmpty());
    }

//    @Test
//    public void testValueReferencePair() throws DeserializationException {
//        JsonDeserializer deserializer = new JsonDeserializer();
//
//        ValueReferencePair valueReferencePair = deserializer.read(valueReferencePair_string, ValueReferencePair.class);
//
//        assertTrue(!valueReferencePair.getValue().isEmpty());
//    }

//    @Test
//    @Ignore("No comparison of input string object to expected class implememted yet.")
//    public void testNonAasElement() {
//        JsonDeserializer deserializer = new JsonDeserializer();
//
//        try {
//            ValueReferencePair valueReferencePair = deserializer.read(reference_string, ValueReferencePair.class);
//        } catch (DeserializationException e) {
//            // fine
//        }
//
//        fail("DeserializationException expected");
//    }


    @Test
    public void testDeserializeReferenceList() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();

        List<Reference> referenceList = deserializer.readReferences(reference_list_string);

        assertTrue(referenceList.get(0).getType().equals(ReferenceTypes.EXTERNAL_REFERENCE));
    }


}
