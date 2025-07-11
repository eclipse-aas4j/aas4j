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
import javax.xml.datatype.Duration;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationRequest;

/** */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultOperationRequest.class)})
public interface OperationRequest {

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments
   *
   * @return Returns the List of OperationVariables for the property inoutputArguments.
   */
  @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments")
  List<OperationVariable> getInoutputArguments();

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/inoutputArguments
   *
   * @param inoutputArguments desired value for the property inoutputArguments.
   */
  void setInoutputArguments(List<OperationVariable> inoutputArguments);

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/inputArguments
   *
   * @return Returns the List of OperationVariables for the property inputArguments.
   */
  @IRI("https://admin-shell.io/aas/3/0/OperationRequest/inputArguments")
  List<OperationVariable> getInputArguments();

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/inputArguments
   *
   * @param inputArguments desired value for the property inputArguments.
   */
  void setInputArguments(List<OperationVariable> inputArguments);

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/clientTimeoutDuration
   *
   * @return Returns the String for the property clientTimeoutDuration.
   */
  @IRI("https://admin-shell.io/aas/3/0/OperationRequest/clientTimeoutDuration")
  Duration getClientTimeoutDuration();

  /**
   * More information under https://admin-shell.io/aas/3/0/OperationRequest/clientTimeoutDuration
   *
   * @param clientTimeoutDuration desired value for the property clientTimeoutDuration.
   */
  void setClientTimeoutDuration(Duration clientTimeoutDuration);
}
