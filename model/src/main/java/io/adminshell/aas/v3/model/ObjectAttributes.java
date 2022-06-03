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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of data elements that describe object attributes. These attributes need to refer to a data
 * element within an existing submodel.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultObjectAttributes.class)
})
public interface ObjectAttributes {

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @return Returns the List of References for the property objectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
    List<Reference> getObjectAttributes();

    /**
     * A data elements that further classifies an object.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
     *
     * @param objectAttributes desired value for the property objectAttributes.
     */
    void setObjectAttributes(List<Reference> objectAttributes);

}
