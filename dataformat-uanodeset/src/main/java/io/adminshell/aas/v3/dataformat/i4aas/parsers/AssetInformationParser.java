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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.AssetInformation;
import io.adminshell.aas.v3.rc02.model.AssetKind;
import io.adminshell.aas.v3.rc02.model.File;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultAssetInformation;

public class AssetInformationParser extends I4AASParser<AssetInformation> {

	public AssetInformationParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected AssetInformation createTargetObject() {
		return new DefaultAssetInformation();
	}

	@Override
	protected void parseAndAttachChildren() {
		source.getI4AASProperty("AssetKind").ifPresent(p -> {
			AssetKind parse = (AssetKind) new I4AASGenericEnumParser(p, ctx, AssetKind.class).parse();
			target.setAssetKind(parse);
		});

		source.getI4AASComponent(ASSETINFO_BILL_OF_MATERIAL_BROWSENAME).ifPresent(p -> {
			p.getComponentsOfType(I4AASIdentifier.AASReferenceType).forEach(ref -> {
				p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
					Reference parse = new ReferenceParser(key, ctx).parse();
					target.getBillOfMaterials().add(parse);
				});
			});
		});

		source.getI4AASComponent(ASSETINFO_DEFAULT_THUMBNAIL_BROWSENAME).ifPresent(p -> {
			File parse = new FileParser(p, ctx).parse();
			target.setDefaultThumbnail(parse);
		});

		source.getI4AASComponent(ASSETINFO_GLOBAL_ASSET_ID_BROWSENAME).ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setGlobalAssetId(parse);
			});
		});

		source.getI4AASComponent(ASSETINFO_SPECIFIC_ASSET_ID_BROWSENAME).ifPresent(p -> {
			p.getComponentsOfType(I4AASIdentifier.AASIdentifierKeyValuePairType).forEach(kv -> {
				IdentifierKeyValuePair parse = new IdentifierKeyValuePairParser(kv, ctx).parse();
				target.getSpecificAssetIds().add(parse);
			});
		});
	}

}
