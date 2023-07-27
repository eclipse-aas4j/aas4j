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

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationPhysicalUnit;


/**
 * Content of data specification template for concept descriptions for properties, values and value
 * lists conformant to IEC 61360.
 */
@KnownSubtypes({
        @KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit extends DataSpecificationContent {

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/conversionFactor")
    String getConversionFactor();

    void setConversionFactor(String conversionFactor);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/dinNotation")
    String getDinNotation();

    void setDinNotation(String dinNotation);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/eceCode")
    String getEceCode();

    void setEceCode(String eceCode);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/eceName")
    String getEceName();

    void setEceName(String eceName);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/nistName")
    String getNistName();

    void setNistName(String nistName);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/registrationAuthorityId")
    String getRegistrationAuthorityId();

    void setRegistrationAuthorityId(String registrationAuthorityId);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/siName")
    String getSiName();

    void setSiName(String siName);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/siNotation")
    String getSiNotation();

    void setSiNotation(String siNotation);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/sourceOfDefinition")
    String getSourceOfDefinition();

    void setSourceOfDefinition(String sourceOfDefinition);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/supplier")
    String getSupplier();

    void setSupplier(String supplier);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/unitName")
    String getUnitName();

    void setUnitName(String unitName);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/unitSymbol")
    String getUnitSymbol();

    void setUnitSymbol(String unitSymbol);

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/definition")
    List<LangStringTextType> getDefinition();

    void setDefinition(List<LangStringTextType> definition);

}
