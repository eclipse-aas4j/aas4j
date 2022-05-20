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
package io.adminshell.aas.v3.dataformat.aml.deserialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.deserialization.AmlParser;
import io.adminshell.aas.v3.dataformat.aml.deserialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.AttributeType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXObject;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.ConceptDescription;
import io.adminshell.aas.v3.model.Reference;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ConceptDescriptionMapper extends DefaultMapper<ConceptDescription> {

    public static final String ATTRIBUTE_PATH_ISCASEOF = "AAS:ConceptDescription/isCaseOf";
    protected static PropertyDescriptor PROPERTY_ISCASEOF = AasUtils.getProperty(ConceptDescription.class, "isCaseOfs");

    public ConceptDescriptionMapper() {
        super(PROPERTY_ISCASEOF.getName());
    }

    @Override
    protected void mapProperties(Object parent, AmlParser parser, MappingContext context) throws MappingException {
        if (parent == null || context == null) {
            return;
        }

        CAEXObject temp = parser.getCurrent();
        List<AttributeType> attributeTypeList = findAttributesByCorrespondingAttributePath(parser.getCurrent(), ATTRIBUTE_PATH_ISCASEOF);
        List<Reference> referenceList = new ArrayList<>();
        if(!attributeTypeList.isEmpty()){
            //TODO How to handle multiple references in isCaseOf?
            AttributeType attribute = attributeTypeList.get(0);
            parser.setCurrent(attribute);
            Reference reference = context.map(Reference.class, parser);
            parser.setCurrent(temp);
            referenceList.add(reference);
        }

        ((ConceptDescription) parent).setIsCaseOfs(referenceList);

        super.mapProperties(parent, parser, context);
    }

}
