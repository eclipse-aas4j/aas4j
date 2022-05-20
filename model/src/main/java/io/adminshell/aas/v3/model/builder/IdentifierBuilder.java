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

public abstract class IdentifierBuilder<T extends Identifier, B extends IdentifierBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for identifiers
     * 
     * @param identifiers desired value to be set
     * @return Builder object with new value for identifiers
     */
    public B identifiers(List<String> identifiers) {
        getBuildingInstance().setIdentifiers(identifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List identifiers
     * 
     * @param identifier desired value to be added
     * @return Builder object with new value for identifiers
     */
    public B identifier(String identifier) {
        getBuildingInstance().getIdentifiers().add(identifier);
        return getSelf();
    }

    /**
     * This function allows setting a value for idType
     * 
     * @param idType desired value to be set
     * @return Builder object with new value for idType
     */
    public B idType(IdentifierType idType) {
        getBuildingInstance().setIdType(idType);
        return getSelf();
    }
}
