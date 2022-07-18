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
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.CAEXObject;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.Qualifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConstraintCollectionMapper extends DefaultMapper<Collection<Qualifier>> {


    public static final String QUALIFIABLE_ATTRIBUTE_PATH = "AAS:Qualifiable";

    @Override
    protected Collection mapCollectionValueProperty(AmlParser parser, MappingContext context) throws MappingException {

        //TODO: Need to register specific type Qualifiable
        if (!context.getProperty().getName().equalsIgnoreCase("Qualifiers")) {
            return super.mapCollectionValueProperty(parser, context);
        }

        List<AttributeType> values = findAttributes(parser.getCurrent(),
                x -> x.getRefSemantic().stream().anyMatch(y -> y.getCorrespondingAttributePath().contains(QUALIFIABLE_ATTRIBUTE_PATH)));

        CAEXObject current = parser.getCurrent();
        Collection result = new ArrayList<>();
        for (AttributeType value : values) {
            parser.setCurrent(value);
            Object o = context.withoutProperty().map(Qualifier.class, parser);
            result.add(o);
        }
        parser.setCurrent(current);
        return result;
    }

}
