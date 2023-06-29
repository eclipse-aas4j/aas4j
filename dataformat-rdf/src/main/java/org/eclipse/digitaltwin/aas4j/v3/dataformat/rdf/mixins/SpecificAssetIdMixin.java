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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;

@JsonTypeName("aas:SpecificAssetId")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface SpecificAssetIdMixin extends HasSemanticsMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/name")
    String getName();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/name")
    void setName(String name);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/value")
    String getValue();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/value")
    void setValue(String value);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/externalSubjectId")
    Reference getExternalSubjectId();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/externalSubjectId")
    void setExternalSubjectId(Reference reference);

}
