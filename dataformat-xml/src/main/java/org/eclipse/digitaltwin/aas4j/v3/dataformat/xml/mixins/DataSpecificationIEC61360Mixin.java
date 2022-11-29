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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization.LangStringsDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.LangStringsSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.util.List;

@JsonPropertyOrder({"preferredName", "shortName", "unit", "unitId", "sourceOfDefinition", "symbol", "dataType", "definition", "valueFormat", "valueList", "value", "valueId", "levelType"})
//@JacksonXmlRootElement(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataSpecificationIec61360")
public interface DataSpecificationIEC61360Mixin {

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "definition")
    @JsonSerialize(using = LangStringsSerializer.class)
    public List<LangString> getDefinition();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "definition")
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public void setDefinition(List<LangString> definition);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "levelType")
    public LevelType getLevelType();

    // TODO
//    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "levelType")
    // public void setLevelTypes(List<LevelType> levelTypes);

//    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "preferredName")
    @JsonSerialize(using = LangStringsSerializer.class)
    public List<LangString> getPreferredName();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "preferredName")
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public void setPreferredName(List<LangString> preferredName);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "shortName")
    @JsonSerialize(using = LangStringsSerializer.class)
    public List<LangString> getShortName();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "shortName")
    @JsonDeserialize(using = LangStringsDeserializer.class)
    public void setShortName(List<LangString> shortName);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "sourceOfDefinition")
    public String getSourceOfDefinition();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "symbol")
    public String getSymbol();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "unit")
    public String getUnit();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "unitId")
    public Reference getUnitId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueFormat")
    public String getValueFormat();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "value")
    public String getValue();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueList")
    public ValueList getValueList();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueList")
    public void setValueList(ValueList valueList);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueId")
    public Reference getValueId();


    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataType")
    @JsonSerialize(using = EnumSerializer.class)
    public DataTypeIEC61360 getDataType();



}
