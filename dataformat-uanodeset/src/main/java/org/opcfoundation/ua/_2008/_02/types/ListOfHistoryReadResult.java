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
 * <p>Java-Klasse für ListOfHistoryReadResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfHistoryReadResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryReadResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryReadResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfHistoryReadResult", propOrder = {
    "historyReadResult"
})
public class ListOfHistoryReadResult {

    @XmlElement(name = "HistoryReadResult", nillable = true)
    protected List<HistoryReadResult> historyReadResult;

    /**
     * Gets the value of the historyReadResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyReadResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryReadResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryReadResult }
     * 
     * 
     */
    public List<HistoryReadResult> getHistoryReadResult() {
        if (historyReadResult == null) {
            historyReadResult = new ArrayList<HistoryReadResult>();
        }
        return this.historyReadResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfHistoryReadResult.Builder<_B> _other) {
        if (this.historyReadResult == null) {
            _other.historyReadResult = null;
        } else {
            _other.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
            for (HistoryReadResult _item: this.historyReadResult) {
                _other.historyReadResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfHistoryReadResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfHistoryReadResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfHistoryReadResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfHistoryReadResult.Builder<Void> builder() {
        return new ListOfHistoryReadResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfHistoryReadResult.Builder<_B> copyOf(final ListOfHistoryReadResult _other) {
        final ListOfHistoryReadResult.Builder<_B> _newBuilder = new ListOfHistoryReadResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfHistoryReadResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree historyReadResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadResultPropertyTree!= null):((historyReadResultPropertyTree == null)||(!historyReadResultPropertyTree.isLeaf())))) {
            if (this.historyReadResult == null) {
                _other.historyReadResult = null;
            } else {
                _other.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
                for (HistoryReadResult _item: this.historyReadResult) {
                    _other.historyReadResult.add(((_item == null)?null:_item.newCopyBuilder(_other, historyReadResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfHistoryReadResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfHistoryReadResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfHistoryReadResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfHistoryReadResult.Builder<_B> copyOf(final ListOfHistoryReadResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfHistoryReadResult.Builder<_B> _newBuilder = new ListOfHistoryReadResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfHistoryReadResult.Builder<Void> copyExcept(final ListOfHistoryReadResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfHistoryReadResult.Builder<Void> copyOnly(final ListOfHistoryReadResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfHistoryReadResult _storedValue;
        private List<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>> historyReadResult;

        public Builder(final _B _parentBuilder, final ListOfHistoryReadResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.historyReadResult == null) {
                        this.historyReadResult = null;
                    } else {
                        this.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
                        for (HistoryReadResult _item: _other.historyReadResult) {
                            this.historyReadResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfHistoryReadResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree historyReadResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadResultPropertyTree!= null):((historyReadResultPropertyTree == null)||(!historyReadResultPropertyTree.isLeaf())))) {
                        if (_other.historyReadResult == null) {
                            this.historyReadResult = null;
                        } else {
                            this.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
                            for (HistoryReadResult _item: _other.historyReadResult) {
                                this.historyReadResult.add(((_item == null)?null:_item.newCopyBuilder(this, historyReadResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfHistoryReadResult >_P init(final _P _product) {
            if (this.historyReadResult!= null) {
                final List<HistoryReadResult> historyReadResult = new ArrayList<HistoryReadResult>(this.historyReadResult.size());
                for (HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>> _item: this.historyReadResult) {
                    historyReadResult.add(_item.build());
                }
                _product.historyReadResult = historyReadResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "historyReadResult" hinzu.
         * 
         * @param historyReadResult
         *     Werte, die zur Eigenschaft "historyReadResult" hinzugefügt werden.
         */
        public ListOfHistoryReadResult.Builder<_B> addHistoryReadResult(final Iterable<? extends HistoryReadResult> historyReadResult) {
            if (historyReadResult!= null) {
                if (this.historyReadResult == null) {
                    this.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
                }
                for (HistoryReadResult _item: historyReadResult) {
                    this.historyReadResult.add(new HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadResult
         *     Neuer Wert der Eigenschaft "historyReadResult".
         */
        public ListOfHistoryReadResult.Builder<_B> withHistoryReadResult(final Iterable<? extends HistoryReadResult> historyReadResult) {
            if (this.historyReadResult!= null) {
                this.historyReadResult.clear();
            }
            return addHistoryReadResult(historyReadResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "historyReadResult" hinzu.
         * 
         * @param historyReadResult
         *     Werte, die zur Eigenschaft "historyReadResult" hinzugefügt werden.
         */
        public ListOfHistoryReadResult.Builder<_B> addHistoryReadResult(HistoryReadResult... historyReadResult) {
            addHistoryReadResult(Arrays.asList(historyReadResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadResult
         *     Neuer Wert der Eigenschaft "historyReadResult".
         */
        public ListOfHistoryReadResult.Builder<_B> withHistoryReadResult(HistoryReadResult... historyReadResult) {
            withHistoryReadResult(Arrays.asList(historyReadResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "HistoryReadResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.HistoryReadResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "HistoryReadResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.HistoryReadResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public HistoryReadResult.Builder<? extends ListOfHistoryReadResult.Builder<_B>> addHistoryReadResult() {
            if (this.historyReadResult == null) {
                this.historyReadResult = new ArrayList<HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>>();
            }
            final HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>> historyReadResult_Builder = new HistoryReadResult.Builder<ListOfHistoryReadResult.Builder<_B>>(this, null, false);
            this.historyReadResult.add(historyReadResult_Builder);
            return historyReadResult_Builder;
        }

        @Override
        public ListOfHistoryReadResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfHistoryReadResult());
            } else {
                return ((ListOfHistoryReadResult) _storedValue);
            }
        }

        public ListOfHistoryReadResult.Builder<_B> copyOf(final ListOfHistoryReadResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfHistoryReadResult.Builder<_B> copyOf(final ListOfHistoryReadResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfHistoryReadResult.Selector<ListOfHistoryReadResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfHistoryReadResult.Select _root() {
            return new ListOfHistoryReadResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private HistoryReadResult.Selector<TRoot, ListOfHistoryReadResult.Selector<TRoot, TParent>> historyReadResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.historyReadResult!= null) {
                products.put("historyReadResult", this.historyReadResult.init());
            }
            return products;
        }

        public HistoryReadResult.Selector<TRoot, ListOfHistoryReadResult.Selector<TRoot, TParent>> historyReadResult() {
            return ((this.historyReadResult == null)?this.historyReadResult = new HistoryReadResult.Selector<TRoot, ListOfHistoryReadResult.Selector<TRoot, TParent>>(this._root, this, "historyReadResult"):this.historyReadResult);
        }

    }

}
