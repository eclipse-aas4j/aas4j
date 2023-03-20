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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DataSpecificationIEC61360Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIEC61360
 * 
 * Content of data specification template for concept descriptions for properties, values and value
 * lists conformant to IEC 61360.
 */

@IRI("aas:DataSpecificationIEC61360")
public class DefaultDataSpecificationIEC61360 implements DataSpecificationIEC61360 {

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/dataType")
    protected DataTypeIEC61360 dataType;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/definition")
    protected List<LangStringDefinitionTypeIEC61360> definition = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/levelType")
    protected LevelType levelType;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/preferredName")
    protected List<LangStringPreferredNameTypeIEC61360> preferredName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/shortName")
    protected List<LangStringShortNameTypeIEC61360> shortName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/sourceOfDefinition")
    protected String sourceOfDefinition;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/symbol")
    protected String symbol;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/unit")
    protected String unit;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/unitID")
    protected Reference unitID;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/valueFormat")
    protected String valueFormat;

    @IRI("https://admin-shell.io/aas/3/0/DataSpecificationIEC61360/valueList")
    protected ValueList valueList;

    public DefaultDataSpecificationIEC61360() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.dataType,
            this.definition,
            this.levelType,
            this.preferredName,
            this.shortName,
            this.sourceOfDefinition,
            this.symbol,
            this.unit,
            this.unitID,
            this.value,
            this.valueFormat,
            this.valueList);
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
            DefaultDataSpecificationIEC61360 other = (DefaultDataSpecificationIEC61360) obj;
            return Objects.equals(this.dataType, other.dataType) &&
                Objects.equals(this.definition, other.definition) &&
                Objects.equals(this.levelType, other.levelType) &&
                Objects.equals(this.preferredName, other.preferredName) &&
                Objects.equals(this.shortName, other.shortName) &&
                Objects.equals(this.sourceOfDefinition, other.sourceOfDefinition) &&
                Objects.equals(this.symbol, other.symbol) &&
                Objects.equals(this.unit, other.unit) &&
                Objects.equals(this.unitID, other.unitID) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueFormat, other.valueFormat) &&
                Objects.equals(this.valueList, other.valueList);
        }
    }

    @Override
    public DataTypeIEC61360 getDataType() {
        return dataType;
    }

    @Override
    public void setDataType(DataTypeIEC61360 dataType) {
        this.dataType = dataType;
    }

    @Override
    public List<LangStringDefinitionTypeIEC61360> getDefinition() {
        return definition;
    }

    @Override
    public void setDefinition(List<LangStringDefinitionTypeIEC61360> definition) {
        this.definition = definition;
    }

    @Override
    public LevelType getLevelType() {
        return levelType;
    }

    @Override
    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    @Override
    public List<LangStringPreferredNameTypeIEC61360> getPreferredName() {
        return preferredName;
    }

    @Override
    public void setPreferredName(List<LangStringPreferredNameTypeIEC61360> preferredName) {
        this.preferredName = preferredName;
    }

    @Override
    public List<LangStringShortNameTypeIEC61360> getShortName() {
        return shortName;
    }

    @Override
    public void setShortName(List<LangStringShortNameTypeIEC61360> shortName) {
        this.shortName = shortName;
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
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public Reference getUnitID() {
        return unitID;
    }

    @Override
    public void setUnitID(Reference unitID) {
        this.unitID = unitID;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValueFormat() {
        return valueFormat;
    }

    @Override
    public void setValueFormat(String valueFormat) {
        this.valueFormat = valueFormat;
    }

    @Override
    public ValueList getValueList() {
        return valueList;
    }

    @Override
    public void setValueList(ValueList valueList) {
        this.valueList = valueList;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecificationIEC61360 bean.
     */
    public static class Builder extends DataSpecificationIEC61360Builder<DefaultDataSpecificationIEC61360, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationIEC61360 newBuildingInstance() {
            return new DefaultDataSpecificationIEC61360();
        }
    }
}
