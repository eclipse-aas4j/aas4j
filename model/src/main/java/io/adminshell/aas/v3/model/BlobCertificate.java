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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Certificate provided as BLOB.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlobCertificate.class)
})
public interface BlobCertificate extends Certificate {

    /**
     * Certificate as BLOB.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @return Returns the Blob for the property blobCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
    Blob getBlobCertificate();

    /**
     * Certificate as BLOB.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
     *
     * @param blobCertificate desired value for the property blobCertificate.
     */
    void setBlobCertificate(Blob blobCertificate);

    /**
     * Extensions contained in the certificate.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @return Returns the List of References for the property containedExtensions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
    List<Reference> getContainedExtensions();

    /**
     * Extensions contained in the certificate.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
     *
     * @param containedExtensions desired value for the property containedExtensions.
     */
    void setContainedExtensions(List<Reference> containedExtensions);

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @return Returns the boolean for the property lastCertificate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
    boolean getLastCertificate();

    /**
     * Denotes whether this certificate is the certificated that fast added last.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
     *
     * @param lastCertificate desired value for the property lastCertificate.
     */
    void setLastCertificate(boolean lastCertificate);

}
