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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AccessControl
 * 
 * Access Control defines the local access control policy administration point. Access Control has
 * the major task to define the access permission rules.
 */

@IRI("aas:AccessControl")
public class DefaultAccessControl implements AccessControl {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    protected List<AccessPermissionRule> accessPermissionRules = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    protected Reference defaultEnvironmentAttributes;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    protected Reference defaultPermissions;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    protected Reference defaultSubjectAttributes;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    protected Reference selectableEnvironmentAttributes;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    protected Reference selectablePermissions;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    protected Reference selectableSubjectAttributes;

    public DefaultAccessControl() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.accessPermissionRules,
            this.selectableSubjectAttributes,
            this.defaultSubjectAttributes,
            this.selectablePermissions,
            this.defaultPermissions,
            this.selectableEnvironmentAttributes,
            this.defaultEnvironmentAttributes);
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
            DefaultAccessControl other = (DefaultAccessControl) obj;
            return Objects.equals(this.accessPermissionRules, other.accessPermissionRules) &&
                Objects.equals(this.selectableSubjectAttributes, other.selectableSubjectAttributes) &&
                Objects.equals(this.defaultSubjectAttributes, other.defaultSubjectAttributes) &&
                Objects.equals(this.selectablePermissions, other.selectablePermissions) &&
                Objects.equals(this.defaultPermissions, other.defaultPermissions) &&
                Objects.equals(this.selectableEnvironmentAttributes, other.selectableEnvironmentAttributes) &&
                Objects.equals(this.defaultEnvironmentAttributes, other.defaultEnvironmentAttributes);
        }
    }

    @Override
    public List<AccessPermissionRule> getAccessPermissionRules() {
        return accessPermissionRules;
    }

    @Override
    public void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
        this.accessPermissionRules = accessPermissionRules;
    }

    @Override
    public Reference getSelectableSubjectAttributes() {
        return selectableSubjectAttributes;
    }

    @Override
    public void setSelectableSubjectAttributes(Reference selectableSubjectAttributes) {
        this.selectableSubjectAttributes = selectableSubjectAttributes;
    }

    @Override
    public Reference getDefaultSubjectAttributes() {
        return defaultSubjectAttributes;
    }

    @Override
    public void setDefaultSubjectAttributes(Reference defaultSubjectAttributes) {
        this.defaultSubjectAttributes = defaultSubjectAttributes;
    }

    @Override
    public Reference getSelectablePermissions() {
        return selectablePermissions;
    }

    @Override
    public void setSelectablePermissions(Reference selectablePermissions) {
        this.selectablePermissions = selectablePermissions;
    }

    @Override
    public Reference getDefaultPermissions() {
        return defaultPermissions;
    }

    @Override
    public void setDefaultPermissions(Reference defaultPermissions) {
        this.defaultPermissions = defaultPermissions;
    }

    @Override
    public Reference getSelectableEnvironmentAttributes() {
        return selectableEnvironmentAttributes;
    }

    @Override
    public void setSelectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
        this.selectableEnvironmentAttributes = selectableEnvironmentAttributes;
    }

    @Override
    public Reference getDefaultEnvironmentAttributes() {
        return defaultEnvironmentAttributes;
    }

    @Override
    public void setDefaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
        this.defaultEnvironmentAttributes = defaultEnvironmentAttributes;
    }

    /**
     * This builder class can be used to construct a DefaultAccessControl bean.
     */
    public static class Builder extends AccessControlBuilder<DefaultAccessControl, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAccessControl newBuildingInstance() {
            return new DefaultAccessControl();
        }
    }
}
