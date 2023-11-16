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

import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Capability;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.EventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.EventPayload;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.HasDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.HasExtensions;
import org.eclipse.digitaltwin.aas4j.v3.model.HasKind;
import org.eclipse.digitaltwin.aas4j.v3.model.HasSemantics;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
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
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

public interface AssetAdministrationShellElementVisitor {

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

    public default void visit(EventElement event) {
        if (event == null) {
            return;
        }
        Class<?> type = event.getClass();
        if (BasicEventElement.class.isAssignableFrom(type)) {
            visit((BasicEventElement) event);
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
        }
    }

    public default void visit(HasSemantics hasSemantics) {
        if (hasSemantics == null) {
            return;
        }
        Class<?> type = hasSemantics.getClass();
        if (Extension.class.isAssignableFrom(type)) {
            visit((Extension) hasSemantics);
        } else if (SpecificAssetId.class.isAssignableFrom(type)) {
            visit((SpecificAssetId) hasSemantics);
        } else if (Submodel.class.isAssignableFrom(type)) {
            visit((Submodel) hasSemantics);
        } else if (SubmodelElement.class.isAssignableFrom(type)) {
            visit((SubmodelElement) hasSemantics);
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
        } else if (SubmodelElementList.class.isAssignableFrom(type)) {
            visit((SubmodelElementList) submodelElement);
        } else if (Operation.class.isAssignableFrom(type)) {
            visit((Operation) submodelElement);
        } else if (EventElement.class.isAssignableFrom(type)) {
            visit((EventElement) submodelElement);
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
        }
    }

    public default void visit(Environment assetAdministrationShellEnvironment) {
    }

    public default void visit(AdministrativeInformation administrativeInformation) {
    }

    public default void visit(AnnotatedRelationshipElement annotatedRelationshipElement) {
    }

    public default void visit(AssetAdministrationShell assetAdministrationShell) {
    }

    public default void visit(AssetInformation assetInformation) {
    }

    public default void visit(BasicEventElement basicEvent) {
    }

    public default void visit(Blob blob) {
    }

    public default void visit(Capability capability) {
    }

    public default void visit(ConceptDescription conceptDescription) {
    }

    public default void visit(DataSpecificationContent dataSpecificationContent) {
    }

    public default void visit(Entity entity) {
    }

    public default void visit(EventPayload eventMessage) {
    }

    public default void visit(Extension extension) {
    }

    public default void visit(File file) {
    }

    public default void visit(SpecificAssetId identifierKeyValuePair) {
    }

    public default void visit(Key key) {
    }

    public default void visit(LangStringNameType langString) {
    }

    public default void visit(LangStringDefinitionTypeIec61360 langString) {
    }

    public default void visit(LangStringTextType langString) {
    }

    public default void visit(LangStringPreferredNameTypeIec61360 langString) {
    }

    public default void visit(MultiLanguageProperty multiLanguageProperty) {
    }

    public default void visit(Operation operation) {
    }

    public default void visit(OperationVariable operationVariable) {
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

    public default void visit(Submodel submodel) {
    }

    public default void visit(SubmodelElementCollection submodelElementCollection) {
    }

    public default void visit(SubmodelElementList submodelElementList) {
    }

    public default void visit(Resource resource) {

    }
}
