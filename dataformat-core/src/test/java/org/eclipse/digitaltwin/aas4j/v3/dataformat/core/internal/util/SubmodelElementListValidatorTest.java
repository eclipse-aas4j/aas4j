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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util;

import static org.junit.Assert.assertThrows;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.junit.Test;

public class SubmodelElementListValidatorTest {

  // --- validateTypeValueListElement ---

  @Test
  public void typeValue_allMatch_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.STRING).build(),
            new DefaultProperty.Builder().idShort("p2").valueType(DataTypeDefXsd.INT).build()));

    SubmodelElementListValidator.validateTypeValueListElement(list);
  }

  @Test
  public void typeValue_mismatch_throws() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.STRING).build(),
            new DefaultBlob.Builder().idShort("b1").build()));

    assertThrows(
        IOException.class, () -> SubmodelElementListValidator.validateTypeValueListElement(list));
  }

  @Test
  public void typeValue_emptyList_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(Collections.emptyList());

    SubmodelElementListValidator.validateTypeValueListElement(list);
  }

  @Test
  public void typeValue_nullList_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValue(null);

    SubmodelElementListValidator.validateTypeValueListElement(list);
  }

  @Test
  public void typeValue_nullDeclaredType_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(null);
    list.setValue(Arrays.asList(new DefaultBlob.Builder().idShort("b1").build()));

    SubmodelElementListValidator.validateTypeValueListElement(list);
  }

  // --- validateValueTypeListElement ---

  @Test
  public void valueType_allMatch_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.STRING).build(),
            new DefaultProperty.Builder().idShort("p2").valueType(DataTypeDefXsd.STRING).build()));

    SubmodelElementListValidator.validateValueTypeListElement(list);
  }

  @Test
  public void valueType_mismatch_throws() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.INT).build()));

    assertThrows(
        IOException.class, () -> SubmodelElementListValidator.validateValueTypeListElement(list));
  }

  @Test
  public void valueType_rangeMismatch_throws() {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.RANGE);
    list.setValueTypeListElement(DataTypeDefXsd.STRING);
    list.setValue(
        Arrays.asList(
            new DefaultRange.Builder().idShort("r1").valueType(DataTypeDefXsd.INT).build()));

    assertThrows(
        IOException.class, () -> SubmodelElementListValidator.validateValueTypeListElement(list));
  }

  @Test
  public void valueType_notSet_passes() throws IOException {
    DefaultSubmodelElementList list = new DefaultSubmodelElementList();
    list.setTypeValueListElement(AasSubmodelElements.PROPERTY);
    list.setValueTypeListElement(null);
    list.setValue(
        Arrays.asList(
            new DefaultProperty.Builder().idShort("p1").valueType(DataTypeDefXsd.INT).build()));

    SubmodelElementListValidator.validateValueTypeListElement(list);
  }
}
