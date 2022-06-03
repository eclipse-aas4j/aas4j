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

import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.rc02.model.ModelingKind;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.Submodel;
import java.beans.PropertyDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssetAdministrationShellMapper extends DefaultMapper<AssetAdministrationShell> {

    private static final Logger log = LoggerFactory.getLogger(AssetAdministrationShellMapper.class);

    @Override
    protected boolean skipProperty(PropertyDescriptor property) {
        return "submodels".equals(property.getName());
    }

    @Override
    public void map(AssetAdministrationShell aas, AmlGenerator generator, MappingContext context) throws MappingException {
        if (aas == null) {
            return;
        }
        InternalElementType.Builder builder = toInternalElement(aas, generator, context);
        boolean hasTemplateSubmodel = false;
        for (Reference reference : aas.getSubmodels()) {
            Submodel resolvedSubmodel = AasUtils.resolve(reference, context.getEnvironment(), Submodel.class);
            if (resolvedSubmodel != null) {
                context.map(resolvedSubmodel, generator.with(builder));
                if (resolvedSubmodel.getKind() == ModelingKind.TEMPLATE) {
                    hasTemplateSubmodel = true;
                }
            } else {
                log.warn("unresolvable submodel reference '{}' found in AssetAdministrationShell '{}'",
                        AasUtils.asString(reference),
                        aas.getId());
                context.map(AasUtils.asString(reference), generator);
            }
        }
        if (hasTemplateSubmodel) {
            builder = builder.withRefBaseSystemUnitPath(generator.getDocumentInfo().getAssetAdministrationShellSystemUnitClassLib()
                    + "/" + context.getClassNamingStrategy().getName(aas.getClass(), aas, null));
        }
        generator.with(builder).appendReferenceTargetInterfaceIfRequired(aas, context);
        generator.add(builder.build());
    }
}
