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
 * <p>Java-Klasse für ListOfNetworkAddressUrlDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNetworkAddressUrlDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkAddressUrlDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NetworkAddressUrlDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNetworkAddressUrlDataType", propOrder = {
    "networkAddressUrlDataType"
})
public class ListOfNetworkAddressUrlDataType {

    @XmlElement(name = "NetworkAddressUrlDataType", nillable = true)
    protected List<NetworkAddressUrlDataType> networkAddressUrlDataType;

    /**
     * Gets the value of the networkAddressUrlDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkAddressUrlDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkAddressUrlDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkAddressUrlDataType }
     * 
     * 
     */
    public List<NetworkAddressUrlDataType> getNetworkAddressUrlDataType() {
        if (networkAddressUrlDataType == null) {
            networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType>();
        }
        return this.networkAddressUrlDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNetworkAddressUrlDataType.Builder<_B> _other) {
        if (this.networkAddressUrlDataType == null) {
            _other.networkAddressUrlDataType = null;
        } else {
            _other.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
            for (NetworkAddressUrlDataType _item: this.networkAddressUrlDataType) {
                _other.networkAddressUrlDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNetworkAddressUrlDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNetworkAddressUrlDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNetworkAddressUrlDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNetworkAddressUrlDataType.Builder<Void> builder() {
        return new ListOfNetworkAddressUrlDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNetworkAddressUrlDataType.Builder<_B> copyOf(final ListOfNetworkAddressUrlDataType _other) {
        final ListOfNetworkAddressUrlDataType.Builder<_B> _newBuilder = new ListOfNetworkAddressUrlDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNetworkAddressUrlDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree networkAddressUrlDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkAddressUrlDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkAddressUrlDataTypePropertyTree!= null):((networkAddressUrlDataTypePropertyTree == null)||(!networkAddressUrlDataTypePropertyTree.isLeaf())))) {
            if (this.networkAddressUrlDataType == null) {
                _other.networkAddressUrlDataType = null;
            } else {
                _other.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
                for (NetworkAddressUrlDataType _item: this.networkAddressUrlDataType) {
                    _other.networkAddressUrlDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, networkAddressUrlDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNetworkAddressUrlDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNetworkAddressUrlDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNetworkAddressUrlDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNetworkAddressUrlDataType.Builder<_B> copyOf(final ListOfNetworkAddressUrlDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNetworkAddressUrlDataType.Builder<_B> _newBuilder = new ListOfNetworkAddressUrlDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNetworkAddressUrlDataType.Builder<Void> copyExcept(final ListOfNetworkAddressUrlDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNetworkAddressUrlDataType.Builder<Void> copyOnly(final ListOfNetworkAddressUrlDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNetworkAddressUrlDataType _storedValue;
        private List<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>> networkAddressUrlDataType;

        public Builder(final _B _parentBuilder, final ListOfNetworkAddressUrlDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.networkAddressUrlDataType == null) {
                        this.networkAddressUrlDataType = null;
                    } else {
                        this.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
                        for (NetworkAddressUrlDataType _item: _other.networkAddressUrlDataType) {
                            this.networkAddressUrlDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNetworkAddressUrlDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree networkAddressUrlDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkAddressUrlDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkAddressUrlDataTypePropertyTree!= null):((networkAddressUrlDataTypePropertyTree == null)||(!networkAddressUrlDataTypePropertyTree.isLeaf())))) {
                        if (_other.networkAddressUrlDataType == null) {
                            this.networkAddressUrlDataType = null;
                        } else {
                            this.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
                            for (NetworkAddressUrlDataType _item: _other.networkAddressUrlDataType) {
                                this.networkAddressUrlDataType.add(((_item == null)?null:_item.newCopyBuilder(this, networkAddressUrlDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNetworkAddressUrlDataType >_P init(final _P _product) {
            if (this.networkAddressUrlDataType!= null) {
                final List<NetworkAddressUrlDataType> networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType>(this.networkAddressUrlDataType.size());
                for (NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>> _item: this.networkAddressUrlDataType) {
                    networkAddressUrlDataType.add(_item.build());
                }
                _product.networkAddressUrlDataType = networkAddressUrlDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "networkAddressUrlDataType" hinzu.
         * 
         * @param networkAddressUrlDataType
         *     Werte, die zur Eigenschaft "networkAddressUrlDataType" hinzugefügt werden.
         */
        public ListOfNetworkAddressUrlDataType.Builder<_B> addNetworkAddressUrlDataType(final Iterable<? extends NetworkAddressUrlDataType> networkAddressUrlDataType) {
            if (networkAddressUrlDataType!= null) {
                if (this.networkAddressUrlDataType == null) {
                    this.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
                }
                for (NetworkAddressUrlDataType _item: networkAddressUrlDataType) {
                    this.networkAddressUrlDataType.add(new NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkAddressUrlDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkAddressUrlDataType
         *     Neuer Wert der Eigenschaft "networkAddressUrlDataType".
         */
        public ListOfNetworkAddressUrlDataType.Builder<_B> withNetworkAddressUrlDataType(final Iterable<? extends NetworkAddressUrlDataType> networkAddressUrlDataType) {
            if (this.networkAddressUrlDataType!= null) {
                this.networkAddressUrlDataType.clear();
            }
            return addNetworkAddressUrlDataType(networkAddressUrlDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "networkAddressUrlDataType" hinzu.
         * 
         * @param networkAddressUrlDataType
         *     Werte, die zur Eigenschaft "networkAddressUrlDataType" hinzugefügt werden.
         */
        public ListOfNetworkAddressUrlDataType.Builder<_B> addNetworkAddressUrlDataType(NetworkAddressUrlDataType... networkAddressUrlDataType) {
            addNetworkAddressUrlDataType(Arrays.asList(networkAddressUrlDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkAddressUrlDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkAddressUrlDataType
         *     Neuer Wert der Eigenschaft "networkAddressUrlDataType".
         */
        public ListOfNetworkAddressUrlDataType.Builder<_B> withNetworkAddressUrlDataType(NetworkAddressUrlDataType... networkAddressUrlDataType) {
            withNetworkAddressUrlDataType(Arrays.asList(networkAddressUrlDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NetworkAddressUrlDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NetworkAddressUrlDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.NetworkAddressUrlDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public NetworkAddressUrlDataType.Builder<? extends ListOfNetworkAddressUrlDataType.Builder<_B>> addNetworkAddressUrlDataType() {
            if (this.networkAddressUrlDataType == null) {
                this.networkAddressUrlDataType = new ArrayList<NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>>();
            }
            final NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>> networkAddressUrlDataType_Builder = new NetworkAddressUrlDataType.Builder<ListOfNetworkAddressUrlDataType.Builder<_B>>(this, null, false);
            this.networkAddressUrlDataType.add(networkAddressUrlDataType_Builder);
            return networkAddressUrlDataType_Builder;
        }

        @Override
        public ListOfNetworkAddressUrlDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfNetworkAddressUrlDataType());
            } else {
                return ((ListOfNetworkAddressUrlDataType) _storedValue);
            }
        }

        public ListOfNetworkAddressUrlDataType.Builder<_B> copyOf(final ListOfNetworkAddressUrlDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNetworkAddressUrlDataType.Builder<_B> copyOf(final ListOfNetworkAddressUrlDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNetworkAddressUrlDataType.Selector<ListOfNetworkAddressUrlDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNetworkAddressUrlDataType.Select _root() {
            return new ListOfNetworkAddressUrlDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NetworkAddressUrlDataType.Selector<TRoot, ListOfNetworkAddressUrlDataType.Selector<TRoot, TParent>> networkAddressUrlDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.networkAddressUrlDataType!= null) {
                products.put("networkAddressUrlDataType", this.networkAddressUrlDataType.init());
            }
            return products;
        }

        public NetworkAddressUrlDataType.Selector<TRoot, ListOfNetworkAddressUrlDataType.Selector<TRoot, TParent>> networkAddressUrlDataType() {
            return ((this.networkAddressUrlDataType == null)?this.networkAddressUrlDataType = new NetworkAddressUrlDataType.Selector<TRoot, ListOfNetworkAddressUrlDataType.Selector<TRoot, TParent>>(this._root, this, "networkAddressUrlDataType"):this.networkAddressUrlDataType);
        }

    }

}
