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
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ValueOnlyMapperTest {
    private static ValueOnlyMapper serializer = new ValueOnlyMapper(true);

    @Test
    public void test01_CreateDefaultSerializer() throws IOException {
        assertNotNull(new ValueOnlyMapper());
    }

    @Test
    public void test02_SerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.SUBMODEL);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test03_SerializeEntity() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.ENTITY);
        String expected = readValueOnlyFile("entity.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test04_SerializeProperty() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_INT);
        assertEquals("42", valueOnly);
    }

    @Test
    public void test05_SerializeRange() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.RANGE_DOUBLE);
        String expected = readValueOnlyFile("range.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test06_SerializeBlob() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.BLOB);
        String expected = readValueOnlyFile("blob.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test07_SerializeFile() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.FILE);
        String expected = readValueOnlyFile("file.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test08_SerializeMultiLangProperty() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.MULTI_LANGUAGE_PROPERTY);
        String expected = readValueOnlyFile("multi_lang_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test09_SerializePropertyDouble() throws ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_DOUBLE);
        JSONAssert.assertEquals("42.17", valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test10_SerializePropertyDatetime() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_DATETIME);
        String expected = readValueOnlyFile("date_time_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test11_SerializeRefElementGlobal() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.REFERENCE_ELEMENT_GLOBAL);
        String expected = readValueOnlyFile("ref_element_global.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test12_SerializeAnnotatedRelationshipElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
        String expected = readValueOnlyFile("ann_relationship_element.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test13_SerializeCollectionElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.ELEMENT_COLLECTION);
        String expected = readValueOnlyFile("element_collection.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test14_SerializeListElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = serializer.toValueOnly(TestData.ELEMENT_LIST);
        String expected = readValueOnlyFile("element_list.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void test15_UpdateSubmodel() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.SUBMODEL_UPDATED);
        serializer.update(TestData.SUBMODEL, valueOnly);
        assertEquals(TestData.SUBMODEL_UPDATED, TestData.SUBMODEL);
    }

    @Test
    public void test16_UpdateEntity() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.ENTITY_UPDATED);
        serializer.update(TestData.ENTITY, valueOnly);
        assertEquals(TestData.ENTITY_UPDATED, TestData.ENTITY);
    }

    @Test
    public void test17_UpdateProperty() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_INT_UPDATED);
        serializer.update(TestData.PROPERTY_INT, valueOnly);
        assertEquals(TestData.PROPERTY_INT_UPDATED, TestData.PROPERTY_INT);
    }

    @Test
    public void test18_UpdateRange() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.RANGE_DOUBLE_UPDATED);
        serializer.update(TestData.RANGE_DOUBLE, valueOnly);
        assertEquals(TestData.RANGE_DOUBLE_UPDATED, TestData.RANGE_DOUBLE);
    }

    @Test
    public void test19_UpdateBlob() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.BLOB_UPDATED);
        serializer.update(TestData.BLOB, valueOnly);
        assertEquals(TestData.BLOB_UPDATED, TestData.BLOB);
    }

    @Test
    public void test20_UpdateFile() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.FILE_UPDATED);
        serializer.update(TestData.FILE, valueOnly);
        assertEquals(TestData.FILE_UPDATED, TestData.FILE);
    }

    @Test
    public void test21_UpdateMultiLangProperty() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED);
        serializer.update(TestData.MULTI_LANGUAGE_PROPERTY, valueOnly);
        assertEquals(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED, TestData.MULTI_LANGUAGE_PROPERTY);
    }

    @Test
    public void test22_UpdatePropertyDouble() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_DOUBLE_UPDATED);
        serializer.update(TestData.PROPERTY_DOUBLE, valueOnly);
        assertEquals(TestData.PROPERTY_DOUBLE_UPDATED, TestData.PROPERTY_DOUBLE);
    }

    @Test
    public void test23_UpdatePropertyDatetime() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.PROPERTY_DATETIME_UPDATED);
        serializer.update(TestData.PROPERTY_DATETIME, valueOnly);
        assertEquals(TestData.PROPERTY_DATETIME_UPDATED, TestData.PROPERTY_DATETIME);
    }

    @Test
    public void test24_UpdateRefElementGlobal() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED);
        serializer.update(TestData.REFERENCE_ELEMENT_GLOBAL, valueOnly);
        assertEquals(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED, TestData.REFERENCE_ELEMENT_GLOBAL);
    }

    @Test
    public void test25_UpdateAnnotatedRelationshipElement() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED);
        serializer.update(TestData.ANNOTATED_RELATIONSHIP_ELEMENT, valueOnly);
        assertEquals(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED, TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
    }

    @Test
    public void test26_UpdateCollectionElement() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.ELEMENT_COLLECTION_UPDATED);
        serializer.update(TestData.ELEMENT_COLLECTION, valueOnly);
        assertEquals(TestData.ELEMENT_COLLECTION_UPDATED, TestData.ELEMENT_COLLECTION);
    }

    @Test
    public void test27_UpdateListElement() throws ValueOnlySerializationException {
        String valueOnly = serializer.toValueOnly(TestData.ELEMENT_LIST_UPDATED);
        serializer.update(TestData.ELEMENT_LIST, valueOnly);
        assertEquals(TestData.ELEMENT_LIST_UPDATED, TestData.ELEMENT_LIST);
    }

    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }
}