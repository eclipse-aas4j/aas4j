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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.io.IOException;
import java.util.List;

public class OperationSerializer extends JsonSerializer<Operation> {

    @Override
    public void serialize(Operation operation, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        if (operation.getCategory() != null) {
            gen.writeStringField("category", operation.getCategory());
        }
        if (operation.getIdShort() != null) {
            gen.writeStringField("idShort", operation.getIdShort());
        }
        List<LangStringTextType> description = operation.getDescription();
        if (description != null && !description.isEmpty()) {
            if (description.size() == 1) {
                gen.writeFieldName("description");
                gen.writeStartObject();
                gen.writeFieldName("langStringTextType");
                serializers.defaultSerializeValue(description.get(0), gen);
                gen.writeEndObject();
            } else {
                gen.writeArrayFieldStart("description");
                gen.writeStartObject();
                for (LangStringTextType desc : description) {
                    gen.writeFieldName("langStringTextType");
                    serializers.defaultSerializeValue(desc, gen);
                }
                gen.writeEndObject();
                gen.writeEndArray();
            }
        }
        if (operation.getSemanticId() != null) {
            gen.writeFieldName("semanticId");
            serializers.defaultSerializeValue(operation.getSemanticId(), gen);
        }

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


        List<EmbeddedDataSpecification> edsList = operation.getEmbeddedDataSpecifications();
        if (edsList != null && !edsList.isEmpty()) {
            if (edsList.size() == 1) {
                gen.writeFieldName("embeddedDataSpecification");
                serializers.defaultSerializeValue(edsList.get(0), gen);
            } else {
                gen.writeArrayFieldStart("embeddedDataSpecification");
                for (EmbeddedDataSpecification eds : edsList) {
                    serializers.defaultSerializeValue(eds, gen);
                }
                gen.writeEndArray();
            }
        }

        // extensions
        List<Extension> extensions = operation.getExtensions();
        if (extensions != null && !extensions.isEmpty()) {
            if (extensions.size() == 1) {
                gen.writeFieldName("extensions");
                serializers.defaultSerializeValue(extensions.get(0), gen);
            } else {
                gen.writeArrayFieldStart("extensions");
                for (Extension ext : extensions) {
                    serializers.defaultSerializeValue(ext, gen);
                }
                gen.writeEndArray();
            }
        }

        // supplementalSemanticIds
        List<Reference> suppSemanticIds = operation.getSupplementalSemanticIds();
        if (suppSemanticIds != null && !suppSemanticIds.isEmpty()) {
            if (suppSemanticIds.size() == 1) {
                gen.writeFieldName("supplementalSemanticIds");
                serializers.defaultSerializeValue(suppSemanticIds.get(0), gen);
            } else {
                gen.writeArrayFieldStart("supplementalSemanticIds");
                for (Reference ref : suppSemanticIds) {
                    serializers.defaultSerializeValue(ref, gen);
                }
                gen.writeEndArray();
            }
        }

        // qualifiers
        List<Qualifier> qualifiers = operation.getQualifiers();
        if (qualifiers != null && !qualifiers.isEmpty()) {
            if (qualifiers.size() == 1) {
                gen.writeFieldName("qualifiers");
                serializers.defaultSerializeValue(qualifiers.get(0), gen);
            } else {
                gen.writeArrayFieldStart("qualifiers");
                for (Qualifier qualifier : qualifiers) {
                    serializers.defaultSerializeValue(qualifier, gen);
                }
                gen.writeEndArray();
            }
        }

        // displayName
        List<LangStringNameType> displayName = operation.getDisplayName();
        if (displayName != null && !displayName.isEmpty()) {
            if (displayName.size() == 1) {
                gen.writeFieldName("displayName");
                serializers.defaultSerializeValue(displayName.get(0), gen);
            } else {
                gen.writeArrayFieldStart("displayName");
                for (LangStringNameType dn : displayName) {
                    serializers.defaultSerializeValue(dn, gen);
                }
                gen.writeEndArray();
            }
        }

        gen.writeEndObject();
    }

    private static void serializeOperationVariable(JsonGenerator gen, SerializerProvider serializers, List<OperationVariable> inputVariables, String variableType) throws IOException {
        gen.writeFieldName(variableType);
        gen.writeStartObject();
        gen.writeArrayFieldStart("operationVariable");
        for (OperationVariable var : inputVariables) {
            serializers.defaultSerializeValue(var, gen);
        }
        gen.writeEndArray();
        gen.writeEndObject();
    }
}
