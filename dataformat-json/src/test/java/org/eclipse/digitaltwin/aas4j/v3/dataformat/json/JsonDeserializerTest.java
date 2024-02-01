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
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel2;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DefaultDummyDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonDeserializerTest {
    private static JsonDeserializer deserializerToTest;

    @BeforeClass
    public static void initialize() {
        deserializerToTest = new JsonDeserializer();
    }

    @Test
    public void testReadEnvironmentFromStream() throws DeserializationException {
        Environment env = deserializerToTest.read(Examples.EXAMPLE_FULL.fileContentStream(), Environment.class);
        assertEquals(Examples.EXAMPLE_FULL.getModel(), env);
    }

    /**
     * This test ensures that future DataSpecificationContents can be added without adjustments in the code.
     *
     * @throws SerializationException
     * @throws DeserializationException
     */
    @Test
    public void testReadCustomDataSpecification() throws DeserializationException {
        // This is the only way to make the serialization to work.
        Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
        subtypes.add(DefaultDummyDataSpecification.class);
        // We need to create a new deserializer instance here, to reflect the change in the subtypes.
        Environment env = new JsonDeserializer().read(Examples.ENVIRONMENT_CUSTOM_DATA.fileContentStream(), Environment.class);
        assertEquals(Examples.ENVIRONMENT_CUSTOM_DATA.getModel(), env);
    }

    @Test
    public void testReadReferable() throws IOException, DeserializationException {
        Submodel submodel = deserializerToTest.read(Examples.SUBMODEL.fileContent(), Submodel.class);
        assertEquals(Examples.SUBMODEL.getModel(), submodel);
    }

    @Test
    public void testReadReferableFromStream() throws DeserializationException {
        Submodel submodel = deserializerToTest.read(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertEquals(Examples.SUBMODEL.getModel(), submodel);
    }

    @Test
    public void testReadReferableFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL.fileContentStream());
        Submodel submodel = deserializerToTest.read(node, Submodel.class);
        assertEquals(Examples.SUBMODEL.getModel(), submodel);
    }

    @Test
    public void testReadReferableFromStreamUsingCharset() throws Exception {
        Submodel submodel = deserializerToTest.read(Examples.SUBMODEL.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(Examples.SUBMODEL.getModel(), submodel);
    }

    @Test
    public void testReadReferables() throws Exception {
        List<Submodel> submodels = deserializerToTest.readList(Examples.SUBMODEL_LIST_OF.fileContent(), Submodel.class);
        assertEquals(Examples.SUBMODEL_LIST_OF.getModel(), submodels);
    }

    @Test
    public void testReadReferablesFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL_LIST_OF.fileContentStream());
        List<Submodel> submodels = deserializerToTest.readList(node, Submodel.class);
        assertEquals(Examples.SUBMODEL_LIST_OF.getModel(), submodels);
    }

    @Test
    public void testReadReferablesFromStream() throws Exception {
        List<Submodel> submodels = deserializerToTest.readList(
            Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertEquals(Examples.SUBMODEL_LIST_OF.getModel(), submodels);
    }

    @Test
    public void testReadReferablesFromStreamUsingUtf8Charset() throws Exception {
        List<Submodel> submodels = deserializerToTest.readList(
            Examples.SUBMODEL_LIST_OF.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(Examples.SUBMODEL_LIST_OF.getModel(), submodels);
    }

    @Test
    public void testReadSimpleExampleEnv() throws Exception {
        Environment expected = Examples.EXAMPLE_SIMPLE.getModel();
        Environment actual = deserializerToTest.read(Examples.EXAMPLE_SIMPLE.fileContentStream(), Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadFullExampleEnv() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        Environment actual = deserializerToTest.read(Examples.EXAMPLE_FULL.fileContentStream(), Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadFullExampleEnvFromNode() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        JsonNode node = new ObjectMapper().readTree(Examples.EXAMPLE_FULL.fileContentStream());
        Environment actual = deserializerToTest.read(node, Environment.class);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadCustomImplementationClass() throws Exception {
        String json = Examples.EXAMPLE_SIMPLE.fileContent();
        // As we test useImplementation(), we need to create a new deserializer here.
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
    public void testReadShell() throws DeserializationException {
        AssetAdministrationShell expected = Examples.ASSET_ADMINISTRATION_SHELL.getModel();
        AssetAdministrationShell actual = deserializerToTest.read(Examples.ASSET_ADMINISTRATION_SHELL.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadShells() throws DeserializationException {
        List<AssetAdministrationShell> expected = Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.getModel();
        List<AssetAdministrationShell> actual = deserializerToTest.readList(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelUsingUtf8Charset() throws DeserializationException {
        Submodel expected = Examples.SUBMODEL.getModel();
        Submodel actual = deserializerToTest.read(Examples.SUBMODEL.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelsFromStreamUsingUtf8Charset() throws DeserializationException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        List<Submodel> actual = deserializerToTest.readList(
            Examples.SUBMODEL_LIST_OF.fileContentStream(), StandardCharsets.UTF_8, Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodel() throws DeserializationException {
        Submodel expected = Examples.SUBMODEL.getModel();
        Submodel actual = deserializerToTest.read(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodels() throws DeserializationException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        List<Submodel> actual = deserializerToTest.readList(Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElement() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT.getModel();
        SubmodelElement actual = deserializerToTest.read(Examples.SUBMODEL_ELEMENT.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElements() throws DeserializationException {
        List<SubmodelElement> expected = Examples.SUBMODEL_ELEMENT_LIST_OF.getModel();
        List<SubmodelElement> actual = deserializerToTest.readList(
            Examples.SUBMODEL_ELEMENT_LIST_OF.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementList() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_LIST.getModel();
        SubmodelElementList actual = deserializerToTest.read(Examples.SUBMODEL_ELEMENT_LIST.fileContentStream(), SubmodelElementList.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementCollection() throws DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_COLLECTION.getModel();
        SubmodelElementCollection actual = deserializerToTest.read(Examples.SUBMODEL_ELEMENT_COLLECTION.fileContentStream(), SubmodelElementCollection.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadEmptyReferableList() throws DeserializationException {
        List<Referable> emptyList = Collections.emptyList();
        List<Referable> deserialized = deserializerToTest.readList("[]", Referable.class);
        assertEquals(emptyList, deserialized);
    }

    @Test
    @Ignore("Physical Unit has been removed from the V3.0 metamodel. Might be added later again.")
    public void testReadConceptDescriptionWithPhysicalUnit() throws IOException, DeserializationException {
        ConceptDescription expected = Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT.getModel();
        ConceptDescription actual = deserializerToTest.read(
            Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT.fileContentStream(),
            ConceptDescription.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadExtensionMinimalEnv() throws Exception {
        Environment expected = Examples.EXTENSION_MINIMAL.getModel();
        Environment actual = deserializerToTest.read(Examples.EXTENSION_MINIMAL.fileContentStream(), Environment.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadExtensionMaximalEnv() throws Exception {
        Environment expected = Examples.EXTENSION_MAXIMAL.getModel();
        Environment actual = deserializerToTest.read(Examples.EXTENSION_MAXIMAL.fileContentStream(), Environment.class);
        assertEquals(expected, actual);
    }



    @Test
    public void testReadShellDescriptor() throws IOException, DeserializationException {
        AssetAdministrationShellDescriptor shellDescriptor =
            deserializerToTest.read(Examples.SHELL_DESCRIPTOR.fileContent(), AssetAdministrationShellDescriptor.class);
        assertEquals(Examples.SHELL_DESCRIPTOR.getModel(), shellDescriptor);
    }

    @Test
    public void testReadShellDescriptors() throws IOException, DeserializationException {
        String jsonString = "[" + Examples.SHELL_DESCRIPTOR.fileContent() + "]";
        List<AssetAdministrationShellDescriptor> shellDescriptors =
            deserializerToTest.readList(jsonString, AssetAdministrationShellDescriptor.class);
        assertEquals(Examples.SHELL_DESCRIPTOR.getModel(), shellDescriptors.get(0));
    }

    @Test
    public void testReadOperationRequest() throws DeserializationException, IOException {
        OperationRequest expected = Examples.OPERATION_REQUEST.getModel();
        OperationRequest actual = deserializerToTest.read(Examples.OPERATION_REQUEST.fileContent(), OperationRequest.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelDescriptor() throws IOException, DeserializationException {
        SubmodelDescriptor submodelDescriptor = deserializerToTest.read(
            Examples.SUBMODEL_DESCRIPTOR.fileContentStream(), SubmodelDescriptor.class);
        assertEquals(Examples.SUBMODEL_DESCRIPTOR.getModel(), submodelDescriptor);
    }

    @Test
    public void testReadSubmodelDescriptors() throws IOException, DeserializationException {
        String jsonString = "[" + Examples.SUBMODEL_DESCRIPTOR.fileContent() + "]";
        List<SubmodelDescriptor> submodelDescriptors =
            deserializerToTest.readList(jsonString, SubmodelDescriptor.class);
        assertEquals(Examples.SUBMODEL_DESCRIPTOR.getModel(), submodelDescriptors.get(0));
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
}