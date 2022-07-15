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

package org.eclipse.aas4j.v3.rc02.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.LangStringSet;
import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.builder.*;
import org.eclipse.aas4j.v3.rc02.model.LangString;
import org.eclipse.aas4j.v3.rc02.model.builder.LangStringSetBuilder;

/**
 * Default implementation of package org.eclipse.aas4j.v3.rc02.model.LangStringSet
 * 
 * Array of elements of type langString
 */

@IRI("aas:LangStringSet")
public class DefaultLangStringSet implements LangStringSet {

    @IRI("https://admin-shell.io/aas/3/0/RC02/LangStringSet/langStrings")
    protected List<LangString> langStrings = new ArrayList<>();

    public DefaultLangStringSet() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.langStrings);
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
            DefaultLangStringSet other = (DefaultLangStringSet) obj;
            return Objects.equals(this.langStrings, other.langStrings);
        }
    }

    @Override
    public List<LangString> getLangStrings() {
        return langStrings;
    }

    @Override
    public void setLangStrings(List<LangString> langStrings) {
        this.langStrings = langStrings;
    }

    /**
     * This builder class can be used to construct a DefaultLangStringSet bean.
     */
    public static class Builder extends LangStringSetBuilder<DefaultLangStringSet, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultLangStringSet newBuildingInstance() {
            return new DefaultLangStringSet();
        }
    }
}
