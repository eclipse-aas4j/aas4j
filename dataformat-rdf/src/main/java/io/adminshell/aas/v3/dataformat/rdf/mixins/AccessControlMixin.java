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
import io.adminshell.aas.v3.model.AccessPermissionRule;
import io.adminshell.aas.v3.model.Reference;

import java.util.List;

@JsonTypeName("aas:AccessControl")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AccessControlMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    List<AccessPermissionRule> getAccessPermissionRules();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    Reference getSelectableSubjectAttributes();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    void setSelectableSubjectAttributes(Reference selectableSubjectAttributes);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    Reference getDefaultSubjectAttributes();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    void setDefaultSubjectAttributes(Reference defaultSubjectAttributes);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    Reference getSelectablePermissions();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    void setSelectablePermissions(Reference selectablePermissions);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    Reference getDefaultPermissions();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    void setDefaultPermissions(Reference defaultPermissions);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    Reference getSelectableEnvironmentAttributes();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    void setSelectableEnvironmentAttributes(Reference selectableEnvironmentAttributes);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    Reference getDefaultEnvironmentAttributes();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    void setDefaultEnvironmentAttributes(Reference defaultEnvironmentAttributes);
}
