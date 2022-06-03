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




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different key value types within a key. Contains KeyElements, ReferableElements,
 * and IdentifiableElements.
 */
@IRI("aas:KeyElements")
public enum KeyElements {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/Asset")
    ASSET,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ConceptDescription")
    CONCEPT_DESCRIPTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/Submodel")
    SUBMODEL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/KeyElements/FragmentReference")
    FRAGMENT_REFERENCE,

    /**
     * reference to an element not belonging to an asset administration shell
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/KeyElements/GlobalReference")
    GLOBAL_REFERENCE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/AccessPermissionRule")
    ACCESS_PERMISSION_RULE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/BasicEvent")
    BASIC_EVENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Capability")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ConceptDictionary")
    CONCEPT_DICTIONARY,

    /**
     * Data Element is abstract, i.e. if a key uses 'DataElement' the reference may be a Property, a
     * File etc.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Entity")
    ENTITY,

    /**
     * Event is abstract
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Event")
    EVENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/File")
    FILE,

    /**
     * Property with a value that can be provided in multiple languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Property")
    PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/Range")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ReferenceElement")
    REFERENCE_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /**
     * Submodel Element is abstract, i.e. if a key uses 'SubmodelElement' the reference may be a
     * Property, a SubmodelElementCollection, an Operation etc.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SubmodelElement")
    SUBMODEL_ELEMENT,

    /**
     * Collection of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/View")
    VIEW;

}
