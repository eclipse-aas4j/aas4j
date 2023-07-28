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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.ProtocolInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.ProtocolInformationBuilder;

import java.util.List;
import java.util.Objects;

@IRI("aas:ProtocolInformation")
public class DefaultProtocolInformation implements ProtocolInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/href")
    protected String href;

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/endpointProtocol")
    protected String endpointProtocol;

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/endpointProtocolVersion")
    protected List<String> endpointProtocolVersion;

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/subprotocol")
    protected String subprotocol;

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/subprotocolBody")
    protected String subprotocolBody;

    @IRI("https://admin-shell.io/aas/3/0/RC02/ProtocolInformation/subprotocolBodyEncoding")
    protected String subprotocolBodyEncoding;

    public DefaultProtocolInformation() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.href,
            this.endpointProtocol,
            this.endpointProtocolVersion,
            this.subprotocol,
            this.subprotocolBody,
            this.subprotocolBodyEncoding);
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
            DefaultProtocolInformation other = (DefaultProtocolInformation) obj;
            return Objects.equals(this.href, other.href) &&
                Objects.equals(this.endpointProtocol, other.endpointProtocol) &&
                Objects.equals(this.endpointProtocolVersion, other.endpointProtocolVersion) &&
                Objects.equals(this.subprotocol, other.subprotocol) &&
                Objects.equals(this.subprotocolBody, other.subprotocolBody) &&
                Objects.equals(this.subprotocolBodyEncoding, other.subprotocolBodyEncoding);
        }
    }

    @Override
    public String getHref() {
        return href;
    }

    @Override
    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String getEndpointProtocol() {
        return endpointProtocol;
    }

    @Override
    public void setEndpointProtocol(String endpointProtocol) {
        this.endpointProtocol = endpointProtocol;
    }

    @Override
    public List<String> getEndpointProtocolVersion() {
        return endpointProtocolVersion;
    }

    @Override
    public void setEndpointProtocolVersion(List<String> endpointProtocolVersion) {
        this.endpointProtocolVersion = endpointProtocolVersion;
    }

    @Override
    public String getSubprotocol() {
        return subprotocol;
    }

    @Override
    public void setSubprotocol(String subprotocol) {
        this.subprotocol = subprotocol;
    }

    @Override
    public String getSubprotocolBody() {
        return subprotocolBody;
    }

    @Override
    public void setSubprotocolBody(String subprotocolBody) {
        this.subprotocolBody = subprotocolBody;
    }

    @Override
    public String getSubprotocolBodyEncoding() {
        return subprotocolBodyEncoding;
    }

    @Override
    public void setSubprotocolBodyEncoding(String subprotocolBodyEncoding) {
        this.subprotocolBodyEncoding = subprotocolBodyEncoding;
    }

    /**
     * This builder class can be used to construct a DefaultProtocolInformation bean.
     */
    public static class Builder extends ProtocolInformationBuilder<DefaultProtocolInformation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultProtocolInformation newBuildingInstance() {
            return new DefaultProtocolInformation();
        }
    }
}
