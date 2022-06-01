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
package org.eclipse.aas4j.v3.rc02.dataformat.aml;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.deserialization.AasTypeFactory;

public class AmlDeserializationConfig {

    public static Builder builder() {
        return new Builder();
    }

    private final AasTypeFactory typeFactory;

    private AmlDeserializationConfig(AasTypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }

    public AasTypeFactory getTypeFactory() {
        return typeFactory;
    }

    public static class Builder {

        private AasTypeFactory typeFactory = new AasTypeFactory();

        public AmlDeserializationConfig build() {
            return new AmlDeserializationConfig(typeFactory);
        }

        public Builder typeFactory(AasTypeFactory value) {
            this.typeFactory = value;
            return this;
        }
    }

}
