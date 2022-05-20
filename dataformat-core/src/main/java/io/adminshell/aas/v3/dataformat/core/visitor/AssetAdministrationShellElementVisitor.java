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
import io.adminshell.aas.v3.model.AdministrativeInformation;
import io.adminshell.aas.v3.model.AnnotatedRelationshipElement;
import io.adminshell.aas.v3.model.Asset;
import io.adminshell.aas.v3.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.AssetInformation;
import io.adminshell.aas.v3.model.BasicEvent;
import io.adminshell.aas.v3.model.Blob;
import io.adminshell.aas.v3.model.BlobCertificate;
import io.adminshell.aas.v3.model.Capability;
import io.adminshell.aas.v3.model.Certificate;
import io.adminshell.aas.v3.model.ConceptDescription;
import io.adminshell.aas.v3.model.Constraint;
import io.adminshell.aas.v3.model.DataElement;
import io.adminshell.aas.v3.model.DataSpecificationContent;
import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.DataSpecificationPhysicalUnit;
import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import io.adminshell.aas.v3.model.Entity;
import io.adminshell.aas.v3.model.Event;
import io.adminshell.aas.v3.model.EventElement;
import io.adminshell.aas.v3.model.EventMessage;
import io.adminshell.aas.v3.model.Extension;
import io.adminshell.aas.v3.model.File;
import io.adminshell.aas.v3.model.Formula;
import io.adminshell.aas.v3.model.HasDataSpecification;
import io.adminshell.aas.v3.model.HasExtensions;
import io.adminshell.aas.v3.model.HasKind;
import io.adminshell.aas.v3.model.HasSemantics;
import io.adminshell.aas.v3.model.Identifiable;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.Key;
import io.adminshell.aas.v3.model.LangString;
import io.adminshell.aas.v3.model.MultiLanguageProperty;
import io.adminshell.aas.v3.model.ObjectAttributes;
import io.adminshell.aas.v3.model.Operation;
import io.adminshell.aas.v3.model.OperationVariable;
import io.adminshell.aas.v3.model.Permission;
import io.adminshell.aas.v3.model.PermissionsPerObject;
import io.adminshell.aas.v3.model.PolicyAdministrationPoint;
import io.adminshell.aas.v3.model.PolicyDecisionPoint;
import io.adminshell.aas.v3.model.PolicyEnforcementPoints;
import io.adminshell.aas.v3.model.PolicyInformationPoints;
import io.adminshell.aas.v3.model.Property;
import io.adminshell.aas.v3.model.Qualifiable;
import io.adminshell.aas.v3.model.Qualifier;
import io.adminshell.aas.v3.model.Range;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.ReferenceElement;
import io.adminshell.aas.v3.model.RelationshipElement;
import io.adminshell.aas.v3.model.Security;
import io.adminshell.aas.v3.model.SubjectAttributes;
import io.adminshell.aas.v3.model.Submodel;
import io.adminshell.aas.v3.model.SubmodelElement;
import io.adminshell.aas.v3.model.SubmodelElementCollection;
import io.adminshell.aas.v3.model.ValueList;
import io.adminshell.aas.v3.model.ValueReferencePair;
import io.adminshell.aas.v3.model.View;

public interface AssetAdministrationShellElementVisitor {

    public default void visit(Certificate certificate) {
        if (certificate == null) {
            return;
        }
        Class<?> type = certificate.getClass();
        if (BlobCertificate.class.isAssignableFrom(type)) {
            visit((BlobCertificate) certificate);
        }
    }

    public default void visit(Constraint constraint) {
        if (constraint == null) {
            return;
        }
        Class<?> type = constraint.getClass();
        if (Qualifier.class.isAssignableFrom(type)) {
            visit((Qualifier) constraint);
        } else if (Formula.class.isAssignableFrom(type)) {
            visit((Formula) constraint);
        }
    }

