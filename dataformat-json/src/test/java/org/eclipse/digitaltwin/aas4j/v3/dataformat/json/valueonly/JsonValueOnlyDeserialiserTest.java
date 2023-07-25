/*
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


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JsonValueOnlyDeserialiserTest {

    private static final JsonValueOnlyDeserialiser deserialiser = new JsonValueOnlyDeserialiser();
    private static final JsonValueOnlySerialiser serialiser = new JsonValueOnlySerialiser();

    @Test
    public void testUpdateSubmodel() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.SUBMODEL_UPDATED);
        deserialiser.deserialise(TestData.SUBMODEL, valueOnly);
        assertEquals(TestData.SUBMODEL_UPDATED, TestData.SUBMODEL);
    }

    @Test
    public void testUpdateEntity() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ENTITY_UPDATED);
        deserialiser.deserialise(TestData.ENTITY, valueOnly);
        assertEquals(TestData.ENTITY_UPDATED, TestData.ENTITY);
    }

    @Test
    public void testUpdateProperty() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_INT_UPDATED);
        deserialiser.deserialise(TestData.PROPERTY_INT, valueOnly);
        assertEquals(TestData.PROPERTY_INT_UPDATED, TestData.PROPERTY_INT);
    }

    @Test
    public void testUpdateRange() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.RANGE_DOUBLE_UPDATED);
        deserialiser.deserialise(TestData.RANGE_DOUBLE, valueOnly);
        assertEquals(TestData.RANGE_DOUBLE_UPDATED, TestData.RANGE_DOUBLE);
    }

    @Test
    public void testUpdateBlob() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.BLOB_UPDATED);
        deserialiser.deserialise(TestData.BLOB, valueOnly);
        assertEquals(TestData.BLOB_UPDATED, TestData.BLOB);
    }

    @Test
    public void testUpdateFile() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.FILE_UPDATED);
        deserialiser.deserialise(TestData.FILE, valueOnly);
        assertEquals(TestData.FILE_UPDATED, TestData.FILE);
    }

    @Test
    public void testUpdateMultiLangProperty() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED);
        deserialiser.deserialise(TestData.MULTI_LANGUAGE_PROPERTY, valueOnly);
        assertEquals(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED, TestData.MULTI_LANGUAGE_PROPERTY);
    }

    @Test
    public void testUpdatePropertyDouble() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DOUBLE_UPDATED);
        deserialiser.deserialise(TestData.PROPERTY_DOUBLE, valueOnly);
        assertEquals(TestData.PROPERTY_DOUBLE_UPDATED, TestData.PROPERTY_DOUBLE);
    }

    @Test
    public void testUpdatePropertyDatetime() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DATETIME_UPDATED);
        deserialiser.deserialise(TestData.PROPERTY_DATETIME, valueOnly);
        assertEquals(TestData.PROPERTY_DATETIME_UPDATED, TestData.PROPERTY_DATETIME);
    }

    @Test
    public void testUpdateRefElementGlobal() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED);
        deserialiser.deserialise(TestData.REFERENCE_ELEMENT_GLOBAL, valueOnly);
        assertEquals(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED, TestData.REFERENCE_ELEMENT_GLOBAL);
    }

    @Test
    public void testUpdateAnnotatedRelationshipElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED);
        deserialiser.deserialise(TestData.ANNOTATED_RELATIONSHIP_ELEMENT, valueOnly);
        assertEquals(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED, TestData.ANNOTATED_RELATIONSHIP_ELEMENT);
    }

    @Test
    public void testUpdateCollectionElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_COLLECTION_UPDATED);
        deserialiser.deserialise(TestData.ELEMENT_COLLECTION, valueOnly);
        assertEquals(TestData.ELEMENT_COLLECTION_UPDATED, TestData.ELEMENT_COLLECTION);
    }

    @Test
    public void testUpdateListElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_LIST_UPDATED);
        deserialiser.deserialise(TestData.ELEMENT_LIST, valueOnly);
        assertEquals(TestData.ELEMENT_LIST_UPDATED, TestData.ELEMENT_LIST);
    }

}