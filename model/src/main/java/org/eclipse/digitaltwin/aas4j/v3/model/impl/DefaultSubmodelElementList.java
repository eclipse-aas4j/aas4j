/*
 * Copyright (c) 2026 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved.
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
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.SubmodelElementListBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList
 *
 * <p>A submodel element list is an ordered list of submodel elements.
 */
@IRI("aas:SubmodelElementList")
public class DefaultSubmodelElementList implements SubmodelElementList {

  @IRI("https://admin-shell.io/aas/3/2/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/HasExtensions/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/HasSemantics/semanticId")
  protected Reference semanticId;

  @IRI("https://admin-shell.io/aas/3/2/HasSemantics/supplementalSemanticIds")
  protected List<Reference> supplementalSemanticIds = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/Qualifiable/qualifiers")
  protected List<Qualifier> qualifiers = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/Referable/category")
  protected String category;

  @IRI("https://admin-shell.io/aas/3/2/Referable/description")
  protected List<LangStringTextType> descriptions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/Referable/displayName")
  protected List<LangStringNameType> displayNames = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/Referable/idShort")
  protected String idShort;

  @IRI("https://admin-shell.io/aas/3/2/SubmodelElementList/orderRelevant")
  protected boolean orderRelevant;

  @IRI("https://admin-shell.io/aas/3/2/SubmodelElementList/semanticIdListElement")
  protected Reference semanticIdListElement;

  @IRI("https://admin-shell.io/aas/3/2/SubmodelElementList/typeValueListElement")
  protected AasSubmodelElements typeValueListElement;

  @IRI("https://admin-shell.io/aas/3/2/SubmodelElementList/value")
  protected List<SubmodelElement> values = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/SubmodelElementList/valueTypeListElement")
  protected DataTypeDefXsd valueTypeListElement;

  public DefaultSubmodelElementList() {}

  @Override
  public String toString() {
    return "DefaultSubmodelElementList{"
        + "orderRelevant='"
        + orderRelevant
        + "',"
        + "semanticIdListElement='"
        + semanticIdListElement
        + "',"
        + "typeValueListElement='"
        + typeValueListElement
        + "',"
        + "valueTypeListElement='"
        + valueTypeListElement
        + "',"
        + "values='"
        + values
        + "',"
        + "category='"
        + category
        + "',"
        + "idShort='"
        + idShort
        + "',"
        + "displayNames='"
        + displayNames
        + "',"
        + "descriptions='"
        + descriptions
        + "',"
        + "extensions='"
        + extensions
        + "',"
        + "embeddedDataSpecifications='"
        + embeddedDataSpecifications
        + "',"
        + "semanticId='"
        + semanticId
        + "',"
        + "supplementalSemanticIds='"
        + supplementalSemanticIds
        + "',"
        + "qualifiers='"
        + qualifiers
        + "',"
        + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.orderRelevant,
        this.semanticIdListElement,
        this.typeValueListElement,
        this.valueTypeListElement,
        this.values,
        this.category,
        this.idShort,
        this.displayNames,
        this.descriptions,
        this.extensions,
        this.embeddedDataSpecifications,
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
      DefaultSubmodelElementList other = (DefaultSubmodelElementList) obj;
      return Objects.equals(this.orderRelevant, other.orderRelevant)
          && Objects.equals(this.semanticIdListElement, other.semanticIdListElement)
          && Objects.equals(this.typeValueListElement, other.typeValueListElement)
          && Objects.equals(this.valueTypeListElement, other.valueTypeListElement)
          && Objects.equals(this.values, other.values)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.displayNames, other.displayNames)
          && Objects.equals(this.descriptions, other.descriptions)
          && Objects.equals(this.extensions, other.extensions)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
          && Objects.equals(this.semanticId, other.semanticId)
          && Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds)
          && Objects.equals(this.qualifiers, other.qualifiers);
    }
  }

  @Override
  public boolean getOrderRelevant() {
    return orderRelevant;
  }

  @Override
  public void setOrderRelevant(boolean orderRelevant) {
    this.orderRelevant = orderRelevant;
  }

  @Override
  public Reference getSemanticIdListElement() {
    return semanticIdListElement;
  }

  @Override
  public void setSemanticIdListElement(Reference semanticIdListElement) {
    this.semanticIdListElement = semanticIdListElement;
  }

  @Override
  public AasSubmodelElements getTypeValueListElement() {
    return typeValueListElement;
  }

  @Override
  public void setTypeValueListElement(AasSubmodelElements typeValueListElement) {
    this.typeValueListElement = typeValueListElement;
  }

  @Override
  public DataTypeDefXsd getValueTypeListElement() {
    return valueTypeListElement;
  }

  @Override
  public void setValueTypeListElement(DataTypeDefXsd valueTypeListElement) {
    this.valueTypeListElement = valueTypeListElement;
  }

  @Override
  public List<SubmodelElement> getValues() {
    return values;
  }

  @Override
  public void setValues(List<SubmodelElement> values) {
    this.values = values;
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
  public List<LangStringNameType> getDisplayNames() {
    return displayNames;
  }

  @Override
  public void setDisplayNames(List<LangStringNameType> displayNames) {
    this.displayNames = displayNames;
  }

  @Override
  public List<LangStringTextType> getDescriptions() {
    return descriptions;
  }

  @Override
  public void setDescriptions(List<LangStringTextType> descriptions) {
    this.descriptions = descriptions;
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
  public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
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

  /** This builder class can be used to construct a DefaultSubmodelElementList bean. */
  public static class Builder
      extends SubmodelElementListBuilder<DefaultSubmodelElementList, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultSubmodelElementList newBuildingInstance() {
      return new DefaultSubmodelElementList();
    }
  }
}
