/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;

import java.util.List;

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
	public String getGlobalAssetId();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "defaultThumbnail")
    public File getDefaultThumbnail();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "defaultThumbnail")
    public void setDefaultThumbnail(File defaultThumbnail);
}
