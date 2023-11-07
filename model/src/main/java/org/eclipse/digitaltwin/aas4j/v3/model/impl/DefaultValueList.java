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

import org.eclipse.digitaltwin.aas4j.v3.model.ValueList;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueReferencePair;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.ValueListBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.ValueList
 * 
 * A set of value reference pairs.
 */

@IRI("aas:ValueList")
public class DefaultValueList implements ValueList {

    @IRI("https://admin-shell.io/aas/3/0/ValueList/valueReferencePairs")
    protected List<ValueReferencePair> valueReferencePairs = new ArrayList<>();

    public DefaultValueList() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.valueReferencePairs);
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
            DefaultValueList other = (DefaultValueList) obj;
            return Objects.equals(this.valueReferencePairs, other.valueReferencePairs);
        }
    }

    @Override
    public List<ValueReferencePair> getValueReferencePairs() {
        return valueReferencePairs;
    }

    @Override
    public void setValueReferencePairs(List<ValueReferencePair> valueReferencePairs) {
        this.valueReferencePairs = valueReferencePairs;
    }

    public String toString() {
        return String.format(
            "DefaultValueList (" + "valueReferencePairs=%s,"
                + ")",
            this.valueReferencePairs);
    }

    /**
     * This builder class can be used to construct a DefaultValueList bean.
     */
    public static class Builder extends ValueListBuilder<DefaultValueList, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultValueList newBuildingInstance() {
            return new DefaultValueList();
        }
    }
}
