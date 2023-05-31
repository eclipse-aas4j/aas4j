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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal;

import java.util.HashMap;
import java.util.Map;


public class AasXmlNamespaceContext {

    public static final String AAS_PREFERRED_PREFIX = "aas";
	public static final String AAS_URI = "https://admin-shell.io/aas/3/0";

    public static final String XSI_PREFERRED_PREFIX = "xsi";
    public static final String XSI_URI = "http://www.w3.org/2001/XMLSchema-instance";

    public static final Map<String, String> PREFERRED_PREFIX_CONTEXT = new HashMap<>();

    static {
        PREFERRED_PREFIX_CONTEXT.put(AAS_PREFERRED_PREFIX, AAS_URI);
        PREFERRED_PREFIX_CONTEXT.put(XSI_PREFERRED_PREFIX, XSI_URI);
    }

    private AasXmlNamespaceContext() {
    }
}
