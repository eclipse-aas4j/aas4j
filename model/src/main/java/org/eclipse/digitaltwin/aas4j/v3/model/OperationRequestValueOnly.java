/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationRequestValueOnly.class)
})
public interface OperationRequestValueOnly {

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inoutputArguments
     *
     * @return Returns the List of ValueOnlys for the property inoutputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inoutputArguments")
    List<ValueOnly> getInoutputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inoutputArguments
     *
     * @param inoutputArguments desired value for the property inoutputArguments.
     */
    void setInoutputArguments(List<ValueOnly> inoutputArguments);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inputArguments
     *
     * @return Returns the List of ValueOnlys for the property inputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inputArguments")
    List<ValueOnly> getInputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/OperationRequestValueOnly/inputArguments
     *
     * @param inputArguments desired value for the property inputArguments.
     */
    void setInputArguments(List<ValueOnly> inputArguments);

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/1/OperationRequestValueOnly/clientTimeoutDuration
     *
     * @return Returns the String for the property clientTimeoutDuration.
     */
    @IRI("https://admin-shell.io/aas/3/1/OperationRequestValueOnly/clientTimeoutDuration")
    String getClientTimeoutDuration();

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/1/OperationRequestValueOnly/clientTimeoutDuration
     *
     * @param clientTimeoutDuration desired value for the property clientTimeoutDuration.
     */
    void setClientTimeoutDuration(String clientTimeoutDuration);

}
