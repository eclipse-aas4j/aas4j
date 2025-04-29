package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.junit.Test;

import java.util.Set;

public class SchemaValidatorTest {
    @Test
    public void testSimpleKey(){
        String payload = "@prefix aas: <https://admin-shell.io/aas/3/0/> .\n" +
                "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n" +
                "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" +
                "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n" +
                "@prefix xs: <http://www.w3.org/2001/XMLSchema#> .\n" +
                "\n" +
                "<something_142922d6> rdf:type aas:AssetAdministrationShell ;\n" +
                "    <https://admin-shell.io/aas/3/0/Identifiable/administration> [\n" +
                "        rdf:type aas:AdministrativeInformation ;\n" +
                "        <https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications> [\n" +
                "            rdf:type aas:EmbeddedDataSpecification ;\n" +
                "            <https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecification> [\n" +
                "                rdf:type aas:Reference ;\n" +
                "                <https://admin-shell.io/aas/3/0/Reference/type> <https://admin-shell.io/aas/3/0/ReferenceTypes/ExternalReference> ;\n" +
                "                <https://admin-shell.io/aas/3/0/Reference/keys> [\n" +
                "                    rdf:type aas:Key ;\n" +
                "                    <https://admin-shell.io/aas/3/0/Key/type> <https://admin-shell.io/aas/3/0/KeyTypes/GlobalReference> ;\n" +
                "                    <https://admin-shell.io/aas/3/0/Key/value> \"urn:something14:18179b7a\"^^xs:string ;\n" +
                "                ] ;\n" +
                "            ] ;\n" +
                "            <https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecificationContent> [\n" +
                "                rdf:type aas:DataSpecificationIec61360 ;\n" +
                "                <https://admin-shell.io/aas/3/0/DataSpecificationIec61360/preferredName> [\n" +
                "                    rdf:type aas:LangStringPreferredNameTypeIec61360 ;\n" +
                "                    <https://admin-shell.io/aas/3/0/AbstractLangString/language> \"x-Sw4u3ZDO-nJLabnE\"^^xs:string ;\n" +
                "                    <https://admin-shell.io/aas/3/0/AbstractLangString/text> \"something_7282cc23\"^^xs:string ;\n" +
                "                ] ;\n" +
                "                <https://admin-shell.io/aas/3/0/DataSpecificationIec61360/preferredName> [\n" +
                "                    rdf:type aas:LangStringPreferredNameTypeIec61360 ;\n" +
                "                    <https://admin-shell.io/aas/3/0/AbstractLangString/language> \"en-UK\"^^xs:string ;\n" +
                "                    <https://admin-shell.io/aas/3/0/AbstractLangString/text> \"Something random in English 0843a1d1\"^^xs:string ;\n" +
                "                ] ;\n" +
                "                <https://admin-shell.io/aas/3/0/DataSpecificationIec61360/value> \"something_bebf64f0\"^^xs:string ;\n" +
                "            ] ;\n" +
                "        ] ;\n" +
                "        <https://admin-shell.io/aas/3/0/AdministrativeInformation/version> \"1230\"^^xs:string ;\n" +
                "        <https://admin-shell.io/aas/3/0/AdministrativeInformation/revision> \"0\"^^xs:string ;\n" +
                "        <https://admin-shell.io/aas/3/0/AdministrativeInformation/creator> [\n" +
                "            rdf:type aas:Reference ;\n" +
                "            <https://admin-shell.io/aas/3/0/Reference/type> <https://admin-shell.io/aas/3/0/ReferenceTypes/ModelReference> ;\n" +
                "            <https://admin-shell.io/aas/3/0/Reference/keys> [\n" +
                "                rdf:type aas:Key ;\n" +
                "                <https://admin-shell.io/aas/3/0/Key/type> <https://admin-shell.io/aas/3/0/KeyTypes/Submodel> ;\n" +
                "                <https://admin-shell.io/aas/3/0/Key/value> \"urn:something11:6a596807\"^^xs:string ;\n" +
                "            ] ;\n" +
                "        ] ;\n" +
                "        <https://admin-shell.io/aas/3/0/AdministrativeInformation/templateId> \"something_cb08d136\"^^xs:string ;\n" +
                "    ] ;\n" +
                "    <https://admin-shell.io/aas/3/0/Identifiable/id> \"something_142922d6\"^^xs:string ;\n" +
                "    <https://admin-shell.io/aas/3/0/AssetAdministrationShell/assetInformation> [\n" +
                "        rdf:type aas:AssetInformation ;\n" +
                "        <https://admin-shell.io/aas/3/0/AssetInformation/assetKind> <https://admin-shell.io/aas/3/0/AssetKind/NotApplicable> ;\n" +
                "        <https://admin-shell.io/aas/3/0/AssetInformation/globalAssetId> \"something_eea66fa1\"^^xs:string ;\n" +
                "    ] ;\n" +
                ".";
        System.out.println(payload);
        Set<String> strings = new RDFSchemaValidator().validateSchema(payload);
        assert strings.size() == 0;

    }
}
