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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.DataTypeIEC61360;
import io.adminshell.aas.v3.rc02.model.Reference;

public class DataSpecificationIEC61360Mapper extends I4AASMapper<DataSpecificationIEC61360, UAObject> {

	private String name;
	private int namespaceIdx;


	public DataSpecificationIEC61360Mapper(DataSpecificationIEC61360 src, MappingContext ctx,
			String name, int namespaceIdx) {
		super(src, ctx);
		this.namespaceIdx = namespaceIdx;
		this.name = name;
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString()).withBrowseName(createBrowseName(name, namespaceIdx))
				.withDisplayName(createLocalizedText(name)).build();
		addTypeReference(I4AASIdentifier.AASDataSpecificationIEC61360Type);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
				
		DataTypeIEC61360 dataType = source.getDataType();
		if (dataType != null) {
			UAVariable uaDataType = new I4AASEnumMapper(dataType, ctx).map();
			attachAsProperty(target, uaDataType);
		}

		String sourceOfDefinition = source.getSourceOfDefinition();
		if (sourceOfDefinition != null) {
			UAVariable uaVariable = new StringPropertyMapper(IEC61360_SOURCE_OF_DEFINITION_BROWSENAME, sourceOfDefinition, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaVariable);
		}

		String symbol = source.getSymbol();
		if (symbol != null) {
			UAVariable uaVariable = new StringPropertyMapper(IEC61360_SYMBOL_BROWSENAME, symbol, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaVariable);
		}

		String unit = source.getUnit();
		if (unit != null) {
			UAVariable uaVariable = new StringPropertyMapper(IEC61360_UNIT_BROWSENAME, unit, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaVariable);
		}

		String valueFormat = source.getValueFormat();
		if (valueFormat != null) {
			UAVariable uaVariable = new StringPropertyMapper(IEC61360_VALUE_FORMAT_BROWSENAME, valueFormat, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaVariable);
		}

		String value = source.getValue();
		if (value != null) {
			UAVariable uaVariable = new StringPropertyMapper(IEC61360_VALUE_BROWSENAME, value, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaVariable);
		}

		Reference unitId = source.getUnitId();
		if (unitId != null) {
			UAObject uaRef = new ReferenceMapper(unitId, ctx, IEC61360_UNIT_ID_BROWSENAME).map();
			attachAsComponent(target, uaRef);
		}

		Reference valueId = source.getValueId();
		if (valueId != null) {
			UAObject uaRef = new ReferenceMapper(valueId, ctx, IEC61360_VALUE_ID_BROWSENAME).map();
			attachAsComponent(target, uaRef);
		}
		
		UAVariable uaDefinition = new LangStringPropertyMapper(IEC61360_DEFINITION_BROWSENAME, source.getDefinitions(), ctx, ctx.getI4aasNsIndex()).map();
		attachAsProperty(target, uaDefinition);

		UAVariable uaPreferredNames = new LangStringPropertyMapper(IEC61360_PREFERRED_NAME_BROWSENAME, source.getPreferredNames(), ctx, ctx.getI4aasNsIndex()).map();
		attachAsProperty(target, uaPreferredNames);

		UAVariable uaShortName = new LangStringPropertyMapper(IEC61360_SHORT_NAME_BROWSENAME, source.getShortNames(), ctx, ctx.getI4aasNsIndex()).map();
		attachAsProperty(target, uaShortName);

	}

}
