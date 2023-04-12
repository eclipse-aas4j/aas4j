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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIEC61360;

import java.util.List;

public interface DataSpecificationPhysicalUnitMixin {

    @JsonProperty("conversionFactor")
    public List<String> getConversionFactors();

    @JsonProperty("conversionFactor")
    public void setConversionFactors(List<String> conversionFactors);

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("definition")
    public List<LangStringDefinitionTypeIEC61360> getDefinition();

    @JsonProperty("definition")
    public void setDefinition(List<LangStringDefinitionTypeIEC61360> definition);

    @JsonProperty("dinNotation")
    public List<String> getDinNotations();

    @JsonProperty("dinNotation")
    public void setDinNotations(List<String> dinNotations);

    @JsonProperty("eceCode")
    public List<String> getEceCodes();

    @JsonProperty("eceCode")
    public void setEceCodes(List<String> eceCodes);

    @JsonProperty("eceName")
    public List<String> getEceNames();

    @JsonProperty("eceName")
    public void setEceNames(List<String> eceNames);

    @JsonProperty("nistName")
    public List<String> getNistNames();

    @JsonProperty("nistName")
    public void setNistNames(List<String> nistNames);

    @JsonProperty("siName")
    public List<String> getSiNames();

    @JsonProperty("siName")
    public void setSiNames(List<String> siNames);

    @JsonProperty("siNotation")
    public List<String> getSiNotations();

    @JsonProperty("siNotation")
    public void setSiNotations(List<String> siNotations);

    @JsonProperty("registrationAuthorityId")
    public List<String> getRegistrationAuthorityIds();

    @JsonProperty("registrationAuthorityId")
    public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds);

    @JsonProperty("supplier")
    public List<String> getSuppliers();

    @JsonProperty("supplier")
    public void setSuppliers(List<String> suppliers);

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("unitName")
    public List<String> getUnitNames();

    @JsonProperty("unitName")
    public void setUnitNames(List<String> unitNames);

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("unitSymbol")
    public List<String> getUnitSymbols();

    @JsonProperty("unitSymbol")
    public void setUnitSymbols(List<String> unitSymbols);
}
