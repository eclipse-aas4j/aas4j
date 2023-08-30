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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetID;


/**
 * A specific asset ID describes a generic supplementary identifying attribute of the asset.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSpecificAssetID.class)
})
public interface SpecificAssetID extends HasSemantics {

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/externalSubjectID
     *
     * @return Returns the Reference for the property externalSubjectID.
     */
    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/externalSubjectID")
    Reference getExternalSubjectID();

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/externalSubjectID
     *
     * @param externalSubjectID desired value for the property externalSubjectID.
     */
    void setExternalSubjectID(Reference externalSubjectID);

    /**
     * Name of the identifier
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/name
     *
     * @return Returns the String for the property name.
     */
    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/name")
    String getName();

    /**
     * Name of the identifier
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/name
     *
     * @param name desired value for the property name.
     */
    void setName(String name);

    /**
     * The value of the specific asset identifier with the corresponding name.
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/value")
    String getValue();

    /**
     * The value of the specific asset identifier with the corresponding name.
     *
     * More information under https://admin-shell.io/aas/3/0/SpecificAssetID/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

}
