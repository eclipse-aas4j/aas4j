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
package io.adminshell.aas.v3.dataformat.i4aas.mappers;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.core.AASSimple;
import io.adminshell.aas.v3.dataformat.i4aas.UANodeSetMarshaller;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;

public class SubmodelMapperTest {

	@Test
	public void test() throws JAXBException {
		SubmodelMapper tesling = new SubmodelMapper(AASSimple.SUBMODEL_DOCUMENTATION, new MappingContext(new DefaultAssetAdministrationShellEnvironment()));
		UAObject map = tesling.map();
		UANodeSet nodeSet = tesling.ctx.getNodeSet();
		String marshallAsString = new UANodeSetMarshaller(nodeSet).marshallAsString();
	}

}
