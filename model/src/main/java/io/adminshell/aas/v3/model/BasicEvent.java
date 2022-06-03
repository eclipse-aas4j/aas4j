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
 * A basic event.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEvent.class)
})
public interface BasicEvent extends Event {

    /**
     * Reference to the data or other elements that are being observed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed
     *
     * @return Returns the Reference for the property observed.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed")
    Reference getObserved();

    /**
     * Reference to the data or other elements that are being observed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed
     *
     * @param observed desired value for the property observed.
     */
    void setObserved(Reference observed);

}
