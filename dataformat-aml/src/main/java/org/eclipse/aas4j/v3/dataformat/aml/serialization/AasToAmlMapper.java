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
package org.eclipse.aas4j.v3.dataformat.aml.serialization;

import org.eclipse.aas4j.v3.dataformat.aml.AmlSerializationConfig;
import org.eclipse.aas4j.v3.dataformat.aml.common.naming.AbstractClassNamingStrategy;
import org.eclipse.aas4j.v3.dataformat.aml.common.naming.NumberingClassNamingStrategy;
import org.eclipse.aas4j.v3.dataformat.aml.common.naming.PropertyNamingStrategy;
import org.eclipse.aas4j.v3.dataformat.aml.header.AutomationMLVersion;
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.CAEXFile;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.AssetAdministrationShellEnvironmentMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.AssetAdministrationShellMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.ConstraintCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.DataSpecificationContentMapper;
// TODO import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.DataSpecificationIEC61360Mapper;
// TODO import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.EmbeddedDataSpecificationCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.FileMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.LangStringCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.OperationVariableCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.OperationVariableMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.QualifierMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.ReferenceCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.ReferenceElementMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.RelationshipElementMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.SubmodelMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.ConceptDescriptionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.IdentifierKeyValuePairCollectionMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.PropertyMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.RangeMapper;
import org.eclipse.aas4j.v3.dataformat.aml.serialization.mappers.ReferenceMapper;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingProvider;
import org.eclipse.aas4j.v3.model.Environment;
import org.eclipse.aas4j.v3.model.LangString;
import org.eclipse.aas4j.v3.model.Qualifier;
import org.eclipse.aas4j.v3.model.Referable;
import org.slf4j.LoggerFactory;
import org.eclipse.aas4j.v3.dataformat.mapping.SourceBasedMapper;
import org.eclipse.aas4j.v3.model.MultiLanguageProperty;

/**
 * Maps an Environment to an AML file
 */
public class AasToAmlMapper {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AasToAmlMapper.class);

    /**
     * Maps an Environment to an AML file (represented
     * by a CAEXFile)
     *
     * @param env the Environment to map
     * @param config the serialization conig
     * @return an AML representation of the Environment
     * @throws MappingException if the mapping fails
     */
    public CAEXFile map(Environment env, AmlSerializationConfig config) throws MappingException {
        AbstractClassNamingStrategy classNamingStrategy = new NumberingClassNamingStrategy();
        classNamingStrategy.registerCustomNaming(LangString.class, x -> "aml-lang=" + x.getLanguage());
        PropertyNamingStrategy propertyNamingStrategy = new PropertyNamingStrategy();
        propertyNamingStrategy.registerCustomNaming(Referable.class, "descriptions", "description");
        propertyNamingStrategy.registerCustomNaming(MultiLanguageProperty.class, "values", "value");
        propertyNamingStrategy.registerCustomNaming(Qualifier.class, x -> "qualifier:" + x.getType() + "=" + x.getValue(), x -> "qualifier");
        MappingProvider<SourceBasedMapper> mappingProvider = new MappingProvider<>(
                SourceBasedMapper.class,
                new DefaultMapper(),
                new DefaultCollectionMapper());

        mappingProvider.register(new AssetAdministrationShellEnvironmentMapper());
        mappingProvider.register(new LangStringCollectionMapper());
        mappingProvider.register(new ReferenceMapper());
        mappingProvider.register(new AssetAdministrationShellMapper());
        mappingProvider.register(new OperationVariableMapper());
        mappingProvider.register(new OperationVariableCollectionMapper());
        mappingProvider.register(new ReferenceCollectionMapper());
        mappingProvider.register(new ConstraintCollectionMapper());
        mappingProvider.register(new QualifierMapper());
        mappingProvider.register(new FileMapper());
        mappingProvider.register(new SubmodelMapper());
        // TODO mappingProvider.register(new EmbeddedDataSpecificationCollectionMapper());
        mappingProvider.register(new DataSpecificationContentMapper());
        mappingProvider.register(new ReferenceElementMapper());
        mappingProvider.register(new RelationshipElementMapper());
        // TODO mappingProvider.register(new DataSpecificationIEC61360Mapper());
        mappingProvider.register(new PropertyMapper());
        mappingProvider.register(new RangeMapper());
        mappingProvider.register(new ConceptDescriptionMapper());
        mappingProvider.register(new IdentifierKeyValuePairCollectionMapper());
        MappingContext context = new MappingContext(
                mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                env);
        CAEXFile.Builder builder = CAEXFile.builder()
                .withSchemaVersion(config.getCaexSchemaVersion())
                .withFileName(config.getFilename())
                .addAdditionalInformation(new AutomationMLVersion(config.getAmlVersion()));
        if (config.getWriterInfo() != null) {
            builder = builder.addAdditionalInformation(config.getWriterInfo().wrap());
        }
        if (!config.getAdditionalInformation().isEmpty()) {
            builder = builder.addAdditionalInformation(config.getAdditionalInformation());
        }
        context.map(env, AmlGenerator.builder()
                .file(builder)
                .idGenerator(config.getIdGenerator())
                .build());
        return builder.build();
    }
}
