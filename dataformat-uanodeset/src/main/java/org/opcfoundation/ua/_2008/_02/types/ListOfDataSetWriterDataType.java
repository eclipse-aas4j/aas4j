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
 * <p>Java-Klasse für ListOfDataSetWriterDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetWriterDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetWriterDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetWriterDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetWriterDataType", propOrder = {
    "dataSetWriterDataType"
})
public class ListOfDataSetWriterDataType {

    @XmlElement(name = "DataSetWriterDataType", nillable = true)
    protected List<DataSetWriterDataType> dataSetWriterDataType;

    /**
     * Gets the value of the dataSetWriterDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetWriterDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetWriterDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetWriterDataType }
     * 
     * 
     */
    public List<DataSetWriterDataType> getDataSetWriterDataType() {
        if (dataSetWriterDataType == null) {
            dataSetWriterDataType = new ArrayList<DataSetWriterDataType>();
        }
        return this.dataSetWriterDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetWriterDataType.Builder<_B> _other) {
        if (this.dataSetWriterDataType == null) {
            _other.dataSetWriterDataType = null;
        } else {
            _other.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
            for (DataSetWriterDataType _item: this.dataSetWriterDataType) {
                _other.dataSetWriterDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetWriterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetWriterDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetWriterDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetWriterDataType.Builder<Void> builder() {
        return new ListOfDataSetWriterDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetWriterDataType.Builder<_B> copyOf(final ListOfDataSetWriterDataType _other) {
        final ListOfDataSetWriterDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetWriterDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetWriterDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterDataTypePropertyTree!= null):((dataSetWriterDataTypePropertyTree == null)||(!dataSetWriterDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetWriterDataType == null) {
                _other.dataSetWriterDataType = null;
            } else {
                _other.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
                for (DataSetWriterDataType _item: this.dataSetWriterDataType) {
                    _other.dataSetWriterDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetWriterDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetWriterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetWriterDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetWriterDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetWriterDataType.Builder<_B> copyOf(final ListOfDataSetWriterDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetWriterDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetWriterDataType.Builder<Void> copyExcept(final ListOfDataSetWriterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetWriterDataType.Builder<Void> copyOnly(final ListOfDataSetWriterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetWriterDataType _storedValue;
        private List<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>> dataSetWriterDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetWriterDataType == null) {
                        this.dataSetWriterDataType = null;
                    } else {
                        this.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
                        for (DataSetWriterDataType _item: _other.dataSetWriterDataType) {
                            this.dataSetWriterDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetWriterDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterDataTypePropertyTree!= null):((dataSetWriterDataTypePropertyTree == null)||(!dataSetWriterDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetWriterDataType == null) {
                            this.dataSetWriterDataType = null;
                        } else {
                            this.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
                            for (DataSetWriterDataType _item: _other.dataSetWriterDataType) {
                                this.dataSetWriterDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetWriterDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetWriterDataType >_P init(final _P _product) {
            if (this.dataSetWriterDataType!= null) {
                final List<DataSetWriterDataType> dataSetWriterDataType = new ArrayList<DataSetWriterDataType>(this.dataSetWriterDataType.size());
                for (DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>> _item: this.dataSetWriterDataType) {
                    dataSetWriterDataType.add(_item.build());
                }
                _product.dataSetWriterDataType = dataSetWriterDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterDataType" hinzu.
         * 
         * @param dataSetWriterDataType
         *     Werte, die zur Eigenschaft "dataSetWriterDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterDataType.Builder<_B> addDataSetWriterDataType(final Iterable<? extends DataSetWriterDataType> dataSetWriterDataType) {
            if (dataSetWriterDataType!= null) {
                if (this.dataSetWriterDataType == null) {
                    this.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
                }
                for (DataSetWriterDataType _item: dataSetWriterDataType) {
                    this.dataSetWriterDataType.add(new DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterDataType".
         */
        public ListOfDataSetWriterDataType.Builder<_B> withDataSetWriterDataType(final Iterable<? extends DataSetWriterDataType> dataSetWriterDataType) {
            if (this.dataSetWriterDataType!= null) {
                this.dataSetWriterDataType.clear();
            }
            return addDataSetWriterDataType(dataSetWriterDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterDataType" hinzu.
         * 
         * @param dataSetWriterDataType
         *     Werte, die zur Eigenschaft "dataSetWriterDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterDataType.Builder<_B> addDataSetWriterDataType(DataSetWriterDataType... dataSetWriterDataType) {
            addDataSetWriterDataType(Arrays.asList(dataSetWriterDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterDataType".
         */
        public ListOfDataSetWriterDataType.Builder<_B> withDataSetWriterDataType(DataSetWriterDataType... dataSetWriterDataType) {
            withDataSetWriterDataType(Arrays.asList(dataSetWriterDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetWriterDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetWriterDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetWriterDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetWriterDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public DataSetWriterDataType.Builder<? extends ListOfDataSetWriterDataType.Builder<_B>> addDataSetWriterDataType() {
            if (this.dataSetWriterDataType == null) {
                this.dataSetWriterDataType = new ArrayList<DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>>();
            }
            final DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>> dataSetWriterDataType_Builder = new DataSetWriterDataType.Builder<ListOfDataSetWriterDataType.Builder<_B>>(this, null, false);
            this.dataSetWriterDataType.add(dataSetWriterDataType_Builder);
            return dataSetWriterDataType_Builder;
        }

        @Override
        public ListOfDataSetWriterDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetWriterDataType());
            } else {
                return ((ListOfDataSetWriterDataType) _storedValue);
            }
        }

        public ListOfDataSetWriterDataType.Builder<_B> copyOf(final ListOfDataSetWriterDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetWriterDataType.Builder<_B> copyOf(final ListOfDataSetWriterDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetWriterDataType.Selector<ListOfDataSetWriterDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetWriterDataType.Select _root() {
            return new ListOfDataSetWriterDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetWriterDataType.Selector<TRoot, ListOfDataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetWriterDataType!= null) {
                products.put("dataSetWriterDataType", this.dataSetWriterDataType.init());
            }
            return products;
        }

        public DataSetWriterDataType.Selector<TRoot, ListOfDataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterDataType() {
            return ((this.dataSetWriterDataType == null)?this.dataSetWriterDataType = new DataSetWriterDataType.Selector<TRoot, ListOfDataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterDataType"):this.dataSetWriterDataType);
        }

    }

}
