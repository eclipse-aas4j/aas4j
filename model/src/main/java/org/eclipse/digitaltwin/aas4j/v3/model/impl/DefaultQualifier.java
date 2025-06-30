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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.QualifierBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Qualifier
 *
 * <p>A qualifier is a type-value-pair that makes additional statements w.r.t. the value of the
 * element.
 */
@IRI("aas:Qualifier")
public class DefaultQualifier implements Qualifier {

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticId")
  protected Reference semanticId;

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
  protected List<Reference> supplementalSemanticIds = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Qualifier/kind")
  protected QualifierKind kind;

  @IRI("https://admin-shell.io/aas/3/0/Qualifier/type")
  protected String type;

  @IRI("https://admin-shell.io/aas/3/0/Qualifier/value")
  protected String value;

  @IRI("https://admin-shell.io/aas/3/0/Qualifier/valueId")
  protected Reference valueId;

  @IRI("https://admin-shell.io/aas/3/0/Qualifier/valueType")
  protected DataTypeDefXsd valueType;

  public DefaultQualifier() {
    this.kind = QualifierKind.CONCEPT_QUALIFIER;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.kind,
        this.type,
        this.valueType,
        this.value,
        this.valueId,
        this.semanticId,
        this.supplementalSemanticIds);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj == null) {
      return false;
    } else if (this.getClass() != obj.getClass()) {
      return false;
    } else {
      DefaultQualifier other = (DefaultQualifier) obj;
      return Objects.equals(this.kind, other.kind)
          && Objects.equals(this.type, other.type)
          && Objects.equals(this.valueType, other.valueType)
          && Objects.equals(this.value, other.value)
          && Objects.equals(this.valueId, other.valueId)
          && Objects.equals(this.semanticId, other.semanticId)
          && Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
    }
  }

  @Override
  public QualifierKind getKind() {
    return kind;
  }

  @Override
  public void setKind(QualifierKind kind) {
    this.kind = kind;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public DataTypeDefXsd getValueType() {
    return valueType;
  }

  @Override
  public void setValueType(DataTypeDefXsd valueType) {
    this.valueType = valueType;
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public Reference getValueId() {
    return valueId;
  }

  @Override
  public void setValueId(Reference valueId) {
    this.valueId = valueId;
  }

  @Override
  public Reference getSemanticId() {
    return semanticId;
  }

  @Override
  public void setSemanticId(Reference semanticId) {
    this.semanticId = semanticId;
  }

  @Override
  public List<Reference> getSupplementalSemanticIds() {
    return supplementalSemanticIds;
  }

  @Override
  public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
  }

  public String toString() {
    return String.format(
        "DefaultQualifier ("
            + "kind=%s,"
            + "type=%s,"
            + "valueType=%s,"
            + "value=%s,"
            + "valueId=%s,"
            + ")",
        this.kind, this.type, this.valueType, this.value, this.valueId);
  }

  /** This builder class can be used to construct a DefaultQualifier bean. */
  public static class Builder extends QualifierBuilder<DefaultQualifier, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultQualifier newBuildingInstance() {
      return new DefaultQualifier();
    }
  }
}
