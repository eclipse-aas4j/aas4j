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
 * <p>Java-Klasse für ListOfDatagramWriterGroupTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDatagramWriterGroupTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatagramWriterGroupTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DatagramWriterGroupTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDatagramWriterGroupTransportDataType", propOrder = {
    "datagramWriterGroupTransportDataType"
})
public class ListOfDatagramWriterGroupTransportDataType {

    @XmlElement(name = "DatagramWriterGroupTransportDataType", nillable = true)
    protected List<DatagramWriterGroupTransportDataType> datagramWriterGroupTransportDataType;

    /**
     * Gets the value of the datagramWriterGroupTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datagramWriterGroupTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatagramWriterGroupTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatagramWriterGroupTransportDataType }
     * 
     * 
     */
    public List<DatagramWriterGroupTransportDataType> getDatagramWriterGroupTransportDataType() {
        if (datagramWriterGroupTransportDataType == null) {
            datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType>();
        }
        return this.datagramWriterGroupTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDatagramWriterGroupTransportDataType.Builder<_B> _other) {
        if (this.datagramWriterGroupTransportDataType == null) {
            _other.datagramWriterGroupTransportDataType = null;
        } else {
            _other.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
            for (DatagramWriterGroupTransportDataType _item: this.datagramWriterGroupTransportDataType) {
                _other.datagramWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDatagramWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDatagramWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDatagramWriterGroupTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDatagramWriterGroupTransportDataType.Builder<Void> builder() {
        return new ListOfDatagramWriterGroupTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDatagramWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfDatagramWriterGroupTransportDataType _other) {
        final ListOfDatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfDatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDatagramWriterGroupTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree datagramWriterGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datagramWriterGroupTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datagramWriterGroupTransportDataTypePropertyTree!= null):((datagramWriterGroupTransportDataTypePropertyTree == null)||(!datagramWriterGroupTransportDataTypePropertyTree.isLeaf())))) {
            if (this.datagramWriterGroupTransportDataType == null) {
                _other.datagramWriterGroupTransportDataType = null;
            } else {
                _other.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
                for (DatagramWriterGroupTransportDataType _item: this.datagramWriterGroupTransportDataType) {
                    _other.datagramWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, datagramWriterGroupTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDatagramWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDatagramWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDatagramWriterGroupTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDatagramWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfDatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfDatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDatagramWriterGroupTransportDataType.Builder<Void> copyExcept(final ListOfDatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDatagramWriterGroupTransportDataType.Builder<Void> copyOnly(final ListOfDatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDatagramWriterGroupTransportDataType _storedValue;
        private List<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>> datagramWriterGroupTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfDatagramWriterGroupTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.datagramWriterGroupTransportDataType == null) {
                        this.datagramWriterGroupTransportDataType = null;
                    } else {
                        this.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
                        for (DatagramWriterGroupTransportDataType _item: _other.datagramWriterGroupTransportDataType) {
                            this.datagramWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDatagramWriterGroupTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree datagramWriterGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datagramWriterGroupTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datagramWriterGroupTransportDataTypePropertyTree!= null):((datagramWriterGroupTransportDataTypePropertyTree == null)||(!datagramWriterGroupTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.datagramWriterGroupTransportDataType == null) {
                            this.datagramWriterGroupTransportDataType = null;
                        } else {
                            this.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
                            for (DatagramWriterGroupTransportDataType _item: _other.datagramWriterGroupTransportDataType) {
                                this.datagramWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, datagramWriterGroupTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDatagramWriterGroupTransportDataType >_P init(final _P _product) {
            if (this.datagramWriterGroupTransportDataType!= null) {
                final List<DatagramWriterGroupTransportDataType> datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType>(this.datagramWriterGroupTransportDataType.size());
                for (DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>> _item: this.datagramWriterGroupTransportDataType) {
                    datagramWriterGroupTransportDataType.add(_item.build());
                }
                _product.datagramWriterGroupTransportDataType = datagramWriterGroupTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "datagramWriterGroupTransportDataType" hinzu.
         * 
         * @param datagramWriterGroupTransportDataType
         *     Werte, die zur Eigenschaft "datagramWriterGroupTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> addDatagramWriterGroupTransportDataType(final Iterable<? extends DatagramWriterGroupTransportDataType> datagramWriterGroupTransportDataType) {
            if (datagramWriterGroupTransportDataType!= null) {
                if (this.datagramWriterGroupTransportDataType == null) {
                    this.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
                }
                for (DatagramWriterGroupTransportDataType _item: datagramWriterGroupTransportDataType) {
                    this.datagramWriterGroupTransportDataType.add(new DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "datagramWriterGroupTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param datagramWriterGroupTransportDataType
         *     Neuer Wert der Eigenschaft "datagramWriterGroupTransportDataType".
         */
        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> withDatagramWriterGroupTransportDataType(final Iterable<? extends DatagramWriterGroupTransportDataType> datagramWriterGroupTransportDataType) {
            if (this.datagramWriterGroupTransportDataType!= null) {
                this.datagramWriterGroupTransportDataType.clear();
            }
            return addDatagramWriterGroupTransportDataType(datagramWriterGroupTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "datagramWriterGroupTransportDataType" hinzu.
         * 
         * @param datagramWriterGroupTransportDataType
         *     Werte, die zur Eigenschaft "datagramWriterGroupTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> addDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType... datagramWriterGroupTransportDataType) {
            addDatagramWriterGroupTransportDataType(Arrays.asList(datagramWriterGroupTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "datagramWriterGroupTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param datagramWriterGroupTransportDataType
         *     Neuer Wert der Eigenschaft "datagramWriterGroupTransportDataType".
         */
        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> withDatagramWriterGroupTransportDataType(DatagramWriterGroupTransportDataType... datagramWriterGroupTransportDataType) {
            withDatagramWriterGroupTransportDataType(Arrays.asList(datagramWriterGroupTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DatagramWriterGroupTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DatagramWriterGroupTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DatagramWriterGroupTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DatagramWriterGroupTransportDataType.Builder<? extends ListOfDatagramWriterGroupTransportDataType.Builder<_B>> addDatagramWriterGroupTransportDataType() {
            if (this.datagramWriterGroupTransportDataType == null) {
                this.datagramWriterGroupTransportDataType = new ArrayList<DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>>();
            }
            final DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>> datagramWriterGroupTransportDataType_Builder = new DatagramWriterGroupTransportDataType.Builder<ListOfDatagramWriterGroupTransportDataType.Builder<_B>>(this, null, false);
            this.datagramWriterGroupTransportDataType.add(datagramWriterGroupTransportDataType_Builder);
            return datagramWriterGroupTransportDataType_Builder;
        }

        @Override
        public ListOfDatagramWriterGroupTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDatagramWriterGroupTransportDataType());
            } else {
                return ((ListOfDatagramWriterGroupTransportDataType) _storedValue);
            }
        }

        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfDatagramWriterGroupTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDatagramWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfDatagramWriterGroupTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDatagramWriterGroupTransportDataType.Selector<ListOfDatagramWriterGroupTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDatagramWriterGroupTransportDataType.Select _root() {
            return new ListOfDatagramWriterGroupTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DatagramWriterGroupTransportDataType.Selector<TRoot, ListOfDatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> datagramWriterGroupTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.datagramWriterGroupTransportDataType!= null) {
                products.put("datagramWriterGroupTransportDataType", this.datagramWriterGroupTransportDataType.init());
            }
            return products;
        }

        public DatagramWriterGroupTransportDataType.Selector<TRoot, ListOfDatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> datagramWriterGroupTransportDataType() {
            return ((this.datagramWriterGroupTransportDataType == null)?this.datagramWriterGroupTransportDataType = new DatagramWriterGroupTransportDataType.Selector<TRoot, ListOfDatagramWriterGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "datagramWriterGroupTransportDataType"):this.datagramWriterGroupTransportDataType);
        }

    }

}
