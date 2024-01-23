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
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class JsonSpecificAssetIdDeserializerTest {
    private String specificAssetId_string;
    private String specificAssetId_list_string;


    @Before
    public void prepare() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();

        SpecificAssetId specificAssetId = new DefaultSpecificAssetId.Builder()
                .name("testSpecificAssetId")
                .value("testValue")
                .build();
        List<SpecificAssetId> specificAssetIds = new ArrayList<>() {{
            add(specificAssetId);
            add(specificAssetId);
        }};

        specificAssetId_string = serializer.write(specificAssetId);
        specificAssetId_list_string = serializer.writeList(specificAssetIds);
    }


    @Test
    public void testDeserializeReference() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();
        SpecificAssetId specificAssetId = deserializer.read(specificAssetId_string, SpecificAssetId.class);
        assertTrue(!specificAssetId.getValue().isEmpty());
    }


    @Test
    public void testDeserializeReferenceList() throws DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();
        List<SpecificAssetId> specificAssetIdList = deserializer.readList(
            specificAssetId_list_string, SpecificAssetId.class);
        assertTrue(specificAssetIdList.get(0).getValue().equalsIgnoreCase("testvalue"));
    }
}
