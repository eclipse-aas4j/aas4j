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
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;

import java.util.List;

@JsonTypeName("aas:SubmodelElementList")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface SubmodelElementListMixin extends SubmodelElementMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant")
    boolean getOrderRelevant();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant")
    void setOrderRelevant(boolean orderRelevant);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement")
    Reference getSemanticIdListElement();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement")
    void setSemanticIdListElement(Reference semanticIdListElement);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement")
    AasSubmodelElements getTypeValueListElement();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement")
    void setTypeValueListElement(AasSubmodelElements typeValueListElement);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value")
    List<SubmodelElement> getValue();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value")
    void setValue(List<SubmodelElement> value);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement")
    DataTypeDefXsd getValueTypeListElement();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement")
    void setValueTypeListElement(DataTypeDefXsd valueTypeListElement);
}
