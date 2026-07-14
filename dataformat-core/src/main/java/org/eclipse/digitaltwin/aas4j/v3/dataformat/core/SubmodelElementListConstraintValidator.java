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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.SubmodelElementListValidator;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor.AssetAdministrationShellElementWalkerVisitor;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

/**
 * Validates AAS Metamodel Part 1 structural constraints on {@link SubmodelElementList} instances.
 *
 * <p>Checks that:
 *
 * <ul>
 *   <li>every child element matches the type declared in {@code typeValueListElement}
 *   <li>every {@code Property} and {@code Range} child has a {@code valueType} matching {@code
 *       valueTypeListElement} (when set)
 * </ul>
 *
 * <p>Use {@link #validate(SubmodelElementList)} for a single list, or {@link
 * #validate(Environment)} to check all lists in an entire environment at any nesting depth.
 */
public class SubmodelElementListConstraintValidator implements EnvironmentConstraintValidator {

  /**
   * Validates constraints on a single {@link SubmodelElementList}.
   *
   * @param list the list to validate
   * @return set of violation messages; empty when the list is valid
   */
  public Set<String> validate(SubmodelElementList list) {
    Set<String> errors = new HashSet<>();
    try {
      SubmodelElementListValidator.validateTypeValueListElement(list);
    } catch (IOException e) {
      errors.add(e.getMessage());
    }
    try {
      SubmodelElementListValidator.validateValueTypeListElement(list);
    } catch (IOException e) {
      errors.add(e.getMessage());
    }
    return errors;
  }

  /**
   * Validates constraints on every {@link SubmodelElementList} found anywhere in the given {@link
   * Environment}, at any nesting depth.
   *
   * @param environment the environment to validate
   * @return set of violation messages; empty when all lists are valid
   */
  @Override
  public Set<String> validate(Environment environment) {
    Set<String> errors = new HashSet<>();
    new AssetAdministrationShellElementWalkerVisitor() {
      @Override
      public void visit(SubmodelElementList list) {
        errors.addAll(SubmodelElementListConstraintValidator.this.validate(list));
        AssetAdministrationShellElementWalkerVisitor.super.visit(list);
      }
    }.visit(environment);
    return errors;
  }
}
