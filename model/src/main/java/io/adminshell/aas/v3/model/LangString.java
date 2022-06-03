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
package io.adminshell.aas.v3.model;

import java.io.Serializable;
import java.util.Objects;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

@IRI("rdf:langString")
public class LangString implements Serializable {

    private String language = null;
    private String value = null;

    public LangString() {
        super();
    }

    public LangString(String valueAndLanguage) {
        if (valueAndLanguage.contains("@")) {
            String[] splitString = valueAndLanguage.split("@");
            this.value = splitString[0];
            this.language = splitString[1];
        } else {
            this.value = valueAndLanguage;
        }
    }

    public LangString(String value, String language) {
        this.value = value;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
            LangString other = (LangString) obj;
            return Objects.equals(this.language, other.language) && Objects.equals(this.value, other.value);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.language, this.value);
    }

    @Override
    public String toString() {
        String result = this.value;
        if (this.language != null && !this.language.isEmpty()) {
            return "\"" + result + "\"@" + this.language;
        }
        return result;
    }

}
