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


import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
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
        Submodel actual = TestData.SUBMODEL.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.SUBMODEL_UPDATED, actual);
    }

    @Test
    public void testUpdateEntity() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ENTITY_UPDATED);
        Entity actual = TestData.ENTITY.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.ENTITY_UPDATED, actual);
    }

    @Test
    public void testUpdateProperty() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_INT_UPDATED);
        Property actual = TestData.PROPERTY_INT.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.PROPERTY_INT_UPDATED, actual);
    }

    @Test
    public void testUpdateRange() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.RANGE_DOUBLE_UPDATED);
        Range actual = TestData.RANGE_DOUBLE.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.RANGE_DOUBLE_UPDATED, actual);
    }

    @Test
    public void testUpdateBlob() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.BLOB_UPDATED);
        Blob actual = TestData.BLOB.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.BLOB_UPDATED, actual);
    }

    @Test
    public void testUpdateFile() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.FILE_UPDATED);
        File actual = TestData.FILE.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.FILE_UPDATED, actual);
    }

    @Test
    public void testUpdateMultiLangProperty() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED);
        MultiLanguageProperty actual = TestData.MULTI_LANGUAGE_PROPERTY.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.MULTI_LANGUAGE_PROPERTY_UPDATED, actual);
    }

    @Test
    public void testUpdatePropertyDouble() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DOUBLE_UPDATED);
        Property actual = TestData.PROPERTY_DOUBLE.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.PROPERTY_DOUBLE_UPDATED, actual);
    }

    @Test
    public void testUpdatePropertyDatetime() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_DATETIME_UPDATED);
        Property actual = TestData.PROPERTY_DATETIME.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.PROPERTY_DATETIME_UPDATED, actual);
    }

    @Test
    public void testUpdatePropertyString() {
        String valueOnly = serialiser.serialise(TestData.PROPERTY_STRING_UPDATED);
        Property actual = TestData.PROPERTY_STRING.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.PROPERTY_STRING_UPDATED, actual);
    }

    @Test
    public void testUpdateRefElementGlobal() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED);
        ReferenceElement actual = TestData.REFERENCE_ELEMENT_GLOBAL.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.REFERENCE_ELEMENT_GLOBAL_UPDATED, actual);
    }

    @Test
    public void testUpdateAnnotatedRelationshipElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED);
        AnnotatedRelationshipElement actual = TestData.ANNOTATED_RELATIONSHIP_ELEMENT.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED, actual);
    }

    @Test
    public void testUpdateCollectionElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_COLLECTION_UPDATED);
        SubmodelElementCollection actual = TestData.ELEMENT_COLLECTION.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.ELEMENT_COLLECTION_UPDATED, actual);
    }

    @Test
    public void testUpdateListElement() throws ValueOnlySerializationException {
        String valueOnly = serialiser.serialise(TestData.ELEMENT_LIST_UPDATED);
        SubmodelElementList actual = TestData.ELEMENT_LIST.get();
        deserialiser.deserialise(actual, valueOnly);
        assertEquals(TestData.ELEMENT_LIST_UPDATED, actual);
    }

}