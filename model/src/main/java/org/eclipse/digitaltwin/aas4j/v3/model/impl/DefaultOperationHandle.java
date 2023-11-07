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

import org.eclipse.digitaltwin.aas4j.v3.model.OperationHandle;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationHandleBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationHandle
 * 
 */

@IRI("aas:OperationHandle")
public class DefaultOperationHandle implements OperationHandle {

    @IRI("https://admin-shell.io/aas/3/0/OperationHandle/handleId")
    protected String handleId;

    @IRI("https://admin-shell.io/aas/3/0/OperationHandle/requestId")
    protected String requestId;

    public DefaultOperationHandle() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.handleId,
            this.requestId);
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
            DefaultOperationHandle other = (DefaultOperationHandle) obj;
            return Objects.equals(this.handleId, other.handleId) &&
                Objects.equals(this.requestId, other.requestId);
        }
    }

    @Override
    public String getHandleId() {
        return handleId;
    }

    @Override
    public void setHandleId(String handleId) {
        this.handleId = handleId;
    }

    @Override
    public String getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String toString() {
        return String.format(
            "DefaultOperationHandle (" + "handleId=%s,"
                + "requestId=%s,"
                + ")",
            this.handleId, this.requestId);
    }

    /**
     * This builder class can be used to construct a DefaultOperationHandle bean.
     */
    public static class Builder extends OperationHandleBuilder<DefaultOperationHandle, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationHandle newBuildingInstance() {
            return new DefaultOperationHandle();
        }
    }
}
