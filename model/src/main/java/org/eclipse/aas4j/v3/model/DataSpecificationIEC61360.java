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

package org.eclipse.aas4j.v3.model;

import java.util.List;


import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Content of data specification template for concept descriptions for properties, values and value
 * lists conformant to IEC 61360.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 extends DataSpecificationContent {

    /**
     * Data Type
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/dataType
     *
     * @return Returns the DataTypeIEC61360 for the property dataType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/dataType")
    DataTypeIEC61360 getDataType();

    /**
     * Data Type
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/dataType
     *
     * @param dataType desired value for the property dataType.
     */
    void setDataType(DataTypeIEC61360 dataType);

    /**
     * Definition in different languages
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/definition
     *
     * @return Returns the List of LangStrings for the property definition.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/definition")
    List<LangString> getDefinition();

    /**
     * Definition in different languages
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/definition
     *
     * @param definition desired value for the property definition.
     */
    void setDefinition(List<LangString> definition);

    /**
     * Set of levels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/levelType
     *
     * @return Returns the LevelType for the property levelType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/levelType")
    LevelType getLevelType();

    /**
     * Set of levels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/levelType
     *
     * @param levelType desired value for the property levelType.
     */
    void setLevelType(LevelType levelType);

    /**
     * Preferred name
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/preferredName
     *
     * @return Returns the List of LangStrings for the property preferredName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/preferredName")
    List<LangString> getPreferredName();

    /**
     * Preferred name
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/preferredName
     *
     * @param preferredName desired value for the property preferredName.
     */
    void setPreferredName(List<LangString> preferredName);

    /**
     * Short name
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/shortName
     *
     * @return Returns the List of LangStrings for the property shortName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/shortName")
    List<LangString> getShortName();

    /**
     * Short name
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/shortName
     *
     * @param shortName desired value for the property shortName.
     */
    void setShortName(List<LangString> shortName);

    /**
     * Source of definition
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/sourceOfDefinition
     *
     * @return Returns the String for the property sourceOfDefinition.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/sourceOfDefinition")
    String getSourceOfDefinition();

    /**
     * Source of definition
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/sourceOfDefinition
     *
     * @param sourceOfDefinition desired value for the property sourceOfDefinition.
     */
    void setSourceOfDefinition(String sourceOfDefinition);

    /**
     * Symbol
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/symbol
     *
     * @return Returns the String for the property symbol.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/symbol")
    String getSymbol();

    /**
     * Symbol
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/symbol
     *
     * @param symbol desired value for the property symbol.
     */
    void setSymbol(String symbol);

    /**
     * Unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unit
     *
     * @return Returns the String for the property unit.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unit")
    String getUnit();

    /**
     * Unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unit
     *
     * @param unit desired value for the property unit.
     */
    void setUnit(String unit);

    /**
     * Unique unit id
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unitId
     *
     * @return Returns the Reference for the property unitId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unitId")
    Reference getUnitId();

    /**
     * Unique unit id
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/unitId
     *
     * @param unitId desired value for the property unitId.
     */
    void setUnitId(Reference unitId);

    /**
     * Value
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/value")
    String getValue();

    /**
     * Value
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Value Format
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueFormat
     *
     * @return Returns the String for the property valueFormat.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueFormat")
    String getValueFormat();

    /**
     * Value Format
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueFormat
     *
     * @param valueFormat desired value for the property valueFormat.
     */
    void setValueFormat(String valueFormat);

    /**
     * List of allowed values
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueList
     *
     * @return Returns the ValueList for the property valueList.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueList")
    ValueList getValueList();

    /**
     * List of allowed values
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/valueList
     *
     * @param valueList desired value for the property valueList.
     */
    void setValueList(ValueList valueList);

}
