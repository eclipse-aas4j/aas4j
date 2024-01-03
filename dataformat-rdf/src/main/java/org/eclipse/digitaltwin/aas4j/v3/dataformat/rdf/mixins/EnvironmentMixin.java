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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;

import java.util.List;

@JsonTypeName("aas:Environment")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface EnvironmentMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/assetAdministrationShells")
    List<AssetAdministrationShell> getAssetAdministrationShells();

    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/assetAdministrationShells")
    void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/conceptDescriptions")
    List<ConceptDescription> getConceptDescriptions();

    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/conceptDescriptions")
    void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);

    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/submodels")
    List<Submodel> getSubmodels();

    @JsonProperty("https://admin-shell.io/aas/3/0/Environment/submodels")
    void setSubmodels(List<Submodel> submodels);
}
