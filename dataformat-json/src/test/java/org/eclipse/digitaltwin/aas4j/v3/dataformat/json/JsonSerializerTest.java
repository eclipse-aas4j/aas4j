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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DefaultDummyDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import com.fasterxml.jackson.databind.JsonNode;

import org.json.JSONException;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JsonSerializerTest {
    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerTest.class);
    private static JsonSerializer serializerToTest;

    @BeforeClass
    public static void initialize() {
        serializerToTest = new JsonSerializer();
    }

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testSerializeNull() throws SerializationException {
        assertEquals("null", serializerToTest.write(null));
    }

    @Test
    public void testSerializeToFile() throws IOException, SerializationException {
        File file = tempFolder.newFile("output.json");
        serializerToTest.write(new FileOutputStream(file), AASSimple.createEnvironment());
        assertTrue(file.exists());
    }

    @Test
    public void testSerializeEmpty() {
        validateAndCompare(Examples.ENVIRONMENT_EMPTY);
    }

    @Test
    public void testSerializeSimpleExample() {
        validateAndCompare(Examples.EXAMPLE_SIMPLE);
    }

    @Test
    public void testSerializeFullExample() {
        validateAndCompare(Examples.EXAMPLE_FULL);
    }

    @Test
    public void testSerializeFullExampleToNode() throws IOException {
        String expected = Examples.EXAMPLE_FULL.fileContent();
        JsonNode node = serializerToTest.toNode(Examples.EXAMPLE_FULL.getModel());
        validateAndCompare(expected, node.toPrettyString());
    }

    @Test
    public void testSerializeEmptyReferableList() throws SerializationException, JSONException {
        List<Referable> emptyList = Collections.emptyList();
        String actual = serializerToTest.write(emptyList);
        JSONAssert.assertEquals("[]", actual, JSONCompareMode.NON_EXTENSIBLE);
    }

    /**
     * This test ensures that future DataSpecificationContents can be added without adjustments in the code.
     *
     * @throws SerializationException
     * @throws DeserializationException
     */
    @Test
    public void testSerializeCustomDataSpecification() {
        // This is the only way to make the serialization to work.
        Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
        subtypes.add(DefaultDummyDataSpecification.class);
        compare(Examples.ENVIRONMENT_CUSTOM_DATA);
    }

    @Test
    public void testSerializeShellDescriptor() {
        compare(Examples.SHELL_DESCRIPTOR);
    }

    @Test
    public void testSerializeShell() {
        compare(Examples.ASSET_ADMINISTRATION_SHELL);
    }

    @Test
    public void testSerializeShellWithAssetInformation() {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_WITH_ASSET_INFORMATION);
    }

    @Test
    public void testSerializeShells() {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF);
    }

    @Test
    @Ignore("Add test after DataSpecficationPhysicalUnit is supported again")
    public void testSerializeConceptDescriptionWithPhysicalUnit() {
        compare(Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT);
    }

    @Test
    public void testSerializeSubmodel() {
        compare(Examples.SUBMODEL);
    }

    @Test
    public void testSerializeSubmodels() {
        compare(Examples.SUBMODEL_LIST_OF);
    }

    @Test
    public void testSerializeSubmodelElement() {
        compare(Examples.SUBMODEL_ELEMENT);
    }

    @Test
    public void testSerializeSubmodelElements() {
        compare(Examples.SUBMODEL_ELEMENT_LIST_OF);
    }

    @Test
    public void testSerializeSubmodelElementCollection() {
        compare(Examples.SUBMODEL_ELEMENT_COLLECTION);
    }

    @Test
    public void testSerializeSubmodelElementList() {
        compare(Examples.SUBMODEL_ELEMENT_LIST);
    }

    @Test
    public void testSerializeSubmodelElementListEmpty() {
        compare(Examples.SUBMODEL_ELEMENT_LIST_EMPTY);
    }

    @Test
    public void testSerializeExtensionMinimal() {
        compare(Examples.EXTENSION_MINIMAL);
    }

    @Test
    public void testSerializeExtensionMaximal() {
        compare(Examples.EXTENSION_MAXIMAL);
    }

    @Test
    public void testSerializeSubmodelDescriptor() {
        compare(Examples.SUBMODEL_DESCRIPTOR);
    }

    @Test
    public void testSerializeOperationRequest() {
        compare(Examples.OPERATION_REQUEST);
    }

    @SuppressWarnings("unchecked")
    private void compare(ExampleData<?> exampleData) {
        try {
            String expected = exampleData.fileContent();
            String actual;
            if (Collection.class.isAssignableFrom(exampleData.getModel().getClass())) {
                actual = serializerToTest.writeList((Collection<?>) exampleData.getModel());
            } else {
                actual = serializerToTest.write(exampleData.getModel());
            }
            JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
            JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
        } catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void validateAndCompare(ExampleData<Environment> exampleData) {
        try {
            String expected = exampleData.fileContent();
            String actual = serializerToTest.write(exampleData.getModel());
            validateAndCompare(expected, actual);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private void validateAndCompare(String expected, String actual) {
        logger.info(actual);
        Set<String> errors = new JsonSchemaValidator().validateSchema(actual);
        assertTrue(errors.isEmpty());
        try {
            JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
            JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
        } catch(JSONException ex) {
            throw new RuntimeException(ex);
        }
    }
}
