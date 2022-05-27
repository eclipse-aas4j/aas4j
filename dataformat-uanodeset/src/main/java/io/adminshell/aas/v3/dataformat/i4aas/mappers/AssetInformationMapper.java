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

import java.util.List;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.sme.FileMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.AssetInformation;
import io.adminshell.aas.v3.rc02.model.AssetKind;
import io.adminshell.aas.v3.rc02.model.File;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.rc02.model.Reference;

public class AssetInformationMapper extends I4AASMapper<AssetInformation, UAObject> {

	public AssetInformationMapper(AssetInformation src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createI4AASBrowseName(AAS_ASSETINFORMATION_BROWSENAME))
				.withDisplayName(createLocalizedText(AAS_ASSETINFORMATION_BROWSENAME)).build();
		addTypeReference(I4AASIdentifier.AASAssetInformationType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		AssetKind assetKind = source.getAssetKind();
		UAVariable uaAssetKind = new I4AASEnumMapper(assetKind, ctx).map();
		attachAsProperty(target, uaAssetKind);

		Reference globalAssetId = source.getGlobalAssetId();
		if (globalAssetId != null) {
			UAObject uaIdentification = new ReferenceMapper(globalAssetId, ctx, ASSETINFO_GLOBAL_ASSET_ID_BROWSENAME).map();
			attachAsComponent(target, uaIdentification);
		}

		List<Reference> billOfMaterials = source.getBillOfMaterials();
		UAObject uaBomList = billOfMaterials.isEmpty() ? null : createReferenceList(ASSETINFO_BILL_OF_MATERIAL_BROWSENAME);
		for (int i = 0; i < billOfMaterials.size(); i++) {
			Reference reference = billOfMaterials.get(i);
			UAObject uaBomListEntry = new ReferenceMapper(reference, ctx, ASSETINFO_BILL_OF_MATERIAL_BROWSENAME + "_" + i).map();
			attachAsComponent(uaBomList, uaBomListEntry);
		}

		File defaultThumbnail = source.getDefaultThumbnail();
		if (defaultThumbnail != null) {
			UAObject uaThumbnail = new FileMapper(defaultThumbnail, ctx, ASSETINFO_DEFAULT_THUMBNAIL_BROWSENAME, ctx.getI4aasNsIndex())
					.map();
			attachAsComponent(target, uaThumbnail);
		}

		UAObject folder = source.getSpecificAssetIds().isEmpty() ? null : createIdentifierKeyValuePairList(ASSETINFO_SPECIFIC_ASSET_ID_BROWSENAME);
		for (IdentifierKeyValuePair identifierKeyValuePair : source.getSpecificAssetIds()) {
			UAObject uaIdKVP = new IdentifierKeyValuePairMapper(identifierKeyValuePair, ctx).map();
			attachAsComponent(folder, uaIdKVP);
		}
	}

}
