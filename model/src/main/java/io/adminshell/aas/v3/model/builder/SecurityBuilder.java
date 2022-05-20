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

import java.util.List;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class SecurityBuilder<T extends Security, B extends SecurityBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for accessControlPolicyPoints
     * 
     * @param accessControlPolicyPoints desired value to be set
     * @return Builder object with new value for accessControlPolicyPoints
     */
    public B accessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        getBuildingInstance().setAccessControlPolicyPoints(accessControlPolicyPoints);
        return getSelf();
    }

    /**
     * This function allows setting a value for certificates
     * 
     * @param certificates desired value to be set
     * @return Builder object with new value for certificates
     */
    public B certificates(List<Certificate> certificates) {
        getBuildingInstance().setCertificates(certificates);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List certificates
     * 
     * @param certificate desired value to be added
     * @return Builder object with new value for certificates
     */
    public B certificate(Certificate certificate) {
        getBuildingInstance().getCertificates().add(certificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for requiredCertificateExtensions
     * 
     * @param requiredCertificateExtensions desired value to be set
     * @return Builder object with new value for requiredCertificateExtensions
     */
    public B requiredCertificateExtensions(List<Reference> requiredCertificateExtensions) {
        getBuildingInstance().setRequiredCertificateExtensions(requiredCertificateExtensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List requiredCertificateExtensions
     * 
     * @param requiredCertificateExtension desired value to be added
     * @return Builder object with new value for requiredCertificateExtensions
     */
    public B requiredCertificateExtension(Reference requiredCertificateExtension) {
        getBuildingInstance().getRequiredCertificateExtensions().add(requiredCertificateExtension);
        return getSelf();
    }
}
