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
 * <p>Java-Klasse für ListOfBrokerWriterGroupTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrokerWriterGroupTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrokerWriterGroupTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerWriterGroupTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrokerWriterGroupTransportDataType", propOrder = {
    "brokerWriterGroupTransportDataType"
})
public class ListOfBrokerWriterGroupTransportDataType {

    @XmlElement(name = "BrokerWriterGroupTransportDataType", nillable = true)
    protected List<BrokerWriterGroupTransportDataType> brokerWriterGroupTransportDataType;

    /**
     * Gets the value of the brokerWriterGroupTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerWriterGroupTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerWriterGroupTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerWriterGroupTransportDataType }
     * 
     * 
     */
    public List<BrokerWriterGroupTransportDataType> getBrokerWriterGroupTransportDataType() {
        if (brokerWriterGroupTransportDataType == null) {
            brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType>();
        }
        return this.brokerWriterGroupTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrokerWriterGroupTransportDataType.Builder<_B> _other) {
        if (this.brokerWriterGroupTransportDataType == null) {
            _other.brokerWriterGroupTransportDataType = null;
        } else {
            _other.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
            for (BrokerWriterGroupTransportDataType _item: this.brokerWriterGroupTransportDataType) {
                _other.brokerWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrokerWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrokerWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrokerWriterGroupTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrokerWriterGroupTransportDataType.Builder<Void> builder() {
        return new ListOfBrokerWriterGroupTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrokerWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfBrokerWriterGroupTransportDataType _other) {
        final ListOfBrokerWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerWriterGroupTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrokerWriterGroupTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree brokerWriterGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerWriterGroupTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerWriterGroupTransportDataTypePropertyTree!= null):((brokerWriterGroupTransportDataTypePropertyTree == null)||(!brokerWriterGroupTransportDataTypePropertyTree.isLeaf())))) {
            if (this.brokerWriterGroupTransportDataType == null) {
                _other.brokerWriterGroupTransportDataType = null;
            } else {
                _other.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
                for (BrokerWriterGroupTransportDataType _item: this.brokerWriterGroupTransportDataType) {
                    _other.brokerWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, brokerWriterGroupTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrokerWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrokerWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrokerWriterGroupTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrokerWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfBrokerWriterGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrokerWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrokerWriterGroupTransportDataType.Builder<Void> copyExcept(final ListOfBrokerWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrokerWriterGroupTransportDataType.Builder<Void> copyOnly(final ListOfBrokerWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrokerWriterGroupTransportDataType _storedValue;
        private List<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>> brokerWriterGroupTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfBrokerWriterGroupTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.brokerWriterGroupTransportDataType == null) {
                        this.brokerWriterGroupTransportDataType = null;
                    } else {
                        this.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
                        for (BrokerWriterGroupTransportDataType _item: _other.brokerWriterGroupTransportDataType) {
                            this.brokerWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrokerWriterGroupTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree brokerWriterGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerWriterGroupTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerWriterGroupTransportDataTypePropertyTree!= null):((brokerWriterGroupTransportDataTypePropertyTree == null)||(!brokerWriterGroupTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.brokerWriterGroupTransportDataType == null) {
                            this.brokerWriterGroupTransportDataType = null;
                        } else {
                            this.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
                            for (BrokerWriterGroupTransportDataType _item: _other.brokerWriterGroupTransportDataType) {
                                this.brokerWriterGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, brokerWriterGroupTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrokerWriterGroupTransportDataType >_P init(final _P _product) {
            if (this.brokerWriterGroupTransportDataType!= null) {
                final List<BrokerWriterGroupTransportDataType> brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType>(this.brokerWriterGroupTransportDataType.size());
                for (BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>> _item: this.brokerWriterGroupTransportDataType) {
                    brokerWriterGroupTransportDataType.add(_item.build());
                }
                _product.brokerWriterGroupTransportDataType = brokerWriterGroupTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerWriterGroupTransportDataType" hinzu.
         * 
         * @param brokerWriterGroupTransportDataType
         *     Werte, die zur Eigenschaft "brokerWriterGroupTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> addBrokerWriterGroupTransportDataType(final Iterable<? extends BrokerWriterGroupTransportDataType> brokerWriterGroupTransportDataType) {
            if (brokerWriterGroupTransportDataType!= null) {
                if (this.brokerWriterGroupTransportDataType == null) {
                    this.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
                }
                for (BrokerWriterGroupTransportDataType _item: brokerWriterGroupTransportDataType) {
                    this.brokerWriterGroupTransportDataType.add(new BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerWriterGroupTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerWriterGroupTransportDataType
         *     Neuer Wert der Eigenschaft "brokerWriterGroupTransportDataType".
         */
        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> withBrokerWriterGroupTransportDataType(final Iterable<? extends BrokerWriterGroupTransportDataType> brokerWriterGroupTransportDataType) {
            if (this.brokerWriterGroupTransportDataType!= null) {
                this.brokerWriterGroupTransportDataType.clear();
            }
            return addBrokerWriterGroupTransportDataType(brokerWriterGroupTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerWriterGroupTransportDataType" hinzu.
         * 
         * @param brokerWriterGroupTransportDataType
         *     Werte, die zur Eigenschaft "brokerWriterGroupTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> addBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType... brokerWriterGroupTransportDataType) {
            addBrokerWriterGroupTransportDataType(Arrays.asList(brokerWriterGroupTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerWriterGroupTransportDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param brokerWriterGroupTransportDataType
         *     Neuer Wert der Eigenschaft "brokerWriterGroupTransportDataType".
         */
        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> withBrokerWriterGroupTransportDataType(BrokerWriterGroupTransportDataType... brokerWriterGroupTransportDataType) {
            withBrokerWriterGroupTransportDataType(Arrays.asList(brokerWriterGroupTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrokerWriterGroupTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrokerWriterGroupTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.BrokerWriterGroupTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrokerWriterGroupTransportDataType.Builder<? extends ListOfBrokerWriterGroupTransportDataType.Builder<_B>> addBrokerWriterGroupTransportDataType() {
            if (this.brokerWriterGroupTransportDataType == null) {
                this.brokerWriterGroupTransportDataType = new ArrayList<BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>>();
            }
            final BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>> brokerWriterGroupTransportDataType_Builder = new BrokerWriterGroupTransportDataType.Builder<ListOfBrokerWriterGroupTransportDataType.Builder<_B>>(this, null, false);
            this.brokerWriterGroupTransportDataType.add(brokerWriterGroupTransportDataType_Builder);
            return brokerWriterGroupTransportDataType_Builder;
        }

        @Override
        public ListOfBrokerWriterGroupTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrokerWriterGroupTransportDataType());
            } else {
                return ((ListOfBrokerWriterGroupTransportDataType) _storedValue);
            }
        }

        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfBrokerWriterGroupTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrokerWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfBrokerWriterGroupTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrokerWriterGroupTransportDataType.Selector<ListOfBrokerWriterGroupTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrokerWriterGroupTransportDataType.Select _root() {
            return new ListOfBrokerWriterGroupTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrokerWriterGroupTransportDataType.Selector<TRoot, ListOfBrokerWriterGroupTransportDataType.Selector<TRoot, TParent>> brokerWriterGroupTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.brokerWriterGroupTransportDataType!= null) {
                products.put("brokerWriterGroupTransportDataType", this.brokerWriterGroupTransportDataType.init());
            }
            return products;
        }

        public BrokerWriterGroupTransportDataType.Selector<TRoot, ListOfBrokerWriterGroupTransportDataType.Selector<TRoot, TParent>> brokerWriterGroupTransportDataType() {
            return ((this.brokerWriterGroupTransportDataType == null)?this.brokerWriterGroupTransportDataType = new BrokerWriterGroupTransportDataType.Selector<TRoot, ListOfBrokerWriterGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "brokerWriterGroupTransportDataType"):this.brokerWriterGroupTransportDataType);
        }

    }

}
