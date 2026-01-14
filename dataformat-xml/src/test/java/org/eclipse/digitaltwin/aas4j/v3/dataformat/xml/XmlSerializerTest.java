/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.DefaultDummyDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultExtension;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
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
  public static final java.io.File AASFULL_FILE =
      new java.io.File("src/test/resources/test_demo_full_example.xml");
  public static final java.io.File AASSIMPLE_FILE =
      new java.io.File("src/test/resources/xmlExample.xml");
  public static final java.io.File AASSIMPLE_FILE_WITH_TEST_NAMESPACE =
      new java.io.File("src/test/resources/xmlExampleWithModifiedPrefix.xml");
  public static final java.io.File AASFULL_FILE_WITH_ANNOTATED_RELATIONSHIP =
      new java.io.File("src/test/resources/annotated_relationship_example.xml");
  public static final java.io.File AASFULL_FILE_WITH_QUALIFIERS =
      new java.io.File("src/test/resources/qualifier_example.xml");
  public static final java.io.File AASFULL_FILE_WITH_OPERATIONS =
      new java.io.File("src/test/resources/operation_example.xml");
  public static final java.io.File AAS_WITH_EXTENSION_MINIMAL =
      new java.io.File("src/test/resources/admin-shell-io/Extension/minimal.xml");
  public static final java.io.File AAS_WITH_EXTENSION_MAXIMAL =
      new java.io.File("src/test/resources/admin-shell-io/Extension/maximal.xml");

  private static final Logger logger = LoggerFactory.getLogger(XmlSerializerTest.class);

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Test
  public void writeToFile() throws IOException, SerializationException {
    File file = tempFolder.newFile("output.xml");
    new XmlSerializer().write(file, AASSimple.createEnvironment());
    assertTrue(file.exists());
  }

  @Test
  public void serializeMinimal() throws SerializationException, SAXException {
    File file = new File("src/test/resources/minimum.xml");
    Environment environment =
        new DefaultEnvironment.Builder()
            .assetAdministrationShells(
                new DefaultAssetAdministrationShell.Builder()
                    .id("https://acplt.org/Test_AssetAdministrationShell")
                    .assetInformation(
                        new DefaultAssetInformation.Builder().assetKind(AssetKind.INSTANCE).build())
                    .build())
            .build();
    validateXmlSerializer(file, environment);
  }

  @Test
  public void serializeSimpleWithTestNamespacePrefix() throws SerializationException, SAXException {
    Map<String, String> nsPrefixes = new HashMap<>(AasXmlNamespaceContext.PREFERRED_PREFIX_CONTEXT);
    nsPrefixes.put("test", nsPrefixes.get("aas"));
    nsPrefixes.remove("aas");
    validateXmlSerializer(
        AASSIMPLE_FILE_WITH_TEST_NAMESPACE,
        AASSimple.createEnvironment(),
        new XmlSerializer(nsPrefixes));
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
  public void serializationDoesNotChangeEnvironment() throws SerializationException, SAXException {
    Environment env = AASSimple.createEnvironment();
    validateXmlSerializer(AASSIMPLE_FILE, env);
    assertEquals(AASSimple.createEnvironment(), env);
  }

  @Test
  public void validateConceptDescriptionAgainstXsdSchema()
      throws SerializationException, SAXException {
    ConceptDescription object = AASSimple.createConceptDescriptionMaxRotationSpeed();
    Set<String> errors =
        validateAgainstXsdSchema(
            new XmlSerializer()
                .write(new DefaultEnvironment.Builder().conceptDescriptions(object).build()));
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateAssetAdministrationShellOrderAgainstXsdSchema()
      throws SerializationException, SAXException {
    Environment env =
        new DefaultEnvironment.Builder()
            .assetAdministrationShells(
                new DefaultAssetAdministrationShell.Builder()
                    .id("http://example.org/aas/1")
                    .idShort("aas1")
                    .displayName(
                        new DefaultLangStringNameType.Builder()
                            .text("Example AAS")
                            .language("en")
                            .build())
                    .assetInformation(
                        new DefaultAssetInformation.Builder().assetKind(AssetKind.INSTANCE).build())
                    .submodels(
                        new DefaultReference.Builder()
                            .type(ReferenceTypes.MODEL_REFERENCE)
                            .keys(
                                new DefaultKey.Builder()
                                    .type(KeyTypes.SUBMODEL)
                                    .value("http://example.org/submodel/1")
                                    .build())
                            .build())
                    .build())
            .build();
    String xml = new XmlSerializer().write(env);
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateMinimalOperationAgainstXsdSchema()
      throws SerializationException, SAXException {
    Submodel object =
        new DefaultSubmodel.Builder()
            .id("testSubmodel")
            .idShort("testSubmodel")
            .submodelElements(
                new DefaultOperation.Builder()
                    .idShort("operationToTest")
                    .inoutputVariables(
                        new DefaultOperationVariable.Builder()
                            .value(
                                new DefaultProperty.Builder()
                                    .idShort("inputProperty")
                                    .value("1")
                                    .valueType(DataTypeDefXsd.INT)
                                    .build())
                            .build())
                    .build())
            .build();
    String xml =
        new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(object).build());
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateOperationWithMetadataAgainstXsdSchema()
      throws SerializationException, SAXException {
    Submodel object =
        new DefaultSubmodel.Builder()
            .id("testSubmodel")
            .idShort("testSubmodel")
            .submodelElements(
                new DefaultOperation.Builder()
                    .idShort("operationToTest")
                    .embeddedDataSpecifications(
                        new DefaultEmbeddedDataSpecification.Builder()
                            .dataSpecification(
                                new DefaultReference.Builder()
                                    .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                    .keys(
                                        new DefaultKey.Builder()
                                            .type(KeyTypes.GLOBAL_REFERENCE)
                                            .value(
                                                "https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIec61360/3")
                                            .build())
                                    .build())
                            .dataSpecificationContent(
                                new DefaultDataSpecificationIec61360.Builder()
                                    .preferredName(
                                        new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                            .text("Example Spec")
                                            .language("en")
                                            .build())
                                    .dataType(DataTypeIec61360.STRING)
                                    .build())
                            .build())
                    .extensions(new DefaultExtension.Builder().name("ext1").build())
                    .extensions(new DefaultExtension.Builder().name("ext2").build())
                    .supplementalSemanticIds(
                        new DefaultReference.Builder()
                            .type(ReferenceTypes.MODEL_REFERENCE)
                            .keys(
                                new DefaultKey.Builder()
                                    .type(KeyTypes.SUBMODEL)
                                    .value("testSubmodel")
                                    .build())
                            .build())
                    .qualifiers(
                        new DefaultQualifier.Builder()
                            .type("qualifier_type")
                            .valueType(DataTypeDefXsd.STRING)
                            .build())
                    .displayName(
                        new DefaultLangStringNameType.Builder()
                            .text("Operation")
                            .language("en")
                            .build())
                    .build())
            .build();
    String xml =
        new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(object).build());
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateGYearAgainstXsdSchema() throws SerializationException, SAXException {
    Submodel submodel =
        new DefaultSubmodel.Builder()
            .id("yearTestSm")
            .submodelElements(
                new DefaultProperty.Builder()
                    .idShort("yearTestProp")
                    .valueType(DataTypeDefXsd.GYEAR)
                    .build())
            .build();
    String xml =
        new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(submodel).build());
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateDocumentationSubmodelAgainstXsdSchema()
      throws SerializationException, SAXException {
    Submodel object = AASSimple.createSubmodelDocumentation();
    String xml =
        new XmlSerializer().write(new DefaultEnvironment.Builder().submodels(object).build());
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void validateIsCaseOfAgainstXsdSchema() throws SerializationException, SAXException {
    ConceptDescription object = AASFull.createEnvironment().getConceptDescriptions().get(0);
    String xml =
        new XmlSerializer()
            .write(new DefaultEnvironment.Builder().conceptDescriptions(object).build());
    Set<String> errors = validateAgainstXsdSchema(xml);
    assertTrue(errors.isEmpty());
  }

  @Test
  public void serializeAASWithExtensionMinimal() throws SerializationException, SAXException {
    validateXmlSerializer(
        AAS_WITH_EXTENSION_MINIMAL, Examples.EXTENSION_MINIMAL, new XmlSerializer());
  }

  @Test
  public void serializeAASWithExtensionMaximal() throws SerializationException, SAXException {
    validateXmlSerializer(
        AAS_WITH_EXTENSION_MAXIMAL, Examples.EXTENSION_MAXIMAL, new XmlSerializer());
  }

  /**
   * This test ensures that future DataSpecificationContents can be added without adjustments in the
   * code.
   *
   * @throws SerializationException
   * @throws DeserializationException
   */
  @Test
  public void testSerializeCustomDataSpecification()
      throws SerializationException, DeserializationException, SAXException {
    XmlSerializer serializer = new XmlSerializer();
    XmlDeserializer deserializer = new XmlDeserializer();

    // This is the only way to make the serialization to work.
    Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
    subtypes.add(DefaultDummyDataSpecification.class);

    String xmlString = serializer.write(Examples.ENVIRONMENT_WITH_DUMMYDATASPEC);
    assertNotNull(xmlString);

    validateAgainstXsdSchema(xmlString);

    Environment copy = deserializer.read(xmlString);
    assertNotNull(copy);

    assertTrue(Examples.ENVIRONMENT_WITH_DUMMYDATASPEC.equals(copy));
  }

  @Test
  public void testOperationWithMultipleInputVariables() throws Exception {
    Environment expected =
        new DefaultEnvironment.Builder()
            .assetAdministrationShells(
                new DefaultAssetAdministrationShell.Builder()
                    .id("http://example.org/aas/1")
                    .idShort("aas1")
                    .submodels(
                        new DefaultReference.Builder()
                            .keys(
                                Arrays.asList(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value("http://example.org/submodel/1")
                                        .build()))
                            .type(ReferenceTypes.MODEL_REFERENCE)
                            .build())
                    .build())
            .submodels(
                new DefaultSubmodel.Builder()
                    .id("http://example.org/submodel/1")
                    .idShort("submodel1")
                    .submodelElements(
                        new DefaultOperation.Builder()
                            .idShort("operation1")
                            .inputVariables(
                                new DefaultOperationVariable.Builder()
                                    .value(
                                        new DefaultProperty.Builder()
                                            .idShort("input1")
                                            .valueType(DataTypeDefXsd.STRING)
                                            .build())
                                    .build())
                            .inputVariables(
                                new DefaultOperationVariable.Builder()
                                    .value(
                                        new DefaultProperty.Builder()
                                            .idShort("input2")
                                            .valueType(DataTypeDefXsd.STRING)
                                            .build())
                                    .build())
                            .outputVariables(
                                new DefaultOperationVariable.Builder()
                                    .value(
                                        new DefaultProperty.Builder()
                                            .idShort("output1")
                                            .valueType(DataTypeDefXsd.STRING)
                                            .build())
                                    .build())
                            .outputVariables(
                                new DefaultOperationVariable.Builder()
                                    .value(
                                        new DefaultProperty.Builder()
                                            .idShort("output2")
                                            .valueType(DataTypeDefXsd.STRING)
                                            .build())
                                    .build())
                            .build())
                    .build())
            .build();

    //		new XmlSerializer().write(new FileOutputStream("test.xml"), expected);
    //		Environment actual = new XmlDeserializer().read(new FileInputStream("test.xml"));
    java.io.File file = java.io.File.createTempFile("model", "xml");
    new XmlSerializer().write(new FileOutputStream(file), expected);
    Environment actual = new XmlDeserializer().read(file);
    assertEquals(expected, actual);

    assertEquals(expected, actual);
  }

  private Set<String> validateAgainstXsdSchema(String xml) throws SAXException {
    return new XmlSchemaValidator().validateSchema(xml);
  }

  private void validateXmlSerializer(File expectedFile, Environment environment)
      throws SerializationException, SAXException {
    validateXmlSerializer(expectedFile, environment, new XmlSerializer());
  }

  private void validateXmlSerializer(
      File expectedFile, Environment environment, XmlSerializer xmlSerializer)
      throws SerializationException, SAXException {
    String actual = xmlSerializer.write(environment);
    Set<String> errors = validateAgainstXsdSchema(actual);
    logErrors(expectedFile.getName(), errors);
    assertTrue(errors.isEmpty());
    CompareMatcher xmlTestMatcher =
        CompareMatcher.isSimilarTo(expectedFile)
            .normalizeWhitespace()
            .ignoreComments()
            .withNodeFilter(
                (Predicate<Node>)
                    node -> {
                      return ignoreDefaults(node);
                    }) // ignore default fields
            .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndAllAttributes));
    MatcherAssert.assertThat(removeDefaults(actual), xmlTestMatcher);
  }

  private String removeDefaults(String aasXml) {
    aasXml = aasXml.replace("<aas:kind>Instance</aas:kind>", "");
    aasXml = aasXml.replace("<test:kind>Instance</test:kind>", "");
    aasXml = aasXml.replace("<aas:category>VARIABLE</aas:category>", "");
    aasXml = aasXml.replace("<test:category>VARIABLE</test:category>", "");
    aasXml = aasXml.replace("<aas:category>PROPERTY</aas:category>", "");
    aasXml = aasXml.replace("<test:category>PROPERTY</test:category>", "");
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
        && node.getFirstChild().getNodeValue().equals("PROPERTY")) {
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
    if (errors.isEmpty()) {
      return;
    }
    logger.info("Validate file: {}", validatedFileName);
    for (String error : errors) {
      logger.info(error);
    }
  }
}
