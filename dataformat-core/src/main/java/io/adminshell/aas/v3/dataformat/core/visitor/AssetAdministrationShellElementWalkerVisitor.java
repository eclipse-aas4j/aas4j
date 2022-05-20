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
package io.adminshell.aas.v3.dataformat.core.visitor;

import io.adminshell.aas.v3.model.AccessControl;
import io.adminshell.aas.v3.model.AccessControlPolicyPoints;
import io.adminshell.aas.v3.model.AccessPermissionRule;
import io.adminshell.aas.v3.model.AnnotatedRelationshipElement;
import io.adminshell.aas.v3.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.AssetInformation;
import io.adminshell.aas.v3.model.BasicEvent;
import io.adminshell.aas.v3.model.BlobCertificate;
import io.adminshell.aas.v3.model.Certificate;
import io.adminshell.aas.v3.model.ConceptDescription;
import io.adminshell.aas.v3.model.Entity;
import io.adminshell.aas.v3.model.Extension;
import io.adminshell.aas.v3.model.Formula;
import io.adminshell.aas.v3.model.HasDataSpecification;
import io.adminshell.aas.v3.model.HasExtensions;
import io.adminshell.aas.v3.model.HasSemantics;
import io.adminshell.aas.v3.model.Identifiable;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.MultiLanguageProperty;
import io.adminshell.aas.v3.model.ObjectAttributes;
import io.adminshell.aas.v3.model.Operation;
import io.adminshell.aas.v3.model.OperationVariable;
import io.adminshell.aas.v3.model.Permission;
import io.adminshell.aas.v3.model.PermissionsPerObject;
import io.adminshell.aas.v3.model.PolicyAdministrationPoint;
import io.adminshell.aas.v3.model.PolicyInformationPoints;
import io.adminshell.aas.v3.model.Property;
import io.adminshell.aas.v3.model.Qualifiable;
import io.adminshell.aas.v3.model.Qualifier;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.ReferenceElement;
import io.adminshell.aas.v3.model.RelationshipElement;
import io.adminshell.aas.v3.model.Security;
import io.adminshell.aas.v3.model.SubjectAttributes;
import io.adminshell.aas.v3.model.Submodel;
import io.adminshell.aas.v3.model.SubmodelElementCollection;
import io.adminshell.aas.v3.model.ValueList;
import io.adminshell.aas.v3.model.ValueReferencePair;
import io.adminshell.aas.v3.model.View;

public interface AssetAdministrationShellElementWalkerVisitor extends AssetAdministrationShellElementVisitor {

    @Override
    public default void visit(AccessControl accessControl) {
        if (accessControl == null) {
            return;
        }
        visit(accessControl.getDefaultEnvironmentAttributes());
        visit(accessControl.getDefaultPermissions());
        visit(accessControl.getDefaultSubjectAttributes());
        visit(accessControl.getSelectableEnvironmentAttributes());
        visit(accessControl.getSelectablePermissions());
        visit(accessControl.getSelectableSubjectAttributes());
        accessControl.getAccessPermissionRules().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(accessControl);
    }

    @Override
    public default void visit(AccessControlPolicyPoints accessControlPolicyPoints) {
        if (accessControlPolicyPoints == null) {
            return;
        }
        visit(accessControlPolicyPoints.getPolicyAdministrationPoint());
        visit(accessControlPolicyPoints.getPolicyDecisionPoint());
        visit(accessControlPolicyPoints.getPolicyEnforcementPoint());
        visit(accessControlPolicyPoints.getPolicyInformationPoints());
        AssetAdministrationShellElementVisitor.super.visit(accessControlPolicyPoints);
    }

