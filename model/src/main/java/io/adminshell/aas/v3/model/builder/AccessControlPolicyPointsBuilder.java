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

package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AccessControlPolicyPointsBuilder<T extends AccessControlPolicyPoints, B extends AccessControlPolicyPointsBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public B policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        getBuildingInstance().setPolicyAdministrationPoint(policyAdministrationPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyDecisionPoint
     * 
     * @param policyDecisionPoint desired value to be set
     * @return Builder object with new value for policyDecisionPoint
     */
    public B policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        getBuildingInstance().setPolicyDecisionPoint(policyDecisionPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyEnforcementPoints
     * 
     * @param policyEnforcementPoints desired value to be set
     * @return Builder object with new value for policyEnforcementPoints
     */
    public B policyEnforcementPoints(PolicyEnforcementPoints policyEnforcementPoints) {
        getBuildingInstance().setPolicyEnforcementPoints(policyEnforcementPoints);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyInformationPoints
     * 
     * @param policyInformationPoints desired value to be set
     * @return Builder object with new value for policyInformationPoints
     */
    public B policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        getBuildingInstance().setPolicyInformationPoints(policyInformationPoints);
        return getSelf();
    }
}
