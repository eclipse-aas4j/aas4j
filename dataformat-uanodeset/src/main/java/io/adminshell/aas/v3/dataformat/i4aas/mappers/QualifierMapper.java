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
package io.adminshell.aas.v3.dataformat.i4aas.mappers;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.sme.ValueTypeMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import org.eclipse.aas4j.v3.rc02.model.Qualifier;
import org.eclipse.aas4j.v3.rc02.model.Reference;

public class QualifierMapper extends I4AASMapper<Qualifier, UAObject> {

	private String name;
	private int nsIdx;

	public QualifierMapper(Qualifier src, MappingContext ctx, String name, int nsIdx) {
		super(src, ctx);
		this.name = name;
		this.nsIdx = nsIdx;
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString()).withBrowseName(createBrowseName(name, nsIdx))
				.withDisplayName(createLocalizedText(name)).build();
		addTypeReference(I4AASIdentifier.AASQualifierType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		Reference semanticId = source.getSemanticId();
		if (semanticId != null) {
			UAObject map = new ReferenceMapper(semanticId, ctx, "ValueId").map();
			attachAsComponent(target, map);
		}

		if (source.getType() != null) {
			UAVariable map = new QualifierTypeMapper(source.getType(), ctx).map();
			attachAsProperty(target, map);
		}

		String value = source.getValue();
		if (value != null) {
			UAVariable map = new StringPropertyMapper("Value", value, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, map);
		}
		
		String valueType = source.getValueType();
		if (valueType != null) {
			UAVariable map = new ValueTypeMapper(valueType, ctx).map();
			attachAsProperty(target, map);
		}
	}

}
