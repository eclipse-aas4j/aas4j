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
 * <p>Java-Klasse für ListOfBrokerConnectionTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrokerConnectionTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrokerConnectionTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerConnectionTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrokerConnectionTransportDataType", propOrder = {
    "brokerConnectionTransportDataType"
})
public class ListOfBrokerConnectionTransportDataType {

    @XmlElement(name = "BrokerConnectionTransportDataType", nillable = true)
    protected List<BrokerConnectionTransportDataType> brokerConnectionTransportDataType;

    /**
     * Gets the value of the brokerConnectionTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerConnectionTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerConnectionTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerConnectionTransportDataType }
     * 
     * 
     */
    public List<BrokerConnectionTransportDataType> getBrokerConnectionTransportDataType() {
        if (brokerConnectionTransportDataType == null) {
            brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType>();
        }
        return this.brokerConnectionTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrokerConnectionTransportDataType.Builder<_B> _other) {
        if (this.brokerConnectionTransportDataType == null) {
            _other.brokerConnectionTransportDataType = null;
        } else {
            _other.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
            for (BrokerConnectionTransportDataType _item: this.brokerConnectionTransportDataType) {
                _other.brokerConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrokerConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrokerConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrokerConnectionTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrokerConnectionTransportDataType.Builder<Void> builder() {
        return new ListOfBrokerConnectionTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrokerConnectionTransportDataType.Builder<_B> copyOf(final ListOfBrokerConnectionTransportDataType _other) {
        final ListOfBrokerConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerConnectionTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrokerConnectionTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree brokerConnectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerConnectionTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerConnectionTransportDataTypePropertyTree!= null):((brokerConnectionTransportDataTypePropertyTree == null)||(!brokerConnectionTransportDataTypePropertyTree.isLeaf())))) {
            if (this.brokerConnectionTransportDataType == null) {
                _other.brokerConnectionTransportDataType = null;
            } else {
                _other.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
                for (BrokerConnectionTransportDataType _item: this.brokerConnectionTransportDataType) {
                    _other.brokerConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, brokerConnectionTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrokerConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrokerConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrokerConnectionTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrokerConnectionTransportDataType.Builder<_B> copyOf(final ListOfBrokerConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrokerConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfBrokerConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrokerConnectionTransportDataType.Builder<Void> copyExcept(final ListOfBrokerConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrokerConnectionTransportDataType.Builder<Void> copyOnly(final ListOfBrokerConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrokerConnectionTransportDataType _storedValue;
        private List<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>> brokerConnectionTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfBrokerConnectionTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.brokerConnectionTransportDataType == null) {
                        this.brokerConnectionTransportDataType = null;
                    } else {
                        this.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
                        for (BrokerConnectionTransportDataType _item: _other.brokerConnectionTransportDataType) {
                            this.brokerConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrokerConnectionTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree brokerConnectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerConnectionTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerConnectionTransportDataTypePropertyTree!= null):((brokerConnectionTransportDataTypePropertyTree == null)||(!brokerConnectionTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.brokerConnectionTransportDataType == null) {
                            this.brokerConnectionTransportDataType = null;
                        } else {
                            this.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
                            for (BrokerConnectionTransportDataType _item: _other.brokerConnectionTransportDataType) {
                                this.brokerConnectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, brokerConnectionTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrokerConnectionTransportDataType >_P init(final _P _product) {
            if (this.brokerConnectionTransportDataType!= null) {
                final List<BrokerConnectionTransportDataType> brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType>(this.brokerConnectionTransportDataType.size());
                for (BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>> _item: this.brokerConnectionTransportDataType) {
                    brokerConnectionTransportDataType.add(_item.build());
                }
                _product.brokerConnectionTransportDataType = brokerConnectionTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerConnectionTransportDataType" hinzu.
         * 
         * @param brokerConnectionTransportDataType
         *     Werte, die zur Eigenschaft "brokerConnectionTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerConnectionTransportDataType.Builder<_B> addBrokerConnectionTransportDataType(final Iterable<? extends BrokerConnectionTransportDataType> brokerConnectionTransportDataType) {
            if (brokerConnectionTransportDataType!= null) {
                if (this.brokerConnectionTransportDataType == null) {
                    this.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
                }
                for (BrokerConnectionTransportDataType _item: brokerConnectionTransportDataType) {
                    this.brokerConnectionTransportDataType.add(new BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerConnectionTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param brokerConnectionTransportDataType
         *     Neuer Wert der Eigenschaft "brokerConnectionTransportDataType".
         */
        public ListOfBrokerConnectionTransportDataType.Builder<_B> withBrokerConnectionTransportDataType(final Iterable<? extends BrokerConnectionTransportDataType> brokerConnectionTransportDataType) {
            if (this.brokerConnectionTransportDataType!= null) {
                this.brokerConnectionTransportDataType.clear();
            }
            return addBrokerConnectionTransportDataType(brokerConnectionTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerConnectionTransportDataType" hinzu.
         * 
         * @param brokerConnectionTransportDataType
         *     Werte, die zur Eigenschaft "brokerConnectionTransportDataType" hinzugefügt
         *     werden.
         */
        public ListOfBrokerConnectionTransportDataType.Builder<_B> addBrokerConnectionTransportDataType(BrokerConnectionTransportDataType... brokerConnectionTransportDataType) {
            addBrokerConnectionTransportDataType(Arrays.asList(brokerConnectionTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerConnectionTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param brokerConnectionTransportDataType
         *     Neuer Wert der Eigenschaft "brokerConnectionTransportDataType".
         */
        public ListOfBrokerConnectionTransportDataType.Builder<_B> withBrokerConnectionTransportDataType(BrokerConnectionTransportDataType... brokerConnectionTransportDataType) {
            withBrokerConnectionTransportDataType(Arrays.asList(brokerConnectionTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrokerConnectionTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrokerConnectionTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.BrokerConnectionTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrokerConnectionTransportDataType.Builder<? extends ListOfBrokerConnectionTransportDataType.Builder<_B>> addBrokerConnectionTransportDataType() {
            if (this.brokerConnectionTransportDataType == null) {
                this.brokerConnectionTransportDataType = new ArrayList<BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>>();
            }
            final BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>> brokerConnectionTransportDataType_Builder = new BrokerConnectionTransportDataType.Builder<ListOfBrokerConnectionTransportDataType.Builder<_B>>(this, null, false);
            this.brokerConnectionTransportDataType.add(brokerConnectionTransportDataType_Builder);
            return brokerConnectionTransportDataType_Builder;
        }

        @Override
        public ListOfBrokerConnectionTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrokerConnectionTransportDataType());
            } else {
                return ((ListOfBrokerConnectionTransportDataType) _storedValue);
            }
        }

        public ListOfBrokerConnectionTransportDataType.Builder<_B> copyOf(final ListOfBrokerConnectionTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrokerConnectionTransportDataType.Builder<_B> copyOf(final ListOfBrokerConnectionTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrokerConnectionTransportDataType.Selector<ListOfBrokerConnectionTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrokerConnectionTransportDataType.Select _root() {
            return new ListOfBrokerConnectionTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrokerConnectionTransportDataType.Selector<TRoot, ListOfBrokerConnectionTransportDataType.Selector<TRoot, TParent>> brokerConnectionTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.brokerConnectionTransportDataType!= null) {
                products.put("brokerConnectionTransportDataType", this.brokerConnectionTransportDataType.init());
            }
            return products;
        }

        public BrokerConnectionTransportDataType.Selector<TRoot, ListOfBrokerConnectionTransportDataType.Selector<TRoot, TParent>> brokerConnectionTransportDataType() {
            return ((this.brokerConnectionTransportDataType == null)?this.brokerConnectionTransportDataType = new BrokerConnectionTransportDataType.Selector<TRoot, ListOfBrokerConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "brokerConnectionTransportDataType"):this.brokerConnectionTransportDataType);
        }

    }

}
