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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;

public class ValueOnlyJsonSerializerTest {
    private static ValueOnlyJsonSerializer serializer = new ValueOnlyJsonSerializer(true);

    @Test
    public void testCreateDefaultSerializer() throws IOException {
        assertNotNull(new ValueOnlyJsonSerializer());
    }

    @Test
    public void testSerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.SUBMODEL);
        assertNotNull(valueOnlySubmodelString);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeEntity() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.ENTITY);
        assertNotNull(valueOnlySubmodelString);
        String expected = readValueOnlyFile("entity.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }
}
