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

import org.eclipse.aas4j.v3.model.LangString;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.LangStringBuilder;

import java.util.Objects;


@IRI("rdf:langString")
public class DefaultLangString implements LangString {

    protected String language = null;
    protected String text = null;

    public DefaultLangString() {
        super();
    }

    public DefaultLangString(String textAndLanguage) {
        if (textAndLanguage.contains("@")) {
            String[] splitString = textAndLanguage.split("@");
            this.text = splitString[0];
            this.language = splitString[1];
        } else {
            this.text = textAndLanguage;
        }
    }

    public DefaultLangString(String text, String language) {
        this.text = text;
        this.language = language;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultLangString other = (DefaultLangString) obj;
            return Objects.equals(this.language, other.language) && Objects.equals(this.text, other.text);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.language, this.text);
    }

    @Override
    public String toString() {
        String result = this.text;
        if (this.language != null && !this.language.isEmpty()) {
            return "\"" + result + "\"@" + this.language;
        }
        return result;
    }

    /**
     * This builder class can be used to construct a DefaultLangString bean.
     */
    public static class Builder extends LangStringBuilder<DefaultLangString, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultLangString newBuildingInstance() {
            return new DefaultLangString();
        }
    }
}
