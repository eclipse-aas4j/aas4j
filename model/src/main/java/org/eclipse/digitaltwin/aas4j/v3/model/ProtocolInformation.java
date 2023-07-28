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
    @KnownSubtypes.Type(value = DefaultProtocolInformation.class)
})
public interface ProtocolInformation {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/href
     *
     * @return Returns the String for the property href.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/href")
    String getHref();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/href
     *
     * @param href desired value for the property href.
     */
    void setHref(String href);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocol
     *
     * @return Returns the String for the property endpointProtocol.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocol")
    String getEndpointProtocol();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocol
     *
     * @param endpointProtocol desired value for the property endpointProtocol.
     */
    void setEndpointProtocol(String endpointProtocol);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocolVersion
     *
     * @return Returns the List of Strings for the property endpointProtocolVersion.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocolVersion")
    List<String> getEndpointProtocolVersion();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/endpointProtocolVersion
     *
     * @param endpointProtocolVersions desired value for the property endpointProtocolVersion.
     */
    void setEndpointProtocolVersion(List<String> endpointProtocolVersions);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocol
     *
     * @return Returns the String for the property subprotocol.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocol")
    String getSubprotocol();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocol
     *
     * @param subprotocol desired value for the property subprotocol.
     */
    void setSubprotocol(String subprotocol);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBody
     *
     * @return Returns the String for the property subprotocolBody.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBody")
    String getSubprotocolBody();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBody
     *
     * @param subprotocolBody desired value for the property subprotocolBody.
     */
    void setSubprotocolBody(String subprotocolBody);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBodyEncoding
     *
     * @return Returns the String for the property subprotocolBodyEncoding.
     */
    @IRI("https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBodyEncoding")
    String getSubprotocolBodyEncoding();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/ProtocolInformation/subprotocolBodyEncoding
     *
     * @param subprotocolBodyEncoding desired value for the property subprotocolBodyEncoding.
     */
    void setSubprotocolBodyEncoding(String subprotocolBodyEncoding);

}
