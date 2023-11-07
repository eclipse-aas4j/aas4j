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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationRequest;

import java.math.BigInteger;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationRequest.class)
})
public interface OperationRequest {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments
     *
     * @return Returns the OperationVariable for the property inoutputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments")
    OperationVariable getInoutputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments
     *
     * @param inoutputArguments desired value for the property inoutputArguments.
     */
    void setInoutputArguments(OperationVariable inoutputArguments);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/inputArguments
     *
     * @return Returns the OperationVariable for the property inputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inputArguments")
    OperationVariable getInputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/inputArguments
     *
     * @param inputArguments desired value for the property inputArguments.
     */
    void setInputArguments(OperationVariable inputArguments);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/requestId
     *
     * @return Returns the String for the property requestId.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/requestId")
    String getRequestId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/requestId
     *
     * @param requestId desired value for the property requestId.
     */
    void setRequestId(String requestId);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/timeout
     *
     * @return Returns the BigInteger for the property timeout.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/timeout")
    BigInteger getTimeout();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationRequest/timeout
     *
     * @param timeout desired value for the property timeout.
     */
    void setTimeout(BigInteger timeout);

}
