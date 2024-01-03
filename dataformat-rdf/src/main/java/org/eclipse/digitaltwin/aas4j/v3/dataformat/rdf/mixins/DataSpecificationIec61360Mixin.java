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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.util.List;

@JsonTypeName("aas:DataSpecificationIec61360")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DataSpecificationIec61360Mixin extends DataSpecificationContentMixin {

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/dataType")
    public DataTypeIec61360 getDataType();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/dataType")
    public void setDataType(DataTypeIec61360 dataType);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/definition")
    public List<LangStringDefinitionTypeIec61360> getDefinition();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/definition")
    public void setDefinitions(List<LangStringDefinitionTypeIec61360> definition);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/levelType")
    public LevelType getLevelType();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/levelType")
    public void setLevelType(LevelType levelType);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/preferredName")
    public List<LangStringPreferredNameTypeIec61360> getPreferredName();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/preferredName")
    public void setPreferredName(List<LangStringPreferredNameTypeIec61360> preferredName);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/shortName")
    public List<LangStringShortNameTypeIec61360> getShortName();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/shortName")
    public void setShortName(List<LangStringShortNameTypeIec61360> shortName);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/sourceOfDefinition")
    public String getSourceOfDefinition();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/sourceOfDefinition")
    public void setSourceOfDefinition(String sourceOfDefinition);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/symbol")
    public String getSymbol();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/symbol")
    public void setSymbol(String symbol);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/unit")
    public String getUnit();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/unit")
    public void setUnit(String unit);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/unitId")
    public Reference getUnitId();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/unitId")
    public void setUnitId(Reference unitId);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueFormat")
    public String getValueFormat();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueFormat")
    public void setValueFormat(String valueFormat);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/value")
    public String getValue();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/value")
    public void setValue(String value);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueList")
    public ValueList getValueList();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueList")
    public void setValueList(ValueList valueList);

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueId")
    public Reference getValueId();

    @JsonProperty("https://admin-shell.io/aas/3/0/DataSpecificationIec61360/valueId")
    public void setValueId(Reference valueId);
}
