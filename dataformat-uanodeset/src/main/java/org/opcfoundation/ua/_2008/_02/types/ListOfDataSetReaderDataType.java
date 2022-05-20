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
 * <p>Java-Klasse für ListOfDataSetReaderDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetReaderDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetReaderDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetReaderDataType", propOrder = {
    "dataSetReaderDataType"
})
public class ListOfDataSetReaderDataType {

    @XmlElement(name = "DataSetReaderDataType", nillable = true)
    protected List<DataSetReaderDataType> dataSetReaderDataType;

    /**
     * Gets the value of the dataSetReaderDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetReaderDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetReaderDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetReaderDataType }
     * 
     * 
     */
    public List<DataSetReaderDataType> getDataSetReaderDataType() {
        if (dataSetReaderDataType == null) {
            dataSetReaderDataType = new ArrayList<DataSetReaderDataType>();
        }
        return this.dataSetReaderDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetReaderDataType.Builder<_B> _other) {
        if (this.dataSetReaderDataType == null) {
            _other.dataSetReaderDataType = null;
        } else {
            _other.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
            for (DataSetReaderDataType _item: this.dataSetReaderDataType) {
                _other.dataSetReaderDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetReaderDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetReaderDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetReaderDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetReaderDataType.Builder<Void> builder() {
        return new ListOfDataSetReaderDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetReaderDataType.Builder<_B> copyOf(final ListOfDataSetReaderDataType _other) {
        final ListOfDataSetReaderDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetReaderDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetReaderDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderDataTypePropertyTree!= null):((dataSetReaderDataTypePropertyTree == null)||(!dataSetReaderDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetReaderDataType == null) {
                _other.dataSetReaderDataType = null;
            } else {
                _other.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
                for (DataSetReaderDataType _item: this.dataSetReaderDataType) {
                    _other.dataSetReaderDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetReaderDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetReaderDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetReaderDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetReaderDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetReaderDataType.Builder<_B> copyOf(final ListOfDataSetReaderDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetReaderDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetReaderDataType.Builder<Void> copyExcept(final ListOfDataSetReaderDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetReaderDataType.Builder<Void> copyOnly(final ListOfDataSetReaderDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetReaderDataType _storedValue;
        private List<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>> dataSetReaderDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetReaderDataType == null) {
                        this.dataSetReaderDataType = null;
                    } else {
                        this.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
                        for (DataSetReaderDataType _item: _other.dataSetReaderDataType) {
                            this.dataSetReaderDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetReaderDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderDataTypePropertyTree!= null):((dataSetReaderDataTypePropertyTree == null)||(!dataSetReaderDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetReaderDataType == null) {
                            this.dataSetReaderDataType = null;
                        } else {
                            this.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
                            for (DataSetReaderDataType _item: _other.dataSetReaderDataType) {
                                this.dataSetReaderDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetReaderDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetReaderDataType >_P init(final _P _product) {
            if (this.dataSetReaderDataType!= null) {
                final List<DataSetReaderDataType> dataSetReaderDataType = new ArrayList<DataSetReaderDataType>(this.dataSetReaderDataType.size());
                for (DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>> _item: this.dataSetReaderDataType) {
                    dataSetReaderDataType.add(_item.build());
                }
                _product.dataSetReaderDataType = dataSetReaderDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderDataType" hinzu.
         * 
         * @param dataSetReaderDataType
         *     Werte, die zur Eigenschaft "dataSetReaderDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderDataType.Builder<_B> addDataSetReaderDataType(final Iterable<? extends DataSetReaderDataType> dataSetReaderDataType) {
            if (dataSetReaderDataType!= null) {
                if (this.dataSetReaderDataType == null) {
                    this.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
                }
                for (DataSetReaderDataType _item: dataSetReaderDataType) {
                    this.dataSetReaderDataType.add(new DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderDataType".
         */
        public ListOfDataSetReaderDataType.Builder<_B> withDataSetReaderDataType(final Iterable<? extends DataSetReaderDataType> dataSetReaderDataType) {
            if (this.dataSetReaderDataType!= null) {
                this.dataSetReaderDataType.clear();
            }
            return addDataSetReaderDataType(dataSetReaderDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderDataType" hinzu.
         * 
         * @param dataSetReaderDataType
         *     Werte, die zur Eigenschaft "dataSetReaderDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderDataType.Builder<_B> addDataSetReaderDataType(DataSetReaderDataType... dataSetReaderDataType) {
            addDataSetReaderDataType(Arrays.asList(dataSetReaderDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderDataType".
         */
        public ListOfDataSetReaderDataType.Builder<_B> withDataSetReaderDataType(DataSetReaderDataType... dataSetReaderDataType) {
            withDataSetReaderDataType(Arrays.asList(dataSetReaderDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetReaderDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetReaderDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetReaderDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetReaderDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public DataSetReaderDataType.Builder<? extends ListOfDataSetReaderDataType.Builder<_B>> addDataSetReaderDataType() {
            if (this.dataSetReaderDataType == null) {
                this.dataSetReaderDataType = new ArrayList<DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>>();
            }
            final DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>> dataSetReaderDataType_Builder = new DataSetReaderDataType.Builder<ListOfDataSetReaderDataType.Builder<_B>>(this, null, false);
            this.dataSetReaderDataType.add(dataSetReaderDataType_Builder);
            return dataSetReaderDataType_Builder;
        }

        @Override
        public ListOfDataSetReaderDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetReaderDataType());
            } else {
                return ((ListOfDataSetReaderDataType) _storedValue);
            }
        }

        public ListOfDataSetReaderDataType.Builder<_B> copyOf(final ListOfDataSetReaderDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetReaderDataType.Builder<_B> copyOf(final ListOfDataSetReaderDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetReaderDataType.Selector<ListOfDataSetReaderDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetReaderDataType.Select _root() {
            return new ListOfDataSetReaderDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetReaderDataType.Selector<TRoot, ListOfDataSetReaderDataType.Selector<TRoot, TParent>> dataSetReaderDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetReaderDataType!= null) {
                products.put("dataSetReaderDataType", this.dataSetReaderDataType.init());
            }
            return products;
        }

        public DataSetReaderDataType.Selector<TRoot, ListOfDataSetReaderDataType.Selector<TRoot, TParent>> dataSetReaderDataType() {
            return ((this.dataSetReaderDataType == null)?this.dataSetReaderDataType = new DataSetReaderDataType.Selector<TRoot, ListOfDataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetReaderDataType"):this.dataSetReaderDataType);
        }

    }

}
