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

import java.util.Collection;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.BooleanPropertyMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.I4AASMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.SubmodelElement;
import io.adminshell.aas.v3.model.SubmodelElementCollection;

public class SubmodelElementCollectionMapper extends SubmodelElementMapper<SubmodelElementCollection> {

	public SubmodelElementCollectionMapper(SubmodelElementCollection submodelElement, MappingContext ctx) {
		super(submodelElement, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		if (source.getOrdered()) {
			addTypeReference(I4AASIdentifier.AASOrderedSubmodelElementCollectionType);
		} else {
			addTypeReference(I4AASIdentifier.AASSubmodelElementCollectionType);
		}
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		Collection<SubmodelElement> values = source.getValues();
		for (SubmodelElement submodelElement : values) {
			I4AASMapper<? extends SubmodelElement, UAObject> mapper = SubmodelElementMappers.getMapper(submodelElement,
					ctx);
			UAObject uaSubmodel = mapper.map();
			if (source.getOrdered()) {
				attachAsOrderedComponent(target, uaSubmodel);
			} else {
				attachAsComponent(target, uaSubmodel);
			}
		}
		UAVariable uaAllowDuplicates = new BooleanPropertyMapper("AllowDuplicates", source.getAllowDuplicates(), ctx)
				.map();
		attachAsProperty(target, uaAllowDuplicates);
	}


}
