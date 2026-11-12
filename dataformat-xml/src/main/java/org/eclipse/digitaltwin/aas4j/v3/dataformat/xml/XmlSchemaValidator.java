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

import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SchemaValidator;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class XmlSchemaValidator implements SchemaValidator {
  private static final String SCHEMA = "/AAS.xsd";
  protected Schema schema;

  public XmlSchemaValidator() throws SAXException {
    loadSchemaFromResource();
  }

  private void loadSchemaFromResource() throws SAXException {
    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    schema = factory.newSchema(getClass().getResource(SCHEMA));
  }

  @Override
  public Set<String> validateSchema(String serializedAASEnvironment) {
    Set<String> errorMessages = new HashSet<>();
    String normalized = stripBom(serializedAASEnvironment);
    try {
      Validator validator = schema.newValidator();
      // Defense in depth: never let the validator resolve external DTDs or schemas (XXE / SSRF).
      validator.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
      validator.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
      validator.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
      validator.validate(createHardenedSource(normalized));
    } catch (SAXException | IOException | ParserConfigurationException se) {
      errorMessages.add(se.getMessage());
      return errorMessages;
    }
    return errorMessages;
  }

  /**
   * Creates a {@link SAXSource} backed by a parser that rejects any DOCTYPE declaration and does
   * not process external entities. AAS XML documents never need a DOCTYPE, so rejecting it outright
   * prevents XML External Entity (XXE) attacks (CWE-611).
   */
  private static SAXSource createHardenedSource(String xml)
      throws SAXException, ParserConfigurationException {
    SAXParserFactory spf = SAXParserFactory.newInstance();
    spf.setNamespaceAware(true);
    spf.setXIncludeAware(false);
    spf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    spf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
    spf.setFeature("http://xml.org/sax/features/external-general-entities", false);
    spf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
    spf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
    XMLReader reader = spf.newSAXParser().getXMLReader();
    return new SAXSource(reader, new InputSource(new StringReader(xml)));
  }

  private static String stripBom(String value) {
    if (value == null || value.isEmpty()) {
      return value;
    }
    if (value.charAt(0) == '\uFEFF') {
      return value.substring(1);
    }
    return value;
  }
}
