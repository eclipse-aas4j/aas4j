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



import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;


/**
 * Enumeration of all possible elements of a 'SubmodelElementList'.
 */
@IRI("aas:AASSubmodelElements")
public enum AASSubmodelElements {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/BasicEventElement")
    BASIC_EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Capability")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Entity")
    ENTITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/EventElement")
    EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/File")
    FILE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Property")
    PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/Range")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/ReferenceElement")
    REFERENCE_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/SubmodelElement")
    SUBMODEL_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/AASSubmodelElements/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
