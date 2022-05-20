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
 * <p>Java-Klasse für ListOfDataValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataValue" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataValue", propOrder = {
    "dataValue"
})
public class ListOfDataValue {

    @XmlElement(name = "DataValue", nillable = true)
    protected List<DataValue> dataValue;

    /**
     * Gets the value of the dataValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataValue }
     * 
     * 
     */
    public List<DataValue> getDataValue() {
        if (dataValue == null) {
            dataValue = new ArrayList<DataValue>();
        }
        return this.dataValue;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataValue.Builder<_B> _other) {
        if (this.dataValue == null) {
            _other.dataValue = null;
        } else {
            _other.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
            for (DataValue _item: this.dataValue) {
                _other.dataValue.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataValue.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataValue.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataValue.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataValue.Builder<Void> builder() {
        return new ListOfDataValue.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataValue.Builder<_B> copyOf(final ListOfDataValue _other) {
        final ListOfDataValue.Builder<_B> _newBuilder = new ListOfDataValue.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataValue.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataValuePropertyTree!= null):((dataValuePropertyTree == null)||(!dataValuePropertyTree.isLeaf())))) {
            if (this.dataValue == null) {
                _other.dataValue = null;
            } else {
                _other.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
                for (DataValue _item: this.dataValue) {
                    _other.dataValue.add(((_item == null)?null:_item.newCopyBuilder(_other, dataValuePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataValue.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataValue.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataValue.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataValue.Builder<_B> copyOf(final ListOfDataValue _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataValue.Builder<_B> _newBuilder = new ListOfDataValue.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataValue.Builder<Void> copyExcept(final ListOfDataValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataValue.Builder<Void> copyOnly(final ListOfDataValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataValue _storedValue;
        private List<DataValue.Builder<ListOfDataValue.Builder<_B>>> dataValue;

        public Builder(final _B _parentBuilder, final ListOfDataValue _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataValue == null) {
                        this.dataValue = null;
                    } else {
                        this.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
                        for (DataValue _item: _other.dataValue) {
                            this.dataValue.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataValue _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataValuePropertyTree!= null):((dataValuePropertyTree == null)||(!dataValuePropertyTree.isLeaf())))) {
                        if (_other.dataValue == null) {
                            this.dataValue = null;
                        } else {
                            this.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
                            for (DataValue _item: _other.dataValue) {
                                this.dataValue.add(((_item == null)?null:_item.newCopyBuilder(this, dataValuePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataValue >_P init(final _P _product) {
            if (this.dataValue!= null) {
                final List<DataValue> dataValue = new ArrayList<DataValue>(this.dataValue.size());
                for (DataValue.Builder<ListOfDataValue.Builder<_B>> _item: this.dataValue) {
                    dataValue.add(_item.build());
                }
                _product.dataValue = dataValue;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataValue" hinzu.
         * 
         * @param dataValue
         *     Werte, die zur Eigenschaft "dataValue" hinzugefügt werden.
         */
        public ListOfDataValue.Builder<_B> addDataValue(final Iterable<? extends DataValue> dataValue) {
            if (dataValue!= null) {
                if (this.dataValue == null) {
                    this.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
                }
                for (DataValue _item: dataValue) {
                    this.dataValue.add(new DataValue.Builder<ListOfDataValue.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataValue" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataValue
         *     Neuer Wert der Eigenschaft "dataValue".
         */
        public ListOfDataValue.Builder<_B> withDataValue(final Iterable<? extends DataValue> dataValue) {
            if (this.dataValue!= null) {
                this.dataValue.clear();
            }
            return addDataValue(dataValue);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataValue" hinzu.
         * 
         * @param dataValue
         *     Werte, die zur Eigenschaft "dataValue" hinzugefügt werden.
         */
        public ListOfDataValue.Builder<_B> addDataValue(DataValue... dataValue) {
            addDataValue(Arrays.asList(dataValue));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataValue" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataValue
         *     Neuer Wert der Eigenschaft "dataValue".
         */
        public ListOfDataValue.Builder<_B> withDataValue(DataValue... dataValue) {
            withDataValue(Arrays.asList(dataValue));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataValue".
         * Mit {@link org.opcfoundation.ua._2008._02.types.DataValue.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataValue".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.DataValue.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DataValue.Builder<? extends ListOfDataValue.Builder<_B>> addDataValue() {
            if (this.dataValue == null) {
                this.dataValue = new ArrayList<DataValue.Builder<ListOfDataValue.Builder<_B>>>();
            }
            final DataValue.Builder<ListOfDataValue.Builder<_B>> dataValue_Builder = new DataValue.Builder<ListOfDataValue.Builder<_B>>(this, null, false);
            this.dataValue.add(dataValue_Builder);
            return dataValue_Builder;
        }

        @Override
        public ListOfDataValue build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataValue());
            } else {
                return ((ListOfDataValue) _storedValue);
            }
        }

        public ListOfDataValue.Builder<_B> copyOf(final ListOfDataValue _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataValue.Builder<_B> copyOf(final ListOfDataValue.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataValue.Selector<ListOfDataValue.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataValue.Select _root() {
            return new ListOfDataValue.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataValue.Selector<TRoot, ListOfDataValue.Selector<TRoot, TParent>> dataValue = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataValue!= null) {
                products.put("dataValue", this.dataValue.init());
            }
            return products;
        }

        public DataValue.Selector<TRoot, ListOfDataValue.Selector<TRoot, TParent>> dataValue() {
            return ((this.dataValue == null)?this.dataValue = new DataValue.Selector<TRoot, ListOfDataValue.Selector<TRoot, TParent>>(this._root, this, "dataValue"):this.dataValue);
        }

    }

}
