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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class helps to dynamically decide how to de-/serialize classes and
 * properties defined in the AAS model library.
 *
 * This is equivalent to adding the following annotations
 * <ul>
 * <li> to all interfaces defined in the AAS model:
 * <ul>
 * <li> @JsonTypeName([interface name])
 * <li> @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
 * <li> @JsonSubTypes({
 *
 * \@Type(value = [sub-interface].class, name = "[sub-interface name]"), ...})
 * for each sub-interface
 * </ul>
 * <li> to all getter methods returning any type of Collection&lt;?&gt; defined in the
 * AAS model:
 * <ul>
 *     <li>@JsonInclude(JsonInclude.Include.NON_EMPTY)</li>
 * </ul>
 * </ul>
 */
public class ReflectionAnnotationIntrospector extends JacksonAnnotationIntrospector {

    private static final long serialVersionUID = 1L;

    private static final String MODEL_TYPE_PROPERTY = "modelType";
    private static final String GETTER_PREFIX = "get";

    @Override
    public String findTypeName(AnnotatedClass ac) {
        String customType = ReflectionHelper.getModelType(ac.getRawType());
        return customType != null
                ? customType
                : super.findTypeName(ac);
    }

    @Override
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> config, AnnotatedClass ac, JavaType baseType) {
        String modelType = ReflectionHelper.getModelType(ac.getRawType());
        if (modelType != null) {
            TypeResolverBuilder<?> result = _constructStdTypeResolverBuilder();
            result = result.init(JsonTypeInfo.Id.NAME, null);
            result.inclusion(JsonTypeInfo.As.PROPERTY);
            result.typeProperty(MODEL_TYPE_PROPERTY);
            result.typeIdVisibility(false);
            return result;
        }
        return super.findTypeResolver(config, ac, baseType);
    }

    @Override
    public List<NamedType> findSubtypes(Annotated a) {
        if (ReflectionHelper.SUBTYPES.containsKey(a.getRawType()) && !ReflectionHelper.SUBTYPES.get(a.getRawType()).isEmpty()) {
            return ReflectionHelper.SUBTYPES.get(a.getRawType()).stream()
                    .map(x -> new NamedType(x, x.getSimpleName()))
                    .collect(Collectors.toList());
        }
        return super.findSubtypes(a);
    }

    @Override
    public JsonInclude.Value findPropertyInclusion(Annotated a) {
        JsonInclude.Value result = super.findPropertyInclusion(a);
        if (result != JsonInclude.Value.empty()) {
            return result;
        }
        if (AnnotatedMethod.class.isAssignableFrom(a.getClass())) {
            AnnotatedMethod method = (AnnotatedMethod) a;
            if (method.getParameterCount() == 0
                    && method.getName().startsWith(GETTER_PREFIX)
                    && Collection.class.isAssignableFrom(method.getRawReturnType())
                    && ReflectionHelper.isModelInterfaceOrDefaultImplementation(method.getDeclaringClass())) {
                return result.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return result;
    }

}
