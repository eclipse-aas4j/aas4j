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
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET")
    ASSET,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET_ADMINISTRATION_SHELL")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/CONCEPT_DESCRIPTION")
    CONCEPT_DESCRIPTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/SUBMODEL")
    SUBMODEL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/KeyElements/FRAGMENT_REFERENCE")
    FRAGMENT_REFERENCE,

    /**
     * reference to an element not belonging to an asset administration shell
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/KeyElements/GLOBAL_REFERENCE")
    GLOBAL_REFERENCE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ACCESS_PERMISSION_RULE")
    ACCESS_PERMISSION_RULE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ANNOTATED_RELATIONSHIP_ELEMENT")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/BASIC_EVENT")
    BASIC_EVENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/BLOB")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/CAPABILITY")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/CONCEPT_DICTIONARY")
    CONCEPT_DICTIONARY,

    /**
     * Data Element is abstract, i.e. if a key uses 'DataElement' the reference may be a Property, a
     * File etc.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/DATA_ELEMENT")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ENTITY")
    ENTITY,

    /**
     * Event is abstract
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/EVENT")
    EVENT,

    /**
     * Property with a value that can be provided in multiple languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/MULTI_LANGUAGE_PROPERTY")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/OPERATION")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/PROPERTY")
    PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/RANGE")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/REFERENCE_ELEMENT")
    REFERENCE_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/RELATIONSHIPT_ELEMENT")
    RELATIONSHIPT_ELEMENT,

    /**
     * Submodel Element is abstract, i.e. if a key uses 'SubmodelElement' the reference may be a
     * Property, a SubmodelElementCollection, an Operation etc.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SUBMODEL_ELEMENT")
    SUBMODEL_ELEMENT,

    /**
     * Collection of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SUBMODEL_ELEMENT_COLLECTION")
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ReferableElements/VIEW")
    VIEW;

}
