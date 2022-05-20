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
package io.adminshell.aas.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.adminshell.aas.v3.model.AssetInformation;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.Security;
import io.adminshell.aas.v3.model.View;

import java.util.List;

@JsonTypeName("aas:AssetAdministrationShell")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AssetAdministrationShellMixin extends HasDataSpecificationMixin, IdentifiableMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    AssetInformation getAssetInformation();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    void setAssetInformation(AssetInformation assetInformation);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    Reference getDerivedFrom();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    void setDerivedFrom(Reference derivedFrom);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    Security getSecurity();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    void setSecurity(Security security);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    List<Reference> getSubmodels();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    void setSubmodels(List<Reference> submodels);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    List<View> getViews();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    void setViews(List<View> views);
}
