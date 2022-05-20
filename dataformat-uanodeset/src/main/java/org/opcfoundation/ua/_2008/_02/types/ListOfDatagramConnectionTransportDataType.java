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
 * <p>Java-Klasse für ListOfDatagramConnectionTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDatagramConnectionTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatagramConnectionTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DatagramConnectionTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDatagramConnectionTransportDataType", propOrder = {
    "datagramConnectionTransportDataType"
})
public class ListOfDatagramConnectionTransportDataType {

    @XmlElement(name = "DatagramConnectionTransportDataType", nillable = true)
    protected List<DatagramConnectionTransportDataType> datagramConnectionTransportDataType;

    /**
     * Gets the value of the datagramConnectionTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datagramConnectionTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatagramConnectionTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatagramConnectionTransportDataType }
     * 
     * 
     */
    public List<DatagramConnectionTransportDataType> getDatagramConnectionTransportDataType() {
        if (datagramConnectionTransportDataType == null) {
            datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType>();
        }
        return this.datagramConnectionTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDatagramConnectionTransportDataType.Builder<_B> _other) {
        if (this.datagramConnectionTransportDataType == null) {
            _other.datagramConnectionTransportDataType = null;
        } else {
            _other.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
            for (DatagramConnectionTransportDataType _item: this.datagramConnectionTransportDataType) {
                _other.datagramConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDatagramConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDatagramConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDatagramConnectionTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDatagramConnectionTransportDataType.Builder<Void> builder() {
        return new ListOfDatagramConnectionTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDatagramConnectionTransportDataType.Builder<_B> copyOf(final ListOfDatagramConnectionTransportDataType _other) {
        final ListOfDatagramConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfDatagramConnectionTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDatagramConnectionTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree datagramConnectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datagramConnectionTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datagramConnectionTransportDataTypePropertyTree!= null):((datagramConnectionTransportDataTypePropertyTree == null)||(!datagramConnectionTransportDataTypePropertyTree.isLeaf())))) {
            if (this.datagramConnectionTransportDataType == null) {
                _other.datagramConnectionTransportDataType = null;
            } else {
                _other.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
                for (DatagramConnectionTransportDataType _item: this.datagramConnectionTransportDataType) {
                    _other.datagramConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, datagramConnectionTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDatagramConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDatagramConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDatagramConnectionTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDatagramConnectionTransportDataType.Builder<_B> copyOf(final ListOfDatagramConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDatagramConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfDatagramConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDatagramConnectionTransportDataType.Builder<Void> copyExcept(final ListOfDatagramConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDatagramConnectionTransportDataType.Builder<Void> copyOnly(final ListOfDatagramConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDatagramConnectionTransportDataType _storedValue;
        private List<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>> datagramConnectionTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfDatagramConnectionTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.datagramConnectionTransportDataType == null) {
                        this.datagramConnectionTransportDataType = null;
                    } else {
                        this.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
                        for (DatagramConnectionTransportDataType _item: _other.datagramConnectionTransportDataType) {
                            this.datagramConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDatagramConnectionTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree datagramConnectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("datagramConnectionTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(datagramConnectionTransportDataTypePropertyTree!= null):((datagramConnectionTransportDataTypePropertyTree == null)||(!datagramConnectionTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.datagramConnectionTransportDataType == null) {
                            this.datagramConnectionTransportDataType = null;
                        } else {
                            this.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
                            for (DatagramConnectionTransportDataType _item: _other.datagramConnectionTransportDataType) {
                                this.datagramConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, datagramConnectionTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDatagramConnectionTransportDataType >_P init(final _P _product) {
            if (this.datagramConnectionTransportDataType!= null) {
                final List<DatagramConnectionTransportDataType> datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType>(this.datagramConnectionTransportDataType.size());
                for (DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>> _item: this.datagramConnectionTransportDataType) {
                    datagramConnectionTransportDataType.add(_item.build());
                }
                _product.datagramConnectionTransportDataType = datagramConnectionTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "datagramConnectionTransportDataType" hinzu.
         * 
         * @param datagramConnectionTransportDataType
         *     Werte, die zur Eigenschaft "datagramConnectionTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfDatagramConnectionTransportDataType.Builder<_B> addDatagramConnectionTransportDataType(final Iterable<? extends DatagramConnectionTransportDataType> datagramConnectionTransportDataType) {
            if (datagramConnectionTransportDataType!= null) {
                if (this.datagramConnectionTransportDataType == null) {
                    this.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
                }
                for (DatagramConnectionTransportDataType _item: datagramConnectionTransportDataType) {
                    this.datagramConnectionTransportDataType.add(new DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "datagramConnectionTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param datagramConnectionTransportDataType
         *     Neuer Wert der Eigenschaft "datagramConnectionTransportDataType".
         */
        public ListOfDatagramConnectionTransportDataType.Builder<_B> withDatagramConnectionTransportDataType(final Iterable<? extends DatagramConnectionTransportDataType> datagramConnectionTransportDataType) {
            if (this.datagramConnectionTransportDataType!= null) {
                this.datagramConnectionTransportDataType.clear();
            }
            return addDatagramConnectionTransportDataType(datagramConnectionTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "datagramConnectionTransportDataType" hinzu.
         * 
         * @param datagramConnectionTransportDataType
         *     Werte, die zur Eigenschaft "datagramConnectionTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfDatagramConnectionTransportDataType.Builder<_B> addDatagramConnectionTransportDataType(DatagramConnectionTransportDataType... datagramConnectionTransportDataType) {
            addDatagramConnectionTransportDataType(Arrays.asList(datagramConnectionTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "datagramConnectionTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param datagramConnectionTransportDataType
         *     Neuer Wert der Eigenschaft "datagramConnectionTransportDataType".
         */
        public ListOfDatagramConnectionTransportDataType.Builder<_B> withDatagramConnectionTransportDataType(DatagramConnectionTransportDataType... datagramConnectionTransportDataType) {
            withDatagramConnectionTransportDataType(Arrays.asList(datagramConnectionTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DatagramConnectionTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DatagramConnectionTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DatagramConnectionTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DatagramConnectionTransportDataType.Builder<? extends ListOfDatagramConnectionTransportDataType.Builder<_B>> addDatagramConnectionTransportDataType() {
            if (this.datagramConnectionTransportDataType == null) {
                this.datagramConnectionTransportDataType = new ArrayList<DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>>();
            }
            final DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>> datagramConnectionTransportDataType_Builder = new DatagramConnectionTransportDataType.Builder<ListOfDatagramConnectionTransportDataType.Builder<_B>>(this, null, false);
            this.datagramConnectionTransportDataType.add(datagramConnectionTransportDataType_Builder);
            return datagramConnectionTransportDataType_Builder;
        }

        @Override
        public ListOfDatagramConnectionTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfDatagramConnectionTransportDataType());
            } else {
                return ((ListOfDatagramConnectionTransportDataType) _storedValue);
            }
        }

        public ListOfDatagramConnectionTransportDataType.Builder<_B> copyOf(final ListOfDatagramConnectionTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDatagramConnectionTransportDataType.Builder<_B> copyOf(final ListOfDatagramConnectionTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDatagramConnectionTransportDataType.Selector<ListOfDatagramConnectionTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDatagramConnectionTransportDataType.Select _root() {
            return new ListOfDatagramConnectionTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DatagramConnectionTransportDataType.Selector<TRoot, ListOfDatagramConnectionTransportDataType.Selector<TRoot, TParent>> datagramConnectionTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.datagramConnectionTransportDataType!= null) {
                products.put("datagramConnectionTransportDataType", this.datagramConnectionTransportDataType.init());
            }
            return products;
        }

        public DatagramConnectionTransportDataType.Selector<TRoot, ListOfDatagramConnectionTransportDataType.Selector<TRoot, TParent>> datagramConnectionTransportDataType() {
            return ((this.datagramConnectionTransportDataType == null)?this.datagramConnectionTransportDataType = new DatagramConnectionTransportDataType.Selector<TRoot, ListOfDatagramConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "datagramConnectionTransportDataType"):this.datagramConnectionTransportDataType);
        }

    }

}
