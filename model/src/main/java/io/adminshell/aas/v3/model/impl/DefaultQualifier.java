/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Qualifier
 * 
 * A qualifier is a type-value pair that makes additional statements w.r.t. the value of the
 * element. Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER.
 */

@IRI("aas:Qualifier")
public class DefaultQualifier implements Qualifier {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    protected String type;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    protected Reference valueId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    protected String valueType;

    public DefaultQualifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.type,
            this.valueType,
            this.value,
            this.valueId,
            this.semanticId);
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
            DefaultQualifier other = (DefaultQualifier) obj;
            return Objects.equals(this.type, other.type) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueId, other.valueId) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getValueType() {
        return valueType;
    }

    @Override
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Reference getValueId() {
        return valueId;
    }

    @Override
    public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    /**
     * This builder class can be used to construct a DefaultQualifier bean.
     */
    public static class Builder extends QualifierBuilder<DefaultQualifier, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultQualifier newBuildingInstance() {
            return new DefaultQualifier();
        }
    }
}
