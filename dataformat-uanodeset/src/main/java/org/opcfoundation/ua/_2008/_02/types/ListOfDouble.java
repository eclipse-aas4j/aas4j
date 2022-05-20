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
 * <p>Java-Klasse für ListOfDouble complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDouble"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDouble", propOrder = {
    "_double"
})
public class ListOfDouble {

    @XmlElement(name = "Double", type = Double.class)
    protected List<Double> _double;

    /**
     * Gets the value of the double property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the double property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDouble().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDouble() {
        if (_double == null) {
            _double = new ArrayList<Double>();
        }
        return this._double;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDouble.Builder<_B> _other) {
        if (this._double == null) {
            _other._double = null;
        } else {
            _other._double = new ArrayList<Buildable>();
            for (Double _item: this._double) {
                _other._double.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfDouble.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDouble.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDouble.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDouble.Builder<Void> builder() {
        return new ListOfDouble.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDouble.Builder<_B> copyOf(final ListOfDouble _other) {
        final ListOfDouble.Builder<_B> _newBuilder = new ListOfDouble.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDouble.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree _doublePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_double"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_doublePropertyTree!= null):((_doublePropertyTree == null)||(!_doublePropertyTree.isLeaf())))) {
            if (this._double == null) {
                _other._double = null;
            } else {
                _other._double = new ArrayList<Buildable>();
                for (Double _item: this._double) {
                    _other._double.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfDouble.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDouble.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDouble.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDouble.Builder<_B> copyOf(final ListOfDouble _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDouble.Builder<_B> _newBuilder = new ListOfDouble.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDouble.Builder<Void> copyExcept(final ListOfDouble _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDouble.Builder<Void> copyOnly(final ListOfDouble _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDouble _storedValue;
        private List<Buildable> _double;

        public Builder(final _B _parentBuilder, final ListOfDouble _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other._double == null) {
                        this._double = null;
                    } else {
                        this._double = new ArrayList<Buildable>();
                        for (Double _item: _other._double) {
                            this._double.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDouble _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree _doublePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_double"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_doublePropertyTree!= null):((_doublePropertyTree == null)||(!_doublePropertyTree.isLeaf())))) {
                        if (_other._double == null) {
                            this._double = null;
                        } else {
                            this._double = new ArrayList<Buildable>();
                            for (Double _item: _other._double) {
                                this._double.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfDouble >_P init(final _P _product) {
            if (this._double!= null) {
                final List<Double> _double = new ArrayList<Double>(this._double.size());
                for (Buildable _item: this._double) {
                    _double.add(((Double) _item.build()));
                }
                _product._double = _double;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "_double" hinzu.
         * 
         * @param _double
         *     Werte, die zur Eigenschaft "_double" hinzugefügt werden.
         */
        public ListOfDouble.Builder<_B> addDouble(final Iterable<? extends Double> _double) {
            if (_double!= null) {
                if (this._double == null) {
                    this._double = new ArrayList<Buildable>();
                }
                for (Double _item: _double) {
                    this._double.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_double" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _double
         *     Neuer Wert der Eigenschaft "_double".
         */
        public ListOfDouble.Builder<_B> withDouble(final Iterable<? extends Double> _double) {
            if (this._double!= null) {
                this._double.clear();
            }
            return addDouble(_double);
        }

        /**
         * Fügt Werte zur Eigenschaft "_double" hinzu.
         * 
         * @param _double
         *     Werte, die zur Eigenschaft "_double" hinzugefügt werden.
         */
        public ListOfDouble.Builder<_B> addDouble(Double... _double) {
            addDouble(Arrays.asList(_double));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_double" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _double
         *     Neuer Wert der Eigenschaft "_double".
         */
        public ListOfDouble.Builder<_B> withDouble(Double... _double) {
            withDouble(Arrays.asList(_double));
            return this;
        }

        @Override
        public ListOfDouble build() {
            if (_storedValue == null) {
                return this.init(new ListOfDouble());
            } else {
                return ((ListOfDouble) _storedValue);
            }
        }

        public ListOfDouble.Builder<_B> copyOf(final ListOfDouble _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDouble.Builder<_B> copyOf(final ListOfDouble.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDouble.Selector<ListOfDouble.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDouble.Select _root() {
            return new ListOfDouble.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfDouble.Selector<TRoot, TParent>> _double = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this._double!= null) {
                products.put("_double", this._double.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfDouble.Selector<TRoot, TParent>> _double() {
            return ((this._double == null)?this._double = new com.kscs.util.jaxb.Selector<TRoot, ListOfDouble.Selector<TRoot, TParent>>(this._root, this, "_double"):this._double);
        }

    }

}
