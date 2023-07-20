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
    private static ValueOnlyMapper valueOnlyMapper = new ValueOnlyMapper(true);

    @Test
    public void testCreateDefaultMapper() throws IOException {
        assertNotNull(new ValueOnlyMapper());
    }

    @Test
    public void testSerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.SUBMODEL);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeEntity() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ENTITY);
        String expected = readValueOnlyFile("entity.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeProperty() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_INT);
        assertEquals("42", valueOnly);
    }

    @Test
    public void testSerializeRange() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.RANGE_DOUBLE);
        String expected = readValueOnlyFile("range.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeBlob() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.BLOB);
        String expected = readValueOnlyFile("blob.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeFile() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.FILE);
        String expected = readValueOnlyFile("file.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeMultiLangProperty() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.MULTI_LANGUAGE_PROPERTY);
        String expected = readValueOnlyFile("multi_lang_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDouble() throws ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_DOUBLE);
        JSONAssert.assertEquals("42.17", valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializePropertyDatetime() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_DATETIME);
        String expected = readValueOnlyFile("date_time_property.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeRefElementGlobal() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.REFERENCE_ELEMENT_GLOBAL);
        String expected = readValueOnlyFile("ref_element_global.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeAnnotatedRelationshipElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
        String expected = readValueOnlyFile("ann_relationship_element.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeCollectionElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ELEMENT_COLLECTION);
        String expected = readValueOnlyFile("element_collection.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testSerializeListElement() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ELEMENT_LIST);
        String expected = readValueOnlyFile("element_list.json");
        JSONAssert.assertEquals(expected, valueOnly, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateSubmodel() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.SUBMODEL_UPDATED);
        valueOnlyMapper.update(TestData.SUBMODEL, valueOnly);
        assertEquals(TestData.SUBMODEL_UPDATED, TestData.SUBMODEL);
    }

    @Test
    public void testUpdateEntity() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ENTITY_UPDATED);
        valueOnlyMapper.update(TestData.ENTITY, valueOnly);
        assertEquals(TestData.ENTITY_UPDATED, TestData.ENTITY);
    }

    @Test
    public void testUpdateProperty() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_INT_UPDATED);
        valueOnlyMapper.update(TestData.PROPERTY_INT, valueOnly);
        assertEquals(TestData.PROPERTY_INT_UPDATED, TestData.PROPERTY_INT);
    }

    @Test
    public void testUpdateRange() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.RANGE_DOUBLE_UPDATED);
        valueOnlyMapper.update(TestData.RANGE_DOUBLE, valueOnly);
        assertEquals(TestData.RANGE_DOUBLE_UPDATED, TestData.RANGE_DOUBLE);
    }

    @Test
    public void testUpdateBlob() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.BLOB_UPDATED);
        valueOnlyMapper.update(TestData.BLOB, valueOnly);
        assertEquals(TestData.BLOB_UPDATED, TestData.BLOB);
    }

    @Test
    public void testUpdateFile() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.FILE_UPDATED);
        valueOnlyMapper.update(TestData.FILE, valueOnly);
        assertEquals(TestData.FILE_UPDATED, TestData.FILE);
    }

    @Test
    public void testUpdateMultiLangProperty() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED);
        valueOnlyMapper.update(TestData.MULTI_LANGUAGE_PROPERTY, valueOnly);
        assertEquals(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED, TestData.MULTI_LANGUAGE_PROPERTY);
    }

    @Test
    public void testUpdatePropertyDouble() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_DOUBLE_UPDATED);
        valueOnlyMapper.update(TestData.PROPERTY_DOUBLE, valueOnly);
        assertEquals(TestData.PROPERTY_DOUBLE_UPDATED, TestData.PROPERTY_DOUBLE);
    }

    @Test
    public void testUpdatePropertyDatetime() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.PROPERTY_DATETIME_UPDATED);
        valueOnlyMapper.update(TestData.PROPERTY_DATETIME, valueOnly);
        assertEquals(TestData.PROPERTY_DATETIME_UPDATED, TestData.PROPERTY_DATETIME);
    }

    @Test
    public void testUpdateRefElementGlobal() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED);
        valueOnlyMapper.update(TestData.REFERENCE_ELEMENT_GLOBAL, valueOnly);
        assertEquals(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED, TestData.REFERENCE_ELEMENT_GLOBAL);
    }

    @Test
    public void testUpdateAnnotatedRelationshipElement() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED);
        valueOnlyMapper.update(TestData.ANNOTATED_RELATIONSHIP_ELEMENT, valueOnly);
        assertEquals(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED, TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
    }

    @Test
    public void testUpdateCollectionElement() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ELEMENT_COLLECTION_UPDATED);
        valueOnlyMapper.update(TestData.ELEMENT_COLLECTION, valueOnly);
        assertEquals(TestData.ELEMENT_COLLECTION_UPDATED, TestData.ELEMENT_COLLECTION);
    }

    @Test
    public void testUpdateListElement() throws ValueOnlySerializationException {
        String valueOnly = valueOnlyMapper.toValueOnly(TestData.ELEMENT_LIST_UPDATED);
        valueOnlyMapper.update(TestData.ELEMENT_LIST, valueOnly);
        assertEquals(TestData.ELEMENT_LIST_UPDATED, TestData.ELEMENT_LIST);
    }

    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }
}