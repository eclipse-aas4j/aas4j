/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AccessControlPolicyPoints
 * 
 * Container for access control policy points.
 */

@IRI("aas:AccessControlPolicyPoints")
public class DefaultAccessControlPolicyPoints implements AccessControlPolicyPoints {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    protected PolicyAdministrationPoint policyAdministrationPoint;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    protected PolicyDecisionPoint policyDecisionPoint;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    protected PolicyEnforcementPoints policyEnforcementPoint;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    protected PolicyInformationPoints policyInformationPoints;

    public DefaultAccessControlPolicyPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.policyAdministrationPoint,
            this.policyDecisionPoint,
            this.policyEnforcementPoint,
            this.policyInformationPoints);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultAccessControlPolicyPoints other = (DefaultAccessControlPolicyPoints) obj;
            return Objects.equals(this.policyAdministrationPoint, other.policyAdministrationPoint) &&
                Objects.equals(this.policyDecisionPoint, other.policyDecisionPoint) &&
                Objects.equals(this.policyEnforcementPoint, other.policyEnforcementPoint) &&
                Objects.equals(this.policyInformationPoints, other.policyInformationPoints);
        }
    }

    @Override
    public PolicyAdministrationPoint getPolicyAdministrationPoint() {
        return policyAdministrationPoint;
    }

    @Override
    public void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        this.policyAdministrationPoint = policyAdministrationPoint;
    }

    @Override
    public PolicyDecisionPoint getPolicyDecisionPoint() {
        return policyDecisionPoint;
    }

    @Override
    public void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        this.policyDecisionPoint = policyDecisionPoint;
    }

    @Override
    public PolicyEnforcementPoints getPolicyEnforcementPoint() {
        return policyEnforcementPoint;
    }

    @Override
    public void setPolicyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
        this.policyEnforcementPoint = policyEnforcementPoint;
    }

    @Override
    public PolicyInformationPoints getPolicyInformationPoints() {
        return policyInformationPoints;
    }

    @Override
    public void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        this.policyInformationPoints = policyInformationPoints;
    }

    /**
     * This builder class can be used to construct a DefaultAccessControlPolicyPoints bean.
     */
    public static class Builder extends AccessControlPolicyPointsBuilder<DefaultAccessControlPolicyPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAccessControlPolicyPoints newBuildingInstance() {
            return new DefaultAccessControlPolicyPoints();
        }
    }
}
