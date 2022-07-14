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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.util;

import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.dataformat.core.visitor.AssetAdministrationShellElementWalkerVisitor;
import org.eclipse.aas4j.v3.rc02.model.Environment;
import org.eclipse.aas4j.v3.rc02.model.Referable;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import java.util.HashSet;
import java.util.Set;

public class ReferencedByViewCollector {

    private Environment env;

    public ReferencedByViewCollector(Environment env) {
        this.env = env;
    }

    public Set<Referable> collect() {
        Visitor visitor = new Visitor();
        visitor.visit(env);
        return visitor.referencedElements;
    }

    private class Visitor implements AssetAdministrationShellElementWalkerVisitor {

        Set<Referable> referencedElements = new HashSet<>();


        private void handleReference(Reference reference) {
            Referable target = AasUtils.resolve(reference, env);
            if (target != null) {
                referencedElements.add(target);
            }
        }

    }
}
