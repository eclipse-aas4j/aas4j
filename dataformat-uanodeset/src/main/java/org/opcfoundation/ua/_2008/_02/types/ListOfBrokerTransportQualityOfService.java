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
 * <p>Java-Klasse für ListOfBrokerTransportQualityOfService complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrokerTransportQualityOfService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrokerTransportQualityOfService" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerTransportQualityOfService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrokerTransportQualityOfService", propOrder = {
    "brokerTransportQualityOfService"
})
public class ListOfBrokerTransportQualityOfService {

    @XmlElement(name = "BrokerTransportQualityOfService")
    @XmlSchemaType(name = "string")
    protected List<BrokerTransportQualityOfService> brokerTransportQualityOfService;

    /**
     * Gets the value of the brokerTransportQualityOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerTransportQualityOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerTransportQualityOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerTransportQualityOfService }
     * 
     * 
     */
    public List<BrokerTransportQualityOfService> getBrokerTransportQualityOfService() {
        if (brokerTransportQualityOfService == null) {
            brokerTransportQualityOfService = new ArrayList<BrokerTransportQualityOfService>();
        }
        return this.brokerTransportQualityOfService;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrokerTransportQualityOfService.Builder<_B> _other) {
        if (this.brokerTransportQualityOfService == null) {
            _other.brokerTransportQualityOfService = null;
        } else {
            _other.brokerTransportQualityOfService = new ArrayList<Buildable>();
            for (BrokerTransportQualityOfService _item: this.brokerTransportQualityOfService) {
                _other.brokerTransportQualityOfService.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfBrokerTransportQualityOfService.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrokerTransportQualityOfService.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrokerTransportQualityOfService.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrokerTransportQualityOfService.Builder<Void> builder() {
        return new ListOfBrokerTransportQualityOfService.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrokerTransportQualityOfService.Builder<_B> copyOf(final ListOfBrokerTransportQualityOfService _other) {
        final ListOfBrokerTransportQualityOfService.Builder<_B> _newBuilder = new ListOfBrokerTransportQualityOfService.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrokerTransportQualityOfService.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree brokerTransportQualityOfServicePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerTransportQualityOfService"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerTransportQualityOfServicePropertyTree!= null):((brokerTransportQualityOfServicePropertyTree == null)||(!brokerTransportQualityOfServicePropertyTree.isLeaf())))) {
            if (this.brokerTransportQualityOfService == null) {
                _other.brokerTransportQualityOfService = null;
            } else {
                _other.brokerTransportQualityOfService = new ArrayList<Buildable>();
                for (BrokerTransportQualityOfService _item: this.brokerTransportQualityOfService) {
                    _other.brokerTransportQualityOfService.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfBrokerTransportQualityOfService.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrokerTransportQualityOfService.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrokerTransportQualityOfService.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrokerTransportQualityOfService.Builder<_B> copyOf(final ListOfBrokerTransportQualityOfService _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrokerTransportQualityOfService.Builder<_B> _newBuilder = new ListOfBrokerTransportQualityOfService.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrokerTransportQualityOfService.Builder<Void> copyExcept(final ListOfBrokerTransportQualityOfService _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrokerTransportQualityOfService.Builder<Void> copyOnly(final ListOfBrokerTransportQualityOfService _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrokerTransportQualityOfService _storedValue;
        private List<Buildable> brokerTransportQualityOfService;

        public Builder(final _B _parentBuilder, final ListOfBrokerTransportQualityOfService _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.brokerTransportQualityOfService == null) {
                        this.brokerTransportQualityOfService = null;
                    } else {
                        this.brokerTransportQualityOfService = new ArrayList<Buildable>();
                        for (BrokerTransportQualityOfService _item: _other.brokerTransportQualityOfService) {
                            this.brokerTransportQualityOfService.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrokerTransportQualityOfService _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree brokerTransportQualityOfServicePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("brokerTransportQualityOfService"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(brokerTransportQualityOfServicePropertyTree!= null):((brokerTransportQualityOfServicePropertyTree == null)||(!brokerTransportQualityOfServicePropertyTree.isLeaf())))) {
                        if (_other.brokerTransportQualityOfService == null) {
                            this.brokerTransportQualityOfService = null;
                        } else {
                            this.brokerTransportQualityOfService = new ArrayList<Buildable>();
                            for (BrokerTransportQualityOfService _item: _other.brokerTransportQualityOfService) {
                                this.brokerTransportQualityOfService.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfBrokerTransportQualityOfService >_P init(final _P _product) {
            if (this.brokerTransportQualityOfService!= null) {
                final List<BrokerTransportQualityOfService> brokerTransportQualityOfService = new ArrayList<BrokerTransportQualityOfService>(this.brokerTransportQualityOfService.size());
                for (Buildable _item: this.brokerTransportQualityOfService) {
                    brokerTransportQualityOfService.add(((BrokerTransportQualityOfService) _item.build()));
                }
                _product.brokerTransportQualityOfService = brokerTransportQualityOfService;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerTransportQualityOfService" hinzu.
         * 
         * @param brokerTransportQualityOfService
         *     Werte, die zur Eigenschaft "brokerTransportQualityOfService" hinzugefügt werden.
         */
        public ListOfBrokerTransportQualityOfService.Builder<_B> addBrokerTransportQualityOfService(final Iterable<? extends BrokerTransportQualityOfService> brokerTransportQualityOfService) {
            if (brokerTransportQualityOfService!= null) {
                if (this.brokerTransportQualityOfService == null) {
                    this.brokerTransportQualityOfService = new ArrayList<Buildable>();
                }
                for (BrokerTransportQualityOfService _item: brokerTransportQualityOfService) {
                    this.brokerTransportQualityOfService.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerTransportQualityOfService" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param brokerTransportQualityOfService
         *     Neuer Wert der Eigenschaft "brokerTransportQualityOfService".
         */
        public ListOfBrokerTransportQualityOfService.Builder<_B> withBrokerTransportQualityOfService(final Iterable<? extends BrokerTransportQualityOfService> brokerTransportQualityOfService) {
            if (this.brokerTransportQualityOfService!= null) {
                this.brokerTransportQualityOfService.clear();
            }
            return addBrokerTransportQualityOfService(brokerTransportQualityOfService);
        }

        /**
         * Fügt Werte zur Eigenschaft "brokerTransportQualityOfService" hinzu.
         * 
         * @param brokerTransportQualityOfService
         *     Werte, die zur Eigenschaft "brokerTransportQualityOfService" hinzugefügt werden.
         */
        public ListOfBrokerTransportQualityOfService.Builder<_B> addBrokerTransportQualityOfService(BrokerTransportQualityOfService... brokerTransportQualityOfService) {
            addBrokerTransportQualityOfService(Arrays.asList(brokerTransportQualityOfService));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "brokerTransportQualityOfService" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param brokerTransportQualityOfService
         *     Neuer Wert der Eigenschaft "brokerTransportQualityOfService".
         */
        public ListOfBrokerTransportQualityOfService.Builder<_B> withBrokerTransportQualityOfService(BrokerTransportQualityOfService... brokerTransportQualityOfService) {
            withBrokerTransportQualityOfService(Arrays.asList(brokerTransportQualityOfService));
            return this;
        }

        @Override
        public ListOfBrokerTransportQualityOfService build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrokerTransportQualityOfService());
            } else {
                return ((ListOfBrokerTransportQualityOfService) _storedValue);
            }
        }

        public ListOfBrokerTransportQualityOfService.Builder<_B> copyOf(final ListOfBrokerTransportQualityOfService _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrokerTransportQualityOfService.Builder<_B> copyOf(final ListOfBrokerTransportQualityOfService.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrokerTransportQualityOfService.Selector<ListOfBrokerTransportQualityOfService.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrokerTransportQualityOfService.Select _root() {
            return new ListOfBrokerTransportQualityOfService.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfBrokerTransportQualityOfService.Selector<TRoot, TParent>> brokerTransportQualityOfService = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.brokerTransportQualityOfService!= null) {
                products.put("brokerTransportQualityOfService", this.brokerTransportQualityOfService.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfBrokerTransportQualityOfService.Selector<TRoot, TParent>> brokerTransportQualityOfService() {
            return ((this.brokerTransportQualityOfService == null)?this.brokerTransportQualityOfService = new com.kscs.util.jaxb.Selector<TRoot, ListOfBrokerTransportQualityOfService.Selector<TRoot, TParent>>(this._root, this, "brokerTransportQualityOfService"):this.brokerTransportQualityOfService);
        }

    }

}
