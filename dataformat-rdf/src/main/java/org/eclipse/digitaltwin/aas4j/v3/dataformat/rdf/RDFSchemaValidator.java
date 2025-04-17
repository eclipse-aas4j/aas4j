package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.shacl.ShaclValidator;
import org.apache.jena.shacl.ValidationReport;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SchemaValidator;

import java.io.StringReader;
import java.util.Set;

public class RDFSchemaValidator implements SchemaValidator {
    @Override
    public Set<String> validateSchema(String serializedAASEntity) {
        Model dataModel = ModelFactory.createDefaultModel();
        dataModel.setNsPrefix("rdf","http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        dataModel.setNsPrefix("xs","http://www.w3.org/2001/XMLSchema#");
        dataModel.setNsPrefix("aas","https://admin-shell.io/aas/3/0/");
        dataModel.setNsPrefix("owl","http://www.w3.org/2002/07/owl#");
        dataModel.setNsPrefix("rdf","http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        dataModel.setNsPrefix("rdfs","http://www.w3.org/2000/01/rdf-schema#");

        try (StringReader reader = new StringReader(serializedAASEntity)) {
            dataModel.read( reader, null, "TURTLE");
        }
        String shapeGraph = "src/main/resources/shacl-schema-original.ttl";
        String aasGraph = "src/main/resources/rdf-ontology.ttl";

        Model aasModel = RDFDataMgr.loadModel(aasGraph);

        Model merged = ModelFactory.createDefaultModel();
        merged.add(aasModel);
        merged.add(dataModel);

        // Load SHACL shapes from shapes.ttl
        Model shapesModel = RDFDataMgr.loadModel(shapeGraph);

        // Validate data against SHACL shapes
        ValidationReport report = ShaclValidator.get().validate(shapesModel.getGraph(), merged.getGraph());

        // Print validation report
        if (report.conforms()) {
            System.out.println("Validation successful! The data conforms to the SHACL shapes.");
        } else {
            System.out.println("Validation failed! The data does not conform to the SHACL shapes.");
            System.out.println("Validation Report:\n");
            report.getModel().write(System.out);
        }
        return null;
    }
}
