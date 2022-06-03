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
package org.eclipse.aas4j.v3.rc02.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.*;

import java.util.List;

@JsonTypeName("aas:HasDataSpecification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Submodel.class),
    @JsonSubTypes.Type(value = AdministrativeInformation.class),
    @JsonSubTypes.Type(value = AssetAdministrationShell.class),
    @JsonSubTypes.Type(value = ConceptDescription.class),
    @JsonSubTypes.Type(value = SubmodelElement.class)
})
public interface HasDataSpecificationMixin {

    // TODO: embeddedDataSpecification are unclear until now for 3.0.RC02

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification")
    List<DataSpecification> getEmbeddedDataSpecifications();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification")
    void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications);
}
