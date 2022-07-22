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

package org.eclipse.aas4j.v3.model.impl;

import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.DataSpecificationBuilder;
import org.eclipse.aas4j.v3.model.builder.ExtensionBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Default implementation of package org.eclipse.aas4j.v3.rc02.model.Extension
 * 
 * Single extension of an element.
 */

@IRI("aas:Extension")
public class DefaultDataSpecification implements DataSpecification {

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent")
    protected DataSpecificationContent dataSpecificationContent;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/administration")
    protected AdministrativeInformation administrativeInformation;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/descriptions")
    protected List<LangString> descriptions;

    public DefaultDataSpecification() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dataSpecificationContent,
            this.administrativeInformation,
            this.id,
            this.descriptions);
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
            DefaultDataSpecification other = (DefaultDataSpecification) obj;
            return Objects.equals(this.administrativeInformation, other.administrativeInformation) &&
                Objects.equals(this.dataSpecificationContent, other.dataSpecificationContent) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.descriptions, other.descriptions);
        }
    }

    @Override
    public DataSpecificationContent getDataSpecificationContent() {
        return dataSpecificationContent;
    }

    @Override
    public void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        this.dataSpecificationContent = dataSpecificationContent;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administrativeInformation;
    }

    @Override
    public void setAdministration(AdministrativeInformation administrativeInformation) {
        this.administrativeInformation = administrativeInformation;
    }

    @Override
    public List<LangString> getDescription() {
        return descriptions;
    }

    @Override
    public void setDescription(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecification bean.
     */
    public static class Builder extends DataSpecificationBuilder<DefaultDataSpecification, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecification newBuildingInstance() {
            return new DefaultDataSpecification();
        }
    }
}
