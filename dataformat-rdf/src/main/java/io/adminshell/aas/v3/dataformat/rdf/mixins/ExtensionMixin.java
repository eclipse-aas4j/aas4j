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
import io.adminshell.aas.v3.model.Reference;

@JsonTypeName("aas:Extension")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ExtensionMixin extends HasSemanticsMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    String getName();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    void setName(String name);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    String getValueType();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    void setValueType(String valueType);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    String getValue();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    void setValue(String value);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    Reference getRefersTo();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    void setRefersTo(Reference refersTo);
}
