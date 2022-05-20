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
 * <p>Java-Klasse für ListOfInt16 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfInt16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Int16" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfInt16", propOrder = {
    "int16"
})
public class ListOfInt16 {

    @XmlElement(name = "Int16", type = Short.class)
    protected List<Short> int16;

    /**
     * Gets the value of the int16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the int16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInt16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * 
     * 
     */
    public List<Short> getInt16() {
        if (int16 == null) {
            int16 = new ArrayList<Short>();
        }
        return this.int16;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfInt16 .Builder<_B> _other) {
        if (this.int16 == null) {
            _other.int16 = null;
        } else {
            _other.int16 = new ArrayList<Buildable>();
            for (Short _item: this.int16) {
                _other.int16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfInt16 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfInt16 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfInt16 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfInt16 .Builder<Void> builder() {
        return new ListOfInt16 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfInt16 .Builder<_B> copyOf(final ListOfInt16 _other) {
        final ListOfInt16 .Builder<_B> _newBuilder = new ListOfInt16 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfInt16 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree int16PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int16"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int16PropertyTree!= null):((int16PropertyTree == null)||(!int16PropertyTree.isLeaf())))) {
            if (this.int16 == null) {
                _other.int16 = null;
            } else {
                _other.int16 = new ArrayList<Buildable>();
                for (Short _item: this.int16) {
                    _other.int16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfInt16 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfInt16 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfInt16 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfInt16 .Builder<_B> copyOf(final ListOfInt16 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfInt16 .Builder<_B> _newBuilder = new ListOfInt16 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfInt16 .Builder<Void> copyExcept(final ListOfInt16 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfInt16 .Builder<Void> copyOnly(final ListOfInt16 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfInt16 _storedValue;
        private List<Buildable> int16;

        public Builder(final _B _parentBuilder, final ListOfInt16 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.int16 == null) {
                        this.int16 = null;
                    } else {
                        this.int16 = new ArrayList<Buildable>();
                        for (Short _item: _other.int16) {
                            this.int16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfInt16 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree int16PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int16"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int16PropertyTree!= null):((int16PropertyTree == null)||(!int16PropertyTree.isLeaf())))) {
                        if (_other.int16 == null) {
                            this.int16 = null;
                        } else {
                            this.int16 = new ArrayList<Buildable>();
                            for (Short _item: _other.int16) {
                                this.int16 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfInt16 >_P init(final _P _product) {
            if (this.int16 != null) {
                final List<Short> int16 = new ArrayList<Short>(this.int16 .size());
                for (Buildable _item: this.int16) {
                    int16 .add(((Short) _item.build()));
                }
                _product.int16 = int16;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "int16" hinzu.
         * 
         * @param int16
         *     Werte, die zur Eigenschaft "int16" hinzugefügt werden.
         */
        public ListOfInt16 .Builder<_B> addInt16(final Iterable<? extends Short> int16) {
            if (int16 != null) {
                if (this.int16 == null) {
                    this.int16 = new ArrayList<Buildable>();
                }
                for (Short _item: int16) {
                    this.int16 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int16" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int16
         *     Neuer Wert der Eigenschaft "int16".
         */
        public ListOfInt16 .Builder<_B> withInt16(final Iterable<? extends Short> int16) {
            if (this.int16 != null) {
                this.int16 .clear();
            }
            return addInt16(int16);
        }

        /**
         * Fügt Werte zur Eigenschaft "int16" hinzu.
         * 
         * @param int16
         *     Werte, die zur Eigenschaft "int16" hinzugefügt werden.
         */
        public ListOfInt16 .Builder<_B> addInt16(Short... int16) {
            addInt16(Arrays.asList(int16));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int16" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int16
         *     Neuer Wert der Eigenschaft "int16".
         */
        public ListOfInt16 .Builder<_B> withInt16(Short... int16) {
            withInt16(Arrays.asList(int16));
            return this;
        }

        @Override
        public ListOfInt16 build() {
            if (_storedValue == null) {
                return this.init(new ListOfInt16());
            } else {
                return ((ListOfInt16) _storedValue);
            }
        }

        public ListOfInt16 .Builder<_B> copyOf(final ListOfInt16 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfInt16 .Builder<_B> copyOf(final ListOfInt16 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfInt16 .Selector<ListOfInt16 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfInt16 .Select _root() {
            return new ListOfInt16 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfInt16 .Selector<TRoot, TParent>> int16 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.int16 != null) {
                products.put("int16", this.int16 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfInt16 .Selector<TRoot, TParent>> int16() {
            return ((this.int16 == null)?this.int16 = new com.kscs.util.jaxb.Selector<TRoot, ListOfInt16 .Selector<TRoot, TParent>>(this._root, this, "int16"):this.int16);
        }

    }

}
