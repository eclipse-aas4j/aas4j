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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class JsonAssetAdministrationShellDescriptorSerializerTest {


    private static final Logger logger = LoggerFactory.getLogger(JsonAssetAdministrationShellDescriptorSerializerTest.class);


    @Test
    public void testReadAssetAdministrationShellDescriptor() throws IOException, SerializationException, JSONException {
        File fileExpected = new File("src/test/resources/assetAdministrationShellDescriptor.json");

        validateAndCompare(fileExpected, JsonAssetAdministrationShellDescriptorDeserializerTest.createAasDescriptor());
    }

    private void validateAndCompare(File expectedFile, AssetAdministrationShellDescriptor descriptor) throws IOException, SerializationException, JSONException {
        String expected = Files.readString(expectedFile.toPath());
        String actual = new JsonSerializer().writeAssetAdministrationShellDescriptor(descriptor);
        logger.debug(actual);
        Set<String> errors = new JsonSchemaValidator().validateSchema(actual);
        assertTrue(errors.isEmpty());
        JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals(actual, expected, JSONCompareMode.NON_EXTENSIBLE);
    }
}
