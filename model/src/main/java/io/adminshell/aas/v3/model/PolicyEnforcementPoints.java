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

package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the security policy enforcement points (PEP).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyEnforcementPoints.class)
})
public interface PolicyEnforcementPoints {

    /**
     * If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     *
     * @return Returns the boolean for the property externalPolicyEnforcementPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
    boolean getExternalPolicyEnforcementPoint();

    /**
     * If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point
     * taking needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
     *
     * @param externalPolicyEnforcementPoint desired value for the property
     *        externalPolicyEnforcementPoint.
     */
    void setExternalPolicyEnforcementPoint(boolean externalPolicyEnforcementPoint);

}
