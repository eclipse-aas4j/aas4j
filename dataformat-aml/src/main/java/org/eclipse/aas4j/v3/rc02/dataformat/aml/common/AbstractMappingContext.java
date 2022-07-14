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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.common;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.common.naming.NamingStrategy;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.Mapper;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingContext;
import org.eclipse.aas4j.v3.rc02.dataformat.mapping.MappingProvider;
import java.beans.PropertyDescriptor;

/**
 * Abstract base class for MappingContext used for mapping between AML and AAS
 *
 * @param <T>
 */
public class AbstractMappingContext<T extends Mapper> extends MappingContext<T> {

    protected final NamingStrategy classNamingStrategy;
    protected final NamingStrategy propertyNamingStrategy;
    protected final PropertyDescriptor property;

    protected AbstractMappingContext(MappingProvider<T> mappingProvider,
            NamingStrategy classNamingStrategy,
            NamingStrategy propertyNamingStrategy,
            PropertyDescriptor property) {
        super(mappingProvider);
        this.classNamingStrategy = classNamingStrategy;
        this.propertyNamingStrategy = propertyNamingStrategy;
        this.property = property;
    }

    /**
     * Gets the class naming strategy. This is used to resolve naming
     * differences in class names between AML and AAS.
     *
     * @return the naming strategy
     */
    public NamingStrategy getClassNamingStrategy() {
        return classNamingStrategy;
    }

    /**
     * Gets the property naming strategy. This is used to resolve naming
     * differences in property namings between AML and AAS.
     *
     * @return
     */
    public NamingStrategy getPropertyNamingStrategy() {
        return propertyNamingStrategy;
    }

    /**
     * Gets the currently processed property if present, otherwise null
     *
     * @return the currently processed property if present, otherwise null
     */
    public PropertyDescriptor getProperty() {
        return property;
    }

}
