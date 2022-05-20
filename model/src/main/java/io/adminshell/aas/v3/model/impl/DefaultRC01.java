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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.RC01
 * 
 * Data Specification Template for Physical Units.
 */

@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/")
public class DefaultRC01 implements RC01 {

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
    protected List<String> conversionFactors = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
    protected List<LangString> definitions = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
    protected List<String> dinNotations = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
    protected List<String> eceCodes = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
    protected List<String> eceNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
    protected List<String> nistNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
    protected List<String> registrationAuthorityIds = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
    protected List<String> siNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
    protected List<String> siNotations = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
    protected List<String> suppliers = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
    protected List<String> unitNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
    protected List<String> unitSymbols = new ArrayList<>();

    public DefaultRC01() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.conversionFactors,
            this.definitions,
            this.dinNotations,
            this.eceCodes,
            this.eceNames,
            this.nistNames,
            this.siNames,
            this.siNotations,
            this.registrationAuthorityIds,
            this.suppliers,
            this.unitNames,
            this.unitSymbols);
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
            DefaultRC01 other = (DefaultRC01) obj;
            return Objects.equals(this.conversionFactors, other.conversionFactors) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.dinNotations, other.dinNotations) &&
                Objects.equals(this.eceCodes, other.eceCodes) &&
                Objects.equals(this.eceNames, other.eceNames) &&
                Objects.equals(this.nistNames, other.nistNames) &&
                Objects.equals(this.siNames, other.siNames) &&
                Objects.equals(this.siNotations, other.siNotations) &&
                Objects.equals(this.registrationAuthorityIds, other.registrationAuthorityIds) &&
                Objects.equals(this.suppliers, other.suppliers) &&
                Objects.equals(this.unitNames, other.unitNames) &&
                Objects.equals(this.unitSymbols, other.unitSymbols);
        }
    }

    @Override
    public List<String> getConversionFactors() {
        return conversionFactors;
    }

    @Override
    public void setConversionFactors(List<String> conversionFactors) {
        this.conversionFactors = conversionFactors;
    }

    @Override
    public List<LangString> getDefinitions() {
        return definitions;
    }

    @Override
    public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @Override
    public List<String> getDinNotations() {
        return dinNotations;
    }

    @Override
    public void setDinNotations(List<String> dinNotations) {
        this.dinNotations = dinNotations;
    }

    @Override
    public List<String> getEceCodes() {
        return eceCodes;
    }

    @Override
    public void setEceCodes(List<String> eceCodes) {
        this.eceCodes = eceCodes;
    }

    @Override
    public List<String> getEceNames() {
        return eceNames;
    }

    @Override
    public void setEceNames(List<String> eceNames) {
        this.eceNames = eceNames;
    }

    @Override
    public List<String> getNistNames() {
        return nistNames;
    }

    @Override
    public void setNistNames(List<String> nistNames) {
        this.nistNames = nistNames;
    }

    @Override
    public List<String> getSiNames() {
        return siNames;
    }

    @Override
    public void setSiNames(List<String> siNames) {
        this.siNames = siNames;
    }

    @Override
    public List<String> getSiNotations() {
        return siNotations;
    }

    @Override
    public void setSiNotations(List<String> siNotations) {
        this.siNotations = siNotations;
    }

    @Override
    public List<String> getRegistrationAuthorityIds() {
        return registrationAuthorityIds;
    }

    @Override
    public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds) {
        this.registrationAuthorityIds = registrationAuthorityIds;
    }

    @Override
    public List<String> getSuppliers() {
        return suppliers;
    }

    @Override
    public void setSuppliers(List<String> suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    public List<String> getUnitNames() {
        return unitNames;
    }

    @Override
    public void setUnitNames(List<String> unitNames) {
        this.unitNames = unitNames;
    }

    @Override
    public List<String> getUnitSymbols() {
        return unitSymbols;
    }

    @Override
    public void setUnitSymbols(List<String> unitSymbols) {
        this.unitSymbols = unitSymbols;
    }

    /**
     * This builder class can be used to construct a DefaultRC01 bean.
     */
    public static class Builder extends RC01Builder<DefaultRC01, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultRC01 newBuildingInstance() {
            return new DefaultRC01();
        }
    }
}
