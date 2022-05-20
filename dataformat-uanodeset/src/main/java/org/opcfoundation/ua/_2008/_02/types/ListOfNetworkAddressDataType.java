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
 * <p>Java-Klasse für ListOfNetworkAddressDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNetworkAddressDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkAddressDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NetworkAddressDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNetworkAddressDataType", propOrder = {
    "networkAddressDataType"
})
public class ListOfNetworkAddressDataType {

    @XmlElement(name = "NetworkAddressDataType", nillable = true)
    protected List<NetworkAddressDataType> networkAddressDataType;

    /**
     * Gets the value of the networkAddressDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkAddressDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkAddressDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkAddressDataType }
     * 
     * 
     */
    public List<NetworkAddressDataType> getNetworkAddressDataType() {
        if (networkAddressDataType == null) {
            networkAddressDataType = new ArrayList<NetworkAddressDataType>();
        }
        return this.networkAddressDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNetworkAddressDataType.Builder<_B> _other) {
        if (this.networkAddressDataType == null) {
            _other.networkAddressDataType = null;
        } else {
            _other.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
            for (NetworkAddressDataType _item: this.networkAddressDataType) {
                _other.networkAddressDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNetworkAddressDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNetworkAddressDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNetworkAddressDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNetworkAddressDataType.Builder<Void> builder() {
        return new ListOfNetworkAddressDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNetworkAddressDataType.Builder<_B> copyOf(final ListOfNetworkAddressDataType _other) {
        final ListOfNetworkAddressDataType.Builder<_B> _newBuilder = new ListOfNetworkAddressDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNetworkAddressDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree networkAddressDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkAddressDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkAddressDataTypePropertyTree!= null):((networkAddressDataTypePropertyTree == null)||(!networkAddressDataTypePropertyTree.isLeaf())))) {
            if (this.networkAddressDataType == null) {
                _other.networkAddressDataType = null;
            } else {
                _other.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
                for (NetworkAddressDataType _item: this.networkAddressDataType) {
                    _other.networkAddressDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, networkAddressDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNetworkAddressDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNetworkAddressDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNetworkAddressDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNetworkAddressDataType.Builder<_B> copyOf(final ListOfNetworkAddressDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNetworkAddressDataType.Builder<_B> _newBuilder = new ListOfNetworkAddressDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNetworkAddressDataType.Builder<Void> copyExcept(final ListOfNetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNetworkAddressDataType.Builder<Void> copyOnly(final ListOfNetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNetworkAddressDataType _storedValue;
        private List<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>> networkAddressDataType;

        public Builder(final _B _parentBuilder, final ListOfNetworkAddressDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.networkAddressDataType == null) {
                        this.networkAddressDataType = null;
                    } else {
                        this.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
                        for (NetworkAddressDataType _item: _other.networkAddressDataType) {
                            this.networkAddressDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNetworkAddressDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree networkAddressDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkAddressDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkAddressDataTypePropertyTree!= null):((networkAddressDataTypePropertyTree == null)||(!networkAddressDataTypePropertyTree.isLeaf())))) {
                        if (_other.networkAddressDataType == null) {
                            this.networkAddressDataType = null;
                        } else {
                            this.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
                            for (NetworkAddressDataType _item: _other.networkAddressDataType) {
                                this.networkAddressDataType.add(((_item == null)?null:_item.newCopyBuilder(this, networkAddressDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNetworkAddressDataType >_P init(final _P _product) {
            if (this.networkAddressDataType!= null) {
                final List<NetworkAddressDataType> networkAddressDataType = new ArrayList<NetworkAddressDataType>(this.networkAddressDataType.size());
                for (NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>> _item: this.networkAddressDataType) {
                    networkAddressDataType.add(_item.build());
                }
                _product.networkAddressDataType = networkAddressDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "networkAddressDataType" hinzu.
         * 
         * @param networkAddressDataType
         *     Werte, die zur Eigenschaft "networkAddressDataType" hinzugefügt werden.
         */
        public ListOfNetworkAddressDataType.Builder<_B> addNetworkAddressDataType(final Iterable<? extends NetworkAddressDataType> networkAddressDataType) {
            if (networkAddressDataType!= null) {
                if (this.networkAddressDataType == null) {
                    this.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
                }
                for (NetworkAddressDataType _item: networkAddressDataType) {
                    this.networkAddressDataType.add(new NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkAddressDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkAddressDataType
         *     Neuer Wert der Eigenschaft "networkAddressDataType".
         */
        public ListOfNetworkAddressDataType.Builder<_B> withNetworkAddressDataType(final Iterable<? extends NetworkAddressDataType> networkAddressDataType) {
            if (this.networkAddressDataType!= null) {
                this.networkAddressDataType.clear();
            }
            return addNetworkAddressDataType(networkAddressDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "networkAddressDataType" hinzu.
         * 
         * @param networkAddressDataType
         *     Werte, die zur Eigenschaft "networkAddressDataType" hinzugefügt werden.
         */
        public ListOfNetworkAddressDataType.Builder<_B> addNetworkAddressDataType(NetworkAddressDataType... networkAddressDataType) {
            addNetworkAddressDataType(Arrays.asList(networkAddressDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkAddressDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkAddressDataType
         *     Neuer Wert der Eigenschaft "networkAddressDataType".
         */
        public ListOfNetworkAddressDataType.Builder<_B> withNetworkAddressDataType(NetworkAddressDataType... networkAddressDataType) {
            withNetworkAddressDataType(Arrays.asList(networkAddressDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NetworkAddressDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.NetworkAddressDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NetworkAddressDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.NetworkAddressDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public NetworkAddressDataType.Builder<? extends ListOfNetworkAddressDataType.Builder<_B>> addNetworkAddressDataType() {
            if (this.networkAddressDataType == null) {
                this.networkAddressDataType = new ArrayList<NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>>();
            }
            final NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>> networkAddressDataType_Builder = new NetworkAddressDataType.Builder<ListOfNetworkAddressDataType.Builder<_B>>(this, null, false);
            this.networkAddressDataType.add(networkAddressDataType_Builder);
            return networkAddressDataType_Builder;
        }

        @Override
        public ListOfNetworkAddressDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfNetworkAddressDataType());
            } else {
                return ((ListOfNetworkAddressDataType) _storedValue);
            }
        }

        public ListOfNetworkAddressDataType.Builder<_B> copyOf(final ListOfNetworkAddressDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNetworkAddressDataType.Builder<_B> copyOf(final ListOfNetworkAddressDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNetworkAddressDataType.Selector<ListOfNetworkAddressDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNetworkAddressDataType.Select _root() {
            return new ListOfNetworkAddressDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NetworkAddressDataType.Selector<TRoot, ListOfNetworkAddressDataType.Selector<TRoot, TParent>> networkAddressDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.networkAddressDataType!= null) {
                products.put("networkAddressDataType", this.networkAddressDataType.init());
            }
            return products;
        }

        public NetworkAddressDataType.Selector<TRoot, ListOfNetworkAddressDataType.Selector<TRoot, TParent>> networkAddressDataType() {
            return ((this.networkAddressDataType == null)?this.networkAddressDataType = new NetworkAddressDataType.Selector<TRoot, ListOfNetworkAddressDataType.Selector<TRoot, TParent>>(this._root, this, "networkAddressDataType"):this.networkAddressDataType);
        }

    }

}
