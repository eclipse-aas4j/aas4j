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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.List;
import java.util.Objects;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationPhysicalUnit;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DataSpecificationPhysicalUnitBuilder;


/**
 * Default implementation of org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationPhysicalUnit
 */

@IRI("aas:DefaultDataSpecificationPhysicalUnit")
public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/conversionFactor")
    protected String conversionFactor;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/dinNotation")
    protected String dinNotation;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/eceCode")
    protected String eceCode;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/eceName")
    protected String eceName;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/nistName")
    protected String nistName;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/registrationAuthorityId")
    protected String registrationAuthorityId;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/siName")
    protected String siName;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/siNotation")
    protected String siNotation;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/sourceOfDefinition")
    protected String sourceOfDefinition;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/supplier")
    protected String supplier;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/unitName")
    protected String unitName;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/unitSymbol")
    protected String unitSymbol;
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/definition")
    protected List<LangStringTextType> definition;

    public DefaultDataSpecificationPhysicalUnit() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.conversionFactor);
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
            return Objects.equals(this.conversionFactor, other.conversionFactor);
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

    @Override
    public List<LangStringTextType> getDefinition() {
        return definition;
    }

    @Override
    public void setDefinition(List<LangStringTextType> definition) {
        this.definition = definition;
    }

    public String toString() {
        return String.format(
                "DefaultDataSpecificationPhysicalUnit (conversionFactor=%s)",
                this.conversionFactor);
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
