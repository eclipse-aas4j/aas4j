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

import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguagePropertyValue
 * 
 */

@IRI("aas:MultiLanguagePropertyValue")
public class DefaultMultiLanguagePropertyValue implements MultiLanguagePropertyValue {

    public DefaultMultiLanguagePropertyValue() {}

    public DefaultMultiLanguagePropertyValue(MultiLanguagePropertyValue x) {

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format(
            "DefaultMultiLanguagePropertyValue ("
                + ")"

        );
    }

    /**
     * This builder class can be used to construct a DefaultMultiLanguagePropertyValue bean.
     */
    public static class Builder extends MultiLanguagePropertyValueBuilder<DefaultMultiLanguagePropertyValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultMultiLanguagePropertyValue newBuildingInstance() {
            return new DefaultMultiLanguagePropertyValue();
        }
    }
}
