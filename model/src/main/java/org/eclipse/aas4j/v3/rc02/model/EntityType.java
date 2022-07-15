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

package org.eclipse.aas4j.v3.rc02.model;




import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;

/**
 * Enumeration for denoting whether an entity is a self-managed entity or a co-managed entity.
 */
@IRI("aas:EntityType")
public enum EntityType {

    /**
     * For co-managed entities there is no separate AAS. Co-managed entities need to be part of a
     * self-managed entity.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EntityType/CoManagedEntity")
    CO_MANAGED_ENTITY,

    /**
     * Self-Managed Entities have their own AAS but can be part of the bill of material of a composite
     * self-managed entity.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EntityType/SelfManagedEntity")
    SELF_MANAGED_ENTITY;

}