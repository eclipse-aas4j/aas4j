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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel2;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;


import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelDescriptor;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JsonDeserializerTest {
    @Test
    public void testReadEnvironmentFromStream() throws Exception {
        Environment env = new JsonDeserializer().read(Examples.EXAMPLE_FULL.fileContentStream(), Environment.class);
        assertNotNull(env);
    }

    @Test
    public void testReadEnvironmentFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Example-Full.json").toFile();
        assertTrue(file.exists());
        Environment env = new JsonDeserializer().read(new FileInputStream(file), Environment.class);
        assertNotNull(env);
    }

    @Test
    public void testReadReferable() throws Exception {
        Path path = Paths.get("src", "test", "resources", "Submodel.json");
        assertTrue(path.toFile().exists());
        String jsonSubmodel = Files.readString(path);
        Submodel submodel = new JsonDeserializer().read(jsonSubmodel, Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromStream() throws Exception {
        Submodel submodel = new JsonDeserializer().read(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL.fileContentStream());
        Submodel submodel = new JsonDeserializer().read(node, Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Submodel.json").toFile();
        assertTrue(file.exists());
        Submodel submodel = new JsonDeserializer().read(new FileInputStream(file), Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferables() throws Exception {
        Path path = Paths.get("src", "test", "resources", "Submodel-List.json");
        assertTrue(path.toFile().exists());
        String jsonSubmodels = Files.readString(path);
        List<Submodel> submodels = new JsonDeserializer().readList(jsonSubmodels, Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL_LIST_OF.fileContentStream());
        List<Submodel> submodels = new JsonDeserializer().readList(node, Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromStream() throws Exception {
        List<Submodel> submodels = new JsonDeserializer().readList(
            Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Submodel-List.json").toFile();
        assertTrue(file.exists());
        List<Submodel> submodels = new JsonDeserializer().readList(new FileInputStream(file), Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }



    @Test
    public void testSimpleExample() throws Exception {
        Environment expected = Examples.EXAMPLE_SIMPLE.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXAMPLE_SIMPLE.fileContentStream(), Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFullExample() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXAMPLE_FULL.fileContentStream(), Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFullExampleFromNode() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        JsonNode node = new ObjectMapper().readTree(Examples.EXAMPLE_FULL.fileContentStream());
        Environment actual = new JsonDeserializer().read(node, Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCustomImplementationClass() throws Exception {
        String json = new JsonSerializer().write(AASSimple.createEnvironment());
        JsonDeserializer deserializer = new JsonDeserializer();
        Environment environment = deserializer.read(json, Environment.class);
        checkImplementationClasses(environment, DefaultSubmodel.class, DefaultProperty.class);
        deserializer.useImplementation(Submodel.class, CustomSubmodel.class);
        deserializer.useImplementation(Property.class, CustomProperty.class);
        environment = deserializer.read(json, Environment.class);
        checkImplementationClasses(environment, CustomSubmodel.class, CustomProperty.class);
        deserializer.useImplementation(Submodel.class, CustomSubmodel2.class);
        environment = deserializer.read(json, Environment.class);
        checkImplementationClasses(environment, CustomSubmodel2.class, CustomProperty.class);
    }


    @Test
    public void testReadAAS() throws DeserializationException {
        AssetAdministrationShell expected = Examples.ASSET_ADMINISTRATION_SHELL.getModel();
        AssetAdministrationShell actual = new JsonDeserializer().read(Examples.ASSET_ADMINISTRATION_SHELL.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadAASs() throws DeserializationException {
        List<AssetAdministrationShell> expected = Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.getModel();
        List<AssetAdministrationShell> actual = new JsonDeserializer().readList(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelUsingUtf8Charset() throws DeserializationException {
        Submodel expected = Examples.SUBMODEL.getModel();
        Submodel actual = new JsonDeserializer().read(Examples.SUBMODEL.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelFromFileUsingUtf8Charset() throws DeserializationException, FileNotFoundException {
        Submodel expected = Examples.SUBMODEL.getModel();
        File file = new File("src/test/resources/Submodel.json");
        assertTrue(file.exists());
        Submodel actual = new JsonDeserializer().read(new FileInputStream(file), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelsFromFileUsingUtf8Charset() throws DeserializationException, FileNotFoundException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        File file = new File("src/test/resources/Submodel-List.json");
        assertTrue(file.exists());
        List<Submodel> actual = new JsonDeserializer().readList(new FileInputStream(file), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelsFromStreamUsingUtf8Charset() throws DeserializationException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        List<Submodel> actual = new JsonDeserializer().readList(
                Examples.SUBMODEL_LIST_OF.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodel() throws DeserializationException {
        Submodel expected = Examples.SUBMODEL.getModel();
        Submodel actual = new JsonDeserializer().read(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodels() throws DeserializationException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        List<Submodel> actual = new JsonDeserializer().readList(Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElement() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT.getModel();
        SubmodelElement actual = new JsonDeserializer().read(Examples.SUBMODEL_ELEMENT.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElements() throws DeserializationException {
        List<SubmodelElement> expected = Examples.SUBMODEL_ELEMENT_LIST_OF.getModel();
        List<SubmodelElement> actual = new JsonDeserializer().readList(
                Examples.SUBMODEL_ELEMENT_LIST_OF.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementList() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_LIST.getModel();
        SubmodelElementList actual = new JsonDeserializer().read(Examples.SUBMODEL_ELEMENT_LIST.fileContentStream(), SubmodelElementList.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementCollection() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_COLLECTION.getModel();
        SubmodelElementCollection actual = new JsonDeserializer().read(Examples.SUBMODEL_ELEMENT_COLLECTION.fileContentStream(), SubmodelElementCollection.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadEmptyReferableList() throws DeserializationException {
        List<Referable> emptyList = Collections.emptyList();
        List<Referable> deserialized = new JsonDeserializer().readList("[]", Referable.class);
        assertEquals(emptyList, deserialized);
    }

    @Test
    @Ignore("Physical Unit has been removed from the V3.0 metamodel. Might be added later again.")
    public void testDeserializeConceptDescriptionWithPhysicalUnit() throws IOException, DeserializationException {
        ExampleData<ConceptDescription> exampleData = Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT;
        Object expected = exampleData.getModel();
        try (InputStream fileContent = exampleData.fileContentStream()) {
            Object actual = new JsonDeserializer().read(fileContent, (Class<? extends Referable>) exampleData.getModel().getClass());
            Assert.assertEquals(expected, actual);
        }
    }


    @Test
    public void testPropertyFromNode() throws Exception {
        Property expected = new DefaultProperty.Builder()
                .idShort("exampleId")
                .build();
        ObjectNode input = JsonNodeFactory.instance.objectNode();
        input.put("idShort", "exampleId");
        input.put("modelType", "Property");
        Property actual = new JsonDeserializer().read(input, Property.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testExtensionMinimal() throws Exception {
        Environment expected = Examples.EXTENSION_MINIMAL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXTENSION_MINIMAL.fileContentStream(), Environment.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testExtensionMaximal() throws Exception {
        Environment expected = Examples.EXTENSION_MAXIMAL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXTENSION_MAXIMAL.fileContentStream(), Environment.class);
        assertEquals(expected, actual);
    }

    static AssetAdministrationShellDescriptor createAasDescriptor() {

        SpecificAssetId specificAssetId = new DefaultSpecificAssetId.Builder()
                .semanticId(TestDataHelper.DEFAULT_SEMANTIC_ID)
                .externalSubjectId(TestDataHelper.createReference(
                        ReferenceTypes.MODEL_REFERENCE, KeyTypes.ASSET_ADMINISTRATION_SHELL, "defaultSpecificAssetId"))
                .name("defaultSpecificAssetIdName")
                .value("http://example.company/myAsset").build();

        return new DefaultAssetAdministrationShellDescriptor.Builder()
                .administration(TestDataHelper.DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(TestDataHelper.DEFAULT_DESCRIPTION)
                .displayName(TestDataHelper.DEFAULT_DISPLAY_NAME)
                .id(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .specificAssetIds(List.of(specificAssetId))
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .globalAssetId("defaultGlobalAssetId")
                .submodelDescriptors(List.of(getDefaultSubmodelDescriptor())).build();
    }

    @Test
    public void testReadAasDescriptor() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/AssetAdministrationShellDescriptor.json");
        String expected = Files.readString(fileExpected.toPath());
        AssetAdministrationShellDescriptor assetAdministrationShellDescriptor =
                new JsonDeserializer().read(expected, AssetAdministrationShellDescriptor.class);
        AssetAdministrationShellDescriptor aasExpected = createAasDescriptor();

        assertEquals(aasExpected, assetAdministrationShellDescriptor);
    }

    @Test
    public void testReadAasDescriptorsList() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/AssetAdministrationShellDescriptor.json");
        String expected = "[" + Files.readString(fileExpected.toPath()) + "]";
        List<AssetAdministrationShellDescriptor> assetAdministrationShellDescriptors =
                new JsonDeserializer().readList(expected, AssetAdministrationShellDescriptor.class);
        AssetAdministrationShellDescriptor aasExpected = createAasDescriptor();

        assertEquals(aasExpected, assetAdministrationShellDescriptors.get(0));
    }

    @Test
    public void testDeserializeDuration() throws DeserializationException, DatatypeConfigurationException, SerializationException {
        Duration duration = DatatypeFactory.newInstance().newDurationDayTime("P0DT0H3M0S"); // three minutes
        JsonDeserializer deserializer = new JsonDeserializer();
        String operationRequestString = new JsonSerializer().write(org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.OPERATION_REQUEST);
        OperationRequest operationRequest = deserializer.read(operationRequestString, OperationRequest.class);
        assertEquals( operationRequest.getClientTimeoutDuration() , duration);
    }

    @Test
    public void testDeserializeReference() throws DeserializationException, SerializationException {
        JsonDeserializer deserializer = new JsonDeserializer();
        String jsonReference = new JsonSerializer().write(AASFull.ENVIRONMENT.getSubmodels().get(0).getSemanticId());
        Reference reference = deserializer.read(jsonReference, Reference.class);
        assertTrue(!reference.getKeys().get(0).getValue().isEmpty());
    }

    @Test
    public void testDeserializeReferenceList() throws DeserializationException, SerializationException {
        JsonDeserializer deserializer = new JsonDeserializer();
        String jsonReferenceList = new JsonSerializer().writeList(AASFull.ENVIRONMENT.getAssetAdministrationShells().get(0).getSubmodels());
        List<Reference> referenceList = deserializer.readList(jsonReferenceList, Reference.class);
        assertTrue(referenceList.get(0).getType().equals(ReferenceTypes.EXTERNAL_REFERENCE));
    }

    @Test
    public void testDeserializeSpecificAssetId() throws DeserializationException, SerializationException {
        SpecificAssetId expected = new DefaultSpecificAssetId.Builder()
                .name("testSpecificAssetId")
                .value("testValue")
                .build();

        String specificAssetIdString = new JsonSerializer().write(expected);
        JsonDeserializer deserializer = new JsonDeserializer();
        assertEquals(expected, deserializer.read(specificAssetIdString, SpecificAssetId.class));
    }

    @Test
    public void testDeserializeSpecificAssetIdList() throws DeserializationException, SerializationException {
        JsonSerializer serializer = new JsonSerializer();

        SpecificAssetId expected = new DefaultSpecificAssetId.Builder()
                .name("testSpecificAssetId")
                .value("testValue")
                .build();

        String specificAssetId_list_string = serializer.writeList(List.of(expected));
        JsonDeserializer deserializer = new JsonDeserializer();
        List<SpecificAssetId> specificAssetIdList = deserializer.readList(
             specificAssetId_list_string, SpecificAssetId.class);
        assertEquals(expected, specificAssetIdList.get(0));
    }

    @Test
    public void testReadSubmodelDescriptor() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/SubmodelDescriptor.json");
        String expected = Files.readString(fileExpected.toPath());
        SubmodelDescriptor submodelDescriptor = new JsonDeserializer().read(expected, SubmodelDescriptor.class);
        SubmodelDescriptor submodelDescriptorExpected = getDefaultSubmodelDescriptor();

        assertEquals(submodelDescriptorExpected, submodelDescriptor);
    }

    @Test
    public void testReadSubmodelDescriptors() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/SubmodelDescriptor.json");
        String expected = "[" + Files.readString(fileExpected.toPath()) + "]";
        List<SubmodelDescriptor> submodelDescriptors =
                new JsonDeserializer().readList(expected, SubmodelDescriptor.class);
        SubmodelDescriptor submodelDescriptorExpected = getDefaultSubmodelDescriptor();
        assertEquals(submodelDescriptorExpected, submodelDescriptors.get(0));
    }

    private void checkImplementationClasses(Environment environment,
            Class<? extends Submodel> submodelImpl, Class<? extends Property> propertyImpl) {
        environment.getSubmodels().forEach(submodel -> {
            assertEquals(submodel.getClass(), submodelImpl);
            submodel.getSubmodelElements().stream()
                    .filter(element -> Property.class.isAssignableFrom(element.getClass()))
                    .forEach(element -> assertEquals(element.getClass(), propertyImpl));
        });
    }

    static SubmodelDescriptor getDefaultSubmodelDescriptor () {
        return new DefaultSubmodelDescriptor.Builder()
                .administration(TestDataHelper.DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(TestDataHelper.DEFAULT_DESCRIPTION)
                .displayName(TestDataHelper.DEFAULT_DISPLAY_NAME)
                .id(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .semanticId(TestDataHelper.DEFAULT_SEMANTIC_ID)
                .build();
    }
}
