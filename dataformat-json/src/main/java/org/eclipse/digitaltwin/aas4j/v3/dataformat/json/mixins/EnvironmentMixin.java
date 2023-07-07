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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;

public interface EnvironmentMixin {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    Set<AssetAdministrationShell> getAssetAdministrationShells();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    List<Submodel> getSubmodels();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    List<ConceptDescription> getConceptDescriptions();
}
