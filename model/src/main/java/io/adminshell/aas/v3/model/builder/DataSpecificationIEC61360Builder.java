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

package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DataSpecificationIEC61360Builder<T extends DataSpecificationIEC61360, B extends DataSpecificationIEC61360Builder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataTypes
     * 
     * @param dataTypes desired value to be set
     * @return Builder object with new value for dataTypes
     */
    public B dataTypes(List<DataTypeIEC61360> dataTypes) {
        getBuildingInstance().setDataTypes(dataTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataTypes
     * 
     * @param dataType desired value to be added
     * @return Builder object with new value for dataTypes
     */
    public B dataType(DataTypeIEC61360 dataType) {
        getBuildingInstance().getDataTypes().add(dataType);
        return getSelf();
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public B definitions(List<LangString> definitions) {
        getBuildingInstance().setDefinitions(definitions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List definitions
     * 
     * @param definition desired value to be added
     * @return Builder object with new value for definitions
     */
    public B definition(LangString definition) {
        getBuildingInstance().getDefinitions().add(definition);
        return getSelf();
    }

    /**
     * This function allows setting a value for levelTypes
     * 
     * @param levelTypes desired value to be set
     * @return Builder object with new value for levelTypes
     */
    public B levelTypes(List<LevelType> levelTypes) {
        getBuildingInstance().setLevelTypes(levelTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List levelTypes
     * 
     * @param levelType desired value to be added
     * @return Builder object with new value for levelTypes
     */
    public B levelType(LevelType levelType) {
        getBuildingInstance().getLevelTypes().add(levelType);
        return getSelf();
    }

    /**
     * This function allows setting a value for preferredName
     * 
     * @param preferredName desired value to be set
     * @return Builder object with new value for preferredName
     */
    public B preferredName(LangString preferredName) {
        getBuildingInstance().setPreferredName(preferredName);
        return getSelf();
    }

    /**
     * This function allows setting a value for shortName
     * 
     * @param shortName desired value to be set
     * @return Builder object with new value for shortName
     */
    public B shortName(LangString shortName) {
        getBuildingInstance().setShortName(shortName);
        return getSelf();
    }

    /**
     * This function allows setting a value for sourceOfDefinition
     * 
     * @param sourceOfDefinition desired value to be set
     * @return Builder object with new value for sourceOfDefinition
     */
    public B sourceOfDefinition(String sourceOfDefinition) {
        getBuildingInstance().setSourceOfDefinition(sourceOfDefinition);
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
     * This function allows setting a value for unit
     * 
     * @param unit desired value to be set
     * @return Builder object with new value for unit
     */
    public B unit(String unit) {
        getBuildingInstance().setUnit(unit);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitId
     * 
     * @param unitId desired value to be set
     * @return Builder object with new value for unitId
     */
    public B unitId(Reference unitId) {
        getBuildingInstance().setUnitId(unitId);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueFormat
     * 
     * @param valueFormat desired value to be set
     * @return Builder object with new value for valueFormat
     */
    public B valueFormat(String valueFormat) {
        getBuildingInstance().setValueFormat(valueFormat);
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
     * This function allows setting a value for valueList
     * 
     * @param valueList desired value to be set
     * @return Builder object with new value for valueList
     */
    public B valueList(String valueList) {
        getBuildingInstance().setValueList(valueList);
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

}
