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

import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;

/**
 * ReferenceElement is serialized as ${ReferenceElement/idShort}: ${ReferenceElement/value} where
 * ${ReferenceElement/value} is the serialization of the Reference class.
 */
public class ReferenceElementMapper extends AbstractMapper<ReferenceElement> {
    ReferenceElementMapper(ReferenceElement element, String idShortPath) {
        super(element, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        return serializer.toJson(element.getValue());
    }
}
