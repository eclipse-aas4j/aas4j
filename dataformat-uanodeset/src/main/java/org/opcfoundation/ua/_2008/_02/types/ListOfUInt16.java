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
 * <p>Java-Klasse für ListOfUInt16 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUInt16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UInt16" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUInt16", propOrder = {
    "uInt16"
})
public class ListOfUInt16 {

    @XmlElement(name = "UInt16", type = Integer.class)
    @XmlSchemaType(name = "unsignedShort")
    protected List<Integer> uInt16;

    /**
     * Gets the value of the uInt16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uInt16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUInt16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getUInt16() {
        if (uInt16 == null) {
            uInt16 = new ArrayList<Integer>();
        }
        return this.uInt16;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUInt16 .Builder<_B> _other) {
        if (this.uInt16 == null) {
            _other.uInt16 = null;
        } else {
            _other.uInt16 = new ArrayList<Buildable>();
            for (Integer _item: this.uInt16) {
                _other.uInt16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfUInt16 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUInt16 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUInt16 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUInt16 .Builder<Void> builder() {
        return new ListOfUInt16 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUInt16 .Builder<_B> copyOf(final ListOfUInt16 _other) {
        final ListOfUInt16 .Builder<_B> _newBuilder = new ListOfUInt16 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUInt16 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uInt16PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt16"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt16PropertyTree!= null):((uInt16PropertyTree == null)||(!uInt16PropertyTree.isLeaf())))) {
            if (this.uInt16 == null) {
                _other.uInt16 = null;
            } else {
                _other.uInt16 = new ArrayList<Buildable>();
                for (Integer _item: this.uInt16) {
                    _other.uInt16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfUInt16 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUInt16 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUInt16 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUInt16 .Builder<_B> copyOf(final ListOfUInt16 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUInt16 .Builder<_B> _newBuilder = new ListOfUInt16 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUInt16 .Builder<Void> copyExcept(final ListOfUInt16 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUInt16 .Builder<Void> copyOnly(final ListOfUInt16 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUInt16 _storedValue;
        private List<Buildable> uInt16;

        public Builder(final _B _parentBuilder, final ListOfUInt16 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uInt16 == null) {
                        this.uInt16 = null;
                    } else {
                        this.uInt16 = new ArrayList<Buildable>();
                        for (Integer _item: _other.uInt16) {
                            this.uInt16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUInt16 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uInt16PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uInt16"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uInt16PropertyTree!= null):((uInt16PropertyTree == null)||(!uInt16PropertyTree.isLeaf())))) {
                        if (_other.uInt16 == null) {
                            this.uInt16 = null;
                        } else {
                            this.uInt16 = new ArrayList<Buildable>();
                            for (Integer _item: _other.uInt16) {
                                this.uInt16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfUInt16 >_P init(final _P _product) {
            if (this.uInt16 != null) {
                final List<Integer> uInt16 = new ArrayList<Integer>(this.uInt16 .size());
                for (Buildable _item: this.uInt16) {
                    uInt16 .add(((Integer) _item.build()));
                }
                _product.uInt16 = uInt16;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt16" hinzu.
         * 
         * @param uInt16
         *     Werte, die zur Eigenschaft "uInt16" hinzugefügt werden.
         */
        public ListOfUInt16 .Builder<_B> addUInt16(final Iterable<? extends Integer> uInt16) {
            if (uInt16 != null) {
                if (this.uInt16 == null) {
                    this.uInt16 = new ArrayList<Buildable>();
                }
                for (Integer _item: uInt16) {
                    this.uInt16 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt16" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt16
         *     Neuer Wert der Eigenschaft "uInt16".
         */
        public ListOfUInt16 .Builder<_B> withUInt16(final Iterable<? extends Integer> uInt16) {
            if (this.uInt16 != null) {
                this.uInt16 .clear();
            }
            return addUInt16(uInt16);
        }

        /**
         * Fügt Werte zur Eigenschaft "uInt16" hinzu.
         * 
         * @param uInt16
         *     Werte, die zur Eigenschaft "uInt16" hinzugefügt werden.
         */
        public ListOfUInt16 .Builder<_B> addUInt16(Integer... uInt16) {
            addUInt16(Arrays.asList(uInt16));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uInt16" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param uInt16
         *     Neuer Wert der Eigenschaft "uInt16".
         */
        public ListOfUInt16 .Builder<_B> withUInt16(Integer... uInt16) {
            withUInt16(Arrays.asList(uInt16));
            return this;
        }

        @Override
        public ListOfUInt16 build() {
            if (_storedValue == null) {
                return this.init(new ListOfUInt16());
            } else {
                return ((ListOfUInt16) _storedValue);
            }
        }

        public ListOfUInt16 .Builder<_B> copyOf(final ListOfUInt16 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUInt16 .Builder<_B> copyOf(final ListOfUInt16 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUInt16 .Selector<ListOfUInt16 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUInt16 .Select _root() {
            return new ListOfUInt16 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfUInt16 .Selector<TRoot, TParent>> uInt16 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uInt16 != null) {
                products.put("uInt16", this.uInt16 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfUInt16 .Selector<TRoot, TParent>> uInt16() {
            return ((this.uInt16 == null)?this.uInt16 = new com.kscs.util.jaxb.Selector<TRoot, ListOfUInt16 .Selector<TRoot, TParent>>(this._root, this, "uInt16"):this.uInt16);
        }

    }

}
