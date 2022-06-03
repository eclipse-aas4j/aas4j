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

package org.eclipse.aas4j.v3.rc02.model.validator;

import java.util.List;

import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.impl.*;

public class ConstraintTestHelper {

	public static ConceptDescription createConceptDescription(String idShort, String identifier, String category) {
		return new DefaultConceptDescription.Builder()
				.description(new DefaultLangStringSet.Builder().langStrings(new DefaultLangString.Builder().text("TestDescription").language("en-us").build()).build())
				.id(identifier)
				.category(category).idShort(idShort).build();
	}
	
	public static Submodel createSubmodel(List<SubmodelElement> elements) {
		return new DefaultSubmodel.Builder()
				.id("submodel")
				.idShort("smIdShort")
				.submodelElements(elements)
				.build();
	}

	public static ConceptDescription getIrrelevantConceptDescription() {
		return ConstraintTestHelper.createConceptDescription("irrelevantIdShort", "irrelevant", "COLLECTION");
	}
	
	public static AssetAdministrationShell getDummyAAS() {
		return new DefaultAssetAdministrationShell.Builder()
				.id("dummyAAS")
				.idShort("dummyAASIdShort")
				.assetInformation(new DefaultAssetInformation.Builder()
						.assetKind(AssetKind.INSTANCE)
						.build())
				.build();
	}
	
	public static Environment createEnvironment(Submodel sm, List<ConceptDescription> conceptDescriptions) {
		return new DefaultEnvironment.Builder()
				.assetAdministrationShells(getDummyAAS())
				.submodels(sm)
				.conceptDescriptions(conceptDescriptions)
				.build();
	}

	public static Reference createDummyReference() {
		return new DefaultReference.Builder()
				.keys(new DefaultKey.Builder()
						.value("reference")
						.type(KeyTypes.GLOBAL_REFERENCE)
						.build())
				.build();
	}
}
