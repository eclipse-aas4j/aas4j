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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.ObjectAttributes
 * 
 * A set of data elements that describe object attributes. These attributes need to refer to a data
 * element within an existing submodel.
 */

@IRI("aas:ObjectAttributes")
public class DefaultObjectAttributes implements ObjectAttributes {

    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    protected List<Reference> objectAttributes = new ArrayList<>();

    public DefaultObjectAttributes() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.objectAttributes);
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
            DefaultObjectAttributes other = (DefaultObjectAttributes) obj;
            return Objects.equals(this.objectAttributes, other.objectAttributes);
        }
    }

    @Override
    public List<Reference> getObjectAttributes() {
        return objectAttributes;
    }

    @Override
    public void setObjectAttributes(List<Reference> objectAttributes) {
        this.objectAttributes = objectAttributes;
    }

    /**
     * This builder class can be used to construct a DefaultObjectAttributes bean.
     */
    public static class Builder extends ObjectAttributesBuilder<DefaultObjectAttributes, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultObjectAttributes newBuildingInstance() {
            return new DefaultObjectAttributes();
        }
    }
}
