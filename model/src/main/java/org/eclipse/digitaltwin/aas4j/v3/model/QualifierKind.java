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


/**
 * Enumeration for kinds of qualifiers.
 */
@IRI("aas:QualifierKind")
public enum QualifierKind {

    /**
     * qualifies the semantic definition the element is referring to ('semanticId')
     */
    @IRI("https://admin-shell.io/aas/3/0/QualifierKind/ConceptQualifier")
    CONCEPT_QUALIFIER,

    /**
     * qualifies the elements within a specific submodel on concept level.
     */
    @IRI("https://admin-shell.io/aas/3/0/QualifierKind/TemplateQualifier")
    TEMPLATE_QUALIFIER,

    /**
     * qualifies the value of the element and can change during run-time.
     */
    @IRI("https://admin-shell.io/aas/3/0/QualifierKind/ValueQualifier")
    VALUE_QUALIFIER;

}
