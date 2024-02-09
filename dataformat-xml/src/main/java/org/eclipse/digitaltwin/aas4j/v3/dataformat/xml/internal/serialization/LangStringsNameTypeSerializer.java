/*
 * Copyright (c) 2023 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author schnicke
 *
 */
public class LangStringsNameTypeSerializer extends NoEntryWrapperListSerializer<LangStringNameType> {

	private AbstractLangStringSerializer<LangStringNameType> ser = new AbstractLangStringSerializer<>("langStringNameType");

	@Override
	public void serialize(List<LangStringNameType> langStrings, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		ToXmlGenerator xgen = (ToXmlGenerator) gen;
		xgen.writeStartObject();
		for (LangStringNameType element : langStrings) {
			List<Runnable> resetRunnables = ReflectionHelper.setEmptyListsToNull(element); // call is needed to prevent empty tags (e.g. statements.size=0 leads to
															// <statements />, which is not allowed according to the schema
			xgen.writeFieldName(SubmodelElementManager.getXmlName(element.getClass()));
			ser.serialize(element, xgen, serializers);
			resetRunnables.stream().forEach(r -> r.run());
		}
		xgen.writeEndObject();

	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<List<LangStringNameType>> handledType() {
		return (Class<List<LangStringNameType>>) (Object) List.class;
	}

}