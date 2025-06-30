/*
 * Copyright (c) 2023 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor.AssetAdministrationShellElementVisitor;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

public class GetChildrenVisitor implements AssetAdministrationShellElementVisitor {

  private final List<Referable> children = new ArrayList<>();
  private Environment environment;

  public GetChildrenVisitor() {}

  public void reset() {
    children.clear();
  }

  public GetChildrenVisitor(Environment environment) {
    this.environment = environment;
  }

  public List<Referable> getChildren() {
    return children;
  }

  @Override
  public void visit(Environment environment) {
    children.addAll(environment.getAssetAdministrationShells());
    children.addAll(environment.getConceptDescriptions());
    children.addAll(environment.getSubmodels());
  }

  @Override
  public void visit(AssetAdministrationShell assetAdministrationShell) {
    List<String> submodelIds =
        assetAdministrationShell.getSubmodels().stream()
            .map(x -> x.getKeys().get(x.getKeys().size() - 1).getValue())
            .collect(Collectors.toList());
    if (environment != null) {
      children.addAll(
          environment.getSubmodels().stream()
              .filter(x -> submodelIds.contains(x.getId()))
              .collect(Collectors.toList()));
    }
  }

  @Override
  public void visit(Submodel submodel) {
    children.addAll(submodel.getSubmodelElements());
  }

  @Override
  public void visit(SubmodelElementCollection submodelElementCollection) {
    children.addAll(submodelElementCollection.getValue());
  }

  @Override
  public void visit(SubmodelElementList submodelElementList) {
    children.addAll(submodelElementList.getValue());
  }
}
