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

import java.util.List;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.ReferenceMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.AnnotatedRelationshipElement;
import io.adminshell.aas.v3.model.DataElement;
import io.adminshell.aas.v3.model.Reference;

public class AnnotatedRelationshipElementMapper extends SubmodelElementMapper<AnnotatedRelationshipElement> {

	public AnnotatedRelationshipElementMapper(AnnotatedRelationshipElement src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASAnnotatedRelationshipElementType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		UAObject createFolder = source.getAnnotations().isEmpty() ? null : createSubmodelElementList("Annotation");
		List<DataElement> annotations = source.getAnnotations();
		for (DataElement dataElement : annotations) {
			UAObject uaDataElement = SubmodelElementMappers.getMapper(dataElement, ctx).map();
			attachAsComponent(createFolder, uaDataElement);
		}
		Reference first = source.getFirst();
		if (first != null) {
			UAObject uaFirst = new ReferenceMapper(first, ctx, "First").map();
			attachAsComponent(target, uaFirst);
		}
		Reference second = source.getSecond();
		if (second != null) {
			UAObject uaSecond = new ReferenceMapper(second, ctx, "Second").map();
			attachAsComponent(target, uaSecond);
		}
	}
}
