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
package org.eclipse.aas4j.v3.dataformat.aml.serialization;

import org.eclipse.aas4j.v3.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

public class DefaultCollectionMapper<T> extends DefaultMapper<Collection<T>> {

    @Override
    protected Class<T> getType(Collection<T> collection, MappingContext context) {
        if (context.getProperty() != null) {
            return (Class<T>) ((ParameterizedType) context.getProperty().getReadMethod().getGenericReturnType()).getActualTypeArguments()[0];
        }
        if (collection != null && !collection.isEmpty()) {
            return (Class<T>) ReflectionHelper.getAasInterface(collection.iterator().next().getClass());
        }
        return null;
    }

    @Override
    protected void asInternalElement(Collection<T> collection, AmlGenerator generator, MappingContext context) throws MappingException {
        for (T element : collection) {
            context.withoutProperty().map(element, generator);
        }
    }

    @Override
    protected void mapProperties(Collection<T> collection, AmlGenerator generator, MappingContext context) throws MappingException {
    }

    @Override
    protected void asAttribute(Collection<T> collection, AmlGenerator generator, MappingContext context) throws MappingException {
        if (collection != null && !collection.isEmpty()) {
            AttributeType.Builder builder = super.toAttribute(collection, generator, context);
            for (T element : collection) {
                context.map(element, generator.with(builder));
            }
            generator.add(builder.build());
        }
    }

    @Override
    protected String getAttributeName(Collection<T> value, MappingContext context) {
        return context.getPropertyNamingStrategy().getName(
                context.getProperty().getReadMethod().getDeclaringClass(),
                value,
                context.getProperty().getName());
    }
}
