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

// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;


// TODO solve the EmbeddedDataSpecifciation issue
/*
public class EmbeddedDataSpecificationCollectionMapper extends DefaultMapper<Collection<EmbeddedDataSpecification>> {

    @Override
    public void map(Collection<EmbeddedDataSpecification> value, AmlGenerator generator, MappingContext context) throws MappingException {
        if (value == null || context == null || value.isEmpty()) {
            return;
        }
        long countAttributes = value.stream().filter(x -> x.getDataSpecificationContent() == null).count();
        long countInternalElement = value.size() - countAttributes;
        List<AttributeType> attributes = new ArrayList<>();
        List<InternalElementType> internalElements = new ArrayList<>();
        for (EmbeddedDataSpecification element : value) {
            if (element.getDataSpecificationContent() == null) {
                AttributeType.Builder builder = AttributeType.builder()
                        .withName("hasDataSpecification" + (countAttributes > 1 ? "_" + (attributes.size() + 1) : ""))
                        .withValue(AasUtils.asString(element.getDataSpecification()))
                        .withRefSemantic(generator.refSemantic(ConceptDescription.class, "dataSpecification"));
                attributes.add(builder.build());
            } else {
                DataSpecificationInfo dataSpecification = DataSpecificationManager.getDataSpecification(element.getDataSpecificationContent().getClass());
                if (dataSpecification == null) {
                    throw new MappingException("unkown data specification " + element.getDataSpecificationContent().getClass());
                }
                InternalElementType.Builder temp = InternalElementType.builder();
                AmlGenerator subGenerator = generator.with(temp).withRefSemanticPrefix(dataSpecification.getPrefix());
                context.map(element.getDataSpecificationContent(), subGenerator);
                InternalElementType.Builder builder = InternalElementType.copyOf(temp.build().getInternalElement().get(0))
                        .withName("EmbeddedDataSpecification" + (countInternalElement > 1 ? "_" + (internalElements.size() + 1) : ""))
                        .withID(generator.getId(value))
                        .withRefBaseSystemUnitPath(generator.getDocumentInfo().getDataSpecificationTemplatesSystemUnitClassLib()
                                + "/" + getDataSpecificationContentType(element.getDataSpecificationContent().getClass()) + "Template/"
                                + getDataSpecificationContentType(element.getDataSpecificationContent().getClass()));
                internalElements.add(builder.build());
            }
        }
        attributes.forEach(x -> generator.addAttribute(x));
        if (internalElements.size() > 1) {
            InternalElementType wrapper = InternalElementType.builder()
                    .withName("EmbeddedDataSpecifications")
                    .addInternalElement(internalElements)
                    .build();
            generator.addInternalElement(wrapper);
        } else {
            internalElements.forEach(x -> generator.addInternalElement(x));
        }
    }

    private String getDataSpecificationContentType(Class<?> type) {
        // TODO should be resolved using DataSpecificationManager but this requires fundamental changes to 
        // DataSpecificationManager as it currently is based on Reference instead of name
        // workaround: go up superclasses/interfaces and find most-specific interface that extends DataSpecificationContent
        if (type == null) {
            return null;
        }
        Class[] interfaces = type.getInterfaces();
        for (Class temp : interfaces) {
            if (DataSpecificationContent.class.isAssignableFrom(temp)) {
                return temp.getSimpleName();
            }
        }
        return getDataSpecificationContentType(type.getSuperclass());
    }
}*/
