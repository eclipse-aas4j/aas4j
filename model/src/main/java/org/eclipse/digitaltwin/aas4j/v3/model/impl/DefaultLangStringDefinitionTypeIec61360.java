/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.LangStringDefinitionTypeIec61360Builder;

import java.util.Objects;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360
 * 
 * String with length 1023 maximum and minimum 1 characters and with language tags
 */

@IRI("aas:LangStringDefinitionTypeIec61360")
public class DefaultLangStringDefinitionTypeIec61360 implements LangStringDefinitionTypeIec61360 {

    @IRI("https://admin-shell.io/aas/3/0/AbstractLangString/language")
    protected String language;

    @IRI("https://admin-shell.io/aas/3/0/AbstractLangString/text")
    protected String text;

    public DefaultLangStringDefinitionTypeIec61360() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.language,
            this.text);
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
            DefaultLangStringDefinitionTypeIec61360 other = (DefaultLangStringDefinitionTypeIec61360) obj;
            return Objects.equals(this.language, other.language) &&
                Objects.equals(this.text, other.text);
        }
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return String.format(
            "DefaultLangStringDefinitionTypeIec61360 ("
                + ")"

        );
    }

    /**
     * This builder class can be used to construct a DefaultLangStringDefinitionTypeIec61360 bean.
     */
    public static class Builder extends LangStringDefinitionTypeIec61360Builder<DefaultLangStringDefinitionTypeIec61360, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultLangStringDefinitionTypeIec61360 newBuildingInstance() {
            return new DefaultLangStringDefinitionTypeIec61360();
        }
    }
}
