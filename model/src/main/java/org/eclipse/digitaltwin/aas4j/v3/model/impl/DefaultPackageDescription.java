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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.PackageDescription
 * 
 */

@IRI("aas:PackageDescription")
public class DefaultPackageDescription implements PackageDescription {

    @IRI("https://admin-shell.io/aas/3/0/PackageDescription/items")
    protected List<String> items = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/PackageDescription/packageId")
    protected String packageId;

    public DefaultPackageDescription() {}

    public DefaultPackageDescription(PackageDescription x) {
        this.items = x.getItems();
        this.packageId = x.getPackageId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.items,
            this.packageId);
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
            DefaultPackageDescription other = (DefaultPackageDescription) obj;
            return Objects.equals(this.items, other.items) &&
                Objects.equals(this.packageId, other.packageId);
        }
    }

    @Override
    public List<String> getItems() {
        return items;
    }

    @Override
    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String getPackageId() {
        return packageId;
    }

    @Override
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String toString() {
        return String.format(
            "DefaultPackageDescription (" + "items=%s,"
                + "packageId=%s,"
                + ")",
            this.items, this.packageId);
    }

    /**
     * This builder class can be used to construct a DefaultPackageDescription bean.
     */
    public static class Builder extends PackageDescriptionBuilder<DefaultPackageDescription, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPackageDescription newBuildingInstance() {
            return new DefaultPackageDescription();
        }
    }
}
