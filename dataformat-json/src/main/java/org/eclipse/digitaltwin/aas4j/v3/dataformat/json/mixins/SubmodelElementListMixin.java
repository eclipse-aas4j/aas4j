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
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.Collection;
import org.eclipse.digitaltwin.aas4j.v3.model.AASSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;

public interface SubmodelElementListMixin {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("orderRelevant")
    public boolean getOrdered();

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("orderRelevant")
    public void setOrdered(boolean orderRelevant);

    @JsonProperty("semanticIdListElement")
    public Reference getSemanticIdListElement();

    @JsonProperty("semanticIdListElement")
    public void setSemanticIdListElement(Reference semanticIdListElement);

    @JsonProperty("typeValueListElement")
    public AASSubmodelElements getTypeValueListElement();

    @JsonProperty("typeValueListElement")
    public void setTypeValueListElement(AASSubmodelElements typeValueListElement);

    @JsonProperty("valueTypeListElement")
    public DataTypeDefXSD getValueTypeListElement();

    @JsonProperty("valueTypeListElement")
    public void setValueTypeListElement(DataTypeDefXSD valueTypeListElement);

    @JsonProperty("value")
    public Collection<SubmodelElement> getValues();

    @JsonProperty("value")
    public void setValues(Collection<SubmodelElement> values);
}
