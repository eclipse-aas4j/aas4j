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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationUom;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeUom;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringUom;

import java.util.List;

public abstract class DataSpecificationUomBuilder<
        T extends DataSpecificationUom, B extends DataSpecificationUomBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

  /**
   * This function allows setting a value for preferredName
   *
   * @param preferredNames desired value to be set
   * @return Builder object with new value for preferredName
   */
  public B preferredName(List<LangStringUom> preferredNames) {
    getBuildingInstance().setPreferredName(preferredNames);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List preferredName
   *
   * @param preferredName desired value to be added
   * @return Builder object with new value for preferredName
   */
  public B preferredName(LangStringUom preferredName) {
    getBuildingInstance().getPreferredName().add(preferredName);
    return getSelf();
  }

  /**
   * This function allows setting a value for symbol
   *
   * @param symbol desired value to be set
   * @return Builder object with new value for symbol
   */
  public B symbol(String symbol) {
    getBuildingInstance().setSymbol(symbol);
    return getSelf();
  }

  /**
   * This function allows setting a value for specificUnitId
   *
   * @param specificUnitId desired value to be set
   * @return Builder object with new value for specificUnitId
   */
  public B specificUnitId(String specificUnitId) {
    getBuildingInstance().setSpecificUnitId(specificUnitId);
    return getSelf();
  }

  /**
   * This function allows setting a value for definition
   *
   * @param definitions desired value to be set
   * @return Builder object with new value for definition
   */
  public B definition(List<LangStringDefinitionTypeUom> definitions) {
    getBuildingInstance().setDefinition(definitions);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List definition
   *
   * @param definition desired value to be added
   * @return Builder object with new value for definition
   */
  public B definition(LangStringDefinitionTypeUom definition) {
    getBuildingInstance().getDefinition().add(definition);
    return getSelf();
  }

  /**
   * This function allows setting a value for preferredNameQuantity
   *
   * @param preferredNameQuantities desired value to be set
   * @return Builder object with new value for preferredNameQuantity
   */
  public B preferredNameQuantity(List<LangStringUom> preferredNameQuantities) {
    getBuildingInstance().setPreferredNameQuantity(preferredNameQuantities);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List preferredNameQuantity
   *
   * @param preferredNameQuantity desired value to be added
   * @return Builder object with new value for preferredNameQuantity
   */
  public B preferredNameQuantity(LangStringUom preferredNameQuantity) {
    getBuildingInstance().getPreferredNameQuantity().add(preferredNameQuantity);
    return getSelf();
  }

  /**
   * This function allows setting a value for quantityId
   *
   * @param quantityId desired value to be set
   * @return Builder object with new value for quantityId
   */
  public B quantityId(String quantityId) {
    getBuildingInstance().setQuantityId(quantityId);
    return getSelf();
  }

  /**
   * This function allows setting a value for classificationSystem
   *
   * @param classificationSystem desired value to be set
   * @return Builder object with new value for classificationSystem
   */
  public B classificationSystem(String classificationSystem) {
    getBuildingInstance().setClassificationSystem(classificationSystem);
    return getSelf();
  }

  /**
   * This function allows setting a value for classificationSystemVersion
   *
   * @param classificationSystemVersion desired value to be set
   * @return Builder object with new value for classificationSystemVersion
   */
  public B classificationSystemVersion(String classificationSystemVersion) {
    getBuildingInstance().setClassificationSystemVersion(classificationSystemVersion);
    return getSelf();
  }
}
