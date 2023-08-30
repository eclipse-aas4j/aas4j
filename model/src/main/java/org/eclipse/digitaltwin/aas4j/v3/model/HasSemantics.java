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
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;

import java.util.List;


/**
 * Element that can have a semantic definition plus some supplemental semantic definitions.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = SpecificAssetID.class),
    @KnownSubtypes.Type(value = SubmodelElement.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = Extension.class),
    @KnownSubtypes.Type(value = Qualifier.class)
})
public interface HasSemantics {

    /**
     * Identifier of the semantic definition of the element. It is called semantic ID of the element or
     * also main semantic ID of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasSemantics/semanticID
     *
     * @return Returns the Reference for the property semanticID.
     */
    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticID")
    Reference getSemanticID();

    /**
     * Identifier of the semantic definition of the element. It is called semantic ID of the element or
     * also main semantic ID of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasSemantics/semanticID
     *
     * @param semanticID desired value for the property semanticID.
     */
    void setSemanticID(Reference semanticID);

    /**
     * Identifier of a supplemental semantic definition of the element. It is called supplemental
     * semantic ID of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds
     *
     * @return Returns the List of References for the property supplementalSemanticIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    List<Reference> getSupplementalSemanticIds();

    /**
     * Identifier of a supplemental semantic definition of the element. It is called supplemental
     * semantic ID of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds
     *
     * @param supplementalSemanticIds desired value for the property supplementalSemanticIds.
     */
    void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds);

}
