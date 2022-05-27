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
import io.adminshell.aas.v3.model.Asset;
import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;

public class EnvironmentParser extends I4AASParser<AssetAdministrationShellEnvironment> {

	public EnvironmentParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected AssetAdministrationShellEnvironment createTargetObject() {
		target = new DefaultAssetAdministrationShellEnvironment();
		return target;
	}

	@Override
	protected void parseAndAttachChildren() {
		for (UANodeWrapper uaNodeWrapper : source.getComponentsOfType(I4AASIdentifier.AASSubmodelType)) {
			Submodel parse = new SubmodelParser(uaNodeWrapper, ctx).parse();
			target.getSubmodels().add(parse);
		}
		for (UANodeWrapper uaNodeWrapper : source.getComponentsOfType(I4AASIdentifier.AASAssetAdministrationShellType)) {
			AssetAdministrationShell parse = new AssetAdministrationShellParser(uaNodeWrapper, ctx).parse();
			target.getAssetAdministrationShells().add(parse);
		}
		for (UANodeWrapper uaNodeWrapper : source.getComponentsOfType(I4AASIdentifier.AASAssetType)) {
			Asset asset = new AssetParser(uaNodeWrapper, ctx).parse();
			target.getAssets().add(asset);
		}
		for (UANodeWrapper uaNodeWrapper : ctx.getDictionaryEntries()) {
			ConceptDescription conceptDescription = new ConceptDescriptionParser(uaNodeWrapper, ctx).parse();
			target.getConceptDescriptions().add(conceptDescription);
		}
	}

}
