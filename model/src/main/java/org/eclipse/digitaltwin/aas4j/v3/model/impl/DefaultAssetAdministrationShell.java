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
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AssetAdministrationShellBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell
 *
 * <p>An asset administration shell.
 */
@IRI("aas:AssetAdministrationShell")
public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

  @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/assetInformation")
  protected AssetInformation assetInformation;

  @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/derivedFrom")
  protected Reference derivedFrom;

  @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/submodels")
  protected List<Reference> submodels = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Identifiable/administration")
  protected AdministrativeInformation administration;

  @IRI("https://admin-shell.io/aas/3/0/Identifiable/id")
  protected String id;

  @IRI("https://admin-shell.io/aas/3/0/Referable/category")
  protected String category;

  @IRI("https://admin-shell.io/aas/3/0/Referable/description")
  protected List<LangStringTextType> description = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
  protected List<LangStringNameType> displayName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
  protected String idShort;

  public DefaultAssetAdministrationShell() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        this.derivedFrom,
        this.assetInformation,
        this.submodels,
        this.administration,
        this.id,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
        this.extensions,
        this.embeddedDataSpecifications);
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
      DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
      return Objects.equals(this.derivedFrom, other.derivedFrom)
          && Objects.equals(this.assetInformation, other.assetInformation)
          && Objects.equals(this.submodels, other.submodels)
          && Objects.equals(this.administration, other.administration)
          && Objects.equals(this.id, other.id)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.description, other.description)
          && Objects.equals(this.extensions, other.extensions)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications);
    }
  }

  @Override
  public Reference getDerivedFrom() {
    return derivedFrom;
  }

  @Override
  public void setDerivedFrom(Reference derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  @Override
  public AssetInformation getAssetInformation() {
    return assetInformation;
  }

  @Override
  public void setAssetInformation(AssetInformation assetInformation) {
    this.assetInformation = assetInformation;
  }

  @Override
  public List<Reference> getSubmodels() {
    return submodels;
  }

  @Override
  public void setSubmodels(List<Reference> submodels) {
    this.submodels = submodels;
  }

  @Override
  public AdministrativeInformation getAdministration() {
    return administration;
  }

  @Override
  public void setAdministration(AdministrativeInformation administration) {
    this.administration = administration;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
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
  public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  public String toString() {
    return String.format(
        "DefaultAssetAdministrationShell ("
            + "derivedFrom=%s,"
            + "assetInformation=%s,"
            + "submodels=%s,"
            + ")",
        this.derivedFrom, this.assetInformation, this.submodels);
  }

  /** This builder class can be used to construct a DefaultAssetAdministrationShell bean. */
  public static class Builder
      extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultAssetAdministrationShell newBuildingInstance() {
      return new DefaultAssetAdministrationShell();
    }
  }
}
