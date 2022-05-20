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
 * Data Specification Template for Physical Units.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRC01.class)
})
public interface RC01 extends DataSpecificationContent {

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     *
     * @return Returns the List of Strings for the property conversionFactors.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
    List<String> getConversionFactors();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
     *
     * @param conversionFactors desired value for the property conversionFactors.
     */
    void setConversionFactors(List<String> conversionFactors);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
     *
     * @return Returns the List of LangStrings for the property definitions.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
    List<LangString> getDefinitions();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
     *
     * @param definitions desired value for the property definitions.
     */
    void setDefinitions(List<LangString> definitions);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     *
     * @return Returns the List of Strings for the property dinNotations.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
    List<String> getDinNotations();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
     *
     * @param dinNotations desired value for the property dinNotations.
     */
    void setDinNotations(List<String> dinNotations);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     *
     * @return Returns the List of Strings for the property eceCodes.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
    List<String> getEceCodes();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
     *
     * @param eceCodes desired value for the property eceCodes.
     */
    void setEceCodes(List<String> eceCodes);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     *
     * @return Returns the List of Strings for the property eceNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
    List<String> getEceNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
     *
     * @param eceNames desired value for the property eceNames.
     */
    void setEceNames(List<String> eceNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     *
     * @return Returns the List of Strings for the property nistNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
    List<String> getNistNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
     *
     * @param nistNames desired value for the property nistNames.
     */
    void setNistNames(List<String> nistNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     *
     * @return Returns the List of Strings for the property siNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
    List<String> getSiNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
     *
     * @param siNames desired value for the property siNames.
     */
    void setSiNames(List<String> siNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     *
     * @return Returns the List of Strings for the property siNotations.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
    List<String> getSiNotations();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
     *
     * @param siNotations desired value for the property siNotations.
     */
    void setSiNotations(List<String> siNotations);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     *
     * @return Returns the List of Strings for the property registrationAuthorityIds.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
    List<String> getRegistrationAuthorityIds();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
     *
     * @param registrationAuthorityIds desired value for the property registrationAuthorityIds.
     */
    void setRegistrationAuthorityIds(List<String> registrationAuthorityIds);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     *
     * @return Returns the List of Strings for the property suppliers.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
    List<String> getSuppliers();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
     *
     * @param suppliers desired value for the property suppliers.
     */
    void setSuppliers(List<String> suppliers);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     *
     * @return Returns the List of Strings for the property unitNames.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
    List<String> getUnitNames();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
     *
     * @param unitNames desired value for the property unitNames.
     */
    void setUnitNames(List<String> unitNames);

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     *
     * @return Returns the List of Strings for the property unitSymbols.
     */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
    List<String> getUnitSymbols();

    /**
     *
     * More information under
     * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
     *
     * @param unitSymbols desired value for the property unitSymbols.
     */
    void setUnitSymbols(List<String> unitSymbols);

}
