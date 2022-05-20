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
 * Default implementation of package io.adminshell.aas.v3.model.EmbeddedDataSpecification
 * 
 * Link to the included description of the Data Specification.
 */

@IRI("aas:EmbeddedDataSpecification")
public class DefaultEmbeddedDataSpecification implements EmbeddedDataSpecification {

    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification")
    protected Reference dataSpecification;

    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent")
    protected DataSpecificationContent dataSpecificationContent;

    public DefaultEmbeddedDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dataSpecification,
            this.dataSpecificationContent);
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
            DefaultEmbeddedDataSpecification other = (DefaultEmbeddedDataSpecification) obj;
            return Objects.equals(this.dataSpecification, other.dataSpecification) &&
                Objects.equals(this.dataSpecificationContent, other.dataSpecificationContent);
        }
    }

    @Override
    public Reference getDataSpecification() {
        return dataSpecification;
    }

    @Override
    public void setDataSpecification(Reference dataSpecification) {
        this.dataSpecification = dataSpecification;
    }

    @Override
    public DataSpecificationContent getDataSpecificationContent() {
        return dataSpecificationContent;
    }

    @Override
    public void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.dataSpecificationContent = dataSpecificationContent;
    }

    /**
     * This builder class can be used to construct a DefaultEmbeddedDataSpecification bean.
     */
    public static class Builder extends EmbeddedDataSpecificationBuilder<DefaultEmbeddedDataSpecification, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEmbeddedDataSpecification newBuildingInstance() {
            return new DefaultEmbeddedDataSpecification();
        }
    }
}
