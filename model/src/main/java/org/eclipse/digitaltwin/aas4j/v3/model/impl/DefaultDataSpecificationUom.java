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
 *
 * AI-assisted: This file was generated or updated with assistance from AI tools.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationUom;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeUom;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringUom;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DataSpecificationUomBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationUom
 *
 * <p>Content of data specification template for concept descriptions for Units of Measurement.
 */
@IRI("aas:DataSpecificationUom")
public class DefaultDataSpecificationUom implements DataSpecificationUom {

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystem")
  protected String classificationSystem;

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystemVersion")
  protected String classificationSystemVersion;

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/definition")
  protected List<LangStringDefinitionTypeUom> definition = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredName")
  protected List<LangStringUom> preferredName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredNameQuantity")
  protected List<LangStringUom> preferredNameQuantity = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/quantityId")
  protected String quantityId;

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/specificUnitId")
  protected String specificUnitId;

  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/symbol")
  protected String symbol;

  public DefaultDataSpecificationUom() {}

  @Override
  public String toString() {
    return "DefaultDataSpecificationUom{"
        + "preferredName='"
        + preferredName
        + "',"
        + "symbol='"
        + symbol
        + "',"
        + "specificUnitId='"
        + specificUnitId
        + "',"
        + "definition='"
        + definition
        + "',"
        + "preferredNameQuantity='"
        + preferredNameQuantity
        + "',"
        + "quantityId='"
        + quantityId
        + "',"
        + "classificationSystem='"
        + classificationSystem
        + "',"
        + "classificationSystemVersion='"
        + classificationSystemVersion
        + "',"
        + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.preferredName,
        this.symbol,
        this.specificUnitId,
        this.definition,
        this.preferredNameQuantity,
        this.quantityId,
        this.classificationSystem,
        this.classificationSystemVersion);
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
      DefaultDataSpecificationUom other = (DefaultDataSpecificationUom) obj;
      return Objects.equals(this.preferredName, other.preferredName)
          && Objects.equals(this.symbol, other.symbol)
          && Objects.equals(this.specificUnitId, other.specificUnitId)
          && Objects.equals(this.definition, other.definition)
          && Objects.equals(this.preferredNameQuantity, other.preferredNameQuantity)
          && Objects.equals(this.quantityId, other.quantityId)
          && Objects.equals(this.classificationSystem, other.classificationSystem)
          && Objects.equals(this.classificationSystemVersion, other.classificationSystemVersion);
    }
  }

  @Override
  public List<LangStringUom> getPreferredName() {
    return preferredName;
  }

  @Override
  public void setPreferredName(List<LangStringUom> preferredNames) {
    this.preferredName = preferredNames;
  }

  @Override
  public void setPreferredName(LangStringUom preferredName) {
    this.preferredName.add(preferredName);
  }

  @Override
  public String getSymbol() {
    return symbol;
  }

  @Override
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String getSpecificUnitId() {
    return specificUnitId;
  }

  @Override
  public void setSpecificUnitId(String specificUnitId) {
    this.specificUnitId = specificUnitId;
  }

  @Override
  public List<LangStringDefinitionTypeUom> getDefinition() {
    return definition;
  }

  @Override
  public void setDefinition(List<LangStringDefinitionTypeUom> definitions) {
    this.definition = definitions;
  }

  @Override
  public void setDefinition(LangStringDefinitionTypeUom definition) {
    this.definition.add(definition);
  }

  @Override
  public List<LangStringUom> getPreferredNameQuantity() {
    return preferredNameQuantity;
  }

  @Override
  public void setPreferredNameQuantity(List<LangStringUom> preferredNameQuantities) {
    this.preferredNameQuantity = preferredNameQuantities;
  }

  @Override
  public void setPreferredNameQuantity(LangStringUom preferredNameQuantity) {
    this.preferredNameQuantity.add(preferredNameQuantity);
  }

  @Override
  public String getQuantityId() {
    return quantityId;
  }

  @Override
  public void setQuantityId(String quantityId) {
    this.quantityId = quantityId;
  }

  @Override
  public String getClassificationSystem() {
    return classificationSystem;
  }

  @Override
  public void setClassificationSystem(String classificationSystem) {
    this.classificationSystem = classificationSystem;
  }

  @Override
  public String getClassificationSystemVersion() {
    return classificationSystemVersion;
  }

  @Override
  public void setClassificationSystemVersion(String classificationSystemVersion) {
    this.classificationSystemVersion = classificationSystemVersion;
  }

  /** This builder class can be used to construct a DefaultDataSpecificationUom bean. */
  public static class Builder
      extends DataSpecificationUomBuilder<DefaultDataSpecificationUom, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultDataSpecificationUom newBuildingInstance() {
      return new DefaultDataSpecificationUom();
    }
  }
}
