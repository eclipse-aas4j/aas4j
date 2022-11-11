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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

public class SubmodelElementsDeserializer extends JsonDeserializer<List<SubmodelElement>> {

    private SubmodelElementDeserializer deserializer = new SubmodelElementDeserializer();

    public SubmodelElementsDeserializer(SubmodelElementDeserializer deserializer) {
        this.deserializer = deserializer;
    }

    public SubmodelElementsDeserializer() {
    }

    @Override
    public List<SubmodelElement> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
        if (treeNode instanceof TextNode) {
            return Collections.emptyList();
        } else {
            return createSubmodelElements(parser, ctxt, treeNode);
        }
    }

    private List<SubmodelElement> createSubmodelElements(JsonParser parser, DeserializationContext ctxt, TreeNode treeNode) throws IOException, JsonProcessingException {
//        JsonNode nodeSubmodelElement = getSubmodelElementsNode(treeNode);
        if (treeNode.isArray()) {
            return getSubmodelElementsFromArrayNode(parser, ctxt, (ArrayNode) treeNode);
        } else {
            return getSubmodelElementsFromObjectNode(parser, ctxt, (JsonNode) treeNode);
        }
    }

    private List<SubmodelElement> getSubmodelElementsFromObjectNode(JsonParser parser, DeserializationContext ctxt, JsonNode nodeSubmodelElement) throws IOException, JsonProcessingException {

        Iterator<String> iter = nodeSubmodelElement.fieldNames();
        List<SubmodelElement> submodelElements = new ArrayList<SubmodelElement>();

        while(iter.hasNext()) {
            String submodelElementName = iter.next();
            final ObjectMapper mapper = new ObjectMapper();
            final ObjectNode node = mapper.createObjectNode();
            node.set(submodelElementName, nodeSubmodelElement.get(submodelElementName));
            if (nodeSubmodelElement.get(submodelElementName).isArray()) {
                ArrayNode arrayNode = (ArrayNode) nodeSubmodelElement.get(submodelElementName);
                for (int i = 0; i < arrayNode.size(); i++) {
                    final ObjectNode nodeElement = mapper.createObjectNode();
                    nodeElement.set(submodelElementName, arrayNode.get(i));
                    submodelElements.add(getSubmodelElementFromJsonNode(parser, ctxt, nodeElement));
                }
            } else {
                SubmodelElement elem = getSubmodelElementFromJsonNode(parser, ctxt, node);
                submodelElements.add(elem);
            }
        }

        return submodelElements;
    }

    private JsonNode getSubmodelElementsNode(TreeNode temp) {
        ObjectNode objNode = (ObjectNode) temp;
        JsonNode nodeSubmodelElement = objNode.get("submodelElement"); // TODO: most likely the node will have the name of a SME subclass, e.g. "property" and not "submodelElement"
        return nodeSubmodelElement;
    }

    private List<SubmodelElement> getSubmodelElementsFromArrayNode(JsonParser parser, DeserializationContext ctxt, ArrayNode arrayNode) throws IOException, JsonProcessingException {
        List<SubmodelElement> elements = new ArrayList<>();
        for (int i = 0; i < arrayNode.size(); i++) {
            JsonNode jsonNode = arrayNode.get(i);
            SubmodelElement elem = getSubmodelElementFromJsonNode(parser, ctxt, jsonNode);
            elements.add(elem);
        }
        return elements;
    }

    private SubmodelElement getSubmodelElementFromJsonNode(JsonParser parser, DeserializationContext ctxt, JsonNode nodeSubmodelElement) throws IOException, JsonProcessingException {
        JsonParser parserReference = parser.getCodec().getFactory().getCodec().treeAsTokens(nodeSubmodelElement);
        SubmodelElement elem = deserializer.deserialize(parserReference, ctxt);
        return elem;
    }

}
