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


import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;
import org.xmlunit.util.Predicate;


public class XmlSerializerTest {
    public static final java.io.File AASFULL_FILE = new java.io.File("src/test/resources/test_demo_full_example.xml");
    public static final java.io.File AASSIMPLE_FILE = new java.io.File("src/test/resources/xmlExample.xml");
    public static final java.io.File AASSIMPLE_FILE_WITH_TEST_NAMESPACE = new java.io.File("src/test/resources/xmlExampleWithModifiedPrefix.xml");
    public static final java.io.File AASFULL_FILE_WITH_ANNOTATED_RELATIONSHIP = new java.io.File("src/test/resources/annotated_relationship_example.xml");
    public static final java.io.File AASFULL_FILE_WITH_QUALIFIERS = new java.io.File("src/test/resources/qualifier_example.xml");
    public static final java.io.File AASFULL_FILE_WITH_OPERATIONS = new java.io.File("src/test/resources/operation_example.xml");
	public static final java.io.File AAS_WITH_EXTENSION_MINIMAL = new java.io.File("src/test/resources/admin-shell-io/Extension/minimal.xml");
	public static final java.io.File AAS_WITH_EXTENSION_MAXIMAL = new java.io.File("src/test/resources/admin-shell-io/Extension/maximal.xml");

    private static final Logger logger = LoggerFactory.getLogger(XmlSerializerTest.class);

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
	public void writeToFile() throws IOException, SerializationException {
        File file = tempFolder.newFile("output.xml");
		new XmlSerializer().write(file, AASSimple.createEnvironment());
        assertTrue(file.exists());
    }

    @Test
	public void serializeMinimal() throws SerializationException, SAXException {
        File file = new File("src/test/resources/minimum.xml");
        Environment environment = new DefaultEnvironment.Builder()
                .assetAdministrationShells(new DefaultAssetAdministrationShell.Builder()
                        .id("https://acplt.org/Test_AssetAdministrationShell")
                        .assetInformation(new DefaultAssetInformation.Builder()
                                .assetKind(AssetKind.INSTANCE)
                                .build())
                        .build())
            .build();
        validateXmlSerializer(file, environment);
    }

    @Test
	public void serializeSimpleWithTestNamespacePrefix() throws SerializationException, SAXException {
        Map<String, String> nsPrefixes = new HashMap<>(AasXmlNamespaceContext.PREFERRED_PREFIX_CONTEXT);
        nsPrefixes.put("test", nsPrefixes.get("aas"));
        nsPrefixes.remove("aas");
		validateXmlSerializer(AASSIMPLE_FILE_WITH_TEST_NAMESPACE, AASSimple.createEnvironment(), new XmlSerializer(nsPrefixes));
    }

    @Test
	public void serializeSimple() throws SerializationException, SAXException {
		validateXmlSerializer(AASSIMPLE_FILE, AASSimple.createEnvironment());
    }

    @Test
	public void serializeFull() throws SerializationException, SAXException {
		validateXmlSerializer(AASFULL_FILE, AASFull.createEnvironment());
    }

    @Test
	public void validateConceptDescriptionAgainstXsdSchema() throws SerializationException, SAXException {
        ConceptDescription object = AASSimple.createConceptDescriptionMaxRotationSpeed();
        Set<String> errors = validateAgainstXsdSchema( new XmlSerializer().write(new DefaultEnvironment.Builder().conceptDescriptions(object).build()));
        assertTrue(errors.isEmpty());
    }


