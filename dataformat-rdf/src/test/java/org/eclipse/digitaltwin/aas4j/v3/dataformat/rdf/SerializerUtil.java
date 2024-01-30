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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;


import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

/**
 * Helper class for Serializer Tests
 *
 * @author sbader
 *
 */
public class SerializerUtil {

    public static String readResourceToString(String resourceName) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(resourceName);
        StringWriter writer = new StringWriter();
        IOUtils.copy(is, writer, "UTF-8");
        return writer.toString();
    }

    public static String stripWhitespaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static DefaultDataSpecificationIec61360 getDataSpecificationIec61360() {
        return new DefaultDataSpecificationIec61360.Builder()
                .dataType(DataTypeIec61360.STRING)
                .value("exampleValue")
                .symbol("g")
                .unit("gram")
                .sourceOfDefinition("external")
                .valueList(new DefaultValueList.Builder()
                        .valueReferencePairs(List.of(
                                new DefaultValueReferencePair.Builder()
                                        .value("refVal1")
                                        .valueId(new DefaultReference.Builder()
                                                .keys(new DefaultKey.Builder()
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .value("externalKey1")
                                                        .build())
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build()
                                , new DefaultValueReferencePair.Builder()
                                        .value("refVal2")
                                        .valueId(new DefaultReference.Builder()
                                                .keys(List.of(
                                                        new DefaultKey.Builder()
                                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                                .value("externalKey2")
                                                                .build(),
                                                        new DefaultKey.Builder()
                                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                                .value("fragment2")
                                                                .build()
                                                ))
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build()
                        ))
                        .build()
                )
                .definition(List.of(
                        new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("definition1")
                                .language("en")
                                .build(),
                        new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("definition2")
                                .language("de")
                                .build()
                ))
                .preferredName(List.of(
                        new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                .text("preferred1")
                                .language("en")
                                .build(),
                        new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                .text("preferred2")
                                .language("de")
                                .build()
                ))
                .shortName(List.of(
                        new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("short1")
                                .language("en")
                                .build(),
                        new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("short2")
                                .language("de")
                                .build()
                ))
                .levelType(new DefaultLevelType.Builder()
                        .build())
                .build();
    }
    public static EmbeddedDataSpecification getEmbeddedDataSpecifications() {
        return new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecification(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE).build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .dataSpecificationContent(
                        new DefaultDataSpecificationIec61360.Builder()
                                .levelType(new DefaultLevelType.Builder()
                                        .max(true).min(true).nom(false).typ(false)
                                        .build())
                                .unit("gram")
                                .symbol("g")
                                .dataType(DataTypeIec61360.INTEGER_MEASURE).build())
                .build();
    }
    public static EmbeddedDataSpecification getMaximalEmbeddedDataSpecifications() {
        return new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecification(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE).build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .dataSpecificationContent(getDataSpecificationIec61360())
                .build();
    }

    static List<Reference> getIsCaseOfs() {
        return Arrays.asList(
                new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .value("https://example.com/outside")
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE).build());
    }

    static AdministrativeInformation getAdministrativeInformation() {
        return new DefaultAdministrativeInformation.Builder()
                .version("1")
                .revision("0")
                .creator(new DefaultReference.Builder().keys(
                                Arrays.asList(new DefaultKey.Builder()
                                                .value("https://example.com")
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .build(),
                                        new DefaultKey.Builder()
                                                .value("fragment")
                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                .build()))
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build();
    }

    static List<LangStringTextType> getDescriptions() {
        return Arrays.asList(
                new DefaultLangStringTextType.Builder()
                        .text("A long text in English")
                        .language("en")
                        .build(),
                new DefaultLangStringTextType.Builder()
                        .text("영어로 된 긴 텍스트")
                        .language("ko")
                        .build());
    }

    static List<LangStringNameType> getDisplayNames() {
        return Arrays.asList(
                new DefaultLangStringNameType.Builder()
                        .text("text in English")
                        .language("en")
                        .build(),
                new DefaultLangStringNameType.Builder()
                        .text("متن به فارسی")
                        .language("fa")
                        .build());
    }

    static List<Extension> getExtensionList() {
        return Arrays.asList(
                new DefaultExtension.Builder()
                        .name("extension1")
                        .value("extension1Value")
                        .build(),
                new DefaultExtension.Builder()
                        .name("extension2")
                        .value("extension2Value")
                        .build());
    }
}
