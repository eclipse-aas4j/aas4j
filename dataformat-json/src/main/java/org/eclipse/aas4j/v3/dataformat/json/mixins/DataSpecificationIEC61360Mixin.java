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
package org.eclipse.aas4j.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.aas4j.v3.model.LangStringSet;
// TODO import io.adminshell.aas.v3.model.LevelType;


public interface DataSpecificationIEC61360Mixin {

    @JsonProperty("definition")
    public LangStringSet getDefinition();

    @JsonProperty("definition")
    public void setDefinition(LangStringSet definition);

    // TODO
    // @JsonProperty("levelType")
    // public List<LevelType> getLevelTypes();

    // TODO
    // @JsonProperty("levelType")
    // public void setLevelTypes(List<LevelType> levelTypes);

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("preferredName")
    public LangStringSet getPreferredName();

    @JsonProperty("preferredName")
    public void setPreferredName(LangStringSet preferredName);

    @JsonProperty("shortName")
    public LangStringSet getShortName();

    @JsonProperty("shortName")
    public void setShortName(LangStringSet shortName);
}
