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
import org.eclipse.digitaltwin.aas4j.v3.model.OperationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationResultBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResult
 * 
 */

@IRI("aas:OperationResult")
public class DefaultOperationResult implements OperationResult {

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/inoutputArguments")
    protected List<OperationVariable> inoutputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/outputArguments")
    protected List<OperationVariable> outputArguments = new ArrayList<>();

    public DefaultOperationResult() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.inoutputArguments,
            this.outputArguments);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if ((obj instanceof OperationResult) == false) {
            return false;
        } else {
            OperationResult other = (OperationResult) obj;
            return Objects.equals(this.inoutputArguments, other.getInoutputArguments()) &&
                Objects.equals(this.outputArguments, other.getOutputArguments());
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
    public List<OperationVariable> getOutputArguments() {
        return outputArguments;
    }

    @Override
    public void setOutputArguments(List<OperationVariable> outputArguments) {
        this.outputArguments = outputArguments;
    }

    public String toString() {
        return String.format(
            "DefaultOperationResult (" + "inoutputArguments=%s,"
                + "outputArguments=%s,"
                + ")",
            this.inoutputArguments, this.outputArguments);
    }

    /**
     * This builder class can be used to construct a DefaultOperationResult bean.
     */
    public static class Builder extends OperationResultBuilder<DefaultOperationResult, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationResult newBuildingInstance() {
            return new DefaultOperationResult();
        }
    }
}
