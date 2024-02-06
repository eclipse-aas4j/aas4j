package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAssetAdministrationShellRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAssetInformationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultResourceRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultSpecificAssetIdRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.junit.Test;

public class AssetAdministrationShellTest {

    @Test
    public void testMaximalSpecificAssetId() throws IncompatibleTypeException {
        SpecificAssetId object = SerializerUtil.getMaximalSpecificAssetId();
        RDFSerializationResult rdfSerializationResult = new DefaultSpecificAssetIdRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.SpecificAssetId);

        SpecificAssetId recreatedObject = new DefaultSpecificAssetIdRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testResource() throws IncompatibleTypeException {
        org.eclipse.digitaltwin.aas4j.v3.model.Resource object = SerializerUtil.getResource();
        RDFSerializationResult rdfSerializationResult = new DefaultResourceRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Resource);


        org.eclipse.digitaltwin.aas4j.v3.model.Resource recreatedObject = new DefaultResourceRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMinimalAssetInformation() throws IncompatibleTypeException {
        AssetInformation object = SerializerUtil.getMinimalAssetInformation();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetInformationRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetInformation);


        AssetInformation recreatedObject = new DefaultAssetInformationRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalAssetInformation() throws IncompatibleTypeException {
        AssetInformation object = SerializerUtil.getMaximalAssetInformation();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetInformationRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetInformation);


        AssetInformation recreatedObject = new DefaultAssetInformationRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMinimalAssetAdministrationShell() throws IncompatibleTypeException {
        AssetAdministrationShell object = SerializerUtil.getMinimalAssetAdministrationShell();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetAdministrationShellRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetAdministrationShell);


        AssetAdministrationShell recreatedObject = new DefaultAssetAdministrationShellRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalAssetAdministrationShell() throws IncompatibleTypeException {
        AssetAdministrationShell object = SerializerUtil.getMaximalAssetAdministrationShell();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetAdministrationShellRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetAdministrationShell);


        AssetAdministrationShell recreatedObject = new DefaultAssetAdministrationShellRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

}
