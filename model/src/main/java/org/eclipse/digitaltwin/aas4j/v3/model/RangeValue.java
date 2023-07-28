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

import java.math.BigInteger;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRangeValue.class)
})
public interface RangeValue {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RangeValue/max
     *
     * @return Returns the BigInteger for the property max.
     */
    @IRI("https://admin-shell.io/aas/3/0/RangeValue/max")
    BigInteger getMax();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RangeValue/max
     *
     * @param max desired value for the property max.
     */
    void setMax(BigInteger max);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RangeValue/min
     *
     * @return Returns the BigInteger for the property min.
     */
    @IRI("https://admin-shell.io/aas/3/0/RangeValue/min")
    BigInteger getMin();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RangeValue/min
     *
     * @param min desired value for the property min.
     */
    void setMin(BigInteger min);

}
