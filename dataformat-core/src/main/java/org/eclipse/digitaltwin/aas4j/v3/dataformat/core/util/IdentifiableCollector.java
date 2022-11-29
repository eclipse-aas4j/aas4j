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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.visitor.AssetAdministrationShellElementWalkerVisitor;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;

import java.util.HashSet;
import java.util.Set;

/**
 * Collects all Identifiable elements within an
 * AssetAdministrationShellEnvironment
 */
public class IdentifiableCollector {

    private Environment env;

    public IdentifiableCollector(Environment env) {
        this.env = env;
    }

    public Set<Identifiable> collect() {
        Visitor visitor = new Visitor();
        visitor.visit(env);
        return visitor.identifiables;
    }

    private class Visitor implements AssetAdministrationShellElementWalkerVisitor {

        Set<Identifiable> identifiables = new HashSet<>();

        @Override
        public void visit(AssetAdministrationShell value) {
            identifiables.add(value);
            AssetAdministrationShellElementWalkerVisitor.super.visit(value);
        }

        @Override
        public void visit(Submodel value) {
            identifiables.add(value);
            AssetAdministrationShellElementWalkerVisitor.super.visit(value);
        }

        @Override
        public void visit(ConceptDescription value) {
            identifiables.add(value);
            AssetAdministrationShellElementWalkerVisitor.super.visit(value);
        }
    }
}
