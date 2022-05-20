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
 * Default implementation of package io.adminshell.aas.v3.model.AdministrativeInformation
 * 
 * Every Identifiable may have administrative information. Administrative information includes for
 * example 1) Information about the version of the element 2) Information about who created or who
 * made the last change to the element 3) Information about the languages available in case the
 * element contains text, for translating purposed also themmaster or default language may be
 * definedIn the first version of the AAS metamodel only version information as defined by IEC 61360
 * is defined. In later versions additional attributes may be added.
 */

@IRI("aas:AdministrativeInformation")
public class DefaultAdministrativeInformation implements AdministrativeInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
    protected String revision;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
    protected String version;

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
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
