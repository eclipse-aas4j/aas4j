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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class JsonReferenceSerializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonReferenceSerializerTest.class);

    @Test
    public void testSerializeReference() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();
        Reference reference = AASFull.ENVIRONMENT.getSubmodels().get(0).getSemanticId();
        String serializedReference = serializer.write(reference);
        assertTrue(serializedReference.contains("\"http://acplt.org/SubmodelTemplates/AssetIdentification\""));
    }

    @Test
    public void testSerializeReferenceList() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();
        List<Reference> referenceList = AASFull.ENVIRONMENT.getAssetAdministrationShells().get(0).getSubmodels();
        String serializedReferenceArray = serializer.write(referenceList);
        assertTrue(serializedReferenceArray.contains("\"https://acplt.org/Test_Submodel\""));
    }
}
