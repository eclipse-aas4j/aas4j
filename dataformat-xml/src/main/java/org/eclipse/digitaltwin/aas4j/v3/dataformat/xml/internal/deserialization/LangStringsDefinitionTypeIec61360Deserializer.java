/*
 * Copyright (c) 2023 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.util.LangStringContent;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIec61360;

/**
 * @author schnicke
 */
public class LangStringsDefinitionTypeIec61360Deserializer
    extends AbstractLangStringsDeserializer<LangStringDefinitionTypeIec61360> {

  public LangStringsDefinitionTypeIec61360Deserializer() {
    super("langStringDefinitionTypeIec61360");
  }

  @Override
  protected LangStringDefinitionTypeIec61360 createLangStringInstance(LangStringContent content) {
    return new DefaultLangStringDefinitionTypeIec61360.Builder()
        .language(content.getLanguage())
        .text(content.getText())
        .build();
  }
}
