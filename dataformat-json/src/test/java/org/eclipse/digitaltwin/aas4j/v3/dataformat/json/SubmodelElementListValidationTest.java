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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SubmodelElementListConstraintValidator;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubmodelElementListValidationTest {

  private static JsonDeserializer deserializer;
  private static SubmodelElementListConstraintValidator validator;

  @BeforeClass
  public static void setup() {
    deserializer = new JsonDeserializer();
    validator = new SubmodelElementListConstraintValidator();
  }

  @Test
  public void validList_passesDeserialization_andValidation() throws Exception {
    String json =
        "{"
            + "\"modelType\":\"SubmodelElementList\","
            + "\"idShort\":\"testList\","
            + "\"typeValueListElement\":\"Property\","
            + "\"value\":["
            + "  {\"modelType\":\"Property\",\"idShort\":\"p1\",\"valueType\":\"xs:string\"},"
            + "  {\"modelType\":\"Property\",\"idShort\":\"p2\",\"valueType\":\"xs:string\"}"
            + "]"
            + "}";
    SubmodelElementList result = deserializer.read(json, SubmodelElementList.class);
    assertTrue(validator.validate(result).isEmpty());
  }

  @Test
  public void typeMismatch_deserializationSucceeds_validationFails() throws Exception {
    String json =
        "{"
            + "\"modelType\":\"SubmodelElementList\","
            + "\"idShort\":\"testList\","
            + "\"typeValueListElement\":\"Property\","
            + "\"value\":["
            + "  {\"modelType\":\"Property\",\"idShort\":\"p1\",\"valueType\":\"xs:string\"},"
            + "  {\"modelType\":\"Blob\",\"idShort\":\"b1\"}"
            + "]"
            + "}";
    SubmodelElementList result = deserializer.read(json, SubmodelElementList.class);
    assertFalse(validator.validate(result).isEmpty());
  }

  @Test
  public void valueTypeMismatch_deserializationSucceeds_validationFails() throws Exception {
    String json =
        "{"
            + "\"modelType\":\"SubmodelElementList\","
            + "\"idShort\":\"testList\","
            + "\"typeValueListElement\":\"Property\","
            + "\"valueTypeListElement\":\"xs:string\","
            + "\"value\":["
            + "  {\"modelType\":\"Property\",\"idShort\":\"p1\",\"valueType\":\"xs:int\"}"
            + "]"
            + "}";
    SubmodelElementList result = deserializer.read(json, SubmodelElementList.class);
    assertFalse(validator.validate(result).isEmpty());
  }

  @Test
  public void listNestedInSubmodelElementList_innerViolationDetectedByValidator() throws Exception {
    String json =
        "{"
            + "\"modelType\":\"SubmodelElementList\","
            + "\"idShort\":\"outer\","
            + "\"typeValueListElement\":\"SubmodelElementList\","
            + "\"value\":["
            + "  {"
            + "    \"modelType\":\"SubmodelElementList\","
            + "    \"idShort\":\"inner\","
            + "    \"typeValueListElement\":\"Property\","
            + "    \"value\":["
            + "      {\"modelType\":\"Blob\",\"idShort\":\"b1\"}"
            + "    ]"
            + "  }"
            + "]"
            + "}";
    SubmodelElementList outer = deserializer.read(json, SubmodelElementList.class);
    // outer is valid (contains SubmodelElementLists), but inner list is not
    assertTrue(validator.validate(outer).isEmpty());
    SubmodelElementList inner = (SubmodelElementList) outer.getValue().get(0);
    assertFalse(validator.validate(inner).isEmpty());
  }
}
