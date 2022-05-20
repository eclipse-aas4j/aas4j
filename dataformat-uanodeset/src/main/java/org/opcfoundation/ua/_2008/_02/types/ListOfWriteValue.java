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
 * <p>Java-Klasse für ListOfWriteValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfWriteValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriteValue" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriteValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfWriteValue", propOrder = {
    "writeValue"
})
public class ListOfWriteValue {

    @XmlElement(name = "WriteValue", nillable = true)
    protected List<WriteValue> writeValue;

    /**
     * Gets the value of the writeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriteValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WriteValue }
     * 
     * 
     */
    public List<WriteValue> getWriteValue() {
        if (writeValue == null) {
            writeValue = new ArrayList<WriteValue>();
        }
        return this.writeValue;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfWriteValue.Builder<_B> _other) {
        if (this.writeValue == null) {
            _other.writeValue = null;
        } else {
            _other.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
            for (WriteValue _item: this.writeValue) {
                _other.writeValue.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfWriteValue.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfWriteValue.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfWriteValue.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfWriteValue.Builder<Void> builder() {
        return new ListOfWriteValue.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfWriteValue.Builder<_B> copyOf(final ListOfWriteValue _other) {
        final ListOfWriteValue.Builder<_B> _newBuilder = new ListOfWriteValue.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfWriteValue.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree writeValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeValuePropertyTree!= null):((writeValuePropertyTree == null)||(!writeValuePropertyTree.isLeaf())))) {
            if (this.writeValue == null) {
                _other.writeValue = null;
            } else {
                _other.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
                for (WriteValue _item: this.writeValue) {
                    _other.writeValue.add(((_item == null)?null:_item.newCopyBuilder(_other, writeValuePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfWriteValue.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfWriteValue.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfWriteValue.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfWriteValue.Builder<_B> copyOf(final ListOfWriteValue _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfWriteValue.Builder<_B> _newBuilder = new ListOfWriteValue.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfWriteValue.Builder<Void> copyExcept(final ListOfWriteValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfWriteValue.Builder<Void> copyOnly(final ListOfWriteValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfWriteValue _storedValue;
        private List<WriteValue.Builder<ListOfWriteValue.Builder<_B>>> writeValue;

        public Builder(final _B _parentBuilder, final ListOfWriteValue _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.writeValue == null) {
                        this.writeValue = null;
                    } else {
                        this.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
                        for (WriteValue _item: _other.writeValue) {
                            this.writeValue.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfWriteValue _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree writeValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeValuePropertyTree!= null):((writeValuePropertyTree == null)||(!writeValuePropertyTree.isLeaf())))) {
                        if (_other.writeValue == null) {
                            this.writeValue = null;
                        } else {
                            this.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
                            for (WriteValue _item: _other.writeValue) {
                                this.writeValue.add(((_item == null)?null:_item.newCopyBuilder(this, writeValuePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfWriteValue >_P init(final _P _product) {
            if (this.writeValue!= null) {
                final List<WriteValue> writeValue = new ArrayList<WriteValue>(this.writeValue.size());
                for (WriteValue.Builder<ListOfWriteValue.Builder<_B>> _item: this.writeValue) {
                    writeValue.add(_item.build());
                }
                _product.writeValue = writeValue;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "writeValue" hinzu.
         * 
         * @param writeValue
         *     Werte, die zur Eigenschaft "writeValue" hinzugefügt werden.
         */
        public ListOfWriteValue.Builder<_B> addWriteValue(final Iterable<? extends WriteValue> writeValue) {
            if (writeValue!= null) {
                if (this.writeValue == null) {
                    this.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
                }
                for (WriteValue _item: writeValue) {
                    this.writeValue.add(new WriteValue.Builder<ListOfWriteValue.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeValue" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeValue
         *     Neuer Wert der Eigenschaft "writeValue".
         */
        public ListOfWriteValue.Builder<_B> withWriteValue(final Iterable<? extends WriteValue> writeValue) {
            if (this.writeValue!= null) {
                this.writeValue.clear();
            }
            return addWriteValue(writeValue);
        }

        /**
         * Fügt Werte zur Eigenschaft "writeValue" hinzu.
         * 
         * @param writeValue
         *     Werte, die zur Eigenschaft "writeValue" hinzugefügt werden.
         */
        public ListOfWriteValue.Builder<_B> addWriteValue(WriteValue... writeValue) {
            addWriteValue(Arrays.asList(writeValue));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeValue" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeValue
         *     Neuer Wert der Eigenschaft "writeValue".
         */
        public ListOfWriteValue.Builder<_B> withWriteValue(WriteValue... writeValue) {
            withWriteValue(Arrays.asList(writeValue));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "WriteValue".
         * Mit {@link org.opcfoundation.ua._2008._02.types.WriteValue.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "WriteValue".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.WriteValue.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public WriteValue.Builder<? extends ListOfWriteValue.Builder<_B>> addWriteValue() {
            if (this.writeValue == null) {
                this.writeValue = new ArrayList<WriteValue.Builder<ListOfWriteValue.Builder<_B>>>();
            }
            final WriteValue.Builder<ListOfWriteValue.Builder<_B>> writeValue_Builder = new WriteValue.Builder<ListOfWriteValue.Builder<_B>>(this, null, false);
            this.writeValue.add(writeValue_Builder);
            return writeValue_Builder;
        }

        @Override
        public ListOfWriteValue build() {
            if (_storedValue == null) {
                return this.init(new ListOfWriteValue());
            } else {
                return ((ListOfWriteValue) _storedValue);
            }
        }

        public ListOfWriteValue.Builder<_B> copyOf(final ListOfWriteValue _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfWriteValue.Builder<_B> copyOf(final ListOfWriteValue.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfWriteValue.Selector<ListOfWriteValue.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfWriteValue.Select _root() {
            return new ListOfWriteValue.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private WriteValue.Selector<TRoot, ListOfWriteValue.Selector<TRoot, TParent>> writeValue = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.writeValue!= null) {
                products.put("writeValue", this.writeValue.init());
            }
            return products;
        }

        public WriteValue.Selector<TRoot, ListOfWriteValue.Selector<TRoot, TParent>> writeValue() {
            return ((this.writeValue == null)?this.writeValue = new WriteValue.Selector<TRoot, ListOfWriteValue.Selector<TRoot, TParent>>(this._root, this, "writeValue"):this.writeValue);
        }

    }

}
