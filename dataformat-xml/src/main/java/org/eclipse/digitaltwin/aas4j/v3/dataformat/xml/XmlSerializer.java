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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.XmlDataformatAnnotationIntrospector;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.AssetAdministrationShellEnvironmentSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.OperationSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.OperationVariableSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

public class XmlSerializer {
  protected final XmlFactory xmlFactory;
  protected XmlMapper mapper;
  protected Map<String, String> namespacePrefixes;
  private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

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
    mapper =
        XmlMapper.builder(xmlFactory)
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
    module.addSerializer(OperationVariable.class, new OperationVariableSerializer());
    module.addSerializer(Operation.class, new OperationSerializer());
    return module;
  }

  protected SimpleModule buildEnumModule() {
    SimpleModule module = new SimpleModule();
    module.addSerializer(Enum.class, new EnumSerializer());
    return module;
  }

  /**
   * Serializes a given instance of AssetAdministrationShellEnvironment to string
   *
   * @param aasEnvironment the AssetAdministrationShellEnvironment to serialize
   * @return the string representation of the environment
   * @throws SerializationException if serialization fails
   */
  public String write(Environment aasEnvironment) throws SerializationException {
    try {
      ObjectWriter writer = mapper.writer();
      return writer.writeValueAsString(aasEnvironment);
    } catch (JsonProcessingException ex) {
      throw new SerializationException("serialization failed", ex);
    }
  }

  /**
   * Serializes a given instance of Environment to an OutputStream using DEFAULT_CHARSET
   *
   * @param out the Outputstream to serialize to
   * @param aasEnvironment the Environment to serialize
   * @throws IOException if writing to the stream fails
   * @throws SerializationException if serialization fails
   */
  public void write(OutputStream out, Environment aasEnvironment)
      throws IOException, SerializationException {
    write(out, DEFAULT_CHARSET, aasEnvironment);
  }

  /**
   * Serializes a given instance of Environment to an OutputStream using given charset
   *
   * @param out the Outputstream to serialize to
   * @param charset the Charset to use for serialization
   * @param aasEnvironment the Environment to serialize
   * @throws IOException if writing to the stream fails
   * @throws SerializationException if serialization fails
   */
  void write(OutputStream out, Charset charset, Environment aasEnvironment)
      throws IOException, SerializationException {
    try (OutputStreamWriter writer = new OutputStreamWriter(out, charset)) {
      writer.write(write(aasEnvironment));
    }
  }

  // Note that the AAS also defines a file class
  /**
   * Serializes a given instance of Environment to a java.io.File using DEFAULT_CHARSET
   *
   * @param file the java.io.File to serialize to
   * @param charset the Charset to use for serialization
   * @param aasEnvironment the Environment to serialize
   * @throws FileNotFoundException if the fail does not exist
   * @throws IOException if writing to the file fails
   * @throws SerializationException if serialization fails
   */
  void write(java.io.File file, Charset charset, Environment aasEnvironment)
      throws FileNotFoundException, IOException, SerializationException {
    try (OutputStream out = new FileOutputStream(file)) {
      write(out, charset, aasEnvironment);
    }
  }

  /**
   * Serializes a given instance of Environment to a java.io.File using given charset
   *
   * @param file the java.io.File to serialize to
   * @param aasEnvironment the Environment to serialize
   * @throws FileNotFoundException if the fail does not exist
   * @throws IOException if writing to the file fails
   * @throws SerializationException if serialization fails
   */
  void write(java.io.File file, Environment aasEnvironment)
      throws FileNotFoundException, IOException, SerializationException {
    write(file, DEFAULT_CHARSET, aasEnvironment);
  }
}
