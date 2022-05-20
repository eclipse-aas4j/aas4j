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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Container for security relevant information of the AAS.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSecurity.class)
})
public interface Security {

    /**
     * Access control policy points of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
     *
     * @return Returns the AccessControlPolicyPoints for the property accessControlPolicyPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
    AccessControlPolicyPoints getAccessControlPolicyPoints();

    /**
     * Access control policy points of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
     *
     * @param accessControlPolicyPoints desired value for the property accessControlPolicyPoints.
     */
    void setAccessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints);

    /**
     * Certificates of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/certificate
     *
     * @return Returns the List of Certificates for the property certificates.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
    List<Certificate> getCertificates();

    /**
     * Certificates of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/certificate
     *
     * @param certificates desired value for the property certificates.
     */
    void setCertificates(List<Certificate> certificates);

    /**
     * Certificate extensions as required by the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
     *
     * @return Returns the List of References for the property requiredCertificateExtensions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
    List<Reference> getRequiredCertificateExtensions();

    /**
     * Certificate extensions as required by the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
     *
     * @param requiredCertificateExtensions desired value for the property
     *        requiredCertificateExtensions.
     */
    void setRequiredCertificateExtensions(List<Reference> requiredCertificateExtensions);

}
