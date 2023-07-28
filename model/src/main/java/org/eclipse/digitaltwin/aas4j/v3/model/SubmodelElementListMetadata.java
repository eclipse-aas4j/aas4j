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
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementListMetadata.class)
})
public interface SubmodelElementListMetadata extends SubmodelElementAttributes {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/orderRelevant
     *
     * @return Returns the boolean for the property orderRelevant.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/orderRelevant")
    boolean getOrderRelevant();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/orderRelevant
     *
     * @param orderRelevant desired value for the property orderRelevant.
     */
    void setOrderRelevant(boolean orderRelevant);

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/semanticIdListElement
     *
     * @return Returns the Reference for the property semanticIdListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/semanticIdListElement")
    Reference getSemanticIdListElement();

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/semanticIdListElement
     *
     * @param semanticIdListElement desired value for the property semanticIdListElement.
     */
    void setSemanticIdListElement(Reference semanticIdListElement);

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/typeValueListElement
     *
     * @return Returns the ModelType for the property typeValueListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/typeValueListElement")
    ModelType getTypeValueListElement();

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/typeValueListElement
     *
     * @param typeValueListElement desired value for the property typeValueListElement.
     */
    void setTypeValueListElement(ModelType typeValueListElement);

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/valueTypeListElement
     *
     * @return Returns the DataTypeDefXsd for the property valueTypeListElement.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/valueTypeListElement")
    DataTypeDefXsd getValueTypeListElement();

    /**
     *
     * More information under
     * https://admin-shell.io/aas/3/0/SubmodelElementListMetadata/valueTypeListElement
     *
     * @param valueTypeListElement desired value for the property valueTypeListElement.
     */
    void setValueTypeListElement(DataTypeDefXsd valueTypeListElement);

}
