/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationPhysicalUnit;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DataSpecificationPhysicalUnitBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationPhysicalUnit
 * 
 */

@IRI("aas:DataSpecificationPhysicalUnit")
public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor")
    protected String conversionFactor;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/definition")
    protected List<LangString> definition = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation")
    protected String dinNotation;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceCode")
    protected String eceCode;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceName")
    protected String eceName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/nistName")
    protected String nistName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId")
    protected String registrationAuthorityId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siName")
    protected String siName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siNotation")
    protected String siNotation;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/sourceOfDefinition")
    protected String sourceOfDefinition;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/supplier")
    protected String supplier;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitName")
    protected String unitName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol")
    protected String unitSymbol;

    public DefaultDataSpecificationPhysicalUnit() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.conversionFactor,
            this.definition,
            this.dinNotation,
            this.eceCode,
            this.eceName,
            this.nistName,
            this.registrationAuthorityId,
            this.siName,
            this.siNotation,
            this.sourceOfDefinition,
            this.supplier,
            this.unitName,
            this.unitSymbol);
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
            DefaultDataSpecificationPhysicalUnit other = (DefaultDataSpecificationPhysicalUnit) obj;
            return Objects.equals(this.conversionFactor, other.conversionFactor) &&
                Objects.equals(this.definition, other.definition) &&
                Objects.equals(this.dinNotation, other.dinNotation) &&
                Objects.equals(this.eceCode, other.eceCode) &&
                Objects.equals(this.eceName, other.eceName) &&
                Objects.equals(this.nistName, other.nistName) &&
                Objects.equals(this.registrationAuthorityId, other.registrationAuthorityId) &&
                Objects.equals(this.siName, other.siName) &&
                Objects.equals(this.siNotation, other.siNotation) &&
                Objects.equals(this.sourceOfDefinition, other.sourceOfDefinition) &&
                Objects.equals(this.supplier, other.supplier) &&
                Objects.equals(this.unitName, other.unitName) &&
                Objects.equals(this.unitSymbol, other.unitSymbol);
        }
    }

    @Override
    public String getConversionFactor() {
        return conversionFactor;
    }

    @Override
    public void setConversionFactor(String conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public List<LangString> getDefinition() {
        return definition;
    }

    @Override
    public void setDefinition(List<LangString> definition) {
        this.definition = definition;
    }

    @Override
    public String getDinNotation() {
        return dinNotation;
    }

    @Override
    public void setDinNotation(String dinNotation) {
        this.dinNotation = dinNotation;
    }

    @Override
    public String getEceCode() {
        return eceCode;
    }

    @Override
    public void setEceCode(String eceCode) {
        this.eceCode = eceCode;
    }

    @Override
    public String getEceName() {
        return eceName;
    }

    @Override
    public void setEceName(String eceName) {
        this.eceName = eceName;
    }

    @Override
    public String getNistName() {
        return nistName;
    }

    @Override
    public void setNistName(String nistName) {
        this.nistName = nistName;
    }

    @Override
    public String getRegistrationAuthorityId() {
        return registrationAuthorityId;
    }

    @Override
    public void setRegistrationAuthorityId(String registrationAuthorityId) {
        this.registrationAuthorityId = registrationAuthorityId;
    }

    @Override
    public String getSiName() {
        return siName;
    }

    @Override
    public void setSiName(String siName) {
        this.siName = siName;
    }

    @Override
    public String getSiNotation() {
        return siNotation;
    }

    @Override
    public void setSiNotation(String siNotation) {
        this.siNotation = siNotation;
    }

    @Override
    public String getSourceOfDefinition() {
        return sourceOfDefinition;
    }

    @Override
    public void setSourceOfDefinition(String sourceOfDefinition) {
        this.sourceOfDefinition = sourceOfDefinition;
    }

    @Override
    public String getSupplier() {
        return supplier;
    }

    @Override
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    @Override
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String getUnitSymbol() {
        return unitSymbol;
    }

    @Override
    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecificationPhysicalUnit bean.
     */
    public static class Builder extends DataSpecificationPhysicalUnitBuilder<DefaultDataSpecificationPhysicalUnit, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationPhysicalUnit newBuildingInstance() {
            return new DefaultDataSpecificationPhysicalUnit();
        }
    }
}