    @Override
    public default void visit(AccessPermissionRule accessPermissionRule) {
        if (accessPermissionRule == null) {
            return;
        }
        visit(accessPermissionRule.getTargetSubjectAttributes());
        accessPermissionRule.getPermissionsPerObjects().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(accessPermissionRule);
    }

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
        visit(assetAdministrationShell.getSecurity());
        visit(assetAdministrationShell.getAssetInformation());
        assetAdministrationShell.getSubmodels().forEach(x -> visit(x));
        assetAdministrationShell.getViews().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(assetAdministrationShell);
    }

    @Override
    public default void visit(AssetInformation assetInformation) {
        if (assetInformation == null) {
            return;
        }
        visit(assetInformation.getGlobalAssetId());
        visit(assetInformation.getDefaultThumbnail());
        assetInformation.getSpecificAssetIds().forEach(x -> visit(x));
        assetInformation.getBillOfMaterials().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(assetInformation);
    }

    @Override
    public default void visit(BasicEvent basicEvent) {
        if (basicEvent == null) {
            return;
        }
        visit(basicEvent.getObserved());
        AssetAdministrationShellElementVisitor.super.visit(basicEvent);
    }

    @Override
    public default void visit(Certificate certificate) {
        if (certificate == null) {
            return;
        }
        visit(certificate.getPolicyAdministrationPoint());
        AssetAdministrationShellElementVisitor.super.visit(certificate);
    }

    @Override
    public default void visit(ConceptDescription conceptDescription) {
        if (conceptDescription == null) {
            return;
        }
        conceptDescription.getIsCaseOfs().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(conceptDescription);
    }

    @Override
    public default void visit(HasDataSpecification hasDataSpecification) {
        if (hasDataSpecification == null) {
            return;
        }
        hasDataSpecification.getEmbeddedDataSpecifications().forEach(x -> visit(x));
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
        visit(hasSemantics.getSemanticId());
        AssetAdministrationShellElementVisitor.super.visit(hasSemantics);
    }

    @Override
    public default void visit(Identifiable identifiable) {
        if (identifiable == null) {
            return;
        }
        visit(identifiable.getAdministration());
        visit(identifiable.getIdentification());
        AssetAdministrationShellElementVisitor.super.visit(identifiable);
    }

    @Override
    public default void visit(IdentifierKeyValuePair identifierKeyValuePair) {
        if (identifierKeyValuePair == null) {
            return;
        }
        visit(identifierKeyValuePair.getExternalSubjectId());
        AssetAdministrationShellElementVisitor.super.visit(identifierKeyValuePair);
    }

    @Override
    public default void visit(MultiLanguageProperty multiLanguageProperty) {
        if (multiLanguageProperty == null) {
            return;
        }
        multiLanguageProperty.getValues().forEach(x -> visit(x));
        visit(multiLanguageProperty.getValueId());
        AssetAdministrationShellElementVisitor.super.visit(multiLanguageProperty);
    }

    @Override
    public default void visit(ObjectAttributes objectAttributes) {
        if (objectAttributes == null) {
            return;
        }
        objectAttributes.getObjectAttributes().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(objectAttributes);
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
    public default void visit(PolicyInformationPoints policyInformationPoints) {
        if (policyInformationPoints == null) {
            return;
        }
        policyInformationPoints.getInternalInformationPoints().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(policyInformationPoints);
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
        qualifiable.getQualifiers().forEach(x -> visit(x));
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
        referable.getDescriptions().forEach(x -> visit(x));
        referable.getDisplayNames().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(referable);
    }

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
    public default void visit(Security security) {
        if (security == null) {
            return;
        }
        visit(security.getAccessControlPolicyPoints());
        security.getCertificates().forEach(x -> visit(x));
        security.getRequiredCertificateExtensions().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(security);
    }

    @Override
    public default void visit(SubjectAttributes subjectAttributes) {
        if (subjectAttributes == null) {
            return;
        }
        subjectAttributes.getSubjectAttributes().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(subjectAttributes);
    }

    @Override
    public default void visit(Permission permission) {
        if (permission == null) {
            return;
        }
        visit(permission.getPermission());
        AssetAdministrationShellElementVisitor.super.visit(permission);
    }

    @Override
    public default void visit(PermissionsPerObject permissionsPerObject) {
        if (permissionsPerObject == null) {
            return;
        }
        visit(permissionsPerObject.getObject());
        visit(permissionsPerObject.getTargetObjectAttributes());
        permissionsPerObject.getPermissions().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(permissionsPerObject);
    }

    @Override
    public default void visit(PolicyAdministrationPoint policyAdministrationPoint) {
        if (policyAdministrationPoint == null) {
            return;
        }
        visit(policyAdministrationPoint.getLocalAccessControl());
        AssetAdministrationShellElementVisitor.super.visit(policyAdministrationPoint);
    }

    @Override
    public default void visit(Entity entity) {
        if (entity == null) {
            return;
        }
        visit(entity.getGlobalAssetId());
        visit(entity.getSpecificAssetId());
        entity.getStatements().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(entity);
    }

    @Override
    public default void visit(Formula formula) {
        if (formula == null) {
            return;
        }
        formula.getDependsOns().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(formula);
    }

    @Override
    public default void visit(Extension extension) {
        if (extension == null) {
            return;
        }
        visit(extension.getRefersTo());
        AssetAdministrationShellElementVisitor.super.visit(extension);
    }

    @Override
    public default void visit(AssetAdministrationShellEnvironment assetAdministrationShellEnvironment) {
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
        submodelElementCollection.getValues().forEach(x -> visit(x));
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

    @Override
    public default void visit(BlobCertificate blobCertificate) {
        if (blobCertificate == null) {
            return;
        }
        visit(blobCertificate.getBlobCertificate());
        visit(blobCertificate.getPolicyAdministrationPoint());
        blobCertificate.getContainedExtensions().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(blobCertificate);
    }

    @Override
    public default void visit(ValueList valueList) {
        if (valueList == null) {
            return;
        }
        valueList.getValueReferencePairTypes().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(valueList);
    }

    @Override
    public default void visit(ValueReferencePair valueReferencePair) {
        if (valueReferencePair == null) {
            return;
        }
        visit(valueReferencePair.getValueId());
        AssetAdministrationShellElementVisitor.super.visit(valueReferencePair);
    }

    @Override
    public default void visit(View view) {
        if (view == null) {
            return;
        }
        view.getContainedElements().forEach(x -> visit(x));
        AssetAdministrationShellElementVisitor.super.visit(view);
    }

}
