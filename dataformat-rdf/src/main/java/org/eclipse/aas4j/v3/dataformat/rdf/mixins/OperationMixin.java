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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.model.OperationVariable;

import java.util.List;

@JsonTypeName("aas:Operation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface OperationMixin extends SubmodelElementMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/inputVariable")
    List<OperationVariable> getInputVariables();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/inputVariable")
    void setInputVariables(List<OperationVariable> inputVariables);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/inoutputVariable")
    List<OperationVariable> getInoutputVariables();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/inoutputVariable")
    void setInoutputVariables(List<OperationVariable> inoutputVariables);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/outputVariable")
    List<OperationVariable> getOutputVariables();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/Operation/outputVariable")
    void setOutputVariables(List<OperationVariable> outputVariables);
}
