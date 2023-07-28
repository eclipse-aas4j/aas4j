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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElementValue
 * 
 */

@IRI("aas:ReferenceElementValue")
public class DefaultReferenceElementValue implements ReferenceElementValue {

    @IRI("https://admin-shell.io/aas/3/0/ReferenceValue/outputArguments")
    protected List<Key> outputArguments = new ArrayList<>();

    public DefaultReferenceElementValue() {}

    public DefaultReferenceElementValue(ReferenceElementValue x) {
        this.outputArguments = x.getOutputArguments();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.outputArguments);
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
            DefaultReferenceElementValue other = (DefaultReferenceElementValue) obj;
            return Objects.equals(this.outputArguments, other.outputArguments);
        }
    }

    @Override
    public List<Key> getOutputArguments() {
        return outputArguments;
    }

    @Override
    public void setOutputArguments(List<Key> outputArguments) {
        this.outputArguments = outputArguments;
    }

    public String toString() {
        return String.format(
            "DefaultReferenceElementValue ("
                + ")"

        );
    }

    /**
     * This builder class can be used to construct a DefaultReferenceElementValue bean.
     */
    public static class Builder extends ReferenceElementValueBuilder<DefaultReferenceElementValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultReferenceElementValue newBuildingInstance() {
            return new DefaultReferenceElementValue();
        }
    }
}
