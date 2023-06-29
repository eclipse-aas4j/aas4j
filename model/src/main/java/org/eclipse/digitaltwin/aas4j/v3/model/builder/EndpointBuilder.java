/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;



import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.ProtocolInformation;

public abstract class EndpointBuilder<T extends Endpoint, B extends EndpointBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for interface
     * 
     * @param interfaceValue desired value to be set
     * @return Builder object with new value for interface
     */
    public B withInterface(String interfaceValue) {
        getBuildingInstance().setInterface(interfaceValue);
        return getSelf();
    }

    /**
     * This function allows setting a value for protocolInformation
     * 
     * @param protocolInformation desired value to be set
     * @return Builder object with new value for protocolInformation
     */
    public B protocolInformation(ProtocolInformation protocolInformation) {
        getBuildingInstance().setProtocolInformation(protocolInformation);
        return getSelf();
    }
}
