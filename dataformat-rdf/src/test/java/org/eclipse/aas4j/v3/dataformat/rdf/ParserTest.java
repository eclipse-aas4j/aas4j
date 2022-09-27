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
package org.eclipse.aas4j.v3.dataformat.rdf;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.eclipse.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.model.*;
import org.apache.jena.riot.RDFLanguages;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;

@RunWith(JUnitParamsRunner.class)
public class ParserTest {

    @Test
    public void parseAASEnvironmentTest() throws IOException, DeserializationException {
        String aasEnvAsString = SerializerUtil.readResourceToString("example-from-serializer.jsonld");
        Environment aasEnv = new Serializer().read(aasEnvAsString);
        Assert.assertEquals(1, aasEnv.getSubmodels().size());
        Assert.assertEquals(1, aasEnv.getAssetAdministrationShells().get(0).getDescription().size());
        Assert.assertEquals(2, aasEnv.getAssetAdministrationShells().get(0).getDisplayName().size());

        Assert.assertEquals("de", aasEnv.getAssetAdministrationShells().get(0).getDisplayName().get(0).getLanguage());
        Assert.assertEquals("en", aasEnv.getAssetAdministrationShells().get(0).getDisplayName().get(1).getLanguage());
        Assert.assertNotNull(aasEnv.getAssetAdministrationShells().get(0).getDescription().get(0).getLanguage());


    }

    @Test
    @Parameters({"AAS_Reference_shortExample.ttl", "AssetAdministrationShell_Example.ttl",
            "Complete_Example.ttl", "ReferenceExample.ttl" /*, "KapitalVerwaltungsschaleExample.ttl"*/})
    public void parseAasTurtleSchemaExamplesTest(String file) throws IOException, DeserializationException {
        Serializer serializer = new Serializer();

        AssetAdministrationShell aas = serializer.deserialize(SerializerUtil.readResourceToString(file), AssetAdministrationShell.class, RDFLanguages.TURTLE);

        Assert.assertNotNull(aas.getAssetInformation().getAssetKind());
    }

    @Test
    @Parameters({ "AAS_Reference_shortExample.nt",  "Overall-Example.nt"})
    public void parseAasNtriplesSchemaExamplesTest(String file) throws IOException, DeserializationException {
        Serializer serializer = new Serializer();

        AssetAdministrationShell aas = serializer.deserialize(SerializerUtil.readResourceToString(file), AssetAdministrationShell.class, RDFLanguages.TURTLE);

        Assert.assertNotNull(aas.getAssetInformation().getAssetKind());
    }

    @Test
    @Parameters({"Submodel_SubmodelElement_Example.ttl"})
    public void parseSubmodelSchemaExamplesTest(String file) throws IOException, DeserializationException {
        Serializer serializer = new Serializer();
        //These work

        Submodel submodel = serializer.deserialize(SerializerUtil.readResourceToString(file), Submodel.class, RDFLanguages.TURTLE);

        Assert.assertNotNull(submodel.getSubmodelElements().get(0).getIdShort());


        //The following examples do not work yet, as they are semantically problematic
        //serializer.deserialize(SerializerUtil.readResourceToString("Submodel_SubmodelElement_shortExample.ttl"), Reference.class, RDFLanguages.TURTLE);
        //serializer.deserialize(SerializerUtil.readResourceToString("Submodel_SubmodelElement_shortExample.nt"), Reference.class, RDFLanguages.NTRIPLES);
    }




    @Test
    public void serializeConceptDescription() throws IOException, DeserializationException {
        String conceptDescription = "{\n" +
                "  \"@context\" : {\n" +
                "    \"aas\" : \"https://admin-shell.io/aas/3/0/RC02/\",\n" +
                "    \"phys_unit\" : \"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/\",\n" +
                "    \"iec61360\" : \"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/\"\n" +
                "  },\n" +
                "    \"@id\" : \"https://admin-shell.io/autogen/DefaultConceptDescription/c6bd22b3-6487-49d2-a86d-e3834d22ceb9\",\n" +
                "    \"@type\" : \"aas:ConceptDescription\",\n" +
                "    \"isCaseOf\" : [ ],\n" +
                "    \"https://admin-shell.io/aas/3/0/RC02/HasExtensions/extension\" : [ ],\n" +
                "    \"https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications\" : [ {\n" +
                "      \"@id\" : \"https://admin-shell.io/autogen/DefaultDataSpecification/f461858c-8981-4141-bac3-6aee56977017\",\n" +
                "      \"@type\" : \"aas:EmbeddedDataSpecification\",\n" +
                "      \"https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecifiation\" : {\n" +
                "        \"@id\" : \"https://admin-shell.io/autogen/DefaultReference/41ee5bcc-adde-4a5a-bfb5-ace237247d0c\",\n" +
                "        \"@type\" : \"aas:Reference\",\n" +
                "        \"https://admin-shell.io/aas/3/0/RC02/Reference/key\" : [ {\n" +
                "          \"@id\" : \"https://admin-shell.io/autogen/DefaultKey/234b457f-0e8f-46b3-8e73-f850a79269f1\",\n" +
                "          \"@type\" : \"aas:Key\",\n" +
                "          \"https://admin-shell.io/aas/3/0/RC02/Key/value\" : \"https://example.org\"\n" +
                "        } ]\n" +
                "      },\n" +
                "      \"https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecificationContent\" : {\n" +
                "        \"@id\" : \"https://admin-shell.io/autogen/DefaultDataSpecificationIEC61360/457288b3-77e1-474a-ab74-866bdcafd914\",\n" +
                "        \"@type\" : \"iec61360:DataSpecificationIEC61360\",\n" +
                "        \"https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/dataType\" : {\n" +
                "          \"@type\" : \"https://admin-shell.io/aas/3/0/RC02/DataTypeIEC61360\",\n" +
                "          \"@id\" : \"https://admin-shell.io/aas/3/0/RC02/RATIONAL\"\n" +
                "        },\n" +
                "        \"https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/definition\" : [ ],\n" +
                "        \"https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/preferredName\" : [ ],\n" +
                "        \"https://admin-shell.io/aas/3/0/RC02/DataSpecificationIEC61360/shortName\" : [ ]\n" +
                "      },\n" +
                "      \"https://admin-shell.io/aas/3/0/RC02/DataSpecification/id\" : \"http://example.org/DataSpecification1\"\n" +
                "    } ]\n" +
                "}";

        Serializer serializer = new Serializer();
        ConceptDescription c = serializer.deserialize(conceptDescription, ConceptDescription.class);

        Assert.assertNotNull(c);
    }

}
