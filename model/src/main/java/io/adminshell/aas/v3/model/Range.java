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
 * An element that is referable by its idShort. This id is not globally unique. This id is unique
 * within the name space of the element. Constraint AASd-053: The semanticId of a Range submodel
 * element shall only reference a ConceptDescription with the category PROPERTY. Constraint
 * AASd-068: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or RATIONAL_*.
 * Constraint AASd-069: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/levelType shall be identical to the set {Min,Max}.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRange.class)
})
public interface Range extends DataElement {

    /**
     * Data type of the min and max.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    String getValueType();

    /**
     * Data type of the min and max.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/max
     *
     * @return Returns the String for the property max.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    String getMax();

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/max
     *
     * @param max desired value for the property max.
     */
    void setMax(String max);

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/min
     *
     * @return Returns the String for the property min.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    String getMin();

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/min
     *
     * @param min desired value for the property min.
     */
    void setMin(String min);

}
