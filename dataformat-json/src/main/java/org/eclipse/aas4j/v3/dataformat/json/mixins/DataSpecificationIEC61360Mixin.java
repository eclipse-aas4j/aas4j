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

// TODO import io.adminshell.aas.v3.model.LevelType;
import org.eclipse.aas4j.v3.model.LangString;
import org.eclipse.aas4j.v3.model.LevelType;

import java.util.List;

public interface DataSpecificationIEC61360Mixin {

    @JsonProperty("definitions")
    public List<LangString> getDefinition();

    @JsonProperty("definitions")
    public void setDefinition(List<LangString> definition);

    @JsonProperty("levelType")
    public List<LevelType> getLevelTypes();

    // TODO
    // @JsonProperty("levelType")
    // public void setLevelTypes(List<LevelType> levelTypes);

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("preferredName")
    public List<LangString> getPreferredName();

    @JsonProperty("preferredName")
    public void setPreferredName(List<LangString> preferredName);

    @JsonProperty("shortName")
    public List<LangString> getShortName();

    @JsonProperty("shortName")
    public void setShortName(List<LangString> shortName);
}
