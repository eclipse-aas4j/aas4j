/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SubmodelElementListConstraintValidator;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubmodelElementListValidationTest {

  private static XmlDeserializer deserializer;
  private static SubmodelElementListConstraintValidator validator;

  @BeforeClass
  public static void setup() {
    deserializer = new XmlDeserializer();
    validator = new SubmodelElementListConstraintValidator();
  }

  private static String wrap(String submodelElementListXml) {
    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
        + "<environment xmlns=\"https://admin-shell.io/aas/3/1\">"
        + "<submodels><submodel><id>test</id><idShort>test</idShort>"
        + "<submodelElements>"
        + submodelElementListXml
        + "</submodelElements></submodel></submodels>"
        + "</environment>";
  }

  private SubmodelElementList firstList(String xml) throws Exception {
    Environment env = deserializer.read(xml);
    return (SubmodelElementList) env.getSubmodels().get(0).getSubmodelElements().get(0);
  }

  @Test
  public void validList_passesDeserialization_andValidation() throws Exception {
    String xml =
        wrap(
            "<submodelElementList>"
                + "<idShort>testList</idShort>"
                + "<typeValueListElement>Property</typeValueListElement>"
                + "<value>"
                + "<property><idShort>p1</idShort><valueType>xs:string</valueType></property>"
                + "<property><idShort>p2</idShort><valueType>xs:string</valueType></property>"
                + "</value>"
                + "</submodelElementList>");
    assertTrue(validator.validate(firstList(xml)).isEmpty());
  }

  @Test
  public void typeMismatch_deserializationSucceeds_validationFails() throws Exception {
    String xml =
        wrap(
            "<submodelElementList>"
                + "<idShort>testList</idShort>"
                + "<typeValueListElement>Property</typeValueListElement>"
                + "<value>"
                + "<property><idShort>p1</idShort><valueType>xs:string</valueType></property>"
                + "<blob><idShort>b1</idShort></blob>"
                + "</value>"
                + "</submodelElementList>");
    assertFalse(validator.validate(firstList(xml)).isEmpty());
  }

  @Test
  public void valueTypeMismatch_deserializationSucceeds_validationFails() throws Exception {
    String xml =
        wrap(
            "<submodelElementList>"
                + "<idShort>testList</idShort>"
                + "<typeValueListElement>Property</typeValueListElement>"
                + "<valueTypeListElement>xs:string</valueTypeListElement>"
                + "<value>"
                + "<property><idShort>p1</idShort><valueType>xs:int</valueType></property>"
                + "</value>"
                + "</submodelElementList>");
    assertFalse(validator.validate(firstList(xml)).isEmpty());
  }

  @Test
  public void listNestedInSubmodelElementList_innerViolationDetectedByValidator() throws Exception {
    String xml =
        wrap(
            "<submodelElementList>"
                + "<idShort>outer</idShort>"
                + "<typeValueListElement>SubmodelElementList</typeValueListElement>"
                + "<value>"
                + "<submodelElementList>"
                + "<idShort>inner</idShort>"
                + "<typeValueListElement>Property</typeValueListElement>"
                + "<value>"
                + "<blob><idShort>b1</idShort></blob>"
                + "</value>"
                + "</submodelElementList>"
                + "</value>"
                + "</submodelElementList>");
    SubmodelElementList outer = firstList(xml);
    // outer is valid (contains SubmodelElementLists)
    assertTrue(validator.validate(outer).isEmpty());
    SubmodelElementList inner = (SubmodelElementList) outer.getValue().get(0);
    assertFalse(validator.validate(inner).isEmpty());
  }
}
