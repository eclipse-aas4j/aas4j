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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Collection;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import tools.jackson.databind.cfg.MapperConfig;
import tools.jackson.databind.introspect.Annotated;
import tools.jackson.databind.introspect.AnnotatedClass;
import tools.jackson.databind.introspect.AnnotatedMethod;
import tools.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector;

/**
 * This class helps to dynamically decide how to de-/serialize classes and properties defined in the
 * AAS model library. It will automatically add a default namespace to property names and set a
 * default property order for contained elements.
 *
 * <p>Will also add @JsonInclude(JsonInclude.Include.NON_EMPTY) to all getter methods returning any
 * type of Collection&lt;?&gt; defined in the AAS model
 */
public class XmlDataformatAnnotationIntrospector extends JacksonXmlAnnotationIntrospector {
  private static final long serialVersionUID = 1L;

  private static final String GETTER_PREFIX = "get";
  protected String myDefaultNamespace = "";

  public XmlDataformatAnnotationIntrospector() {
    super();
    myDefaultNamespace = AasXmlNamespaceContext.AAS_URI;
  }

  @Override
  public String findNamespace(MapperConfig<?> config, Annotated ann) {
    String ns = super.findNamespace(config, ann);
    if (ns == null) {
      return myDefaultNamespace;
    } else {
      return ns;
    }
  }

  @Override
  public String[] findSerializationPropertyOrder(MapperConfig<?> config, AnnotatedClass ac) {
    String[] order = super.findSerializationPropertyOrder(config, ac);
    if (order == null) {
      order =
          new String[] {
            "extensions",
            "idShort",
            "displayName",
            "category",
            "description",
            "administration",
            "identification",
            "kind",
            "semanticId",
            "qualifiers",
            "embeddedDataSpecifications",
            "dataSpecifications",
            "isCaseOf",
            "security",
            "derivedFrom",
            "submodels",
            "assetInformation",
            "views",
            "externalSubjectId",
            "key",
            "allowDuplicates",
            "ordered",
            "valueId",
            "value",
            "max",
            "min",
            "type",
            "valueType",
            "mimeType",
            "first",
            "second",
            "annotations",
            "revision",
            "version",
            "defaultThumbnail",
            "globalAssetId",
            "externalAssetId",
            "entityType",
            "statements",
            "assetKind",
            "billOfMaterials",
            "specificAssetIds",
            "observed",
            "inoutputVariables",
            "inputVariables",
            "outputVariables",
            "submodelElements",
            "containedElements"
          };
    }
    return order;
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
