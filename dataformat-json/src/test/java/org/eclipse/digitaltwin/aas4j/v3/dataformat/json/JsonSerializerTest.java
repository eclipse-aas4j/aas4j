/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2022 SAP SE or an SAP affiliate company
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.ExampleData;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.json.JSONException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerTest.class);

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testSerializeNull() throws SerializationException {
        assertEquals("null", new JsonSerializer().write((Environment) null));
    }

    @Test
    public void testDirectSerializeNull() throws JsonProcessingException {
        ObjectMapper mapper = ObjectMapperFactory.createMapper();
        String json = mapper.writeValueAsString((Environment)null);
        assertEquals("null", json);
    }

    @Test
    public void testWriteToFile() throws IOException, SerializationException {
        File file = tempFolder.newFile("output.json");
        new JsonSerializer().write(file, AASSimple.createEnvironment());
        assertTrue(file.exists());
    }

    @Test
    public void testSerializeEmpty() throws JsonProcessingException, IOException, SerializationException, JSONException {
        validateAndCompare(Examples.ENVIRONMENT_EMPTY);
    }

    @Test
    public void testSerializeDirectEmpty() throws IOException, JSONException {
        validateAndCompareDirectly(Examples.ENVIRONMENT_EMPTY);
    }

    @Test
    public void testSerializeSimpleExample() throws SerializationException, JSONException, IOException {
        validateAndCompare(Examples.EXAMPLE_SIMPLE);
    }

    public void testSerializeDirectlySimpleExample() throws SerializationException, JSONException, IOException {
        validateAndCompareDirectly(Examples.EXAMPLE_SIMPLE);
    }

    @Test
    public void testSerializeFullExample() throws SerializationException, JSONException, IOException {
        validateAndCompare(Examples.EXAMPLE_FULL);
    }

    @Test
    public void testSerializeFullExampleToNode() throws SerializationException, JSONException, IOException {
        String expected = Examples.EXAMPLE_FULL.fileContent();
        JsonNode node = new JsonSerializer().toNode(Examples.EXAMPLE_FULL.getModel());
        String actual = new ObjectMapper().writeValueAsString(node);
        validateAndCompare(expected, actual);
    }

    @Test
    public void testSerializeEmptyReferableList() throws SerializationException {
        List<Referable> emptyList = Collections.emptyList();
        String serialized = new JsonSerializer().write(emptyList);
        assertEquals("[]", serialized);
    }

//    @Test
//    public void testSerializeEmptyReferableList() throws SerializationException, JSONException {
//        List<Referable> emptyList = Collections.emptyList();
//        String serialized = new JsonSerializer().write(emptyList);
//        JSONAssert.assertEquals("[]", serialized, JSONCompareMode.NON_EXTENSIBLE);
//    }

    @Test
    public void testSerializeDirectlyFullExample() throws SerializationException, JSONException, IOException {
        validateAndCompareDirectly(Examples.EXAMPLE_FULL);
    }

    @Test
    public void testSerializeAssetInfo() throws SerializationException, DeserializationException {
        AssetInformation assetInfo = new DefaultAssetInformation.Builder()
            .assetKind(AssetKind.INSTANCE)
            .assetType("asset-type")
            .globalAssetID("global-asset-id").build();
        String jsonString = new JsonSerializer().write(assetInfo);
        assertNotNull(jsonString);
        AssetInformation assetInfo2 = new JsonDeserializer().read(jsonString, AssetInformation.class);
        assertNotNull(assetInfo2);
        assertEquals(assetInfo, assetInfo2);
    }

    @Test
    public void testDirectlySerializeAssetInfo() throws JsonProcessingException {
        AssetInformation assetInfo = new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .assetType("asset-type")
                .globalAssetID("global-asset-id").build();
        ObjectMapper mapper = ObjectMapperFactory.createMapper();
        String jsonString = mapper.writeValueAsString(assetInfo);
        assertNotNull(jsonString);
        AssetInformation assetInfo2 = mapper.readValue(jsonString, AssetInformation.class);
        assertNotNull(assetInfo2);
        assertEquals(assetInfo, assetInfo2);
    }

    @Test
    public void testDirectlySerializeEmptyReferableList() throws JsonProcessingException, JSONException {
        List<Referable> emptyList = Collections.emptyList();
        ObjectMapper mapper = ObjectMapperFactory.createMapper();
        String serialized = mapper.writeValueAsString(emptyList);
        JSONAssert.assertEquals("[]", serialized, JSONCompareMode.NON_EXTENSIBLE);
    }

    private void validateAndCompare(ExampleData<Environment> exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual = new JsonSerializer().write(exampleData.getModel());
        validateAndCompare(expected, actual);
    }

    private void validateAndCompare(String expected, String actual) throws IOException, SerializationException, JSONException {
        logger.info(actual);
        Set<String> errors = new JsonSchemaValidator().validateSchema(actual);
        assertTrue(errors.isEmpty());
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }

    private void validateAndCompareDirectly(ExampleData<Environment> exampleData) throws IOException, JSONException {
        String expected = exampleData.fileContent();
        ObjectMapper mapper = ObjectMapperFactory.createMapper();
        String actual = mapper.writeValueAsString(exampleData.getModel());
        Set<String> errors = new JsonSchemaValidator().validateSchema(actual);
        assertTrue(errors.isEmpty());
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }
}
