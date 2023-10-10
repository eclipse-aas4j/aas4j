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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLevelType;


/**
 * Value represented by up to four variants of a numeric value in a specific role: MIN, NOM, TYP and
 * MAX. True means that the value is available, false means the value is not available.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLevelType.class)
})
public interface LevelType {

    /**
     * Minimum of the value
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/min
     *
     * @return Returns the boolean for the property min.
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/min")
    boolean getMin();

    /**
     * Minimum of the value
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/min
     *
     * @param min desired value for the property min.
     */
    void setMin(boolean min);

    /**
     * Nominal value (value as designated)
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/nom
     *
     * @return Returns the boolean for the property nom.
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/nom")
    boolean getNom();

    /**
     * Nominal value (value as designated)
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/nom
     *
     * @param nom desired value for the property nom.
     */
    void setNom(boolean nom);

    /**
     * Value as typically present
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/typ
     *
     * @return Returns the boolean for the property typ.
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/typ")
    boolean getTyp();

    /**
     * Value as typically present
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/typ
     *
     * @param typ desired value for the property typ.
     */
    void setTyp(boolean typ);

    /**
     * Maximum of the value
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/max
     *
     * @return Returns the boolean for the property max.
     */
    @IRI("https://admin-shell.io/aas/3/0/LevelType/max")
    boolean getMax();

    /**
     * Maximum of the value
     *
     * More information under https://admin-shell.io/aas/3/0/LevelType/max
     *
     * @param max desired value for the property max.
     */
    void setMax(boolean max);

}
