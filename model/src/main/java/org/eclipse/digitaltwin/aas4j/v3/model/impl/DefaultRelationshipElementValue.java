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

import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceValue;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElementValue;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.RelationshipElementValueBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElementValue
 * 
 */

@IRI("aas:RelationshipElementValue")
public class DefaultRelationshipElementValue implements RelationshipElementValue {

    @IRI("https://admin-shell.io/aas/3/0/RelationshipElementValue/first")
    protected ReferenceValue first;

    @IRI("https://admin-shell.io/aas/3/0/RelationshipElementValue/second")
    protected ReferenceValue second;

    public DefaultRelationshipElementValue() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.first,
            this.second);
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
            DefaultRelationshipElementValue other = (DefaultRelationshipElementValue) obj;
            return Objects.equals(this.first, other.first) &&
                Objects.equals(this.second, other.second);
        }
    }

    @Override
    public ReferenceValue getFirst() {
        return first;
    }

    @Override
    public void setFirst(ReferenceValue first) {
        this.first = first;
    }

    @Override
    public ReferenceValue getSecond() {
        return second;
    }

    @Override
    public void setSecond(ReferenceValue second) {
        this.second = second;
    }

    public String toString() {
        return String.format(
            "DefaultRelationshipElementValue (" + "first=%s,"
                + "second=%s,"
                + ")",
            this.first, this.second);
    }

    /**
     * This builder class can be used to construct a DefaultRelationshipElementValue bean.
     */
    public static class Builder extends RelationshipElementValueBuilder<DefaultRelationshipElementValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultRelationshipElementValue newBuildingInstance() {
            return new DefaultRelationshipElementValue();
        }
    }
}
