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
package org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers;

import org.eclipse.aas4j.v3.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.AmlGenerator;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.DefaultMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.MappingContext;
import org.eclipse.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.AssetInformation;
import org.eclipse.aas4j.v3.model.SpecificAssetId;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IdentifierKeyValuePairCollectionMapper extends DefaultMapper<Collection<SpecificAssetId>> {

    private static final String ATTRIBUTE_NAME = "specificAssetId";

    @Override
    public void map(Collection<SpecificAssetId> value, AmlGenerator generator, MappingContext context) throws MappingException {
        if (value == null || context == null || value.isEmpty()) {
            return;
        }
        AttributeType.Builder wrapperBuilder = AttributeType.builder()
                .withName(ATTRIBUTE_NAME)
                .withRefSemantic(generator.refSemantic(AssetInformation.class, ATTRIBUTE_NAME));
        List<AttributeType> attributes = new ArrayList<>();
        for (SpecificAssetId element : value) {
            AttributeType.Builder builder = AttributeType.builder()
                    .withName(ATTRIBUTE_NAME + (value.size() > 1 ? "_" + (attributes.size() + 1) : ""));
            for (PropertyDescriptor property : AasUtils.getAasProperties(element.getClass())) {
                if (!skipProperty(property)) {
                    context.with(property)
                            .map(property.getReadMethod().getGenericReturnType(),
                                    getElemenetPropertyValue(element, property, context),
                                    generator.with(builder));
                }
            }
            attributes.add(builder.build());
        }
        attributes.forEach(x -> wrapperBuilder.addAttribute(x));
        generator.add(wrapperBuilder.build());
    }

    protected Object getElemenetPropertyValue(SpecificAssetId elemenet, PropertyDescriptor property, MappingContext context) throws MappingException {
        try {
            return property.getReadMethod().invoke(elemenet);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new MappingException("failed to get property value for property " + property.getName(), ex);
        }
    }
}
