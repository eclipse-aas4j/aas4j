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

import org.opcfoundation.ua._2011._03.uanodeset.ListOfReferences;
import org.opcfoundation.ua._2011._03.uanodeset.Reference;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;
import io.adminshell.aas.v3.model.Asset;
import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import org.eclipse.aas4j.v3.rc02.model.ConceptDescription;
import org.eclipse.aas4j.v3.rc02.model.Submodel;

public class EnvironmentMapper extends I4AASMapper<AssetAdministrationShellEnvironment, UAObject> {

	public EnvironmentMapper(AssetAdministrationShellEnvironment aasEnvironment, MappingContext ctx) {
		super(aasEnvironment, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createModelBrowseName("AASEnvironment"))
				.withDisplayName(createLocalizedText("AASEnvironment"))
				.withReferences(new ListOfReferences()).build();
		addTypeReference(I4AASIdentifier.AASEnvironmentType);
		Reference orgaRef = new Reference();
		orgaRef.setReferenceType(UaIdentifier.Organizes.getName());
		orgaRef.setIsForward(false);
		orgaRef.setValue("i=85");
		target.getReferences().getReference().add(orgaRef);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		// AAS might depend on CD, so this must be done first!
		for (ConceptDescription conceptDescription : source.getConceptDescriptions()) {
			UAObject uaCD = new ConceptDescriptionMapper(conceptDescription, ctx).map();
			Reference orgaRef = new Reference();
			orgaRef.setReferenceType(UaIdentifier.Organizes.getName());
			orgaRef.setIsForward(false);
			orgaRef.setValue("i=17594");
			uaCD.getReferences().getReference().add(orgaRef);
		}
		for (Submodel submodel : source.getSubmodels()) {
			UAObject uaSubmodel = new SubmodelMapper(submodel, ctx).map();
			attachAsComponent(target, uaSubmodel);
		}
		for (AssetAdministrationShell assetAdministrationShell : source.getAssetAdministrationShells()) {
			UAObject aasUaObject = new AssetAdministrationShellMapper(assetAdministrationShell, ctx).map();
			attachAsComponent(target, aasUaObject);
		}
		for (Asset asset : source.getAssets()) {
			UAObject aasUaObject = new AssetMapper(asset, ctx).map();
			attachAsComponent(target, aasUaObject);
		}
	}
}
