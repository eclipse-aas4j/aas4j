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

import javax.xml.bind.JAXBElement;

import org.opcfoundation.ua._2008._02.types.ObjectFactory;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.I4AASMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class PathTypeMapper extends I4AASMapper<String, UAVariable> {

	public PathTypeMapper(String src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAVariable createTargetObject() {
		JAXBElement<String> idStringValue = new ObjectFactory().createString(source);
		org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Builder<Void> idVarBuilder = UAVariable.builder()
				.withValue().withAny(idStringValue).end().withDisplayName(createLocalizedText("Value"))
				.withDataType(I4AASIdentifier.AASPathDataType.getName()).withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createI4AASBrowseName("Value")).withAccessLevel(3L);
		target = idVarBuilder.build();
		addTypeReferenceFor(target, UaIdentifier.PropertyType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
	}

}
