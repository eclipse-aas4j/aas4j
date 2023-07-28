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
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.RangeValue
 * 
 */

@IRI("aas:RangeValue")
public class DefaultRangeValue implements RangeValue {

    @IRI("https://admin-shell.io/aas/3/0/RangeValue/max")
    protected BigInteger max;

    @IRI("https://admin-shell.io/aas/3/0/RangeValue/min")
    protected BigInteger min;

    public DefaultRangeValue() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.max,
            this.min);
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
            DefaultRangeValue other = (DefaultRangeValue) obj;
            return Objects.equals(this.max, other.max) &&
                Objects.equals(this.min, other.min);
        }
    }

    @Override
    public BigInteger getMax() {
        return max;
    }

    @Override
    public void setMax(BigInteger max) {
        this.max = max;
    }

    @Override
    public BigInteger getMin() {
        return min;
    }

    @Override
    public void setMin(BigInteger min) {
        this.min = min;
    }

    public String toString() {
        return String.format(
            "DefaultRangeValue (" + "max=%s,"
                + "min=%s,"
                + ")",
            this.max, this.min);
    }

    /**
     * This builder class can be used to construct a DefaultRangeValue bean.
     */
    public static class Builder extends RangeValueBuilder<DefaultRangeValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultRangeValue newBuildingInstance() {
            return new DefaultRangeValue();
        }
    }
}
