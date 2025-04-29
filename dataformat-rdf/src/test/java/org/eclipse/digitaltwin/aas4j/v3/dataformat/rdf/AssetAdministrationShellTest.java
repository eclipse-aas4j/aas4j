package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAssetAdministrationShellRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AssetAdministrationShellTest {
    @Parameterized.Parameter
    public AssetAdministrationShell shell;

    @Parameterized.Parameters(name = "{index}: Shell - {0}")
    public static Object[] data() {
        List<AssetAdministrationShell> list = new LinkedList<>();
        list.add(SerializerUtil.getMaximalAssetAdministrationShell());
        list.add(SerializerUtil.getMinimalAssetAdministrationShell());
        list.add(AASFull.AAS_1);
        list.add(AASFull.AAS_2);
        list.add(AASFull.AAS_3);
        list.add(AASFull.AAS_4);
        list.add(AASSimple.AAS);
        return list.toArray();
    }


    @Test
    public void testAssetAdministrationShell() throws IncompatibleTypeException {
        AssetAdministrationShell object = shell;
        RDFSerializationResult rdfSerializationResult = new DefaultAssetAdministrationShellRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetAdministrationShell);

        AssetAdministrationShell recreatedObject = new DefaultAssetAdministrationShellRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assertEquals(object, recreatedObject);
    }


}
