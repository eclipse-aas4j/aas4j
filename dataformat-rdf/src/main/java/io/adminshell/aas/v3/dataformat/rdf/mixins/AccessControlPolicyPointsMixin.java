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
package io.adminshell.aas.v3.dataformat.rdf.mixins;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.adminshell.aas.v3.model.PolicyAdministrationPoint;
import io.adminshell.aas.v3.model.PolicyDecisionPoint;
import io.adminshell.aas.v3.model.PolicyEnforcementPoints;
import io.adminshell.aas.v3.model.PolicyInformationPoints;

@JsonTypeName("aas:AccessControlPolicyPoints")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AccessControlPolicyPointsMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    PolicyAdministrationPoint getPolicyAdministrationPoint();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    PolicyDecisionPoint getPolicyDecisionPoint();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    PolicyEnforcementPoints getPolicyEnforcementPoint();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    void setPolicyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    PolicyInformationPoints getPolicyInformationPoints();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints);
}
