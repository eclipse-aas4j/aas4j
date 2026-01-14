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
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Capability;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.EventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
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

  @IRI("https://admin-shell.io/aas/3/1/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/HasExtensions/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/HasSemantics/semanticId")
  protected Reference semanticId;

  @IRI("https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds")
  protected List<Reference> supplementalSemanticIds = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Qualifiable/qualifiers")
  protected List<Qualifier> qualifiers = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Referable/category")
  protected String category;

  @IRI("https://admin-shell.io/aas/3/1/Referable/description")
  protected List<LangStringTextType> description = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Referable/displayName")
  protected List<LangStringNameType> displayName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Referable/idShort")
  protected String idShort;

  @IRI("https://admin-shell.io/aas/3/1/SubmodelElementList/orderRelevant")
  protected boolean orderRelevant;

  @IRI("https://admin-shell.io/aas/3/1/SubmodelElementList/semanticIdListElement")
  protected Reference semanticIdListElement;

  @IRI("https://admin-shell.io/aas/3/1/SubmodelElementList/typeValueListElement")
  protected AasSubmodelElements typeValueListElement;

  @IRI("https://admin-shell.io/aas/3/1/SubmodelElementList/value")
  protected List<SubmodelElement> value = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/SubmodelElementList/valueTypeListElement")
  protected DataTypeDefXsd valueTypeListElement;

  public DefaultSubmodelElementList() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        this.orderRelevant,
        this.semanticIdListElement,
        this.typeValueListElement,
        this.valueTypeListElement,
        this.value,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
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
          && Objects.equals(this.value, other.value)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.description, other.description)
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
    validateValueTypes();
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
  public List<SubmodelElement> getValue() {
    return value;
  }

  @Override
  public void setValue(List<SubmodelElement> value) {
    this.value = value;
    validateValueTypes();
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
  public void setDisplayName(List<LangStringNameType> displayName) {
    this.displayName = displayName;
  }

  @Override
  public List<LangStringTextType> getDescription() {
    return description;
  }

  @Override
  public void setDescription(List<LangStringTextType> description) {
    this.description = description;
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

  private void validateValueTypes() {
    if (typeValueListElement == null || value == null || value.isEmpty()) {
      return;
    }
    Class<?> expectedType = resolveExpectedType(typeValueListElement);
    for (SubmodelElement element : value) {
      if (element == null) {
        continue;
      }
      if (!expectedType.isInstance(element)) {
        throw new IllegalArgumentException(
            "SubmodelElementList/value elements must match typeValueListElement. Expected "
                + typeValueListElement
                + " but found "
                + element.getClass().getSimpleName());
      }
    }
  }

  private Class<?> resolveExpectedType(AasSubmodelElements typeValue) {
    switch (typeValue) {
      case ANNOTATED_RELATIONSHIP_ELEMENT:
        return AnnotatedRelationshipElement.class;
      case BASIC_EVENT_ELEMENT:
        return BasicEventElement.class;
      case BLOB:
        return Blob.class;
      case CAPABILITY:
        return Capability.class;
      case DATA_ELEMENT:
        return DataElement.class;
      case ENTITY:
        return Entity.class;
      case EVENT_ELEMENT:
        return EventElement.class;
      case FILE:
        return File.class;
      case MULTI_LANGUAGE_PROPERTY:
        return MultiLanguageProperty.class;
      case OPERATION:
        return Operation.class;
      case PROPERTY:
        return Property.class;
      case RANGE:
        return Range.class;
      case REFERENCE_ELEMENT:
        return ReferenceElement.class;
      case RELATIONSHIP_ELEMENT:
        return RelationshipElement.class;
      case SUBMODEL_ELEMENT_COLLECTION:
        return SubmodelElementCollection.class;
      case SUBMODEL_ELEMENT_LIST:
        return SubmodelElementList.class;
      case SUBMODEL_ELEMENT:
        return SubmodelElement.class;
      default:
        return SubmodelElement.class;
    }
  }

  @Override
  public String toString() {
    return "DefaultSubmodelElementList{"
        + "embeddedDataSpecifications="
        + embeddedDataSpecifications
        + ", extensions="
        + extensions
        + ", semanticId="
        + semanticId
        + ", supplementalSemanticIds="
        + supplementalSemanticIds
        + ", qualifiers="
        + qualifiers
        + ", category='"
        + category
        + '\''
        + ", description="
        + description
        + ", displayName="
        + displayName
        + ", idShort='"
        + idShort
        + '\''
        + ", orderRelevant="
        + orderRelevant
        + ", semanticIdListElement="
        + semanticIdListElement
        + ", typeValueListElement="
        + typeValueListElement
        + ", value="
        + value
        + ", valueTypeListElement="
        + valueTypeListElement
        + '}';
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
