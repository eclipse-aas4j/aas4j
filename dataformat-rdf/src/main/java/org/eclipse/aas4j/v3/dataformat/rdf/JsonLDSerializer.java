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
package org.eclipse.aas4j.v3.dataformat.rdf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;


public class JsonLDSerializer extends BeanSerializer {

    private final Logger logger = LoggerFactory.getLogger(JsonLDSerializer.class);

    private static int currentRecursionDepth = 0;

    static final Map<String, String> contextItems = new HashMap<>();

    private final Map<Object, String> idMap;

    JsonLDSerializer(BeanSerializerBase src, Map<Object, String> idMap) {
        super(src);
        this.idMap = Objects.requireNonNullElseGet(idMap, HashMap::new);
    }



    @Override
    public void serializeWithType(Object bean, JsonGenerator gen, SerializerProvider provider, TypeSerializer typeSer) throws IOException {
        gen.setCurrentValue(bean);

        currentRecursionDepth++;
        gen.writeStartObject();

        if (currentRecursionDepth == 1) {
            Map<String, String> filteredContext = new HashMap<>();
            filterContextWrtBean(bean, filteredContext);
            gen.writeObjectField("@context", filteredContext);
            //gen.writeStringField("@context", "https://jira.iais.fraunhofer.de/stash/projects/ICTSL/repos/ids-infomodel-commons/raw/jsonld-context/3.0.0/context.jsonld"); // only add @context on top level

        }

        if(idMap.containsKey(bean))
        {
            gen.writeStringField("@id", idMap.get(bean));
        }
        else
        {
            String randomUri = "https://admin-shell.io/autogen/" + bean.getClass().getSimpleName() + "/" + UUID.randomUUID();
            idMap.put(bean, randomUri);
            gen.writeStringField("@id", randomUri);
        }

        WritableTypeId typeIdDef = _typeIdDef(typeSer, bean, JsonToken.START_OBJECT);
        String resolvedTypeId = typeIdDef.id != null ? typeIdDef.id.toString() : typeSer.getTypeIdResolver().idFromValue(bean);
        if (resolvedTypeId != null) {
            gen.writeStringField(typeIdDef.asProperty, resolvedTypeId);
        }
        if (_propertyFilterId != null) {
            serializeFieldsFiltered(bean, gen, provider);
        } else {
            serializeFields(bean, gen, provider);
        }
        gen.writeEndObject();
        currentRecursionDepth--;
    }


    private void filterContextWrtBean(Object bean, Map<String, String> filteredContext) {
        //Some default entries for AAS
        filteredContext.put("aas", "https://admin-shell.io/aas/3/0/RC02/");
        filteredContext.put("iec61360", "https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/");
        filteredContext.put("phys_unit", "https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/");

        if(bean == null || bean.getClass().getName().equals("com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl") || bean.getClass().getName().equals("org.apache.jena.ext.xerces.jaxp.datatype.XMLGregorianCalendarImpl") || bean.getClass() == BigInteger.class) return; // XMLGregorianCalendarImpl causes infinite recursion

        //Check if RdfResource or TypedLiteral is used. They contain a field called "type" which can reference to any namespace
        //Therefore it is vital to also check the value of the type field for prefixes that need to be included in the context
        if(bean.getClass().getSimpleName().equals("LangString"))
        {
            //LangString is of type rdf:langString, so this must be present
            filteredContext.put("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        }
        contextItems.forEach((p, u) -> {
            JsonTypeName typeNameAnnotation = bean.getClass().getAnnotation(JsonTypeName.class);
            if(typeNameAnnotation != null && typeNameAnnotation.value().contains(p)) {
                filteredContext.put(p, u);
            }
            Stream.of(bean.getClass().getMethods()).forEach(m -> {
                JsonProperty propertyAnnotation = m.getAnnotation(JsonProperty.class);
                if(propertyAnnotation != null && propertyAnnotation.value().contains(p)) {
                    filteredContext.put(p, u);
                }
            });
        });
        Stream.of(bean.getClass().getMethods()).forEach(m -> {
            // run though all properties and check annotations. These annotations should contain the prefixes
            JsonProperty prop = m.getAnnotation(JsonProperty.class);
            if(prop != null)
            {
                for(Map.Entry<String, String> entry : contextItems.entrySet())
                {
                    if(prop.value().startsWith(entry.getKey()))
                    {
                        filteredContext.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        });
        // run through fields recursively
        for(Field f : getAllFields(new HashSet<>(), bean.getClass())) {

            if(Collection.class.isAssignableFrom(f.getType()))
            {
                try {
                    if(f.getType().getName().startsWith("java.") && !f.getType().getName().startsWith("java.util")) continue;
                    boolean accessible = f.isAccessible();
                    f.setAccessible(true);
                    Collection<?> c = (Collection<?>) f.get(bean);
                    if(c == null) {
                        continue;
                    }
                    for(Object o : c)
                    {
                        filterContextWrtBean(o, filteredContext);
                    }
                    f.setAccessible(accessible);
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (f.getType().isPrimitive() || f.getType().isEnum() || f.getType().isArray()
                    || f.getType().getName().contains("java.")
                    || f.getType().getName().contains("javax.")) continue;

            try {
                boolean wasAccessible = f.isAccessible();
                f.setAccessible(true);
                filterContextWrtBean(f.get(bean), filteredContext);
                f.setAccessible(wasAccessible);
            } catch (IllegalAccessException ignored) {
                //logger.error("setting accessible failed"); //We can catch that here, as IllegalReflectiveAccess cannot occur on our own packages
            }

            //f.trySetAccessible(wasAccessible);

        }

    }

    /**
     * This function retrieves a set of all available fields of a class, including inherited fields
     * @param fields Set to which discovered fields will be added. An empty HashSet should do the trick
     * @param type The class for which fields should be discovered
     * @return set of all available fields
     */
    private static Set<Field> getAllFields(Set<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }

        return fields;
    }
}
