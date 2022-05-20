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
 * Default implementation of package io.adminshell.aas.v3.model.Qualifiable
 * 
 * Additional qualification of a qualifiable element. Constraint AASd-021: Every qualifiable can
 * only have one qualifier with the same Qualifier/type.
 */

@IRI("aas:Qualifiable")
public class DefaultQualifiable implements Qualifiable {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers = new ArrayList<>();

    public DefaultQualifiable() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.qualifiers);
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
            DefaultQualifiable other = (DefaultQualifiable) obj;
            return Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * This builder class can be used to construct a DefaultQualifiable bean.
     */
    public static class Builder extends QualifiableBuilder<DefaultQualifiable, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultQualifiable newBuildingInstance() {
            return new DefaultQualifiable();
        }
    }
}
