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
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Element that can have a semantic definition. Identifier of the semantic definition of the
 * element. It is called semantic id of the element. The semantic id may either reference an
 * external global id or it may reference a referable model element of kind=Type that defines the
 * semantics of the element. In many cases the idShort is identical to the English short name within
 * the semantic definition as referenced vi aits semantic id.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = IdentifierKeyValuePair.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = SubmodelElement.class),
    @KnownSubtypes.Type(value = Qualifier.class),
    @KnownSubtypes.Type(value = Extension.class)
})
public interface HasSemantics {

    /**
     * Points to the Expression Semantic of the Submodels
     *
     * The semantic id might refer to an external information source, which explains the formulation of
     * the submodel (for example an PDF if a standard).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
     *
     * @return Returns the Reference for the property semanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    Reference getSemanticId();

    /**
     * Points to the Expression Semantic of the Submodels
     *
     * The semantic id might refer to an external information source, which explains the formulation of
     * the submodel (for example an PDF if a standard).
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId
     *
     * @param semanticId desired value for the property semanticId.
     */
    void setSemanticId(Reference semanticId);

}
