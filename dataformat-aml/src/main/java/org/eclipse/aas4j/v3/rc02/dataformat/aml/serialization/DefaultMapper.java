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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.InternalElementType;
import org.eclipse.aas4j.v3.rc02.dataformat.core.ReflectionHelper;
import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.rc02.model.Referable;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DefaultMapper<T> implements Mapper<T> {

    private final Set<String> ignoredProperties = new HashSet<>();

    public DefaultMapper() {
    }

    public DefaultMapper(String... ignoredProperties) {
        this.ignoredProperties.addAll(Arrays.asList(ignoredProperties));
    }

    protected Class<?> getType(T value, MappingContext context) {
        return value.getClass();
    }

    @Override
    public void map(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        if (value == null || context == null) {
            return;
        }
        Class<?> aasType = getType(value, context);
        if (aasType == null) {
            return;
        }
        Class<?> aasTypeInfo = ReflectionHelper.getMostSpecificTypeWithModelType(aasType);
        if (aasTypeInfo != null) {
            asInternalElement(value, generator, context);
        } else {
            asAttribute(value, generator, context);
        }
    }

    protected void asInternalElement(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType.Builder builder = toInternalElement(value, generator, context);
        if (builder != null) {
            generator.with(builder).appendReferenceTargetInterfaceIfRequired(value, context);
            generator.addInternalElement(builder.build(), value);
        }
    }

    protected void asAttribute(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        AttributeType.Builder builder = toAttribute(value, generator, context);
        if (builder != null) {
            generator.add(builder.build());
        }
    }

    protected InternalElementType.Builder toInternalElement(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType.Builder builder = InternalElementType.builder();
        builder = builder
                .withName(getInternalElementName(value, context))
                .withRoleRequirements(getRoleRequirementClass(value, generator, context));
        AmlGenerator subGenerator = generator;
        if (Referable.class.isAssignableFrom(value.getClass())) {
            subGenerator = generator.with((Referable) value);
        }
        mapProperties(value, subGenerator.with(builder), context);
        return builder;
    }

    protected InternalElementType.RoleRequirements getRoleRequirementClass(T value, AmlGenerator generator, MappingContext context) {
        return generator.roleRequirement(ReflectionHelper.getModelType(value.getClass()));
    }

    protected AttributeType.RefSemantic getRefSemantic(T value, AmlGenerator generator, MappingContext context) {
        return generator.refSemantic(
                context.getProperty(),
                context.getPropertyNamingStrategy().getNameForRefSemantic(
                        context.getProperty().getReadMethod().getGenericReturnType(),
                        value,
                        context.getProperty().getName()));
    }

    protected String getInternalElementName(Object value, MappingContext context) {
        return context.getClassNamingStrategy().getName(
                value.getClass(),
                value,
                null);
    }

    protected String getAttributeName(T value, MappingContext context) {
        return context.getPropertyNamingStrategy().getName(
                context.getProperty().getReadMethod().getGenericReturnType(),
                value,
                context.getProperty().getName());
    }

    protected AttributeType.Builder toAttribute(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        Class<?> aasType = value != null
                ? ReflectionHelper.getAasInterface(value.getClass())
                : null;
        AttributeType.Builder builder = AttributeType.builder();
        if (context.getProperty() != null) {
            builder = builder
                    .withName(getAttributeName(value, context))
                    .withRefSemantic(getRefSemantic(value, generator, context));
        }
        if (aasType != null) {
            mapProperties(value, generator.with(builder), context);
        } else {
            builder = builder.withValue(value);
        }
        return builder;
    }

    protected boolean skipProperty(PropertyDescriptor property) {
        return ignoredProperties.contains(property.getName());
    }

    protected void mapProperties(T value, AmlGenerator generator, MappingContext context) throws MappingException {
        for (PropertyDescriptor property : AasUtils.getAasProperties(value.getClass())) {
            if (!skipProperty(property)) {
                context.with(property)
                        .map(property.getReadMethod().getGenericReturnType(),
                                getPropertyValue(value, property, context),
                                generator);
            }
        }
    }

    protected Object getPropertyValue(T value, PropertyDescriptor property, MappingContext context) throws MappingException {
        try {
            return property.getReadMethod().invoke(value);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new MappingException("failed to get property value for property " + property.getName(), ex);
        }
    }

}
