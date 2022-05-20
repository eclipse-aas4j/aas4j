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
 * <p>Java-Klasse für ListOfQueryDataDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfQueryDataDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryDataDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QueryDataDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQueryDataDescription", propOrder = {
    "queryDataDescription"
})
public class ListOfQueryDataDescription {

    @XmlElement(name = "QueryDataDescription", nillable = true)
    protected List<QueryDataDescription> queryDataDescription;

    /**
     * Gets the value of the queryDataDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryDataDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryDataDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryDataDescription }
     * 
     * 
     */
    public List<QueryDataDescription> getQueryDataDescription() {
        if (queryDataDescription == null) {
            queryDataDescription = new ArrayList<QueryDataDescription>();
        }
        return this.queryDataDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfQueryDataDescription.Builder<_B> _other) {
        if (this.queryDataDescription == null) {
            _other.queryDataDescription = null;
        } else {
            _other.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
            for (QueryDataDescription _item: this.queryDataDescription) {
                _other.queryDataDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfQueryDataDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfQueryDataDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfQueryDataDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfQueryDataDescription.Builder<Void> builder() {
        return new ListOfQueryDataDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfQueryDataDescription.Builder<_B> copyOf(final ListOfQueryDataDescription _other) {
        final ListOfQueryDataDescription.Builder<_B> _newBuilder = new ListOfQueryDataDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfQueryDataDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree queryDataDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataDescriptionPropertyTree!= null):((queryDataDescriptionPropertyTree == null)||(!queryDataDescriptionPropertyTree.isLeaf())))) {
            if (this.queryDataDescription == null) {
                _other.queryDataDescription = null;
            } else {
                _other.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
                for (QueryDataDescription _item: this.queryDataDescription) {
                    _other.queryDataDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, queryDataDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfQueryDataDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfQueryDataDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfQueryDataDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfQueryDataDescription.Builder<_B> copyOf(final ListOfQueryDataDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfQueryDataDescription.Builder<_B> _newBuilder = new ListOfQueryDataDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfQueryDataDescription.Builder<Void> copyExcept(final ListOfQueryDataDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfQueryDataDescription.Builder<Void> copyOnly(final ListOfQueryDataDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfQueryDataDescription _storedValue;
        private List<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>> queryDataDescription;

        public Builder(final _B _parentBuilder, final ListOfQueryDataDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.queryDataDescription == null) {
                        this.queryDataDescription = null;
                    } else {
                        this.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
                        for (QueryDataDescription _item: _other.queryDataDescription) {
                            this.queryDataDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfQueryDataDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree queryDataDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataDescriptionPropertyTree!= null):((queryDataDescriptionPropertyTree == null)||(!queryDataDescriptionPropertyTree.isLeaf())))) {
                        if (_other.queryDataDescription == null) {
                            this.queryDataDescription = null;
                        } else {
                            this.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
                            for (QueryDataDescription _item: _other.queryDataDescription) {
                                this.queryDataDescription.add(((_item == null)?null:_item.newCopyBuilder(this, queryDataDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfQueryDataDescription >_P init(final _P _product) {
            if (this.queryDataDescription!= null) {
                final List<QueryDataDescription> queryDataDescription = new ArrayList<QueryDataDescription>(this.queryDataDescription.size());
                for (QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>> _item: this.queryDataDescription) {
                    queryDataDescription.add(_item.build());
                }
                _product.queryDataDescription = queryDataDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "queryDataDescription" hinzu.
         * 
         * @param queryDataDescription
         *     Werte, die zur Eigenschaft "queryDataDescription" hinzugefügt werden.
         */
        public ListOfQueryDataDescription.Builder<_B> addQueryDataDescription(final Iterable<? extends QueryDataDescription> queryDataDescription) {
            if (queryDataDescription!= null) {
                if (this.queryDataDescription == null) {
                    this.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
                }
                for (QueryDataDescription _item: queryDataDescription) {
                    this.queryDataDescription.add(new QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryDataDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param queryDataDescription
         *     Neuer Wert der Eigenschaft "queryDataDescription".
         */
        public ListOfQueryDataDescription.Builder<_B> withQueryDataDescription(final Iterable<? extends QueryDataDescription> queryDataDescription) {
            if (this.queryDataDescription!= null) {
                this.queryDataDescription.clear();
            }
            return addQueryDataDescription(queryDataDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "queryDataDescription" hinzu.
         * 
         * @param queryDataDescription
         *     Werte, die zur Eigenschaft "queryDataDescription" hinzugefügt werden.
         */
        public ListOfQueryDataDescription.Builder<_B> addQueryDataDescription(QueryDataDescription... queryDataDescription) {
            addQueryDataDescription(Arrays.asList(queryDataDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryDataDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param queryDataDescription
         *     Neuer Wert der Eigenschaft "queryDataDescription".
         */
        public ListOfQueryDataDescription.Builder<_B> withQueryDataDescription(QueryDataDescription... queryDataDescription) {
            withQueryDataDescription(Arrays.asList(queryDataDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "QueryDataDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.QueryDataDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "QueryDataDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.QueryDataDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public QueryDataDescription.Builder<? extends ListOfQueryDataDescription.Builder<_B>> addQueryDataDescription() {
            if (this.queryDataDescription == null) {
                this.queryDataDescription = new ArrayList<QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>>();
            }
            final QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>> queryDataDescription_Builder = new QueryDataDescription.Builder<ListOfQueryDataDescription.Builder<_B>>(this, null, false);
            this.queryDataDescription.add(queryDataDescription_Builder);
            return queryDataDescription_Builder;
        }

        @Override
        public ListOfQueryDataDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfQueryDataDescription());
            } else {
                return ((ListOfQueryDataDescription) _storedValue);
            }
        }

        public ListOfQueryDataDescription.Builder<_B> copyOf(final ListOfQueryDataDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfQueryDataDescription.Builder<_B> copyOf(final ListOfQueryDataDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfQueryDataDescription.Selector<ListOfQueryDataDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfQueryDataDescription.Select _root() {
            return new ListOfQueryDataDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private QueryDataDescription.Selector<TRoot, ListOfQueryDataDescription.Selector<TRoot, TParent>> queryDataDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.queryDataDescription!= null) {
                products.put("queryDataDescription", this.queryDataDescription.init());
            }
            return products;
        }

        public QueryDataDescription.Selector<TRoot, ListOfQueryDataDescription.Selector<TRoot, TParent>> queryDataDescription() {
            return ((this.queryDataDescription == null)?this.queryDataDescription = new QueryDataDescription.Selector<TRoot, ListOfQueryDataDescription.Selector<TRoot, TParent>>(this._root, this, "queryDataDescription"):this.queryDataDescription);
        }

    }

}
