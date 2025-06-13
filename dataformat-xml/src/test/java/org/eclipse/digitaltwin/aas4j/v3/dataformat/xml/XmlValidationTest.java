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
import junitparams.naming.TestCaseName;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

@RunWith(JUnitParamsRunner.class)
public class XmlValidationTest {

    private static Logger logger = LoggerFactory.getLogger(XmlValidationTest.class);

    private static XmlSchemaValidator validator;
    private static final String TEST_FILES_DIR = "target/test-classes/examples";

    // List of tests that are known to have issues with EmbeddedDataSpecificationsDeserializer -> GitHub issue https://github.com/eclipse-aas4j/aas4j/issues/389 and https://github.com/eclipse-aas4j/aas4j/issues/390
    private static final List<String> IGNORED_TESTS = List.of(
            "annotatedRelationshipElement",
            "basicEventElement", "blob",
            "capability",
            "entity", "file",
            "multiLanguageProperty", "operation",
            "property",
            "range", "referenceElement",
            "relationshipElement", "submodelElementCollection",
            "submodelElementList"
    );

    @BeforeClass
    public static void prepareValidator() throws SAXException {
        validator = new XmlSchemaValidator();
    }

    @Test
    @Parameters({"src/test/resources/minimum.xml", "src/test/resources/Example_AAS_ServoDCMotor - Simplified.xml", "src/test/resources/test_demo_full_example.xml"})
    // import from admin-shell.io -> is actually V3
    // -> fix name, as soon as it is fixed externally
    public void validateValidXml(String file) throws IOException {
        Set<String> errors = validateXmlFile(file);
        logErrors(file, errors);
        assertTrue(errors.isEmpty());
    }

    @Test
    @Parameters({"src/test/resources/invalidXmlExample.xml", "src/test/resources/ServoDCMotor_invalid.xml"})
    public void validateInvalidXml(String file) throws IOException {
        Set<String> errors = validateXmlFile(file);
        logErrors(file, errors);
        assertEquals(1, errors.size());
    }

    @Test
    @Parameters(method = "fileProvider")
    @TestCaseName("{0}")
    public void validateExampleXml(String filePath) throws DeserializationException, SerializationException, IOException {

        // Skip tests that are known to have issues with EmbeddedDataSpecificationsDeserializer -> GitHub issue https://github.com/eclipse-aas4j/aas4j/issues/389 and https://github.com/eclipse-aas4j/aas4j/issues/390
        boolean shouldSkip = IGNORED_TESTS.stream().anyMatch(filePath::contains);

        assumeFalse("Skipping the tests because of EmbeddedDataSpecificationsDeserializer issue:" + filePath, shouldSkip);

        String initialXml = new String(Files.readAllBytes(Paths.get(filePath)));

        Environment environment = new XmlDeserializer().read(initialXml);
        String serializedEnv = new XmlSerializer().write(environment);

        Set<String> serializedEnvValidationError = validateSerializedXmlFile(serializedEnv);
        logErrors(filePath, serializedEnvValidationError);

        assertTrue(serializedEnvValidationError.isEmpty());
    }

    private void logErrors(String validatedFileName, Set<String> errors) {
        if (errors.isEmpty()) {
            return;
        }
        logger.info("Validate file: {}", validatedFileName);
        for (String error : errors) {
            logger.info(error);
        }
    }

    private Set<String> validateXmlFile(String file) throws IOException {
        String serializedEnvironment = new String(Files.readAllBytes(Paths.get(file)));
        return validator.validateSchema(serializedEnvironment);
    }

    private Set<String> validateSerializedXmlFile(String serializedXml) {
        return validator.validateSchema(serializedXml);
    }

    // This method supplies the file paths of aas-spec-metamodel XML examples files from the test directory to the above test.
    private static Object[] fileProvider() {
        try (Stream<Path> paths = Files.walk(Paths.get(TEST_FILES_DIR))) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".xml"))
                    .map(Path::toAbsolutePath)
                    .map(Path::toString)
                    .toArray();
        } catch (IOException e) {
            // Handle the exception as appropriate for your test setup
            e.printStackTrace();
            return new String[0];
        }
    }
}
