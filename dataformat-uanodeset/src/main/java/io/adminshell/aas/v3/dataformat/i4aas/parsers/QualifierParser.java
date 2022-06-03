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

import io.adminshell.aas.v3.rc02.model.Qualifier;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultQualifier;

public class QualifierParser extends I4AASParser<Qualifier> {

	public QualifierParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Qualifier createTargetObject() {
		return new DefaultQualifier();
	}

	@Override
	protected void parseAndAttachChildren() {
		source.getI4AASProperty("Type").ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setType(parse);
		});

		source.getI4AASProperty("Value").ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setValue(parse);
		});

		source.getI4AASProperty("ValueId").ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = null;
				target.setValueId(parse);
			});
		});

		source.getI4AASProperty("ValueType").ifPresent(p -> {
			String parse = new ValueTypeParser(p, ctx).parse();
			target.setValueType(parse);
		});
	}

}
