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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import java.util.Map;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.AssetAdministrationShellEnvironmentSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.LangStringSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization.OperationVariableSerializer;
// TODO import io.adminshell.aas.v3.dataformat.xml.serialization.EmbeddedDataSpecificationSerializer;
// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;


public class XmlSerializer implements Serializer {
    protected final XmlFactory xmlFactory;
    protected XmlMapper mapper;
    protected Map<String, String> namespacePrefixes;

    public XmlSerializer() {
        this(null);
    }

    public XmlSerializer(Map<String, String> namespacePrefixes) {
        this(new XmlFactory(), namespacePrefixes);
    }

    public XmlSerializer(XmlFactory xmlFactory, Map<String, String> namespacePrefixes) {
        this.xmlFactory = xmlFactory;
        this.namespacePrefixes = namespacePrefixes;
        buildMapper();
    }

    protected void buildMapper() {
        mapper = XmlMapper.builder(xmlFactory)
                .enable(SerializationFeature.INDENT_OUTPUT)
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .annotationIntrospector(new XmlDataformatAnnotationIntrospector())
                .defaultUseWrapper(false)
                .addModule(buildEnumModule())
                .addModule(buildCustomSerializerModule())
                .configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true)
                .build();
        ReflectionHelper.XML_MIXINS.entrySet().forEach(x -> mapper.addMixIn(x.getKey(), x.getValue()));
    }

    protected SimpleModule buildCustomSerializerModule() {
        SimpleModule module = new SimpleModule();
        AssetAdministrationShellEnvironmentSerializer aasEnvSerializer;
        if (namespacePrefixes != null) {
            aasEnvSerializer = new AssetAdministrationShellEnvironmentSerializer(namespacePrefixes);
        } else {
            aasEnvSerializer = new AssetAdministrationShellEnvironmentSerializer();
        }
        module.addSerializer(Environment.class, aasEnvSerializer);
        module.addSerializer(LangString.class, new LangStringSerializer());
		module.addSerializer(OperationVariable.class, new OperationVariableSerializer());
        return module;
    }

    protected SimpleModule buildEnumModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new EnumSerializer());
        return module;
    }

    @Override
    public String write(Environment aasEnvironment) throws SerializationException {
        try {
            ObjectWriter writer = mapper.writer();
            return writer.writeValueAsString(aasEnvironment);
        } catch (JsonProcessingException ex) {
            throw new SerializationException("serialization failed", ex);
        }
    }
}
