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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonSerializer;

/**
 * The abstract base class for all value-only serializers.
 * @param <T> The type of the serialized elements.
 */
public abstract class AbstractMapper<T> {
    protected T element;
    protected String idShortPath;
    protected static JsonSerializer serializer = new JsonSerializer();

    /**
     *
     * @param element the submodel element that has to be serialized.
     * @param idShortPath the idShort path is a dot separated chain of idShorts, that can be used in case of
     * troubleshooting.
     */
    protected AbstractMapper(T element, String idShortPath) {
        this.element = element;
        this.idShortPath = idShortPath;
    }

    /**
     * This method serializes the corresponding element.
     * @return the corresponding JSON node.
     * @throws ValueOnlySerializationException with information about the idShort path.
     */
    public abstract JsonNode serialize() throws ValueOnlySerializationException;
}