/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;

/**
 * Content of data specification template for concept description for properties, values and value
 * lists conformant to IEC 61360.
 */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultDataSpecificationIec61360.class)})
public interface DataSpecificationIec61360 extends DataSpecificationContent {

  /**
   * Preferred name
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/1/DataSpecificationIec61360/preferredName
   *
   * @return Returns the List of LangStringPreferredNameTypeIec61360s for the property
   *     preferredNames.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/preferredName")
  List<LangStringPreferredNameTypeIec61360> getPreferredName();

  /**
   * Preferred name
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/1/DataSpecificationIec61360/preferredName
   *
   * @param preferredName desired value for the property preferredNames.
   */
  void setPreferredName(List<LangStringPreferredNameTypeIec61360> preferredName);

  /**
   * Short name
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/shortName
   *
   * @return Returns the List of LangStringShortNameTypeIec61360s for the property shortNames.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/shortName")
  List<LangStringShortNameTypeIec61360> getShortName();

  /**
   * Short name
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/shortName
   *
   * @param shortName desired value for the property shortName.
   */
  void setShortName(List<LangStringShortNameTypeIec61360> shortName);

  /**
   * Unit
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unit
   *
   * @return Returns the String for the property unit.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unit")
  String getUnit();

  /**
   * Unit
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unit
   *
   * @param unit desired value for the property unit.
   */
  void setUnit(String unit);

  /**
   * Unique unit id
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unitId
   *
   * @return Returns the Reference for the property unitId.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unitId")
  Reference getUnitId();

  /**
   * Unique unit id
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/unitId
   *
   * @param unitId desired value for the property unitId.
   */
  void setUnitId(Reference unitId);

  /**
   * Source of definition
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/1/DataSpecificationIec61360/sourceOfDefinition
   *
   * @return Returns the String for the property sourceOfDefinition.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/sourceOfDefinition")
  String getSourceOfDefinition();

  /**
   * Source of definition
   *
   * <p>More information under
   * https://admin-shell.io/aas/3/1/DataSpecificationIec61360/sourceOfDefinition
   *
   * @param sourceOfDefinition desired value for the property sourceOfDefinition.
   */
  void setSourceOfDefinition(String sourceOfDefinition);

  /**
   * Symbol
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/symbol
   *
   * @return Returns the String for the property symbol.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/symbol")
  String getSymbol();

  /**
   * Symbol
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/symbol
   *
   * @param symbol desired value for the property symbol.
   */
  void setSymbol(String symbol);

  /**
   * Data Type
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/dataType
   *
   * @return Returns the DataTypeIec61360 for the property dataType.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/dataType")
  DataTypeIec61360 getDataType();

  /**
   * Data Type
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/dataType
   *
   * @param dataType desired value for the property dataType.
   */
  void setDataType(DataTypeIec61360 dataType);

  /**
   * Definition in different languages
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/definition
   *
   * @return Returns the List of LangStringDefinitionTypeIec61360s for the property definitions.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/definition")
  List<LangStringDefinitionTypeIec61360> getDefinition();

  /**
   * Definition in different languages
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/definition
   *
   * @param definitions desired value for the property definitions.
   */
  void setDefinition(List<LangStringDefinitionTypeIec61360> definitions);

  /**
   * Value Format
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueFormat
   *
   * @return Returns the String for the property valueFormat.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueFormat")
  String getValueFormat();

  /**
   * Value Format
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueFormat
   *
   * @param valueFormat desired value for the property valueFormat.
   */
  void setValueFormat(String valueFormat);

  /**
   * List of allowed values
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueList
   *
   * @return Returns the ValueList for the property valueList.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueList")
  ValueList getValueList();

  /**
   * List of allowed values
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/valueList
   *
   * @param valueList desired value for the property valueList.
   */
  void setValueList(ValueList valueList);

  /**
   * Value
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/value
   *
   * @return Returns the String for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/value")
  String getValue();

  /**
   * Value
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/value
   *
   * @param value desired value for the property value.
   */
  void setValue(String value);

  /**
   * Set of levels.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/levelType
   *
   * @return Returns the LevelType for the property levelType.
   */
  @IRI("https://admin-shell.io/aas/3/1/DataSpecificationIec61360/levelType")
  LevelType getLevelType();

  /**
   * Set of levels.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/DataSpecificationIec61360/levelType
   *
   * @param levelType desired value for the property levelType.
   */
  void setLevelType(LevelType levelType);
}
