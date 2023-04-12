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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization;

import java.io.IOException;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIEC61360;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

/**
 * 
 * @author schnicke
 *
 */
public class LangStringsDefinitionTypeIEC61360Serializer extends NoEntryWrapperListSerializer<LangStringDefinitionTypeIEC61360> {

	private LangStringDefinitionTypeIEC61360Serializer ser = new LangStringDefinitionTypeIEC61360Serializer();

	@Override
	public void serialize(List<LangStringDefinitionTypeIEC61360> langStrings, JsonGenerator gen, SerializerProvider serializers) throws IOException {

		ToXmlGenerator xgen = (ToXmlGenerator) gen;
		xgen.writeStartObject();
		for (LangStringDefinitionTypeIEC61360 element : langStrings) {
			ReflectionHelper.setEmptyListsToNull(element); // call is needed to prevent empty tags (e.g. statements.size=0 leads to
															// <statements />, which is not allowed according to the schema
			xgen.writeFieldName(SubmodelElementManager.getXmlName(element.getClass()));
			ser.serialize(element, xgen, serializers);
		}
		xgen.writeEndObject();

	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<List<LangStringDefinitionTypeIEC61360>> handledType() {
		return (Class<List<LangStringDefinitionTypeIEC61360>>) (Object) List.class;
	}

}