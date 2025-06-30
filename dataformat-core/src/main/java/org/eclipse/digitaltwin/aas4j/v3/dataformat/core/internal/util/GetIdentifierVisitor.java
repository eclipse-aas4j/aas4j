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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor.AssetAdministrationShellElementVisitor;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

public class GetIdentifierVisitor implements AssetAdministrationShellElementVisitor {

    private String identifier;

    public static String getIdentifier(Referable referable) {
        GetIdentifierVisitor visitor = new GetIdentifierVisitor();
        visitor.visit(referable);
        return visitor.getIdentifier();
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void visit(Referable referable) {
        if (referable != null) {
            identifier = referable.getIdShort();
        }
        AssetAdministrationShellElementVisitor.super.visit(referable);
    }

    @Override
    public void visit(Identifiable identifiable) {
        if (identifiable != null) {
            identifier = identifiable.getId();
        }
        AssetAdministrationShellElementVisitor.super.visit(identifiable);
    }
}
