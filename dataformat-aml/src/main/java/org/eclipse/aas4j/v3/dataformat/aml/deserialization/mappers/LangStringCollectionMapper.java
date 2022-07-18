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
package org.eclipse.aas4j.v3.dataformat.aml.deserialization.mappers;

import org.eclipse.aas4j.v3.dataformat.aml.deserialization.AmlParser;
import org.eclipse.aas4j.v3.dataformat.aml.deserialization.DefaultMapper;
import org.eclipse.aas4j.v3.dataformat.aml.deserialization.MappingContext;
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.LangString;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LangStringCollectionMapper extends DefaultMapper<Collection<LangString>> {

    @Override
    protected Collection mapCollectionValueProperty(AmlParser parser, MappingContext context) throws MappingException {
        AttributeType attribute = findAttribute(parser.getCurrent(), context.getProperty(), context, parser.getRefSemanticPrefix());
        List<AttributeType> values = findAttributes(attribute, x -> x.getName().startsWith("aml-lang="));
        List<LangString> result = new ArrayList<>();
        for (AttributeType value : values) {
            try {
                LangString newElement = context.getTypeFactory().newInstance(LangString.class);
                newElement.setLanguage(value.getName().substring(value.getName().indexOf("=") + 1));
                newElement.setText(String.valueOf(getValue(value)));
                result.add(newElement);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                throw new MappingException("error mapping Collection<LangString> - could not create new instance for interface LangString");
            }
        }
        return result;
    }

}
