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

package org.eclipse.aas4j.v3.rc02.model;




import org.eclipse.aas4j.v3.rc02.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultCapability;

/**
 * A capability is the implementation-independent description of the potential of an asset to
 * achieve a certain effect in the physical or virtual world.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultCapability.class)
})
public interface Capability extends SubmodelElement {

}