    @Test
	public void validateMinimalOperationAgainstXsdSchema() throws SerializationException, SAXException {
        Submodel object = new DefaultSubmodel.Builder()
                .id("testSubmodel")
                .idShort("testSubmodel")
                .submodelElements(new DefaultOperation.Builder()
                        .idShort("operationToTest")
                        .inoutputVariables(new DefaultOperationVariable.Builder()
                                .value(new DefaultProperty.Builder()
                                        .idShort("inputProperty")
                                        .value("1")
                                        .valueType(DataTypeDefXSD.INT)
                                        .build())
                                .build())
                        .build())
        .build();
        String xml = new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(object).build());
        Set<String> errors = validateAgainstXsdSchema( xml );
        assertTrue(errors.isEmpty());
    }

	@Test
	public void validateGYearAgainstXsdSchema() throws SerializationException, SAXException {
		Submodel submodel = new DefaultSubmodel.Builder().id("yearTestSm").submodelElements(new DefaultProperty.Builder().idShort("yearTestProp").valueType(DataTypeDefXSD.GYEAR).build()).build();
		String xml = new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(submodel).build());
		Set<String> errors = validateAgainstXsdSchema(xml);
		assertTrue(errors.isEmpty());
	}


    @Test
	public void validateDocumentationSubmodelAgainstXsdSchema() throws SerializationException, SAXException {
        Submodel object = AASSimple.createSubmodelDocumentation();
        String xml = new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(object).build());
        Set<String> errors = validateAgainstXsdSchema( xml );
        assertTrue(errors.isEmpty());
    }


    @Test
	public void validateIsCaseOfAgainstXsdSchema() throws SerializationException, SAXException {
		ConceptDescription object = AASFull.createEnvironment().getConceptDescriptions().get(0);
        String xml = new XmlSerializer().write(new DefaultEnvironment.Builder().conceptDescriptions(object).build());
        Set<String> errors = validateAgainstXsdSchema( xml );
        assertTrue(errors.isEmpty());
    }

	@Test
	public void serializeAASWithExtensionMinimal() throws SerializationException, SAXException {
		validateXmlSerializer(AAS_WITH_EXTENSION_MINIMAL, Examples.EXTENSION_MINIMAL, new XmlSerializer());
    }

	@Test
	public void serializeAASWithExtensionMaximal() throws SerializationException, SAXException {
		validateXmlSerializer(AAS_WITH_EXTENSION_MAXIMAL, Examples.EXTENSION_MAXIMAL, new XmlSerializer());
	}

    private Set<String> validateAgainstXsdSchema(String xml) throws SAXException {
        return new XmlSchemaValidator().validateSchema(xml);
    }

    private void validateXmlSerializer(File expectedFile, Environment environment)
        throws SerializationException, SAXException {
        validateXmlSerializer(expectedFile, environment, new XmlSerializer());
    }

    private void validateXmlSerializer(File expectedFile, Environment environment, XmlSerializer xmlSerializer)
        throws SerializationException, SAXException {
        String actual = xmlSerializer.write(environment);
        Set<String> errors = validateAgainstXsdSchema(actual);
		logger.info(actual);
        logErrors(expectedFile.getName(), errors);
        assertTrue(errors.isEmpty());
        CompareMatcher xmlTestMatcher = CompareMatcher
                .isSimilarTo(expectedFile)
                .normalizeWhitespace()
                .ignoreComments()
                .withNodeFilter((Predicate<Node>) node -> {
                    return ignoreDefaults(node);
                }) // ignore default fields
                .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndAllAttributes)
                );
        MatcherAssert.assertThat(removeDefaults(actual), xmlTestMatcher);
    }

    private String removeDefaults(String aasXml) {
        aasXml = aasXml.replace("<aas:kind>Instance</aas:kind>", "");
        aasXml = aasXml.replace("<test:kind>Instance</test:kind>", "");
        aasXml = aasXml.replace("<aas:category>VARIABLE</aas:category>", "");
        aasXml = aasXml.replace("<test:category>VARIABLE</test:category>", "");
        aasXml = aasXml.replace("<aas:category>PROPERTY</aas:category>", ""); // TODO: only for ConceptDescriptions
        aasXml = aasXml.replace("<test:category>PROPERTY</test:category>", ""); // TODO: only for ConceptDescriptions
        aasXml = aasXml.replace("<aas:kind>ConceptQualifier</aas:kind>", "");
        aasXml = aasXml.replace("<test:kind>ConceptQualifier</test:kind>", "");
        aasXml = aasXml.replace("<aas:orderRelevant>true</aas:orderRelevant>", "");
        aasXml = aasXml.replace("<test:orderRelevant>true</test:orderRelevant>", "");
        return aasXml;
    }

    private boolean ignoreDefaults(Node node) {
        if (node.getLocalName() != null
                && node.getLocalName().equals("kind")
                && node.getFirstChild().getNodeValue().equals("Instance")) {
            return false;
        }

        if (node.getLocalName() != null
                && node.getLocalName().equals("category")
                && node.getFirstChild().getNodeValue().equals("VARIABLE")) {
            return false;
        }

		if (node.getLocalName() != null 
				&& node.getLocalName().equals("category") 
				&& node.getFirstChild().getNodeValue().equals("PROPERTY")) { // TODO: only for ConceptDescriptions
			return false;
		}

		if (node.getLocalName() != null 
				&& node.getLocalName().equals("orderRelevant") 
				&& node.getFirstChild().getNodeValue().equals("true")) {
			return false;
		}
		
        return true;
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
