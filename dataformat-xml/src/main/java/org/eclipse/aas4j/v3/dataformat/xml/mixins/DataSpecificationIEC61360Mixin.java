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
package org.eclipse.aas4j.v3.dataformat.xml.mixins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.eclipse.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.aas4j.v3.model.*;

import java.util.List;

@JsonPropertyOrder({"preferredNames", "shortNames", "unit", "unitId", "sourceOfDefinition", "symbol", "dataType", "definitions", "valueFormat", "valueList", "value", "valueId", "levelType"})
public interface DataSpecificationIEC61360Mixin {

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "definitions")
    public List<LangString> getDefinitions();

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "definitions")
    public void setDefinitions(List<LangString> definition);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "levelType")
    public LevelType getLevelType();

    // TODO
//    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "levelType")
    // public void setLevelTypes(List<LevelType> levelTypes);

//    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "preferredNames")
    public List<LangString> getPreferredNames();

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "preferredNames")
    public void setPreferredNames(List<LangString> preferredName);

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "shortNames")
    public List<LangString> getShortNames();

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "shortNames")
    public void setShortNames(List<LangString> shortName);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "sourceOfDefinition")
    public String getSourceOfDefinition();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "symbol")
    public String getSymbol();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "unit")
    public String getUnit();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "unitId")
    public Reference getUnitId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueFormat")
    public String getValueFormat();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "value")
    public String getValue();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueList")
    public ValueList getValueList();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "valueId")
    public Reference getValueId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.IEC61360_URI, localName = "dataType")
    public DataTypeIEC61360 getDataType();

}
