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
 * <p>Java-Klasse für ListOfDataSetReaderMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetReaderMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetReaderMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetReaderMessageDataType", propOrder = {
    "dataSetReaderMessageDataType"
})
public class ListOfDataSetReaderMessageDataType {

    @XmlElement(name = "DataSetReaderMessageDataType", nillable = true)
    protected List<DataSetReaderMessageDataType> dataSetReaderMessageDataType;

    /**
     * Gets the value of the dataSetReaderMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetReaderMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetReaderMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetReaderMessageDataType }
     * 
     * 
     */
    public List<DataSetReaderMessageDataType> getDataSetReaderMessageDataType() {
        if (dataSetReaderMessageDataType == null) {
            dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType>();
        }
        return this.dataSetReaderMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetReaderMessageDataType.Builder<_B> _other) {
        if (this.dataSetReaderMessageDataType == null) {
            _other.dataSetReaderMessageDataType = null;
        } else {
            _other.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
            for (DataSetReaderMessageDataType _item: this.dataSetReaderMessageDataType) {
                _other.dataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetReaderMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetReaderMessageDataType.Builder<Void> builder() {
        return new ListOfDataSetReaderMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfDataSetReaderMessageDataType _other) {
        final ListOfDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetReaderMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderMessageDataTypePropertyTree!= null):((dataSetReaderMessageDataTypePropertyTree == null)||(!dataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetReaderMessageDataType == null) {
                _other.dataSetReaderMessageDataType = null;
            } else {
                _other.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
                for (DataSetReaderMessageDataType _item: this.dataSetReaderMessageDataType) {
                    _other.dataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetReaderMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfDataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetReaderMessageDataType.Builder<Void> copyExcept(final ListOfDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetReaderMessageDataType.Builder<Void> copyOnly(final ListOfDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetReaderMessageDataType _storedValue;
        private List<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>> dataSetReaderMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetReaderMessageDataType == null) {
                        this.dataSetReaderMessageDataType = null;
                    } else {
                        this.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
                        for (DataSetReaderMessageDataType _item: _other.dataSetReaderMessageDataType) {
                            this.dataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetReaderMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderMessageDataTypePropertyTree!= null):((dataSetReaderMessageDataTypePropertyTree == null)||(!dataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetReaderMessageDataType == null) {
                            this.dataSetReaderMessageDataType = null;
                        } else {
                            this.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
                            for (DataSetReaderMessageDataType _item: _other.dataSetReaderMessageDataType) {
                                this.dataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetReaderMessageDataType >_P init(final _P _product) {
            if (this.dataSetReaderMessageDataType!= null) {
                final List<DataSetReaderMessageDataType> dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType>(this.dataSetReaderMessageDataType.size());
                for (DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>> _item: this.dataSetReaderMessageDataType) {
                    dataSetReaderMessageDataType.add(_item.build());
                }
                _product.dataSetReaderMessageDataType = dataSetReaderMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderMessageDataType" hinzu.
         * 
         * @param dataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "dataSetReaderMessageDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderMessageDataType.Builder<_B> addDataSetReaderMessageDataType(final Iterable<? extends DataSetReaderMessageDataType> dataSetReaderMessageDataType) {
            if (dataSetReaderMessageDataType!= null) {
                if (this.dataSetReaderMessageDataType == null) {
                    this.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
                }
                for (DataSetReaderMessageDataType _item: dataSetReaderMessageDataType) {
                    this.dataSetReaderMessageDataType.add(new DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderMessageDataType".
         */
        public ListOfDataSetReaderMessageDataType.Builder<_B> withDataSetReaderMessageDataType(final Iterable<? extends DataSetReaderMessageDataType> dataSetReaderMessageDataType) {
            if (this.dataSetReaderMessageDataType!= null) {
                this.dataSetReaderMessageDataType.clear();
            }
            return addDataSetReaderMessageDataType(dataSetReaderMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetReaderMessageDataType" hinzu.
         * 
         * @param dataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "dataSetReaderMessageDataType" hinzugefügt werden.
         */
        public ListOfDataSetReaderMessageDataType.Builder<_B> addDataSetReaderMessageDataType(DataSetReaderMessageDataType... dataSetReaderMessageDataType) {
            addDataSetReaderMessageDataType(Arrays.asList(dataSetReaderMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "dataSetReaderMessageDataType".
         */
        public ListOfDataSetReaderMessageDataType.Builder<_B> withDataSetReaderMessageDataType(DataSetReaderMessageDataType... dataSetReaderMessageDataType) {
            withDataSetReaderMessageDataType(Arrays.asList(dataSetReaderMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetReaderMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetReaderMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetReaderMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DataSetReaderMessageDataType.Builder<? extends ListOfDataSetReaderMessageDataType.Builder<_B>> addDataSetReaderMessageDataType() {
            if (this.dataSetReaderMessageDataType == null) {
                this.dataSetReaderMessageDataType = new ArrayList<DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>>();
            }
            final DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>> dataSetReaderMessageDataType_Builder = new DataSetReaderMessageDataType.Builder<ListOfDataSetReaderMessageDataType.Builder<_B>>(this, null, false);
            this.dataSetReaderMessageDataType.add(dataSetReaderMessageDataType_Builder);
            return dataSetReaderMessageDataType_Builder;
        }

        @Override
        public ListOfDataSetReaderMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetReaderMessageDataType());
            } else {
                return ((ListOfDataSetReaderMessageDataType) _storedValue);
            }
        }

        public ListOfDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfDataSetReaderMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfDataSetReaderMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetReaderMessageDataType.Selector<ListOfDataSetReaderMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetReaderMessageDataType.Select _root() {
            return new ListOfDataSetReaderMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetReaderMessageDataType.Selector<TRoot, ListOfDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetReaderMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetReaderMessageDataType!= null) {
                products.put("dataSetReaderMessageDataType", this.dataSetReaderMessageDataType.init());
            }
            return products;
        }

        public DataSetReaderMessageDataType.Selector<TRoot, ListOfDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetReaderMessageDataType() {
            return ((this.dataSetReaderMessageDataType == null)?this.dataSetReaderMessageDataType = new DataSetReaderMessageDataType.Selector<TRoot, ListOfDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetReaderMessageDataType"):this.dataSetReaderMessageDataType);
        }

    }

}
