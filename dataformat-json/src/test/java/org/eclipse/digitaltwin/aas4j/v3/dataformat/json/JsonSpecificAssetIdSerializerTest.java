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
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class JsonSpecificAssetIdSerializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonSpecificAssetIdSerializerTest.class);

    SpecificAssetId specificAssetId = new DefaultSpecificAssetId.Builder()
            .name("testSpecificAssetId")
            .value("testValue")
            .build();


    @Test
    public void testSerializeSpecificAssetId() throws SerializationException {
        JsonSerializer serializer = new JsonSerializer();

        String specificAssetId_string = serializer.writeSpecificAssetId(specificAssetId);

        assertTrue(specificAssetId_string.contains("\"value\" : \"testValue\""));
    }


    @Test
    public void testSerializeSpecificAssetIdList() throws SerializationException {

        List<SpecificAssetId> specificAssetIds = new ArrayList<SpecificAssetId>() {{
            add(specificAssetId);
            add(specificAssetId);
        }};

        JsonSerializer serializer = new JsonSerializer();

        String specificAssetId_list_string = serializer.writeSpecificAssetIds(specificAssetIds);

        assertTrue(specificAssetId_list_string.startsWith("["));
        assertTrue(specificAssetId_list_string.contains("\"name\" : \"testSpecificAssetId\""));
    }


}
