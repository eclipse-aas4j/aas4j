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

package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AccessControlBuilder<T extends AccessControl, B extends AccessControlBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for accessPermissionRules
     * 
     * @param accessPermissionRules desired value to be set
     * @return Builder object with new value for accessPermissionRules
     */
    public B accessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
        getBuildingInstance().setAccessPermissionRules(accessPermissionRules);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List accessPermissionRules
     * 
     * @param accessPermissionRule desired value to be added
     * @return Builder object with new value for accessPermissionRules
     */
    public B accessPermissionRule(AccessPermissionRule accessPermissionRule) {
        getBuildingInstance().getAccessPermissionRules().add(accessPermissionRule);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectableSubjectAttributes
     * 
     * @param selectableSubjectAttributes desired value to be set
     * @return Builder object with new value for selectableSubjectAttributes
     */
    public B selectableSubjectAttributes(Reference selectableSubjectAttributes) {
        getBuildingInstance().setSelectableSubjectAttributes(selectableSubjectAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultSubjectAttributes
     * 
     * @param defaultSubjectAttributes desired value to be set
     * @return Builder object with new value for defaultSubjectAttributes
     */
    public B defaultSubjectAttributes(Reference defaultSubjectAttributes) {
        getBuildingInstance().setDefaultSubjectAttributes(defaultSubjectAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectablePermissions
     * 
     * @param selectablePermissions desired value to be set
     * @return Builder object with new value for selectablePermissions
     */
    public B selectablePermissions(Reference selectablePermissions) {
        getBuildingInstance().setSelectablePermissions(selectablePermissions);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultPermissions
     * 
     * @param defaultPermissions desired value to be set
     * @return Builder object with new value for defaultPermissions
     */
    public B defaultPermissions(Reference defaultPermissions) {
        getBuildingInstance().setDefaultPermissions(defaultPermissions);
        return getSelf();
    }

    /**
     * This function allows setting a value for selectableEnvironmentAttributes
     * 
     * @param selectableEnvironmentAttributes desired value to be set
     * @return Builder object with new value for selectableEnvironmentAttributes
     */
    public B selectableEnvironmentAttributes(Reference selectableEnvironmentAttributes) {
        getBuildingInstance().setSelectableEnvironmentAttributes(selectableEnvironmentAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultEnvironmentAttributes
     * 
     * @param defaultEnvironmentAttributes desired value to be set
     * @return Builder object with new value for defaultEnvironmentAttributes
     */
    public B defaultEnvironmentAttributes(Reference defaultEnvironmentAttributes) {
        getBuildingInstance().setDefaultEnvironmentAttributes(defaultEnvironmentAttributes);
        return getSelf();
    }
}
