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

import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.impl.DefaultIdentifierKeyValuePair;

public class IdentifierKeyValuePairParser extends I4AASParser<IdentifierKeyValuePair> {

	public IdentifierKeyValuePairParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected IdentifierKeyValuePair createTargetObject() {
		return new DefaultIdentifierKeyValuePair();
	}

	@Override
	protected void parseAndAttachChildren() {
		source.getI4AASComponent(IKVP_EXTERNAL_SUBJECT_ID_BROWSENAME).ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setExternalSubjectId(parse);
			});
		});

		source.getI4AASProperty(IKVP_KEY_BROWSENAME).ifPresent(p -> {
			target.setKey(ParserUtils.extractValueAsString(p.getNodeVariable()));
		});

		source.getI4AASProperty(IKVP_VALUE_BROWSENAME).ifPresent(p -> {
			target.setValue(ParserUtils.extractValueAsString(p.getNodeVariable()));
		});
	}

}
