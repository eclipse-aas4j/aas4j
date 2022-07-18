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
package org.eclipse.aas4j.v3.dataformat.rdf.mixins;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.aas4j.v3.model.Reference;

@JsonTypeName("aas:RelationshipElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElementMixin extends SubmodelElementMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    Reference getFirst();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    void setFirst(Reference first);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    Reference getSecond();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    void setSecond(Reference second);
}
