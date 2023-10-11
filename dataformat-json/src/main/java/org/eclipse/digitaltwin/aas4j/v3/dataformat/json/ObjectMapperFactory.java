package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;

/**
 * This class contains the initialization code used by the JsonSerializer and JsonDeserializer. It also contains a
 * factory method, that is very useful to be used in SpringBoot environment, to automate the serialization. Here is a
 * sample code:
 * <pre>
 * {@code @Configuration}
 * public class JacksonConfig {
 *     {@code @Bean}
 *     {@code @Primary}
 *     public ObjectMapper objectMapper() {
 *         return ObjectMapperFactory.createMapper();
 *     }
 *  </pre>
 *  Having such JacksonConfig class in your SpringBoot web application, the framework will always use the created mapper
 *  for serialization and deserialization, and you don't need to carry about it anymore.
 */
public class ObjectMapperFactory {
    private ObjectMapperFactory() {}

    /**
     * The factory method to create the object mapper for serialization/deserialization of AAS objects.
     * @return the configured object mapper. According to the Jackson documentation the ObjectMapper class is
     * thread-safe.
     *
     * The returned object mapper can be used directly for AAS serialization/deserialization, or you can use the utility
     * JsonSerializer and JsonDeserializer wrapper classes.
     */
    public static ObjectMapper createMapper() {
        return createMapper(null);
    }

    /**
     * A package-private method used by JsonDeserializer wrapper class. It is needed only to support its
     * useImplementation method, which require modification of the type resolver.
     * @param typeResolver The type resolver used for deserialization.
     * @return the configured object mapper. According to the Jackson documentation the ObjectMapper class is
     * thread-safe.
     */
    static ObjectMapper createMapper(SimpleAbstractTypeResolver typeResolver) {
        ObjectMapper mapper = JsonMapper.builder()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .serializationInclusion(JsonInclude.Include.NON_NULL)
            .serializationInclusion(JsonInclude.Include.NON_EMPTY)
            .annotationIntrospector(new ReflectionAnnotationIntrospector())
            .addModule(buildEnumModule())
            .addModule(buildTypeResolverModule(typeResolver))
            .build();
        ReflectionHelper.JSON_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
        return mapper;
    }

    /**
     * A package-private method, to create a type resolver, which is used for serialization/deserialization of AAS
     * object.
     * @return the type resolver.
     */
    static SimpleAbstractTypeResolver createTypeResolver() {
        SimpleAbstractTypeResolver typeResolver = new SimpleAbstractTypeResolver();
        ReflectionHelper.DEFAULT_IMPLEMENTATIONS
                .stream()
                .forEach(x -> typeResolver.addMapping(x.getInterfaceType(), x.getImplementationType()));
        return typeResolver;
    }

    private static SimpleModule buildTypeResolverModule(SimpleAbstractTypeResolver typeResolver) {
        final SimpleModule module = new SimpleModule();
        if(typeResolver == null) {
            typeResolver = createTypeResolver();
        }
        module.setAbstractTypes(typeResolver);
        return module;
    }

    private static SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        ReflectionHelper.ENUMS.forEach(x -> {
            module.addDeserializer(x, new EnumDeserializer<>(x));
            module.addSerializer(x, new EnumSerializer());
        });
        return module;
    }
}
