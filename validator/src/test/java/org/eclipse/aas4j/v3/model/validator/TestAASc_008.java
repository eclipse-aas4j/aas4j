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

package org.eclipse.aas4j.v3.model.validator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.impl.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Tests the following constraint:
 * <p>
 * <i> For all ConceptDescriptions except for ConceptDescriptions of category
 * VALUE using data specification template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0)
 * - DataSpecificationIEC61360/definition is mandatory and shall be defined at
 * least in English. </i>
 * </p>
 * 
 * @author schnicke
 *
 */
public class TestAASc_008 {

	@Test
	public void conceptDescriptionEnglishDefinition() throws ValidationException {
		LangString definition = new DefaultLangString.Builder().text("some english definition").language("en").build();
		ConceptDescription cd = createConceptDescription(definition);

		ShaclValidator.getInstance().validate(cd);
	}

	@Test
	public void conceptDescriptionNoEnglishDefinition() {
		LangString definition = new DefaultLangString.Builder().text("deutsch").language("de").build();
		ConceptDescription cd = createConceptDescription(definition);

		try {
			ShaclValidator.getInstance().validate(cd);
			fail();
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			assertTrue(e.getMessage().endsWith(
					"For all ConceptDescriptions except for ConceptDescriptions of category VALUE using data specification template IEC61360 (https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/definition) - DataSpecificationIEC61360/definition is mandatory and shall be defined at least in English."));
		}
	}

	@Test
	public void conceptDescriptionValueCategoryGermanDefinition() throws ValidationException {
		LangString definition = new DefaultLangString.Builder().text("deutsch").language("de").build();
		ConceptDescription cd = createConceptDescription(definition);
		cd.setCategory("VALUE");

		ShaclValidator.getInstance().validate(cd);
	}

	@Test
	public void noIEC61360DataSpecification() throws ValidationException {
		ConceptDescription description = ConstraintTestHelper.createConceptDescription("testIdShort", "testId",
				"PROPERTY");

		ShaclValidator.getInstance().validate(description);
	}
	private ConceptDescription createConceptDescription(LangString definition) {
		ConceptDescription cd = ConstraintTestHelper.createConceptDescription("idShort1", "id",
				"QUALIFIER");

		DataSpecificationIEC61360 urlDataTypeDS = new DefaultDataSpecificationIEC61360.Builder()
				.preferredName(new DefaultLangString.Builder().language("en").text("ds").build())
				.definition(definition)
				.definition(new DefaultLangString.Builder().language("de").text("test").build())
				.dataType(DataTypeIEC61360.IRI)
				.build();
		
		EmbeddedDataSpecification urlDataTypeEDS = new DefaultEmbeddedDataSpecification.Builder()
				.dataSpecificationContent(urlDataTypeDS)
				.dataSpecification(new DefaultReference.Builder()
						.keys(new DefaultKey.Builder()
								.value("foo_key")
								.type(KeyTypes.GLOBAL_REFERENCE)
								.build())
						.type(ReferenceTypes.GLOBAL_REFERENCE)
						.build())
				.build();

		cd.setEmbeddedDataSpecifications(Arrays.asList(urlDataTypeEDS));
		return cd;
	}
}
