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

import org.eclipse.aas4j.v3.rc02.model.Property;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultProperty;

public class PropertyParser extends ReferableParser<Property> {

	public PropertyParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Property createTargetObject() {
		return new DefaultProperty();
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();

		source.getI4AASProperty("Value").ifPresent(p -> {
			target.setValue(ParserUtils.extractValueAsString(p.getNodeVariable()));
		});

		source.getI4AASComponent("ValueId").ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setValueId(parse);
			});
		});

		source.getI4AASProperty("ValueType").ifPresent(p -> {
			String parse = new ValueTypeParser(p, ctx).parse();
			target.setValueType(parse);
		});

	}

}
