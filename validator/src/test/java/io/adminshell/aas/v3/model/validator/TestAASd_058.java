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

import java.util.Arrays;

import org.junit.Test;

import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.rc02.model.Capability;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.rc02.model.impl.DefaultCapability;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;

/**
 * Tests the following constraint:
 * <p>
 * <i> If the semanticId of a Capability submodel element references a
 * ConceptDescription then the ConceptDescription/category shall be CAPABILITY
 * </i>
 * </p>
 * 
 * @author schnicke
 *
 */
public class TestAASd_058 {
	@Test
	public void correctCategory() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionId, "CAPABILITY");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(
						Arrays.asList(createCapability("submodelElementIdShort", conceptDescriptionId)));

		AssetAdministrationShellEnvironment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategory() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createCapability("submodelElementIdShort", conceptDescriptionWrongId)));
		
		AssetAdministrationShellEnvironment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a Capability submodel element references a ConceptDescription then the ConceptDescription/category shall be CAPABILITY."));
		}
	}

	private Capability createCapability(String idShort, String conceptDescriptionId) {
		return new DefaultCapability.Builder()
				.idShort(idShort)
				.semanticId(new DefaultReference.Builder()
						.key(new DefaultKey.Builder()
								.idType(KeyType.CUSTOM)
								.value(conceptDescriptionId)
								.type(KeyElements.CONCEPT_DESCRIPTION)
								.build())
						.build())
				.build();
	}

}
