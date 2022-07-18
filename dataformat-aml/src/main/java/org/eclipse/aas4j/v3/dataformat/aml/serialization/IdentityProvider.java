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
package org.eclipse.aas4j.v3.dataformat.aml.serialization;

import org.eclipse.aas4j.v3.dataformat.aml.serialization.id.IdGenerator;
import java.util.HashMap;
import java.util.Map;

public class IdentityProvider {

    private final Map<Object, String> cache;
    private final IdGenerator idGenerator;

    public IdentityProvider(IdGenerator idGenerator) {
        this.cache = new HashMap<>();
        this.idGenerator = idGenerator;
    }

    public String getCachedId(Object obj) {
        if (cache.containsKey(obj)) {
            return cache.get(obj);
        }
        String result = generateId();
        cache.put(obj, result);
        return result;
    }

    public String generateId() {
        String result = null;
        do {
            result = idGenerator.next();
        } while (cache.values().contains(result));
        return result;
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }
}
