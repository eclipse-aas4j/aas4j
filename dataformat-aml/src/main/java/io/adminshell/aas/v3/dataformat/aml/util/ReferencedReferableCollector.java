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
package io.adminshell.aas.v3.dataformat.aml.util;

import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.core.visitor.AssetAdministrationShellElementWalkerVisitor;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.ReferenceElement;
import io.adminshell.aas.v3.model.RelationshipElement;
import java.util.HashSet;
import java.util.Set;

public class ReferencedReferableCollector {

    private AssetAdministrationShellEnvironment env;

    public ReferencedReferableCollector(AssetAdministrationShellEnvironment env) {
        this.env = env;
    }

    public Set<Reference> collect() {
        Visitor visitor = new Visitor();
        visitor.visit(env);
        return visitor.referencedElements;
    }

    private class Visitor implements AssetAdministrationShellElementWalkerVisitor {

        Set<Reference> referencedElements = new HashSet<>();

        @Override
        public void visit(ReferenceElement referenceElement) {
            handleReference(referenceElement.getValue());
            AssetAdministrationShellElementWalkerVisitor.super.visit(referenceElement);
        }

        private void handleReference(Reference reference) {
            Referable target = AasUtils.resolve(reference, env);
            if (target != null) {
                referencedElements.add(reference);
            }
        }

        @Override
        public void visit(RelationshipElement relationshipElement) {
            handleReference(relationshipElement.getFirst());
            handleReference(relationshipElement.getSecond());
            AssetAdministrationShellElementWalkerVisitor.super.visit(relationshipElement);
        }
    }
}
