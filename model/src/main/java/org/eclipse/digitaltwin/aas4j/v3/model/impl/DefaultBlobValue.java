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
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.BlobValue
 * 
 */

@IRI("aas:BlobValue")
public class DefaultBlobValue implements BlobValue {

    @IRI("https://admin-shell.io/aas/3/0/BlobValue/mimeType")
    protected String mimeType;

    @IRI("https://admin-shell.io/aas/3/0/BlobValue/value")
    protected String value;

    public DefaultBlobValue() {}

    public DefaultBlobValue(BlobValue x) {
        this.mimeType = x.getMimeType();
        this.value = x.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.mimeType,
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
            DefaultBlobValue other = (DefaultBlobValue) obj;
            return Objects.equals(this.mimeType, other.mimeType) &&
                Objects.equals(this.value, other.value);
        }
    }

    @Override
    public String getMimeType() {
        return mimeType;
    }

    @Override
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
            "DefaultBlobValue (" + "mimeType=%s,"
                + "value=%s,"
                + ")",
            this.mimeType, this.value);
    }

    /**
     * This builder class can be used to construct a DefaultBlobValue bean.
     */
    public static class Builder extends BlobValueBuilder<DefaultBlobValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultBlobValue newBuildingInstance() {
            return new DefaultBlobValue();
        }
    }
}
