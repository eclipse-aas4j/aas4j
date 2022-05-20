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

package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Access Control defines the local access control policy administration point. Access Control has
 * the major task to define the access permission rules.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControl.class)
})
public interface AccessControl {

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
     *
     * @return Returns the List of AccessPermissionRules for the property accessPermissionRules.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
    List<AccessPermissionRule> getAccessPermissionRules();

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
     *
     * @param accessPermissionRules desired value for the property accessPermissionRules.
     */
    void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules);

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects.
     *
     * Default: reference to the submodel referenced via defaultSubjectAttributes.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
     *
     * @return Returns the Reference for the property selectableSubjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
    Reference getSelectableSubjectAttributes();

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects.
     *
     * Default: reference to the submodel referenced via defaultSubjectAttributes.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
     *
     * @param selectableSubjectAttributes desired value for the property selectableSubjectAttributes.
     */
    void setSelectableSubjectAttributes(Reference selectableSubjectAttributes);

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules.
     *
     * The submodel is of kind=Type.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
     *
     * @return Returns the Reference for the property defaultSubjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
    Reference getDefaultSubjectAttributes();

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules.
     *
     * The submodel is of kind=Type.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
     *
     * @param defaultSubjectAttributes desired value for the property defaultSubjectAttributes.
     */
    void setDefaultSubjectAttributes(Reference defaultSubjectAttributes);

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects.
     *
     * Default: reference to the submodel referenced via defaultPermissions
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
     *
     * @return Returns the Reference for the property selectablePermissions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
    Reference getSelectablePermissions();

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects.
     *
     * Default: reference to the submodel referenced via defaultPermissions
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
     *
     * @param selectablePermissions desired value for the property selectablePermissions.
     */
    void setSelectablePermissions(Reference selectablePermissions);

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
     *
     * @return Returns the Reference for the property defaultPermissions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
    Reference getDefaultPermissions();

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
     *
     * @param defaultPermissions desired value for the property defaultPermissions.
     */
    void setDefaultPermissions(Reference defaultPermissions);

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
     *
     * @return Returns the Reference for the property selectableEnvironmentAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
    Reference getSelectableEnvironmentAttributes();

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
     *
     * @param selectableEnvironmentAttributes desired value for the property
     *        selectableEnvironmentAttributes.
     */
    void setSelectableEnvironmentAttributes(Reference selectableEnvironmentAttributes);

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
     *
     * @return Returns the Reference for the property defaultEnvironmentAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
    Reference getDefaultEnvironmentAttributes();

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
     *
     * @param defaultEnvironmentAttributes desired value for the property defaultEnvironmentAttributes.
     */
    void setDefaultEnvironmentAttributes(Reference defaultEnvironmentAttributes);

}
