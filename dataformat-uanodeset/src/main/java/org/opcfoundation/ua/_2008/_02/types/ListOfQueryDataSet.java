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
 * <p>Java-Klasse für ListOfQueryDataSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfQueryDataSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryDataSet" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QueryDataSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQueryDataSet", propOrder = {
    "queryDataSet"
})
public class ListOfQueryDataSet {

    @XmlElement(name = "QueryDataSet", nillable = true)
    protected List<QueryDataSet> queryDataSet;

    /**
     * Gets the value of the queryDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryDataSet }
     * 
     * 
     */
    public List<QueryDataSet> getQueryDataSet() {
        if (queryDataSet == null) {
            queryDataSet = new ArrayList<QueryDataSet>();
        }
        return this.queryDataSet;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfQueryDataSet.Builder<_B> _other) {
        if (this.queryDataSet == null) {
            _other.queryDataSet = null;
        } else {
            _other.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
            for (QueryDataSet _item: this.queryDataSet) {
                _other.queryDataSet.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfQueryDataSet.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfQueryDataSet.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfQueryDataSet.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfQueryDataSet.Builder<Void> builder() {
        return new ListOfQueryDataSet.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfQueryDataSet.Builder<_B> copyOf(final ListOfQueryDataSet _other) {
        final ListOfQueryDataSet.Builder<_B> _newBuilder = new ListOfQueryDataSet.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfQueryDataSet.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree queryDataSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataSet"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataSetPropertyTree!= null):((queryDataSetPropertyTree == null)||(!queryDataSetPropertyTree.isLeaf())))) {
            if (this.queryDataSet == null) {
                _other.queryDataSet = null;
            } else {
                _other.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
                for (QueryDataSet _item: this.queryDataSet) {
                    _other.queryDataSet.add(((_item == null)?null:_item.newCopyBuilder(_other, queryDataSetPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfQueryDataSet.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfQueryDataSet.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfQueryDataSet.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfQueryDataSet.Builder<_B> copyOf(final ListOfQueryDataSet _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfQueryDataSet.Builder<_B> _newBuilder = new ListOfQueryDataSet.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfQueryDataSet.Builder<Void> copyExcept(final ListOfQueryDataSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfQueryDataSet.Builder<Void> copyOnly(final ListOfQueryDataSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfQueryDataSet _storedValue;
        private List<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>> queryDataSet;

        public Builder(final _B _parentBuilder, final ListOfQueryDataSet _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.queryDataSet == null) {
                        this.queryDataSet = null;
                    } else {
                        this.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
                        for (QueryDataSet _item: _other.queryDataSet) {
                            this.queryDataSet.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfQueryDataSet _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree queryDataSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataSet"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataSetPropertyTree!= null):((queryDataSetPropertyTree == null)||(!queryDataSetPropertyTree.isLeaf())))) {
                        if (_other.queryDataSet == null) {
                            this.queryDataSet = null;
                        } else {
                            this.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
                            for (QueryDataSet _item: _other.queryDataSet) {
                                this.queryDataSet.add(((_item == null)?null:_item.newCopyBuilder(this, queryDataSetPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfQueryDataSet >_P init(final _P _product) {
            if (this.queryDataSet!= null) {
                final List<QueryDataSet> queryDataSet = new ArrayList<QueryDataSet>(this.queryDataSet.size());
                for (QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>> _item: this.queryDataSet) {
                    queryDataSet.add(_item.build());
                }
                _product.queryDataSet = queryDataSet;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "queryDataSet" hinzu.
         * 
         * @param queryDataSet
         *     Werte, die zur Eigenschaft "queryDataSet" hinzugefügt werden.
         */
        public ListOfQueryDataSet.Builder<_B> addQueryDataSet(final Iterable<? extends QueryDataSet> queryDataSet) {
            if (queryDataSet!= null) {
                if (this.queryDataSet == null) {
                    this.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
                }
                for (QueryDataSet _item: queryDataSet) {
                    this.queryDataSet.add(new QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryDataSet" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param queryDataSet
         *     Neuer Wert der Eigenschaft "queryDataSet".
         */
        public ListOfQueryDataSet.Builder<_B> withQueryDataSet(final Iterable<? extends QueryDataSet> queryDataSet) {
            if (this.queryDataSet!= null) {
                this.queryDataSet.clear();
            }
            return addQueryDataSet(queryDataSet);
        }

        /**
         * Fügt Werte zur Eigenschaft "queryDataSet" hinzu.
         * 
         * @param queryDataSet
         *     Werte, die zur Eigenschaft "queryDataSet" hinzugefügt werden.
         */
        public ListOfQueryDataSet.Builder<_B> addQueryDataSet(QueryDataSet... queryDataSet) {
            addQueryDataSet(Arrays.asList(queryDataSet));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryDataSet" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param queryDataSet
         *     Neuer Wert der Eigenschaft "queryDataSet".
         */
        public ListOfQueryDataSet.Builder<_B> withQueryDataSet(QueryDataSet... queryDataSet) {
            withQueryDataSet(Arrays.asList(queryDataSet));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "QueryDataSet".
         * Mit {@link org.opcfoundation.ua._2008._02.types.QueryDataSet.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "QueryDataSet".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.QueryDataSet.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public QueryDataSet.Builder<? extends ListOfQueryDataSet.Builder<_B>> addQueryDataSet() {
            if (this.queryDataSet == null) {
                this.queryDataSet = new ArrayList<QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>>();
            }
            final QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>> queryDataSet_Builder = new QueryDataSet.Builder<ListOfQueryDataSet.Builder<_B>>(this, null, false);
            this.queryDataSet.add(queryDataSet_Builder);
            return queryDataSet_Builder;
        }

        @Override
        public ListOfQueryDataSet build() {
            if (_storedValue == null) {
                return this.init(new ListOfQueryDataSet());
            } else {
                return ((ListOfQueryDataSet) _storedValue);
            }
        }

        public ListOfQueryDataSet.Builder<_B> copyOf(final ListOfQueryDataSet _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfQueryDataSet.Builder<_B> copyOf(final ListOfQueryDataSet.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfQueryDataSet.Selector<ListOfQueryDataSet.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfQueryDataSet.Select _root() {
            return new ListOfQueryDataSet.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private QueryDataSet.Selector<TRoot, ListOfQueryDataSet.Selector<TRoot, TParent>> queryDataSet = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.queryDataSet!= null) {
                products.put("queryDataSet", this.queryDataSet.init());
            }
            return products;
        }

        public QueryDataSet.Selector<TRoot, ListOfQueryDataSet.Selector<TRoot, TParent>> queryDataSet() {
            return ((this.queryDataSet == null)?this.queryDataSet = new QueryDataSet.Selector<TRoot, ListOfQueryDataSet.Selector<TRoot, TParent>>(this._root, this, "queryDataSet"):this.queryDataSet);
        }

    }

}
