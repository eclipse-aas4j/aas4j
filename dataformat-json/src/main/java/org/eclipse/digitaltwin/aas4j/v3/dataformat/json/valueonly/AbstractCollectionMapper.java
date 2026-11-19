package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import java.util.Iterator;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Base class for mapping collections of submodel elements as for
 * <ul>
 *     <li>{@link SubmodelMapper}</li>
 *     <li>{@link ElementsCollectionMapper}</li>
 * </ul>
 * @param <T>
 */
public abstract class AbstractCollectionMapper<T extends Referable> extends AbstractListMapper<T> {
    /**
     * @param element     the submodel element that has to be mapped.
     * @param values
     * @param idShortPath the idShort path is a dot separated chain of idShorts, that can be used in case of
     *                    troubleshooting.
     */
    protected AbstractCollectionMapper(T element, List<SubmodelElement> values, String idShortPath) {
        super(element, values, idShortPath);
    }

    ObjectNode valuesToJson() throws ValueOnlySerializationException {
        ObjectNode elementsNode = JsonNodeFactory.instance.objectNode();
        for (SubmodelElement submodelElement : values) {
            String idShort = submodelElement.getIdShort();
            if (elementsNode.has(idShort)) {
                throw new ValueOnlySerializationException("Duplicated idShort name '" + idShort +
                        "' under idShort path '" + idShortPath + "'.", idShortPath);
            }
            ValueOnlyMapper mapper = ValueOnlyMapper.createMapper(submodelElement, idShortPath + "." + idShort);
            if (mapper == null) {
                // This type of submodel elements are not serialized in value-only format.
                continue;
            }
            JsonNode mapperNode = mapper.toJson();
            if (elementsNode.isObject()) {
                elementsNode.setAll((ObjectNode) mapperNode);
            } else {
                elementsNode.set(idShort, mapperNode);
            }
        }
        return elementsNode;
    }

    public void updateFromJson(JsonNode value) throws ValueOnlySerializationException {
        if (!value.isObject()) {
            throw new ValueOnlySerializationException(
                    "Cannot update the submodel elements collection at idShort path '" + idShortPath +
                            "', as the corresponding value-only is not a JSON object.", idShortPath);
        }
        ObjectNode objNode = (ObjectNode) value;
        for (Iterator<String> it = objNode.fieldNames(); it.hasNext(); ) {
            String idShort = it.next();
            SubmodelElement submodelElement = findElementByIdShort(idShort);
            ValueOnlyMapper mapper = ValueOnlyMapper.createMapper(submodelElement, idShortPath + "." + idShort);
            //mapper.update(objNode.get(idShort));
            mapper.update(JsonNodeFactory.instance.objectNode().set(idShort, objNode.get(idShort)));
        }
    }

    private SubmodelElement findElementByIdShort(String idShort) throws ValueOnlySerializationException {
        for (SubmodelElement submodelElement : values) {
            if (idShort.equals(submodelElement.getIdShort())) {
                return submodelElement;
            }
        }
        throw new ValueOnlySerializationException("Cannot find submodel element with idShort '" + idShort +
                "' at idShort path '" + idShortPath + "'.", idShortPath);
    }
}
