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
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;

import java.util.List;

@JsonTypeName("aas:HasExtensions")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface HasExtensionsMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extension")
    List<Extension> getExtensions();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extension")
    void setExtensions(List<Extension> extensions);
}