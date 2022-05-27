/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.DataSpecificationIEC61360
 * 
 * Data Specification Template for defining Property Descriptions conformant to IEC 61360.
 * Constraint AASd-075: For all ConceptDescriptions using data specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) values for the
 * attributes not being marked as mandatory or optional in tables Table 9, Table 10, Table 11 and
 * Table 12.depending on its category are ignored and handled as undefined.
 */

@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360")
public class DefaultDataSpecificationIEC61360 implements DataSpecificationIEC61360 {

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/dataType")
    protected DataTypeIEC61360 dataType;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/definition")
    protected List<LangString> definitions = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/levelType")
    protected List<LevelType> levelTypes = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/preferredName")
    protected List<LangString> preferredNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/shortName")
    protected List<LangString> shortNames = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/sourceOfDefinition")
    protected String sourceOfDefinition;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/symbol")
    protected String symbol;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unit")
    protected String unit;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/unitId")
    protected Reference unitId;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/value")
    protected String value;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueFormat")
    protected String valueFormat;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueId")
    protected Reference valueId;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataSpecificationIEC61360/valueList")
    protected ValueList valueList;

    public DefaultDataSpecificationIEC61360() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dataType,
            this.definitions,
            this.levelTypes,
            this.preferredNames,
            this.shortNames,
            this.sourceOfDefinition,
            this.symbol,
            this.unit,
            this.unitId,
            this.valueFormat,
            this.value,
            this.valueList,
            this.valueId);
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
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.levelTypes, other.levelTypes) &&
                Objects.equals(this.preferredNames, other.preferredNames) &&
                Objects.equals(this.shortNames, other.shortNames) &&
                Objects.equals(this.sourceOfDefinition, other.sourceOfDefinition) &&
                Objects.equals(this.symbol, other.symbol) &&
                Objects.equals(this.unit, other.unit) &&
                Objects.equals(this.unitId, other.unitId) &&
                Objects.equals(this.valueFormat, other.valueFormat) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueList, other.valueList) &&
                Objects.equals(this.valueId, other.valueId);
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
    public List<LangString> getDefinitions() {
        return definitions;
    }

    @Override
    public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @Override
    public List<LevelType> getLevelTypes() {
        return levelTypes;
    }

    @Override
    public void setLevelTypes(List<LevelType> levelTypes) {
        this.levelTypes = levelTypes;
    }

    @Override
    public List<LangString> getPreferredNames() {
        return preferredNames;
    }

    @Override
    public void setPreferredNames(List<LangString> preferredNames) {
        this.preferredNames = preferredNames;
    }

    @Override
    public List<LangString> getShortNames() {
        return shortNames;
    }

    @Override
    public void setShortNames(List<LangString> shortNames) {
        this.shortNames = shortNames;
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
    public Reference getUnitId() {
        return unitId;
    }

    @Override
    public void setUnitId(Reference unitId) {
        this.unitId = unitId;
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
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public ValueList getValueList() {
        return valueList;
    }

    @Override
    public void setValueList(ValueList valueList) {
        this.valueList = valueList;
    }

    @Override
    public Reference getValueId() {
        return valueId;
    }

    @Override
    public void setValueId(Reference valueId) {
        this.valueId = valueId;
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
