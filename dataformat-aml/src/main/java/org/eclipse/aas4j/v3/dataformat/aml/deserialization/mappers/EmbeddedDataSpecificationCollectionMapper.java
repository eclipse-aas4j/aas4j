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

// TODO import io.adminshell.aas.v3.model.impl.DefaultDataSpecificationIEC61360;
// TODO import io.adminshell.aas.v3.model.impl.DefaultEmbeddedDataSpecification;


// TODO solve the EmbeddedDataSpecifciation issue
/*
public class EmbeddedDataSpecificationCollectionMapper extends DefaultMapper<Collection<EmbeddedDataSpecification>> {

    @Override
    protected Collection mapCollectionValueProperty(AmlParser parser, MappingContext context) throws MappingException {

        List<InternalElementType> internalElementTypeList = findInternalElements(parser.getCurrent(),
                x -> x.getName().equalsIgnoreCase("EmbeddedDataSpecification"));
        Collection result = new ArrayList<>();
        CAEXObject current = parser.getCurrent();

        for (InternalElementType internalElementType : internalElementTypeList) {
            try {
                parser.setCurrent(internalElementType);
                //TODO use TypeFactory instead of hardcoded DefaultEmbeddedDataSpecification.class
                EmbeddedDataSpecification embeddedDataSpecification = context.getTypeFactory().newInstance(DefaultEmbeddedDataSpecification.class);

                //TODO get dataSpecificationClass from DataSpecificationManager
                DataSpecificationIEC61360 dataspecification = context.withoutProperty().map(DefaultDataSpecificationIEC61360.class, parser);

                embeddedDataSpecification.setDataSpecificationContent(dataspecification);
                result.add(embeddedDataSpecification);

            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new MappingException("error mapping Collection<EmbeddedDataSpecification>");
            }
        }
        parser.setCurrent(current);
        return result;
    }

}*/
