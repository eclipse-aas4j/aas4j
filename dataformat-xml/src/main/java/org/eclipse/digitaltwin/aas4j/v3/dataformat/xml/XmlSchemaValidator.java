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
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SchemaValidator;
import org.xml.sax.SAXException;

public class XmlSchemaValidator implements SchemaValidator {
  private static final String SCHEMA = "/AAS.xsd";
  protected Schema schema;

  public XmlSchemaValidator() throws SAXException {
    loadSchemaFromResource();
  }

  private void loadSchemaFromResource() throws SAXException {
    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    schema = factory.newSchema(getClass().getResource(SCHEMA));
  }

  @Override
  public Set<String> validateSchema(String serializedAASEnvironment) {
    Set<String> errorMessages = new HashSet<>();
    String normalized = stripBom(serializedAASEnvironment);
    try {
      schema.newValidator().validate(new StreamSource(new StringReader(normalized)));
    } catch (SAXException | IOException se) {
      errorMessages.add(se.getMessage());
      return errorMessages;
    }
    return errorMessages;
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
