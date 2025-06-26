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



import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMessage.class)
})
public interface Message {

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/code
     *
     * @return Returns the String for the property code.
     */
    @IRI("https://admin-shell.io/aas/3/1/Message/code")
    String getCode();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/code
     *
     * @param code desired value for the property code.
     */
    void setCode(String code);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/correlationId
     *
     * @return Returns the String for the property correlationId.
     */
    @IRI("https://admin-shell.io/aas/3/1/Message/correlationId")
    String getCorrelationId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/correlationId
     *
     * @param correlationId desired value for the property correlationId.
     */
    void setCorrelationId(String correlationId);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/messageType
     *
     * @return Returns the MessageType for the property messageType.
     */
    @IRI("https://admin-shell.io/aas/3/1/Message/messageType")
    MessageType getMessageType();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/messageType
     *
     * @param messageType desired value for the property messageType.
     */
    void setMessageType(MessageType messageType);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/text
     *
     * @return Returns the String for the property text.
     */
    @IRI("https://admin-shell.io/aas/3/1/Message/text")
    String getText();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/text
     *
     * @param text desired value for the property text.
     */
    void setText(String text);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/timestamp
     *
     * @return Returns the String for the property timestamp.
     */
    @IRI("https://admin-shell.io/aas/3/1/Message/timestamp")
    String getTimestamp();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/Message/timestamp
     *
     * @param timestamp desired value for the property timestamp.
     */
    void setTimestamp(String timestamp);

}
