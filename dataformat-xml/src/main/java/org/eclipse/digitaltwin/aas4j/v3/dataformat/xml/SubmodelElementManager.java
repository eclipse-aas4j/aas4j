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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultCapability;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEventPayload;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringShortNameTypeIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;

public class SubmodelElementManager {

    public static Map<Class<?>, String> CLASS_TO_NAME = new HashMap<>();
    public static Map<String, Class<?>> NAME_TO_CLASS = new HashMap<>();

    static {
        CLASS_TO_NAME.put(DefaultAnnotatedRelationshipElement.class, "annotatedRelationshipElement");
        CLASS_TO_NAME.put(DefaultRelationshipElement.class, "relationshipElement");
        CLASS_TO_NAME.put(DefaultReferenceElement.class, "referenceElement");
        CLASS_TO_NAME.put(DefaultProperty.class, "property");
        CLASS_TO_NAME.put(DefaultFile.class, "file");
        CLASS_TO_NAME.put(DefaultBlob.class, "blob");
        CLASS_TO_NAME.put(DefaultRange.class, "range");
        CLASS_TO_NAME.put(DefaultMultiLanguageProperty.class, "multiLanguageProperty");
        CLASS_TO_NAME.put(DefaultCapability.class, "capability");
        CLASS_TO_NAME.put(DefaultEntity.class, "entity");
        CLASS_TO_NAME.put(DefaultBasicEventElement.class, "basicEventElement");
        CLASS_TO_NAME.put(DefaultEventPayload.class, "eventPayload");
        CLASS_TO_NAME.put(DefaultOperation.class, "operation");
        CLASS_TO_NAME.put(DefaultOperationVariable.class, "operationVariable");
		CLASS_TO_NAME.put(DefaultLangStringTextType.class, "langStringTextType");
		CLASS_TO_NAME.put(DefaultLangStringNameType.class, "langStringNameType");
		CLASS_TO_NAME.put(DefaultLangStringDefinitionTypeIEC61360.class, "langStringDefinitionTypeIEC61360");
		CLASS_TO_NAME.put(DefaultLangStringPreferredNameTypeIEC61360.class, "langStringPreferredNameTypeIEC61360");
		CLASS_TO_NAME.put(DefaultLangStringShortNameTypeIEC61360.class, "langStringShortNameTypeIEC61360");
        CLASS_TO_NAME.put(DefaultSubmodelElementCollection.class, "submodelElementCollection");
        CLASS_TO_NAME.put(DefaultSubmodelElementList.class, "submodelElementList");
        NAME_TO_CLASS = CLASS_TO_NAME.entrySet().stream().collect(Collectors.toMap(x -> x.getValue(), x -> x.getKey()));
    }

    public static String getXmlName(Class<?> type) {
        return CLASS_TO_NAME.get(type);
    }

    public static Class<?> getClassByXmlName(String xmlName) {
        return NAME_TO_CLASS.get(xmlName);
    }

    private SubmodelElementManager() {
    }
}
