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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

public class OperationSerializer extends ValueSerializer<Operation> {

  @Override
  public void serialize(Operation operation, JsonGenerator gen, SerializationContext serializers)
      throws tools.jackson.core.JacksonException {
    gen.writeStartObject();
    writeWrappedList(gen, serializers, "extensions", "extension", operation.getExtensions());
    if (operation.getCategory() != null) {
      gen.writeStringProperty("category", operation.getCategory());
    }
    if (operation.getIdShort() != null) {
      gen.writeStringProperty("idShort", operation.getIdShort());
    }
    List<LangStringNameType> displayName = operation.getDisplayName();
    if (displayName != null && !displayName.isEmpty()) {
      gen.writeName("displayName");
      new LangStringsNameTypeSerializer().serialize(displayName, gen, serializers);
    }
    List<LangStringTextType> description = operation.getDescription();
    if (description != null && !description.isEmpty()) {
      gen.writeName("description");
      new LangStringsTextTypeSerializer().serialize(description, gen, serializers);
    }
    if (operation.getSemanticId() != null) {
      gen.writeName("semanticId");
      serializers
          .findValueSerializer(operation.getSemanticId().getClass())
          .serialize(operation.getSemanticId(), gen, serializers);
    }
    writeWrappedList(
        gen,
        serializers,
        "supplementalSemanticIds",
        "reference",
        operation.getSupplementalSemanticIds());
    writeWrappedList(gen, serializers, "qualifiers", "qualifier", operation.getQualifiers());
    writeWrappedList(
        gen,
        serializers,
        "embeddedDataSpecifications",
        "embeddedDataSpecification",
        operation.getEmbeddedDataSpecifications());

    List<OperationVariable> inputVariables = operation.getInputVariables();
    if (inputVariables != null && !inputVariables.isEmpty()) {
      serializeOperationVariable(gen, serializers, inputVariables, "inputVariables");
    }

    List<OperationVariable> outputVariables = operation.getOutputVariables();
    if (outputVariables != null && !outputVariables.isEmpty()) {
      serializeOperationVariable(gen, serializers, outputVariables, "outputVariables");
    }

    List<OperationVariable> inoutputVariables = operation.getInoutputVariables();
    if (inoutputVariables != null && !inoutputVariables.isEmpty()) {
      serializeOperationVariable(gen, serializers, inoutputVariables, "inoutputVariables");
    }

    gen.writeEndObject();
  }

  private static void serializeOperationVariable(
      JsonGenerator gen,
      SerializationContext serializers,
      List<OperationVariable> inputVariables,
      String variableType)
      throws tools.jackson.core.JacksonException {
    gen.writeName(variableType);
    gen.writeStartObject();
    gen.writeArrayPropertyStart("operationVariable");
    for (OperationVariable var : inputVariables) {
      serializers.findValueSerializer(var.getClass()).serialize(var, gen, serializers);
    }
    gen.writeEndArray();
    gen.writeEndObject();
  }

  private static <T> void writeWrappedList(
      JsonGenerator gen,
      SerializationContext serializers,
      String wrapperName,
      String itemName,
      List<T> values)
      throws tools.jackson.core.JacksonException {
    if (values == null || values.isEmpty()) {
      return;
    }
    gen.writeName(wrapperName);
    gen.writeStartObject();
    gen.writeArrayPropertyStart(itemName);
    for (T value : values) {
      serializers.findValueSerializer(value.getClass()).serialize(value, gen, serializers);
    }
    gen.writeEndArray();
    gen.writeEndObject();
  }
}
