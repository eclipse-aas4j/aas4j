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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultExtension;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class JsonReferableSerializerTest {

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
        Submodel submodel = new JsonDeserializer().readReferable(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        submodel.getExtensions().add(new DefaultExtension.Builder()
                .name("myExtension").value("my extension value").valueType(DataTypeDefXsd.STRING)
                .build());
        JsonNode jsonNode = new ObjectMapper().readTree(new JsonSerializer().writeReferable(submodel));
        Assert.assertTrue(jsonNode.has("extensions"));
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
    public void testSerializePropertyToNode() throws IOException, SerializationException, JSONException {
        Property property = new DefaultProperty.Builder()
                .idShort("exampleId")
                .build();
        ObjectNode expected = JsonNodeFactory.instance.objectNode();
        expected.put("idShort", "exampleId");
        expected.put("modelType", "Property");
        JsonNode actual = new JsonSerializer().toNode(property);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSerializeExtensionMinimal() throws SerializationException, JSONException, IOException {
        compare(Examples.EXTENSION_MINIMAL);
    }
    @Test
    public void testSerializeExtensionMaximal() throws SerializationException, JSONException, IOException {
        compare(Examples.EXTENSION_MAXIMAL);
    }

	@SuppressWarnings("unchecked")
	private void compare(ExampleData<?> exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual = null;
        if (Environment.class.isAssignableFrom(exampleData.getModel().getClass())) {
            actual = new JsonSerializer().write((Environment) exampleData.getModel());
        } else if (Referable.class.isAssignableFrom(exampleData.getModel().getClass())) {
            actual = new JsonSerializer().writeReferable((Referable) exampleData.getModel());
        } else if (Collection.class.isAssignableFrom(exampleData.getModel().getClass())
				&& ((Collection<?>) exampleData.getModel()).stream().allMatch(x -> x != null && Referable.class.isAssignableFrom(x.getClass()))) {
            actual = new JsonSerializer().writeReferables((List<Referable>) exampleData.getModel());
        }
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }

}
