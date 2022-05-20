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
 * <p>Java-Klasse für ListOfByte complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfByte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Byte" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfByte", propOrder = {
    "_byte"
})
public class ListOfByte {

    @XmlElement(name = "Byte", type = Short.class)
    @XmlSchemaType(name = "unsignedByte")
    protected List<Short> _byte;

    /**
     * Gets the value of the byte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * 
     * 
     */
    public List<Short> getByte() {
        if (_byte == null) {
            _byte = new ArrayList<Short>();
        }
        return this._byte;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfByte.Builder<_B> _other) {
        if (this._byte == null) {
            _other._byte = null;
        } else {
            _other._byte = new ArrayList<Buildable>();
            for (Short _item: this._byte) {
                _other._byte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfByte.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfByte.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfByte.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfByte.Builder<Void> builder() {
        return new ListOfByte.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfByte.Builder<_B> copyOf(final ListOfByte _other) {
        final ListOfByte.Builder<_B> _newBuilder = new ListOfByte.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfByte.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree _bytePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_byte"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_bytePropertyTree!= null):((_bytePropertyTree == null)||(!_bytePropertyTree.isLeaf())))) {
            if (this._byte == null) {
                _other._byte = null;
            } else {
                _other._byte = new ArrayList<Buildable>();
                for (Short _item: this._byte) {
                    _other._byte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfByte.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfByte.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfByte.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfByte.Builder<_B> copyOf(final ListOfByte _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfByte.Builder<_B> _newBuilder = new ListOfByte.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfByte.Builder<Void> copyExcept(final ListOfByte _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfByte.Builder<Void> copyOnly(final ListOfByte _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfByte _storedValue;
        private List<Buildable> _byte;

        public Builder(final _B _parentBuilder, final ListOfByte _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other._byte == null) {
                        this._byte = null;
                    } else {
                        this._byte = new ArrayList<Buildable>();
                        for (Short _item: _other._byte) {
                            this._byte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfByte _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree _bytePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("_byte"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(_bytePropertyTree!= null):((_bytePropertyTree == null)||(!_bytePropertyTree.isLeaf())))) {
                        if (_other._byte == null) {
                            this._byte = null;
                        } else {
                            this._byte = new ArrayList<Buildable>();
                            for (Short _item: _other._byte) {
                                this._byte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfByte >_P init(final _P _product) {
            if (this._byte!= null) {
                final List<Short> _byte = new ArrayList<Short>(this._byte.size());
                for (Buildable _item: this._byte) {
                    _byte.add(((Short) _item.build()));
                }
                _product._byte = _byte;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "_byte" hinzu.
         * 
         * @param _byte
         *     Werte, die zur Eigenschaft "_byte" hinzugefügt werden.
         */
        public ListOfByte.Builder<_B> addByte(final Iterable<? extends Short> _byte) {
            if (_byte!= null) {
                if (this._byte == null) {
                    this._byte = new ArrayList<Buildable>();
                }
                for (Short _item: _byte) {
                    this._byte.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_byte" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _byte
         *     Neuer Wert der Eigenschaft "_byte".
         */
        public ListOfByte.Builder<_B> withByte(final Iterable<? extends Short> _byte) {
            if (this._byte!= null) {
                this._byte.clear();
            }
            return addByte(_byte);
        }

        /**
         * Fügt Werte zur Eigenschaft "_byte" hinzu.
         * 
         * @param _byte
         *     Werte, die zur Eigenschaft "_byte" hinzugefügt werden.
         */
        public ListOfByte.Builder<_B> addByte(Short... _byte) {
            addByte(Arrays.asList(_byte));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "_byte" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param _byte
         *     Neuer Wert der Eigenschaft "_byte".
         */
        public ListOfByte.Builder<_B> withByte(Short... _byte) {
            withByte(Arrays.asList(_byte));
            return this;
        }

        @Override
        public ListOfByte build() {
            if (_storedValue == null) {
                return this.init(new ListOfByte());
            } else {
                return ((ListOfByte) _storedValue);
            }
        }

        public ListOfByte.Builder<_B> copyOf(final ListOfByte _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfByte.Builder<_B> copyOf(final ListOfByte.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfByte.Selector<ListOfByte.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfByte.Select _root() {
            return new ListOfByte.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfByte.Selector<TRoot, TParent>> _byte = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this._byte!= null) {
                products.put("_byte", this._byte.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfByte.Selector<TRoot, TParent>> _byte() {
            return ((this._byte == null)?this._byte = new com.kscs.util.jaxb.Selector<TRoot, ListOfByte.Selector<TRoot, TParent>>(this._root, this, "_byte"):this._byte);
        }

    }

}
