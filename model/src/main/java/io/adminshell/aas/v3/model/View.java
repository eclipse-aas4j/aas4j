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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A view is a collection of referable elements w.r.t. to a specific viewpoint of one or more
 * stakeholders. Constraint AASd-064: If the semanticId of a View references a ConceptDescription
 * then the category of the ConceptDescription shall be VIEW.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultView.class)
})
public interface View extends Referable, HasDataSpecification, HasSemantics {

    /**
     * Referable elements that are contained in the view.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/View/containedElement
     *
     * @return Returns the List of References for the property containedElements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
    List<Reference> getContainedElements();

    /**
     * Referable elements that are contained in the view.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/View/containedElement
     *
     * @param containedElements desired value for the property containedElements.
     */
    void setContainedElements(List<Reference> containedElements);

}
