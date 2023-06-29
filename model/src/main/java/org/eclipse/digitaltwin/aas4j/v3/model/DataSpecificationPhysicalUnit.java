/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationPhysicalUnit;

import java.util.List;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit extends DataSpecificationContent {

    /**
     * Conversion factor
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @return Returns the String for the property conversionFactor.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor")
    String getConversionFactor();

    /**
     * Conversion factor
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @param conversionFactor desired value for the property conversionFactor.
     */
    void setConversionFactor(String conversionFactor);

    /**
     * Definition in different languages
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/definition
     *
     * @return Returns the List of LangStrings for the property definition.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/definition")
    List<LangString> getDefinition();

    /**
     * Definition in different languages
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/definition
     *
     * @param definition desired value for the property definition.
     */
    void setDefinition(List<LangString> definition);

    /**
     * Notation of physical unit conformant to DIN
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation
     *
     * @return Returns the String for the property dinNotation.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation")
    String getDinNotation();

    /**
     * Notation of physical unit conformant to DIN
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation
     *
     * @param dinNotation desired value for the property dinNotation.
     */
    void setDinNotation(String dinNotation);

    /**
     * Code of physical unit conformant to ECE
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceCode
     *
     * @return Returns the String for the property eceCode.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceCode")
    String getEceCode();

    /**
     * Code of physical unit conformant to ECE
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceCode
     *
     * @param eceCode desired value for the property eceCode.
     */
    void setEceCode(String eceCode);

    /**
     * Name of physical unit conformant to ECE
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceName
     *
     * @return Returns the String for the property eceName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceName")
    String getEceName();

    /**
     * Name of physical unit conformant to ECE
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/eceName
     *
     * @param eceName desired value for the property eceName.
     */
    void setEceName(String eceName);

    /**
     * Name of NIST physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/nistName
     *
     * @return Returns the String for the property nistName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/nistName")
    String getNistName();

    /**
     * Name of NIST physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/nistName
     *
     * @param nistName desired value for the property nistName.
     */
    void setNistName(String nistName);

    /**
     * Registration authority ID
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @return Returns the String for the property registrationAuthorityId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId")
    String getRegistrationAuthorityId();

    /**
     * Registration authority ID
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @param registrationAuthorityId desired value for the property registrationAuthorityId.
     */
    void setRegistrationAuthorityId(String registrationAuthorityId);

    /**
     * Name of SI physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siName
     *
     * @return Returns the String for the property siName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siName")
    String getSiName();

    /**
     * Name of SI physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siName
     *
     * @param siName desired value for the property siName.
     */
    void setSiName(String siName);

    /**
     * Notation of SI physical unit
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siNotation
     *
     * @return Returns the String for the property siNotation.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siNotation")
    String getSiNotation();

    /**
     * Notation of SI physical unit
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/siNotation
     *
     * @param siNotation desired value for the property siNotation.
     */
    void setSiNotation(String siNotation);

    /**
     * Source of definition
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/sourceOfDefinition
     *
     * @return Returns the String for the property sourceOfDefinition.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/sourceOfDefinition")
    String getSourceOfDefinition();

    /**
     * Source of definition
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/sourceOfDefinition
     *
     * @param sourceOfDefinition desired value for the property sourceOfDefinition.
     */
    void setSourceOfDefinition(String sourceOfDefinition);

    /**
     * Supplier
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/supplier
     *
     * @return Returns the String for the property supplier.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/supplier")
    String getSupplier();

    /**
     * Supplier
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/supplier
     *
     * @param supplier desired value for the property supplier.
     */
    void setSupplier(String supplier);

    /**
     * Name of the physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitName
     *
     * @return Returns the String for the property unitName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitName")
    String getUnitName();

    /**
     * Name of the physical unit
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitName
     *
     * @param unitName desired value for the property unitName.
     */
    void setUnitName(String unitName);

    /**
     * Symbol for the physical unit
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @return Returns the String for the property unitSymbol.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol")
    String getUnitSymbol();

    /**
     * Symbol for the physical unit
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @param unitSymbol desired value for the property unitSymbol.
     */
    void setUnitSymbol(String unitSymbol);

}
