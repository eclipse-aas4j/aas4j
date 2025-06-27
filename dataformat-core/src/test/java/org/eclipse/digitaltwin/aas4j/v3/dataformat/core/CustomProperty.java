/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import java.util.List;
import java.util.Objects;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

public class CustomProperty implements Property {

  protected List<EmbeddedDataSpecification> embeddedDataSpecifications;

  protected List<Reference> dataSpecifications;

  protected ModellingKind kind;

  protected Reference semanticId;

  protected String value;

  protected Reference valueId;

  protected DataTypeDefXsd valueType;

  protected List<Qualifier> qualifiers;

  protected String category;

  protected List<LangStringTextType> description;

  protected List<LangStringNameType> displayName;

  protected String idShort;

  protected List<Extension> extensions;

  protected List<Reference> supplementalSemanticIds;

  protected CustomProperty() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        new Object[] {
          this.valueType,
          this.value,
          this.valueId,
          this.category,
          this.description,
          this.displayName,
          this.idShort,
          this.qualifiers, /* this.embeddedDataSpecifications,*/
          this.kind,
          this.semanticId
        });
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
      CustomProperty other = (CustomProperty) obj;
      return Objects.equals(this.valueType, other.valueType)
          && Objects.equals(this.value, other.value)
          && Objects.equals(this.valueId, other.valueId)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.description, other.description)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.qualifiers, other.qualifiers)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
          && Objects.equals(this.kind, other.kind)
          && Objects.equals(this.semanticId, other.semanticId);
    }
  }

  @Override
  public final DataTypeDefXsd getValueType() {
    return this.valueType;
  }

  @Override
  public final void setValueType(DataTypeDefXsd dataType) {
    this.valueType = dataType;
  }

  @Override
  public final String getValue() {
    return value;
  }

  @Override
  public final void setValue(String value) {
    this.value = value;
  }

  @Override
  public final Reference getValueId() {
    return valueId;
  }

  @Override
  public final void setValueId(Reference valueId) {
    this.valueId = valueId;
  }

  @Override
  public final String getCategory() {
    return category;
  }

  @Override
  public final void setCategory(String category) {
    this.category = category;
  }

  @Override
  public final List<LangStringTextType> getDescription() {
    return description;
  }

  @Override
  public final void setDescription(List<LangStringTextType> description) {
    this.description = description;
  }

  @Override
  public final List<LangStringNameType> getDisplayName() {
    return displayName;
  }

  @Override
  public final void setDisplayName(List<LangStringNameType> displayName) {
    this.displayName = displayName;
  }

  @Override
  public final String getIdShort() {
    return idShort;
  }

  @Override
  public final void setIdShort(String idShort) {
    this.idShort = idShort;
  }

  @Override
  public final List<Qualifier> getQualifiers() {
    return qualifiers;
  }

  @Override
  public final void setQualifiers(List<Qualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }

  @Override
  public final List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public final void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  @Override
  public final Reference getSemanticId() {
    return semanticId;
  }

  @Override
  public final void setSemanticId(Reference semanticId) {
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

  @Override
  public List<Extension> getExtensions() {
    return extensions;
  }

  @Override
  public void setExtensions(List<Extension> list) {
    this.extensions = list;
  }
}
