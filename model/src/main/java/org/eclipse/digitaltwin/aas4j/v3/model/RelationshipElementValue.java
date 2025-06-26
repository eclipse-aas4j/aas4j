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
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRelationshipElementValue.class)
})
public interface RelationshipElementValue {

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/RelationshipElementValue/first
     *
     * @return Returns the ReferenceValue for the property first.
     */
    @IRI("https://admin-shell.io/aas/3/1/RelationshipElementValue/first")
    ReferenceValue getFirst();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/RelationshipElementValue/first
     *
     * @param first desired value for the property first.
     */
    void setFirst(ReferenceValue first);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/RelationshipElementValue/second
     *
     * @return Returns the ReferenceValue for the property second.
     */
    @IRI("https://admin-shell.io/aas/3/1/RelationshipElementValue/second")
    ReferenceValue getSecond();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/RelationshipElementValue/second
     *
     * @param second desired value for the property second.
     */
    void setSecond(ReferenceValue second);

}
