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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import org.eclipse.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.aas4j.v3.model.File;
import org.eclipse.aas4j.v3.model.Reference;
import org.eclipse.aas4j.v3.model.SpecificAssetId;

@JsonPropertyOrder({ "assetKind", "globalAssetId", "specificAssetIds", "defaultThumbnail"})
public interface AssetInformationMixin {
    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "specificAssetId")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "specificAssetIds")
    public List<SpecificAssetId> getSpecificAssetIds();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "specificAssetId")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "specificAssetIds")
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "globalAssetId")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "globalAssetId")
    public Reference getGlobalAssetId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "globalAssetId")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "globalAssetId")
    public void setGlobalAssetId(Reference globalAssetId);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "submodelRef")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "billOfMaterials")
    public List<Reference> getBillOfMaterials();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "submodelRef")
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "billOfMaterials")
    public void setBillOfMaterials(List<Reference> billOfMaterials);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "defaultThumbnail")
    public File getDefaultThumbnail();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "defaultThumbnail")
    public void setDefaultThumbnail(File defaultThumbnail);
}
