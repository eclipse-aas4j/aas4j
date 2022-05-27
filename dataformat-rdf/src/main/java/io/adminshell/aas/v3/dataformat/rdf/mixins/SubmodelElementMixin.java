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
package io.adminshell.aas.v3.dataformat.rdf.mixins;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.rc02.model.*;
import io.adminshell.aas.v3.rc02.model.model.*;

@JsonTypeName("aas:SubmodelElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RelationshipElement.class),
    @JsonSubTypes.Type(value = DataElement.class),
    @JsonSubTypes.Type(value = File.class),
    @JsonSubTypes.Type(value = Event.class),
    @JsonSubTypes.Type(value = Capability.class),
    @JsonSubTypes.Type(value = Entity.class),
    @JsonSubTypes.Type(value = EventElement.class),
    @JsonSubTypes.Type(value = EventMessage.class),
    @JsonSubTypes.Type(value = Operation.class),
    @JsonSubTypes.Type(value = SubmodelElementCollection.class)
})
public interface SubmodelElementMixin extends ReferableMixin, QualifiableMixin, HasDataSpecificationMixin, HasKindMixin, HasSemanticsMixin {

}
