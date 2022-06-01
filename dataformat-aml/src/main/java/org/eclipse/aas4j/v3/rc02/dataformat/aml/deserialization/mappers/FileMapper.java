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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.mappers;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.AmlParser;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.DefaultMapper;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.MappingContext;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.InterfaceClassType;
import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.rc02.model.File;

import java.beans.PropertyDescriptor;
import java.util.List;

/**
 *
 */
public class FileMapper extends DefaultMapper<File> {

    protected static PropertyDescriptor PROPERTY_VALUE = AasUtils.getProperty(File.class, "value");
    protected static PropertyDescriptor PROPERTY_MIME_TYPE = AasUtils.getProperty(File.class, "mimeType");

    private static final String FILE_DATA_REFERENCE = "AssetAdministrationShellInterfaceClassLib/FileDataReference";
    private static final String MIME_TYPE_ATTRIBUTE_PATH = "AAS:File/MIMEType";
    private static final String REF_URI_ATTRIBUTE_PATH = "AAS:File/refURI";

    public FileMapper() {
        super(PROPERTY_VALUE.getName(), PROPERTY_MIME_TYPE.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        List<InterfaceClassType> externalInterfaces = findExternalInterface(parser.getCurrent(), x -> x.getRefBaseClassPath().equalsIgnoreCase(FILE_DATA_REFERENCE));
        if (externalInterfaces == null || externalInterfaces.size() == 0)
            throw new MappingException(String.format("no external interfaces are found in file %s %s", parser.getCurrent().getID(), parser.getCurrent().getName()));

        if (externalInterfaces.size() > 1)
            throw new MappingException(String.format("multiple external interfaces are found in file %s %s", parser.getCurrent().getID(), parser.getCurrent().getName()));

        List<AttributeType> attributeTypes = externalInterfaces.get(0).getAttribute();

        AttributeType mimeTypeAttribute = attributeTypes.stream()
                .filter(x -> x.getRefSemantic().get(0).getCorrespondingAttributePath().equalsIgnoreCase(MIME_TYPE_ATTRIBUTE_PATH))
                .findFirst().orElse(null);
        AttributeType refUriAttribute = attributeTypes.stream()
                .filter(x -> x.getRefSemantic().get(0).getCorrespondingAttributePath().equalsIgnoreCase(REF_URI_ATTRIBUTE_PATH)).findFirst().orElse(null);

        if (refUriAttribute != null)
            ((File) parent).setValue(refUriAttribute.getValue() == null ? null : refUriAttribute.getValue().toString());

        if (mimeTypeAttribute != null)
            ((File) parent).setContentType(mimeTypeAttribute.getValue() == null ? null : mimeTypeAttribute.getValue().toString());

        super.mapProperties(parent, parser, context);
    }

}
