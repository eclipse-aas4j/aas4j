/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

import org.eclipse.digitaltwin.aas4j.v3.model.Descriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DescriptorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@IRI("aas:Descriptor")
public class DefaultDescriptor implements Descriptor {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Descriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    public DefaultDescriptor() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.endpoints);
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
            DefaultDescriptor other = (DefaultDescriptor) obj;
            return Objects.equals(this.endpoints, other.endpoints);
        }
    }

    @Override
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * This builder class can be used to construct a DefaultDescriptor bean.
     */
    public static class Builder extends DescriptorBuilder<DefaultDescriptor, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDescriptor newBuildingInstance() {
            return new DefaultDescriptor();
        }
    }
}
