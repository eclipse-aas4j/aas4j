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

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization.LangStringsNameTypeDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization.LangStringsTextTypeDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.LangStringsNameTypeSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.LangStringsTextTypeSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonPropertyOrder({"hasExtensions", "category", "idShort", "displayName", "description", "checksum"})
public interface ReferableMixin {
    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "description")
	@JsonSerialize(using = LangStringsTextTypeSerializer.class)
    public List<LangStringTextType> getDescription();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "description")
    @JsonDeserialize(using = LangStringsTextTypeDeserializer.class)
    public void setDescription(List<LangStringTextType> descriptions);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "displayName")
	@JsonDeserialize(using = LangStringsNameTypeDeserializer.class)
    public List<LangStringNameType> getDisplayName();

	@JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "displayName")
	@JsonSerialize(using = LangStringsNameTypeSerializer.class)
	public void setDisplayName(List<LangStringNameType> displayNames);

    public String getIdShort();
}
