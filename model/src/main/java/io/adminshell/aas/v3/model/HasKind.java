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
 * An element with a kind is an element that can either represent a type or an instance. Default for
 * an element is that it is representing an instance.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasKind {

    /**
     * ModelingKind of the element: either type or instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     *
     * @return Returns the ModelingKind for the property kind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    ModelingKind getKind();

    /**
     * ModelingKind of the element: either type or instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasKind/kind
     *
     * @param kind desired value for the property kind.
     */
    void setKind(ModelingKind kind);

}
