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
package io.adminshell.aas.v3.dataformat.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;

import io.adminshell.aas.v3.dataformat.core.CustomProperty;
import io.adminshell.aas.v3.dataformat.core.CustomSubProperty;
import io.adminshell.aas.v3.dataformat.core.CustomSubmodel;
import io.adminshell.aas.v3.dataformat.core.CustomSubmodel2;
import io.adminshell.aas.v3.dataformat.json.mixins.ReferenceMixin;
import io.adminshell.aas.v3.model.ClassA;
import io.adminshell.aas.v3.model.ClassB;
import io.adminshell.aas.v3.rc02.model.DataElement;
import io.adminshell.aas.v3.model.DummyInterface;
import io.adminshell.aas.v3.rc02.model.Identifiable;
import io.adminshell.aas.v3.rc02.model.Property;
import io.adminshell.aas.v3.rc02.model.Referable;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.rc02.model.SubmodelElement;
import io.adminshell.aas.v3.model.TypedProperty;
import io.adminshell.aas.v3.model.TypedSubProperty;

//review AAS-134: some basic, rather simple tests would be helpful to understand/document the cases for which the introspector is build for
//also some javadoc could help
public class ReflectionAnnotationIntrospectorTest {

    private static ReflectionAnnotationIntrospector introspector;
    private static ObjectMapper mapper;

    @Before
    public void setUp() throws Exception {
        introspector = new ReflectionAnnotationIntrospector();
        mapper = new ObjectMapper();
    }

    private AnnotatedClass getAnnotatedClass(Class<?> clazz) {
        return AnnotatedClassResolver.resolve(
                mapper.getSerializationConfig(),
                mapper.getTypeFactory().constructFromCanonical(clazz.getName()),
                null);
    }

    private TypeResolverBuilder<?> getTypeResolver(Class<?> clazz) {
        return introspector.findTypeResolver(
                mapper.getSerializationConfig(),
                getAnnotatedClass(clazz),
                mapper.getTypeFactory().constructFromCanonical(clazz.getName()));
    }

    @Test
    public void testFindTypeNameForClassesWithoutTypeInfo() throws Exception {
        List.of(String.class,
                Object.class,
                Integer.class,
                ReflectionAnnotationIntrospectorTest.class,
                ReferenceMixin.class,
                DummyInterface.class)
                .forEach(x -> assertNull(introspector.findTypeName(getAnnotatedClass(x))));
    }

    @Test
    public void testFindTypeNameForClassesWithTypeInfo() throws Exception {
        Map.of(CustomProperty.class, Property.class,
                CustomSubProperty.class, Property.class,
                TypedProperty.class, TypedProperty.class,
                TypedSubProperty.class, TypedSubProperty.class,
                CustomSubmodel.class, Submodel.class,
                CustomSubmodel2.class, Submodel.class
        ).entrySet()
                .forEach(x -> assertEquals(
                introspector.findTypeName(getAnnotatedClass(x.getKey())),
                x.getValue().getSimpleName()));
    }

    @Test
    public void testFindTypeResolverForClassesWithoutTypeInfo() throws Exception {
        List.of(String.class,
                Object.class,
                Integer.class,
                ReflectionAnnotationIntrospectorTest.class,
                ReferenceMixin.class,
                DummyInterface.class)
                .forEach(x -> {
                    TypeResolverBuilder<?> typeResolver = getTypeResolver(x);
                    assertNull(typeResolver);
                });
    }

    @Test
    public void testFindTypeResolverForClassesWithTypeInfo() throws Exception {
        List.of(CustomProperty.class,
                CustomSubProperty.class,
                TypedProperty.class,
                TypedSubProperty.class,
                CustomSubmodel.class,
                CustomSubmodel2.class
        ).forEach(x -> {
            TypeResolverBuilder<?> typeResolver = getTypeResolver(x);
            assertNotNull(typeResolver);
            TypeDeserializer typeDeserializer = typeResolver.buildTypeDeserializer(mapper.getDeserializationConfig(), mapper.getTypeFactory().constructFromCanonical(x.getName()), null);
            assertEquals("modelType", typeDeserializer.getPropertyName());
            assertEquals(JsonTypeInfo.As.PROPERTY, typeDeserializer.getTypeInclusion());
            assertEquals(TypeNameIdResolver.class, typeDeserializer.getTypeIdResolver().getClass());
        });
    }

    @Test
    public void testFindSubtypesForExternalClasses() throws Exception {
        List.of(String.class,
                Object.class,
                Integer.class,
                ReflectionAnnotationIntrospectorTest.class,
                ReferenceMixin.class,
                DummyInterface.class)
                .forEach(x -> {
                    List<NamedType> subtypes = introspector.findSubtypes(getAnnotatedClass(x));
                    assertTrue(subtypes == null || subtypes.isEmpty());
                });
    }

    @Test
    public void testFindSubtypesForCustomClassesInModelNamespace() throws Exception {
        List.of(ClassA.class,
                ClassB.class)
                .forEach(x -> {
                    List<NamedType> subtypes = introspector.findSubtypes(getAnnotatedClass(x));
                    assertTrue(subtypes == null || subtypes.isEmpty());
                });
    }

    @Test
    public void testFindSubtypesForCustomInterfacesInModelNamespace() throws Exception {
        List.of(TypedProperty.class)
                .forEach(x -> {
                    List<NamedType> subtypes = introspector.findSubtypes(getAnnotatedClass(x));
                    assertTrue(subtypes != null);
                    assertTrue(!subtypes.isEmpty());
                });
    }

    @Test
    public void testFindSubtypesForInterfacesWithSubtypes() throws Exception {
        List.of(SubmodelElement.class,
                Referable.class,
                DataElement.class,
                Identifiable.class)
                .forEach(x -> {
                    List<NamedType> subtypes = introspector.findSubtypes(getAnnotatedClass(x));
                    assertTrue(subtypes != null);
                    assertTrue(!subtypes.isEmpty());
                });
    }

}
