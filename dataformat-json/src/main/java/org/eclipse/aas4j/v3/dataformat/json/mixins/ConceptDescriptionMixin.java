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
package org.eclipse.aas4j.v3.dataformat.json.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import org.eclipse.aas4j.v3.model.Reference;
import java.util.List;

public interface ConceptDescriptionMixin {

    @JsonProperty("isCaseOf")
    public List<Reference> getIsCaseOfs();

    @JsonProperty("isCaseOf")
    public void setIsCaseOfs(List<Reference> isCaseOfs);
//
//    @JsonProperty("embeddedDataSpecifications")
//    public List<DataSpecification> getEmbeddedDataSpecifications();
//
//    @JsonProperty("embeddedDataSpecifications")
//    @JsonDeserialize(using = DataSpecificationDeserializer.class)

    // TODO public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications);
}
