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
package org.eclipse.aas4j.v3.dataformat.aml.common.naming;

import com.google.common.reflect.TypeToken;
import org.eclipse.aas4j.v3.dataformat.core.util.MostSpecificTypeTokenComparator;
import org.eclipse.aas4j.v3.model.Referable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class AbstractClassNamingStrategy implements NamingStrategy {

    protected final boolean preferIdShort;
    protected Map<Object, String> cache = new HashMap<>();
    protected List<TypeSafeFunction> customNamings = new ArrayList<>();

    private class TypeSafeFunction<T> {

        public TypeSafeFunction(Class<T> inputType, BiFunction<T, String, String> provider) {
            this.inputType = TypeToken.of(inputType);
            this.provider = provider;
        }
        TypeToken inputType;
        BiFunction<T, String, String> provider;
    }

    public <T> void registerCustomNaming(Class<T> type, Function<T, String> provider) {
        customNamings.add(new TypeSafeFunction(type, (x, y) -> provider.apply((T) x)));
    }

    public <T> void registerCustomNaming(Class<T> type, BiFunction<T, String, String> provider) {
        customNamings.add(new TypeSafeFunction(type, provider));
    }

    private Optional<TypeSafeFunction> getCustomNaming(Type type) {
        return customNamings.stream()
                .filter(x -> x.inputType.isSupertypeOf(type))
                .sorted((x, y) -> Objects.compare(x.inputType, y.inputType, new MostSpecificTypeTokenComparator()))
                .findFirst();
    }

    protected AbstractClassNamingStrategy() {
        this(true);
    }

    protected AbstractClassNamingStrategy(boolean preferIdShort) {
        this.preferIdShort = preferIdShort;
    }

    @Override
    public String getName(Type type, Object obj, String property) {
        if (cache.containsKey(obj)) {
            return cache.get(obj);
        }
        String result = null;
        if (preferIdShort && Referable.class.isAssignableFrom(obj.getClass())) {
            Referable referable = (Referable) obj;
            if (referable.getIdShort() != null && !referable.getIdShort().isEmpty()) {
                result = referable.getIdShort();
            }
        }
        if (result == null) {
            Optional<TypeSafeFunction> customNaming = getCustomNaming(type);
            if (customNaming.isPresent()) {
                result = customNaming.get().provider.apply(obj, property).toString();
            }
        }
        if (result == null) {
            result = generateName(obj);
        }
        cache.put(obj, result);
        return result;
    }

    @Override
    public String getNameForRefSemantic(Type type, Object obj, String property) {
        return getName(type, obj, property);
    }

    protected abstract String generateName(Object obj);
}
