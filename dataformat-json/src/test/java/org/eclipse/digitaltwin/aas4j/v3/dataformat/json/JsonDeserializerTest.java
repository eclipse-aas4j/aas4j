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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel2;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DefaultDummyDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JsonDeserializerTest {
    private static JsonDeserializer deserializerToTest;

    @BeforeClass
    public static void initialize() {
        deserializerToTest = new JsonDeserializer();
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
    @Ignore("Physical Unit has been removed from the V3.0 metamodel. Might be added later again.")
    public void testReadConceptDescriptionWithPhysicalUnit() throws IOException, DeserializationException {
        ConceptDescription expected = Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT.getModel();
        ConceptDescription actual = deserializerToTest.read(
                Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT.fileContentStream(),
                ConceptDescription.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadNull() throws DeserializationException {
        assertNull(deserializerToTest.read("null", Submodel.class));
        assertNull(deserializerToTest.readList("null", Submodel.class));


        assertNull(deserializerToTest.read(JsonNodeFactory.instance.nullNode(), Submodel.class));
        assertNull(deserializerToTest.readList(JsonNodeFactory.instance.nullNode(), Submodel.class));

        ByteArrayInputStream bais = new ByteArrayInputStream("null".getBytes());
        assertNull(deserializerToTest.read(bais, Submodel.class));

        bais = new ByteArrayInputStream("null".getBytes());
        assertNull(deserializerToTest.readList(bais, Submodel.class));
    }

    @Test
    public void testReadEmptyReferableList() throws DeserializationException {
        List<Referable> emptyList = Collections.emptyList();

        List<Referable> deserialized = deserializerToTest.readList("[]", Referable.class);
        assertEquals(emptyList, deserialized);

        deserialized = deserializerToTest.readList(JsonNodeFactory.instance.arrayNode(), Referable.class);
        assertEquals(emptyList, deserialized);

        ByteArrayInputStream bais = new ByteArrayInputStream("[]".getBytes());
        assertEquals(emptyList, deserializerToTest.readList(bais, Submodel.class));
    }

    @Test
    public void testReadFullExampleEnv() {
        readAndCompare(Examples.EXAMPLE_FULL);
    }

    @Test
    public void testReadSimpleExampleEnv() {
        readAndCompare(Examples.EXAMPLE_SIMPLE);
    }

    @Test
    public void testReadShell() {
        readAndCompare(Examples.ASSET_ADMINISTRATION_SHELL);
    }

    @Test
    public void testReadShells() {
        readAndCompare(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF);
    }

    @Test
    public void testReadSubmodel() {
        readAndCompare(Examples.SUBMODEL);
    }

    @Test
    public void testReadSubmodels() {
        readAndCompare(Examples.SUBMODEL_LIST_OF);
    }

    @Test
    public void testReadSubmodelElement() {
        readAndCompare(Examples.SUBMODEL_ELEMENT);
    }

    @Test
    public void testReadSubmodelElements() {
        readAndCompare(Examples.SUBMODEL_ELEMENT_LIST_OF);
    }

    @Test
    public void testReadSubmodelElementList() {
        readAndCompare(Examples.SUBMODEL_ELEMENT_LIST);
    }

    @Test
    public void testReadSubmodelElementCollection() {
        readAndCompare(Examples.SUBMODEL_ELEMENT_COLLECTION);
    }

    @Test
    public void testReadExtensionMinimalEnv() {
        readAndCompare(Examples.EXTENSION_MINIMAL);
    }

    @Test
    public void testReadExtensionMaximalEnv() {
        readAndCompare(Examples.EXTENSION_MAXIMAL);
    }

    @Test
    public void testReadShellDescriptor() {
        readAndCompare(Examples.SHELL_DESCRIPTOR);
    }

    @Test
    public void testReadOperationRequest() {
        readAndCompare(Examples.OPERATION_REQUEST);
    }

    @Test
    public void testReadShellDescriptors() throws IOException, DeserializationException {
        String jsonString = "[" + Examples.SHELL_DESCRIPTOR.fileContent() + "]";
        List<AssetAdministrationShellDescriptor> shellDescriptors =
            deserializerToTest.readList(jsonString, AssetAdministrationShellDescriptor.class);
        assertEquals(Examples.SHELL_DESCRIPTOR.getModel(), shellDescriptors.get(0));
    }

    @Test
    public void testReadSubmodelDescriptor() {
        readAndCompare(Examples.SUBMODEL_DESCRIPTOR);
    }

    @Test
    public void testReadSubmodelDescriptors() throws IOException, DeserializationException {
        String jsonString = "[" + Examples.SUBMODEL_DESCRIPTOR.fileContent() + "]";
        List<SubmodelDescriptor> submodelDescriptors =
            deserializerToTest.readList(jsonString, SubmodelDescriptor.class);
        assertEquals(Examples.SUBMODEL_DESCRIPTOR.getModel(), submodelDescriptors.get(0));
    }

    private void readAndCompare(ExampleData<?> exampleData) {
        try {
            Object expected = exampleData.getModel();
            assertEquals(expected, readFromString(exampleData));
            assertEquals(expected, readFromNode(exampleData));
            assertEquals(expected, readFromStream(exampleData));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private Object readFromString(ExampleData<?> exampleData) throws IOException, DeserializationException {
        Object model = exampleData.getModel();
        if(model instanceof Collection<?>) {
            Collection<?> coll = (Collection<?>) model;
            return deserializerToTest.readList(exampleData.fileContent(), coll.iterator().next().getClass());
        }
        return deserializerToTest.read(exampleData.fileContent(), model.getClass());
    }

    private Object readFromStream(ExampleData<?> exampleData) throws DeserializationException {
        Object model = exampleData.getModel();
        if(model instanceof Collection<?>) {
            Collection<?> coll = (Collection<?>) model;
            return deserializerToTest.readList(exampleData.fileContentStream(), coll.iterator().next().getClass());
        }
        return deserializerToTest.read(exampleData.fileContentStream(), model.getClass());
    }

    private Object readFromNode(ExampleData<?> exampleData) throws IOException, DeserializationException {
        Object model = exampleData.getModel();
        if(model instanceof Collection<?>) {
            Collection<?> coll = (Collection<?>) model;
            return deserializerToTest.readList(exampleData.getJsonNode(), coll.iterator().next().getClass());
        }
        return deserializerToTest.read(exampleData.getJsonNode(), model.getClass());
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