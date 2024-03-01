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

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.SecurityAttributeObject;
import org.eclipse.digitaltwin.aas4j.v3.model.SecurityTypeEnum;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.SecurityAttributeObjectBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.SecurityAttributeObject
 * 
 */

@IRI("aas:SecurityAttributeObject")
public class DefaultSecurityAttributeObject implements SecurityAttributeObject {

    @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/key")
    protected String key;

    @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/type")
    protected SecurityTypeEnum type;

    @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/value")
    protected String value;

    public DefaultSecurityAttributeObject() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.type,
            this.key,
            this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if ((obj instanceof SecurityAttributeObject) == false) {
            return false;
        } else {
            SecurityAttributeObject other = (SecurityAttributeObject) obj;
            return Objects.equals(this.type, other.getType()) &&
                Objects.equals(this.key, other.getKey()) &&
                Objects.equals(this.value, other.getValue());
        }
    }

    @Override
    public SecurityTypeEnum getType() {
        return type;
    }

    @Override
    public void setType(SecurityTypeEnum type) {
        this.type = type;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return String.format(
            "DefaultSecurityAttributeObject (" + "type=%s,"
                + "key=%s,"
                + "value=%s,"
                + ")",
            this.type, this.key, this.value);
    }

    /**
     * This builder class can be used to construct a DefaultSecurityAttributeObject bean.
     */
    public static class Builder extends SecurityAttributeObjectBuilder<DefaultSecurityAttributeObject, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSecurityAttributeObject newBuildingInstance() {
            return new DefaultSecurityAttributeObject();
        }
    }
}
