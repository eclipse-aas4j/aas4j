/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util;

import java.io.IOException;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Capability;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.EventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

/** Validates AAS Metamodel Part 1 structural constraints on {@link SubmodelElementList}. */
public class SubmodelElementListValidator {

  private static final Map<AasSubmodelElements, Class<? extends SubmodelElement>> TYPE_MAP =
      new EnumMap<>(AasSubmodelElements.class);

  static {
    TYPE_MAP.put(
        AasSubmodelElements.ANNOTATED_RELATIONSHIP_ELEMENT, AnnotatedRelationshipElement.class);
    TYPE_MAP.put(AasSubmodelElements.BASIC_EVENT_ELEMENT, BasicEventElement.class);
    TYPE_MAP.put(AasSubmodelElements.BLOB, Blob.class);
    TYPE_MAP.put(AasSubmodelElements.CAPABILITY, Capability.class);
    TYPE_MAP.put(AasSubmodelElements.DATA_ELEMENT, DataElement.class);
    TYPE_MAP.put(AasSubmodelElements.ENTITY, Entity.class);
    TYPE_MAP.put(AasSubmodelElements.EVENT_ELEMENT, EventElement.class);
    TYPE_MAP.put(AasSubmodelElements.FILE, File.class);
    TYPE_MAP.put(AasSubmodelElements.MULTI_LANGUAGE_PROPERTY, MultiLanguageProperty.class);
    TYPE_MAP.put(AasSubmodelElements.OPERATION, Operation.class);
    TYPE_MAP.put(AasSubmodelElements.PROPERTY, Property.class);
    TYPE_MAP.put(AasSubmodelElements.RANGE, Range.class);
    TYPE_MAP.put(AasSubmodelElements.REFERENCE_ELEMENT, ReferenceElement.class);
    TYPE_MAP.put(AasSubmodelElements.RELATIONSHIP_ELEMENT, RelationshipElement.class);
    TYPE_MAP.put(AasSubmodelElements.SUBMODEL_ELEMENT, SubmodelElement.class);
    TYPE_MAP.put(AasSubmodelElements.SUBMODEL_ELEMENT_COLLECTION, SubmodelElementCollection.class);
    TYPE_MAP.put(AasSubmodelElements.SUBMODEL_ELEMENT_LIST, SubmodelElementList.class);
  }

  private SubmodelElementListValidator() {}

  /**
   * Validates that every child of {@code list} is an instance of the type declared by {@code
   * typeValueListElement}. No-op when {@code typeValueListElement} is null or when the declared
   * type is not in the known type map (custom/unknown types are skipped).
   *
   * @throws IOException when a child's type does not match the declared type
   */
  public static void validateTypeValueListElement(SubmodelElementList list) throws IOException {
    AasSubmodelElements declaredType = list.getTypeValueListElement();
    if (declaredType == null) {
      return;
    }
    Class<? extends SubmodelElement> expectedClass = TYPE_MAP.get(declaredType);
    if (expectedClass == null) {
      return;
    }
    List<SubmodelElement> children = list.getValue();
    if (children == null || children.isEmpty()) {
      return;
    }
    for (SubmodelElement child : children) {
      if (child == null) {
        continue;
      }
      if (!expectedClass.isInstance(child)) {
        throw new IOException(
            String.format(
                "SubmodelElementList constraint violation: typeValueListElement is '%s' but child"
                    + " element is of type '%s'",
                declaredType, child.getClass().getSimpleName()));
      }
    }
  }

  /**
   * Validates that every {@link Property} and {@link Range} child of {@code list} has a {@code
   * valueType} matching {@code valueTypeListElement}. No-op when {@code valueTypeListElement} is
   * null.
   *
   * @throws IOException when a child's valueType does not match the declared valueTypeListElement
   */
  public static void validateValueTypeListElement(SubmodelElementList list) throws IOException {
    DataTypeDefXsd declaredValueType = list.getValueTypeListElement();
    if (declaredValueType == null) {
      return;
    }
    List<SubmodelElement> children = list.getValue();
    if (children == null || children.isEmpty()) {
      return;
    }
    for (SubmodelElement child : children) {
      if (child == null) {
        continue;
      }
      if (child instanceof Property) {
        DataTypeDefXsd actual = ((Property) child).getValueType();
        if (actual != null && actual != declaredValueType) {
          throw new IOException(
              String.format(
                  "SubmodelElementList constraint violation: valueTypeListElement is '%s' but"
                      + " Property child has valueType '%s'",
                  declaredValueType, actual));
        }
      } else if (child instanceof Range) {
        DataTypeDefXsd actual = ((Range) child).getValueType();
        if (actual != null && actual != declaredValueType) {
          throw new IOException(
              String.format(
                  "SubmodelElementList constraint violation: valueTypeListElement is '%s' but"
                      + " Range child has valueType '%s'",
                  declaredValueType, actual));
        }
      }
    }
  }

  /**
   * Convenience method that runs both {@link #validateTypeValueListElement} and {@link
   * #validateValueTypeListElement}.
   *
   * @throws IOException when any constraint is violated
   */
  public static void validate(SubmodelElementList list) throws IOException {
    validateTypeValueListElement(list);
    validateValueTypeListElement(list);
  }
}
