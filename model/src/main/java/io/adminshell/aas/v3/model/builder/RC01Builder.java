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

public abstract class RC01Builder<T extends RC01, B extends RC01Builder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for conversionFactors
     * 
     * @param conversionFactors desired value to be set
     * @return Builder object with new value for conversionFactors
     */
    public B conversionFactors(List<String> conversionFactors) {
        getBuildingInstance().setConversionFactors(conversionFactors);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List conversionFactors
     * 
     * @param conversionFactor desired value to be added
     * @return Builder object with new value for conversionFactors
     */
    public B conversionFactor(String conversionFactor) {
        getBuildingInstance().getConversionFactors().add(conversionFactor);
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
     * This function allows setting a value for dinNotations
     * 
     * @param dinNotations desired value to be set
     * @return Builder object with new value for dinNotations
     */
    public B dinNotations(List<String> dinNotations) {
        getBuildingInstance().setDinNotations(dinNotations);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dinNotations
     * 
     * @param dinNotation desired value to be added
     * @return Builder object with new value for dinNotations
     */
    public B dinNotation(String dinNotation) {
        getBuildingInstance().getDinNotations().add(dinNotation);
        return getSelf();
    }

    /**
     * This function allows setting a value for eceCodes
     * 
     * @param eceCodes desired value to be set
     * @return Builder object with new value for eceCodes
     */
    public B eceCodes(List<String> eceCodes) {
        getBuildingInstance().setEceCodes(eceCodes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List eceCodes
     * 
     * @param eceCode desired value to be added
     * @return Builder object with new value for eceCodes
     */
    public B eceCode(String eceCode) {
        getBuildingInstance().getEceCodes().add(eceCode);
        return getSelf();
    }

    /**
     * This function allows setting a value for eceNames
     * 
     * @param eceNames desired value to be set
     * @return Builder object with new value for eceNames
     */
    public B eceNames(List<String> eceNames) {
        getBuildingInstance().setEceNames(eceNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List eceNames
     * 
     * @param eceName desired value to be added
     * @return Builder object with new value for eceNames
     */
    public B eceName(String eceName) {
        getBuildingInstance().getEceNames().add(eceName);
        return getSelf();
    }

    /**
     * This function allows setting a value for nistNames
     * 
     * @param nistNames desired value to be set
     * @return Builder object with new value for nistNames
     */
    public B nistNames(List<String> nistNames) {
        getBuildingInstance().setNistNames(nistNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List nistNames
     * 
     * @param nistName desired value to be added
     * @return Builder object with new value for nistNames
     */
    public B nistName(String nistName) {
        getBuildingInstance().getNistNames().add(nistName);
        return getSelf();
    }

    /**
     * This function allows setting a value for siNames
     * 
     * @param siNames desired value to be set
     * @return Builder object with new value for siNames
     */
    public B siNames(List<String> siNames) {
        getBuildingInstance().setSiNames(siNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List siNames
     * 
     * @param siName desired value to be added
     * @return Builder object with new value for siNames
     */
    public B siName(String siName) {
        getBuildingInstance().getSiNames().add(siName);
        return getSelf();
    }

    /**
     * This function allows setting a value for siNotations
     * 
     * @param siNotations desired value to be set
     * @return Builder object with new value for siNotations
     */
    public B siNotations(List<String> siNotations) {
        getBuildingInstance().setSiNotations(siNotations);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List siNotations
     * 
     * @param siNotation desired value to be added
     * @return Builder object with new value for siNotations
     */
    public B siNotation(String siNotation) {
        getBuildingInstance().getSiNotations().add(siNotation);
        return getSelf();
    }

    /**
     * This function allows setting a value for registrationAuthorityIds
     * 
     * @param registrationAuthorityIds desired value to be set
     * @return Builder object with new value for registrationAuthorityIds
     */
    public B registrationAuthorityIds(List<String> registrationAuthorityIds) {
        getBuildingInstance().setRegistrationAuthorityIds(registrationAuthorityIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List registrationAuthorityIds
     * 
     * @param registrationAuthorityId desired value to be added
     * @return Builder object with new value for registrationAuthorityIds
     */
    public B registrationAuthorityId(String registrationAuthorityId) {
        getBuildingInstance().getRegistrationAuthorityIds().add(registrationAuthorityId);
        return getSelf();
    }

    /**
     * This function allows setting a value for suppliers
     * 
     * @param suppliers desired value to be set
     * @return Builder object with new value for suppliers
     */
    public B suppliers(List<String> suppliers) {
        getBuildingInstance().setSuppliers(suppliers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List suppliers
     * 
     * @param supplier desired value to be added
     * @return Builder object with new value for suppliers
     */
    public B supplier(String supplier) {
        getBuildingInstance().getSuppliers().add(supplier);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitNames
     * 
     * @param unitNames desired value to be set
     * @return Builder object with new value for unitNames
     */
    public B unitNames(List<String> unitNames) {
        getBuildingInstance().setUnitNames(unitNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List unitNames
     * 
     * @param unitName desired value to be added
     * @return Builder object with new value for unitNames
     */
    public B unitName(String unitName) {
        getBuildingInstance().getUnitNames().add(unitName);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitSymbols
     * 
     * @param unitSymbols desired value to be set
     * @return Builder object with new value for unitSymbols
     */
    public B unitSymbols(List<String> unitSymbols) {
        getBuildingInstance().setUnitSymbols(unitSymbols);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List unitSymbols
     * 
     * @param unitSymbol desired value to be added
     * @return Builder object with new value for unitSymbols
     */
    public B unitSymbol(String unitSymbol) {
        getBuildingInstance().getUnitSymbols().add(unitSymbol);
        return getSelf();
    }

}