    public default void visit(DataElement dataElement) {
        if (dataElement == null) {
            return;
        }
        Class<?> type = dataElement.getClass();
        if (Property.class.isAssignableFrom(type)) {
            visit((Property) dataElement);
        } else if (MultiLanguageProperty.class.isAssignableFrom(type)) {
            visit((MultiLanguageProperty) dataElement);
        } else if (Range.class.isAssignableFrom(type)) {
            visit((Range) dataElement);
        } else if (ReferenceElement.class.isAssignableFrom(type)) {
            visit((ReferenceElement) dataElement);
        } else if (File.class.isAssignableFrom(type)) {
            visit((File) dataElement);
        } else if (Blob.class.isAssignableFrom(type)) {
            visit((Blob) dataElement);
        }
    }

    public default void visit(DataSpecificationContent dataSpecificationContent) {
        if (dataSpecificationContent == null) {
            return;
        }
        Class<?> type = dataSpecificationContent.getClass();
        if (DataSpecificationIEC61360.class.isAssignableFrom(type)) {
            visit((DataSpecificationIEC61360) dataSpecificationContent);
        }
    }

    public default void visit(Event event) {
        if (event == null) {
            return;
        }
        Class<?> type = event.getClass();
        if (BasicEvent.class.isAssignableFrom(type)) {
            visit((BasicEvent) event);
        }
    }

