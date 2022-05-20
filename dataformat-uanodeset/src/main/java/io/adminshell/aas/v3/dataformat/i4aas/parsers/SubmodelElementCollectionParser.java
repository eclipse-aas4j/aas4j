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
package io.adminshell.aas.v3.dataformat.i4aas.parsers;

import io.adminshell.aas.v3.model.SubmodelElement;
import io.adminshell.aas.v3.model.SubmodelElementCollection;
import io.adminshell.aas.v3.model.impl.DefaultSubmodelElementCollection;

public class SubmodelElementCollectionParser extends ReferableParser<SubmodelElementCollection> {

	private boolean ordered;

	public SubmodelElementCollectionParser(UANodeWrapper src, ParserContext ctx, boolean ordered) {
		super(src, ctx);
		this.ordered = ordered;
	}

	@Override
	protected SubmodelElementCollection createTargetObject() {
		return new DefaultSubmodelElementCollection();
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		target.setOrdered(ordered);

		source.getI4AASProperty("AllowDuplicates").ifPresent(p -> {
			Boolean parse = ParserUtils.extractValueAsBoolean(p.getNodeVariable());
			target.setAllowDuplicates(parse);
		});

		source.getComponents().forEach(p -> {
			SubmodelElement parse = ParserUtils.parseSME(p, ctx);
			if (parse != null) {
				target.getValues().add(parse);
			}
		});
	}

}
