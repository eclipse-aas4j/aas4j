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
import io.adminshell.aas.v3.rc02.model.Reference;

@JsonTypeName("aas:Qualifier")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface QualifierMixin extends ConstraintMixin, HasSemanticsMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    String getType();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    void setType(String type);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    String getValueType();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    void setValueType(String valueType);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    String getValue();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    void setValue(String value);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    Reference getValueId();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    void setValueId(Reference valueId);
}
