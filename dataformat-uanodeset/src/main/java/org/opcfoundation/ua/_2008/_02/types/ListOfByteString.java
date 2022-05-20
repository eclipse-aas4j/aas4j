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
 * <p>Java-Klasse für ListOfByteString complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfByteString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ByteString" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfByteString", propOrder = {
    "byteString"
})
public class ListOfByteString {

    @XmlElement(name = "ByteString", nillable = true)
    protected List<byte[]> byteString;

    /**
     * Gets the value of the byteString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byteString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByteString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getByteString() {
        if (byteString == null) {
            byteString = new ArrayList<byte[]>();
        }
        return this.byteString;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfByteString.Builder<_B> _other) {
        if (this.byteString == null) {
            _other.byteString = null;
        } else {
            _other.byteString = new ArrayList<Buildable>();
            for (byte[] _item: this.byteString) {
                _other.byteString.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfByteString.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfByteString.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfByteString.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfByteString.Builder<Void> builder() {
        return new ListOfByteString.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfByteString.Builder<_B> copyOf(final ListOfByteString _other) {
        final ListOfByteString.Builder<_B> _newBuilder = new ListOfByteString.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfByteString.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree byteStringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("byteString"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(byteStringPropertyTree!= null):((byteStringPropertyTree == null)||(!byteStringPropertyTree.isLeaf())))) {
            if (this.byteString == null) {
                _other.byteString = null;
            } else {
                _other.byteString = new ArrayList<Buildable>();
                for (byte[] _item: this.byteString) {
                    _other.byteString.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfByteString.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfByteString.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfByteString.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfByteString.Builder<_B> copyOf(final ListOfByteString _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfByteString.Builder<_B> _newBuilder = new ListOfByteString.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfByteString.Builder<Void> copyExcept(final ListOfByteString _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfByteString.Builder<Void> copyOnly(final ListOfByteString _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfByteString _storedValue;
        private List<Buildable> byteString;

        public Builder(final _B _parentBuilder, final ListOfByteString _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.byteString == null) {
                        this.byteString = null;
                    } else {
                        this.byteString = new ArrayList<Buildable>();
                        for (byte[] _item: _other.byteString) {
                            this.byteString.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfByteString _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree byteStringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("byteString"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(byteStringPropertyTree!= null):((byteStringPropertyTree == null)||(!byteStringPropertyTree.isLeaf())))) {
                        if (_other.byteString == null) {
                            this.byteString = null;
                        } else {
                            this.byteString = new ArrayList<Buildable>();
                            for (byte[] _item: _other.byteString) {
                                this.byteString.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfByteString >_P init(final _P _product) {
            if (this.byteString!= null) {
                final List<byte[]> byteString = new ArrayList<byte[]>(this.byteString.size());
                for (Buildable _item: this.byteString) {
                    byteString.add(((byte[]) _item.build()));
                }
                _product.byteString = byteString;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "byteString" hinzu.
         * 
         * @param byteString
         *     Werte, die zur Eigenschaft "byteString" hinzugefügt werden.
         */
        public ListOfByteString.Builder<_B> addByteString(final Iterable<? extends byte[]> byteString) {
            if (byteString!= null) {
                if (this.byteString == null) {
                    this.byteString = new ArrayList<Buildable>();
                }
                for (byte[] _item: byteString) {
                    this.byteString.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "byteString" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param byteString
         *     Neuer Wert der Eigenschaft "byteString".
         */
        public ListOfByteString.Builder<_B> withByteString(final Iterable<? extends byte[]> byteString) {
            if (this.byteString!= null) {
                this.byteString.clear();
            }
            return addByteString(byteString);
        }

        /**
         * Fügt Werte zur Eigenschaft "byteString" hinzu.
         * 
         * @param byteString
         *     Werte, die zur Eigenschaft "byteString" hinzugefügt werden.
         */
        public ListOfByteString.Builder<_B> addByteString(byte[]... byteString) {
            addByteString(Arrays.asList(byteString));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "byteString" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param byteString
         *     Neuer Wert der Eigenschaft "byteString".
         */
        public ListOfByteString.Builder<_B> withByteString(byte[]... byteString) {
            withByteString(Arrays.asList(byteString));
            return this;
        }

        @Override
        public ListOfByteString build() {
            if (_storedValue == null) {
                return this.init(new ListOfByteString());
            } else {
                return ((ListOfByteString) _storedValue);
            }
        }

        public ListOfByteString.Builder<_B> copyOf(final ListOfByteString _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfByteString.Builder<_B> copyOf(final ListOfByteString.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfByteString.Selector<ListOfByteString.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfByteString.Select _root() {
            return new ListOfByteString.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfByteString.Selector<TRoot, TParent>> byteString = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.byteString!= null) {
                products.put("byteString", this.byteString.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfByteString.Selector<TRoot, TParent>> byteString() {
            return ((this.byteString == null)?this.byteString = new com.kscs.util.jaxb.Selector<TRoot, ListOfByteString.Selector<TRoot, TParent>>(this._root, this, "byteString"):this.byteString);
        }

    }

}
