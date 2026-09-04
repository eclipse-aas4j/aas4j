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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationUom;

import java.util.List;

/** Content of data specification template for concept descriptions for Units of Measurement. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultDataSpecificationUom.class)})
public interface DataSpecificationUom extends DataSpecificationContent {

  /**
   * Preferred name of the unit in different languages as defined by the classification system.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredName
   *
   * @return Returns the List of LangStringUoms for the property preferredName.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredName")
  List<LangStringUom> getPreferredName();

  /**
   * Preferred name of the unit in different languages as defined by the classification system.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredName
   *
   * @param preferredNames desired value for the property preferredName.
   */
  void setPreferredName(List<LangStringUom> preferredNames);

  /**
   * More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredName
   *
   * @param preferredName desired value to be added to the property preferredName.
   */
  void setPreferredName(LangStringUom preferredName);

  /**
   * Symbol of the unit.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/symbol
   *
   * @return Returns the String for the property symbol.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/symbol")
  String getSymbol();

  /**
   * Symbol of the unit.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/symbol
   *
   * @param symbol desired value for the property symbol.
   */
  void setSymbol(String symbol);

  /**
   * ID of the unit defined by the classification system.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/specificUnitId
   *
   * @return Returns the String for the property specificUnitId.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/specificUnitId")
  String getSpecificUnitId();

  /**
   * ID of the unit defined by the classification system.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/specificUnitId
   *
   * @param specificUnitId desired value for the property specificUnitId.
   */
  void setSpecificUnitId(String specificUnitId);

  /**
   * Definition of the unit in different languages.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/definition
   *
   * @return Returns the List of LangStringDefinitionTypeUoms for the property definition.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/definition")
  List<LangStringDefinitionTypeUom> getDefinition();

  /**
   * Definition of the unit in different languages.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/definition
   *
   * @param definitions desired value for the property definition.
   */
  void setDefinition(List<LangStringDefinitionTypeUom> definitions);

  /**
   * More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/definition
   *
   * @param definition desired value to be added to the property definition.
   */
  void setDefinition(LangStringDefinitionTypeUom definition);

  /**
   * Preferred name of the unit's quantity in different languages.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredNameQuantity
   *
   * @return Returns the List of LangStringUoms for the property preferredNameQuantity.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredNameQuantity")
  List<LangStringUom> getPreferredNameQuantity();

  /**
   * Preferred name of the unit's quantity in different languages.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredNameQuantity
   *
   * @param preferredNameQuantities desired value for the property preferredNameQuantity.
   */
  void setPreferredNameQuantity(List<LangStringUom> preferredNameQuantities);

  /**
   * More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/preferredNameQuantity
   *
   * @param preferredNameQuantity desired value to be added to the property preferredNameQuantity.
   */
  void setPreferredNameQuantity(LangStringUom preferredNameQuantity);

  /**
   * ID of the unit's quantity.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/quantityId
   *
   * @return Returns the String for the property quantityId.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/quantityId")
  String getQuantityId();

  /**
   * ID of the unit's quantity.
   *
   * <p>More information under https://admin-shell.io/aas/3/2/DataSpecificationUom/quantityId
   *
   * @param quantityId desired value for the property quantityId.
   */
  void setQuantityId(String quantityId);

  /**
   * Name of the classification system used for the definition of units and quantities.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystem
   *
   * @return Returns the String for the property classificationSystem.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystem")
  String getClassificationSystem();

  /**
   * Name of the classification system used for the definition of units and quantities.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystem
   *
   * @param classificationSystem desired value for the property classificationSystem.
   */
  void setClassificationSystem(String classificationSystem);

  /**
   * Version of the classification system used for the definition of units and quantities.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystemVersion
   *
   * @return Returns the String for the property classificationSystemVersion.
   */
  @IRI("https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystemVersion")
  String getClassificationSystemVersion();

  /**
   * Version of the classification system used for the definition of units and quantities.
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/2/DataSpecificationUom/classificationSystemVersion
   *
   * @param classificationSystemVersion desired value for the property classificationSystemVersion.
   */
  void setClassificationSystemVersion(String classificationSystemVersion);
}
