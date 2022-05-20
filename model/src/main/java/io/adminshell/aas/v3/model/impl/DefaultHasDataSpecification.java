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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.HasDataSpecification
 * 
 * Element that can have be extended by using data specification templates. A data specification
 * template defines the additional attributes an element may or shall have. The data specifications
 * used are explicitly specified with their id. Constraint AASd-050: If the DataSpecificationContent
 * DataSpecificationIEC61360 is used for an element then the value of
 * hasDataSpecification/dataSpecification shall contain the global reference to the IRI of the
 * corresponding data specification template
 * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0.
 */

@IRI("aas:HasDataSpecification")
public class DefaultHasDataSpecification implements HasDataSpecification {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    public DefaultHasDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dataSpecifications);
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
            DefaultHasDataSpecification other = (DefaultHasDataSpecification) obj;
            return Objects.equals(this.dataSpecifications, other.dataSpecifications);
        }
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    /**
     * This builder class can be used to construct a DefaultHasDataSpecification bean.
     */
    public static class Builder extends HasDataSpecificationBuilder<DefaultHasDataSpecification, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultHasDataSpecification newBuildingInstance() {
            return new DefaultHasDataSpecification();
        }
    }
}
