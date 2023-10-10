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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;

import java.util.List;


/**
 * An entity is a submodel element that is used to model entities.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity extends SubmodelElement {

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/statements
     *
     * @return Returns the List of SubmodelElements for the property statements.
     */
    @IRI("https://admin-shell.io/aas/3/0/Entity/statements")
    List<SubmodelElement> getStatements();

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/statements
     *
     * @param statements desired value for the property statements.
     */
    void setStatements(List<SubmodelElement> statements);

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/entityType
     *
     * @return Returns the EntityType for the property entityType.
     */
    @IRI("https://admin-shell.io/aas/3/0/Entity/entityType")
    EntityType getEntityType();

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/entityType
     *
     * @param entityType desired value for the property entityType.
     */
    void setEntityType(EntityType entityType);

    /**
     * Global identifier of the asset the entity is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/globalAssetId
     *
     * @return Returns the String for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/Entity/globalAssetId")
    String getGlobalAssetId();

    /**
     * Global identifier of the asset the entity is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(String globalAssetId);

    /**
     * Reference to a specific asset ID representing a supplementary identifier of the asset represented
     * by the Asset Administration Shell.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/specificAssetIds
     *
     * @return Returns the List of SpecificAssetIds for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/Entity/specificAssetIds")
    List<SpecificAssetId> getSpecificAssetIds();

    /**
     * Reference to a specific asset ID representing a supplementary identifier of the asset represented
     * by the Asset Administration Shell.
     *
     * More information under https://admin-shell.io/aas/3/0/Entity/specificAssetIds
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

}