    public default void visit(HasDataSpecification hasDataSpecification) {
        if (hasDataSpecification == null) {
            return;
        }
        Class<?> type = hasDataSpecification.getClass();
        if (AssetAdministrationShell.class.isAssignableFrom(type)) {
            visit((AssetAdministrationShell) hasDataSpecification);
        } else if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) hasDataSpecification);
        } else if (View.class.isAssignableFrom(type)) {
            visit((View) hasDataSpecification);
        } else if (Asset.class.isAssignableFrom(type)) {
            visit((Asset) hasDataSpecification);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) hasDataSpecification);
        }

    }

    public default void visit(HasExtensions hasExtensions) {
        if (hasExtensions == null) {
            return;
        }
        Class<?> type = hasExtensions.getClass();
        if (Referable.class.isAssignableFrom(type)) {
            visit((Referable) hasExtensions);
        }
    }

    public default void visit(HasKind hasKind) {
        if (hasKind == null) {
            return;
        }
        Class<?> type = hasKind.getClass();
        if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) hasKind);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) hasKind);
        }
    }

    public default void visit(HasSemantics hasSemantics) {
        if (hasSemantics == null) {
            return;
        }
        Class<?> type = hasSemantics.getClass();
        if (Extension.class.isAssignableFrom(type)) {
            visit((Extension) hasSemantics);
        } else if (IdentifierKeyValuePair.class.isAssignableFrom(type)) {
            visit((IdentifierKeyValuePair) hasSemantics);
        } else if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) hasSemantics);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) hasSemantics);
        } else if (View.class.isAssignableFrom(type)) {
            visit((View) hasSemantics);
        } else if (Qualifier.class.isAssignableFrom(type)) {
            visit((Qualifier) hasSemantics);
        }
    }

    public default void visit(Identifiable identifiable) {
        if (identifiable == null) {
            return;
        }
        Class<?> type = identifiable.getClass();
        if (AssetAdministrationShell.class.isAssignableFrom(type)) {
            visit((AssetAdministrationShell) identifiable);
        } else if (Asset.class.isAssignableFrom(type)) {
            visit((Asset) identifiable);
        } else if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) identifiable);
        } else if (ConceptDescription.class.isAssignableFrom(type)) {
            visit((ConceptDescription) identifiable);
        }
    }

    public default void visit(SubmodelElement submodelElement) {
        if (submodelElement == null) {
            return;
        }
        Class<?> type = submodelElement.getClass();
        if (RelationshipElement.class.isAssignableFrom(type)) {
            visit((RelationshipElement) submodelElement);
        } else if (DataElement.class.isAssignableFrom(type)) {
            visit((DataElement) submodelElement);
        } else if (Capability.class.isAssignableFrom(type)) {
            visit((Capability) submodelElement);
        } else if (SubmodelElementCollection.class.isAssignableFrom(type)) {
            visit((SubmodelElementCollection) submodelElement);
        } else if (Operation.class.isAssignableFrom(type)) {
            visit((Operation) submodelElement);
        } else if (Event.class.isAssignableFrom(type)) {
            visit((Event) submodelElement);
        } else if (Entity.class.isAssignableFrom(type)) {
            visit((Entity) submodelElement);
        }
    }

    public default void visit(Qualifiable qualifiable) {
        if (qualifiable == null) {
            return;
        }
        Class<?> type = qualifiable.getClass();
        if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) qualifiable);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) qualifiable);
        } else if (AccessPermissionRule.class.isAssignableFrom(type)) {
            visit((AccessPermissionRule) qualifiable);
        }
    }

    public default void visit(Referable referable) {
        if (referable == null) {
            return;
        }
        Class<?> type = referable.getClass();
        if (Identifiable.class.isAssignableFrom(type)) {
            visit((Identifiable) referable);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) referable);
        } else if (View.class.isAssignableFrom(type)) {
            visit((View) referable);
        } else if (AccessPermissionRule.class.isAssignableFrom(type)) {
            visit((AccessPermissionRule) referable);
        }
    }

    public default void visit(AssetAdministrationShellEnvironment assetAdministrationShellEnvironment) {
    }

    public default void visit(AccessControl accessControl) {
    }

    public default void visit(AccessControlPolicyPoints accessControlPolicyPoints) {
    }

    public default void visit(AccessPermissionRule accessPermissionRule) {
    }

    public default void visit(AdministrativeInformation administrativeInformation) {
    }

    public default void visit(AnnotatedRelationshipElement annotatedRelationshipElement) {
    }

    public default void visit(Asset asset) {
    }

    public default void visit(AssetAdministrationShell assetAdministrationShell) {
    }

    public default void visit(AssetInformation assetInformation) {
    }

    public default void visit(BasicEvent basicEvent) {
    }

    public default void visit(Blob blob) {
    }

    public default void visit(BlobCertificate blobCertificate) {
    }

    public default void visit(Capability capability) {
    }

    public default void visit(ConceptDescription conceptDescription) {
    }

    public default void visit(DataSpecificationIEC61360 dataSpecificationIEC61360) {
    }

    public default void visit(DataSpecificationPhysicalUnit dataSpecificationPhysicalUnit) {
    }

    public default void visit(EmbeddedDataSpecification embeddedDataSpecification) {
    }

    public default void visit(Entity entity) {
    }

    public default void visit(EventElement eventElement) {
    }

    public default void visit(EventMessage eventMessage) {
    }

    public default void visit(Extension extension) {
    }

    public default void visit(File file) {
    }

    public default void visit(Formula formula) {
    }

    public default void visit(Identifier identifier) {
    }

    public default void visit(IdentifierKeyValuePair identifierKeyValuePair) {
    }

    public default void visit(Key key) {
    }

    public default void visit(LangString langString) {
    }

    public default void visit(MultiLanguageProperty multiLanguageProperty) {
    }

    public default void visit(ObjectAttributes objectAttributes) {
    }

    public default void visit(Operation operation) {
    }

    public default void visit(OperationVariable operationVariable) {
    }

    public default void visit(Permission permission) {
    }

    public default void visit(PermissionsPerObject permissionsPerObject) {
    }

    public default void visit(PolicyAdministrationPoint policyAdministrationPoint) {
    }

    public default void visit(PolicyDecisionPoint policyDecisionPoint) {
    }

    public default void visit(PolicyEnforcementPoints policyEnforcementPoints) {
    }

    public default void visit(PolicyInformationPoints policyInformationPoints) {
    }

    public default void visit(Property property) {
    }

    public default void visit(Qualifier qualifier) {
    }

    public default void visit(Range range) {
    }

    public default void visit(Reference reference) {
    }

    public default void visit(ReferenceElement referenceElement) {
    }

    public default void visit(RelationshipElement relationshipElement) {
    }

    public default void visit(Security security) {
    }

    public default void visit(SubjectAttributes subjectAttributes) {
    }

    public default void visit(Submodel submodel) {
    }

    public default void visit(SubmodelElementCollection submodelElementCollection) {
    }

    public default void visit(ValueList valueList) {
    }

    public default void visit(ValueReferencePair valueReferencePair) {
    }

    public default void visit(View view) {
    }
}
