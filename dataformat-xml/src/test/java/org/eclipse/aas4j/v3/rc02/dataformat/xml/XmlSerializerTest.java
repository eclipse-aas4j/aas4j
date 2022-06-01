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
package org.eclipse.aas4j.v3.rc02.dataformat.xml;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.aas4j.v3.rc02.dataformat.core.AASFull;
import org.eclipse.aas4j.v3.rc02.dataformat.core.AASSimple;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.eclipse.aas4j.v3.rc02.dataformat.SerializationException;
import org.eclipse.aas4j.v3.rc02.model.Environment;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultEnvironment;

public class XmlSerializerTest {
    public static final java.io.File AASFULL_FILE = new java.io.File("src/test/resources/test_demo_full_example.xml");
    public static final java.io.File AASSIMPLE_FILE = new java.io.File("src/test/resources/xmlExample.xml");
    public static final java.io.File AASSIMPLE_FILE_WITH_TEST_NAMESPACE = new java.io.File("src/test/resources/xmlExampleWithModifiedPrefix.xml");

    private static final Logger logger = LoggerFactory.getLogger(XmlSerializerTest.class);

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteToFile() throws JsonProcessingException, IOException, SerializationException {
        File file = tempFolder.newFile("output.xml");
        new XmlSerializer().write(file, AASSimple.ENVIRONMENT);
        assertTrue(file.exists());
    }

    @Test
    public void testSerializeMinimal() throws IOException, SerializationException, SAXException {
        File file = new File("src/test/resources/minimum.xml");
        Environment environment = new DefaultEnvironment.Builder()
            .build();
        validateXmlSerializer(file, environment);
    }

    @Test
    public void testSerializeSimpleWithTestNamespacePrefix() throws IOException, SerializationException, SAXException {
        Map<String, String> nsPrefixes = new HashMap<>(AasXmlNamespaceContext.PREFERRED_PREFIX_CONTEXT);
        nsPrefixes.put("test", nsPrefixes.get("aas"));
        nsPrefixes.remove("aas");
        validateXmlSerializer(AASSIMPLE_FILE_WITH_TEST_NAMESPACE, AASSimple.ENVIRONMENT, new XmlSerializer(nsPrefixes));
    }

    @Test
    public void testSerializeSimple() throws IOException, SerializationException, SAXException {
        validateXmlSerializer(AASSIMPLE_FILE, AASSimple.ENVIRONMENT);
    }

    @Test
    public void testSerializeFull() throws IOException, SerializationException, SAXException {
        validateXmlSerializer(AASFULL_FILE, AASFull.ENVIRONMENT);
    }

    private void validateXmlSerializer(File expectedFile, Environment environment)
        throws IOException, SerializationException, SAXException {
        validateXmlSerializer(expectedFile, environment, new XmlSerializer());
    }

    private void validateXmlSerializer(File expectedFile, Environment environment, XmlSerializer xmlSerializer)
        throws SerializationException, SAXException {
        String actual = xmlSerializer.write(environment);
        Set<String> errors = new XmlSchemaValidator().validateSchema(actual);
        logger.info(actual);
        logErrors(expectedFile.getName(), errors);
        assertTrue(errors.isEmpty());
        CompareMatcher xmlTestMatcher = CompareMatcher.isSimilarTo(expectedFile).normalizeWhitespace().ignoreComments()
            .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndAllAttributes));
        MatcherAssert.assertThat(actual, xmlTestMatcher);
    }

    private void logErrors(String validatedFileName, Set<String> errors) {
        if (errors.isEmpty())
            return;
        logger.info("Validate file: " + validatedFileName);
        for (String error : errors) {
            logger.info(error);
        }
    }
}
