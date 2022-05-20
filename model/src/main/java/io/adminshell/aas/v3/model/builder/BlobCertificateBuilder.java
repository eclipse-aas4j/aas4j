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

public abstract class BlobCertificateBuilder<T extends BlobCertificate, B extends BlobCertificateBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for blobCertificate
     * 
     * @param blobCertificate desired value to be set
     * @return Builder object with new value for blobCertificate
     */
    public B blobCertificate(Blob blobCertificate) {
        getBuildingInstance().setBlobCertificate(blobCertificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for containedExtensions
     * 
     * @param containedExtensions desired value to be set
     * @return Builder object with new value for containedExtensions
     */
    public B containedExtensions(List<Reference> containedExtensions) {
        getBuildingInstance().setContainedExtensions(containedExtensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List containedExtensions
     * 
     * @param containedExtension desired value to be added
     * @return Builder object with new value for containedExtensions
     */
    public B containedExtension(Reference containedExtension) {
        getBuildingInstance().getContainedExtensions().add(containedExtension);
        return getSelf();
    }

    /**
     * This function allows setting a value for lastCertificate
     * 
     * @param lastCertificate desired value to be set
     * @return Builder object with new value for lastCertificate
     */
    public B lastCertificate(boolean lastCertificate) {
        getBuildingInstance().setLastCertificate(lastCertificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public B policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        getBuildingInstance().setPolicyAdministrationPoint(policyAdministrationPoint);
        return getSelf();
    }
}
