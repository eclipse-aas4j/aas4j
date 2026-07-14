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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.junit.Before;
import org.junit.Test;

public class SubmodelElementListConstraintValidatorTest {

  private SubmodelElementListConstraintValidator validator;

  @Before
  public void setup() {
    validator = new SubmodelElementListConstraintValidator();
  }

  @Test
  public void validList_returnsEmptySet() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.STRING).build(),
            new DefaultProperty.Builder().idShort("p2").valueType(DataTypeDefXsd.STRING).build()));

    assertTrue(validator.validate(list).isEmpty());
  }

  @Test
  public void typeMismatch_returnsViolation() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.STRING).build(),
            new DefaultBlob.Builder().idShort("b1").build()));

    Set<String> errors = validator.validate(list);
    assertFalse(errors.isEmpty());
    assertTrue(errors.iterator().next().contains("typeValueListElement"));
  }

  @Test
  public void valueTypeMismatch_returnsViolation() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.INT).build()));

    Set<String> errors = validator.validate(list);
    assertFalse(errors.isEmpty());
    assertTrue(errors.iterator().next().contains("valueTypeListElement"));
  }

  @Test
  public void rangeMismatch_returnsViolation() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.RANGE);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    list.setValue(
        Arrays.asList(
            new DefaultRange.Builder().idShort("r1").valueType(DataTypeDefXsd.INT).build()));

    Set<String> errors = validator.validate(list);
    assertFalse(errors.isEmpty());
  }

  @Test
  public void emptyList_returnsEmptySet() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(Collections.emptyList());

    assertTrue(validator.validate(list).isEmpty());
  }

  @Test
  public void noDeclaredType_returnsEmptySet() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setValue(Arrays.asList(new DefaultBlob.Builder().idShort("b1").build()));

    assertTrue(validator.validate(list).isEmpty());
  }

  @Test
  public void bothViolations_returnsTwoErrors() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    // Blob violates typeValueListElement; property violates valueTypeListElement
    list.setValue(
        Arrays.asList(
            new DefaultBlob.Builder().idShort("b1").build(),
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.INT).build()));

    assertEquals(2, validator.validate(list).size());
  }
}
