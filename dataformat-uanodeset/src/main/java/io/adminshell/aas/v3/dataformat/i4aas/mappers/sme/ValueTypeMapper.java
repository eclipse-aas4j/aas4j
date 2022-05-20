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
package io.adminshell.aas.v3.dataformat.i4aas.mappers.sme;

import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.JAXBElement;

import org.opcfoundation.ua._2008._02.types.ObjectFactory;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Builder;
import org.opcfoundation.ua.i4aas.v3.types.AASValueTypeDataType;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.I4AASMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class ValueTypeMapper extends I4AASMapper<String, UAVariable> {

	private static Map<String, AASValueTypeDataType> staticMap = new TreeMap<>();
	static {
		staticMap.put("integer", AASValueTypeDataType.INT_32_5);
		staticMap.put("int", AASValueTypeDataType.INT_32_5);
		staticMap.put("langstring", AASValueTypeDataType.LOCALIZED_TEXT_14);
		staticMap.put("string", AASValueTypeDataType.STRING_11);
		staticMap.put("boolean", AASValueTypeDataType.BOOLEAN_0);
		staticMap.put("float", AASValueTypeDataType.FLOAT_9);
		staticMap.put("double", AASValueTypeDataType.DOUBLE_10);
		staticMap.put("long", AASValueTypeDataType.INT_64_7);
		staticMap.put("http://www.w3.org/2001/XMLSchema#int", AASValueTypeDataType.INT_32_5);
		//to be extended
	}

	public ValueTypeMapper(String src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAVariable createTargetObject() {
		Builder<Void> builder = UAVariable.builder().withDisplayName(createLocalizedText("ValueType"))
				.withBrowseName(createI4AASBrowseName("ValueType")).withNodeId(ctx.newModelNodeIdAsString()).withAccessLevel(3L)
				.withDataType(AASValueTypeDataType.class.getSimpleName());

		AASValueTypeDataType derivedEnum = staticMap.computeIfAbsent(source, this::mappingFuntion);
		if (derivedEnum == null) {
			throw new IllegalArgumentException("There is no ValueType mapping rule defined for '" + source + "'.");
		}

		JAXBElement<Integer> targetIdTypeVar = new ObjectFactory().createInt32(derivedEnum.ordinal());
		UAVariable uaVariable = builder.withValue().withAny(targetIdTypeVar).end().build();
		addTypeReferenceFor(uaVariable, UaIdentifier.PropertyType);
		return uaVariable;
	}

	@Override
	protected void mapAndAttachChildren() {
	}

	private AASValueTypeDataType mappingFuntion(String input) {
		// retry with lower case
		AASValueTypeDataType aasValueTypeDataType = null;
		aasValueTypeDataType = staticMap.get(input.toLowerCase());
		if (aasValueTypeDataType != null) {
			return aasValueTypeDataType;
		}
		return null;
	}

}
