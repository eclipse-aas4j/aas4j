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
 * <p>Java-Klasse für ListOfDataSetWriterMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetWriterMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetWriterMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetWriterMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetWriterMessageDataType", propOrder = {
    "dataSetWriterMessageDataType"
})
public class ListOfDataSetWriterMessageDataType {

    @XmlElement(name = "DataSetWriterMessageDataType", nillable = true)
    protected List<DataSetWriterMessageDataType> dataSetWriterMessageDataType;

    /**
     * Gets the value of the dataSetWriterMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetWriterMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetWriterMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetWriterMessageDataType }
     * 
     * 
     */
    public List<DataSetWriterMessageDataType> getDataSetWriterMessageDataType() {
        if (dataSetWriterMessageDataType == null) {
            dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType>();
        }
        return this.dataSetWriterMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetWriterMessageDataType.Builder<_B> _other) {
        if (this.dataSetWriterMessageDataType == null) {
            _other.dataSetWriterMessageDataType = null;
        } else {
            _other.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
            for (DataSetWriterMessageDataType _item: this.dataSetWriterMessageDataType) {
                _other.dataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetWriterMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetWriterMessageDataType.Builder<Void> builder() {
        return new ListOfDataSetWriterMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfDataSetWriterMessageDataType _other) {
        final ListOfDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetWriterMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterMessageDataTypePropertyTree!= null):((dataSetWriterMessageDataTypePropertyTree == null)||(!dataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
            if (this.dataSetWriterMessageDataType == null) {
                _other.dataSetWriterMessageDataType = null;
            } else {
                _other.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
                for (DataSetWriterMessageDataType _item: this.dataSetWriterMessageDataType) {
                    _other.dataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, dataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetWriterMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfDataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetWriterMessageDataType.Builder<Void> copyExcept(final ListOfDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetWriterMessageDataType.Builder<Void> copyOnly(final ListOfDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetWriterMessageDataType _storedValue;
        private List<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>> dataSetWriterMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetWriterMessageDataType == null) {
                        this.dataSetWriterMessageDataType = null;
                    } else {
                        this.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
                        for (DataSetWriterMessageDataType _item: _other.dataSetWriterMessageDataType) {
                            this.dataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetWriterMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterMessageDataTypePropertyTree!= null):((dataSetWriterMessageDataTypePropertyTree == null)||(!dataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetWriterMessageDataType == null) {
                            this.dataSetWriterMessageDataType = null;
                        } else {
                            this.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
                            for (DataSetWriterMessageDataType _item: _other.dataSetWriterMessageDataType) {
                                this.dataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, dataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataSetWriterMessageDataType >_P init(final _P _product) {
            if (this.dataSetWriterMessageDataType!= null) {
                final List<DataSetWriterMessageDataType> dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType>(this.dataSetWriterMessageDataType.size());
                for (DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>> _item: this.dataSetWriterMessageDataType) {
                    dataSetWriterMessageDataType.add(_item.build());
                }
                _product.dataSetWriterMessageDataType = dataSetWriterMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterMessageDataType" hinzu.
         * 
         * @param dataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "dataSetWriterMessageDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterMessageDataType.Builder<_B> addDataSetWriterMessageDataType(final Iterable<? extends DataSetWriterMessageDataType> dataSetWriterMessageDataType) {
            if (dataSetWriterMessageDataType!= null) {
                if (this.dataSetWriterMessageDataType == null) {
                    this.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
                }
                for (DataSetWriterMessageDataType _item: dataSetWriterMessageDataType) {
                    this.dataSetWriterMessageDataType.add(new DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterMessageDataType".
         */
        public ListOfDataSetWriterMessageDataType.Builder<_B> withDataSetWriterMessageDataType(final Iterable<? extends DataSetWriterMessageDataType> dataSetWriterMessageDataType) {
            if (this.dataSetWriterMessageDataType!= null) {
                this.dataSetWriterMessageDataType.clear();
            }
            return addDataSetWriterMessageDataType(dataSetWriterMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetWriterMessageDataType" hinzu.
         * 
         * @param dataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "dataSetWriterMessageDataType" hinzugefügt werden.
         */
        public ListOfDataSetWriterMessageDataType.Builder<_B> addDataSetWriterMessageDataType(DataSetWriterMessageDataType... dataSetWriterMessageDataType) {
            addDataSetWriterMessageDataType(Arrays.asList(dataSetWriterMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "dataSetWriterMessageDataType".
         */
        public ListOfDataSetWriterMessageDataType.Builder<_B> withDataSetWriterMessageDataType(DataSetWriterMessageDataType... dataSetWriterMessageDataType) {
            withDataSetWriterMessageDataType(Arrays.asList(dataSetWriterMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataSetWriterMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataSetWriterMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataSetWriterMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DataSetWriterMessageDataType.Builder<? extends ListOfDataSetWriterMessageDataType.Builder<_B>> addDataSetWriterMessageDataType() {
            if (this.dataSetWriterMessageDataType == null) {
                this.dataSetWriterMessageDataType = new ArrayList<DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>>();
            }
            final DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>> dataSetWriterMessageDataType_Builder = new DataSetWriterMessageDataType.Builder<ListOfDataSetWriterMessageDataType.Builder<_B>>(this, null, false);
            this.dataSetWriterMessageDataType.add(dataSetWriterMessageDataType_Builder);
            return dataSetWriterMessageDataType_Builder;
        }

        @Override
        public ListOfDataSetWriterMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetWriterMessageDataType());
            } else {
                return ((ListOfDataSetWriterMessageDataType) _storedValue);
            }
        }

        public ListOfDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfDataSetWriterMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfDataSetWriterMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetWriterMessageDataType.Selector<ListOfDataSetWriterMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetWriterMessageDataType.Select _root() {
            return new ListOfDataSetWriterMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataSetWriterMessageDataType.Selector<TRoot, ListOfDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetWriterMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetWriterMessageDataType!= null) {
                products.put("dataSetWriterMessageDataType", this.dataSetWriterMessageDataType.init());
            }
            return products;
        }

        public DataSetWriterMessageDataType.Selector<TRoot, ListOfDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetWriterMessageDataType() {
            return ((this.dataSetWriterMessageDataType == null)?this.dataSetWriterMessageDataType = new DataSetWriterMessageDataType.Selector<TRoot, ListOfDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterMessageDataType"):this.dataSetWriterMessageDataType);
        }

    }

}
