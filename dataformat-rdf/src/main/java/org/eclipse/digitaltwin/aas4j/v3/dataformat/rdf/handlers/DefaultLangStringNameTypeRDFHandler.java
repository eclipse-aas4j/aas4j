package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
public class DefaultLangStringNameTypeRDFHandler implements RDFHandler<LangStringNameType>{

    @Override
    public RDFSerializationResult toModel(LangStringNameType object) {
        return null;
    }

    @Override
    public LangStringNameType fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}
