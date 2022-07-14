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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.common.naming;

import com.google.common.reflect.TypeToken;
import org.eclipse.aas4j.v3.rc02.dataformat.core.util.MostSpecificTypeTokenComparator;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PropertyNamingStrategy implements NamingStrategy {

    protected List<TypeSafeFunction> customNamings = new ArrayList<>();

    protected class TypeSafeFunction<T> {

        public TypeSafeFunction(Class<T> inputType, BiFunction<T, String, String> nameProvider, BiFunction<T, String, String> refSemanticProvider, String oldName, String newName) {
            this.inputType = TypeToken.of(inputType);
            this.nameProvider = nameProvider;
            this.refSemanticProvider = refSemanticProvider;
            this.oldName = oldName;
            this.newName = newName;
        }

        public TypeSafeFunction(Class<T> inputType, BiFunction<T, String, String> nameProvider, BiFunction<T, String, String> refSemanticProvider) {
            this.inputType = TypeToken.of(inputType);
            this.nameProvider = nameProvider;
            this.refSemanticProvider = refSemanticProvider;
        }

        TypeToken inputType;
        BiFunction<T, String, String> nameProvider;
        BiFunction<T, String, String> refSemanticProvider;
        String oldName;
        String newName;
    }

    public <T> void registerCustomNaming(Class<T> type,
            BiFunction<T, String, String> nameProvider) {
        customNamings.add(new TypeSafeFunction(type, nameProvider, nameProvider));
    }

    public <T> void registerCustomNaming(Class<T> type,
            BiFunction<T, String, String> nameProvider,
            BiFunction<T, String, String> refSemanticProvider) {
        customNamings.add(new TypeSafeFunction(type, nameProvider, refSemanticProvider));
    }

    public void registerCustomNaming(Class<?> type,
            String oldName,
            String newName) {
        customNamings.add(new TypeSafeFunction(type,
                (obj, property) -> Objects.equals(oldName, property) ? newName : null,
                (obj, property) -> Objects.equals(oldName, property) ? newName : null,
                oldName, newName));
    }

    public void registerCustomNaming(Class<?> type,
            String oldName,
            String newName,
            String newRefSemantic) {
        customNamings.add(new TypeSafeFunction(type,
                (obj, property) -> Objects.equals(oldName, property) ? newName : null,
                (obj, property) -> Objects.equals(oldName, property) ? newRefSemantic : null,
                oldName,newName));
    }

    public <T> void registerCustomNaming(Class<T> type,
            Function<T, String> nameProvider) {
        customNamings.add(new TypeSafeFunction(type,
                (x, y) -> nameProvider.apply((T) x),
                (x, y) -> nameProvider.apply((T) x)));
    }

    public <T> void registerCustomNaming(Class<T> type,
            Function<T, String> nameProvider,
            Function<T, String> refSemanticProvider) {
        customNamings.add(new TypeSafeFunction(type,
                (x, y) -> nameProvider.apply((T) x),
                (x, y) -> refSemanticProvider.apply((T) x)));
    }

    private List<TypeSafeFunction> getCustomNaming(Type type, String property) {
        return customNamings.stream()
                .filter(x -> x.inputType.isSupertypeOf(type))
                .sorted((x, y) -> Objects.compare(x.inputType, y.inputType, new MostSpecificTypeTokenComparator()))
                .collect(Collectors.toList());
    }

    public String getOldName(Type type, Object obj, String property){
       TypeSafeFunction typeSafeFunction = customNamings.stream()
               .filter(x -> x.inputType.isSupertypeOf(type) && x.newName.equalsIgnoreCase(property))
               .findFirst()
               .orElse(null);
       if(typeSafeFunction==null)return null;
       return typeSafeFunction.oldName;
    }

    @Override
    public String getName(Type type, Object obj, String property) {
        for (TypeSafeFunction customNaming : getCustomNaming(type, property)) {
            String result = (String) customNaming.nameProvider.apply(obj, property);
            if (result != null) {
                return result;
            }
        }
        return property;
    }

    @Override
    public String getNameForRefSemantic(Type type, Object obj, String property) {
        for (TypeSafeFunction customNaming : getCustomNaming(type, property)) {
            String result = (String) customNaming.refSemanticProvider.apply(obj, property);
            if (result != null) {
                return result;
            }
        }
        return property;
    }

}
