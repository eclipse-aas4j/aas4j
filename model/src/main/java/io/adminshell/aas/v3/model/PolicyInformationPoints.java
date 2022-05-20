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

package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Defines the security policy information points (PIP). Serves as the retrieval source of
 * attributes, or the data required for policy evaluation to provide the information needed by the
 * policy decision point to make the decisions.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyInformationPoints.class)
})
public interface PolicyInformationPoints {

    /**
     * If externalInformationPoints True then at least one Endpoint to external available information
     * needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     *
     * @return Returns the boolean for the property externalInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    boolean getExternalInformationPoints();

    /**
     * If externalInformationPoints True then at least one Endpoint to external available information
     * needs to be configured for the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
     *
     * @param externalInformationPoints desired value for the property externalInformationPoints.
     */
    void setExternalInformationPoints(boolean externalInformationPoints);

    /**
     * References to submodels defining information used by security access permission rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     *
     * @return Returns the List of Submodels for the property internalInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    List<Submodel> getInternalInformationPoints();

    /**
     * References to submodels defining information used by security access permission rules.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
     *
     * @param internalInformationPoints desired value for the property internalInformationPoints.
     */
    void setInternalInformationPoints(List<Submodel> internalInformationPoints);

}
