/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2022 SAP SE
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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

public class OperationVariableDeserializer extends JsonDeserializer<List<OperationVariable>> {

  @Override
  public List<OperationVariable> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    JsonNode rootNode = parser.getCodec().readTree(parser);
    List<OperationVariable> result = new ArrayList<>();

    if (rootNode.isArray()) {
      for (JsonNode element : rootNode) {
        if (element.has("operationVariable")) {
          deserializeOperationVariable(parser, element, result);
        }
      }
    } else if (rootNode.isObject()) {
      if (!rootNode.has("operationVariable")) {
        return result;
      }
      deserializeOperationVariable(parser, rootNode, result);
    }

    return result;
  }

  private static void deserializeOperationVariable(
      JsonParser parser, JsonNode element, List<OperationVariable> result) throws IOException {
    JsonNode opVarNode = element.get("operationVariable");
    if (opVarNode.isArray()) {
      for (JsonNode inner : opVarNode) {
        OperationVariable opVar =
            DeserializationHelper.createInstanceFromNode(parser, inner, OperationVariable.class);
        result.add(opVar);
      }
    } else {
      OperationVariable opVar =
          DeserializationHelper.createInstanceFromNode(parser, opVarNode, OperationVariable.class);
      result.add(opVar);
    }
  }
}
