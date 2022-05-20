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
 * <p>Java-Klasse für ListOfBrokerDataSetReaderTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrokerDataSetReaderTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrokerDataSetReaderTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerDataSetReaderTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrokerDataSetReaderTransportDataType", propOrder = {
    "brokerDataSetReaderTransportDataType"
})
public class ListOfBrokerDataSetReaderTransportDataType {

    @XmlElement(name = "BrokerDataSetReaderTransportDataType", nillable = true)
    protected List<BrokerDataSetReaderTransportDataType> brokerDataSetReaderTransportDataType;

    /**
     * Gets the value of the brokerDataSetReaderTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerDataSetReaderTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerDataSetReaderTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerDataSetReaderTransportDataType }
     * 
     * 
     */
    public List<BrokerDataSetReaderTransportDataType> getBrokerDataSetReaderTransportDataType() {
        if (brokerDataSetReaderTransportDataType == null) {
            brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType>();
        }
        return this.brokerDataSetReaderTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrokerDataSetReaderTransportDataType.Builder<_B> _other) {
        if (this.brokerDataSetReaderTransportDataType == null) {
            _other.brokerDataSetReaderTransportDataType = null;
        } else {
            _other.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
            for (BrokerDataSetReaderTransportDataType _item: this.brokerDataSetReaderTransportDataType) {
                _other.brokerDataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrokerDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrokerDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrokerDataSetReaderTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrokerDataSetReaderTransportDataType.Builder<Void> builder() {
        return new ListOfBrokerDataSetReaderTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetReaderTransportDataType _other) {
        final ListOfBrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrokerDataSetReaderTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree brokerDataSetReaderTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerDataSetReaderTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerDataSetReaderTransportDataTypePropertyTree!= null):((brokerDataSetReaderTransportDataTypePropertyTree == null)||(!brokerDataSetReaderTransportDataTypePropertyTree.isLeaf())))) {
            if (this.brokerDataSetReaderTransportDataType == null) {
                _other.brokerDataSetReaderTransportDataType = null;
            } else {
                _other.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
                for (BrokerDataSetReaderTransportDataType _item: this.brokerDataSetReaderTransportDataType) {
                    _other.brokerDataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, brokerDataSetReaderTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrokerDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrokerDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrokerDataSetReaderTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrokerDataSetReaderTransportDataType.Builder<Void> copyExcept(final ListOfBrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrokerDataSetReaderTransportDataType.Builder<Void> copyOnly(final ListOfBrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrokerDataSetReaderTransportDataType _storedValue;
        private List<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>> brokerDataSetReaderTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfBrokerDataSetReaderTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.brokerDataSetReaderTransportDataType == null) {
                        this.brokerDataSetReaderTransportDataType = null;
                    } else {
                        this.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
                        for (BrokerDataSetReaderTransportDataType _item: _other.brokerDataSetReaderTransportDataType) {
                            this.brokerDataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrokerDataSetReaderTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree brokerDataSetReaderTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerDataSetReaderTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerDataSetReaderTransportDataTypePropertyTree!= null):((brokerDataSetReaderTransportDataTypePropertyTree == null)||(!brokerDataSetReaderTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.brokerDataSetReaderTransportDataType == null) {
                            this.brokerDataSetReaderTransportDataType = null;
                        } else {
                            this.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
                            for (BrokerDataSetReaderTransportDataType _item: _other.brokerDataSetReaderTransportDataType) {
                                this.brokerDataSetReaderTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, brokerDataSetReaderTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrokerDataSetReaderTransportDataType >_P init(final _P _product) {
            if (this.brokerDataSetReaderTransportDataType!= null) {
                final List<BrokerDataSetReaderTransportDataType> brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType>(this.brokerDataSetReaderTransportDataType.size());
                for (BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>> _item: this.brokerDataSetReaderTransportDataType) {
                    brokerDataSetReaderTransportDataType.add(_item.build());
                }
                _product.brokerDataSetReaderTransportDataType = brokerDataSetReaderTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerDataSetReaderTransportDataType" hinzu.
         * 
         * @param brokerDataSetReaderTransportDataType
         *     Werte, die zur Eigenschaft "brokerDataSetReaderTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> addBrokerDataSetReaderTransportDataType(final Iterable<? extends BrokerDataSetReaderTransportDataType> brokerDataSetReaderTransportDataType) {
            if (brokerDataSetReaderTransportDataType!= null) {
                if (this.brokerDataSetReaderTransportDataType == null) {
                    this.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
                }
                for (BrokerDataSetReaderTransportDataType _item: brokerDataSetReaderTransportDataType) {
                    this.brokerDataSetReaderTransportDataType.add(new BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerDataSetReaderTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerDataSetReaderTransportDataType
         *     Neuer Wert der Eigenschaft "brokerDataSetReaderTransportDataType".
         */
        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> withBrokerDataSetReaderTransportDataType(final Iterable<? extends BrokerDataSetReaderTransportDataType> brokerDataSetReaderTransportDataType) {
            if (this.brokerDataSetReaderTransportDataType!= null) {
                this.brokerDataSetReaderTransportDataType.clear();
            }
            return addBrokerDataSetReaderTransportDataType(brokerDataSetReaderTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerDataSetReaderTransportDataType" hinzu.
         * 
         * @param brokerDataSetReaderTransportDataType
         *     Werte, die zur Eigenschaft "brokerDataSetReaderTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> addBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType... brokerDataSetReaderTransportDataType) {
            addBrokerDataSetReaderTransportDataType(Arrays.asList(brokerDataSetReaderTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerDataSetReaderTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerDataSetReaderTransportDataType
         *     Neuer Wert der Eigenschaft "brokerDataSetReaderTransportDataType".
         */
        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> withBrokerDataSetReaderTransportDataType(BrokerDataSetReaderTransportDataType... brokerDataSetReaderTransportDataType) {
            withBrokerDataSetReaderTransportDataType(Arrays.asList(brokerDataSetReaderTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrokerDataSetReaderTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrokerDataSetReaderTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.BrokerDataSetReaderTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrokerDataSetReaderTransportDataType.Builder<? extends ListOfBrokerDataSetReaderTransportDataType.Builder<_B>> addBrokerDataSetReaderTransportDataType() {
            if (this.brokerDataSetReaderTransportDataType == null) {
                this.brokerDataSetReaderTransportDataType = new ArrayList<BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>>();
            }
            final BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>> brokerDataSetReaderTransportDataType_Builder = new BrokerDataSetReaderTransportDataType.Builder<ListOfBrokerDataSetReaderTransportDataType.Builder<_B>>(this, null, false);
            this.brokerDataSetReaderTransportDataType.add(brokerDataSetReaderTransportDataType_Builder);
            return brokerDataSetReaderTransportDataType_Builder;
        }

        @Override
        public ListOfBrokerDataSetReaderTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrokerDataSetReaderTransportDataType());
            } else {
                return ((ListOfBrokerDataSetReaderTransportDataType) _storedValue);
            }
        }

        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetReaderTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetReaderTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrokerDataSetReaderTransportDataType.Selector<ListOfBrokerDataSetReaderTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrokerDataSetReaderTransportDataType.Select _root() {
            return new ListOfBrokerDataSetReaderTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrokerDataSetReaderTransportDataType.Selector<TRoot, ListOfBrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> brokerDataSetReaderTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.brokerDataSetReaderTransportDataType!= null) {
                products.put("brokerDataSetReaderTransportDataType", this.brokerDataSetReaderTransportDataType.init());
            }
            return products;
        }

        public BrokerDataSetReaderTransportDataType.Selector<TRoot, ListOfBrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> brokerDataSetReaderTransportDataType() {
            return ((this.brokerDataSetReaderTransportDataType == null)?this.brokerDataSetReaderTransportDataType = new BrokerDataSetReaderTransportDataType.Selector<TRoot, ListOfBrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "brokerDataSetReaderTransportDataType"):this.brokerDataSetReaderTransportDataType);
        }

    }

}
