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

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShellDescriptor;

/** */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultAssetAdministrationShellDescriptor.class)})
public interface AssetAdministrationShellDescriptor extends Descriptor {

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/administration
   *
   * @return Returns the AdministrativeInformation for the property administration.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/administration")
  AdministrativeInformation getAdministration();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/administration
   *
   * @param administration desired value for the property administration.
   */
  void setAdministration(AdministrativeInformation administration);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetKind
   *
   * @return Returns the AssetKind for the property assetKind.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetKind")
  AssetKind getAssetKind();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetKind
   *
   * @param assetKind desired value for the property assetKind.
   */
  void setAssetKind(AssetKind assetKind);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetType
   *
   * @return Returns the String for the property assetType.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetType")
  String getAssetType();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/assetType
   *
   * @param assetType desired value for the property assetType.
   */
  void setAssetType(String assetType);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/endpoints
   *
   * @return Returns the List of Endpoints for the property endpoints.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/endpoints")
  List<Endpoint> getEndpoints();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/endpoints
   *
   * @param endpoints desired value for the property endpoints.
   */
  void setEndpoints(List<Endpoint> endpoints);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/globalAssetId
   *
   * @return Returns the String for the property globalAssetId.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/globalAssetId")
  String getGlobalAssetId();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/globalAssetId
   *
   * @param globalAssetId desired value for the property globalAssetId.
   */
  void setGlobalAssetId(String globalAssetId);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/idShort
   *
   * @return Returns the String for the property idShort.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/idShort")
  String getIdShort();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/idShort
   *
   * @param idShort desired value for the property idShort.
   */
  void setIdShort(String idShort);

  /**
   * More information under https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/id
   *
   * @return Returns the String for the property id.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/id")
  String getId();

  /**
   * More information under https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/id
   *
   * @param id desired value for the property id.
   */
  void setId(String id);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/specificAssetIds
   *
   * @return Returns the List of SpecificAssetIds for the property specificAssetIds.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/specificAssetIds")
  List<SpecificAssetId> getSpecificAssetIds();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/specificAssetIds
   *
   * @param specificAssetIds desired value for the property specificAssetIds.
   */
  void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/submodelDescriptors
   *
   * @return Returns the List of SubmodelDescriptors for the property submodelDescriptors.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/submodelDescriptors")
  List<SubmodelDescriptor> getSubmodelDescriptors();

  /**
   * More information under
   * https://admin-shell.io/aas/3/1/AssetAdministrationShellDescriptor/submodelDescriptors
   *
   * @param submodelDescriptors desired value for the property submodelDescriptors.
   */
  void setSubmodelDescriptors(List<SubmodelDescriptor> submodelDescriptors);
}
