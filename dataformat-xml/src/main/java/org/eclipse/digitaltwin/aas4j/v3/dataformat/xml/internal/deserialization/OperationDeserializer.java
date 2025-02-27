/*
 * Copyright (c) 2025 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;

import java.io.IOException;
import java.util.List;

public class OperationDeserializer extends JsonDeserializer<Operation> {

    @Override
    public Operation deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        JsonNode embeddedDataSpecificationNode = node.get("embeddedDataSpecification");
        JsonNode extensions = node.get("extensions");
        JsonNode semanticId = node.get("semanticId");
        JsonNode supplementalSemanticIds = node.get("supplementalSemanticIds");
        JsonNode inoutputVariables = node.get("inoutputVariables");
        JsonNode inputVariables = node.get("inputVariables");
        JsonNode outputVariables = node.get("outputVariables");
        JsonNode qualifiers = node.get("qualifiers");
        JsonNode category = node.get("category");
        JsonNode description = node.get("description");
        JsonNode displayName = node.get("displayName");
        JsonNode idShort = node.get("idShort");
        DefaultOperation.Builder builder = new DefaultOperation.Builder();
        if(embeddedDataSpecificationNode.isArray()){
            builder.embeddedDataSpecifications(createEmbeddedDataSpecificationFromNodeArray(parser, (ArrayNode) embeddedDataSpecificationNode));
        }else{
            builder.embeddedDataSpecifications(DeserializationHelper.createInstanceFromNode(parser, embeddedDataSpecificationNode, EmbeddedDataSpecification.class));
        }
        if(extensions.isArray()){
            builder.extensions(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) extensions, Extension.class));
        }else{
            builder.extensions(DeserializationHelper.createInstanceFromNode(parser, extensions, Extension.class));
        }
        if(supplementalSemanticIds.isArray()){
            builder.supplementalSemanticIds(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) supplementalSemanticIds, Reference.class));
        }else{
            builder.supplementalSemanticIds(DeserializationHelper.createInstanceFromNode(parser, supplementalSemanticIds, Reference.class));
        }
        if(inoutputVariables.isArray()){
            builder.inoutputVariables(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) inoutputVariables, OperationVariable.class));
        }else{
            builder.inoutputVariables(DeserializationHelper.createInstanceFromNode(parser, inoutputVariables, OperationVariable.class));
        }
        if(inputVariables.isArray()){
            builder.inputVariables(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) inputVariables, OperationVariable.class));
        }else{
            builder.inputVariables(DeserializationHelper.createInstanceFromNode(parser, inputVariables, OperationVariable.class));
        }
        if(outputVariables.isArray()){
            builder.outputVariables(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) outputVariables, OperationVariable.class));
        }else{
            builder.outputVariables(DeserializationHelper.createInstanceFromNode(parser, outputVariables, OperationVariable.class));
        }
        if(qualifiers.isArray()){
            builder.qualifiers(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) qualifiers, Qualifier.class));
        }else{
            builder.qualifiers(DeserializationHelper.createInstanceFromNode(parser, qualifiers, Qualifier.class));
        }
        builder.category(category.asText());
        if(description.isArray()){
            builder.description(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) description, LangStringTextType.class));
        }else{
            builder.description(DeserializationHelper.createInstanceFromNode(parser, description, LangStringTextType.class));
        }
        if(displayName.isArray()){
            builder.displayName(DeserializationHelper.createInstancesFromArrayNode(parser, (ArrayNode) displayName, LangStringNameType.class));
        }else{
            builder.displayName(DeserializationHelper.createInstanceFromNode(parser, displayName, LangStringNameType.class));
        }
        builder.idShort(idShort.asText());
        builder.semanticId(DeserializationHelper.createInstanceFromNode(parser, semanticId, Reference.class));
        return builder.build();
    }
    private List<EmbeddedDataSpecification> createEmbeddedDataSpecificationFromNodeArray(JsonParser parser, ArrayNode content) throws IOException {
        return DeserializationHelper.createInstancesFromArrayNode(parser, content, EmbeddedDataSpecification.class);
    }
}
