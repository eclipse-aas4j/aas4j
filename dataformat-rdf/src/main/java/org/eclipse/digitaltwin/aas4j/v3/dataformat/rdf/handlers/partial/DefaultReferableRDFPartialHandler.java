package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultExtensionRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultLangStringNameTypeRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultLangStringTextTypeRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultReferableRDFPartialHandler implements RDFPartialHandler<Referable> {


    @Override
    public void partialToModel(Referable object, Model model, Resource parentNode) {
        if (object.getIdShort() != null) {
            parentNode.addProperty(AASNamespace.Referable.idShort, object.getIdShort());
        }
        if (object.getCategory() != null) {
            parentNode.addProperty(AASNamespace.Referable.category, object.getCategory());
        }
        if (object.getDescription() != null && !object.getDescription().isEmpty()) {
            int index = 0;
            for (LangStringTextType item : object.getDescription()) {
                RDFSerializationResult resultItem = new DefaultLangStringTextTypeRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.Referable.description, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        if (object.getDisplayName() != null && !object.getDescription().isEmpty()) {
            int index = 0;
            for (LangStringNameType item : object.getDisplayName()) {
                RDFSerializationResult resultItem = new DefaultLangStringNameTypeRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.Referable.displayName, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        //HasExtension
        if (object.getExtensions() != null && !object.getExtensions().isEmpty()) {
            int index = 0;
            for (Extension item : object.getExtensions()) {
                RDFSerializationResult resultItem = new DefaultExtensionRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.HasExtensions.extensions, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
    }

    @Override
    public Referable partialFromModel(Referable object, Model model, Resource subjectToParse) {
        if (model.contains(subjectToParse, AASNamespace.Referable.idShort)) {
            object.setIdShort(model.getProperty(subjectToParse, AASNamespace.Referable.idShort).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Referable.category)) {
            object.setCategory(model.getProperty(subjectToParse, AASNamespace.Referable.category).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Referable.description)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Referable.description);
            Map<Integer, LangStringTextType> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                LangStringTextType key = null;
                try {
                    key = new DefaultLangStringTextTypeRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<LangStringTextType> langStringList = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                langStringList.add(keysMap.get(index));
            }
            object.setDescription(langStringList);
        }
        if (model.contains(subjectToParse, AASNamespace.Referable.displayName)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Referable.displayName);
            Map<Integer, LangStringNameType> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                LangStringNameType key = null;
                try {
                    key = new DefaultLangStringNameTypeRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<LangStringNameType> langStringList = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                langStringList.add(keysMap.get(index));
            }
            object.setDisplayName(langStringList);
        }

        //HasExtension
        if (model.contains(subjectToParse, AASNamespace.HasExtensions.extensions)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.HasExtensions.extensions);
            Map<Integer, Extension> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                Extension key = null;
                try {
                    key = new DefaultExtensionRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<Extension> langStringList = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                langStringList.add(keysMap.get(index));
            }
            object.setExtensions(langStringList);
        }
        return object;
    }
}
