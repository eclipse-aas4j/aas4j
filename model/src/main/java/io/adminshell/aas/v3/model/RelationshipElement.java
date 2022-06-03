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
 * Constraint AASd-055: The semanticId of a RelationshipElement or a AnnotatedRelationshipElement
 * shall only reference a ConceptDescription with the category RELATIONSHIP.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRelationshipElement.class),
    @KnownSubtypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElement extends SubmodelElement {

    /**
     * First element in the relationship taking the role of the subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     *
     * @return Returns the Reference for the property first.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    Reference getFirst();

    /**
     * First element in the relationship taking the role of the subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
     *
     * @param first desired value for the property first.
     */
    void setFirst(Reference first);

    /**
     * Second element in the relationship taking the role of the object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     *
     * @return Returns the Reference for the property second.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    Reference getSecond();

    /**
     * Second element in the relationship taking the role of the object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
     *
     * @param second desired value for the property second.
     */
    void setSecond(Reference second);

}
