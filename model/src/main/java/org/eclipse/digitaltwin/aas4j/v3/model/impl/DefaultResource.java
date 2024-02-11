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
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.ResourceBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Resource
 * 
 * Resource represents an address to a file (a locator). The value is an URI that can represent an
 * absolute or relative path
 */

@IRI("aas:Resource")
public class DefaultResource implements Resource {

    @IRI("https://admin-shell.io/aas/3/0/Resource/contentType")
    protected String contentType;

    @IRI("https://admin-shell.io/aas/3/0/Resource/path")
    protected String path;

    public DefaultResource() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.path,
            this.contentType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if ((obj instanceof Resource) == false) {
            return false;
        } else {
            Resource other = (Resource) obj;
            return Objects.equals(this.path, other.getPath()) &&
                Objects.equals(this.contentType, other.getContentType());
        }
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String toString() {
        return String.format(
            "DefaultResource (" + "path=%s,"
                + "contentType=%s,"
                + ")",
            this.path, this.contentType);
    }

    /**
     * This builder class can be used to construct a DefaultResource bean.
     */
    public static class Builder extends ResourceBuilder<DefaultResource, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultResource newBuildingInstance() {
            return new DefaultResource();
        }
    }
}
