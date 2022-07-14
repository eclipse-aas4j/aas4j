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
package org.eclipse.aas4j.v3.rc02.dataformat.xml;

import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAnnotatedRelationshipElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultBasicEventElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultBlob;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultCapability;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultEntity;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultEventPayload;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultFile;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultOperation;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultOperationVariable;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultProperty;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultRange;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultReferenceElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultRelationshipElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodelElementCollection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        CLASS_TO_NAME.put(DefaultBasicEventElement.class, "basicEvent");
        CLASS_TO_NAME.put(DefaultEventPayload.class, "eventPayload");
        CLASS_TO_NAME.put(DefaultOperation.class, "operation");
        CLASS_TO_NAME.put(DefaultOperationVariable.class, "operationVariable");
        CLASS_TO_NAME.put(DefaultSubmodelElementCollection.class, "submodelElementCollection");
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
