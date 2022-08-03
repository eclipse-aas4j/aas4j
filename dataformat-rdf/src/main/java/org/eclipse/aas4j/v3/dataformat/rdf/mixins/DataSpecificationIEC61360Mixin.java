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
package org.eclipse.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.model.*;

import java.util.List;

@JsonTypeName("iec61360:DataSpecificationIEC61360")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DataSpecificationIEC61360Mixin {
    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/dataType")
    public DataTypeIEC61360 getDataType();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/dataType")
    public void setDataType(DataTypeIEC61360 dataType);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/definitions")
    public List<LangString> getDefinitions();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/definitions")
    public void setDefinitions(List<LangString> definitions);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/levelType")
    public LevelType getLevelType();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/levelType")
    public void setLevelType(LevelType levelType);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/preferredNames")
    public List<LangString> getPreferredNames();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/preferredNames")
    public void setPreferredNames(List<LangString> preferredName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/shortNames")
    public List<LangString> getShortNames();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/shortNames")
    public void setShortNames(List<LangString> shortName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/sourceOfDefinition")
    public String getSourceOfDefinition();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/sourceOfDefinition")
    public void setSourceOfDefinition(String sourceOfDefinition);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/symbol")
    public String getSymbol();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/symbol")
    public void setSymbol(String symbol);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/unit")
    public String getUnit();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/unit")
    public void setUnit(String unit);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/unitId")
    public Reference getUnitId();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/unitId")
    public void setUnitId(Reference unitId);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueFormat")
    public String getValueFormat();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueFormat")
    public void setValueFormat(String valueFormat);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/value")
    public String getValue();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/value")
    public void setValue(String value);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueList")
    public ValueList getValueList();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueList")
    public void setValueList(ValueList valueList);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueId")
    public Reference getValueId();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataSpecificationIEC61360/valueId")
    public void setValueId(Reference valueId);
}
