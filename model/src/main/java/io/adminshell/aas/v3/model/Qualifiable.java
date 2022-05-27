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
 * Additional qualification of a qualifiable element. Constraint AASd-021: Every qualifiable can
 * only have one qualifier with the same Qualifier/type.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AccessPermissionRule.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Qualifiable {

    /**
     * Additional qualification of a qualifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     *
     * @return Returns the List of Constraints for the property qualifiers.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    List<Constraint> getQualifiers();

    /**
     * Additional qualification of a qualifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
     *
     * @param qualifiers desired value for the property qualifiers.
     */
    void setQualifiers(List<Constraint> qualifiers);

}
