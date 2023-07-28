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
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**  
*/
@IRI("aas:ModelType")
public enum ModelType {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/BasicEventElement")
    BASIC_EVENT_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Blob")
    BLOB,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Capability")
    CAPABILITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/ConceptDescription")
    CONCEPT_DESCRIPTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Entity")
    ENTITY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/File")
    FILE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Operation")
    OPERATION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Property")
    PROPERTY,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Qualifier")
    QUALIFIER,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Range")
    RANGE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Reference")
    REFERENCE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/ReferenceElement")
    REFERENCE_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/RelationshipElement")
    RELATIONSHIP_ELEMENT,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/Submodel")
    SUBMODEL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/ModelType/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST;

}
