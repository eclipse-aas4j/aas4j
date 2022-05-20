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

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.LangStringPropertyMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.ReferenceMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.MultiLanguageProperty;
import io.adminshell.aas.v3.model.Reference;

public class MultiLanguagePropertyMapper extends SubmodelElementMapper<MultiLanguageProperty> {

	public MultiLanguagePropertyMapper(MultiLanguageProperty src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASMultiLanguagePropertyType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		Reference valueId = source.getValueId();
		if (valueId != null) {
			UAObject map = new ReferenceMapper(valueId, ctx, "ValueId").map();
			attachAsComponent(target, map);
		}
		UAVariable uaLangString = new LangStringPropertyMapper("Value", source.getValues(), ctx, ctx.getI4aasNsIndex()).map();
		attachAsProperty(target, uaLangString);
	}

}
