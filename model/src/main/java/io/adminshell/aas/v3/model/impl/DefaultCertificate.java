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

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Certificate
 * 
 * A technical certificate proofing the identity through cryptographic measures.
 */

@IRI("aas:Certificate")
public class DefaultCertificate implements Certificate {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    protected PolicyAdministrationPoint policyAdministrationPoint;

    public DefaultCertificate() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.policyAdministrationPoint);
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
            DefaultCertificate other = (DefaultCertificate) obj;
            return Objects.equals(this.policyAdministrationPoint, other.policyAdministrationPoint);
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

    /**
     * This builder class can be used to construct a DefaultCertificate bean.
     */
    public static class Builder extends CertificateBuilder<DefaultCertificate, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultCertificate newBuildingInstance() {
            return new DefaultCertificate();
        }
    }
}
