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

import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import org.eclipse.aas4j.v3.rc02.model.AssetInformation;

public class AssetAdministrationShellMapper extends IdentifiableMapper<AssetAdministrationShell>
		implements HasDataSpecificationMapper {

	public AssetAdministrationShellMapper(AssetAdministrationShell src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASAssetAdministrationShellType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		mapAsset();
		mapSubmodels();
		mapDerivedFrom();
		mapDataSpecification(source, target, ctx);
	}

	private void mapAsset() {
		AssetInformation assetInformation = source.getAssetInformation();
		if (assetInformation != null) {
			UAObject uaAsset = new AssetInformationMapper(assetInformation, ctx).map();
			attachAsComponent(target, uaAsset);
		}
	}

	private void mapSubmodels() {
		UAObject smFolder = source.getSubmodels().isEmpty() ? null
				: createReferenceList(AAS_SUBMODELREFERENCES_LIST_BROWSENAME);
		List<Reference> submodels = source.getSubmodels();
		for (int i = 0; i < submodels.size(); i++) {
			Reference reference = submodels.get(i);
			UAObject createSubmodelReferenceUaObject = new ReferenceMapper(reference, ctx,
					SM_DISPLAYNAME_PREFIX + reference.getKeys().get(0).getValue()).map();
			attachAsComponent(smFolder, createSubmodelReferenceUaObject);
		}
	}

	private void mapDerivedFrom() {
		Reference derivedFrom = source.getDerivedFrom();
		if (derivedFrom != null) {
			UAObject uaDerivedFrom = new ReferenceMapper(derivedFrom, ctx, AAS_DERIVEDFROM_BROWSENAME).map();
			attachAsComponent(target, uaDerivedFrom);
		}
	}
}
