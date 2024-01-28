package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360.*;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DataSpecificationIec61360Builder;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;

public class DefaultDataSpecificationIEC61360RDFHandler implements RDFHandler<DataSpecificationIec61360> {
    @Override
    public RDFSerializationResult toModel(DataSpecificationIec61360 object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.DataSpecificationIec61360);
        if (object.getPreferredName() != null && object.getPreferredName().isEmpty() == false){
            int index = 0;
            for (LangStringPreferredNameTypeIec61360 langString : object.getPreferredName()) {
                RDFSerializationResult res = new DefaultLangStringPreferredNameTypeIec61360RDFHandler().toModel(langString);
                model.add(subject, AASNamespace.DataSpecificationIec61360.preferredName, res.getResource());
                model.addLiteral(res.getResource(), AASNamespace.index, index);
                model.add(res.getModel());
                index++;
            }
        }
        if (object.getShortName() != null && object.getShortName().isEmpty() == false){
            int index = 0;
            for (LangStringShortNameTypeIec61360 langString : object.getShortName()) {
                RDFSerializationResult res = new DefaultLangStringShortNameTypeIec61360RDFHandler().toModel(langString);
                model.add(subject, AASNamespace.DataSpecificationIec61360.shortName, res.getResource());
                model.addLiteral(res.getResource(), AASNamespace.index, index);
                model.add(res.getModel());
                index++;
            }
        }
        if (object.getDefinition() != null && object.getDefinition().isEmpty() == false){
            int index = 0;
            for (LangStringDefinitionTypeIec61360 langString : object.getDefinition()) {
                RDFSerializationResult res = new DefaultLangStringDefinitionTypeIec61360RDFHandler().toModel(langString);
                model.add(subject, AASNamespace.DataSpecificationIec61360.definition, res.getResource());
                model.addLiteral(res.getResource(), AASNamespace.index, index);
                model.add(res.getModel());
                index++;
            }
        }
        if (object.getUnit() != null ){
            model.add(subject,AASNamespace.DataSpecificationIec61360.unit,object.getUnit());
        }
        if (object.getUnitId() != null ){
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getUnitId());
            model.add(subject,AASNamespace.DataSpecificationIec61360.unitId,res.getResource());
            model.add(res.getModel());
        }
        if (object.getSourceOfDefinition() != null ){
            model.add(subject,AASNamespace.DataSpecificationIec61360.sourceOfDefinition,object.getSourceOfDefinition());
        }
        if (object.getSymbol() != null ){
            model.add(subject,AASNamespace.DataSpecificationIec61360.symbol,object.getSymbol());
        }
        if (object.getDataType() != null ){
            model.add(subject, AASNamespace.DataSpecificationIec61360.dataType, AASNamespace.DataTypeIec61360.valueOf(object.getDataType().name()));
        }
        if (object.getValueFormat() != null ){
            model.add(subject,AASNamespace.DataSpecificationIec61360.valueFormat,object.getValueFormat());
        }
        if (object.getValue() != null ){
            model.add(subject,AASNamespace.DataSpecificationIec61360.value,object.getValue());
        }
        if (object.getValueList() != null ){
            RDFSerializationResult res = new DefaultValueListRDFHandler().toModel(object.getValueList());
            model.add(subject,AASNamespace.DataSpecificationIec61360.valueList,res.getResource());
            model.add(res.getModel());
        }
        if (object.getLevelType() != null ){
            RDFSerializationResult res = new DefaultLevelTypeRDFHandler().toModel(object.getLevelType());
            model.add(subject,AASNamespace.DataSpecificationIec61360.levelType,res.getResource());
            model.add(res.getModel());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public DataSpecificationIec61360 fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.DataSpecificationIec61360) == false){
            throw new IncompatibleTypeException("DataSpecificationIec61360");
        }
        DefaultDataSpecificationIec61360.Builder builder = new DefaultDataSpecificationIec61360.Builder();

        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.preferredName)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.shortName)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.definition)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.unit)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.unitId)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.sourceOfDefinition)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.symbol)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.dataType)){
            DataTypeIec61360 type = AASNamespace.DataTypeIec61360.fromIRI(model.getProperty(subjectToParse, AASNamespace.DataSpecificationIec61360.dataType).getResource().getURI());
            builder.dataType(type);
        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.valueFormat)){
            builder.valueFormat(model.getProperty(subjectToParse,AASNamespace.DataSpecificationIec61360.valueFormat).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.value)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.valueList)){

        }
        if(model.contains(subjectToParse,AASNamespace.DataSpecificationIec61360.levelType)){

        }


        return builder.build();
    }
}
