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
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import tools.jackson.databind.cfg.MapperConfig;
import tools.jackson.databind.introspect.Annotated;
import tools.jackson.databind.introspect.AnnotatedClass;
import tools.jackson.databind.introspect.AnnotatedMethod;
import tools.jackson.databind.introspect.JacksonAnnotationIntrospector;
import tools.jackson.databind.jsontype.NamedType;
import tools.jackson.databind.jsontype.impl.StdTypeResolverBuilder;

/**
 * This class helps to dynamically decide how to de-/serialize classes and properties defined in the
 * AAS model library.
 *
 * <p>This is equivalent to adding the following annotations
 *
 * <ul>
 *   <li>to all interfaces defined in the AAS model:
 *       <ul>
 *         <li>@JsonTypeName([interface name])
 *         <li>@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
 *         <li>@JsonSubTypes({
 *             <p>\@Type(value = [sub-interface].class, name = "[sub-interface name]"), ...}) for
 *             each sub-interface
 *       </ul>
 *   <li>to all getter methods returning any type of Collection&lt;?&gt; defined in the AAS model:
 *       <ul>
 *         <li>@JsonInclude(JsonInclude.Include.NON_EMPTY)
 *       </ul>
 * </ul>
 */
public class ReflectionAnnotationIntrospector extends JacksonAnnotationIntrospector {

  private static final long serialVersionUID = 1L;

  private static final String MODEL_TYPE_PROPERTY = "modelType";
  private static final String GETTER_PREFIX = "get";

  @Override
  public String findTypeName(MapperConfig<?> config, AnnotatedClass ac) {
    String customType = ReflectionHelper.getModelType(ac.getRawType());
    return customType != null ? customType : super.findTypeName(config, ac);
  }

  @Override
  public Object findTypeResolverBuilder(MapperConfig<?> config, Annotated ac) {
    if (ac instanceof AnnotatedClass) {
      String modelType = ReflectionHelper.getModelType(ac.getRawType());
      if (modelType != null) {
        JsonTypeInfo.Value typeInfoValue =
            JsonTypeInfo.Value.construct(
                JsonTypeInfo.Id.NAME,
                JsonTypeInfo.As.PROPERTY,
                MODEL_TYPE_PROPERTY,
                null,
                false,
                null);
        return new StdTypeResolverBuilder(typeInfoValue);
      }
    }
    return super.findTypeResolverBuilder(config, ac);
  }

  @Override
  public List<NamedType> findSubtypes(MapperConfig<?> config, Annotated a) {
    if (ReflectionHelper.SUBTYPES.containsKey(a.getRawType())
        && !ReflectionHelper.SUBTYPES.get(a.getRawType()).isEmpty()) {
      return ReflectionHelper.SUBTYPES.get(a.getRawType()).stream()
          .map(x -> new NamedType(x, x.getSimpleName()))
          .collect(Collectors.toList());
    }
    return super.findSubtypes(config, a);
  }

  @Override
  public JsonInclude.Value findPropertyInclusion(MapperConfig<?> config, Annotated a) {
    JsonInclude.Value result = super.findPropertyInclusion(config, a);
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
