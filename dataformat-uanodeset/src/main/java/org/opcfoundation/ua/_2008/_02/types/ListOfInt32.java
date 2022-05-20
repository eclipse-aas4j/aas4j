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
 * <p>Java-Klasse für ListOfInt32 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfInt32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Int32" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfInt32", propOrder = {
    "int32"
})
public class ListOfInt32 {

    @XmlElement(name = "Int32", type = Integer.class)
    protected List<Integer> int32;

    /**
     * Gets the value of the int32 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the int32 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInt32().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getInt32() {
        if (int32 == null) {
            int32 = new ArrayList<Integer>();
        }
        return this.int32;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfInt32 .Builder<_B> _other) {
        if (this.int32 == null) {
            _other.int32 = null;
        } else {
            _other.int32 = new ArrayList<Buildable>();
            for (Integer _item: this.int32) {
                _other.int32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfInt32 .Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfInt32 .Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfInt32 .Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfInt32 .Builder<Void> builder() {
        return new ListOfInt32 .Builder<Void>(null, null, false);
    }

    public static<_B >ListOfInt32 .Builder<_B> copyOf(final ListOfInt32 _other) {
        final ListOfInt32 .Builder<_B> _newBuilder = new ListOfInt32 .Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfInt32 .Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree int32PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int32"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int32PropertyTree!= null):((int32PropertyTree == null)||(!int32PropertyTree.isLeaf())))) {
            if (this.int32 == null) {
                _other.int32 = null;
            } else {
                _other.int32 = new ArrayList<Buildable>();
                for (Integer _item: this.int32) {
                    _other.int32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfInt32 .Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfInt32 .Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfInt32 .Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfInt32 .Builder<_B> copyOf(final ListOfInt32 _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfInt32 .Builder<_B> _newBuilder = new ListOfInt32 .Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfInt32 .Builder<Void> copyExcept(final ListOfInt32 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfInt32 .Builder<Void> copyOnly(final ListOfInt32 _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfInt32 _storedValue;
        private List<Buildable> int32;

        public Builder(final _B _parentBuilder, final ListOfInt32 _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.int32 == null) {
                        this.int32 = null;
                    } else {
                        this.int32 = new ArrayList<Buildable>();
                        for (Integer _item: _other.int32) {
                            this.int32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfInt32 _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree int32PropertyTree = ((_propertyTree == null)?null:_propertyTree.get("int32"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(int32PropertyTree!= null):((int32PropertyTree == null)||(!int32PropertyTree.isLeaf())))) {
                        if (_other.int32 == null) {
                            this.int32 = null;
                        } else {
                            this.int32 = new ArrayList<Buildable>();
                            for (Integer _item: _other.int32) {
                                this.int32 .add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfInt32 >_P init(final _P _product) {
            if (this.int32 != null) {
                final List<Integer> int32 = new ArrayList<Integer>(this.int32 .size());
                for (Buildable _item: this.int32) {
                    int32 .add(((Integer) _item.build()));
                }
                _product.int32 = int32;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "int32" hinzu.
         * 
         * @param int32
         *     Werte, die zur Eigenschaft "int32" hinzugefügt werden.
         */
        public ListOfInt32 .Builder<_B> addInt32(final Iterable<? extends Integer> int32) {
            if (int32 != null) {
                if (this.int32 == null) {
                    this.int32 = new ArrayList<Buildable>();
                }
                for (Integer _item: int32) {
                    this.int32 .add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int32" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int32
         *     Neuer Wert der Eigenschaft "int32".
         */
        public ListOfInt32 .Builder<_B> withInt32(final Iterable<? extends Integer> int32) {
            if (this.int32 != null) {
                this.int32 .clear();
            }
            return addInt32(int32);
        }

        /**
         * Fügt Werte zur Eigenschaft "int32" hinzu.
         * 
         * @param int32
         *     Werte, die zur Eigenschaft "int32" hinzugefügt werden.
         */
        public ListOfInt32 .Builder<_B> addInt32(Integer... int32) {
            addInt32(Arrays.asList(int32));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "int32" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param int32
         *     Neuer Wert der Eigenschaft "int32".
         */
        public ListOfInt32 .Builder<_B> withInt32(Integer... int32) {
            withInt32(Arrays.asList(int32));
            return this;
        }

        @Override
        public ListOfInt32 build() {
            if (_storedValue == null) {
                return this.init(new ListOfInt32());
            } else {
                return ((ListOfInt32) _storedValue);
            }
        }

        public ListOfInt32 .Builder<_B> copyOf(final ListOfInt32 _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfInt32 .Builder<_B> copyOf(final ListOfInt32 .Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfInt32 .Selector<ListOfInt32 .Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfInt32 .Select _root() {
            return new ListOfInt32 .Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfInt32 .Selector<TRoot, TParent>> int32 = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.int32 != null) {
                products.put("int32", this.int32 .init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfInt32 .Selector<TRoot, TParent>> int32() {
            return ((this.int32 == null)?this.int32 = new com.kscs.util.jaxb.Selector<TRoot, ListOfInt32 .Selector<TRoot, TParent>>(this._root, this, "int32"):this.int32);
        }

    }

}
