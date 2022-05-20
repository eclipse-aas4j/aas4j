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
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.Reference;

public class IdentifierKeyValuePairMapper extends I4AASMapper<IdentifierKeyValuePair, UAObject> {

	public IdentifierKeyValuePairMapper(IdentifierKeyValuePair src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createModelBrowseName(source.getKey()))
				.withDisplayName(createLocalizedText(source.getKey())).build();
		addTypeReference(I4AASIdentifier.AASIdentifierKeyValuePairType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		Reference externalSubjectId = source.getExternalSubjectId();
		if (externalSubjectId != null) {
			UAObject uaExtSubId = new ReferenceMapper(externalSubjectId, ctx, IKVP_EXTERNAL_SUBJECT_ID_BROWSENAME).map();
			attachAsComponent(target, uaExtSubId);
		}
		String key = source.getKey();
		if (key != null) {
			UAVariable uaKey = new StringPropertyMapper(IKVP_KEY_BROWSENAME, key, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaKey);
		}
		String value = source.getValue();
		if (value != null) {
			UAVariable uaValue = new StringPropertyMapper(IKVP_VALUE_BROWSENAME, value, ctx, ctx.getI4aasNsIndex()).map();
			attachAsProperty(target, uaValue);
		}
	}

}
