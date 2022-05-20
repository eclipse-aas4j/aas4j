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

import java.util.List;

import io.adminshell.aas.v3.model.LangString;
import io.adminshell.aas.v3.model.MultiLanguageProperty;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.impl.DefaultMultiLanguageProperty;

public class MultiLanguagePropertyParser extends ReferableParser<MultiLanguageProperty> {

	public MultiLanguagePropertyParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected MultiLanguageProperty createTargetObject() {
		return new DefaultMultiLanguageProperty();
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();

		source.getI4AASComponent("ValueId").ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setValueId(parse);
			});
		});

		source.getI4AASProperty("Value").ifPresent(p -> {
			List<LangString> extractValueAsLangString = ParserUtils.extractValueAsLangString(p.getNodeVariable());
			target.setValues(extractValueAsLangString);
		});

	}

}
