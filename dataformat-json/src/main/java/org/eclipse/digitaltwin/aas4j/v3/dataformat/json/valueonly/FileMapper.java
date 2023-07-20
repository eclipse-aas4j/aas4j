/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.eclipse.digitaltwin.aas4j.v3.model.File;

import java.util.Base64;

/**
 * File is serialized as named JSON object with ${File/idShort} as the name of the containing JSON property. The JSON
 * object contains two JSON properties. The first refers to the content type named "contentType" and value
 * ${File/contentType}. The latter refers to the value named “value” and value ${File/value}. The resulting value-only
 * object is indistinguishable whether it contains File or Blob attributes. Therefore, the receiver needs to take the
 * type of the target resource into account. Since the receiver knows in advance if a File or a Blob SubmodelElement
 * shall be manipulated, it can parse the transferred value-only object accordingly as a File or Blob object.
 */
class FileMapper extends AbstractMapper<File> {
    private static final String CONTENT_TYPE = "contentType";
    private static final String VALUE = "value";

    FileMapper(File file, String idShortPath) {
        super(file, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set(CONTENT_TYPE, new TextNode(element.getContentType()));
        node.set(VALUE, new TextNode(element.getValue()));
        return node;
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        JsonNode contentNode = valueOnly.get(CONTENT_TYPE);
        if(contentNode == null || contentNode.isNull()) {
            element.setContentType(null);
        } else if(contentNode.isTextual()) {
            element.setContentType(contentNode.textValue());
        } else {
            throw new ValueOnlySerializationException(
                "Invalid File " + CONTENT_TYPE + " at idShort path '" + idShortPath + "'.", idShortPath);
        }

        JsonNode valueNode = valueOnly.get(VALUE);
        if(valueNode == null || valueNode.isNull()) {
            element.setValue(null);
        } else if(contentNode.isTextual()) {
            element.setValue(valueNode.textValue());
        } else {
            throw new ValueOnlySerializationException(
                "Invalid File " + VALUE + " at idShort path '" + idShortPath + "'.", idShortPath);
        }
    }
}