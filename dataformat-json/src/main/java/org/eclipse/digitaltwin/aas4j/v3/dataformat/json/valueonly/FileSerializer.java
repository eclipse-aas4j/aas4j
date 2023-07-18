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

/**
 * File is serialized as named JSON object with ${File/idShort} as the name of the containing JSON property. The JSON
 * object contains two JSON properties. The first refers to the content type named "contentType" and value
 * ${File/contentType}. The latter refers to the value named “value” and value ${File/value}. The resulting value-only
 * object is indistinguishable whether it contains File or Blob attributes. Therefore, the receiver needs to take the
 * type of the target resource into account. Since the receiver knows in advance if a File or a Blob SubmodelElement
 * shall be manipulated, it can parse the transferred value-only object accordingly as a File or Blob object.
 */
class FileSerializer extends AbstractSerializer<File> {

    FileSerializer(File file, String idShortPath) {
        super(file, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set("contentType", new TextNode(element.getContentType()));
        node.set("value", new TextNode(element.getValue()));
        return node;
    }
}
