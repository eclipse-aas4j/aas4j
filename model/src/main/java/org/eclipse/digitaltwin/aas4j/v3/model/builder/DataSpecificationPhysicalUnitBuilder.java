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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationPhysicalUnit;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;


public abstract class DataSpecificationPhysicalUnitBuilder<T extends DataSpecificationPhysicalUnit, B extends DataSpecificationPhysicalUnitBuilder<T, B>>
        extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for conversionFactor
     *
     * @param conversionFactor desired conversionFactor to be set
     * @return Builder object with new value for conversionFactor
     */
    public B conversionFactor(String conversionFactor) {
        getBuildingInstance().setConversionFactor(conversionFactor);
        return getSelf();
    }

    public B dinNotation(String dinNotation) {
        getBuildingInstance().setDinNotation(dinNotation);
        return getSelf();
    }

    public B eceCode(String eceCode) {
        getBuildingInstance().setEceCode(eceCode);
        return getSelf();
    }

    public B eceName(String eceName) {
        getBuildingInstance().setEceName(eceName);
        return getSelf();
    }

    public B nistName(String nistName) {
        getBuildingInstance().setNistName(nistName);
        return getSelf();
    }

    public B registrationAuthorityId(String registrationAuthorityId) {
        getBuildingInstance().setRegistrationAuthorityId(registrationAuthorityId);
        return getSelf();
    }

    public B siName(String siName) {
        getBuildingInstance().setSiName(siName);
        return getSelf();
    }

    public B siNotation(String siNotation) {
        getBuildingInstance().setSiNotation(siNotation);
        return getSelf();
    }

    public B sourceOfDefinition(String sourceOfDefinition) {
        getBuildingInstance().setSourceOfDefinition(sourceOfDefinition);
        return getSelf();
    }

    public B supplier(String supplier) {
        getBuildingInstance().setSupplier(supplier);
        return getSelf();
    }

    public B unitName(String unitName) {
        getBuildingInstance().setUnitName(unitName);
        return getSelf();
    }

    public B unitSymbol(String unitSymbol) {
        getBuildingInstance().setUnitSymbol(unitSymbol);
        return getSelf();
    }

    public B definition(LangStringTextType definition) {
        List<LangStringTextType> definitionList = getBuildingInstance().getDefinition();
        if (definitionList == null) {
            definitionList = new ArrayList<>();
            getBuildingInstance().setDefinition(definitionList);
        }
        definitionList.add(definition);
        return getSelf();
    }

}
