/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An entity is a submodel element that is used to model entities. Constraint AASd-056: The
 * semanticId of a Entity submodel element shall only reference a ConceptDescription with the
 * category ENTITY. The ConceptDescription describes the elements assigned to the entity via
 * Entity/statement.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity extends SubmodelElement {

    /**
     * Reference to the asset the entity is representing.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    Reference getGlobalAssetId();

    /**
     * Reference to the asset the entity is representing.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     * Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/specificAssetId
     *
     * @return Returns the IdentifierKeyValuePair for the property specificAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/specificAssetId")
    IdentifierKeyValuePair getSpecificAssetId();

    /**
     * Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell.
     *
     * The asset attribute must be set if entityType is set to 'SelfManagedEntity'. It is empty
     * otherwise.
     *
     * Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be
     * set if Entity/entityType is set to 'SelfManagedEntity'. They are not existing otherwise.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/specificAssetId
     *
     * @param specificAssetId desired value for the property specificAssetId.
     */
    void setSpecificAssetId(IdentifierKeyValuePair specificAssetId);

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     *
     * @return Returns the EntityType for the property entityType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    EntityType getEntityType();

    /**
     * Describes whether the entity is a co-managed entity or a self-managed entity.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     *
     * @param entityType desired value for the property entityType.
     */
    void setEntityType(EntityType entityType);

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/statement
     *
     * @return Returns the List of SubmodelElements for the property statements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    List<SubmodelElement> getStatements();

    /**
     * Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Entity/statement
     *
     * @param statements desired value for the property statements.
     */
    void setStatements(List<SubmodelElement> statements);

}
