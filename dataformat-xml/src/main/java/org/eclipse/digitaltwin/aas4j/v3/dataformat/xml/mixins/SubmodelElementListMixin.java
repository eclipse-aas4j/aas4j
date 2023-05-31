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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization.SubmodelElementsDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.SubmodelElementsSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.AASSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public interface SubmodelElementListMixin {
    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "value")
    @JsonSerialize(using = SubmodelElementsSerializer.class)
    @JsonDeserialize(using = SubmodelElementsDeserializer.class)
    public List<SubmodelElement> getValue();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "orderRelevant")
    public boolean getOrderRelevant();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "orderRelevant")
    public void setOrderRelevant(boolean orderRelevant);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "semanticIdListElement")
    public Reference getSemanticIdListElement();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "semanticIdListElement")
    public void setSemanticIdListElement(Reference semanticIdListElement);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "typeValueListElement")
	public AASSubmodelElements getTypeValueListElement();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "typeValueListElement")
	public void setTypeValueListElement(AASSubmodelElements typeValueListElement);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueTypeListElement")
	public DataTypeDefXSD getValueTypeListElement();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "valueTypeListElement")
	public void setValueTypeListElement(DataTypeDefXSD valueTypeListElement);
}
