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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyInformationPoints
 * 
 * Defines the security policy information points (PIP). Serves as the retrieval source of
 * attributes, or the data required for policy evaluation to provide the information needed by the
 * policy decision point to make the decisions.
 */

@IRI("aas:PolicyInformationPoints")
public class DefaultPolicyInformationPoints implements PolicyInformationPoints {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    protected boolean externalInformationPoints;

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    protected List<Submodel> internalInformationPoints = new ArrayList<>();

    public DefaultPolicyInformationPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.externalInformationPoints,
            this.internalInformationPoints);
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
            DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
            return Objects.equals(this.externalInformationPoints, other.externalInformationPoints) &&
                Objects.equals(this.internalInformationPoints, other.internalInformationPoints);
        }
    }

    @Override
    public boolean getExternalInformationPoints() {
        return externalInformationPoints;
    }

    @Override
    public void setExternalInformationPoints(boolean externalInformationPoints) {
        this.externalInformationPoints = externalInformationPoints;
    }

    @Override
    public List<Submodel> getInternalInformationPoints() {
        return internalInformationPoints;
    }

    @Override
    public void setInternalInformationPoints(List<Submodel> internalInformationPoints) {
        this.internalInformationPoints = internalInformationPoints;
    }

    /**
     * This builder class can be used to construct a DefaultPolicyInformationPoints bean.
     */
    public static class Builder extends PolicyInformationPointsBuilder<DefaultPolicyInformationPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyInformationPoints newBuildingInstance() {
            return new DefaultPolicyInformationPoints();
        }
    }
}
