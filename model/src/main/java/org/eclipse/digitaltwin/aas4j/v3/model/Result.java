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

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultResult.class)
})
public interface Result {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/Result/messages
     *
     * @return Returns the List of Messages for the property messages.
     */
    @IRI("https://admin-shell.io/aas/3/0/Result/messages")
    List<Message> getMessages();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/Result/messages
     *
     * @param messages desired value for the property messages.
     */
    void setMessages(List<Message> messages);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/Result/success
     *
     * @return Returns the boolean for the property success.
     */
    @IRI("https://admin-shell.io/aas/3/0/Result/success")
    boolean getSuccess();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/Result/success
     *
     * @param success desired value for the property success.
     */
    void setSuccess(boolean success);

}
