/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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
 */

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;

/** Administrative meta-information for an element like version information. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)})
public interface AdministrativeInformation extends HasDataSpecification {

  /**
   * Version of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/version
   *
   * @return Returns the String for the property version.
   */
  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/version")
  String getVersion();

  /**
   * Version of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/version
   *
   * @param version desired value for the property version.
   */
  void setVersion(String version);

  /**
   * Revision of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/revision
   *
   * @return Returns the String for the property revision.
   */
  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/revision")
  String getRevision();

  /**
   * Revision of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/revision
   *
   * @param revision desired value for the property revision.
   */
  void setRevision(String revision);

  /**
   * The subject ID of the subject responsible for making the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/creator
   *
   * @return Returns the Reference for the property creator.
   */
  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/creator")
  Reference getCreator();

  /**
   * The subject ID of the subject responsible for making the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/creator
   *
   * @param creator desired value for the property creator.
   */
  void setCreator(Reference creator);

  /**
   * Identifier of the template that guided the creation of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/templateId
   *
   * @return Returns the String for the property templateId.
   */
  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/templateId")
  String getTemplateId();

  /**
   * Identifier of the template that guided the creation of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/AdministrativeInformation/templateId
   *
   * @param templateId desired value for the property templateId.
   */
  void setTemplateId(String templateId);
}
