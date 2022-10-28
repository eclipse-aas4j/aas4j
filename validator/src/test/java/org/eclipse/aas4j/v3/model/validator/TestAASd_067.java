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

import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.aas4j.v3.model.impl.DefaultSubmodel;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> If the semanticId of a MultiLanguageProperty references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_067 {
	@Test
	public void wrongConceptDescriptionDatatype() throws ValidationException {

//		DataSpecificationIEC61360 ds = new DefaultDataSpecificationIEC61360.Builder()
//				.dataType(DataTypeIEC61360.DATE) // This should be DataTypeIEC61360.STRING_TRANSLATABLE
//				.preferredName(new LangString("Wrong Data Specification", "en"))
//				.definition(new LangString("A definition of a Date in English.", "en"))
//				.build();

//		EmbeddedDataSpecification embeddedDataSpecification = new DefaultEmbeddedDataSpecification.Builder()
//				.dataSpecificationContent(ds)
//				.dataSpecification( ConstraintTestHelper.createDummyReference() )
//				.build();

		ConceptDescription cd = ConstraintTestHelper.createConceptDescription("Concept_Description", "http://example.org/MultilanguageCD", "constant");
		cd.setCategory("PROPERTY");
//		cd.setEmbeddedDataSpecifications(new ArrayList<>(){{ add(embeddedDataSpecification) ; }} );

		Reference reference = ConstraintTestHelper.createDummyReference();
		Key key = reference.getKeys().get(0);
		key.setType(KeyTypes.CONCEPT_DESCRIPTION);
		key.setValue(cd.getId());

		MultiLanguageProperty property = new DefaultMultiLanguageProperty.Builder()
				.idShort("idShort")
				.semanticId(reference)
				.build();

		Submodel submodel = new DefaultSubmodel.Builder()
				.idShort("submodel_idShort")
				.id("http://example.org/TestSubmodel")
				.submodelElements(new ArrayList<>() {{add(property);}})
				.build();

		Environment wrongAssetAdministrationShellEnvironment = ConstraintTestHelper
				.createEnvironment(
						submodel,
						new ArrayList<>() {{add(cd);}}
				);

		try {
			ShaclValidator.getInstance().validate(wrongAssetAdministrationShellEnvironment);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a MultiLanguageProperty references a ConceptDescription then DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE."));
		}


	}

	@Test
	public void correctConceptDescriptionDatatype() throws ValidationException {


//		DataSpecificationIEC61360 ds = new DefaultDataSpecificationIEC61360.Builder()
//				.dataType(DataTypeIEC61360.STRING_TRANSLATABLE) // This should be DataTypeIEC61360.STRING_TRANSLATABLE
//				.preferredName(new LangString("Data Specification", "en"))
//				.definition(new LangString("A definition of a STRING_TRANSLATABLE in English.", "en"))
//				.build();

//		EmbeddedDataSpecification embeddedDataSpecification = new DefaultEmbeddedDataSpecification.Builder()
//				.dataSpecificationContent(ds)
//				.dataSpecification( ConstraintTestHelper.createDummyReference() )
//				.build();

		ConceptDescription cd = ConstraintTestHelper.createConceptDescription("Concept_Description", "http://example.org/MultilanguageCD", "constant");
		cd.setCategory("PROPERTY");
//		cd.setEmbeddedDataSpecifications(new ArrayList<>(){{ add(embeddedDataSpecification) ; }} );

		Reference reference = ConstraintTestHelper.createDummyReference();
		Key key = reference.getKeys().get(0);
		key.setType(KeyTypes.CONCEPT_DESCRIPTION);
		key.setValue(cd.getId());

		MultiLanguageProperty property = new DefaultMultiLanguageProperty.Builder()
				.idShort("idShort")
				.semanticId(reference)
				.build();

		Submodel submodel = new DefaultSubmodel.Builder()
				.idShort("submodel_idShort")
				.id("http://example.org/TestSubmodel")
				.submodelElements(new ArrayList<>() {{add(property);}})
				.build();

		Environment assetAdministrationShellEnvironment = ConstraintTestHelper
				.createEnvironment(
						submodel,
						new ArrayList<>() {{add(cd);}}
				);


		ShaclValidator.getInstance().validate(assetAdministrationShellEnvironment);

	}
}
