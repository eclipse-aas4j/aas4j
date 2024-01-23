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
import org.json.JSONException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JsonSerializerTest {
    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerTest.class);

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testSerializeNull() throws SerializationException {
        Environment env = null;
        assertEquals("null", new JsonSerializer().write(env));
    }

    @Test
    public void testWriteToFile() throws IOException, SerializationException {
        File file = tempFolder.newFile("output.json");
        new JsonSerializer().write(file, AASSimple.createEnvironment());
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
        JsonNode node = new JsonSerializer().toNode(Examples.EXAMPLE_FULL.getModel());
        String actual = new ObjectMapper().writeValueAsString(node);
        validateAndCompare(expected, actual);
    }

    @Test
    public void testSerializeEmptyReferableList() throws SerializationException, JSONException {
        List<Referable> emptyList = Collections.emptyList();
        String actual = new JsonSerializer().write(emptyList);
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
        JsonSerializer serializer = new JsonSerializer();
        JsonDeserializer deserializer = new JsonDeserializer();

        // This is the only way to make the serialization to work.
        Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
        subtypes.add(DefaultDummyDataSpecification.class);

        Environment origin = org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.ENVIRONMENT_WITH_DUMMYDATASPEC ;

        String jsonString = serializer.write(origin);
        assertNotNull(jsonString);

        Environment copy = deserializer.read(jsonString);
        assertNotNull(copy);

        assertTrue(origin.equals(copy));
    }


    private void validateAndCompare(ExampleData<Environment> exampleData) throws IOException, SerializationException, JSONException {
        String expected = exampleData.fileContent();
        String actual = new JsonSerializer().write(exampleData.getModel());
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
