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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.visitor;

import org.eclipse.digitaltwin.aas4j.v3.model.*;

public interface AssetAdministrationShellElementWalkerVisitor extends AssetAdministrationShellElementVisitor {

    @Override
    public default void visit(AnnotatedRelationshipElement annotatedRelationshipElement) {
        if (annotatedRelationshipElement == null) {
            return;
        }
        annotatedRelationshipElement.getAnnotations().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(annotatedRelationshipElement);
    }

    @Override
    public default void visit(AssetAdministrationShell assetAdministrationShell) {
        if (assetAdministrationShell == null) {
            return;
        }
        visit(assetAdministrationShell.getDerivedFrom());
        visit(assetAdministrationShell.getAssetInformation());
        assetAdministrationShell.getSubmodels().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(assetAdministrationShell);
    }

    @Override
    public default void visit(AssetInformation assetInformation) {
        if (assetInformation == null) {
            return;
        }
        assetInformation.getSpecificAssetIds().forEach(x -> visit(x));
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
        conceptDescription.getIsCaseOf().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(conceptDescription);
    }

    @Override
    public default void visit(HasDataSpecification hasDataSpecification) {
        if (hasDataSpecification == null) {
            return;
        }
        //hasDataSpecification.getEmbeddedDataSpecifications().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(hasDataSpecification);
    }

    @Override
    public default void visit(HasExtensions hasExtensions) {
        if (hasExtensions == null) {
            return;
        }
        hasExtensions.getExtensions().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(hasExtensions);
    }

    @Override
    public default void visit(HasSemantics hasSemantics) {
        if (hasSemantics == null) {
            return;
        }
        visit(hasSemantics.getSemanticID());
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
    public default void visit(SpecificAssetID specificAssetId) {
        if (specificAssetId == null) {
            return;
        }
        visit(specificAssetId.getExternalSubjectID());
        AssetAdministrationShellElementVisitor.super.visit(specificAssetId);
    }

    @Override
    public default void visit(MultiLanguageProperty multiLanguageProperty) {
        if (multiLanguageProperty == null) {
            return;
        }
        multiLanguageProperty.getValue().forEach(x -> visit(x));
        visit(multiLanguageProperty.getValueID());
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
        visit(property.getValueID());
        AssetAdministrationShellElementVisitor.super.visit(property);
    }

    @Override
    public default void visit(Qualifiable qualifiable) {
        if (qualifiable == null) {
            return;
        }
        qualifiable.getQualifiers().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(qualifiable);
    }

    @Override
    public default void visit(Qualifier qualifier) {
        if (qualifier == null) {
            return;
        }
        visit(qualifier.getValueID());
        AssetAdministrationShellElementVisitor.super.visit(qualifier);
    }

    @Override
    public default void visit(Referable referable) {
        if (referable == null) {
            return;
        }
        referable.getDescription().forEach(x -> visit(x));
        referable.getDisplayName().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(referable);
    }

    @Override
    public default void visit(LangStringNameType langString){
        if (langString == null){
            return;
        }
        AssetAdministrationShellElementVisitor.super.visit(langString);
    };

    @Override
    public default void visit(LangStringPreferredNameTypeIEC61360 langString){
        if (langString == null){
            return;
        }
        AssetAdministrationShellElementVisitor.super.visit(langString);
    };

    @Override
    public default void visit(LangStringDefinitionTypeIEC61360 langString){
        if (langString == null){
            return;
        }
        AssetAdministrationShellElementVisitor.super.visit(langString);
    };

    @Override
    public default void visit(LangStringTextType langString){
        if (langString == null){
            return;
        }
        AssetAdministrationShellElementVisitor.super.visit(langString);
    };

    @Override
    public default void visit(Reference reference) {
        if (reference == null) {
            return;
        }
        reference.getKeys().forEach(x -> visit(x));
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
        entity.getSpecificAssetIds().forEach(x -> visit(x));
        entity.getStatements().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(entity);
    }

    @Override
    public default void visit(Extension extension) {
        if (extension == null) {
            return;
        }
        extension.getRefersTo().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(extension);
    }

    @Override
    public default void visit(Environment assetAdministrationShellEnvironment) {
        if (assetAdministrationShellEnvironment == null) {
            return;
        }
        assetAdministrationShellEnvironment.getAssetAdministrationShells().forEach(x -> visit(x));
        assetAdministrationShellEnvironment.getConceptDescriptions().forEach(x -> visit(x));
        assetAdministrationShellEnvironment.getSubmodels().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(assetAdministrationShellEnvironment);
    }

    @Override
    public default void visit(Submodel submodel) {
        if (submodel == null) {
            return;
        }
        submodel.getSubmodelElements().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(submodel);
    }

    @Override
    public default void visit(SubmodelElementCollection submodelElementCollection) {
        if (submodelElementCollection == null) {
            return;
        }
        submodelElementCollection.getValue().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(submodelElementCollection);
    }

    @Override
    public default void visit(Operation operation) {
        if (operation == null) {
            return;
        }
        operation.getInputVariables().forEach(x -> visit(x.getValue()));
        operation.getInoutputVariables().forEach(x -> visit(x.getValue()));
        operation.getOutputVariables().forEach(x -> visit(x.getValue()));
        AssetAdministrationShellElementVisitor.super.visit(operation);
    }

}
