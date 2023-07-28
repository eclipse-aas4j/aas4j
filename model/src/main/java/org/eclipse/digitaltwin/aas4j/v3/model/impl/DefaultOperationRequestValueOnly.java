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

import java.math.BigInteger;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.OperationRequestValueOnly
 * 
 */

@IRI("aas:OperationRequestValueOnly")
public class DefaultOperationRequestValueOnly implements OperationRequestValueOnly {

    @IRI("https://admin-shell.io/aas/3/0/OperationRequestValueOnly/inoutputArguments")
    protected String inoutputArguments;

    @IRI("https://admin-shell.io/aas/3/0/OperationRequestValueOnly/inputArguments")
    protected String inputArguments;

    @IRI("https://admin-shell.io/aas/3/0/OperationRequestValueOnly/requestId")
    protected String requestId;

    @IRI("https://admin-shell.io/aas/3/0/OperationRequestValueOnly/timeout")
    protected BigInteger timeout;

    public DefaultOperationRequestValueOnly() {}

    public DefaultOperationRequestValueOnly(OperationRequestValueOnly x) {
        this.inoutputArguments = x.getInoutputArguments();
        this.inputArguments = x.getInputArguments();
        this.requestId = x.getRequestId();
        this.timeout = x.getTimeout();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.inoutputArguments,
            this.inputArguments,
            this.requestId,
            this.timeout);
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
            DefaultOperationRequestValueOnly other = (DefaultOperationRequestValueOnly) obj;
            return Objects.equals(this.inoutputArguments, other.inoutputArguments) &&
                Objects.equals(this.inputArguments, other.inputArguments) &&
                Objects.equals(this.requestId, other.requestId) &&
                Objects.equals(this.timeout, other.timeout);
        }
    }

    @Override
    public String getInoutputArguments() {
        return inoutputArguments;
    }

    @Override
    public void setInoutputArguments(String inoutputArguments) {
        this.inoutputArguments = inoutputArguments;
    }

    @Override
    public String getInputArguments() {
        return inputArguments;
    }

    @Override
    public void setInputArguments(String inputArguments) {
        this.inputArguments = inputArguments;
    }

    @Override
    public String getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public BigInteger getTimeout() {
        return timeout;
    }

    @Override
    public void setTimeout(BigInteger timeout) {
        this.timeout = timeout;
    }

    public String toString() {
        return String.format(
            "DefaultOperationRequestValueOnly (" + "inoutputArguments=%s,"
                + "inputArguments=%s,"
                + "requestId=%s,"
                + "timeout=%s,"
                + ")",
            this.inoutputArguments, this.inputArguments, this.requestId, this.timeout);
    }

    /**
     * This builder class can be used to construct a DefaultOperationRequestValueOnly bean.
     */
    public static class Builder extends OperationRequestValueOnlyBuilder<DefaultOperationRequestValueOnly, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationRequestValueOnly newBuildingInstance() {
            return new DefaultOperationRequestValueOnly();
        }
    }
}
