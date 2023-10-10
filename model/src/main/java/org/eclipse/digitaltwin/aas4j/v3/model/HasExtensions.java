/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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
 * Element that can be extended by proprietary extensions.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Referable.class)
})
public interface HasExtensions {

    /**
     * An extension of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasExtensions/extensions
     *
     * @return Returns the List of Extensions for the property extensions.
     */
    @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
    List<Extension> getExtensions();

    /**
     * An extension of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/HasExtensions/extensions
     *
     * @param extensions desired value for the property extensions.
     */
    void setExtensions(List<Extension> extensions);

}
