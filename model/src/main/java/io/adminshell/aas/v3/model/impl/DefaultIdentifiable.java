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
 * Default implementation of package io.adminshell.aas.v3.model.Identifiable
 * 
 * An element that has a globally unique identifier.
 */

@IRI("aas:Identifiable")
public class DefaultIdentifiable implements Identifiable {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected Identifier identification;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected LangString displayName;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
    protected List<String> referableCategories = new ArrayList<>();

    public DefaultIdentifiable() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
            this.identification,
            this.referableCategories,
            this.descriptions,
            this.displayName,
            this.idShort);
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
            DefaultIdentifiable other = (DefaultIdentifiable) obj;
            return Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.identification, other.identification) &&
                Objects.equals(this.referableCategories, other.referableCategories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort);
        }
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public Identifier getIdentification() {
        return identification;
    }

    @Override
    public void setIdentification(Identifier identification) {
        this.identification = identification;
    }

    @Override
    public List<String> getReferableCategories() {
        return referableCategories;
    }

    @Override
    public void setReferableCategories(List<String> referableCategories) {
        this.referableCategories = referableCategories;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public LangString getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(LangString displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    /**
     * This builder class can be used to construct a DefaultIdentifiable bean.
     */
    public static class Builder extends IdentifiableBuilder<DefaultIdentifiable, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultIdentifiable newBuildingInstance() {
            return new DefaultIdentifiable();
        }
    }
}
