package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import com.fasterxml.jackson.databind.JsonNode;

public interface ValueOnlyMapper {

    /**
     * This method converts the corresponding element to a value-only JSON node.
     *
     * @return the corresponding JSON node.
     * @throws ValueOnlySerializationException with information about the idShort path.
     */
    JsonNode toJson() throws ValueOnlySerializationException;

    /**
     * Updates the corresponding element according the passed valueOnly JSON node.
     *
     * @param valueOnly the value only JSON node.
     * @throws ValueOnlySerializationException with information about the idShort path.
     *                                         <br><b>Note:</b>The update is not an atomic operation and if an exception is thrown, the corresponding element
     *                                         will be in an inconsistent state. If you cannot handle such situations, pass a copy of the original element.
     */
    void update(JsonNode valueOnly) throws ValueOnlySerializationException;

    /**
     * Creates the corresponding mapper.
     *
     * @param element     the submodel element.
     * @param idShortPath the idShort path.
     * @return the corresponding mapper or null if this type cannot be serialized to value-only JSON string.
     */
    static ValueOnlyMapper createMapper(SubmodelElement element, String idShortPath) {
        if (element instanceof Blob) {
            return new BlobMapper((Blob) element, idShortPath);
        }
        if (element instanceof File) {
            return new FileMapper((File) element, idShortPath);
        }
        if (element instanceof MultiLanguageProperty) {
            return new MultiLanguagePropertyMapper((MultiLanguageProperty) element, idShortPath);
        }
        if (element instanceof Property) {
            return new PropertyMapper((Property) element, idShortPath);
        }
        if (element instanceof Range) {
            return new RangeMapper((Range) element, idShortPath);
        }
        if (element instanceof ReferenceElement) {
            return new ReferenceElementMapper((ReferenceElement) element, idShortPath);
        }
        if (element instanceof Entity) {
            return new EntityMapper((Entity) element, idShortPath);
        }
        if (element instanceof BasicEventElement) {
            return new BasicEventElementMapper((BasicEventElement) element, idShortPath);
        }
        if (element instanceof SubmodelElementCollection) {
            SubmodelElementCollection elementCollection = (SubmodelElementCollection) element;
            return new ElementsCollectionMapper(elementCollection, elementCollection.getValue(), idShortPath);
        }
        if (element instanceof SubmodelElementList) {
            SubmodelElementList elementList = (SubmodelElementList) element;
            return new ElementsListMapper<>(elementList, elementList.getValue(), idShortPath);
        }
        if (element instanceof AnnotatedRelationshipElement) {
            return new AnnotatedRelationshipMapper((AnnotatedRelationshipElement) element, idShortPath);
        }
        if (element instanceof RelationshipElement) {
            return new RelationshipElementMapper((RelationshipElement) element, idShortPath);
        }
        return null;
    }
}
