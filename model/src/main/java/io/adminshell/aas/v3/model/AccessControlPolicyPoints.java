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
 * Container for access control policy points.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControlPolicyPoints.class)
})
public interface AccessControlPolicyPoints {

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     *
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     *
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
     */
    void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     *
     * @return Returns the PolicyDecisionPoint for the property policyDecisionPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    PolicyDecisionPoint getPolicyDecisionPoint();

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     *
     * @param policyDecisionPoint desired value for the property policyDecisionPoint.
     */
    void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint);

    /**
     * The access control policy enforcement points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoints
     *
     * @return Returns the PolicyEnforcementPoints for the property policyEnforcementPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoints")
    PolicyEnforcementPoints getPolicyEnforcementPoints();

    /**
     * The access control policy enforcement points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoints
     *
     * @param policyEnforcementPoints desired value for the property policyEnforcementPoints.
     */
    void setPolicyEnforcementPoints(PolicyEnforcementPoints policyEnforcementPoints);

    /**
     * The access control policy information points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     *
     * @return Returns the PolicyInformationPoints for the property policyInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    PolicyInformationPoints getPolicyInformationPoints();

    /**
     * The access control policy information points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     *
     * @param policyInformationPoints desired value for the property policyInformationPoints.
     */
    void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints);

}
