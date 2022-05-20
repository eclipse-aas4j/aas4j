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
 * <p>Java-Klasse für ListOfInt64 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfInt64"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Int64" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfInt64", propOrder = {
    "int64"
})
public class ListOfInt64 {

    @XmlElement(name = "Int64", type = Long.class)
    protected List<Long> int64;

    /**
     * Gets the value of the int64 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the int64 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInt64().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getInt64() {
        if (int64 == null) {
            int64 = new ArrayList<Long>();
        }
        return this.int64;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfInt64 .Builder<_B> _other) {
        if (this.int64 == null) {
            _other.int64 = null;
        } else {
            _other.int64 = new ArrayList<Buildable>();
            for (Long _item: this.int64) {
                _other.int64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfInt64 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfInt64 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfInt64 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfInt64 .Builder<Void> builder() {
        return new ListOfInt64 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfInt64 .Builder<_B> copyOf(final ListOfInt64 _other) {
        final ListOfInt64 .Builder<_B> _newBuilder = new ListOfInt64 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfInt64 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree int64PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int64"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int64PropertyTree!= null):((int64PropertyTree == null)||(!int64PropertyTree.isLeaf())))) {
            if (this.int64 == null) {
                _other.int64 = null;
            } else {
                _other.int64 = new ArrayList<Buildable>();
                for (Long _item: this.int64) {
                    _other.int64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfInt64 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfInt64 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfInt64 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfInt64 .Builder<_B> copyOf(final ListOfInt64 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfInt64 .Builder<_B> _newBuilder = new ListOfInt64 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfInt64 .Builder<Void> copyExcept(final ListOfInt64 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfInt64 .Builder<Void> copyOnly(final ListOfInt64 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfInt64 _storedValue;
        private List<Buildable> int64;

        public Builder(final _B _parentBuilder, final ListOfInt64 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.int64 == null) {
                        this.int64 = null;
                    } else {
                        this.int64 = new ArrayList<Buildable>();
                        for (Long _item: _other.int64) {
                            this.int64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfInt64 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree int64PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int64"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int64PropertyTree!= null):((int64PropertyTree == null)||(!int64PropertyTree.isLeaf())))) {
                        if (_other.int64 == null) {
                            this.int64 = null;
                        } else {
                            this.int64 = new ArrayList<Buildable>();
                            for (Long _item: _other.int64) {
                                this.int64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfInt64 >_P init(final _P _product) {
            if (this.int64 != null) {
                final List<Long> int64 = new ArrayList<Long>(this.int64 .size());
                for (Buildable _item: this.int64) {
                    int64 .add(((Long) _item.build()));
                }
                _product.int64 = int64;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "int64" hinzu.
         * 
         * @param int64
         *     Werte, die zur Eigenschaft "int64" hinzugefügt werden.
         */
        public ListOfInt64 .Builder<_B> addInt64(final Iterable<? extends Long> int64) {
            if (int64 != null) {
                if (this.int64 == null) {
                    this.int64 = new ArrayList<Buildable>();
                }
                for (Long _item: int64) {
                    this.int64 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int64" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int64
         *     Neuer Wert der Eigenschaft "int64".
         */
        public ListOfInt64 .Builder<_B> withInt64(final Iterable<? extends Long> int64) {
            if (this.int64 != null) {
                this.int64 .clear();
            }
            return addInt64(int64);
        }

        /**
         * Fügt Werte zur Eigenschaft "int64" hinzu.
         * 
         * @param int64
         *     Werte, die zur Eigenschaft "int64" hinzugefügt werden.
         */
        public ListOfInt64 .Builder<_B> addInt64(Long... int64) {
            addInt64(Arrays.asList(int64));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int64" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int64
         *     Neuer Wert der Eigenschaft "int64".
         */
        public ListOfInt64 .Builder<_B> withInt64(Long... int64) {
            withInt64(Arrays.asList(int64));
            return this;
        }

        @Override
        public ListOfInt64 build() {
            if (_storedValue == null) {
                return this.init(new ListOfInt64());
            } else {
                return ((ListOfInt64) _storedValue);
            }
        }

        public ListOfInt64 .Builder<_B> copyOf(final ListOfInt64 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfInt64 .Builder<_B> copyOf(final ListOfInt64 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfInt64 .Selector<ListOfInt64 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfInt64 .Select _root() {
            return new ListOfInt64 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfInt64 .Selector<TRoot, TParent>> int64 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.int64 != null) {
                products.put("int64", this.int64 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfInt64 .Selector<TRoot, TParent>> int64() {
            return ((this.int64 == null)?this.int64 = new com.kscs.util.jaxb.Selector<TRoot, ListOfInt64 .Selector<TRoot, TParent>>(this._root, this, "int64"):this.int64);
        }

    }

}
