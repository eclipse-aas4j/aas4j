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


import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.Property;
import io.adminshell.aas.v3.rc02.model.Submodel;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Tests the following constraint:
 * <p>
 * <i> If the semanticId of a Property references a ConceptDescription with the category VALUE
 * then the value of the property is identical to DataSpecificationIEC61360/value and the valueId of
 * the property is identical to DataSpecificationIEC61360/valueId. </i>
 * </p>
 *
 * @author bader, chang
 *
 */
public class TestAASd_65a {

    @Ignore
    @Test
    public void missmatchingValueAndValueId() throws ValidationException {

        Property pr =  new DefaultProperty.Builder()
                .idShort("idShort")
                .value("the value of property")
                .valueId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .value("DataSpecificationIEC61360")
                                .idType(KeyType.CUSTOM)
                                .type(KeyElements.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .valueType("the type of value")
                .semanticId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .idType(KeyType.IRI)
                                .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataTypeIEC61360")
                                .type(KeyElements.CONCEPT_DESCRIPTION)
                                .build())
                        .build())
                .build();

        DataSpecificationIEC61360 ds = new DefaultDataSpecificationIEC61360.Builder()
                .dataType(DataTypeIEC61360.STRING_TRANSLATABLE) // This should be DataTypeIEC61360.STRING_TRANSLATABLE
                .preferredName(new LangString("Data Specification", "en"))
                .definition(new LangString("A definition of a STRING_TRANSLATABLE in English.", "en"))
                .value("the value")
                .valueId(new DefaultReference.Builder().
                        key(new DefaultKey.Builder()
                                .value("DataSpecificationIEC61360")
                                .idType(KeyType.CUSTOM)
                                .type(KeyElements.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .build();

        EmbeddedDataSpecification embeddedDataSpecification = new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecificationContent(ds)
                .dataSpecification( ConstraintTestHelper.createDummyReference() )
                .build();

        ConceptDescription cd = ConstraintTestHelper.createConceptDescription("Concept-Description", "http://example.org/MultilanguageCD", "constant");
        cd.setCategory("VALUE");
        cd.setEmbeddedDataSpecifications(new ArrayList<>(){{ add(embeddedDataSpecification) ; }} );

        Submodel submodel = new DefaultSubmodel.Builder()
                .idShort("submodel_idShort")
                .identification(new DefaultIdentifier.Builder().identifier("http://example.org/TestSubmodel").idType(IdentifierType.IRI).build())
                .submodelElements(new ArrayList<>() {{add(pr);}})
                .build();

        AssetAdministrationShellEnvironment assetAdministrationShellEnvironment = ConstraintTestHelper
                .createEnvironment(
                        submodel,
                        new ArrayList<>() {{add(cd);}}
                );


        ShaclValidator.getInstance().validate(assetAdministrationShellEnvironment);

    }

    @Ignore
    @Test
    public void matchingValueAndValueId() throws ValidationException {

        Property pr =  new DefaultProperty.Builder()
                .idShort("idShort")
                .value("the value of Property value")
                .valueId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .value("DataSpecificationIEC61360")
                                .idType(KeyType.CUSTOM)
                                .type(KeyElements.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .valueType("the value type")
                .semanticId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .idType(KeyType.IRI)
                                .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataTypeIEC61360")
                                .type(KeyElements.CONCEPT_DESCRIPTION)
                                .build())
                        .build())
                .build();

        DataSpecificationIEC61360 ds = new DefaultDataSpecificationIEC61360.Builder()
                .dataType(DataTypeIEC61360.STRING_TRANSLATABLE) // This should be DataTypeIEC61360.STRING_TRANSLATABLE
                .preferredName(new LangString("Data Specification", "en"))
                .definition(new LangString("A definition of a STRING_TRANSLATABLE in English.", "en"))
                .value("the value of Property value")
                .valueId(new DefaultReference.Builder().
                        key(new DefaultKey.Builder()
                                .value("DataSpecificationIEC61360")
                                .idType(KeyType.CUSTOM)
                                .type(KeyElements.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .build();

        EmbeddedDataSpecification embeddedDataSpecification = new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecificationContent(ds)
                .dataSpecification( ConstraintTestHelper.createDummyReference() )
                .build();

        ConceptDescription cd = ConstraintTestHelper.createConceptDescription("Concept-Description", "http://example.org/MultilanguageCD", "constant");
        cd.setCategory("VALUE");
        cd.setEmbeddedDataSpecifications(new ArrayList<>(){{ add(embeddedDataSpecification) ; }} );

        Submodel submodel = new DefaultSubmodel.Builder()
                .idShort("submodel_idShort")
                .identification(new DefaultIdentifier.Builder().identifier("http://example.org/TestSubmodel").idType(IdentifierType.IRI).build())
                .submodelElements(new ArrayList<>() {{add(pr);}})
                .build();

        AssetAdministrationShellEnvironment assetAdministrationShellEnvironment = ConstraintTestHelper
                .createEnvironment(
                        submodel,
                        new ArrayList<>() {{add(cd);}}
                );


        ShaclValidator.getInstance().validate(assetAdministrationShellEnvironment);

    }
}