/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.ProtocolInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.EndpointBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Endpoint
 * 
 */

@IRI("aas:Endpoint")
public class DefaultEndpoint implements Endpoint {

    @IRI("https://admin-shell.io/aas/3/0/Endpoint/_interface")
    protected String _interface;

    @IRI("https://admin-shell.io/aas/3/0/Endpoint/protocolInformation")
    protected ProtocolInformation protocolInformation;

    public DefaultEndpoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(this._interface,
            this.protocolInformation);
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
            DefaultEndpoint other = (DefaultEndpoint) obj;
            return Objects.equals(this._interface, other._interface) &&
                Objects.equals(this.protocolInformation, other.protocolInformation);
        }
    }

    @Override
    public String get_interface() {
        return _interface;
    }

    @Override
    public void set_interface(String _interface) {
        this._interface = _interface;
    }

    @Override
    public ProtocolInformation getProtocolInformation() {
        return protocolInformation;
    }

    @Override
    public void setProtocolInformation(ProtocolInformation protocolInformation) {
        this.protocolInformation = protocolInformation;
    }

    public String toString() {
        return String.format(
            "DefaultEndpoint (" + "_interface=%s,"
                + "protocolInformation=%s,"
                + ")",
            this._interface, this.protocolInformation);
    }

    /**
     * This builder class can be used to construct a DefaultEndpoint bean.
     */
    public static class Builder extends EndpointBuilder<DefaultEndpoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEndpoint newBuildingInstance() {
            return new DefaultEndpoint();
        }
    }
}
