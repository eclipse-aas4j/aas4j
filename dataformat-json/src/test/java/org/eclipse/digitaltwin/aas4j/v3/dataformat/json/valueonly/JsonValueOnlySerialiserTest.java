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
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Ignore // @TODO: activate again
public class JsonValueOnlySerialiserTest {
    private static final JsonValueOnlySerialiser serialiser = new JsonValueOnlySerialiser(true);


    @Test
    public void testSerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.SUBMODEL);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeEntity() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.ENTITY);
        String expected = readValueOnlyFile("entity.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeProperty() throws ValueOnlySerializationException, IOException, JSONException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_INT);
        String expected = readValueOnlyFile("property_int.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeRange() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.RANGE_DOUBLE);
        String expected = readValueOnlyFile("range.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeBlob() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.BLOB);
        String expected = readValueOnlyFile("blob.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeFile() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.FILE);
        String expected = readValueOnlyFile("file.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeMultiLangProperty() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.MULTI_LANGUAGE_PROPERTY);
        String expected = readValueOnlyFile("multi_lang_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDouble() throws ValueOnlySerializationException, JSONException, IOException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DOUBLE);
        String expected = readValueOnlyFile("property_double.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDatetime() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DATETIME);
        String expected = readValueOnlyFile("date_time_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeRefElementGlobal() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.REFERENCE_ELEMENT_GLOBAL);
        String expected = readValueOnlyFile("ref_element_global.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeAnnotatedRelationshipElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
        String expected = readValueOnlyFile("ann_relationship_element.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeCollectionElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_COLLECTION);
        String expected = readValueOnlyFile("element_collection.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
        // failing
    }

    @Test
    public void testSerializeListElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_LIST);
        String expected = readValueOnlyFile("element_list.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }


    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }
}