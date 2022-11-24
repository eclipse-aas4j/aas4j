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
package org.eclipse.aas4j.v3.model;

import java.util.List;



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;

/**
 * A set of value reference pairs.
 */
@KnownSubtypes({
        @KnownSubtypes.Type(value = DefaultValueList.class)
})
public interface ValueList {

    /**
     * A pair of a value together with its global unique id..
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ValueList/valueReferencePairs
     *
     * @return Returns the List of ValueReferencePairs for the property valueReferencePairs.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueList/valueReferencePairs")
    List<ValueReferencePair> getValueReferencePairs();

    /**
     * A pair of a value together with its global unique id..
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ValueList/valueReferencePairs
     *
     * @param valueReferencePairs desired value for the property valueReferencePairs.
     */
    void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairs);

}