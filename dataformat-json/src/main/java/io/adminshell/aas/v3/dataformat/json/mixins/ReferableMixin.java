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
package io.adminshell.aas.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.LangStringSet;

import java.util.List;
import java.util.Set;

public interface ReferableMixin {

    @JsonInclude(JsonInclude.Include.ALWAYS)
    public Set<AssetAdministrationShell> getIdShort();

    @JsonProperty("description")
    public LangStringSet getDescriptions();

    @JsonProperty("description")
    public void setDescriptions(LangStringSet descriptions);

    @JsonProperty("displayName")
    public LangStringSet getDisplayNames();

    @JsonProperty("displayName")
    public void setDisplayNames(LangStringSet displayNames);
}
