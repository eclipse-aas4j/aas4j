/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

import java.io.IOException;
import java.util.Collection;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

public class JsonReferableSerializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonReferableSerializerTest.class);

    @Test
    public void testSerializeAAS() throws IOException, SerializationException, JSONException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL);
    }

    @Test
    public void testSerializeWithAssetInformation() throws SerializationException, JSONException, IOException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_WITH_ASSET_INFORMATION);
    }

    @Test
    public void testSerializeAASs() throws IOException, SerializationException, JSONException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF);
    }

    @Test
    public void testSerializeConceptDescriptionWithPhysicalUnit() throws IOException, SerializationException, JSONException {
        compare(Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT);
    }

    @Test
    public void testSerializeSubmodel() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL);
    }

    @Test
    public void testSerializeSubmodelList() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL_ELEMENT_LIST_OF);
    }

    @Test
    public void testSerializeSubmodelElement() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL_ELEMENT);
    }

    @Test
    public void testSerializeSubmodelElements() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL_ELEMENT_LIST_OF);
    }

    @Test
    public void testSerializeSubmodelElementCollection() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL_ELEMENT_COLLECTION);
    }

    @Test
    public void testSerializeSubmodelElementList() throws IOException, SerializationException, JSONException {
        compare(Examples.SUBMODEL_ELEMENT_LIST);
    }

    @Test
    public void testSerializeSubmodelElementListEmpty() throws SerializationException, JSONException, IOException {
        compare(Examples.SUBMODEL_ELEMENT_LIST_EMPTY);
    }

    private void compare(ExampleData exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual = null;
        if (Environment.class.isAssignableFrom(exampleData.getModel().getClass())) {
            actual = new JsonSerializer().write((Environment) exampleData.getModel());
        } else if (Referable.class.isAssignableFrom(exampleData.getModel().getClass())) {
            actual = new JsonSerializer().write((Referable) exampleData.getModel());
        } else if (Collection.class.isAssignableFrom(exampleData.getModel().getClass())
                && ((Collection) exampleData.getModel()).stream().allMatch(x -> x != null && Referable.class.isAssignableFrom(x.getClass()))) {
            actual = new JsonSerializer().write((Collection<Referable>) exampleData.getModel());
        }
        logger.info(actual);
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }

}
