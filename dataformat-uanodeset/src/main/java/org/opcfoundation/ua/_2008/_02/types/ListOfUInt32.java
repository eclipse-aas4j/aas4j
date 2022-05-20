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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfUInt32 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUInt32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UInt32" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUInt32", propOrder = {
    "uInt32"
})
public class ListOfUInt32 {

    @XmlElement(name = "UInt32", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> uInt32;

    /**
     * Gets the value of the uInt32 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uInt32 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUInt32().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUInt32() {
        if (uInt32 == null) {
            uInt32 = new ArrayList<Long>();
        }
        return this.uInt32;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUInt32 .Builder<_B> _other) {
        if (this.uInt32 == null) {
            _other.uInt32 = null;
        } else {
            _other.uInt32 = new ArrayList<Buildable>();
            for (Long _item: this.uInt32) {
                _other.uInt32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfUInt32 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUInt32 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUInt32 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUInt32 .Builder<Void> builder() {
        return new ListOfUInt32 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUInt32 .Builder<_B> copyOf(final ListOfUInt32 _other) {
        final ListOfUInt32 .Builder<_B> _newBuilder = new ListOfUInt32 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUInt32 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uInt32PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt32"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt32PropertyTree!= null):((uInt32PropertyTree == null)||(!uInt32PropertyTree.isLeaf())))) {
            if (this.uInt32 == null) {
                _other.uInt32 = null;
            } else {
                _other.uInt32 = new ArrayList<Buildable>();
                for (Long _item: this.uInt32) {
                    _other.uInt32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfUInt32 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUInt32 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUInt32 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUInt32 .Builder<_B> copyOf(final ListOfUInt32 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUInt32 .Builder<_B> _newBuilder = new ListOfUInt32 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUInt32 .Builder<Void> copyExcept(final ListOfUInt32 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUInt32 .Builder<Void> copyOnly(final ListOfUInt32 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUInt32 _storedValue;
        private List<Buildable> uInt32;

        public Builder(final _B _parentBuilder, final ListOfUInt32 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uInt32 == null) {
                        this.uInt32 = null;
                    } else {
                        this.uInt32 = new ArrayList<Buildable>();
                        for (Long _item: _other.uInt32) {
                            this.uInt32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUInt32 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uInt32PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt32"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt32PropertyTree!= null):((uInt32PropertyTree == null)||(!uInt32PropertyTree.isLeaf())))) {
                        if (_other.uInt32 == null) {
                            this.uInt32 = null;
                        } else {
                            this.uInt32 = new ArrayList<Buildable>();
                            for (Long _item: _other.uInt32) {
                                this.uInt32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfUInt32 >_P init(final _P _product) {
            if (this.uInt32 != null) {
                final List<Long> uInt32 = new ArrayList<Long>(this.uInt32 .size());
                for (Buildable _item: this.uInt32) {
                    uInt32 .add(((Long) _item.build()));
                }
                _product.uInt32 = uInt32;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt32" hinzu.
         * 
         * @param uInt32
         *     Werte, die zur Eigenschaft "uInt32" hinzugefügt werden.
         */
        public ListOfUInt32 .Builder<_B> addUInt32(final Iterable<? extends Long> uInt32) {
            if (uInt32 != null) {
                if (this.uInt32 == null) {
                    this.uInt32 = new ArrayList<Buildable>();
                }
                for (Long _item: uInt32) {
                    this.uInt32 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt32" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt32
         *     Neuer Wert der Eigenschaft "uInt32".
         */
        public ListOfUInt32 .Builder<_B> withUInt32(final Iterable<? extends Long> uInt32) {
            if (this.uInt32 != null) {
                this.uInt32 .clear();
            }
            return addUInt32(uInt32);
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt32" hinzu.
         * 
         * @param uInt32
         *     Werte, die zur Eigenschaft "uInt32" hinzugefügt werden.
         */
        public ListOfUInt32 .Builder<_B> addUInt32(Long... uInt32) {
            addUInt32(Arrays.asList(uInt32));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt32" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt32
         *     Neuer Wert der Eigenschaft "uInt32".
         */
        public ListOfUInt32 .Builder<_B> withUInt32(Long... uInt32) {
            withUInt32(Arrays.asList(uInt32));
            return this;
        }

        @Override
        public ListOfUInt32 build() {
            if (_storedValue == null) {
                return this.init(new ListOfUInt32());
            } else {
                return ((ListOfUInt32) _storedValue);
            }
        }

        public ListOfUInt32 .Builder<_B> copyOf(final ListOfUInt32 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUInt32 .Builder<_B> copyOf(final ListOfUInt32 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUInt32 .Selector<ListOfUInt32 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUInt32 .Select _root() {
            return new ListOfUInt32 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfUInt32 .Selector<TRoot, TParent>> uInt32 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uInt32 != null) {
                products.put("uInt32", this.uInt32 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfUInt32 .Selector<TRoot, TParent>> uInt32() {
            return ((this.uInt32 == null)?this.uInt32 = new com.kscs.util.jaxb.Selector<TRoot, ListOfUInt32 .Selector<TRoot, TParent>>(this._root, this, "uInt32"):this.uInt32);
        }

    }

}
