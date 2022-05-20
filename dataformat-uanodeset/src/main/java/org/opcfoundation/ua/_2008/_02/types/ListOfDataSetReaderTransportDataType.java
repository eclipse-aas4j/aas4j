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
 * <p>Java-Klasse für ListOfDataSetReaderTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetReaderTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetReaderTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetReaderTransportDataType", propOrder = {
    "dataSetReaderTransportDataType"
})
public class ListOfDataSetReaderTransportDataType {

    @XmlElement(name = "DataSetReaderTransportDataType", nillable = true)
    protected List<DataSetReaderTransportDataType> dataSetReaderTransportDataType;

    /**
     * Gets the value of the dataSetReaderTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetReaderTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetReaderTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetReaderTransportDataType }
     * 
     * 
     */
    public List<DataSetReaderTransportDataType> getDataSetReaderTransportDataType() {
        if (dataSetReaderTransportDataType == null) {
            dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType>();
        }
        return this.dataSetReaderTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetReaderTransportDataType.Builder<_B> _other) {
        if (this.dataSetReaderTransportDataType == null) {
            _other.dataSetReaderTransportDataType = null;
        } else {
            _other.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
            for (DataSetReaderTransportDataType _item: this.dataSetReaderTransportDataType) {
                _other.dataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetReaderTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetReaderTransportDataType.Builder<Void> builder() {
        return new ListOfDataSetReaderTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfDataSetReaderTransportDataType _other) {
        final ListOfDataSetReaderTransportDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetReaderTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetReaderTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderTransportDataTypePropertyTree!= null):((dataSetReaderTransportDataTypePropertyTree == null)||(!dataSetReaderTransportDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetReaderTransportDataType == null) {
                _other.dataSetReaderTransportDataType = null;
            } else {
                _other.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
                for (DataSetReaderTransportDataType _item: this.dataSetReaderTransportDataType) {
                    _other.dataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetReaderTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetReaderTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfDataSetReaderTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetReaderTransportDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetReaderTransportDataType.Builder<Void> copyExcept(final ListOfDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetReaderTransportDataType.Builder<Void> copyOnly(final ListOfDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetReaderTransportDataType _storedValue;
        private List<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>> dataSetReaderTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetReaderTransportDataType == null) {
                        this.dataSetReaderTransportDataType = null;
                    } else {
                        this.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
                        for (DataSetReaderTransportDataType _item: _other.dataSetReaderTransportDataType) {
                            this.dataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetReaderTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderTransportDataTypePropertyTree!= null):((dataSetReaderTransportDataTypePropertyTree == null)||(!dataSetReaderTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetReaderTransportDataType == null) {
                            this.dataSetReaderTransportDataType = null;
                        } else {
                            this.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
                            for (DataSetReaderTransportDataType _item: _other.dataSetReaderTransportDataType) {
                                this.dataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetReaderTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetReaderTransportDataType >_P init(final _P _product) {
            if (this.dataSetReaderTransportDataType!= null) {
                final List<DataSetReaderTransportDataType> dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType>(this.dataSetReaderTransportDataType.size());
                for (DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>> _item: this.dataSetReaderTransportDataType) {
                    dataSetReaderTransportDataType.add(_item.build());
                }
                _product.dataSetReaderTransportDataType = dataSetReaderTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderTransportDataType" hinzu.
         * 
         * @param dataSetReaderTransportDataType
         *     Werte, die zur Eigenschaft "dataSetReaderTransportDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderTransportDataType.Builder<_B> addDataSetReaderTransportDataType(final Iterable<? extends DataSetReaderTransportDataType> dataSetReaderTransportDataType) {
            if (dataSetReaderTransportDataType!= null) {
                if (this.dataSetReaderTransportDataType == null) {
                    this.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
                }
                for (DataSetReaderTransportDataType _item: dataSetReaderTransportDataType) {
                    this.dataSetReaderTransportDataType.add(new DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderTransportDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderTransportDataType".
         */
        public ListOfDataSetReaderTransportDataType.Builder<_B> withDataSetReaderTransportDataType(final Iterable<? extends DataSetReaderTransportDataType> dataSetReaderTransportDataType) {
            if (this.dataSetReaderTransportDataType!= null) {
                this.dataSetReaderTransportDataType.clear();
            }
            return addDataSetReaderTransportDataType(dataSetReaderTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderTransportDataType" hinzu.
         * 
         * @param dataSetReaderTransportDataType
         *     Werte, die zur Eigenschaft "dataSetReaderTransportDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderTransportDataType.Builder<_B> addDataSetReaderTransportDataType(DataSetReaderTransportDataType... dataSetReaderTransportDataType) {
            addDataSetReaderTransportDataType(Arrays.asList(dataSetReaderTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderTransportDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderTransportDataType".
         */
        public ListOfDataSetReaderTransportDataType.Builder<_B> withDataSetReaderTransportDataType(DataSetReaderTransportDataType... dataSetReaderTransportDataType) {
            withDataSetReaderTransportDataType(Arrays.asList(dataSetReaderTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetReaderTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetReaderTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetReaderTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DataSetReaderTransportDataType.Builder<? extends ListOfDataSetReaderTransportDataType.Builder<_B>> addDataSetReaderTransportDataType() {
            if (this.dataSetReaderTransportDataType == null) {
                this.dataSetReaderTransportDataType = new ArrayList<DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>>();
            }
            final DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>> dataSetReaderTransportDataType_Builder = new DataSetReaderTransportDataType.Builder<ListOfDataSetReaderTransportDataType.Builder<_B>>(this, null, false);
            this.dataSetReaderTransportDataType.add(dataSetReaderTransportDataType_Builder);
            return dataSetReaderTransportDataType_Builder;
        }

        @Override
        public ListOfDataSetReaderTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetReaderTransportDataType());
            } else {
                return ((ListOfDataSetReaderTransportDataType) _storedValue);
            }
        }

        public ListOfDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfDataSetReaderTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfDataSetReaderTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetReaderTransportDataType.Selector<ListOfDataSetReaderTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetReaderTransportDataType.Select _root() {
            return new ListOfDataSetReaderTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetReaderTransportDataType.Selector<TRoot, ListOfDataSetReaderTransportDataType.Selector<TRoot, TParent>> dataSetReaderTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetReaderTransportDataType!= null) {
                products.put("dataSetReaderTransportDataType", this.dataSetReaderTransportDataType.init());
            }
            return products;
        }

        public DataSetReaderTransportDataType.Selector<TRoot, ListOfDataSetReaderTransportDataType.Selector<TRoot, TParent>> dataSetReaderTransportDataType() {
            return ((this.dataSetReaderTransportDataType == null)?this.dataSetReaderTransportDataType = new DataSetReaderTransportDataType.Selector<TRoot, ListOfDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetReaderTransportDataType"):this.dataSetReaderTransportDataType);
        }

    }

}
