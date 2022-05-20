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
 * <p>Java-Klasse für ListOfHistoryEventFieldList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfHistoryEventFieldList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistoryEventFieldList" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryEventFieldList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfHistoryEventFieldList", propOrder = {
    "historyEventFieldList"
})
public class ListOfHistoryEventFieldList {

    @XmlElement(name = "HistoryEventFieldList", nillable = true)
    protected List<HistoryEventFieldList> historyEventFieldList;

    /**
     * Gets the value of the historyEventFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyEventFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryEventFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryEventFieldList }
     * 
     * 
     */
    public List<HistoryEventFieldList> getHistoryEventFieldList() {
        if (historyEventFieldList == null) {
            historyEventFieldList = new ArrayList<HistoryEventFieldList>();
        }
        return this.historyEventFieldList;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfHistoryEventFieldList.Builder<_B> _other) {
        if (this.historyEventFieldList == null) {
            _other.historyEventFieldList = null;
        } else {
            _other.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
            for (HistoryEventFieldList _item: this.historyEventFieldList) {
                _other.historyEventFieldList.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfHistoryEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfHistoryEventFieldList.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfHistoryEventFieldList.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfHistoryEventFieldList.Builder<Void> builder() {
        return new ListOfHistoryEventFieldList.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfHistoryEventFieldList.Builder<_B> copyOf(final ListOfHistoryEventFieldList _other) {
        final ListOfHistoryEventFieldList.Builder<_B> _newBuilder = new ListOfHistoryEventFieldList.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfHistoryEventFieldList.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree historyEventFieldListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyEventFieldList"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyEventFieldListPropertyTree!= null):((historyEventFieldListPropertyTree == null)||(!historyEventFieldListPropertyTree.isLeaf())))) {
            if (this.historyEventFieldList == null) {
                _other.historyEventFieldList = null;
            } else {
                _other.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
                for (HistoryEventFieldList _item: this.historyEventFieldList) {
                    _other.historyEventFieldList.add(((_item == null)?null:_item.newCopyBuilder(_other, historyEventFieldListPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfHistoryEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfHistoryEventFieldList.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfHistoryEventFieldList.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfHistoryEventFieldList.Builder<_B> copyOf(final ListOfHistoryEventFieldList _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfHistoryEventFieldList.Builder<_B> _newBuilder = new ListOfHistoryEventFieldList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfHistoryEventFieldList.Builder<Void> copyExcept(final ListOfHistoryEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfHistoryEventFieldList.Builder<Void> copyOnly(final ListOfHistoryEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfHistoryEventFieldList _storedValue;
        private List<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>> historyEventFieldList;

        public Builder(final _B _parentBuilder, final ListOfHistoryEventFieldList _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.historyEventFieldList == null) {
                        this.historyEventFieldList = null;
                    } else {
                        this.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
                        for (HistoryEventFieldList _item: _other.historyEventFieldList) {
                            this.historyEventFieldList.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfHistoryEventFieldList _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree historyEventFieldListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyEventFieldList"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyEventFieldListPropertyTree!= null):((historyEventFieldListPropertyTree == null)||(!historyEventFieldListPropertyTree.isLeaf())))) {
                        if (_other.historyEventFieldList == null) {
                            this.historyEventFieldList = null;
                        } else {
                            this.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
                            for (HistoryEventFieldList _item: _other.historyEventFieldList) {
                                this.historyEventFieldList.add(((_item == null)?null:_item.newCopyBuilder(this, historyEventFieldListPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfHistoryEventFieldList >_P init(final _P _product) {
            if (this.historyEventFieldList!= null) {
                final List<HistoryEventFieldList> historyEventFieldList = new ArrayList<HistoryEventFieldList>(this.historyEventFieldList.size());
                for (HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>> _item: this.historyEventFieldList) {
                    historyEventFieldList.add(_item.build());
                }
                _product.historyEventFieldList = historyEventFieldList;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "historyEventFieldList" hinzu.
         * 
         * @param historyEventFieldList
         *     Werte, die zur Eigenschaft "historyEventFieldList" hinzugefügt werden.
         */
        public ListOfHistoryEventFieldList.Builder<_B> addHistoryEventFieldList(final Iterable<? extends HistoryEventFieldList> historyEventFieldList) {
            if (historyEventFieldList!= null) {
                if (this.historyEventFieldList == null) {
                    this.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
                }
                for (HistoryEventFieldList _item: historyEventFieldList) {
                    this.historyEventFieldList.add(new HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyEventFieldList" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param historyEventFieldList
         *     Neuer Wert der Eigenschaft "historyEventFieldList".
         */
        public ListOfHistoryEventFieldList.Builder<_B> withHistoryEventFieldList(final Iterable<? extends HistoryEventFieldList> historyEventFieldList) {
            if (this.historyEventFieldList!= null) {
                this.historyEventFieldList.clear();
            }
            return addHistoryEventFieldList(historyEventFieldList);
        }

        /**
         * Fügt Werte zur Eigenschaft "historyEventFieldList" hinzu.
         * 
         * @param historyEventFieldList
         *     Werte, die zur Eigenschaft "historyEventFieldList" hinzugefügt werden.
         */
        public ListOfHistoryEventFieldList.Builder<_B> addHistoryEventFieldList(HistoryEventFieldList... historyEventFieldList) {
            addHistoryEventFieldList(Arrays.asList(historyEventFieldList));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyEventFieldList" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param historyEventFieldList
         *     Neuer Wert der Eigenschaft "historyEventFieldList".
         */
        public ListOfHistoryEventFieldList.Builder<_B> withHistoryEventFieldList(HistoryEventFieldList... historyEventFieldList) {
            withHistoryEventFieldList(Arrays.asList(historyEventFieldList));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "HistoryEventFieldList".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.HistoryEventFieldList.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "HistoryEventFieldList".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.HistoryEventFieldList.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public HistoryEventFieldList.Builder<? extends ListOfHistoryEventFieldList.Builder<_B>> addHistoryEventFieldList() {
            if (this.historyEventFieldList == null) {
                this.historyEventFieldList = new ArrayList<HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>>();
            }
            final HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>> historyEventFieldList_Builder = new HistoryEventFieldList.Builder<ListOfHistoryEventFieldList.Builder<_B>>(this, null, false);
            this.historyEventFieldList.add(historyEventFieldList_Builder);
            return historyEventFieldList_Builder;
        }

        @Override
        public ListOfHistoryEventFieldList build() {
            if (_storedValue == null) {
                return this.init(new ListOfHistoryEventFieldList());
            } else {
                return ((ListOfHistoryEventFieldList) _storedValue);
            }
        }

        public ListOfHistoryEventFieldList.Builder<_B> copyOf(final ListOfHistoryEventFieldList _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfHistoryEventFieldList.Builder<_B> copyOf(final ListOfHistoryEventFieldList.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfHistoryEventFieldList.Selector<ListOfHistoryEventFieldList.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfHistoryEventFieldList.Select _root() {
            return new ListOfHistoryEventFieldList.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private HistoryEventFieldList.Selector<TRoot, ListOfHistoryEventFieldList.Selector<TRoot, TParent>> historyEventFieldList = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.historyEventFieldList!= null) {
                products.put("historyEventFieldList", this.historyEventFieldList.init());
            }
            return products;
        }

        public HistoryEventFieldList.Selector<TRoot, ListOfHistoryEventFieldList.Selector<TRoot, TParent>> historyEventFieldList() {
            return ((this.historyEventFieldList == null)?this.historyEventFieldList = new HistoryEventFieldList.Selector<TRoot, ListOfHistoryEventFieldList.Selector<TRoot, TParent>>(this._root, this, "historyEventFieldList"):this.historyEventFieldList);
        }

    }

}
