package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

/**
 * Base class for mapping elements providing list of submodel elements as for
 * <ul>
 *     <li>{@link ElementsListMapper}</li>
 *     <li>{@link ElementsCollectionMapper}</li>
 * </ul>
 * @param <T>
 */
public abstract class AbstractListMapper<T extends Referable> extends AbstractMapper<T> {
    protected final List<SubmodelElement> values;

    /**
     * @param element     the submodel element that has to be mapped.
     * @param idShortPath the idShort path is a dot separated chain of idShorts, that can be used in case of
     *                    troubleshooting.
     */
    protected AbstractListMapper(T element, List<SubmodelElement> values, String idShortPath) {
        super(element, idShortPath);
        this.values = values;
    }
}
