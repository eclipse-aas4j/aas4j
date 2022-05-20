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
 * Table that defines access permissions per authenticated subject for a set of objects (referable
 * elements).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessPermissionRule.class)
})
public interface AccessPermissionRule extends Referable, Qualifiable {

    /**
     * Set of object-permission pairs that define the permissions per object within the access
     * permission rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     *
     * @return Returns the List of PermissionsPerObjects for the property permissionsPerObjects.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
    List<PermissionsPerObject> getPermissionsPerObjects();

    /**
     * Set of object-permission pairs that define the permissions per object within the access
     * permission rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     *
     * @param permissionsPerObjects desired value for the property permissionsPerObjects.
     */
    void setPermissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects);

    /**
     * Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     *
     * @return Returns the SubjectAttributes for the property targetSubjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
    SubjectAttributes getTargetSubjectAttributes();

    /**
     * Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     *
     * @param targetSubjectAttributes desired value for the property targetSubjectAttributes.
     */
    void setTargetSubjectAttributes(SubjectAttributes targetSubjectAttributes);

}
