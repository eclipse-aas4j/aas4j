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

import java.io.FileNotFoundException;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

public class XMLDeserializerTest {

  @Test
  public void deserializeAASSimple() throws FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASSIMPLE_FILE);

    Assert.assertEquals(AASSimple.createEnvironment(), env);
  }

  @Test
  public void deserializeAASSimpleAAS() throws Exception {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASSIMPLE_FILE);

    Assert.assertEquals(
        AASSimple.createEnvironment().getAssetAdministrationShells(),
        env.getAssetAdministrationShells());
  }

  @Test
  public void deserializeAASSimpleSubmodel() throws Exception {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASSIMPLE_FILE);

    Assert.assertEquals(AASSimple.createEnvironment().getSubmodels(), env.getSubmodels());
  }

  @Test
  public void deserializeAASSimpleConceptDescription() throws Exception {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASSIMPLE_FILE);

    Assert.assertEquals(
        AASSimple.createEnvironment().getConceptDescriptions(), env.getConceptDescriptions());
  }

  @Test
  public void deserializeAnnotedRelationshipElement() throws Exception {
    Environment env =
        new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_ANNOTATED_RELATIONSHIP);
    Assert.assertNotNull(env);
  }

  @Test
  public void deserializeQualifier() throws Exception {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_QUALIFIERS);
    Assert.assertNotNull(env);
    String[] qualifierValues =
        env.getSubmodels().stream()
            .map(Submodel::getSubmodelElements)
            .flatMap(List::stream)
            .map(SubmodelElement::getQualifiers)
            .flatMap(List::stream)
            .map(Qualifier::getValue)
            .toArray(String[]::new);
    Assert.assertArrayEquals(new String[] {"100", "50"}, qualifierValues);
  }

  @Test
  public void deserializeOperation() throws Exception {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_OPERATIONS);
    Assert.assertNotNull(env);

    OperationVariable inputVariable =
        ((Operation) env.getSubmodels().get(0).getSubmodelElements().get(0))
            .getInputVariables()
            .get(0);
    Assert.assertNotNull(inputVariable.getValue());

    OperationVariable outputVariable =
        ((Operation) env.getSubmodels().get(0).getSubmodelElements().get(0))
            .getOutputVariables()
            .get(0);
    Assert.assertNotNull(outputVariable.getValue());

    OperationVariable inoutputVariable =
        ((Operation) env.getSubmodels().get(0).getSubmodelElements().get(0))
            .getInoutputVariables()
            .get(0);
    Assert.assertNotNull(inoutputVariable.getValue());
  }

  @Test
  public void deserializeAASFull() throws FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE);
    Environment expectedEnv = AASFull.createEnvironment();
    Assert.assertEquals(expectedEnv, env);
  }

  @Test
  public void deserializeAASFullAAS() throws FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE);
    Assert.assertEquals(
        AASFull.createEnvironment().getAssetAdministrationShells(),
        env.getAssetAdministrationShells());
  }

  @Test
  public void deserializeAASFullSubmodel() throws FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE);

    Assert.assertEquals(AASFull.createEnvironment().getSubmodels(), env.getSubmodels());
  }

  @Test
  public void deserializeAASFullConceptDescription()
      throws FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE);

    Assert.assertEquals(
        AASFull.createEnvironment().getConceptDescriptions(), env.getConceptDescriptions());
  }

  @Test
  public void deserializeAASWithExtensionMinimal()
      throws SerializationException, SAXException, FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AAS_WITH_EXTENSION_MINIMAL);

    Assert.assertEquals(Examples.EXTENSION_MINIMAL, env);
  }

  @Test
  public void deserializeAASWithExtensionMaximal()
      throws SerializationException, SAXException, FileNotFoundException, DeserializationException {
    Environment env = new XmlDeserializer().read(XmlSerializerTest.AAS_WITH_EXTENSION_MAXIMAL);

    Assert.assertEquals(Examples.EXTENSION_MAXIMAL, env);
  }

  @Test
  public void deserializeWithEmptyKeys() throws FileNotFoundException, DeserializationException {
    java.io.File file = new java.io.File("src/test/resources/empty_entries.xml");
    new XmlDeserializer().read(file);
  }

  @Test
  public void deserializeEmbeddedDataSpecificationsInSubmodelElement() throws Exception {
    String xml =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<aas:environment xmlns:aas=\"https://admin-shell.io/aas/3/1\"\n"
            + "                 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
            + "                 xsi:schemaLocation=\"https://admin-shell.io/aas/3/1 AAS.xsd\">\n"
            + "  <aas:submodels>\n"
            + "    <aas:submodel>\n"
            + "      <aas:idShort>sm1</aas:idShort>\n"
            + "      <aas:id>urn:example:submodel:1</aas:id>\n"
            + "      <aas:kind>Instance</aas:kind>\n"
            + "      <aas:submodelElements>\n"
            + "        <aas:file>\n"
            + "          <aas:idShort>file1</aas:idShort>\n"
            + "          <aas:embeddedDataSpecifications>\n"
            + "            <aas:embeddedDataSpecification>\n"
            + "              <aas:dataSpecification>\n"
            + "                <aas:type>ExternalReference</aas:type>\n"
            + "                <aas:keys>\n"
            + "                  <aas:key>\n"
            + "                    <aas:type>GlobalReference</aas:type>\n"
            + "                    <aas:value>https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIec61360/3</aas:value>\n"
            + "                  </aas:key>\n"
            + "                </aas:keys>\n"
            + "              </aas:dataSpecification>\n"
            + "              <aas:dataSpecificationContent>\n"
            + "                <aas:dataSpecificationIec61360>\n"
            + "                  <aas:preferredName>\n"
            + "                    <aas:langStringPreferredNameTypeIec61360>\n"
            + "                      <aas:language>en</aas:language>\n"
            + "                      <aas:text>Test Spec</aas:text>\n"
            + "                    </aas:langStringPreferredNameTypeIec61360>\n"
            + "                  </aas:preferredName>\n"
            + "                </aas:dataSpecificationIec61360>\n"
            + "              </aas:dataSpecificationContent>\n"
            + "            </aas:embeddedDataSpecification>\n"
            + "          </aas:embeddedDataSpecifications>\n"
            + "          <aas:value>file:///test.txt</aas:value>\n"
            + "        </aas:file>\n"
            + "      </aas:submodelElements>\n"
            + "    </aas:submodel>\n"
            + "  </aas:submodels>\n"
            + "</aas:environment>\n";

    Environment env = new XmlDeserializer().read(xml);
    File file = (File) env.getSubmodels().get(0).getSubmodelElements().get(0);
    List<EmbeddedDataSpecification> specs = file.getEmbeddedDataSpecifications();
    Assert.assertNotNull(specs);
    Assert.assertFalse(specs.isEmpty());
    Assert.assertNotNull(specs.get(0).getDataSpecificationContent());
  }
}
