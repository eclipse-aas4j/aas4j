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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationHandle
 * 
 */

@IRI("aas:OperationHandle")
public class DefaultOperationHandle implements OperationHandle {

    @IRI("https://admin-shell.io/aas/3/1/OperationHandle/handleId")
    protected String handleId;

    public DefaultOperationHandle() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.handleId);
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
            return Objects.equals(this.handleId, other.handleId);
        }
    }

    @Override
    public String toString() {
        return "DefaultOperationHandle{" +
                "handleId='" + handleId + '\'' +
                '}';
    }

    @Override
    public String getHandleId() {
        return handleId;
    }

    @Override
    public void setHandleId(String handleId) {
        this.handleId = handleId;
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
