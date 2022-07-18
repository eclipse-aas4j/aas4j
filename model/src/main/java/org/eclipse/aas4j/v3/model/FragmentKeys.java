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

package org.eclipse.aas4j.v3.model;




import org.eclipse.aas4j.v3.model.annotations.IRI;

/**
 * Enumeration of different key value types within a key.
 */
@IRI("aas:FragmentKeys")
public enum FragmentKeys {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/BasicEventElement")
    BASIC_EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Capability")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/ConceptDescription")
    CONCEPT_DESCRIPTION,

    /**
     * Data element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Entity")
    ENTITY,

    /**
     * Event.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/EventElement")
    EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/File")
    FILE,

    /**
     * Bookmark or a similar local identifier of a subordinate part of a primary resource
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/FragmentReference")
    FRAGMENT_REFERENCE,

    /**
     * Property with a value that can be provided in multiple languages
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Property")
    PROPERTY,

    /**
     * Range with min and max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Range")
    RANGE,

    /**
     * Reference
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/ReferenceElement")
    REFERENCE_ELEMENT,

    /**
     * Relationship
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/Submodel")
    SUBMODEL,

    /**
     * Submodel Element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/SubmodelElement")
    SUBMODEL_ELEMENT,

    /**
     * Struct of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /**
     * List of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/FragmentKeys/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
