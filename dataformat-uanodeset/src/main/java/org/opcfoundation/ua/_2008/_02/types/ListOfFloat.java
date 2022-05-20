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
 * <p>Java-Klasse für ListOfFloat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfFloat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Float" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfFloat", propOrder = {
    "_float"
})
public class ListOfFloat {

    @XmlElement(name = "Float", type = Float.class)
    protected List<Float> _float;

    /**
     * Gets the value of the float property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the float property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getFloat() {
        if (_float == null) {
            _float = new ArrayList<Float>();
        }
        return this._float;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfFloat.Builder<_B> _other) {
        if (this._float == null) {
            _other._float = null;
        } else {
            _other._float = new ArrayList<Buildable>();
            for (Float _item: this._float) {
                _other._float.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfFloat.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfFloat.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfFloat.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfFloat.Builder<Void> builder() {
        return new ListOfFloat.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfFloat.Builder<_B> copyOf(final ListOfFloat _other) {
        final ListOfFloat.Builder<_B> _newBuilder = new ListOfFloat.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfFloat.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree _floatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_float"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_floatPropertyTree!= null):((_floatPropertyTree == null)||(!_floatPropertyTree.isLeaf())))) {
            if (this._float == null) {
                _other._float = null;
            } else {
                _other._float = new ArrayList<Buildable>();
                for (Float _item: this._float) {
                    _other._float.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfFloat.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfFloat.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfFloat.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfFloat.Builder<_B> copyOf(final ListOfFloat _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfFloat.Builder<_B> _newBuilder = new ListOfFloat.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfFloat.Builder<Void> copyExcept(final ListOfFloat _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfFloat.Builder<Void> copyOnly(final ListOfFloat _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfFloat _storedValue;
        private List<Buildable> _float;

        public Builder(final _B _parentBuilder, final ListOfFloat _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other._float == null) {
                        this._float = null;
                    } else {
                        this._float = new ArrayList<Buildable>();
                        for (Float _item: _other._float) {
                            this._float.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfFloat _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree _floatPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_float"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_floatPropertyTree!= null):((_floatPropertyTree == null)||(!_floatPropertyTree.isLeaf())))) {
                        if (_other._float == null) {
                            this._float = null;
                        } else {
                            this._float = new ArrayList<Buildable>();
                            for (Float _item: _other._float) {
                                this._float.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfFloat >_P init(final _P _product) {
            if (this._float!= null) {
                final List<Float> _float = new ArrayList<Float>(this._float.size());
                for (Buildable _item: this._float) {
                    _float.add(((Float) _item.build()));
                }
                _product._float = _float;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "_float" hinzu.
         * 
         * @param _float
         *     Werte, die zur Eigenschaft "_float" hinzugefügt werden.
         */
        public ListOfFloat.Builder<_B> addFloat(final Iterable<? extends Float> _float) {
            if (_float!= null) {
                if (this._float == null) {
                    this._float = new ArrayList<Buildable>();
                }
                for (Float _item: _float) {
                    this._float.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_float" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _float
         *     Neuer Wert der Eigenschaft "_float".
         */
        public ListOfFloat.Builder<_B> withFloat(final Iterable<? extends Float> _float) {
            if (this._float!= null) {
                this._float.clear();
            }
            return addFloat(_float);
        }

        /**
         * Fügt Werte zur Eigenschaft "_float" hinzu.
         * 
         * @param _float
         *     Werte, die zur Eigenschaft "_float" hinzugefügt werden.
         */
        public ListOfFloat.Builder<_B> addFloat(Float... _float) {
            addFloat(Arrays.asList(_float));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_float" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _float
         *     Neuer Wert der Eigenschaft "_float".
         */
        public ListOfFloat.Builder<_B> withFloat(Float... _float) {
            withFloat(Arrays.asList(_float));
            return this;
        }

        @Override
        public ListOfFloat build() {
            if (_storedValue == null) {
                return this.init(new ListOfFloat());
            } else {
                return ((ListOfFloat) _storedValue);
            }
        }

        public ListOfFloat.Builder<_B> copyOf(final ListOfFloat _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfFloat.Builder<_B> copyOf(final ListOfFloat.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfFloat.Selector<ListOfFloat.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfFloat.Select _root() {
            return new ListOfFloat.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfFloat.Selector<TRoot, TParent>> _float = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this._float!= null) {
                products.put("_float", this._float.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfFloat.Selector<TRoot, TParent>> _float() {
            return ((this._float == null)?this._float = new com.kscs.util.jaxb.Selector<TRoot, ListOfFloat.Selector<TRoot, TParent>>(this._root, this, "_float"):this._float);
        }

    }

}
