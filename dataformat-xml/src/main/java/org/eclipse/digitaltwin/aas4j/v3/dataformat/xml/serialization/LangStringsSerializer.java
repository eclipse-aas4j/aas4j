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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;

import java.io.IOException;
import java.util.List;

public class LangStringsSerializer extends NoEntryWrapperListSerializer<LangString> {

    private LangStringSerializer ser = new LangStringSerializer();

    @Override
    public void serialize(List<LangString> langStrings, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        ToXmlGenerator xgen = (ToXmlGenerator) gen;
        xgen.writeStartObject();
        for (LangString element : langStrings) {
            ReflectionHelper.setEmptyListsToNull(element); // call is needed to prevent empty tags (e.g. statements.size=0 leads to <statements />, which is not allowed according to the schema
            xgen.writeFieldName(SubmodelElementManager.getXmlName(element.getClass()));
            ser.serialize(element, xgen, serializers);
        }
        xgen.writeEndObject();

    }

    @Override
    public Class<List<LangString>> handledType() {
        return (Class<List<LangString>>)(Object)List.class;
    }

}