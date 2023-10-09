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

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.junit.Ignore;
import org.junit.Test;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;

import org.junit.Assert;


public class JsonReferableDeserializerTest {

    @Test
    public void testReadAAS() throws IOException, DeserializationException {
        AssetAdministrationShell expected = Examples.ASSET_ADMINISTRATION_SHELL.getModel();
        AssetAdministrationShell actual = new JsonDeserializer().readReferable(Examples.ASSET_ADMINISTRATION_SHELL.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadAASs() throws IOException, DeserializationException {
        List<AssetAdministrationShell> expected = Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.getModel();
        List<AssetAdministrationShell> actual = new JsonDeserializer().readReferables(Examples.ASSET_ADMINISTRATION_SHELL_LIST_OF.fileContentStream(), AssetAdministrationShell.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodel() throws IOException, DeserializationException {
        Submodel expected = Examples.SUBMODEL.getModel();
        Submodel actual = new JsonDeserializer().readReferable(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodels() throws IOException, DeserializationException {
        List<Submodel> expected = Examples.SUBMODEL_LIST_OF.getModel();
        List<Submodel> actual = new JsonDeserializer().readReferables(Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElement() throws IOException, DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT.getModel();
        SubmodelElement actual = new JsonDeserializer().readReferable(Examples.SUBMODEL_ELEMENT.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElements() throws IOException, DeserializationException {
        List<SubmodelElement> expected = Examples.SUBMODEL_ELEMENT_LIST_OF.getModel();
        List<SubmodelElement> actual = new JsonDeserializer().readReferables(
                Examples.SUBMODEL_ELEMENT_LIST_OF.fileContentStream(), SubmodelElement.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementList() throws IOException, DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_LIST.getModel();
        SubmodelElementList actual = new JsonDeserializer().readReferable(Examples.SUBMODEL_ELEMENT_LIST.fileContentStream(), SubmodelElementList.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadSubmodelElementCollection() throws IOException, DeserializationException {
        SubmodelElement expected = Examples.SUBMODEL_ELEMENT_COLLECTION.getModel();
        SubmodelElementCollection actual = new JsonDeserializer().readReferable(Examples.SUBMODEL_ELEMENT_COLLECTION.fileContentStream(), SubmodelElementCollection.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testReadEmptyReferableList() throws DeserializationException {
        List<Referable> emptyList = Collections.emptyList();
        List<Referable> deserialized = new JsonDeserializer().readReferables("[]", Referable.class);
        assertEquals(emptyList, deserialized);
    }

    @Test
    @Ignore("Physical Unit has been removed from the V3.0 metamodel. Might be added later again.")
    public void testDeserializeConceptDescriptionWithPhysicalUnit() throws IOException, DeserializationException {
        ExampleData<ConceptDescription> exampleData = Examples.CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT;
        Object expected = exampleData.getModel();
        try (InputStream fileContent = exampleData.fileContentStream()) {
            Object actual = new JsonDeserializer().readReferable(fileContent, (Class<? extends Referable>) exampleData.getModel().getClass());
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
        Property actual = new JsonDeserializer().readReferable(input, Property.class);
        assertEquals(expected, actual);
    }

    @Test
    public void testExtensionMinimal() throws Exception {
        Environment expected = Examples.EXTENSION_MINIMAL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXTENSION_MINIMAL.fileContentStream());
        assertEquals(expected, actual);
    }

    @Test
    public void testExtensionMaximal() throws Exception {
        Environment expected = Examples.EXTENSION_MAXIMAL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXTENSION_MAXIMAL.fileContentStream());
        assertEquals(expected, actual);
    }
}
