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

import java.math.BigInteger;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


public abstract class OperationRequestBuilder<T extends OperationRequest, B extends OperationRequestBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for inoutputArguments
     * 
     * @param inoutputArguments desired value to be set
     * @return Builder object with new value for inoutputArguments
     */
    public B inoutputArguments(OperationVariable inoutputArguments) {
        getBuildingInstance().setInoutputArguments(inoutputArguments);
        return getSelf();
    }

    /**
     * This function allows setting a value for inputArguments
     * 
     * @param inputArguments desired value to be set
     * @return Builder object with new value for inputArguments
     */
    public B inputArguments(OperationVariable inputArguments) {
        getBuildingInstance().setInputArguments(inputArguments);
        return getSelf();
    }

    /**
     * This function allows setting a value for requestId
     * 
     * @param requestId desired value to be set
     * @return Builder object with new value for requestId
     */
    public B requestId(String requestId) {
        getBuildingInstance().setRequestId(requestId);
        return getSelf();
    }

    /**
     * This function allows setting a value for timeout
     * 
     * @param timeout desired value to be set
     * @return Builder object with new value for timeout
     */
    public B timeout(BigInteger timeout) {
        getBuildingInstance().setTimeout(timeout);
        return getSelf();
    }
}
