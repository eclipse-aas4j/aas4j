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

package io.adminshell.aas.v3.model.validator;

import java.util.List;

import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.AssetKind;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.rc02.model.SubmodelElement;
import io.adminshell.aas.v3.rc02.model.impl.DefaultAssetAdministrationShell;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.impl.DefaultAssetInformation;
import io.adminshell.aas.v3.rc02.model.impl.DefaultConceptDescription;
import io.adminshell.aas.v3.model.impl.DefaultIdentifier;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultSubmodel;

public class ConstraintTestHelper {

	public static ConceptDescription createConceptDescription(String idShort, String identifier, String category) {
		return new DefaultConceptDescription.Builder()
				.description(new LangString("TestDescription"))
				.identification(new DefaultIdentifier.Builder().identifier(identifier)
					.idType(IdentifierType.CUSTOM).build())
				.category(category).idShort(idShort).build();
	}
	
	public static Submodel createSubmodel(List<SubmodelElement> elements) {
		return new DefaultSubmodel.Builder()
				.identification(
						new DefaultIdentifier.Builder().identifier("submodel").idType(IdentifierType.CUSTOM).build())
				.idShort("smIdShort")
				.submodelElements(elements)
				.build();
	}

	public static ConceptDescription getIrrelevantConceptDescription() {
		return ConstraintTestHelper.createConceptDescription("irrelevantIdShort", "irrelevant", "COLLECTION");
	}
	
	public static AssetAdministrationShell getDummyAAS() {
		return new DefaultAssetAdministrationShell.Builder()
				.identification(new DefaultIdentifier.Builder()
						.identifier("dummyAAS")
						.idType(IdentifierType.CUSTOM)
						.build())
				.idShort("dummyAASIdShort")
				.assetInformation(new DefaultAssetInformation.Builder()
						.assetKind(AssetKind.INSTANCE)
						.build())
				.build();
	}
	
	public static AssetAdministrationShellEnvironment createEnvironment(Submodel sm, List<ConceptDescription> conceptDescriptions) {
		return new DefaultAssetAdministrationShellEnvironment.Builder()
				.assetAdministrationShells(getDummyAAS())
				.submodels(sm)
				.conceptDescriptions(conceptDescriptions)
				.build();
	}

	public static Reference createDummyReference() {
		return new DefaultReference.Builder()
				.key(new DefaultKey.Builder()
						.idType(KeyType.CUSTOM)
						.value("reference")
						.type(KeyElements.GLOBAL_REFERENCE)
						.build())
				.build();
	}
}
