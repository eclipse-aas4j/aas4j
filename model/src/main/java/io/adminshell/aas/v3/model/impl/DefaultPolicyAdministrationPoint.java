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
 * Default implementation of package io.adminshell.aas.v3.model.PolicyAdministrationPoint
 * 
 * Definition of a security administration point (PDP).
 */

@IRI("aas:PolicyAdministrationPoint")
public class DefaultPolicyAdministrationPoint implements PolicyAdministrationPoint {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    protected boolean externalAccessControl;

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    protected AccessControl localAccessControl;

    public DefaultPolicyAdministrationPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.localAccessControl,
            this.externalAccessControl);
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
            DefaultPolicyAdministrationPoint other = (DefaultPolicyAdministrationPoint) obj;
            return Objects.equals(this.localAccessControl, other.localAccessControl) &&
                Objects.equals(this.externalAccessControl, other.externalAccessControl);
        }
    }

    @Override
    public AccessControl getLocalAccessControl() {
        return localAccessControl;
    }

    @Override
    public void setLocalAccessControl(AccessControl localAccessControl) {
        this.localAccessControl = localAccessControl;
    }

    @Override
    public boolean getExternalAccessControl() {
        return externalAccessControl;
    }

    @Override
    public void setExternalAccessControl(boolean externalAccessControl) {
        this.externalAccessControl = externalAccessControl;
    }

    /**
     * This builder class can be used to construct a DefaultPolicyAdministrationPoint bean.
     */
    public static class Builder extends PolicyAdministrationPointBuilder<DefaultPolicyAdministrationPoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyAdministrationPoint newBuildingInstance() {
            return new DefaultPolicyAdministrationPoint();
        }
    }
}
