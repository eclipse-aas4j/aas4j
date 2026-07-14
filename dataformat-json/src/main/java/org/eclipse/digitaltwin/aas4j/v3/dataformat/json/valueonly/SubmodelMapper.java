package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * A submodel is serialized as an unnamed JSON object.
 */
public class SubmodelMapper extends AbstractCollectionMapper<Submodel> {
    SubmodelMapper(Submodel submodel, String idShortPath) {
        super(submodel, submodel.getSubmodelElements(), idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        return valuesToJson();
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        updateFromJson(valueOnly);
    }
}
