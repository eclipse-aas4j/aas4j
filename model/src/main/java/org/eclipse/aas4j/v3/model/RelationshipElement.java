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

package org.eclipse.aas4j.v3.model;



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * A relationship element is used to define a relationship between two elements being either
 * referable (model reference) or external (global reference).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRelationshipElement.class),
    @KnownSubtypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElement extends SubmodelElement {

    /**
     * Reference to the first element in the relationship taking the role of the subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/RelationshipElement/first
     *
     * @return Returns the Reference for the property first.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/RelationshipElement/first")
    Reference getFirst();

    /**
     * Reference to the first element in the relationship taking the role of the subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/RelationshipElement/first
     *
     * @param first desired value for the property first.
     */
    void setFirst(Reference first);

    /**
     * Reference to the second element in the relationship taking the role of the object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/RelationshipElement/second
     *
     * @return Returns the Reference for the property second.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/RelationshipElement/second")
    Reference getSecond();

    /**
     * Reference to the second element in the relationship taking the role of the object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/RelationshipElement/second
     *
     * @param second desired value for the property second.
     */
    void setSecond(Reference second);

}
