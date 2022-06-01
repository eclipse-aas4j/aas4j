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
 * Enumeration of different key value types within a key.
 */
@IRI("aas:KeyTypes")
public enum KeyTypes {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/BasicEventElement")
    BASIC_EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Capability")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/ConceptDescription")
    CONCEPT_DESCRIPTION,

    /**
     * Data element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Entity")
    ENTITY,

    /**
     * Event.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/EventElement")
    EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/File")
    FILE,

    /**
     * Bookmark or a similar local identifier of a subordinate part of a primary resource
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/FragmentReference")
    FRAGMENT_REFERENCE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/GlobalReference")
    GLOBAL_REFERENCE,

    /**
     * Property with a value that can be provided in multiple languages
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Property")
    PROPERTY,

    /**
     * Range with min and max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Range")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Referable")
    REFERABLE,

    /**
     * Reference
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/ReferenceElement")
    REFERENCE_ELEMENT,

    /**
     * Relationship
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Submodel")
    SUBMODEL,

    /**
     * Submodel Element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElement")
    SUBMODEL_ELEMENT,

    /**
     * Struct of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /**
     * List of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
