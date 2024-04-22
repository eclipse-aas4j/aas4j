/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.OperationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

import java.util.List;


public abstract class OperationResultBuilder<T extends OperationResult, B extends OperationResultBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for inoutputArguments
     * 
     * @param inoutputArguments desired value to be set
     * @return Builder object with new value for inoutputArguments
     */
    public B inoutputArguments(List<OperationVariable> inoutputArguments) {
        getBuildingInstance().setInoutputArguments(inoutputArguments);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List inoutputArguments
     * 
     * @param inoutputArguments desired value to be added
     * @return Builder object with new value for inoutputArguments
     */
    public B inoutputArguments(OperationVariable inoutputArguments) {
        getBuildingInstance().getInoutputArguments().add(inoutputArguments);
        return getSelf();
    }

    /**
     * This function allows setting a value for outputArguments
     * 
     * @param outputArguments desired value to be set
     * @return Builder object with new value for outputArguments
     */
    public B outputArguments(List<OperationVariable> outputArguments) {
        getBuildingInstance().setOutputArguments(outputArguments);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List outputArguments
     * 
     * @param outputArguments desired value to be added
     * @return Builder object with new value for outputArguments
     */
    public B outputArguments(OperationVariable outputArguments) {
        getBuildingInstance().getOutputArguments().add(outputArguments);
        return getSelf();
    }
}
