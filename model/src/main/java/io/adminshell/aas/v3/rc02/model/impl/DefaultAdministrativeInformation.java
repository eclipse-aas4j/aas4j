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

package io.adminshell.aas.v3.rc02.model.impl;

import io.adminshell.aas.v3.rc02.model.AdministrativeInformation;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.builder.AdministrativeInformationBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Default implementation of package AdministrativeInformation
 * 
 * Administrative meta-information for an element like version information.
 */

@IRI("aas:AdministrativeInformation")
public class DefaultAdministrativeInformation implements AdministrativeInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/revision")
    protected String revision;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/version")
    protected String version;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    public DefaultAdministrativeInformation() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.version,
            this.revision,
            this.dataSpecifications);
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
            DefaultAdministrativeInformation other = (DefaultAdministrativeInformation) obj;
            return Objects.equals(this.version, other.version) &&
                Objects.equals(this.revision, other.revision) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications);
        }
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getRevision() {
        return revision;
    }

    @Override
    public void setRevision(String revision) {
        this.revision = revision;
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
     * This builder class can be used to construct a DefaultAdministrativeInformation bean.
     */
    public static class Builder extends AdministrativeInformationBuilder<DefaultAdministrativeInformation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAdministrativeInformation newBuildingInstance() {
            return new DefaultAdministrativeInformation();
        }
    }
}
