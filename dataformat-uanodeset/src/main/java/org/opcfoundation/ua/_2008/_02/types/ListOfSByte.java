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
 * <p>Java-Klasse für ListOfSByte complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSByte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SByte" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSByte", propOrder = {
    "sByte"
})
public class ListOfSByte {

    @XmlElement(name = "SByte", type = Byte.class)
    protected List<Byte> sByte;

    /**
     * Gets the value of the sByte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sByte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getSByte() {
        if (sByte == null) {
            sByte = new ArrayList<Byte>();
        }
        return this.sByte;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSByte.Builder<_B> _other) {
        if (this.sByte == null) {
            _other.sByte = null;
        } else {
            _other.sByte = new ArrayList<Buildable>();
            for (Byte _item: this.sByte) {
                _other.sByte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfSByte.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSByte.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSByte.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSByte.Builder<Void> builder() {
        return new ListOfSByte.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSByte.Builder<_B> copyOf(final ListOfSByte _other) {
        final ListOfSByte.Builder<_B> _newBuilder = new ListOfSByte.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSByte.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sBytePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sByte"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sBytePropertyTree!= null):((sBytePropertyTree == null)||(!sBytePropertyTree.isLeaf())))) {
            if (this.sByte == null) {
                _other.sByte = null;
            } else {
                _other.sByte = new ArrayList<Buildable>();
                for (Byte _item: this.sByte) {
                    _other.sByte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfSByte.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSByte.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSByte.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSByte.Builder<_B> copyOf(final ListOfSByte _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSByte.Builder<_B> _newBuilder = new ListOfSByte.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSByte.Builder<Void> copyExcept(final ListOfSByte _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSByte.Builder<Void> copyOnly(final ListOfSByte _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSByte _storedValue;
        private List<Buildable> sByte;

        public Builder(final _B _parentBuilder, final ListOfSByte _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.sByte == null) {
                        this.sByte = null;
                    } else {
                        this.sByte = new ArrayList<Buildable>();
                        for (Byte _item: _other.sByte) {
                            this.sByte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSByte _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sBytePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sByte"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sBytePropertyTree!= null):((sBytePropertyTree == null)||(!sBytePropertyTree.isLeaf())))) {
                        if (_other.sByte == null) {
                            this.sByte = null;
                        } else {
                            this.sByte = new ArrayList<Buildable>();
                            for (Byte _item: _other.sByte) {
                                this.sByte.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfSByte >_P init(final _P _product) {
            if (this.sByte!= null) {
                final List<Byte> sByte = new ArrayList<Byte>(this.sByte.size());
                for (Buildable _item: this.sByte) {
                    sByte.add(((Byte) _item.build()));
                }
                _product.sByte = sByte;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "sByte" hinzu.
         * 
         * @param sByte
         *     Werte, die zur Eigenschaft "sByte" hinzugefügt werden.
         */
        public ListOfSByte.Builder<_B> addSByte(final Iterable<? extends Byte> sByte) {
            if (sByte!= null) {
                if (this.sByte == null) {
                    this.sByte = new ArrayList<Buildable>();
                }
                for (Byte _item: sByte) {
                    this.sByte.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sByte" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sByte
         *     Neuer Wert der Eigenschaft "sByte".
         */
        public ListOfSByte.Builder<_B> withSByte(final Iterable<? extends Byte> sByte) {
            if (this.sByte!= null) {
                this.sByte.clear();
            }
            return addSByte(sByte);
        }

        /**
         * Fügt Werte zur Eigenschaft "sByte" hinzu.
         * 
         * @param sByte
         *     Werte, die zur Eigenschaft "sByte" hinzugefügt werden.
         */
        public ListOfSByte.Builder<_B> addSByte(Byte... sByte) {
            addSByte(Arrays.asList(sByte));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sByte" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sByte
         *     Neuer Wert der Eigenschaft "sByte".
         */
        public ListOfSByte.Builder<_B> withSByte(Byte... sByte) {
            withSByte(Arrays.asList(sByte));
            return this;
        }

        @Override
        public ListOfSByte build() {
            if (_storedValue == null) {
                return this.init(new ListOfSByte());
            } else {
                return ((ListOfSByte) _storedValue);
            }
        }

        public ListOfSByte.Builder<_B> copyOf(final ListOfSByte _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSByte.Builder<_B> copyOf(final ListOfSByte.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSByte.Selector<ListOfSByte.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSByte.Select _root() {
            return new ListOfSByte.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfSByte.Selector<TRoot, TParent>> sByte = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sByte!= null) {
                products.put("sByte", this.sByte.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfSByte.Selector<TRoot, TParent>> sByte() {
            return ((this.sByte == null)?this.sByte = new com.kscs.util.jaxb.Selector<TRoot, ListOfSByte.Selector<TRoot, TParent>>(this._root, this, "sByte"):this.sByte);
        }

    }

}
