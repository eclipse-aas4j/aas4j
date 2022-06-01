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

import org.eclipse.aas4j.v3.rc02.model.Entity;
import org.eclipse.aas4j.v3.rc02.model.EntityType;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.SubmodelElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultEntity;

public class EntityParser extends ReferableParser<Entity> {

	public EntityParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Entity createTargetObject() {
		return new DefaultEntity();
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		source.getI4AASProperty("EntityType").ifPresent(p -> {
			EntityType parse = (EntityType) new I4AASGenericEnumParser(p, ctx, EntityType.class).parse();
			target.setEntityType(parse);
		});

		source.getI4AASComponent(ASSETINFO_GLOBAL_ASSET_ID_BROWSENAME).ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setGlobalAssetId(parse);
			});
		});

		source.getI4AASComponent(ASSETINFO_SPECIFIC_ASSET_ID_BROWSENAME).ifPresent(p -> {
			IdentifierKeyValuePair parse = new IdentifierKeyValuePairParser(p, ctx).parse();
			target.setSpecificAssetId(parse);
		});

		source.getI4AASComponent("Statement").ifPresent(p -> {
			p.getComponents().forEach(sme -> {
				SubmodelElement parse = ParserUtils.parseSME(sme, ctx);
				if (parse != null) {
					target.getStatements().add(parse);
				}
			});
		});

	}

}
