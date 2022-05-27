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
package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A technical certificate proofing the identity through cryptographic measures.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = BlobCertificate.class)
})
public interface Certificate {

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     *
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
    PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
     *
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
     */
    void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

}
