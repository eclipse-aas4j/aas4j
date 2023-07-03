/*
 * Copyright (c) 2023 SAP SE
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

import java.util.List;

public class TestDataHelper {

    public static final String DEFAULT_IDENTIFICATION = "identification";

    public static final Reference DEFAULT_SEMANTIC_ID =
            new DefaultReference.Builder().type(ReferenceTypes.EXTERNAL_REFERENCE)
                    .keys(new DefaultKey.Builder().type(KeyTypes.GLOBAL_REFERENCE).value("eClassDefaultSemanticId").build())
                    .build();

    public static final EmbeddedDataSpecification DEFAULT_EMBEDDED_DATA_SPECIFICATION = new DefaultEmbeddedDataSpecification.Builder()
            .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder().build())
            .dataSpecification(createGlobalReference("defaultEmbeddedDataSpecificationDataSpecificationValue")).build();

    public static final AdministrativeInformation DEFAULT_ADMINISTRATIVE_INFORMATION =
            new DefaultAdministrativeInformation.Builder()
                    .embeddedDataSpecifications(DEFAULT_EMBEDDED_DATA_SPECIFICATION)
                    .revision("defaultAdministrativeInformationRevisionValue")
                    .version("defaultAdministrativeInformationVersionValue").build();

    public static final List<LangStringTextType> DEFAULT_DESCRIPTION = List.of(createLangStringTextType("en", "defaultDescription"));

    public static final List<LangStringNameType> DEFAULT_DISPLAY_NAME = List.of(createLangStringNameType("en", "defaultDisplayName"));

    public static final String DEFAULT_ID_SHORT = "defaultIdShort";




    public static LangString createLangString(String langCode, String text) {
        return new DefaultLangString.Builder().language(langCode).text(text).build();
    }

    public static LangStringTextType createLangStringTextType(String langCode, String text) {
        return new DefaultLangStringTextType.Builder().language(langCode).text(text).build();
    }

    public static LangStringNameType createLangStringNameType(String langCode, String text) {
        return new DefaultLangStringNameType.Builder().language(langCode).text(text).build();
    }

    public static Reference createReference(ReferenceTypes type, KeyTypes keyType, String value) {
        return new DefaultReference.Builder().type(type).keys(createKey(keyType, value)).build();
    }

    public static Reference createGlobalReference(String value) {
        return createReference(ReferenceTypes.EXTERNAL_REFERENCE, KeyTypes.GLOBAL_REFERENCE, value);
    }

    public static DefaultEndpoint.Builder createEndpointBuilder() {

        String DEFAULT_INTERFACE_VALUE = "defaultInterface";

        return new DefaultEndpoint.Builder()
                .protocolInformation(createProtocolInformationBuilder().build())
                .withInterface(DEFAULT_INTERFACE_VALUE);
    }

    public static Key createKey(KeyTypes type, String value) {
        return new DefaultKey.Builder().type(type).value(value).build();
    }

    public static DefaultProtocolInformation.Builder createProtocolInformationBuilder() {
        return new DefaultProtocolInformation.Builder()
                .endpointAddress("defaultEndpointAddress")
                .endpointProtocol("defaultEndpointProtocol")
                .endpointProtocolVersion("defaultEndpointProtocolVersion")
                .subprotocol("defaultSubprotocol")
                .subprotocolBody("defaultSubprotocolBody")
                .subprotocolBodyEncoding("defaultSubprotocolBodyEncoding");
    }
}
