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
package io.adminshell.aas.v3.dataformat.aml.serialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.ModelingKind;
import io.adminshell.aas.v3.rc02.model.Submodel;

public class SubmodelMapper extends DefaultMapper<Submodel> {

    public SubmodelMapper() {
    }

    @Override
    protected InternalElementType.Builder toInternalElement(Submodel value, AmlGenerator generator, MappingContext context) throws MappingException {
        InternalElementType.Builder builder = super.toInternalElement(value, generator, context);
        if (value.getKind() == ModelingKind.TEMPLATE) {
            builder = builder.withRefBaseSystemUnitPath(generator.getDocumentInfo().getAssetAdministrationShellSystemUnitClassLib()
                    + "/" + context.getClassNamingStrategy().getName(value.getClass(), value, null));
        }
        return builder;
    }
}
