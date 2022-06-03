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
package io.adminshell.aas.v3.dataformat.aml.serialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.AttributeType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.RoleClassType;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.File;

public class FileMapper extends DefaultMapper<File> {

    private static final String FILE_INTERFACE_NAME = "FileDataReference";
    private static final String ATTRIBUTE_MIMETYPE_NAME = "MIMEType";
    private static final String ATTRIBUTE_MIMETYPE_DATATYPE = "xs:string";
    private static final String ATTRIBUTE_REFURI_NAME = "refURI";
    private static final String ATTRIBUTE_REFURI_DATATYPE = "xs:anyURI";

    public FileMapper() {
    }

    @Override
    protected InternalElementType.Builder toInternalElement(File value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType.Builder builder = super.toInternalElement(value, generator, context);
        if (builder != null) {
            builder.withExternalInterface(RoleClassType.ExternalInterface.builder()
                    .withID(generator.newId())
                    .withName(FILE_INTERFACE_NAME)
                    .withRefBaseClassPath(generator.getDocumentInfo().getAssetAdministrationShellInterfaceClassLib() + "/" + FILE_INTERFACE_NAME)
                    .addAttribute(AttributeType.builder()
                            .withName(ATTRIBUTE_MIMETYPE_NAME)
                            .withAttributeDataType(ATTRIBUTE_MIMETYPE_DATATYPE)
                            .withRefSemantic(generator.refSemantic(File.class, ATTRIBUTE_MIMETYPE_NAME))
                            .withValue(value.getContentType())
                            .build())
                    .addAttribute(AttributeType.builder()
                            .withName(ATTRIBUTE_REFURI_NAME)
                            .withValue(value.getValue())
                            .withAttributeDataType(ATTRIBUTE_REFURI_DATATYPE)
                            .withRefSemantic(generator.refSemantic(File.class, ATTRIBUTE_REFURI_NAME))
                            .build())
                    .build());
        }
        return builder;
    }
}
