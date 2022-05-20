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

public abstract class PermissionsPerObjectBuilder<T extends PermissionsPerObject, B extends PermissionsPerObjectBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for object
     * 
     * @param object desired value to be set
     * @return Builder object with new value for object
     */
    public B object(Referable object) {
        getBuildingInstance().setObject(object);
        return getSelf();
    }

    /**
     * This function allows setting a value for permissions
     * 
     * @param permissions desired value to be set
     * @return Builder object with new value for permissions
     */
    public B permissions(List<Permission> permissions) {
        getBuildingInstance().setPermissions(permissions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List permissions
     * 
     * @param permission desired value to be added
     * @return Builder object with new value for permissions
     */
    public B permission(Permission permission) {
        getBuildingInstance().getPermissions().add(permission);
        return getSelf();
    }

    /**
     * This function allows setting a value for targetObjectAttributes
     * 
     * @param targetObjectAttributes desired value to be set
     * @return Builder object with new value for targetObjectAttributes
     */
    public B targetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        getBuildingInstance().setTargetObjectAttributes(targetObjectAttributes);
        return getSelf();
    }
}
