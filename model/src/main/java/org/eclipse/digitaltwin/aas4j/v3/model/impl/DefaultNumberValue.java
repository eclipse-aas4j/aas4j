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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.NumberValue
 * 
 * Represents a numeric value in the Asset Administration Shell.
 */

@IRI("aas:NumberValue")
public class DefaultNumberValue implements NumberValue {

    @IRI("https://admin-shell.io/aas/3/1/NumberValue/value")
    protected List<java.math.BigDecimal> value = new ArrayList<>();

    public DefaultNumberValue() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
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
            DefaultNumberValue other = (DefaultNumberValue) obj;
            return Objects.equals(this.value, other.value);
        }
    }

    @Override
    public List<java.math.BigDecimal> getValues() {
        return value;
    }

    @Override
    public void setValues(List<java.math.BigDecimal> value) {
        this.value = value;
    }

    /**
     * This builder class can be used to construct a DefaultNumberValue bean.
     */
    public static class Builder extends NumberValueBuilder<DefaultNumberValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultNumberValue newBuildingInstance() {
            return new DefaultNumberValue();
        }
    }
}
