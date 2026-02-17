/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;

/** Class for serializing of AAS instances. */
public class JsonSerializer {
  protected JsonMapper mapper;

  public JsonSerializer() {
    mapper = new JsonMapperFactory().create(new SimpleAbstractTypeResolverFactory().create());
  }

  /**
   * Generic method to serialize a given AAS instance to a string
   *
   * @param aasInstance the AAS instance to serialize
   * @return the string representation
   * @throws SerializationException if serialization fails
   */
  public String write(Object aasInstance) throws SerializationException {
    try {
      return mapper.writeValueAsString(aasInstance);
    } catch (JsonProcessingException ex) {
      throw new SerializationException(
          String.format("error serializing %s", aasInstance.getClass().getSimpleName()), ex);
    }
  }

  /**
   * Generic method to serialize a collection.
   *
   * @param collection the collection to serialize. Not null.
   * @return the string representation of the collection.
   * @throws SerializationException if serialization fails
   */
  public String writeList(Collection<?> collection) throws SerializationException {
    if (collection == null || collection.isEmpty()) {
      return write(collection);
    }

    Class<?> elementType = getFirstNonNullClass(collection);
    try {
      if (elementType == null) {
        return mapper.writeValueAsString(collection);
      }
      if (!isHomogeneous(collection, elementType)) {
        Class<?> modelTypeBase = getCommonModelTypeBase(collection);
        if (modelTypeBase == null) {
          return mapper.writeValueAsString(collection);
        }
        elementType = modelTypeBase;
      }
      Class<? extends Collection> collectionType =
          collection instanceof List ? List.class : Collection.class;
      return mapper
          .writerFor(mapper.getTypeFactory().constructCollectionType(collectionType, elementType))
          .writeValueAsString(collection);
    } catch (JsonProcessingException ex) {
      String typeName = elementType == null ? "unknown" : elementType.getSimpleName();
      throw new SerializationException("error serializing list of " + typeName, ex);
    }
  }

  /**
   * Generic method to convert a given AAS instance to a JSON node
   *
   * @param aasInstance the AAS instance to serialize
   * @return the JSON node representation
   * @throws IllegalArgumentException
   */
  public JsonNode toNode(Object aasInstance) {
    return mapper.valueToTree(aasInstance);
  }

  /**
   * Generic method to convert a collection of AAS instances to a JSON array
   *
   * @param aasInstances the list of AAS instances to convert
   * @return the JSON array representation
   * @throws IllegalArgumentException
   */
  public JsonNode toArrayNode(Collection<?> aasInstances) {
    if (aasInstances == null) {
      return JsonNodeFactory.instance.nullNode();
    }
    ArrayNode result = JsonNodeFactory.instance.arrayNode();
    for (Object obj : aasInstances) {
      result.add(toNode(obj));
    }
    return result;
  }

  /**
   * Generic method to serialize a given AAS instance to an output stream using given charset
   *
   * @param out the output stream to serialize to
   * @param charset the charset to use for serialization
   * @param aasInstance the AAS instance to serialize
   * @throws SerializationException if serialization fails
   */
  public void write(OutputStream out, Charset charset, Object aasInstance)
      throws SerializationException {
    try {
      mapper.writeValue(new OutputStreamWriter(out, charset), aasInstance);
    } catch (IOException ex) {
      throw new SerializationException(
          "error serializing " + aasInstance.getClass().getSimpleName(), ex);
    }
  }

  /**
   * Generic method to serialize a given AAS instance to an output stream using UTF-8 charset
   *
   * @param out the output stream to serialize to
   * @param aasInstance the AAS instance to serialize
   * @throws SerializationException if serialization fails
   */
  public void write(OutputStream out, Object aasInstance) throws SerializationException {
    write(out, StandardCharsets.UTF_8, aasInstance);
  }

  /**
   * Generic method to serialize a collection of AAS instances to an output stream using given
   * charset
   *
   * @param out the output stream to serialize to
   * @param charset the charset to use for serialization
   * @param collection the collection of AAS instances to serialize
   * @throws SerializationException if serialization fails
   */
  public void writeList(OutputStream out, Charset charset, Collection<?> collection)
      throws SerializationException {
    if (collection == null || collection.isEmpty()) {
      write(out, charset, collection);
    } else {
      try {
        Class<?> elementType = getFirstNonNullClass(collection);
        if (elementType == null) {
          mapper.writeValue(new OutputStreamWriter(out, charset), collection);
          return;
        }
        if (!isHomogeneous(collection, elementType)) {
          Class<?> modelTypeBase = getCommonModelTypeBase(collection);
          if (modelTypeBase == null) {
            mapper.writeValue(new OutputStreamWriter(out, charset), collection);
            return;
          }
          elementType = modelTypeBase;
        }
        Class<? extends Collection> collectionType =
            collection instanceof List ? List.class : Collection.class;
        mapper
            .writerFor(mapper.getTypeFactory().constructCollectionType(collectionType, elementType))
            .writeValue(new OutputStreamWriter(out, charset), collection);
      } catch (IOException ex) {
        Class<?> elementType = getFirstNonNullClass(collection);
        String typeName = elementType == null ? "unknown" : elementType.getSimpleName();
        throw new SerializationException("error serializing list of " + typeName, ex);
      }
    }
  }

  private static Class<?> getFirstNonNullClass(Collection<?> collection) {
    for (Object element : collection) {
      if (element != null) {
        return element.getClass();
      }
    }
    return null;
  }

  private static boolean isHomogeneous(Collection<?> collection, Class<?> elementType) {
    for (Object element : collection) {
      if (element != null && !elementType.equals(element.getClass())) {
        return false;
      }
    }
    return true;
  }

  private static Class<?> getCommonModelTypeBase(Collection<?> collection) {
    for (Class<?> candidate : ReflectionHelper.MODEL_TYPE_SUPERCLASSES) {
      boolean matchesAll = true;
      for (Object element : collection) {
        if (element != null && !candidate.isInstance(element)) {
          matchesAll = false;
          break;
        }
      }
      if (matchesAll) {
        return candidate;
      }
    }
    return null;
  }

  /**
   * Generic method to serialize a collection of AAS instances to an output stream using UTF-8
   * charset
   *
   * @param out the output stream to serialize to
   * @param collection the collection of AAS instances to serialize
   * @throws SerializationException if serialization fails
   */
  public void writeList(OutputStream out, Collection<?> collection) throws SerializationException {
    writeList(out, StandardCharsets.UTF_8, collection);
  }
}
