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

/**
 * Tests the following constraint:
 * <p>
 * <i>For a ConceptDescription with category DOCUMENT using data specification
 * template IEC61360
 * (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0)
 * - DataSpecificationIEC61360/dataType shall be one of the following values:
 * STRING or URL.</i>
 * </p>
 * 
 * @author schnicke
 *
 */
public class TestAASd_072 {

	// TODO: reactivate after the ConceptDescription have been added correctly
	/*
	@Test
	public void correctDataTypeURL() throws ValidationException, IOException {
		ConceptDescription correctURLCD = createConceptDescription(DataTypeIEC61360.URL);

		ShaclValidator.getInstance().validate(correctURLCD);
	}

	@Test
	public void wrongDataType() {
		ConceptDescription wrongCD = createConceptDescription(DataTypeIEC61360.DATE);

		try {
			ShaclValidator.getInstance().validate(wrongCD);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"For a ConceptDescription with category DOCUMENT using data specification template IEC61360 (http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0) - DataSpecificationIEC61360/dataType shall be one of the following values: String or URL."));
		}
	}

	@Test
	public void correctDataTypeString() throws ValidationException {
		ConceptDescription correctStringCD = createConceptDescription(DataTypeIEC61360.STRING);


		ShaclValidator.getInstance().validate(correctStringCD);
	}

	private ConceptDescription createConceptDescription(DataTypeIEC61360 dataType) {
		ConceptDescription correctURLCD = ConstraintTestHelper.createConceptDescription("idShort1",
				"conceptDescriptionURL", "DOCUMENT");

		DataSpecificationIEC61360 urlDataTypeDS = new DefaultDataSpecificationIEC61360.Builder()
				.preferredName(new LangString("ds", "en")).definition(new LangString("some english definition", "EN"))
				.dataType(dataType).build();

		EmbeddedDataSpecification urlDataTypeEDS = new DefaultEmbeddedDataSpecification.Builder()
				.dataSpecificationContent(urlDataTypeDS).dataSpecification(new DefaultReference.Builder()
						.key(new DefaultKey.Builder().idType(KeyType.CUSTOM).value("foo_key").build()).build())
				.build();

		correctURLCD.setEmbeddedDataSpecifications(Arrays.asList(urlDataTypeEDS));
		return correctURLCD;
	}
	*/
}
