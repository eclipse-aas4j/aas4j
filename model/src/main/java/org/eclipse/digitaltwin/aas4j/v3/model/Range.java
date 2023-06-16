/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;


/**
 * A range data element is a data element that defines a range with min and max.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRange.class)
})
public interface Range extends DataElement {

    /**
     * Data type of the min und max
     *
     * More information under https://admin-shell.io/aas/3/0/Range/valueType
     *
     * @return Returns the DataTypeDefXsd for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/Range/valueType")
    DataTypeDefXsd getValueType();

    /**
     * Data type of the min und max
     *
     * More information under https://admin-shell.io/aas/3/0/Range/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(DataTypeDefXsd valueType);

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/Range/min
     *
     * @return Returns the String for the property min.
     */
    @IRI("https://admin-shell.io/aas/3/0/Range/min")
    String getMin();

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/Range/min
     *
     * @param min desired value for the property min.
     */
    void setMin(String min);

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/Range/max
     *
     * @return Returns the String for the property max.
     */
    @IRI("https://admin-shell.io/aas/3/0/Range/max")
    String getMax();

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/Range/max
     *
     * @param max desired value for the property max.
     */
    void setMax(String max);

}
