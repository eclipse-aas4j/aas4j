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
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.MultiLanguagePropertyBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty
 *
 * <p>A property is a data element that has a multi-language value.
 */
@IRI("aas:MultiLanguageProperty")
public class DefaultMultiLanguageProperty implements MultiLanguageProperty {

  @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticId")
  protected Reference semanticId;

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
  protected List<Reference> supplementalSemanticIds = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/value")
  protected List<LangStringTextType> value = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueId")
  protected Reference valueId;

  @IRI("https://admin-shell.io/aas/3/0/Qualifiable/qualifiers")
  protected List<Qualifier> qualifiers = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/category")
  protected String category;

  @IRI("https://admin-shell.io/aas/3/0/Referable/description")
  protected List<LangStringTextType> description = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
  protected List<LangStringNameType> displayName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
  protected String idShort;

  public DefaultMultiLanguageProperty() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        this.value,
        this.valueId,
        this.embeddedDataSpecifications,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
        this.extensions,
        this.semanticId,
        this.supplementalSemanticIds,
        this.qualifiers);
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
      DefaultMultiLanguageProperty other = (DefaultMultiLanguageProperty) obj;
      return Objects.equals(this.value, other.value)
          && Objects.equals(this.valueId, other.valueId)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.description, other.description)
          && Objects.equals(this.extensions, other.extensions)
          && Objects.equals(this.semanticId, other.semanticId)
          && Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds)
          && Objects.equals(this.qualifiers, other.qualifiers);
    }
  }

  @Override
  public List<LangStringTextType> getValue() {
    return value;
  }

  @Override
  public void setValue(List<LangStringTextType> values) {
    this.value = values;
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
  public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  @Override
  public String getCategory() {
    return category;
  }

  @Override
  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String getIdShort() {
    return idShort;
  }

  @Override
  public void setIdShort(String idShort) {
    this.idShort = idShort;
  }

  @Override
  public List<LangStringNameType> getDisplayName() {
    return displayName;
  }

  @Override
  public void setDisplayName(List<LangStringNameType> displayNames) {
    this.displayName = displayNames;
  }

  @Override
  public List<LangStringTextType> getDescription() {
    return description;
  }

  @Override
  public void setDescription(List<LangStringTextType> descriptions) {
    this.description = descriptions;
  }

  @Override
  public List<Extension> getExtensions() {
    return extensions;
  }

  @Override
  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
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

  @Override
  public List<Qualifier> getQualifiers() {
    return qualifiers;
  }

  @Override
  public void setQualifiers(List<Qualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public String toString() {
    return String.format(
        "DefaultMultiLanguageProperty (" + "value=%s," + "valueId=%s," + ")",
        this.value, this.valueId);
  }

  /** This builder class can be used to construct a DefaultMultiLanguageProperty bean. */
  public static class Builder
      extends MultiLanguagePropertyBuilder<DefaultMultiLanguageProperty, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultMultiLanguageProperty newBuildingInstance() {
      return new DefaultMultiLanguageProperty();
    }
  }
}
