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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;

public class OperationDeserializer extends JsonDeserializer<Operation> {

  @Override
  public Operation deserialize(JsonParser parser, DeserializationContext deserializationContext)
      throws IOException, JacksonException {
    ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
    JsonNode embeddedDataSpecificationsNode = node.get("embeddedDataSpecifications");
    JsonNode extensionsNode = node.get("extensions");
    JsonNode semanticIdNode = node.get("semanticId");
    JsonNode supplementalSemanticIdsNode = node.get("supplementalSemanticIds");
    JsonNode inoutputVariablesNode = node.get("inoutputVariables");
    JsonNode inputVariablesNode = node.get("inputVariables");
    JsonNode outputVariablesNode = node.get("outputVariables");
    JsonNode qualifiersNode = node.get("qualifiers");
    JsonNode categoryNode = node.get("category");
    JsonNode descriptionNode = node.get("description");
    JsonNode displayNameNode = node.get("displayName");
    JsonNode idShortNode = node.get("idShort");
    DefaultOperation.Builder builder = new DefaultOperation.Builder();
    List<EmbeddedDataSpecification> embeddedDataSpecifications =
        readWrappedList(
            parser,
            embeddedDataSpecificationsNode,
            "embeddedDataSpecification",
            EmbeddedDataSpecification.class);
    if (embeddedDataSpecifications != null) {
      builder.embeddedDataSpecifications(embeddedDataSpecifications);
    }

    List<Extension> extensions =
        readWrappedList(parser, extensionsNode, "extension", Extension.class);
    if (extensions != null) {
      builder.extensions(extensions);
    }

    List<Reference> supplementalSemanticIds =
        readWrappedList(parser, supplementalSemanticIdsNode, "reference", Reference.class);
    if (supplementalSemanticIds != null) {
      builder.supplementalSemanticIds(supplementalSemanticIds);
    }

    List<OperationVariable> inoutputVariables =
        readWrappedList(
            parser, inoutputVariablesNode, "operationVariable", OperationVariable.class);
    if (inoutputVariables != null) {
      builder.inoutputVariables(inoutputVariables);
    }

    List<OperationVariable> inputVariables =
        readWrappedList(parser, inputVariablesNode, "operationVariable", OperationVariable.class);
    if (inputVariables != null) {
      builder.inputVariables(inputVariables);
    }

    List<OperationVariable> outputVariables =
        readWrappedList(parser, outputVariablesNode, "operationVariable", OperationVariable.class);
    if (outputVariables != null) {
      builder.outputVariables(outputVariables);
    }

    List<Qualifier> qualifiers =
        readWrappedList(parser, qualifiersNode, "qualifier", Qualifier.class);
    if (qualifiers != null) {
      builder.qualifiers(qualifiers);
    }

    if (categoryNode != null) {
      builder.category(categoryNode.asText());
    }

    List<LangStringTextType> description =
        readWrappedList(parser, descriptionNode, "langStringTextType", LangStringTextType.class);
    if (description != null) {
      builder.description(description);
    }

    List<LangStringNameType> displayName =
        readWrappedList(parser, displayNameNode, "langStringNameType", LangStringNameType.class);
    if (displayName != null) {
      builder.displayName(displayName);
    }

    if (idShortNode != null) {
      builder.idShort(idShortNode.asText());
    }

    if (semanticIdNode != null && !semanticIdNode.isNull()) {
      builder.semanticId(
          DeserializationHelper.createInstanceFromNode(parser, semanticIdNode, Reference.class));
    }
    return builder.build();
  }

  private static <T> List<T> readWrappedList(
      JsonParser parser, JsonNode wrapperNode, String itemName, Class<T> clazz) throws IOException {
    if (wrapperNode == null || wrapperNode.isNull()) {
      return null;
    }
    JsonNode itemsNode = unwrapListNode(wrapperNode, itemName);
    if (itemsNode == null || itemsNode.isNull()) {
      return null;
    }
    if (itemsNode.isArray()) {
      return DeserializationHelper.createInstancesFromArrayNode(
          parser, (ArrayNode) itemsNode, clazz);
    }
    List<T> values = new ArrayList<>();
    values.add(DeserializationHelper.createInstanceFromNode(parser, itemsNode, clazz));
    return values;
  }

  private static JsonNode unwrapListNode(JsonNode wrapperNode, String itemName) {
    if (wrapperNode == null || wrapperNode.isNull()) {
      return null;
    }
    if (wrapperNode.isArray()) {
      return wrapperNode;
    }
    if (wrapperNode.isObject()) {
      JsonNode itemNode = wrapperNode.get(itemName);
      return itemNode != null ? itemNode : wrapperNode;
    }
    return null;
  }
}
