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
 * Enumeration of all referable elements within an asset administration shell
 */
@IRI("aas:GloballyIdentifiables")
public enum GloballyIdentifiables {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/GloballyIdentifiables/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/GloballyIdentifiables/ConceptDescription")
    CONCEPT_DESCRIPTION,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/GloballyIdentifiables/GlobalReference")
    GLOBAL_REFERENCE,

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/GloballyIdentifiables/Submodel")
    SUBMODEL;

}
