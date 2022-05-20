//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfHistoryUpdateResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfHistoryUpdateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryUpdateResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfHistoryUpdateResult", propOrder = {
    "historyUpdateResult"
})
public class ListOfHistoryUpdateResult {

    @XmlElement(name = "HistoryUpdateResult", nillable = true)
    protected List<HistoryUpdateResult> historyUpdateResult;

    /**
     * Gets the value of the historyUpdateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyUpdateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryUpdateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryUpdateResult }
     * 
     * 
     */
    public List<HistoryUpdateResult> getHistoryUpdateResult() {
        if (historyUpdateResult == null) {
            historyUpdateResult = new ArrayList<HistoryUpdateResult>();
        }
        return this.historyUpdateResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfHistoryUpdateResult.Builder<_B> _other) {
        if (this.historyUpdateResult == null) {
            _other.historyUpdateResult = null;
        } else {
            _other.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
            for (HistoryUpdateResult _item: this.historyUpdateResult) {
                _other.historyUpdateResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfHistoryUpdateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfHistoryUpdateResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfHistoryUpdateResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfHistoryUpdateResult.Builder<Void> builder() {
        return new ListOfHistoryUpdateResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfHistoryUpdateResult.Builder<_B> copyOf(final ListOfHistoryUpdateResult _other) {
        final ListOfHistoryUpdateResult.Builder<_B> _newBuilder = new ListOfHistoryUpdateResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfHistoryUpdateResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree historyUpdateResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyUpdateResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyUpdateResultPropertyTree!= null):((historyUpdateResultPropertyTree == null)||(!historyUpdateResultPropertyTree.isLeaf())))) {
            if (this.historyUpdateResult == null) {
                _other.historyUpdateResult = null;
            } else {
                _other.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
                for (HistoryUpdateResult _item: this.historyUpdateResult) {
                    _other.historyUpdateResult.add(((_item == null)?null:_item.newCopyBuilder(_other, historyUpdateResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfHistoryUpdateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfHistoryUpdateResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfHistoryUpdateResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfHistoryUpdateResult.Builder<_B> copyOf(final ListOfHistoryUpdateResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfHistoryUpdateResult.Builder<_B> _newBuilder = new ListOfHistoryUpdateResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfHistoryUpdateResult.Builder<Void> copyExcept(final ListOfHistoryUpdateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfHistoryUpdateResult.Builder<Void> copyOnly(final ListOfHistoryUpdateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfHistoryUpdateResult _storedValue;
        private List<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>> historyUpdateResult;

        public Builder(final _B _parentBuilder, final ListOfHistoryUpdateResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.historyUpdateResult == null) {
                        this.historyUpdateResult = null;
                    } else {
                        this.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
                        for (HistoryUpdateResult _item: _other.historyUpdateResult) {
                            this.historyUpdateResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfHistoryUpdateResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree historyUpdateResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyUpdateResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyUpdateResultPropertyTree!= null):((historyUpdateResultPropertyTree == null)||(!historyUpdateResultPropertyTree.isLeaf())))) {
                        if (_other.historyUpdateResult == null) {
                            this.historyUpdateResult = null;
                        } else {
                            this.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
                            for (HistoryUpdateResult _item: _other.historyUpdateResult) {
                                this.historyUpdateResult.add(((_item == null)?null:_item.newCopyBuilder(this, historyUpdateResultPropertyTree, _propertyTreeUse)));
                            }
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends ListOfHistoryUpdateResult >_P init(final _P _product) {
            if (this.historyUpdateResult!= null) {
                final List<HistoryUpdateResult> historyUpdateResult = new ArrayList<HistoryUpdateResult>(this.historyUpdateResult.size());
                for (HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>> _item: this.historyUpdateResult) {
                    historyUpdateResult.add(_item.build());
                }
                _product.historyUpdateResult = historyUpdateResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "historyUpdateResult" hinzu.
         * 
         * @param historyUpdateResult
         *     Werte, die zur Eigenschaft "historyUpdateResult" hinzugefügt werden.
         */
        public ListOfHistoryUpdateResult.Builder<_B> addHistoryUpdateResult(final Iterable<? extends HistoryUpdateResult> historyUpdateResult) {
            if (historyUpdateResult!= null) {
                if (this.historyUpdateResult == null) {
                    this.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
                }
                for (HistoryUpdateResult _item: historyUpdateResult) {
                    this.historyUpdateResult.add(new HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyUpdateResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyUpdateResult
         *     Neuer Wert der Eigenschaft "historyUpdateResult".
         */
        public ListOfHistoryUpdateResult.Builder<_B> withHistoryUpdateResult(final Iterable<? extends HistoryUpdateResult> historyUpdateResult) {
            if (this.historyUpdateResult!= null) {
                this.historyUpdateResult.clear();
            }
            return addHistoryUpdateResult(historyUpdateResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "historyUpdateResult" hinzu.
         * 
         * @param historyUpdateResult
         *     Werte, die zur Eigenschaft "historyUpdateResult" hinzugefügt werden.
         */
        public ListOfHistoryUpdateResult.Builder<_B> addHistoryUpdateResult(HistoryUpdateResult... historyUpdateResult) {
            addHistoryUpdateResult(Arrays.asList(historyUpdateResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyUpdateResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyUpdateResult
         *     Neuer Wert der Eigenschaft "historyUpdateResult".
         */
        public ListOfHistoryUpdateResult.Builder<_B> withHistoryUpdateResult(HistoryUpdateResult... historyUpdateResult) {
            withHistoryUpdateResult(Arrays.asList(historyUpdateResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "HistoryUpdateResult".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.HistoryUpdateResult.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "HistoryUpdateResult".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.HistoryUpdateResult.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public HistoryUpdateResult.Builder<? extends ListOfHistoryUpdateResult.Builder<_B>> addHistoryUpdateResult() {
            if (this.historyUpdateResult == null) {
                this.historyUpdateResult = new ArrayList<HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>>();
            }
            final HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>> historyUpdateResult_Builder = new HistoryUpdateResult.Builder<ListOfHistoryUpdateResult.Builder<_B>>(this, null, false);
            this.historyUpdateResult.add(historyUpdateResult_Builder);
            return historyUpdateResult_Builder;
        }

        @Override
        public ListOfHistoryUpdateResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfHistoryUpdateResult());
            } else {
                return ((ListOfHistoryUpdateResult) _storedValue);
            }
        }

        public ListOfHistoryUpdateResult.Builder<_B> copyOf(final ListOfHistoryUpdateResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfHistoryUpdateResult.Builder<_B> copyOf(final ListOfHistoryUpdateResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfHistoryUpdateResult.Selector<ListOfHistoryUpdateResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfHistoryUpdateResult.Select _root() {
            return new ListOfHistoryUpdateResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private HistoryUpdateResult.Selector<TRoot, ListOfHistoryUpdateResult.Selector<TRoot, TParent>> historyUpdateResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.historyUpdateResult!= null) {
                products.put("historyUpdateResult", this.historyUpdateResult.init());
            }
            return products;
        }

        public HistoryUpdateResult.Selector<TRoot, ListOfHistoryUpdateResult.Selector<TRoot, TParent>> historyUpdateResult() {
            return ((this.historyUpdateResult == null)?this.historyUpdateResult = new HistoryUpdateResult.Selector<TRoot, ListOfHistoryUpdateResult.Selector<TRoot, TParent>>(this._root, this, "historyUpdateResult"):this.historyUpdateResult);
        }

    }

}
