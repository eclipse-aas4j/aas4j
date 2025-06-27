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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization.LangStringsDefinitionTypeIec61360Deserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization.LangStringsPreferredNameTypeIec61360Deserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization.LangStringsShortNameTypeIec61360Deserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.LangStringsDefinitionTypeIec61360Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.LangStringsPreferredNameTypeIec61360Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.LangStringsShortNameTypeIec61360Serializer;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringShortNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LevelType;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueList;

@JsonPropertyOrder({
  "preferredName",
  "shortName",
  "unit",
  "unitId",
  "sourceOfDefinition",
  "symbol",
  "dataType",
  "definition",
  "valueFormat",
  "valueList",
  "value",
  "valueId",
  "levelType"
})
public interface DataSpecificationIec61360Mixin {

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "definition")
  @JsonSerialize(using = LangStringsDefinitionTypeIec61360Serializer.class)
  public List<LangStringDefinitionTypeIec61360> getDefinition();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "definition")
  @JsonDeserialize(using = LangStringsDefinitionTypeIec61360Deserializer.class)
  public void setDefinition(List<LangStringDefinitionTypeIec61360> definition);

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "levelType")
  public LevelType getLevelType();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "preferredName")
  @JsonSerialize(using = LangStringsPreferredNameTypeIec61360Serializer.class)
  public List<LangStringPreferredNameTypeIec61360> getPreferredName();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "preferredName")
  @JsonDeserialize(using = LangStringsPreferredNameTypeIec61360Deserializer.class)
  public void setPreferredName(List<LangStringPreferredNameTypeIec61360> preferredName);

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "shortName")
  @JsonSerialize(using = LangStringsShortNameTypeIec61360Serializer.class)
  public List<LangStringShortNameTypeIec61360> getShortName();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "shortName")
  @JsonDeserialize(using = LangStringsShortNameTypeIec61360Deserializer.class)
  public void setShortName(List<LangStringShortNameTypeIec61360> shortName);

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "sourceOfDefinition")
  public String getSourceOfDefinition();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "symbol")
  public String getSymbol();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "unit")
  public String getUnit();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "unitId")
  public Reference getUnitID();

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
  public DataTypeIec61360 getDataType();
}
