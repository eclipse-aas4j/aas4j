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
 * <p>Java-Klasse für ListOfHistoryReadValueId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfHistoryReadValueId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryReadValueId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryReadValueId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfHistoryReadValueId", propOrder = {
    "historyReadValueId"
})
public class ListOfHistoryReadValueId {

    @XmlElement(name = "HistoryReadValueId", nillable = true)
    protected List<HistoryReadValueId> historyReadValueId;

    /**
     * Gets the value of the historyReadValueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyReadValueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryReadValueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryReadValueId }
     * 
     * 
     */
    public List<HistoryReadValueId> getHistoryReadValueId() {
        if (historyReadValueId == null) {
            historyReadValueId = new ArrayList<HistoryReadValueId>();
        }
        return this.historyReadValueId;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfHistoryReadValueId.Builder<_B> _other) {
        if (this.historyReadValueId == null) {
            _other.historyReadValueId = null;
        } else {
            _other.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
            for (HistoryReadValueId _item: this.historyReadValueId) {
                _other.historyReadValueId.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfHistoryReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfHistoryReadValueId.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfHistoryReadValueId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfHistoryReadValueId.Builder<Void> builder() {
        return new ListOfHistoryReadValueId.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfHistoryReadValueId.Builder<_B> copyOf(final ListOfHistoryReadValueId _other) {
        final ListOfHistoryReadValueId.Builder<_B> _newBuilder = new ListOfHistoryReadValueId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfHistoryReadValueId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree historyReadValueIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadValueId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadValueIdPropertyTree!= null):((historyReadValueIdPropertyTree == null)||(!historyReadValueIdPropertyTree.isLeaf())))) {
            if (this.historyReadValueId == null) {
                _other.historyReadValueId = null;
            } else {
                _other.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
                for (HistoryReadValueId _item: this.historyReadValueId) {
                    _other.historyReadValueId.add(((_item == null)?null:_item.newCopyBuilder(_other, historyReadValueIdPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfHistoryReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfHistoryReadValueId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfHistoryReadValueId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfHistoryReadValueId.Builder<_B> copyOf(final ListOfHistoryReadValueId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfHistoryReadValueId.Builder<_B> _newBuilder = new ListOfHistoryReadValueId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfHistoryReadValueId.Builder<Void> copyExcept(final ListOfHistoryReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfHistoryReadValueId.Builder<Void> copyOnly(final ListOfHistoryReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfHistoryReadValueId _storedValue;
        private List<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>> historyReadValueId;

        public Builder(final _B _parentBuilder, final ListOfHistoryReadValueId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.historyReadValueId == null) {
                        this.historyReadValueId = null;
                    } else {
                        this.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
                        for (HistoryReadValueId _item: _other.historyReadValueId) {
                            this.historyReadValueId.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfHistoryReadValueId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree historyReadValueIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadValueId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadValueIdPropertyTree!= null):((historyReadValueIdPropertyTree == null)||(!historyReadValueIdPropertyTree.isLeaf())))) {
                        if (_other.historyReadValueId == null) {
                            this.historyReadValueId = null;
                        } else {
                            this.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
                            for (HistoryReadValueId _item: _other.historyReadValueId) {
                                this.historyReadValueId.add(((_item == null)?null:_item.newCopyBuilder(this, historyReadValueIdPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfHistoryReadValueId >_P init(final _P _product) {
            if (this.historyReadValueId!= null) {
                final List<HistoryReadValueId> historyReadValueId = new ArrayList<HistoryReadValueId>(this.historyReadValueId.size());
                for (HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>> _item: this.historyReadValueId) {
                    historyReadValueId.add(_item.build());
                }
                _product.historyReadValueId = historyReadValueId;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "historyReadValueId" hinzu.
         * 
         * @param historyReadValueId
         *     Werte, die zur Eigenschaft "historyReadValueId" hinzugefügt werden.
         */
        public ListOfHistoryReadValueId.Builder<_B> addHistoryReadValueId(final Iterable<? extends HistoryReadValueId> historyReadValueId) {
            if (historyReadValueId!= null) {
                if (this.historyReadValueId == null) {
                    this.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
                }
                for (HistoryReadValueId _item: historyReadValueId) {
                    this.historyReadValueId.add(new HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadValueId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadValueId
         *     Neuer Wert der Eigenschaft "historyReadValueId".
         */
        public ListOfHistoryReadValueId.Builder<_B> withHistoryReadValueId(final Iterable<? extends HistoryReadValueId> historyReadValueId) {
            if (this.historyReadValueId!= null) {
                this.historyReadValueId.clear();
            }
            return addHistoryReadValueId(historyReadValueId);
        }

        /**
         * Fügt Werte zur Eigenschaft "historyReadValueId" hinzu.
         * 
         * @param historyReadValueId
         *     Werte, die zur Eigenschaft "historyReadValueId" hinzugefügt werden.
         */
        public ListOfHistoryReadValueId.Builder<_B> addHistoryReadValueId(HistoryReadValueId... historyReadValueId) {
            addHistoryReadValueId(Arrays.asList(historyReadValueId));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadValueId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadValueId
         *     Neuer Wert der Eigenschaft "historyReadValueId".
         */
        public ListOfHistoryReadValueId.Builder<_B> withHistoryReadValueId(HistoryReadValueId... historyReadValueId) {
            withHistoryReadValueId(Arrays.asList(historyReadValueId));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "HistoryReadValueId".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.HistoryReadValueId.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "HistoryReadValueId".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.HistoryReadValueId.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public HistoryReadValueId.Builder<? extends ListOfHistoryReadValueId.Builder<_B>> addHistoryReadValueId() {
            if (this.historyReadValueId == null) {
                this.historyReadValueId = new ArrayList<HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>>();
            }
            final HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>> historyReadValueId_Builder = new HistoryReadValueId.Builder<ListOfHistoryReadValueId.Builder<_B>>(this, null, false);
            this.historyReadValueId.add(historyReadValueId_Builder);
            return historyReadValueId_Builder;
        }

        @Override
        public ListOfHistoryReadValueId build() {
            if (_storedValue == null) {
                return this.init(new ListOfHistoryReadValueId());
            } else {
                return ((ListOfHistoryReadValueId) _storedValue);
            }
        }

        public ListOfHistoryReadValueId.Builder<_B> copyOf(final ListOfHistoryReadValueId _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfHistoryReadValueId.Builder<_B> copyOf(final ListOfHistoryReadValueId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfHistoryReadValueId.Selector<ListOfHistoryReadValueId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfHistoryReadValueId.Select _root() {
            return new ListOfHistoryReadValueId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private HistoryReadValueId.Selector<TRoot, ListOfHistoryReadValueId.Selector<TRoot, TParent>> historyReadValueId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.historyReadValueId!= null) {
                products.put("historyReadValueId", this.historyReadValueId.init());
            }
            return products;
        }

        public HistoryReadValueId.Selector<TRoot, ListOfHistoryReadValueId.Selector<TRoot, TParent>> historyReadValueId() {
            return ((this.historyReadValueId == null)?this.historyReadValueId = new HistoryReadValueId.Selector<TRoot, ListOfHistoryReadValueId.Selector<TRoot, TParent>>(this._root, this, "historyReadValueId"):this.historyReadValueId);
        }

    }

}
