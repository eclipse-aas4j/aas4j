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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.ReferenceMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.StringPropertyMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import org.eclipse.aas4j.v3.rc02.model.Property;

public class PropertyMapper extends SubmodelElementMapper<Property> {

	public PropertyMapper(Property src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASPropertyType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();

		if (source.getValueId() != null) {
			UAObject uaValueId = new ReferenceMapper(source.getValueId(), ctx, "ValueId").map();
			attachAsComponent(target, uaValueId);
		}

		if (source.getValueType() != null) {
			String valueType = source.getValueType();
			UAVariable mappedValueType = new ValueTypeMapper(valueType, ctx).map();
			attachAsProperty(target, mappedValueType);
		}

		if (source.getValue() != null) {
			//use string property first, should use a interpretation of valuetype later
			UAVariable newStringProperty = new StringPropertyMapper("Value", source.getValue(), ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, newStringProperty);
		}
	}

}
