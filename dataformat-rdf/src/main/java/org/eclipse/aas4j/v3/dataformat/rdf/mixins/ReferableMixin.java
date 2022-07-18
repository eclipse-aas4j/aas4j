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
package org.eclipse.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.model.Identifiable;
import org.eclipse.aas4j.v3.model.LangString;
import org.eclipse.aas4j.v3.model.SubmodelElement;

import java.util.List;

@JsonTypeName("aas:Referable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Identifiable.class),
    @JsonSubTypes.Type(value = SubmodelElement.class)
})
public interface ReferableMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    String getCategory();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    void setCategory(String category);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    List<LangString> getDescriptions();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    void setDescriptions(List<LangString> descriptions);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    List<LangString> getDisplayNames();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    void setDisplayNames(List<LangString> displayNames);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    String getIdShort();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    void setIdShort(String idShort);
}
