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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Data Specification Template for Physical Units.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit extends DataSpecificationContent {

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @return Returns the String for the property conversionFactor.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    String getConversionFactor();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor
     *
     * @param conversionFactor desired value for the property conversionFactor.
     */
    void setConversionFactor(String conversionFactor);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     *
     * @return Returns the List of LangStrings for the property definitions.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    List<LangString> getDefinitions();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition
     *
     * @param definitions desired value for the property definitions.
     */
    void setDefinitions(List<LangString> definitions);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     *
     * @return Returns the String for the property dinNotation.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    String getDinNotation();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation
     *
     * @param dinNotation desired value for the property dinNotation.
     */
    void setDinNotation(String dinNotation);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     *
     * @return Returns the String for the property eceCode.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    String getEceCode();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode
     *
     * @param eceCode desired value for the property eceCode.
     */
    void setEceCode(String eceCode);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     *
     * @return Returns the String for the property eceName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    String getEceName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName
     *
     * @param eceName desired value for the property eceName.
     */
    void setEceName(String eceName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     *
     * @return Returns the String for the property nistName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    String getNistName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName
     *
     * @param nistName desired value for the property nistName.
     */
    void setNistName(String nistName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     *
     * @return Returns the String for the property siName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    String getSiName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName
     *
     * @param siName desired value for the property siName.
     */
    void setSiName(String siName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     *
     * @return Returns the String for the property siNotation.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    String getSiNotation();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation
     *
     * @param siNotation desired value for the property siNotation.
     */
    void setSiNotation(String siNotation);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @return Returns the String for the property registrationAuthorityId.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    String getRegistrationAuthorityId();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId
     *
     * @param registrationAuthorityId desired value for the property registrationAuthorityId.
     */
    void setRegistrationAuthorityId(String registrationAuthorityId);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     *
     * @return Returns the String for the property supplier.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    String getSupplier();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier
     *
     * @param supplier desired value for the property supplier.
     */
    void setSupplier(String supplier);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     *
     * @return Returns the String for the property unitName.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    String getUnitName();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName
     *
     * @param unitName desired value for the property unitName.
     */
    void setUnitName(String unitName);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @return Returns the String for the property unitSymbol.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    String getUnitSymbol();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol
     *
     * @param unitSymbol desired value for the property unitSymbol.
     */
    void setUnitSymbol(String unitSymbol);

}
