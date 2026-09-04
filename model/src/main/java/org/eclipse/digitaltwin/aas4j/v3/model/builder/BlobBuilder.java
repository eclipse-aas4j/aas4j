/*
 * Copyright (c) 2026 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * AI-assisted: This file was generated or updated with assistance from AI tools.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.util.List;

public abstract class BlobBuilder<T extends Blob, B extends BlobBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

  /**
   * This function allows setting a value for value
   *
   * @param value desired value to be set
   * @return Builder object with new value for value
   */
  public B value(byte[] value) {
    getBuildingInstance().setValue(value);
    return getSelf();
  }

  /**
   * This function allows setting a value for contentType
   *
   * @param contentType desired value to be set
   * @return Builder object with new value for contentType
   */
  public B contentType(String contentType) {
    getBuildingInstance().setContentType(contentType);
    return getSelf();
  }

  /**
   * This function allows setting a value for category
   *
   * @param category desired value to be set
   * @return Builder object with new value for category
   */
  public B category(String category) {
    getBuildingInstance().setCategory(category);
    return getSelf();
  }

  /**
   * This function allows setting a value for idShort
   *
   * @param idShort desired value to be set
   * @return Builder object with new value for idShort
   */
  public B idShort(String idShort) {
    getBuildingInstance().setIdShort(idShort);
    return getSelf();
  }

  /**
   * This function allows setting a value for displayName
   *
   * @param displayNames desired value to be set
   * @return Builder object with new value for displayName
   */
  public B displayName(List<LangStringNameType> displayNames) {
    getBuildingInstance().setDisplayName(displayNames);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List displayName
   *
   * @param displayName desired value to be added
   * @return Builder object with new value for displayName
   */
  public B displayName(LangStringNameType displayName) {
    getBuildingInstance().getDisplayName().add(displayName);
    return getSelf();
  }

  /**
   * This function allows setting a value for description
   *
   * @param descriptions desired value to be set
   * @return Builder object with new value for description
   */
  public B description(List<LangStringTextType> descriptions) {
    getBuildingInstance().setDescription(descriptions);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List description
   *
   * @param description desired value to be added
   * @return Builder object with new value for description
   */
  public B description(LangStringTextType description) {
    getBuildingInstance().getDescription().add(description);
    return getSelf();
  }

  /**
   * This function allows setting a value for extensions
   *
   * @param extensions desired value to be set
   * @return Builder object with new value for extensions
   */
  public B extensions(List<Extension> extensions) {
    getBuildingInstance().setExtensions(extensions);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List extensions
   *
   * @param extension desired value to be added
   * @return Builder object with new value for extensions
   */
  public B extension(Extension extension) {
    getBuildingInstance().getExtensions().add(extension);
    return getSelf();
  }

  /**
   * This function allows setting a value for embeddedDataSpecifications
   *
   * @param embeddedDataSpecifications desired value to be set
   * @return Builder object with new value for embeddedDataSpecifications
   */
  public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List embeddedDataSpecifications
   *
   * @param embeddedDataSpecification desired value to be added
   * @return Builder object with new value for embeddedDataSpecifications
   */
  public B embeddedDataSpecification(EmbeddedDataSpecification embeddedDataSpecification) {
    getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
    return getSelf();
  }

  /**
   * This function allows setting a value for semanticId
   *
   * @param semanticId desired value to be set
   * @return Builder object with new value for semanticId
   */
  public B semanticId(Reference semanticId) {
    getBuildingInstance().setSemanticId(semanticId);
    return getSelf();
  }

  /**
   * This function allows setting a value for supplementalSemanticIds
   *
   * @param supplementalSemanticIds desired value to be set
   * @return Builder object with new value for supplementalSemanticIds
   */
  public B supplementalSemanticIds(List<Reference> supplementalSemanticIds) {
    getBuildingInstance().setSupplementalSemanticIds(supplementalSemanticIds);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List supplementalSemanticIds
   *
   * @param supplementalSemanticId desired value to be added
   * @return Builder object with new value for supplementalSemanticIds
   */
  public B supplementalSemanticId(Reference supplementalSemanticId) {
    getBuildingInstance().getSupplementalSemanticIds().add(supplementalSemanticId);
    return getSelf();
  }

  /**
   * This function allows setting a value for qualifiers
   *
   * @param qualifiers desired value to be set
   * @return Builder object with new value for qualifiers
   */
  public B qualifiers(List<Qualifier> qualifiers) {
    getBuildingInstance().setQualifiers(qualifiers);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List qualifiers
   *
   * @param qualifier desired value to be added
   * @return Builder object with new value for qualifiers
   */
  public B qualifier(Qualifier qualifier) {
    getBuildingInstance().getQualifiers().add(qualifier);
    return getSelf();
  }
}
