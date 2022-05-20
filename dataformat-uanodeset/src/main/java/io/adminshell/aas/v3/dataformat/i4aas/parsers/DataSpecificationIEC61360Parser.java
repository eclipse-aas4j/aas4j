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

import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.DataTypeIEC61360;
import io.adminshell.aas.v3.model.LangString;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.impl.DefaultDataSpecificationIEC61360;

public class DataSpecificationIEC61360Parser extends I4AASParser<DataSpecificationIEC61360> {

	public DataSpecificationIEC61360Parser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected DataSpecificationIEC61360 createTargetObject() {
		return new DefaultDataSpecificationIEC61360();
	}

	@Override
	protected void parseAndAttachChildren() {
		source.getI4AASProperty("DataType").ifPresent(p -> {
			DataTypeIEC61360 parse = (DataTypeIEC61360) new I4AASGenericEnumParser(p, ctx, DataTypeIEC61360.class)
					.parse();
			target.setDataType(parse);
		});

		source.getI4AASProperty(IEC61360_DEFINITION_BROWSENAME).ifPresent(p -> {
			List<LangString> parse = ParserUtils.extractValueAsLangString(p.getNodeVariable());
			;
			target.setDefinitions(parse);
		});

		source.getI4AASProperty(IEC61360_PREFERRED_NAME_BROWSENAME).ifPresent(p -> {
			List<LangString> parse = ParserUtils.extractValueAsLangString(p.getNodeVariable());
			;
			target.setPreferredNames(parse);
		});
		source.getI4AASProperty(IEC61360_SHORT_NAME_BROWSENAME).ifPresent(p -> {
			List<LangString> parse = ParserUtils.extractValueAsLangString(p.getNodeVariable());
			;
			target.setShortNames(parse);
		});

		source.getI4AASProperty(IEC61360_SOURCE_OF_DEFINITION_BROWSENAME).ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setSourceOfDefinition(parse);
		});

		source.getI4AASProperty(IEC61360_SYMBOL_BROWSENAME).ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setSymbol(parse);
		});

		source.getI4AASProperty(IEC61360_UNIT_BROWSENAME).ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setUnit(parse);
		});

		source.getI4AASComponent(IEC61360_UNIT_ID_BROWSENAME).ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setUnitId(parse);
			});
		});

		source.getI4AASProperty(IEC61360_VALUE_BROWSENAME).ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setValue(parse);
		});

		source.getI4AASProperty(IEC61360_VALUE_FORMAT_BROWSENAME).ifPresent(p -> {
			String parse = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setValueFormat(parse);
		});

		source.getI4AASComponent(IEC61360_VALUE_ID_BROWSENAME).ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setValueId(parse);
			});
		});

	}

}
