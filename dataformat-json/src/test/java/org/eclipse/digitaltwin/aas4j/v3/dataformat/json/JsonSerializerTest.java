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
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.DefaultDummyDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultExtension;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.json.JSONException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.eclipse.digitaltwin.aas4j.v3.dataformat.json.TestDataHelper.createAasDescriptor;
import static org.eclipse.digitaltwin.aas4j.v3.dataformat.json.TestDataHelper.createDefaultSubmodelDescriptor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
    public void testWriteToFile() throws IOException, SerializationException {
        File file = tempFolder.newFile("output.json");
        serializerToTest.write(new FileOutputStream(file), AASSimple.createEnvironment());
        assertTrue(file.exists());
    }

    @Test
    public void testSerializeEmpty() throws IOException, SerializationException, JSONException {
        validateAndCompare(Examples.ENVIRONMENT_EMPTY);
    }

    @Test
    public void testSerializeSimpleExample() throws SerializationException, JSONException, IOException {
        validateAndCompare(Examples.EXAMPLE_SIMPLE);
    }

    @Test
    public void testSerializeFullExample() throws SerializationException, JSONException, IOException {
        validateAndCompare(Examples.EXAMPLE_FULL);
    }

    @Test
    public void testSerializeFullExampleToNode() throws JSONException, IOException {
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
    public void testSerializeCustomDataSpecification() throws SerializationException, DeserializationException {
        JsonDeserializer deserializer = new JsonDeserializer();

        // This is the only way to make the serialization to work.
        Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
        subtypes.add(DefaultDummyDataSpecification.class);

        Environment origin = org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.ENVIRONMENT_WITH_DUMMYDATASPEC;

        String jsonString = serializerToTest.write(origin);
        assertNotNull(jsonString);

        Environment copy = deserializer.read(jsonString, Environment.class);
        assertNotNull(copy);

        assertTrue(origin.equals(copy));
    }

    @Test
    public void testReadAssetAdministrationShellDescriptor() throws IOException, SerializationException, JSONException {
        File fileExpected = new File("src/test/resources/AssetAdministrationShellDescriptor.json");
        Assert.assertTrue(fileExpected.exists());
        validateAndCompare(
            Files.readString(fileExpected.toPath()),
            serializerToTest.write(createAasDescriptor()));
    }

    @Test
    public void testSerializeAAS() throws IOException, SerializationException, JSONException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL);
    }

    @Test
    public void testSerializeAASWithAssetInformation() throws SerializationException, JSONException, IOException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_WITH_ASSET_INFORMATION);
    }

    @Test
    public void testSerializeAASs() throws IOException, SerializationException, JSONException {
        compare(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF);
    }

    @Test
    @Ignore("Add test after DataSpecficationPhysicalUnit is supported again")
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
    public void testSerializeSubmodelWithExtensions() throws DeserializationException, SerializationException, JsonProcessingException {
        List<Extension> extensions = List.of(
            new DefaultExtension.Builder()
                .name("myExtension").value("my extension value").valueType(DataTypeDefXsd.STRING)
                .build());
        JsonNode jsonNode = serializerToTest.toArrayNode(extensions);
        Assert.assertTrue(jsonNode.isArray());
        List<Extension> actual = new JsonDeserializer().readList(jsonNode, Extension.class);
        assertEquals(extensions, actual);
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

    @Test
    public void testSerializePropertyToNode() throws JSONException {
        Property property = new DefaultProperty.Builder()
                .idShort("exampleId")
                .build();
        ObjectNode expected = JsonNodeFactory.instance.objectNode();
        expected.put("idShort", "exampleId");
        expected.put("modelType", "Property");
        JsonNode actual = serializerToTest.toNode(property);
        validateAndCompare(expected.toPrettyString(), actual.toPrettyString());
    }

    @Test
    public void testSerializeListOfReferablesToNode() throws DeserializationException {
        List<Referable> referables = List.of(
            new DefaultProperty.Builder()
                .idShort("exampleId")
                .build());
        JsonNode node = serializerToTest.toArrayNode(referables);
        Assert.assertNotNull(node);
        Assert.assertTrue(node.isArray());
        List<Referable> actual = new JsonDeserializer().readList(node, Referable.class);
        assertEquals(referables, actual);
    }

    @Test
    public void testSerializeExtensionMinimal() throws SerializationException, JSONException, IOException {
        compare(Examples.EXTENSION_MINIMAL);
    }

    @Test
    public void testSerializeExtensionMaximal() throws SerializationException, JSONException, IOException {
        compare(Examples.EXTENSION_MAXIMAL);
    }

    @Test
    public void testSerializeReference() throws SerializationException, DeserializationException {
        Reference reference = AASFull.ENVIRONMENT.getSubmodels().get(0).getSemanticId();
        String serializedReference = serializerToTest.write(reference);
        assertTrue(serializedReference.contains("\"http://acplt.org/SubmodelTemplates/AssetIdentification\""));
        assertEquals(reference, new JsonDeserializer().read(serializedReference, Reference.class));
    }

    @Test
    public void testSerializeReferenceList() throws SerializationException {
        List<Reference> referenceList = AASFull.ENVIRONMENT.getAssetAdministrationShells().get(0).getSubmodels();
        String serializedReferenceArray = serializerToTest.write(referenceList);
        assertTrue(serializedReferenceArray.contains("\"https://acplt.org/Test_Submodel\""));
    }

    @Test
    public void testSerializeSpecificAssetId() throws SerializationException {
        SpecificAssetId specificAssetId = TestDataHelper.createSpecificAssetId();
        String specificAssetId_string = serializerToTest.write(specificAssetId);
        assertTrue(specificAssetId_string.contains("\"value\" : \"testValue\""));
    }


    @Test
    public void testSerializeSpecificAssetIdList() throws SerializationException {
        SpecificAssetId specificAssetId = TestDataHelper.createSpecificAssetId();
        List<SpecificAssetId> specificAssetIds = new ArrayList<>() {{
            add(specificAssetId);
            add(specificAssetId);
        }};

        String specificAssetId_list_string = serializerToTest.writeList(specificAssetIds);
        assertTrue(specificAssetId_list_string.startsWith("["));
        assertTrue(specificAssetId_list_string.contains("\"name\" : \"testSpecificAssetId\""));
    }

    @Test
    public void testReadSubmodelDescriptor() throws IOException, SerializationException, JSONException {
        File fileExpected = new File("src/test/resources/SubmodelDescriptor.json");
        validateAndCompare(fileExpected, createDefaultSubmodelDescriptor());
    }

    private void validateAndCompare(File expectedFile, SubmodelDescriptor descriptor) throws IOException, SerializationException, JSONException {
        String expected = Files.readString(expectedFile.toPath());
        String actual = serializerToTest.write(descriptor);
        validateAndCompare(expected, actual);
    }


    @SuppressWarnings("unchecked")
    private void compare(ExampleData<?> exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual;
        if (Collection.class.isAssignableFrom(exampleData.getModel().getClass())) {
            actual = serializerToTest.writeList((Collection<?>) exampleData.getModel());
        } else {
            actual = serializerToTest.write(exampleData.getModel());
        }
        //validateAndCompare(expected, actual);
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }

    private void validateAndCompare(ExampleData<Environment> exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual = serializerToTest.write(exampleData.getModel());
        validateAndCompare(expected, actual);
    }

    private void validateAndCompare(String expected, String actual) throws JSONException {
        logger.info(actual);
        Set<String> errors = new JsonSchemaValidator().validateSchema(actual);
        assertTrue(errors.isEmpty());
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }
}
