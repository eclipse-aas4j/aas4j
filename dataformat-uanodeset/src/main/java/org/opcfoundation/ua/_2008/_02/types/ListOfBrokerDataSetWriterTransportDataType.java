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
 * <p>Java-Klasse für ListOfBrokerDataSetWriterTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrokerDataSetWriterTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrokerDataSetWriterTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerDataSetWriterTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrokerDataSetWriterTransportDataType", propOrder = {
    "brokerDataSetWriterTransportDataType"
})
public class ListOfBrokerDataSetWriterTransportDataType {

    @XmlElement(name = "BrokerDataSetWriterTransportDataType", nillable = true)
    protected List<BrokerDataSetWriterTransportDataType> brokerDataSetWriterTransportDataType;

    /**
     * Gets the value of the brokerDataSetWriterTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerDataSetWriterTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerDataSetWriterTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerDataSetWriterTransportDataType }
     * 
     * 
     */
    public List<BrokerDataSetWriterTransportDataType> getBrokerDataSetWriterTransportDataType() {
        if (brokerDataSetWriterTransportDataType == null) {
            brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType>();
        }
        return this.brokerDataSetWriterTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrokerDataSetWriterTransportDataType.Builder<_B> _other) {
        if (this.brokerDataSetWriterTransportDataType == null) {
            _other.brokerDataSetWriterTransportDataType = null;
        } else {
            _other.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
            for (BrokerDataSetWriterTransportDataType _item: this.brokerDataSetWriterTransportDataType) {
                _other.brokerDataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrokerDataSetWriterTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrokerDataSetWriterTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrokerDataSetWriterTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrokerDataSetWriterTransportDataType.Builder<Void> builder() {
        return new ListOfBrokerDataSetWriterTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrokerDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetWriterTransportDataType _other) {
        final ListOfBrokerDataSetWriterTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerDataSetWriterTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrokerDataSetWriterTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree brokerDataSetWriterTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerDataSetWriterTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerDataSetWriterTransportDataTypePropertyTree!= null):((brokerDataSetWriterTransportDataTypePropertyTree == null)||(!brokerDataSetWriterTransportDataTypePropertyTree.isLeaf())))) {
            if (this.brokerDataSetWriterTransportDataType == null) {
                _other.brokerDataSetWriterTransportDataType = null;
            } else {
                _other.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
                for (BrokerDataSetWriterTransportDataType _item: this.brokerDataSetWriterTransportDataType) {
                    _other.brokerDataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, brokerDataSetWriterTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrokerDataSetWriterTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrokerDataSetWriterTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrokerDataSetWriterTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrokerDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetWriterTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrokerDataSetWriterTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerDataSetWriterTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrokerDataSetWriterTransportDataType.Builder<Void> copyExcept(final ListOfBrokerDataSetWriterTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrokerDataSetWriterTransportDataType.Builder<Void> copyOnly(final ListOfBrokerDataSetWriterTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrokerDataSetWriterTransportDataType _storedValue;
        private List<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>> brokerDataSetWriterTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfBrokerDataSetWriterTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.brokerDataSetWriterTransportDataType == null) {
                        this.brokerDataSetWriterTransportDataType = null;
                    } else {
                        this.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
                        for (BrokerDataSetWriterTransportDataType _item: _other.brokerDataSetWriterTransportDataType) {
                            this.brokerDataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrokerDataSetWriterTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree brokerDataSetWriterTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerDataSetWriterTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerDataSetWriterTransportDataTypePropertyTree!= null):((brokerDataSetWriterTransportDataTypePropertyTree == null)||(!brokerDataSetWriterTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.brokerDataSetWriterTransportDataType == null) {
                            this.brokerDataSetWriterTransportDataType = null;
                        } else {
                            this.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
                            for (BrokerDataSetWriterTransportDataType _item: _other.brokerDataSetWriterTransportDataType) {
                                this.brokerDataSetWriterTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, brokerDataSetWriterTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrokerDataSetWriterTransportDataType >_P init(final _P _product) {
            if (this.brokerDataSetWriterTransportDataType!= null) {
                final List<BrokerDataSetWriterTransportDataType> brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType>(this.brokerDataSetWriterTransportDataType.size());
                for (BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>> _item: this.brokerDataSetWriterTransportDataType) {
                    brokerDataSetWriterTransportDataType.add(_item.build());
                }
                _product.brokerDataSetWriterTransportDataType = brokerDataSetWriterTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerDataSetWriterTransportDataType" hinzu.
         * 
         * @param brokerDataSetWriterTransportDataType
         *     Werte, die zur Eigenschaft "brokerDataSetWriterTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> addBrokerDataSetWriterTransportDataType(final Iterable<? extends BrokerDataSetWriterTransportDataType> brokerDataSetWriterTransportDataType) {
            if (brokerDataSetWriterTransportDataType!= null) {
                if (this.brokerDataSetWriterTransportDataType == null) {
                    this.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
                }
                for (BrokerDataSetWriterTransportDataType _item: brokerDataSetWriterTransportDataType) {
                    this.brokerDataSetWriterTransportDataType.add(new BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerDataSetWriterTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerDataSetWriterTransportDataType
         *     Neuer Wert der Eigenschaft "brokerDataSetWriterTransportDataType".
         */
        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> withBrokerDataSetWriterTransportDataType(final Iterable<? extends BrokerDataSetWriterTransportDataType> brokerDataSetWriterTransportDataType) {
            if (this.brokerDataSetWriterTransportDataType!= null) {
                this.brokerDataSetWriterTransportDataType.clear();
            }
            return addBrokerDataSetWriterTransportDataType(brokerDataSetWriterTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerDataSetWriterTransportDataType" hinzu.
         * 
         * @param brokerDataSetWriterTransportDataType
         *     Werte, die zur Eigenschaft "brokerDataSetWriterTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> addBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType... brokerDataSetWriterTransportDataType) {
            addBrokerDataSetWriterTransportDataType(Arrays.asList(brokerDataSetWriterTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerDataSetWriterTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerDataSetWriterTransportDataType
         *     Neuer Wert der Eigenschaft "brokerDataSetWriterTransportDataType".
         */
        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> withBrokerDataSetWriterTransportDataType(BrokerDataSetWriterTransportDataType... brokerDataSetWriterTransportDataType) {
            withBrokerDataSetWriterTransportDataType(Arrays.asList(brokerDataSetWriterTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrokerDataSetWriterTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrokerDataSetWriterTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.BrokerDataSetWriterTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrokerDataSetWriterTransportDataType.Builder<? extends ListOfBrokerDataSetWriterTransportDataType.Builder<_B>> addBrokerDataSetWriterTransportDataType() {
            if (this.brokerDataSetWriterTransportDataType == null) {
                this.brokerDataSetWriterTransportDataType = new ArrayList<BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>>();
            }
            final BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>> brokerDataSetWriterTransportDataType_Builder = new BrokerDataSetWriterTransportDataType.Builder<ListOfBrokerDataSetWriterTransportDataType.Builder<_B>>(this, null, false);
            this.brokerDataSetWriterTransportDataType.add(brokerDataSetWriterTransportDataType_Builder);
            return brokerDataSetWriterTransportDataType_Builder;
        }

        @Override
        public ListOfBrokerDataSetWriterTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrokerDataSetWriterTransportDataType());
            } else {
                return ((ListOfBrokerDataSetWriterTransportDataType) _storedValue);
            }
        }

        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetWriterTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrokerDataSetWriterTransportDataType.Builder<_B> copyOf(final ListOfBrokerDataSetWriterTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrokerDataSetWriterTransportDataType.Selector<ListOfBrokerDataSetWriterTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrokerDataSetWriterTransportDataType.Select _root() {
            return new ListOfBrokerDataSetWriterTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrokerDataSetWriterTransportDataType.Selector<TRoot, ListOfBrokerDataSetWriterTransportDataType.Selector<TRoot, TParent>> brokerDataSetWriterTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.brokerDataSetWriterTransportDataType!= null) {
                products.put("brokerDataSetWriterTransportDataType", this.brokerDataSetWriterTransportDataType.init());
            }
            return products;
        }

        public BrokerDataSetWriterTransportDataType.Selector<TRoot, ListOfBrokerDataSetWriterTransportDataType.Selector<TRoot, TParent>> brokerDataSetWriterTransportDataType() {
            return ((this.brokerDataSetWriterTransportDataType == null)?this.brokerDataSetWriterTransportDataType = new BrokerDataSetWriterTransportDataType.Selector<TRoot, ListOfBrokerDataSetWriterTransportDataType.Selector<TRoot, TParent>>(this._root, this, "brokerDataSetWriterTransportDataType"):this.brokerDataSetWriterTransportDataType);
        }

    }

}
