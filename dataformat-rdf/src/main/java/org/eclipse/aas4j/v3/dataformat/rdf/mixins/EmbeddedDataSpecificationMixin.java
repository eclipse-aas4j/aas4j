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
package org.eclipse.aas4j.v3.dataformat.rdf.mixins;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.aas4j.v3.model.DataSpecificationIEC61360;
import org.eclipse.aas4j.v3.model.LangString;
import org.eclipse.aas4j.v3.model.Reference;

import java.util.List;

@JsonTypeName("aas:EmbeddedDataSpecification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface EmbeddedDataSpecificationMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecificationContent")
    public DataSpecificationIEC61360 getDataSpecificationContent();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecificationContent")
    public void setDataSpecificationContent(DataSpecificationIEC61360 dataSpecificationContent);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecification")
    public Reference getDataSpecification();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC02/EmbeddedDataSpecification/dataSpecification")
    public void setDataSpecification(Reference dataSpecification);

}
