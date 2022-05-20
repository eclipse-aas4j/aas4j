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
 * Default implementation of package io.adminshell.aas.v3.model.SubjectAttributes
 * 
 * A set of data elements that further classifies a specific subject.
 */

@IRI("aas:SubjectAttributes")
public class DefaultSubjectAttributes implements SubjectAttributes {

    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    protected List<DataElement> subjectAttributes = new ArrayList<>();

    public DefaultSubjectAttributes() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.subjectAttributes);
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
            DefaultSubjectAttributes other = (DefaultSubjectAttributes) obj;
            return Objects.equals(this.subjectAttributes, other.subjectAttributes);
        }
    }

    @Override
    public List<DataElement> getSubjectAttributes() {
        return subjectAttributes;
    }

    @Override
    public void setSubjectAttributes(List<DataElement> subjectAttributes) {
        this.subjectAttributes = subjectAttributes;
    }

    /**
     * This builder class can be used to construct a DefaultSubjectAttributes bean.
     */
    public static class Builder extends SubjectAttributesBuilder<DefaultSubjectAttributes, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubjectAttributes newBuildingInstance() {
            return new DefaultSubjectAttributes();
        }
    }
}
