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

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationRequestBuilder;

import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest
 * 
 */

@IRI("aas:OperationRequest")
public class DefaultOperationRequest implements OperationRequest {

    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/clientTimeoutDuration")
    protected Duration clientTimeoutDuration;

    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments")
    protected List<OperationVariable> inoutputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inputArguments")
    protected List<OperationVariable> inputArguments = new ArrayList<>();

    public DefaultOperationRequest() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.inoutputArguments,
            this.inputArguments,
            this.clientTimeoutDuration);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if ((obj instanceof OperationRequest) == false) {
            return false;
        } else {
            OperationRequest other = (OperationRequest) obj;
            return Objects.equals(this.inoutputArguments, other.getInoutputArguments()) &&
                Objects.equals(this.inputArguments, other.getInputArguments()) &&
                Objects.equals(this.clientTimeoutDuration, other.getClientTimeoutDuration());
        }
    }

    @Override
    public List<OperationVariable> getInoutputArguments() {
        return inoutputArguments;
    }

    @Override
    public void setInoutputArguments(List<OperationVariable> inoutputArguments) {
        this.inoutputArguments = inoutputArguments;
    }

    @Override
    public List<OperationVariable> getInputArguments() {
        return inputArguments;
    }

    @Override
    public void setInputArguments(List<OperationVariable> inputArguments) {
        this.inputArguments = inputArguments;
    }

    @Override
    public Duration getClientTimeoutDuration() {
        return clientTimeoutDuration;
    }

    @Override
    public void setClientTimeoutDuration(Duration clientTimeoutDuration) {
        this.clientTimeoutDuration = clientTimeoutDuration;
    }

    public String toString() {
        return String.format(
            "DefaultOperationRequest (" + "inoutputArguments=%s,"
                + "inputArguments=%s,"
                + "clientTimeoutDuration=%s,"
                + ")",
            this.inoutputArguments, this.inputArguments, this.clientTimeoutDuration);
    }

    /**
     * This builder class can be used to construct a DefaultOperationRequest bean.
     */
    public static class Builder extends OperationRequestBuilder<DefaultOperationRequest, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationRequest newBuildingInstance() {
            return new DefaultOperationRequest();
        }
    }
}
