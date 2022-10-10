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
 * A reference element is a data element that defines a logical reference to another element within
 * the same or another AAS or a reference to an external object or entity.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReferenceElement.class)
})
public interface ReferenceElement extends DataElement {

    /**
     * Global reference to an external object or entity or a logical reference to another element within
     * the same or another AAS (i.e. a model reference to a Referable).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ReferenceElement/value
     *
     * @return Returns the Reference for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/ReferenceElement/value")
    Reference getValue();

    /**
     * Global reference to an external object or entity or a logical reference to another element within
     * the same or another AAS (i.e. a model reference to a Referable).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ReferenceElement/value
     *
     * @param value desired value for the property value.
     */
    void setValue(Reference value);

}
