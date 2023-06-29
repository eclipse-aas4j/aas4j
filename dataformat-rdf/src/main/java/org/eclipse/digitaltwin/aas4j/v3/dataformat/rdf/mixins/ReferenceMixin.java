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
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;

import java.util.List;

@JsonTypeName("aas:Reference")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ReferenceMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Reference/keys")
    List<Key> getKeys();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Reference/keys")
    void setKeys(List<Key> keys);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Reference/type")
    ReferenceTypes getType();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Reference/type")
    void setType(ReferenceTypes type);
}
