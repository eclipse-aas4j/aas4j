/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
 * An element that is referable by its 'idShort'.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = Identifiable.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Referable extends HasExtensions {

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/category
     *
     * @return Returns the String for the property category.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/category")
    String getCategory();

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/category
     *
     * @param category desired value for the property category.
     */
    void setCategory(String category);

    /**
     * Checksum to be used to determine if an Referable (including its aggregated child elements) has
     * changed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/checksum
     *
     * @return Returns the String for the property checksum.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/checksum")
    String getChecksum();

    /**
     * Checksum to be used to determine if an Referable (including its aggregated child elements) has
     * changed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/checksum
     *
     * @param checksum desired value for the property checksum.
     */
    void setChecksum(String checksum);

    /**
     * Description or comments on the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/description
     *
     * @return Returns the List of LangStrings for the property description.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/description")
    List<LangString> getDescription();

    /**
     * Description or comments on the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/description
     *
     * @param description desired value for the property description.
     */
    void setDescription(List<LangString> description);

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/displayName
     *
     * @return Returns the List of LangStrings for the property displayName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/displayName")
    List<LangString> getDisplayName();

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/displayName
     *
     * @param displayName desired value for the property displayName.
     */
    void setDisplayName(List<LangString> displayName);

    /**
     * In case of identifiables this attribute is a short name of the element. In case of referable this
     * ID is an identifying string of the element within its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/idShort
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/idShort")
    String getIdShort();

    /**
     * In case of identifiables this attribute is a short name of the element. In case of referable this
     * ID is an identifying string of the element within its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Referable/idShort
     *
     * @param idShort desired value for the property idShort.
     */
    void setIdShort(String idShort);

}
