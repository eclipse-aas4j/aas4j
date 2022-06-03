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
package org.eclipse.aas4j.v3.rc02.dataformat.core;

import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.aas4j.v3.rc02.model.DataSpecificationContent;
import org.eclipse.aas4j.v3.rc02.model.KeyTypes;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultKey;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultReference;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * This class is used to manage supported data specification templates. Each
 * template is identified through a reference and a prefix and provides a
 * corresponding Java class.
 */
public class DataSpecificationManager {

    public static final String PROP_DATA_SPECIFICATION = "dataSpecification";
    public static final String PROP_DATA_SPECIFICATION_CONTENT = "dataSpecificationContent";
    public static final String DATA_SPECIFICATION_IEC61360_IRI = "http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0";
    public static final String DATA_SPECIFICATION_IEC61360_PREFIX = "IEC";

    private static final Set<DataSpecificationInfo> KNOWN_IMPLEMENTATIONS = new HashSet<>(Arrays.asList(
    //        new DataSpecificationInfo(DataSpecificationIEC61360.class,
    //                createGlobalIri(DATA_SPECIFICATION_IEC61360_IRI),
    //                DATA_SPECIFICATION_IEC61360_PREFIX)
    ));

    /**
     * Allows to register an additional data specification template
     *
     * @param dataSpecification Details of the data specification template to
     * register
     */
    public static void register(DataSpecificationInfo dataSpecification) {
        KNOWN_IMPLEMENTATIONS.add(dataSpecification);
    }

    private static Reference createGlobalIri(String iri) {
        return new DefaultReference.Builder().keys(Arrays.asList(
                new DefaultKey.Builder().type(KeyTypes.GLOBAL_REFERENCE).value(iri).build()))
                .build();
    }

    /**
     * Returns a DataSpecificationInfo describing the data specification
     * template implemented by the given class. If the class is unknown, null is
     * returned.
     *
     * @param implementation type of the implementation class
     * @return a DataSpecificationInfo describing the data specification
     * template represented by the given class, or null if the implementation
     * class does not represent any data specification
     */
    public static DataSpecificationInfo getDataSpecification(Class<? extends DataSpecificationContent> implementation) {
        DataSpecificationInfo result = getDataSpecification(x -> Objects.equals(x.getType(), implementation));
        if (result == null) {
            result = getDataSpecification(x -> x.getType().isAssignableFrom(implementation));
        }
        return result;
    }

    /**
     * Returns a DataSpecificationInfo describing the data specification
     * template implemented by the given class. If the class is unknown, null is
     * returned.
     *
     * @param reference Reference associated with the wanted data specficiation
     * @return a DataSpecificationInfo describing the data specification
     * template represented by the reference, or null if the reference does not
     * represent any data specification
     */
    public static DataSpecificationInfo getDataSpecification(Reference reference) {
        return getDataSpecification(x -> AasUtils.sameAs(x.getReference(), reference));
    }

    private static DataSpecificationInfo getDataSpecification(Predicate<DataSpecificationInfo> filter) {
        Optional<DataSpecificationInfo> exactMatch = KNOWN_IMPLEMENTATIONS.stream()
                .filter(filter)
                .findFirst();
        if (exactMatch.isPresent()) {
            return exactMatch.get();
        }
        return null;
    }
}
