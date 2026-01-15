/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor;

import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.HasDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.HasExtensions;
import org.eclipse.digitaltwin.aas4j.v3.model.HasSemantics;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

public interface AssetAdministrationShellElementWalkerVisitor
    extends AssetAdministrationShellElementVisitor {

  @Override
  public default void visit(AnnotatedRelationshipElement annotatedRelationshipElement) {
    if (annotatedRelationshipElement == null) {
      return;
    }
    forEachIfPresent(annotatedRelationshipElement.getAnnotations(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(annotatedRelationshipElement);
  }

  @Override
  public default void visit(AssetAdministrationShell assetAdministrationShell) {
    if (assetAdministrationShell == null) {
      return;
    }
    visit(assetAdministrationShell.getDerivedFrom());
    visit(assetAdministrationShell.getAssetInformation());
    forEachIfPresent(assetAdministrationShell.getSubmodels(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(assetAdministrationShell);
  }

  @Override
  public default void visit(AssetInformation assetInformation) {
    if (assetInformation == null) {
      return;
    }
    forEachIfPresent(assetInformation.getSpecificAssetIds(), x -> visit(x));
    visit(assetInformation.getDefaultThumbnail());
    AssetAdministrationShellElementVisitor.super.visit(assetInformation);
  }

  @Override
  public default void visit(Resource resource) {
    if (resource == null) {
      return;
    }
    AssetAdministrationShellElementVisitor.super.visit(resource);
  }

  @Override
  public default void visit(BasicEventElement basicEvent) {
    if (basicEvent == null) {
      return;
    }
    visit(basicEvent.getObserved());
    AssetAdministrationShellElementVisitor.super.visit(basicEvent);
  }

  @Override
  public default void visit(ConceptDescription conceptDescription) {
    if (conceptDescription == null) {
      return;
    }
    forEachIfPresent(conceptDescription.getIsCaseOf(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(conceptDescription);
  }

  @Override
  public default void visit(HasDataSpecification hasDataSpecification) {
    if (hasDataSpecification == null) {
      return;
    }
    // hasDataSpecification.getEmbeddedDataSpecifications().forEach(x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(hasDataSpecification);
  }

  @Override
  public default void visit(HasExtensions hasExtensions) {
    if (hasExtensions == null) {
      return;
    }
    forEachIfPresent(hasExtensions.getExtensions(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(hasExtensions);
  }

  @Override
  public default void visit(HasSemantics hasSemantics) {
    if (hasSemantics == null) {
      return;
    }
    visit(hasSemantics.getSemanticId());
    forEachIfPresent(hasSemantics.getSupplementalSemanticIds(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(hasSemantics);
  }

  @Override
  public default void visit(Identifiable identifiable) {
    if (identifiable == null) {
      return;
    }
    visit(identifiable.getAdministration());
    AssetAdministrationShellElementVisitor.super.visit(identifiable);
  }

  @Override
  public default void visit(SpecificAssetId specificAssetId) {
    if (specificAssetId == null) {
      return;
    }
    visit(specificAssetId.getExternalSubjectId());
    AssetAdministrationShellElementVisitor.super.visit(specificAssetId);
  }

  @Override
  public default void visit(MultiLanguageProperty multiLanguageProperty) {
    if (multiLanguageProperty == null) {
      return;
    }
    forEachIfPresent(multiLanguageProperty.getValue(), x -> visit(x));
    visit(multiLanguageProperty.getValueId());
    AssetAdministrationShellElementVisitor.super.visit(multiLanguageProperty);
  }

  @Override
  public default void visit(OperationVariable operationVariable) {
    if (operationVariable == null) {
      return;
    }
    visit(operationVariable.getValue());
    AssetAdministrationShellElementVisitor.super.visit(operationVariable);
  }

  @Override
  public default void visit(Property property) {
    if (property == null) {
      return;
    }
    visit(property.getValueId());
    AssetAdministrationShellElementVisitor.super.visit(property);
  }

  @Override
  public default void visit(Qualifiable qualifiable) {
    if (qualifiable == null) {
      return;
    }
    forEachIfPresent(qualifiable.getQualifiers(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(qualifiable);
  }

  @Override
  public default void visit(Qualifier qualifier) {
    if (qualifier == null) {
      return;
    }
    visit(qualifier.getValueId());
    AssetAdministrationShellElementVisitor.super.visit(qualifier);
  }

  @Override
  public default void visit(Referable referable) {
    if (referable == null) {
      return;
    }
    forEachIfPresent(referable.getDescription(), x -> visit(x));
    forEachIfPresent(referable.getDisplayName(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(referable);
  }

  @Override
  public default void visit(LangStringNameType langString) {
    if (langString == null) {
      return;
    }
    AssetAdministrationShellElementVisitor.super.visit(langString);
  }

  @Override
  public default void visit(LangStringPreferredNameTypeIec61360 langString) {
    if (langString == null) {
      return;
    }
    AssetAdministrationShellElementVisitor.super.visit(langString);
  }

  @Override
  public default void visit(LangStringDefinitionTypeIec61360 langString) {
    if (langString == null) {
      return;
    }
    AssetAdministrationShellElementVisitor.super.visit(langString);
  }

  @Override
  public default void visit(LangStringTextType langString) {
    if (langString == null) {
      return;
    }
    AssetAdministrationShellElementVisitor.super.visit(langString);
  }

  @Override
  public default void visit(Reference reference) {
    if (reference == null) {
      return;
    }
    forEachIfPresent(reference.getKeys(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(reference);
  }

  @Override
  public default void visit(ReferenceElement referenceElement) {
    if (referenceElement == null) {
      return;
    }
    visit(referenceElement.getValue());
    AssetAdministrationShellElementVisitor.super.visit(referenceElement);
  }

  @Override
  public default void visit(RelationshipElement relationshipElement) {
    if (relationshipElement == null) {
      return;
    }
    visit(relationshipElement.getFirst());
    visit(relationshipElement.getSecond());
    AssetAdministrationShellElementVisitor.super.visit(relationshipElement);
  }

  @Override
  public default void visit(Entity entity) {
    if (entity == null) {
      return;
    }
    forEachIfPresent(entity.getSpecificAssetIds(), x -> visit(x));
    forEachIfPresent(entity.getStatements(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(entity);
  }

  @Override
  public default void visit(Extension extension) {
    if (extension == null) {
      return;
    }
    forEachIfPresent(extension.getRefersTo(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(extension);
  }

  @Override
  public default void visit(Environment assetAdministrationShellEnvironment) {
    if (assetAdministrationShellEnvironment == null) {
      return;
    }
    forEachIfPresent(
        assetAdministrationShellEnvironment.getAssetAdministrationShells(), x -> visit(x));
    forEachIfPresent(assetAdministrationShellEnvironment.getConceptDescriptions(), x -> visit(x));
    forEachIfPresent(assetAdministrationShellEnvironment.getSubmodels(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(assetAdministrationShellEnvironment);
  }

  @Override
  public default void visit(Submodel submodel) {
    if (submodel == null) {
      return;
    }
    forEachIfPresent(submodel.getSubmodelElements(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(submodel);
  }

  @Override
  public default void visit(SubmodelElementCollection submodelElementCollection) {
    if (submodelElementCollection == null) {
      return;
    }
    forEachIfPresent(submodelElementCollection.getValue(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(submodelElementCollection);
  }

  @Override
  public default void visit(SubmodelElementList submodelElementList) {
    if (submodelElementList == null) {
      return;
    }
    forEachIfPresent(submodelElementList.getValue(), x -> visit(x));
    AssetAdministrationShellElementVisitor.super.visit(submodelElementList);
  }

  @Override
  public default void visit(Operation operation) {
    if (operation == null) {
      return;
    }
    forEachIfPresent(operation.getInputVariables(), x -> visit(x.getValue()));
    forEachIfPresent(operation.getInoutputVariables(), x -> visit(x.getValue()));
    forEachIfPresent(operation.getOutputVariables(), x -> visit(x.getValue()));
    AssetAdministrationShellElementVisitor.super.visit(operation);
  }

  private static <T> void forEachIfPresent(Collection<T> values, Consumer<T> consumer) {
    if (values == null) {
      return;
    }
    values.forEach(consumer);
  }
}
