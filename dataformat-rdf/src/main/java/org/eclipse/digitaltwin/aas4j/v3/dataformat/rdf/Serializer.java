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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.preprocessing.JsonPreprocessor;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.preprocessing.TypeNamePreprocessor;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.custom.ReflectiveMixInResolver;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Serializer {

    private static final ObjectMapper mapper = new ObjectMapper();
    public static String implementingClassesNamePrefix = "Default";
    public static String implementingClassesNameSuffix = "";
    static Map<Class<?>, Class<?>> customImplementationMap = new HashMap<>();
    private static boolean charsetWarningPrinted = false;
    private final List<JsonPreprocessor> preprocessors;
    private final Logger logger = LoggerFactory.getLogger(Serializer.class);

    public Serializer() {
        mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.setMixInResolver(new ReflectiveMixInResolver());

        preprocessors = new ArrayList<>();
        this.addPreprocessor(new TypeNamePreprocessor());

        if (!Charset.defaultCharset().equals(StandardCharsets.UTF_8) && !charsetWarningPrinted) {
            charsetWarningPrinted = true;
            logger.warn("Standard Charset is set to " + Charset.defaultCharset() + " - expecting " + StandardCharsets.UTF_8 + ". Some characters might not be displayed correctly.\nThis warning is only printed once");
        }

        //Default namespaces for AAS
        addKnownNamespace("xsd", "http://www.w3.org/2001/XMLSchema#");
        addKnownNamespace("owl", "http://www.w3.org/2002/07/owl#");
        addKnownNamespace("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        addKnownNamespace("aas", "https://admin-shell.io/aas/3/0/");
        //addKnownNamespace("iec61360", "https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIec61360/3/0/RC02/");
        //addKnownNamespace("phys_unit", "https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02/");

    }

    /**
     * Allows to add further known namespaces to the message parser. Allows parsing to Java objects with JsonSubTypes annotations with other prefixes than "ids:".
     *
     * @param prefix       Prefix to be added
     * @param namespaceUrl URL of the prefix
     */
    public static void addKnownNamespace(String prefix, String namespaceUrl) {
        Parser.knownNamespaces.put(prefix, namespaceUrl);
        JsonLDSerializer.contextItems.put(prefix, namespaceUrl);
    }

    /**
     * Serializes an object to an RDF representation. In order to support RDF, the input instance must be
     * annotated using AAS Metamodel annotations. Default format is Turtle (TTL).
     *
     * @param instance the instance to be serialized
     * @return RDF serialization of the provided object graph
     * @throws IOException if the serialization fails
     */
    public String serialize(Object instance) throws IOException {
        return serialize(instance, RDFLanguages.TTL, new HashMap<>());
    }

    /**
     * Serializes an object to an RDF representation of a given RDF serialization format. In order to support RDF, the
     * input instance must be annotated using AAS Metamodel annotations.
     *
     * @param instance the instance to be serialized
     * @param format   the RDF format to be returned (only RDFLanguages.TTL, RDFLanguages.JSONLD, RDFLanguages.RDFXML)
     * @return RDF serialization of the provided object graph
     * @throws IOException if the serialization fails
     */
    public synchronized String serialize(Object instance, Lang format) throws IOException {
        return serialize(instance, format, new HashMap<>());
    }

    //Synchronized is required for thread safety. Without it, context elements might be missing in case of multiple simultaneous calls to this function
    public synchronized String serialize(Object instance, Lang format, Map<Object, String> idMap) throws IOException {
        if (format != RDFLanguages.JSONLD && format != RDFLanguages.TURTLE && format != RDFLanguages.RDFXML) {
            throw new IOException("RDFFormat " + format + " is currently not supported by the serializer.");
        }
        mapper.registerModule(new JsonLDModule(idMap));
        String jsonLD = (instance instanceof Collection)
                ? serializeCollection((Collection<?>) instance)
                : mapper.writerWithDefaultPrettyPrinter().writeValueAsString(instance);
        if (format == RDFLanguages.JSONLD) return jsonLD;
        else return convertJsonLdToOtherRdfFormat(jsonLD, format);
    }

    private String serializeCollection(Collection<?> collection) throws IOException {
        String lineSep = System.lineSeparator();
        StringBuilder jsonLDBuilder = new StringBuilder();

        if (collection.isEmpty()) {
            jsonLDBuilder.append("[]");
        } else {
            jsonLDBuilder.append("[");
            jsonLDBuilder.append(lineSep);
            for (Object item : collection) {
                jsonLDBuilder.append(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item));
                jsonLDBuilder.append(",");
                jsonLDBuilder.append(lineSep);
            }
            int lastComma = jsonLDBuilder.lastIndexOf(",");
            jsonLDBuilder.replace(lastComma, lastComma + 1, "");
            jsonLDBuilder.append("]");
        }
        jsonLDBuilder.append(lineSep);

        return jsonLDBuilder.toString();
    }

    public String convertJsonLdToOtherRdfFormat(String jsonLd, Lang format) {
        Model model = ModelFactory.createDefaultModel();
        RDFDataMgr.read(model, new ByteArrayInputStream(jsonLd.getBytes()), RDFLanguages.JSONLD);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        RDFDataMgr.write(os, model, format);
        return os.toString();
    }

    public String serializePlainJson(Object instance) throws JsonProcessingException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(instance);
    }

    /**
     * Inverse method of "serialize"
     *
     * @param serialization JSON(-LD) string
     * @param valueType     class of top level type
     * @param <T>           deserialized type
     * @return an object representing the provided JSON(-LD) structure
     * @throws DeserializationException thrown, if deserialization fails, e.g. because the input is not valid RDF
     */
    public <T> T deserialize(String serialization, Class<T> valueType) throws DeserializationException {
        try {
            return new Parser().parseMessage(serialization, valueType);
        } catch (IOException e) {
            throw new DeserializationException("Failed to deserialize input.", e);
        }
    }

    /**
     * Inverse method of "serialize"
     *
     * @param serialization       JSON(-LD) string
     * @param valueType           class of top level type
     * @param serializationFormat RDF input format
     * @param <T>                 deserialized type
     * @return an object representing the provided JSON(-LD) structure
     * @throws DeserializationException thrown, if deserialization fails, e.g. because the input is not valid RDF
     */
    public <T> T deserialize(String serialization, Class<T> valueType, Lang serializationFormat) throws DeserializationException {
        try {

            return new Parser().parseMessage(serialization, valueType, serializationFormat);
        } catch (IOException e) {
            throw new DeserializationException("Failed to deserialize input.", e);
        }
    }

    /**
     * Inverse method of "serialize"
     *
     * @param rdfModel  Input RDF Model to be turned into an Instance of the IDS Java classes
     * @param valueType class of top level type
     * @param <T>       deserialized type
     * @return an object representing the provided JSON(-LD) structure
     * @throws DeserializationException thrown, if deserialization fails, e.g. because the input is not valid RDF
     */
    public <T> T deserialize(Model rdfModel, Class<T> valueType) throws DeserializationException {
        try {
            return new Parser().parseMessage(rdfModel, valueType);
        } catch (IOException e) {
            throw new DeserializationException("Failed to deserialize input.", e);
        }
    }

    /**
     * Method to add a preprocessor for deserialization.
     * <p>
     * Important note: The preprocessors are executed in the same order they were added.
     *
     * @param preprocessor the preprocessor to add
     */
    public void addPreprocessor(JsonPreprocessor preprocessor) {
        preprocessors.add(preprocessor);
    }

    /**
     * Method to add a preprocessor for deserialization.
     * <p>
     * Important note: The preprocessors are executed in the same order they were added.
     *
     * @param preprocessor the preprocessor to add
     * @param validate     set whether the preprocessors output should be checked by RDF4j
     */
    public void addPreprocessor(JsonPreprocessor preprocessor, boolean validate) {
        preprocessor.enableRDFValidation(validate);
        addPreprocessor(preprocessor);
    }

    /**
     * remove a preprocessor if no longer needed
     *
     * @param preprocessor the preprocessor to remove
     */
    public void removePreprocessor(JsonPreprocessor preprocessor) {
        preprocessors.remove(preprocessor);
    }


    public String write(Environment aasEnvironment) throws SerializationException {
        try {
            return serialize(aasEnvironment);
        } catch (IOException e) {
            throw new SerializationException("Failed to serialize environment.", e);
        }
    }

    public String write(Environment aasEnvironment, Lang format) throws SerializationException {
        return write(aasEnvironment, format, new HashMap<>());
    }

    public String write(Environment aasEnvironment, Lang format, Map<Object, String> idMap) throws SerializationException {
        try {
            return serialize(aasEnvironment, format, idMap);
        } catch (IOException e) {
            throw new SerializationException("Failed to serialize environment.", e);
        }
    }

    public Environment read(String value) throws DeserializationException {
        try {
            return new Parser().parseMessage(value, Environment.class);
        } catch (IOException e) {
            throw new DeserializationException("Could not deserialize to environment.", e);
        }
    }

    public Environment read(String value, Lang serializationFormat) throws DeserializationException {
        try {
            return new Parser().parseMessage(value, Environment.class, serializationFormat);
        } catch (IOException e) {
            throw new DeserializationException("Could not deserialize to environment.", e);
        }
    }


    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
        customImplementationMap.put(aasInterface, implementation);
        //throw new NotImplementedException("Custom implementation support not yet implemented");
    }
}
