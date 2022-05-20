//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfUInt64 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUInt64"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UInt64" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUInt64", propOrder = {
    "uInt64"
})
public class ListOfUInt64 {

    @XmlElement(name = "UInt64")
    @XmlSchemaType(name = "unsignedLong")
    protected List<BigInteger> uInt64;

    /**
     * Gets the value of the uInt64 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uInt64 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUInt64().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getUInt64() {
        if (uInt64 == null) {
            uInt64 = new ArrayList<BigInteger>();
        }
        return this.uInt64;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUInt64 .Builder<_B> _other) {
        if (this.uInt64 == null) {
            _other.uInt64 = null;
        } else {
            _other.uInt64 = new ArrayList<Buildable>();
            for (BigInteger _item: this.uInt64) {
                _other.uInt64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfUInt64 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUInt64 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUInt64 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUInt64 .Builder<Void> builder() {
        return new ListOfUInt64 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUInt64 .Builder<_B> copyOf(final ListOfUInt64 _other) {
        final ListOfUInt64 .Builder<_B> _newBuilder = new ListOfUInt64 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUInt64 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uInt64PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt64"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt64PropertyTree!= null):((uInt64PropertyTree == null)||(!uInt64PropertyTree.isLeaf())))) {
            if (this.uInt64 == null) {
                _other.uInt64 = null;
            } else {
                _other.uInt64 = new ArrayList<Buildable>();
                for (BigInteger _item: this.uInt64) {
                    _other.uInt64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfUInt64 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUInt64 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUInt64 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUInt64 .Builder<_B> copyOf(final ListOfUInt64 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUInt64 .Builder<_B> _newBuilder = new ListOfUInt64 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUInt64 .Builder<Void> copyExcept(final ListOfUInt64 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUInt64 .Builder<Void> copyOnly(final ListOfUInt64 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUInt64 _storedValue;
        private List<Buildable> uInt64;

        public Builder(final _B _parentBuilder, final ListOfUInt64 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uInt64 == null) {
                        this.uInt64 = null;
                    } else {
                        this.uInt64 = new ArrayList<Buildable>();
                        for (BigInteger _item: _other.uInt64) {
                            this.uInt64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUInt64 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uInt64PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt64"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt64PropertyTree!= null):((uInt64PropertyTree == null)||(!uInt64PropertyTree.isLeaf())))) {
                        if (_other.uInt64 == null) {
                            this.uInt64 = null;
                        } else {
                            this.uInt64 = new ArrayList<Buildable>();
                            for (BigInteger _item: _other.uInt64) {
                                this.uInt64 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfUInt64 >_P init(final _P _product) {
            if (this.uInt64 != null) {
                final List<BigInteger> uInt64 = new ArrayList<BigInteger>(this.uInt64 .size());
                for (Buildable _item: this.uInt64) {
                    uInt64 .add(((BigInteger) _item.build()));
                }
                _product.uInt64 = uInt64;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt64" hinzu.
         * 
         * @param uInt64
         *     Werte, die zur Eigenschaft "uInt64" hinzugefügt werden.
         */
        public ListOfUInt64 .Builder<_B> addUInt64(final Iterable<? extends BigInteger> uInt64) {
            if (uInt64 != null) {
                if (this.uInt64 == null) {
                    this.uInt64 = new ArrayList<Buildable>();
                }
                for (BigInteger _item: uInt64) {
                    this.uInt64 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt64" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt64
         *     Neuer Wert der Eigenschaft "uInt64".
         */
        public ListOfUInt64 .Builder<_B> withUInt64(final Iterable<? extends BigInteger> uInt64) {
            if (this.uInt64 != null) {
                this.uInt64 .clear();
            }
            return addUInt64(uInt64);
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt64" hinzu.
         * 
         * @param uInt64
         *     Werte, die zur Eigenschaft "uInt64" hinzugefügt werden.
         */
        public ListOfUInt64 .Builder<_B> addUInt64(BigInteger... uInt64) {
            addUInt64(Arrays.asList(uInt64));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt64" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt64
         *     Neuer Wert der Eigenschaft "uInt64".
         */
        public ListOfUInt64 .Builder<_B> withUInt64(BigInteger... uInt64) {
            withUInt64(Arrays.asList(uInt64));
            return this;
        }

        @Override
        public ListOfUInt64 build() {
            if (_storedValue == null) {
                return this.init(new ListOfUInt64());
            } else {
                return ((ListOfUInt64) _storedValue);
            }
        }

        public ListOfUInt64 .Builder<_B> copyOf(final ListOfUInt64 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUInt64 .Builder<_B> copyOf(final ListOfUInt64 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUInt64 .Selector<ListOfUInt64 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUInt64 .Select _root() {
            return new ListOfUInt64 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfUInt64 .Selector<TRoot, TParent>> uInt64 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uInt64 != null) {
                products.put("uInt64", this.uInt64 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfUInt64 .Selector<TRoot, TParent>> uInt64() {
            return ((this.uInt64 == null)?this.uInt64 = new com.kscs.util.jaxb.Selector<TRoot, ListOfUInt64 .Selector<TRoot, TParent>>(this._root, this, "uInt64"):this.uInt64);
        }

    }

}
