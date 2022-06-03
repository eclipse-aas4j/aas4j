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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.model.View;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;
import io.adminshell.aas.v3.model.impl.DefaultView;

/**
 * Tests the following constraint:
 * <p>
 * <i>If the semanticId of a View references a ConceptDescription then the
 * category of the ConceptDescription shall be VIEW.</i>
 * </p>
 * 
 * @author schnicke
 *
 */
public class TestAASd_064 {
	@Test
	public void correctCategory() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionId, "VIEW");
		
		AssetAdministrationShell aas = ConstraintTestHelper.getDummyAAS();
		aas.setViews(Arrays.asList(createView(conceptDescriptionId)));

		Submodel sm = ConstraintTestHelper
				.createSubmodel(new ArrayList<>());

		AssetAdministrationShellEnvironment correctEnv = new DefaultAssetAdministrationShellEnvironment.Builder()
				.submodels(sm)
				.conceptDescriptions(Arrays.asList(correctCD, ConstraintTestHelper.getIrrelevantConceptDescription()))
				.assetAdministrationShells(aas).build();

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategory() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		AssetAdministrationShell aas = ConstraintTestHelper.getDummyAAS();
		aas.setViews(Arrays.asList(createView(conceptDescriptionWrongId)));

		Submodel sm = ConstraintTestHelper
				.createSubmodel(new ArrayList<>());

		AssetAdministrationShellEnvironment wrongEnv = new DefaultAssetAdministrationShellEnvironment.Builder()
				.submodels(sm)
				.conceptDescriptions(
						Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()))
				.assetAdministrationShells(aas).build();

		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a View references a ConceptDescription then the category of the ConceptDescription shall be VIEW."));
		}
	}

	private View createView(String conceptDescriptionId) {
		return new DefaultView.Builder()
				.idShort("idShort")
				.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder().idType(KeyType.CUSTOM)
						.value(conceptDescriptionId).type(KeyElements.CONCEPT_DESCRIPTION).build()).build())
				.build();
	}

}
