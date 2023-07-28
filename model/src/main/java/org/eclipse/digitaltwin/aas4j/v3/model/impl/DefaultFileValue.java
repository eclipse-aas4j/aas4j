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

import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.FileValue
 * 
 */

@IRI("aas:FileValue")
public class DefaultFileValue implements FileValue {

    @IRI("https://admin-shell.io/aas/3/0/FileValue/contentType")
    protected String contentType;

    @IRI("https://admin-shell.io/aas/3/0/FileValue/value")
    protected String value;

    public DefaultFileValue() {}

    public DefaultFileValue(FileValue x) {
        this.contentType = x.getContentType();
        this.value = x.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.contentType,
            this.value);
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
            DefaultFileValue other = (DefaultFileValue) obj;
            return Objects.equals(this.contentType, other.contentType) &&
                Objects.equals(this.value, other.value);
        }
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
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
            "DefaultFileValue (" + "contentType=%s,"
                + "value=%s,"
                + ")",
            this.contentType, this.value);
    }

    /**
     * This builder class can be used to construct a DefaultFileValue bean.
     */
    public static class Builder extends FileValueBuilder<DefaultFileValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultFileValue newBuildingInstance() {
            return new DefaultFileValue();
        }
    }
}
