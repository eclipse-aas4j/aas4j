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

package io.adminshell.aas.v3.rc02.model;




import io.adminshell.aas.v3.rc02.model.annotations.IRI;

/**
 * Enumeration of all referable elements within an asset administration shell.
 */
@IRI("aas:AasSubmodelElements")
public enum AasSubmodelElements {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/BasicEventElement")
    BASIC_EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Capability")
    CAPABILITY,

    /**
     * Data Element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Entity")
    ENTITY,

    /**
     * Event element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/EventElement")
    EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/File")
    FILE,

    /**
     * Property with a value that can be provided in multiple languages
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Property")
    PROPERTY,

    /**
     * Range with min and max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Range")
    RANGE,

    /**
     * Reference
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/ReferenceElement")
    REFERENCE_ELEMENT,

    /**
     * Relationship
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /**
     * Submodel Element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElement")
    SUBMODEL_ELEMENT,

    /**
     * Struct of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /**
     * List of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
