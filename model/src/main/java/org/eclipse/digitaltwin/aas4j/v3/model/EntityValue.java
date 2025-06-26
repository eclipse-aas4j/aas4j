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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntityValue.class)
})
public interface EntityValue {

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/entityType
     *
     * @return Returns the EntityType for the property entityType.
     */
    @IRI("https://admin-shell.io/aas/3/1/EntityValue/entityType")
    EntityType getEntityType();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/entityType
     *
     * @param entityType desired value for the property entityType.
     */
    void setEntityType(EntityType entityType);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/globalAssetId
     *
     * @return Returns the String for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/1/EntityValue/globalAssetId")
    String getGlobalAssetId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(String globalAssetId);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/specificAssetIds
     *
     * @return Returns the List of SpecificAssetIdValues for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/1/EntityValue/specificAssetIds")
    List<SpecificAssetIdValue> getSpecificAssetIds();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/specificAssetIds
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(List<SpecificAssetIdValue> specificAssetIds);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/statements
     *
     * @return Returns the ValueOnly for the property statements.
     */
    @IRI("https://admin-shell.io/aas/3/1/EntityValue/statements")
    ValueOnly getStatements();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/EntityValue/statements
     *
     * @param statements desired value for the property statements.
     */
    void setStatements(ValueOnly statements);

}
