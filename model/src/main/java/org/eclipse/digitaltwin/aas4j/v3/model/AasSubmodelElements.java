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
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/DataElement")
    DATA_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Entity")
    ENTITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/EventElement")
    EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/File")
    FILE,

    /** 
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
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Range")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/ReferenceElement")
    REFERENCE_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElement")
    SUBMODEL_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
