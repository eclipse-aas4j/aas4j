/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class JsonValidationTest {

    private static JsonSchemaValidator validator;

    @BeforeClass
    public static void prepareValidator() throws IOException {
        validator = new JsonSchemaValidator();
    }

    @Test
    @Parameters({
            "src/test/resources/empty_aas.json",
            "src/test/resources/jsonExample.json",
            "src/test/resources/MotorAAS.json",
            "src/test/resources/MotorAAS_reduced.json",
            "src/test/resources/test_demo_full_example.json"
    })
    public void validateValidJson(String file) throws IOException {
        String serializedEnvironment = new String(Files.readAllBytes(Paths.get(file)));
        Set<String> errors = validator.validateSchema(serializedEnvironment);
        System.out.println("Validating: " + file);
        assertTrue(errors.isEmpty());
    }

    @Test
    @Parameters({"src/test/resources/invalidJsonExample.json"})
    public void validateInvalidJson(String file) throws IOException {
        String serializedEnvironment = new String(Files.readAllBytes(Paths.get(file)));
        Set<String> errors = validator.validateSchema(serializedEnvironment);
        System.out.println("Validating: " + file);
        for (String s : errors) {
            System.out.println(s);
        }
        assertEquals(2, errors.size());
    }
}
