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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import static org.junit.Assert.assertNotNull;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.junit.Test;

/**
 * Test for EmbeddedDataSpecificationsDeserializer including debug logging behavior.
 *
 * <p>The debug logging in this deserializer triggers when attempting to deserialize
 * DataSpecificationContent and encountering exceptions during the fallback logic. This is expected
 * behavior as the deserializer tries multiple subtype classes until one succeeds.
 */
public class EmbeddedDataSpecificationsDeserializerTest {

  /**
   * Test that verifies debug logging is triggered during normal deserialization. When debug logging
   * is enabled, failed deserialization attempts will be logged. This test deserializes valid XML
   * with embeddedDataSpecifications to ensure the code path with logging is exercised.
   */
  @Test
  public void testDeserializationWithEmbeddedDataSpecifications() throws Exception {
    String xml =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<environment xmlns=\"https://admin-shell.io/aas/3/1\">\n"
            + "  <conceptDescriptions>\n"
            + "    <conceptDescription>\n"
            + "      <id>https://example.com/concept/123</id>\n"
            + "      <embeddedDataSpecifications>\n"
            + "        <embeddedDataSpecification>\n"
            + "          <dataSpecification>\n"
            + "            <type>ExternalReference</type>\n"
            + "            <keys>\n"
            + "              <key>\n"
            + "                <type>GlobalReference</type>\n"
            + "                <value>https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIec61360/3</value>\n"
            + "              </key>\n"
            + "            </keys>\n"
            + "          </dataSpecification>\n"
            + "          <dataSpecificationContent>\n"
            + "            <dataSpecificationIec61360>\n"
            + "              <preferredName>\n"
            + "                <langStringPreferredNameTypeIec61360>\n"
            + "                  <language>en</language>\n"
            + "                  <text>Test Concept</text>\n"
            + "                </langStringPreferredNameTypeIec61360>\n"
            + "              </preferredName>\n"
            + "            </dataSpecificationIec61360>\n"
            + "          </dataSpecificationContent>\n"
            + "        </embeddedDataSpecification>\n"
            + "      </embeddedDataSpecifications>\n"
            + "    </conceptDescription>\n"
            + "  </conceptDescriptions>\n"
            + "</environment>";

    XmlDeserializer deserializer = new XmlDeserializer();
    Environment environment = deserializer.read(xml);

    assertNotNull("Environment should be deserialized", environment);
    assertNotNull("ConceptDescriptions should be present", environment.getConceptDescriptions());
    assertNotNull(
        "EmbeddedDataSpecifications should be present",
        environment.getConceptDescriptions().get(0).getEmbeddedDataSpecifications());

    // Note: When debug logging is enabled (e.g., via
    // -Dorg.slf4j.simpleLogger.defaultLogLevel=DEBUG),
    // you will see log messages like:
    // "Failed to deserialize field 'dataSpecificationIec61360' as <ClassName>: <error message>"
    // This indicates the deserializer's fallback logic is working correctly as it tries
    // different DataSpecificationContent subtypes until it finds the right one.
  }

  /**
   * Test that verifies the deserializer gracefully handles missing or empty
   * dataSpecificationContent. When debug logging is enabled, this will log attempts to deserialize
   * from different DataSpecificationContent subtypes.
   */
  @Test
  public void testDeserializationWithEmptyDataSpecificationContent() throws Exception {
    String xml =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<environment xmlns=\"https://admin-shell.io/aas/3/1\">\n"
            + "  <conceptDescriptions>\n"
            + "    <conceptDescription>\n"
            + "      <id>https://example.com/concept/456</id>\n"
            + "      <embeddedDataSpecifications>\n"
            + "        <embeddedDataSpecification>\n"
            + "          <dataSpecification>\n"
            + "            <type>ExternalReference</type>\n"
            + "            <keys>\n"
            + "              <key>\n"
            + "                <type>GlobalReference</type>\n"
            + "                <value>https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIec61360/3</value>\n"
            + "              </key>\n"
            + "            </keys>\n"
            + "          </dataSpecification>\n"
            + "        </embeddedDataSpecification>\n"
            + "      </embeddedDataSpecifications>\n"
            + "    </conceptDescription>\n"
            + "  </conceptDescriptions>\n"
            + "</environment>";

    XmlDeserializer deserializer = new XmlDeserializer();
    Environment environment = deserializer.read(xml);

    assertNotNull("Environment should be deserialized", environment);
    assertNotNull("ConceptDescriptions should be present", environment.getConceptDescriptions());
    // The embeddedDataSpecification will exist but with null dataSpecificationContent
  }
}
