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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASUtils;
import io.adminshell.aas.v3.model.LangString;
import io.adminshell.aas.v3.model.Referable;

public class ReferableMapper<T extends Referable> extends I4AASMapper<T, UAObject> {

	public ReferableMapper(T src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createModelBrowseName(source))
				.withDisplayName(I4AASUtils.createDisplayName(source)).build();
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		if (source.getCategory() != null) {
			UAVariable categoryProperty = new StringPropertyMapper(CATEGORY_BROWSENAME, source.getCategory(), ctx,
					ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, categoryProperty);
		}

		for (LangString description : source.getDescriptions()) {
			target.getDescription().add(mapLangString(description));
		}
		for (LangString displayName : source.getDisplayNames()) {
			target.getDisplayName().add(mapLangString(displayName));
		}
		ctx.registerReferableMapped(source, target);
	}

}
