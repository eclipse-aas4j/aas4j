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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAnnotatedRelationshipElement;

import java.util.List;


/**
 * An annotated relationship element is a relationship element that can be annotated with additional
 * data elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAnnotatedRelationshipElement.class)
})
public interface AnnotatedRelationshipElement extends RelationshipElement {

    /**
     * A data element that represents an annotation that holds for the relationship between the two
     * elements
     *
     * More information under https://admin-shell.io/aas/3/0/AnnotatedRelationshipElement/annotations
     *
     * @return Returns the List of DataElements for the property annotations.
     */
    @IRI("https://admin-shell.io/aas/3/0/AnnotatedRelationshipElement/annotations")
    List<DataElement> getAnnotations();

    /**
     * A data element that represents an annotation that holds for the relationship between the two
     * elements
     *
     * More information under https://admin-shell.io/aas/3/0/AnnotatedRelationshipElement/annotations
     *
     * @param annotations desired value for the property annotations.
     */
    void setAnnotations(List<DataElement> annotations);

}
