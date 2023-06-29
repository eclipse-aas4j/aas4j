/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;

import java.util.List;

@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DataSpecificationPhysicalUnitMixin {
    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor")
    String getConversionFactor();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/conversionFactor")
    void setConversionFactor(String conversionFactor);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/definition")
    List<LangString> getDefinitions();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/definition")
    void setDefinitions(List<LangString> definitions);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation")
    String getDinNotation();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/dinNotation")
    void setDinNotation(String dinNotation);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/eceCode")
    String getEceCode();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/eceCode")
    void setEceCode(String eceCode);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/eceName")
    String getEceName();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/eceName")
    void setEceName(String eceName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/nistName")
    String getNistName();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/nistName")
    void setNistName(String nistName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/siName")
    String getSiName();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/siName")
    void setSiName(String siName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/siNotation")
    String getSiNotation();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/siNotation")
    void setSiNotation(String siNotation);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId")
    String getRegistrationAuthorityId();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/registrationAuthorityId")
    void setRegistrationAuthorityId(String registrationAuthorityId);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/supplier")
    String getSupplier();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/supplier")
    void setSupplier(String supplier);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/unitName")
    String getUnitName();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/unitName")
    void setUnitName(String unitName);

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol")
    String getUnitSymbol();

    @JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/DataSpecificationPhysicalUnit/unitSymbol")
    void setUnitSymbol(String unitSymbol);
}
