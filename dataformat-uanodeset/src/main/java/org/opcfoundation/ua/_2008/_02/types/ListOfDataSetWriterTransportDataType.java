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
 * <p>Java-Klasse für ListOfDataSetWriterTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetWriterTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetWriterTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetWriterTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetWriterTransportDataType", propOrder = {
    "dataSetWriterTransportDataType"
})
public class ListOfDataSetWriterTransportDataType {

    @XmlElement(name = "DataSetWriterTransportDataType", nillable = true)
    protected List<DataSetWriterTransportDataType> dataSetWriterTransportDataType;

    /**
     * Gets the value of the dataSetWriterTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetWriterTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetWriterTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetWriterTransportDataType }
     * 
     * 
     */
    public List<DataSetWriterTransportDataType> getDataSetWriterTransportDataType() {
        if (dataSetWriterTransportDataType == null) {
            dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType>();
        }
        return this.dataSetWriterTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetWriterTransportDataType.Builder<_B> _other) {
        if (this.dataSetWriterTransportDataType == null) {
            _other.dataSetWriterTransportDataType = null;
        } else {
            _other.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
            for (DataSetWriterTransportDataType _item: this.dataSetWriterTransportDataType) {
                _other.dataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetWriterTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetWriterTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetWriterTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetWriterTransportDataType.Builder<Void> builder() {
        return new ListOfDataSetWriterTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfDataSetWriterTransportDataType _other) {
        final ListOfDataSetWriterTransportDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetWriterTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetWriterTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterTransportDataTypePropertyTree!= null):((dataSetWriterTransportDataTypePropertyTree == null)||(!dataSetWriterTransportDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetWriterTransportDataType == null) {
                _other.dataSetWriterTransportDataType = null;
            } else {
                _other.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
                for (DataSetWriterTransportDataType _item: this.dataSetWriterTransportDataType) {
                    _other.dataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetWriterTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetWriterTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetWriterTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetWriterTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfDataSetWriterTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetWriterTransportDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetWriterTransportDataType.Builder<Void> copyExcept(final ListOfDataSetWriterTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetWriterTransportDataType.Builder<Void> copyOnly(final ListOfDataSetWriterTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetWriterTransportDataType _storedValue;
        private List<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>> dataSetWriterTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetWriterTransportDataType == null) {
                        this.dataSetWriterTransportDataType = null;
                    } else {
                        this.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
                        for (DataSetWriterTransportDataType _item: _other.dataSetWriterTransportDataType) {
                            this.dataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetWriterTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterTransportDataTypePropertyTree!= null):((dataSetWriterTransportDataTypePropertyTree == null)||(!dataSetWriterTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetWriterTransportDataType == null) {
                            this.dataSetWriterTransportDataType = null;
                        } else {
                            this.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
                            for (DataSetWriterTransportDataType _item: _other.dataSetWriterTransportDataType) {
                                this.dataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetWriterTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetWriterTransportDataType >_P init(final _P _product) {
            if (this.dataSetWriterTransportDataType!= null) {
                final List<DataSetWriterTransportDataType> dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType>(this.dataSetWriterTransportDataType.size());
                for (DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>> _item: this.dataSetWriterTransportDataType) {
                    dataSetWriterTransportDataType.add(_item.build());
                }
                _product.dataSetWriterTransportDataType = dataSetWriterTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterTransportDataType" hinzu.
         * 
         * @param dataSetWriterTransportDataType
         *     Werte, die zur Eigenschaft "dataSetWriterTransportDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterTransportDataType.Builder<_B> addDataSetWriterTransportDataType(final Iterable<? extends DataSetWriterTransportDataType> dataSetWriterTransportDataType) {
            if (dataSetWriterTransportDataType!= null) {
                if (this.dataSetWriterTransportDataType == null) {
                    this.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
                }
                for (DataSetWriterTransportDataType _item: dataSetWriterTransportDataType) {
                    this.dataSetWriterTransportDataType.add(new DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterTransportDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterTransportDataType".
         */
        public ListOfDataSetWriterTransportDataType.Builder<_B> withDataSetWriterTransportDataType(final Iterable<? extends DataSetWriterTransportDataType> dataSetWriterTransportDataType) {
            if (this.dataSetWriterTransportDataType!= null) {
                this.dataSetWriterTransportDataType.clear();
            }
            return addDataSetWriterTransportDataType(dataSetWriterTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterTransportDataType" hinzu.
         * 
         * @param dataSetWriterTransportDataType
         *     Werte, die zur Eigenschaft "dataSetWriterTransportDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterTransportDataType.Builder<_B> addDataSetWriterTransportDataType(DataSetWriterTransportDataType... dataSetWriterTransportDataType) {
            addDataSetWriterTransportDataType(Arrays.asList(dataSetWriterTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterTransportDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterTransportDataType".
         */
        public ListOfDataSetWriterTransportDataType.Builder<_B> withDataSetWriterTransportDataType(DataSetWriterTransportDataType... dataSetWriterTransportDataType) {
            withDataSetWriterTransportDataType(Arrays.asList(dataSetWriterTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetWriterTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetWriterTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetWriterTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DataSetWriterTransportDataType.Builder<? extends ListOfDataSetWriterTransportDataType.Builder<_B>> addDataSetWriterTransportDataType() {
            if (this.dataSetWriterTransportDataType == null) {
                this.dataSetWriterTransportDataType = new ArrayList<DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>>();
            }
            final DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>> dataSetWriterTransportDataType_Builder = new DataSetWriterTransportDataType.Builder<ListOfDataSetWriterTransportDataType.Builder<_B>>(this, null, false);
            this.dataSetWriterTransportDataType.add(dataSetWriterTransportDataType_Builder);
            return dataSetWriterTransportDataType_Builder;
        }

        @Override
        public ListOfDataSetWriterTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetWriterTransportDataType());
            } else {
                return ((ListOfDataSetWriterTransportDataType) _storedValue);
            }
        }

        public ListOfDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfDataSetWriterTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfDataSetWriterTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetWriterTransportDataType.Selector<ListOfDataSetWriterTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetWriterTransportDataType.Select _root() {
            return new ListOfDataSetWriterTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetWriterTransportDataType.Selector<TRoot, ListOfDataSetWriterTransportDataType.Selector<TRoot, TParent>> dataSetWriterTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetWriterTransportDataType!= null) {
                products.put("dataSetWriterTransportDataType", this.dataSetWriterTransportDataType.init());
            }
            return products;
        }

        public DataSetWriterTransportDataType.Selector<TRoot, ListOfDataSetWriterTransportDataType.Selector<TRoot, TParent>> dataSetWriterTransportDataType() {
            return ((this.dataSetWriterTransportDataType == null)?this.dataSetWriterTransportDataType = new DataSetWriterTransportDataType.Selector<TRoot, ListOfDataSetWriterTransportDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterTransportDataType"):this.dataSetWriterTransportDataType);
        }

    }

}
