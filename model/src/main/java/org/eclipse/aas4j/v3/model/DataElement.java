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



import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * A data element is a submodel element that is not further composed out of other submodel elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Blob.class),
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = MultiLanguageProperty.class),
    @KnownSubtypes.Type(value = Property.class),
    @KnownSubtypes.Type(value = Range.class),
    @KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement extends SubmodelElement {

}
