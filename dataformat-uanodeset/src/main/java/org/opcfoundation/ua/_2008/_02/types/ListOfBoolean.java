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
 * <p>Java-Klasse für ListOfBoolean complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBoolean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Boolean" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBoolean", propOrder = {
    "_boolean"
})
public class ListOfBoolean {

    @XmlElement(name = "Boolean", type = Boolean.class)
    protected List<Boolean> _boolean;

    /**
     * Gets the value of the boolean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boolean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoolean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getBoolean() {
        if (_boolean == null) {
            _boolean = new ArrayList<Boolean>();
        }
        return this._boolean;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBoolean.Builder<_B> _other) {
        if (this._boolean == null) {
            _other._boolean = null;
        } else {
            _other._boolean = new ArrayList<Buildable>();
            for (Boolean _item: this._boolean) {
                _other._boolean.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfBoolean.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBoolean.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBoolean.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBoolean.Builder<Void> builder() {
        return new ListOfBoolean.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBoolean.Builder<_B> copyOf(final ListOfBoolean _other) {
        final ListOfBoolean.Builder<_B> _newBuilder = new ListOfBoolean.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBoolean.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree _booleanPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_boolean"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_booleanPropertyTree!= null):((_booleanPropertyTree == null)||(!_booleanPropertyTree.isLeaf())))) {
            if (this._boolean == null) {
                _other._boolean = null;
            } else {
                _other._boolean = new ArrayList<Buildable>();
                for (Boolean _item: this._boolean) {
                    _other._boolean.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfBoolean.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBoolean.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBoolean.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBoolean.Builder<_B> copyOf(final ListOfBoolean _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBoolean.Builder<_B> _newBuilder = new ListOfBoolean.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBoolean.Builder<Void> copyExcept(final ListOfBoolean _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBoolean.Builder<Void> copyOnly(final ListOfBoolean _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBoolean _storedValue;
        private List<Buildable> _boolean;

        public Builder(final _B _parentBuilder, final ListOfBoolean _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other._boolean == null) {
                        this._boolean = null;
                    } else {
                        this._boolean = new ArrayList<Buildable>();
                        for (Boolean _item: _other._boolean) {
                            this._boolean.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBoolean _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree _booleanPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_boolean"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_booleanPropertyTree!= null):((_booleanPropertyTree == null)||(!_booleanPropertyTree.isLeaf())))) {
                        if (_other._boolean == null) {
                            this._boolean = null;
                        } else {
                            this._boolean = new ArrayList<Buildable>();
                            for (Boolean _item: _other._boolean) {
                                this._boolean.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfBoolean >_P init(final _P _product) {
            if (this._boolean!= null) {
                final List<Boolean> _boolean = new ArrayList<Boolean>(this._boolean.size());
                for (Buildable _item: this._boolean) {
                    _boolean.add(((Boolean) _item.build()));
                }
                _product._boolean = _boolean;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "_boolean" hinzu.
         * 
         * @param _boolean
         *     Werte, die zur Eigenschaft "_boolean" hinzugefügt werden.
         */
        public ListOfBoolean.Builder<_B> addBoolean(final Iterable<? extends Boolean> _boolean) {
            if (_boolean!= null) {
                if (this._boolean == null) {
                    this._boolean = new ArrayList<Buildable>();
                }
                for (Boolean _item: _boolean) {
                    this._boolean.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_boolean" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _boolean
         *     Neuer Wert der Eigenschaft "_boolean".
         */
        public ListOfBoolean.Builder<_B> withBoolean(final Iterable<? extends Boolean> _boolean) {
            if (this._boolean!= null) {
                this._boolean.clear();
            }
            return addBoolean(_boolean);
        }

        /**
         * Fügt Werte zur Eigenschaft "_boolean" hinzu.
         * 
         * @param _boolean
         *     Werte, die zur Eigenschaft "_boolean" hinzugefügt werden.
         */
        public ListOfBoolean.Builder<_B> addBoolean(Boolean... _boolean) {
            addBoolean(Arrays.asList(_boolean));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_boolean" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _boolean
         *     Neuer Wert der Eigenschaft "_boolean".
         */
        public ListOfBoolean.Builder<_B> withBoolean(Boolean... _boolean) {
            withBoolean(Arrays.asList(_boolean));
            return this;
        }

        @Override
        public ListOfBoolean build() {
            if (_storedValue == null) {
                return this.init(new ListOfBoolean());
            } else {
                return ((ListOfBoolean) _storedValue);
            }
        }

        public ListOfBoolean.Builder<_B> copyOf(final ListOfBoolean _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBoolean.Builder<_B> copyOf(final ListOfBoolean.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBoolean.Selector<ListOfBoolean.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBoolean.Select _root() {
            return new ListOfBoolean.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfBoolean.Selector<TRoot, TParent>> _boolean = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this._boolean!= null) {
                products.put("_boolean", this._boolean.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfBoolean.Selector<TRoot, TParent>> _boolean() {
            return ((this._boolean == null)?this._boolean = new com.kscs.util.jaxb.Selector<TRoot, ListOfBoolean.Selector<TRoot, TParent>>(this._root, this, "_boolean"):this._boolean);
        }

    }

}
