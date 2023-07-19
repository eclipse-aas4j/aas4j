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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ValueOnlyMapperTest {
    private static ValueOnlyMapper serializer = new ValueOnlyMapper(true);

    @Test
    public void testCreateDefaultSerializer() throws IOException {
        assertNotNull(new ValueOnlyMapper());
    }

    @Test
    public void testSerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.SUBMODEL);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeEntity() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.ENTITY);
        String expected = readValueOnlyFile("entity.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeProperty() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.PROPERTY_INT);
        assertEquals("42", valueOnlySubmodelString);
    }

    @Test
    public void testSerializeRange() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.RANGE_DOUBLE);
        String expected = readValueOnlyFile("range.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeBlob() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.BLOB);
        String expected = readValueOnlyFile("blob.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeFile() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.FILE);
        String expected = readValueOnlyFile("file.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeMultiLangProperty() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.MULTI_LANGUAGE_PROPERTY);
        String expected = readValueOnlyFile("multi_lang_property.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDouble() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.PROPERTY_DOUBLE);
        JSONAssert.assertEquals("42.17", valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDatetime() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.PROPERTY_DATETIME);
        String expected = readValueOnlyFile("date_time_property.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeRefElementGlobal() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.REFERENCE_ELEMENT_GLOBAL);
        String expected = readValueOnlyFile("ref_element_global.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeAnnotatedRelationshipElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
        String expected = readValueOnlyFile("ann_relationship_element.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeCollectionElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.ELEMENT_COLLECTION);
        String expected = readValueOnlyFile("element_collection.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeListElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.ELEMENT_LIST);
        String expected = readValueOnlyFile("element_list.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }
}
