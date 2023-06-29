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
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.Collection;

@JsonTypeName("aas:SubmodelElementCollection")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface SubmodelElementCollectionMixin extends SubmodelElementMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/allowDuplicates")
    boolean getAllowDuplicates();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/allowDuplicates")
    void setAllowDuplicates(boolean allowDuplicates);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/ordered")
    boolean getOrdered();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/ordered")
    void setOrdered(boolean ordered);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/value")
    Collection<SubmodelElement> getValues();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/value")
    void setValues(Collection<SubmodelElement> values);
}
