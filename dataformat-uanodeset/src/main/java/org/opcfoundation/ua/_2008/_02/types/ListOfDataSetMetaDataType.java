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
 * <p>Java-Klasse für ListOfDataSetMetaDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetMetaDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetMetaDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetMetaDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetMetaDataType", propOrder = {
    "dataSetMetaDataType"
})
public class ListOfDataSetMetaDataType {

    @XmlElement(name = "DataSetMetaDataType", nillable = true)
    protected List<DataSetMetaDataType> dataSetMetaDataType;

    /**
     * Gets the value of the dataSetMetaDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetMetaDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetMetaDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetMetaDataType }
     * 
     * 
     */
    public List<DataSetMetaDataType> getDataSetMetaDataType() {
        if (dataSetMetaDataType == null) {
            dataSetMetaDataType = new ArrayList<DataSetMetaDataType>();
        }
        return this.dataSetMetaDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetMetaDataType.Builder<_B> _other) {
        if (this.dataSetMetaDataType == null) {
            _other.dataSetMetaDataType = null;
        } else {
            _other.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
            for (DataSetMetaDataType _item: this.dataSetMetaDataType) {
                _other.dataSetMetaDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetMetaDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetMetaDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetMetaDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetMetaDataType.Builder<Void> builder() {
        return new ListOfDataSetMetaDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetMetaDataType.Builder<_B> copyOf(final ListOfDataSetMetaDataType _other) {
        final ListOfDataSetMetaDataType.Builder<_B> _newBuilder = new ListOfDataSetMetaDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetMetaDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetMetaDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataTypePropertyTree!= null):((dataSetMetaDataTypePropertyTree == null)||(!dataSetMetaDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetMetaDataType == null) {
                _other.dataSetMetaDataType = null;
            } else {
                _other.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
                for (DataSetMetaDataType _item: this.dataSetMetaDataType) {
                    _other.dataSetMetaDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetMetaDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetMetaDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetMetaDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetMetaDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetMetaDataType.Builder<_B> copyOf(final ListOfDataSetMetaDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetMetaDataType.Builder<_B> _newBuilder = new ListOfDataSetMetaDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetMetaDataType.Builder<Void> copyExcept(final ListOfDataSetMetaDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetMetaDataType.Builder<Void> copyOnly(final ListOfDataSetMetaDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetMetaDataType _storedValue;
        private List<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>> dataSetMetaDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetMetaDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetMetaDataType == null) {
                        this.dataSetMetaDataType = null;
                    } else {
                        this.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
                        for (DataSetMetaDataType _item: _other.dataSetMetaDataType) {
                            this.dataSetMetaDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetMetaDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetMetaDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataTypePropertyTree!= null):((dataSetMetaDataTypePropertyTree == null)||(!dataSetMetaDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetMetaDataType == null) {
                            this.dataSetMetaDataType = null;
                        } else {
                            this.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
                            for (DataSetMetaDataType _item: _other.dataSetMetaDataType) {
                                this.dataSetMetaDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetMetaDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetMetaDataType >_P init(final _P _product) {
            if (this.dataSetMetaDataType!= null) {
                final List<DataSetMetaDataType> dataSetMetaDataType = new ArrayList<DataSetMetaDataType>(this.dataSetMetaDataType.size());
                for (DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>> _item: this.dataSetMetaDataType) {
                    dataSetMetaDataType.add(_item.build());
                }
                _product.dataSetMetaDataType = dataSetMetaDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetMetaDataType" hinzu.
         * 
         * @param dataSetMetaDataType
         *     Werte, die zur Eigenschaft "dataSetMetaDataType" hinzugefügt werden.
         */
        public ListOfDataSetMetaDataType.Builder<_B> addDataSetMetaDataType(final Iterable<? extends DataSetMetaDataType> dataSetMetaDataType) {
            if (dataSetMetaDataType!= null) {
                if (this.dataSetMetaDataType == null) {
                    this.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
                }
                for (DataSetMetaDataType _item: dataSetMetaDataType) {
                    this.dataSetMetaDataType.add(new DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMetaDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataSetMetaDataType
         *     Neuer Wert der Eigenschaft "dataSetMetaDataType".
         */
        public ListOfDataSetMetaDataType.Builder<_B> withDataSetMetaDataType(final Iterable<? extends DataSetMetaDataType> dataSetMetaDataType) {
            if (this.dataSetMetaDataType!= null) {
                this.dataSetMetaDataType.clear();
            }
            return addDataSetMetaDataType(dataSetMetaDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetMetaDataType" hinzu.
         * 
         * @param dataSetMetaDataType
         *     Werte, die zur Eigenschaft "dataSetMetaDataType" hinzugefügt werden.
         */
        public ListOfDataSetMetaDataType.Builder<_B> addDataSetMetaDataType(DataSetMetaDataType... dataSetMetaDataType) {
            addDataSetMetaDataType(Arrays.asList(dataSetMetaDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMetaDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataSetMetaDataType
         *     Neuer Wert der Eigenschaft "dataSetMetaDataType".
         */
        public ListOfDataSetMetaDataType.Builder<_B> withDataSetMetaDataType(DataSetMetaDataType... dataSetMetaDataType) {
            withDataSetMetaDataType(Arrays.asList(dataSetMetaDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetMetaDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetMetaDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetMetaDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetMetaDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DataSetMetaDataType.Builder<? extends ListOfDataSetMetaDataType.Builder<_B>> addDataSetMetaDataType() {
            if (this.dataSetMetaDataType == null) {
                this.dataSetMetaDataType = new ArrayList<DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>>();
            }
            final DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>> dataSetMetaDataType_Builder = new DataSetMetaDataType.Builder<ListOfDataSetMetaDataType.Builder<_B>>(this, null, false);
            this.dataSetMetaDataType.add(dataSetMetaDataType_Builder);
            return dataSetMetaDataType_Builder;
        }

        @Override
        public ListOfDataSetMetaDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetMetaDataType());
            } else {
                return ((ListOfDataSetMetaDataType) _storedValue);
            }
        }

        public ListOfDataSetMetaDataType.Builder<_B> copyOf(final ListOfDataSetMetaDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetMetaDataType.Builder<_B> copyOf(final ListOfDataSetMetaDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetMetaDataType.Selector<ListOfDataSetMetaDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetMetaDataType.Select _root() {
            return new ListOfDataSetMetaDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetMetaDataType.Selector<TRoot, ListOfDataSetMetaDataType.Selector<TRoot, TParent>> dataSetMetaDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetMetaDataType!= null) {
                products.put("dataSetMetaDataType", this.dataSetMetaDataType.init());
            }
            return products;
        }

        public DataSetMetaDataType.Selector<TRoot, ListOfDataSetMetaDataType.Selector<TRoot, TParent>> dataSetMetaDataType() {
            return ((this.dataSetMetaDataType == null)?this.dataSetMetaDataType = new DataSetMetaDataType.Selector<TRoot, ListOfDataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMetaDataType"):this.dataSetMetaDataType);
        }

    }

}
