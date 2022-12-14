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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;

import java.util.List;


/**
 * A submodel element list is an ordered list of submodel elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementList.class)
})
public interface SubmodelElementList extends SubmodelElement {

    /**
     * Defines whether order in list is relevant. If 'orderRelevant' = False then the list is
     * representing a set or a bag.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant
     *
     * @return Returns the boolean for the property orderRelevant.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant")
    boolean getOrderRelevant();

    /**
     * Defines whether order in list is relevant. If 'orderRelevant' = False then the list is
     * representing a set or a bag.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant
     *
     * @param orderRelevant desired value for the property orderRelevant.
     */
    void setOrderRelevant(boolean orderRelevant);

    /**
     * Semantic ID the submodel elements contained in the list match to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement
     *
     * @return Returns the Reference for the property semanticIdListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement")
    Reference getSemanticIdListElement();

    /**
     * Semantic ID the submodel elements contained in the list match to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement
     *
     * @param semanticIdListElement desired value for the property semanticIdListElement.
     */
    void setSemanticIdListElement(Reference semanticIdListElement);

    /**
     * The submodel element type of the submodel elements contained in the list.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement
     *
     * @return Returns the AasSubmodelElements for the property typeValueListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement")
    AasSubmodelElements getTypeValueListElement();

    /**
     * The submodel element type of the submodel elements contained in the list.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement
     *
     * @param typeValueListElement desired value for the property typeValueListElement.
     */
    void setTypeValueListElement(AasSubmodelElements typeValueListElement);

    /**
     * Submodel element contained in the list.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value
     *
     * @return Returns the List of SubmodelElements for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value")
    List<SubmodelElement> getValue();

    /**
     * Submodel element contained in the list.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value
     *
     * @param value desired value for the property value.
     */
    void setValue(List<SubmodelElement> value);

    /**
     * The value type of the submodel element contained in the list.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement
     *
     * @return Returns the DataTypeDefXsd for the property valueTypeListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement")
    DataTypeDefXsd getValueTypeListElement();

    /**
     * The value type of the submodel element contained in the list.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement
     *
     * @param valueTypeListElement desired value for the property valueTypeListElement.
     */
    void setValueTypeListElement(DataTypeDefXsd valueTypeListElement);

}
