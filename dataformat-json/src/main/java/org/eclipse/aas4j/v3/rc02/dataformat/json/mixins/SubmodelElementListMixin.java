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
package org.eclipse.aas4j.v3.rc02.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.aas4j.v3.rc02.model.AasSubmodelElements;
import org.eclipse.aas4j.v3.rc02.model.DataTypeDefXsd;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.SubmodelElement;

import java.util.Collection;

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
    public AasSubmodelElements getTypeValueListElement();

    @JsonProperty("typeValueListElement")
    public void setTypeValueListElement(AasSubmodelElements typeValueListElement);

    @JsonProperty("valueTypeListElement")
    public DataTypeDefXsd getValueTypeListElement();

    @JsonProperty("valueTypeListElement")
    public void setValueTypeListElement(DataTypeDefXsd valueTypeListElement);

    @JsonProperty("value")
    public Collection<SubmodelElement> getValues();

    @JsonProperty("value")
    public void setValues(Collection<SubmodelElement> values);
}
