/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.util.List;

public interface SubmodelDescriptorMixin {

    @JsonProperty("descriptions")
    public List<LangString> getDescription();

    @JsonProperty("descriptions")
    public void setDescription(List<LangString> description);

    @JsonProperty("displayNames")
    public List<LangString> getDisplayName();

    @JsonProperty("displayNames")
    public void setDisplayName(List<LangString> displayName);

    @JsonProperty("specificAssetIds")
    public SpecificAssetId getSpecificAssetId();

    @JsonProperty("specificAssetIds")
    public void setSpecificAssetId(SpecificAssetId specificAssetId);
}
