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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

public abstract class QualifierBuilder<T extends Qualifier, B extends QualifierBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

  /**
   * This function allows setting a value for kind
   *
   * @param kind desired value to be set
   * @return Builder object with new value for kind
   */
  public B kind(QualifierKind kind) {
    getBuildingInstance().setKind(kind);
    return getSelf();
  }

  /**
   * This function allows setting a value for type
   *
   * @param type desired value to be set
   * @return Builder object with new value for type
   */
  public B type(String type) {
    getBuildingInstance().setType(type);
    return getSelf();
  }

  /**
   * This function allows setting a value for valueType
   *
   * @param valueType desired value to be set
   * @return Builder object with new value for valueType
   */
  public B valueType(DataTypeDefXsd valueType) {
    getBuildingInstance().setValueType(valueType);
    return getSelf();
  }

  /**
   * This function allows setting a value for value
   *
   * @param value desired value to be set
   * @return Builder object with new value for value
   */
  public B value(String value) {
    getBuildingInstance().setValue(value);
    return getSelf();
  }

  /**
   * This function allows setting a value for valueId
   *
   * @param valueId desired value to be set
   * @return Builder object with new value for valueId
   */
  public B valueId(Reference valueId) {
    getBuildingInstance().setValueId(valueId);
    return getSelf();
  }

  /**
   * This function allows setting a value for semanticId
   *
   * @param semanticId desired value to be set
   * @return Builder object with new value for semanticId
   */
  public B semanticId(Reference semanticId) {
    getBuildingInstance().setSemanticId(semanticId);
    return getSelf();
  }

  /**
   * This function allows setting a value for supplementalSemanticIds
   *
   * @param supplementalSemanticIds desired value to be set
   * @return Builder object with new value for supplementalSemanticIds
   */
  public B supplementalSemanticIds(List<Reference> supplementalSemanticIds) {
    getBuildingInstance().setSupplementalSemanticIds(supplementalSemanticIds);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List supplementalSemanticIds
   *
   * @param supplementalSemanticIds desired value to be added
   * @return Builder object with new value for supplementalSemanticIds
   */
  public B supplementalSemanticIds(Reference supplementalSemanticIds) {
    getBuildingInstance().getSupplementalSemanticIds().add(supplementalSemanticIds);
    return getSelf();
  }
}
