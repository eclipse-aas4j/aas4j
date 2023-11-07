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

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

import java.util.List;

public interface OperationMixin {

    @JsonProperty("inputVariables")
    List<OperationVariable> getInputVariables();

    @JsonProperty("inputVariables")
    void setInputVariables(List<OperationVariable> inputVariables);

    @JsonProperty("inoutputVariables")
    List<OperationVariable> getInoutputVariables();

    @JsonProperty("inoutputVariables")
    void setInoutputVariables(List<OperationVariable> inoutputVariables);

    @JsonProperty("outputVariables")
    List<OperationVariable> getOutputVariables();

    @JsonProperty("outputVariables")
    void setOutputVariables(List<OperationVariable> outputVariables);
}
