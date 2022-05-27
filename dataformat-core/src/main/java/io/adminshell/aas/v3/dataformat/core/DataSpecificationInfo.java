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
package io.adminshell.aas.v3.dataformat.core;

import io.adminshell.aas.v3.rc02.model.DataSpecificationContent;
import io.adminshell.aas.v3.rc02.model.Reference;

/**
 * Class representing all information required for a (custom) data specification
 */
public class DataSpecificationInfo {

    private final Class<? extends DataSpecificationContent> type;
    private final Reference reference;
    private final String prefix;

    public DataSpecificationInfo(Class<? extends DataSpecificationContent> type, Reference reference, String prefix) {
        this.type = type;
        this.reference = reference;
        this.prefix = prefix;
    }

    public Class<? extends DataSpecificationContent> getType() {
        return type;
    }

    public Reference getReference() {
        return reference;
    }

    public String getPrefix() {
        return prefix;
    }
}
