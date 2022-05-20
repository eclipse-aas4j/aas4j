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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfDataSetOrderingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetOrderingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetOrderingType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetOrderingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetOrderingType", propOrder = {
    "dataSetOrderingType"
})
public class ListOfDataSetOrderingType {

    @XmlElement(name = "DataSetOrderingType")
    @XmlSchemaType(name = "string")
    protected List<DataSetOrderingType> dataSetOrderingType;

    /**
     * Gets the value of the dataSetOrderingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetOrderingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetOrderingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetOrderingType }
     * 
     * 
     */
    public List<DataSetOrderingType> getDataSetOrderingType() {
        if (dataSetOrderingType == null) {
            dataSetOrderingType = new ArrayList<DataSetOrderingType>();
        }
        return this.dataSetOrderingType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetOrderingType.Builder<_B> _other) {
        if (this.dataSetOrderingType == null) {
            _other.dataSetOrderingType = null;
        } else {
            _other.dataSetOrderingType = new ArrayList<Buildable>();
            for (DataSetOrderingType _item: this.dataSetOrderingType) {
                _other.dataSetOrderingType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfDataSetOrderingType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetOrderingType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetOrderingType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetOrderingType.Builder<Void> builder() {
        return new ListOfDataSetOrderingType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetOrderingType.Builder<_B> copyOf(final ListOfDataSetOrderingType _other) {
        final ListOfDataSetOrderingType.Builder<_B> _newBuilder = new ListOfDataSetOrderingType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetOrderingType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetOrderingTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOrderingType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOrderingTypePropertyTree!= null):((dataSetOrderingTypePropertyTree == null)||(!dataSetOrderingTypePropertyTree.isLeaf())))) {
            if (this.dataSetOrderingType == null) {
                _other.dataSetOrderingType = null;
            } else {
                _other.dataSetOrderingType = new ArrayList<Buildable>();
                for (DataSetOrderingType _item: this.dataSetOrderingType) {
                    _other.dataSetOrderingType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfDataSetOrderingType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetOrderingType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetOrderingType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetOrderingType.Builder<_B> copyOf(final ListOfDataSetOrderingType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetOrderingType.Builder<_B> _newBuilder = new ListOfDataSetOrderingType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetOrderingType.Builder<Void> copyExcept(final ListOfDataSetOrderingType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetOrderingType.Builder<Void> copyOnly(final ListOfDataSetOrderingType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetOrderingType _storedValue;
        private List<Buildable> dataSetOrderingType;

        public Builder(final _B _parentBuilder, final ListOfDataSetOrderingType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetOrderingType == null) {
                        this.dataSetOrderingType = null;
                    } else {
                        this.dataSetOrderingType = new ArrayList<Buildable>();
                        for (DataSetOrderingType _item: _other.dataSetOrderingType) {
                            this.dataSetOrderingType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetOrderingType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetOrderingTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOrderingType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOrderingTypePropertyTree!= null):((dataSetOrderingTypePropertyTree == null)||(!dataSetOrderingTypePropertyTree.isLeaf())))) {
                        if (_other.dataSetOrderingType == null) {
                            this.dataSetOrderingType = null;
                        } else {
                            this.dataSetOrderingType = new ArrayList<Buildable>();
                            for (DataSetOrderingType _item: _other.dataSetOrderingType) {
                                this.dataSetOrderingType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfDataSetOrderingType >_P init(final _P _product) {
            if (this.dataSetOrderingType!= null) {
                final List<DataSetOrderingType> dataSetOrderingType = new ArrayList<DataSetOrderingType>(this.dataSetOrderingType.size());
                for (Buildable _item: this.dataSetOrderingType) {
                    dataSetOrderingType.add(((DataSetOrderingType) _item.build()));
                }
                _product.dataSetOrderingType = dataSetOrderingType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetOrderingType" hinzu.
         * 
         * @param dataSetOrderingType
         *     Werte, die zur Eigenschaft "dataSetOrderingType" hinzugefügt werden.
         */
        public ListOfDataSetOrderingType.Builder<_B> addDataSetOrderingType(final Iterable<? extends DataSetOrderingType> dataSetOrderingType) {
            if (dataSetOrderingType!= null) {
                if (this.dataSetOrderingType == null) {
                    this.dataSetOrderingType = new ArrayList<Buildable>();
                }
                for (DataSetOrderingType _item: dataSetOrderingType) {
                    this.dataSetOrderingType.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetOrderingType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataSetOrderingType
         *     Neuer Wert der Eigenschaft "dataSetOrderingType".
         */
        public ListOfDataSetOrderingType.Builder<_B> withDataSetOrderingType(final Iterable<? extends DataSetOrderingType> dataSetOrderingType) {
            if (this.dataSetOrderingType!= null) {
                this.dataSetOrderingType.clear();
            }
            return addDataSetOrderingType(dataSetOrderingType);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetOrderingType" hinzu.
         * 
         * @param dataSetOrderingType
         *     Werte, die zur Eigenschaft "dataSetOrderingType" hinzugefügt werden.
         */
        public ListOfDataSetOrderingType.Builder<_B> addDataSetOrderingType(DataSetOrderingType... dataSetOrderingType) {
            addDataSetOrderingType(Arrays.asList(dataSetOrderingType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetOrderingType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataSetOrderingType
         *     Neuer Wert der Eigenschaft "dataSetOrderingType".
         */
        public ListOfDataSetOrderingType.Builder<_B> withDataSetOrderingType(DataSetOrderingType... dataSetOrderingType) {
            withDataSetOrderingType(Arrays.asList(dataSetOrderingType));
            return this;
        }

        @Override
        public ListOfDataSetOrderingType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetOrderingType());
            } else {
                return ((ListOfDataSetOrderingType) _storedValue);
            }
        }

        public ListOfDataSetOrderingType.Builder<_B> copyOf(final ListOfDataSetOrderingType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetOrderingType.Builder<_B> copyOf(final ListOfDataSetOrderingType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetOrderingType.Selector<ListOfDataSetOrderingType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetOrderingType.Select _root() {
            return new ListOfDataSetOrderingType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetOrderingType.Selector<TRoot, TParent>> dataSetOrderingType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetOrderingType!= null) {
                products.put("dataSetOrderingType", this.dataSetOrderingType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetOrderingType.Selector<TRoot, TParent>> dataSetOrderingType() {
            return ((this.dataSetOrderingType == null)?this.dataSetOrderingType = new com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetOrderingType.Selector<TRoot, TParent>>(this._root, this, "dataSetOrderingType"):this.dataSetOrderingType);
        }

    }

}
