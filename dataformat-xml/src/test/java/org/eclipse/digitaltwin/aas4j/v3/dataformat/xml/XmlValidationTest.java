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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class XmlValidationTest {

    private static Logger logger = LoggerFactory.getLogger(XmlValidationTest.class);

    private static XmlSchemaValidator validator;

    @BeforeClass
    public static void prepareValidator() throws SAXException {
        validator = new XmlSchemaValidator();
    }

    @Test
    @Parameters({ "src/test/resources/minimum.xml", "src/test/resources/Example_AAS_ServoDCMotor - Simplified.xml", "src/test/resources/test_demo_full_example.xml" })
    // import from admin-shell.io -> is actually V3
    // -> fix name, as soon as it is fixed externally
    public void validateValidXml(String file) throws IOException {
        Set<String> errors = validateXmlFile(file);
        logErrors(file, errors);
        assertTrue(errors.isEmpty());
    }

    @Test
    @Parameters({ "src/test/resources/invalidXmlExample.xml", "src/test/resources/ServoDCMotor_invalid.xml" })
    public void validateInvalidXml(String file) throws IOException {
        Set<String> errors = validateXmlFile(file);
        logErrors(file, errors);
        assertEquals(1, errors.size());
    }

    private void logErrors(String validatedFileName, Set<String> errors) {
        if (errors.isEmpty()) {
            return;
        }
        logger.info("Validate file: " + validatedFileName);
        for (String error : errors) {
            logger.info(error);
        }
    }

    private Set<String> validateXmlFile(String file) throws IOException {
        String serializedEnvironment = new String(Files.readAllBytes(Paths.get(file)));
        return validator.validateSchema(serializedEnvironment);
    }
}
