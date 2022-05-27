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
 * Default implementation of package io.adminshell.aas.v3.model.PolicyDecisionPoint
 * 
 * Defines a security policy decision point (PDP).
 */

@IRI("aas:PolicyDecisionPoint")
public class DefaultPolicyDecisionPoint implements PolicyDecisionPoint {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    protected boolean externalPolicyDecisionPoints;

    public DefaultPolicyDecisionPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.externalPolicyDecisionPoints);
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
            DefaultPolicyDecisionPoint other = (DefaultPolicyDecisionPoint) obj;
            return Objects.equals(this.externalPolicyDecisionPoints, other.externalPolicyDecisionPoints);
        }
    }

    @Override
    public boolean getExternalPolicyDecisionPoints() {
        return externalPolicyDecisionPoints;
    }

    @Override
    public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        this.externalPolicyDecisionPoints = externalPolicyDecisionPoints;
    }

    /**
     * This builder class can be used to construct a DefaultPolicyDecisionPoint bean.
     */
    public static class Builder extends PolicyDecisionPointBuilder<DefaultPolicyDecisionPoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyDecisionPoint newBuildingInstance() {
            return new DefaultPolicyDecisionPoint();
        }
    }
}
