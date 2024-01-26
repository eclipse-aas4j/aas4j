/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.Collection;
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;

public interface SubmodelElementListMixin {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("orderRelevant")
    boolean getOrdered();

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("orderRelevant")
    void setOrdered(boolean orderRelevant);

    @JsonProperty("semanticIdListElement")
    Reference getSemanticIdListElement();

    @JsonProperty("semanticIdListElement")
    void setSemanticIdListElement(Reference semanticIdListElement);

    @JsonProperty("typeValueListElement")
    AasSubmodelElements getTypeValueListElement();

    @JsonProperty("typeValueListElement")
    void setTypeValueListElement(AasSubmodelElements typeValueListElement);

    @JsonProperty("valueTypeListElement")
    DataTypeDefXsd getValueTypeListElement();

    @JsonProperty("valueTypeListElement")
    void setValueTypeListElement(DataTypeDefXsd valueTypeListElement);

    @JsonProperty("value")
    Collection<SubmodelElement> getValue();

    @JsonProperty("value")
    void setValue(Collection<SubmodelElement> value);
}