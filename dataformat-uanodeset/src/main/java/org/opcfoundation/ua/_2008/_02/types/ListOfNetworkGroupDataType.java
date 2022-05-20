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
 * <p>Java-Klasse für ListOfNetworkGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNetworkGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkGroupDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NetworkGroupDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNetworkGroupDataType", propOrder = {
    "networkGroupDataType"
})
public class ListOfNetworkGroupDataType {

    @XmlElement(name = "NetworkGroupDataType", nillable = true)
    protected List<NetworkGroupDataType> networkGroupDataType;

    /**
     * Gets the value of the networkGroupDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkGroupDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkGroupDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkGroupDataType }
     * 
     * 
     */
    public List<NetworkGroupDataType> getNetworkGroupDataType() {
        if (networkGroupDataType == null) {
            networkGroupDataType = new ArrayList<NetworkGroupDataType>();
        }
        return this.networkGroupDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNetworkGroupDataType.Builder<_B> _other) {
        if (this.networkGroupDataType == null) {
            _other.networkGroupDataType = null;
        } else {
            _other.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
            for (NetworkGroupDataType _item: this.networkGroupDataType) {
                _other.networkGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNetworkGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNetworkGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNetworkGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNetworkGroupDataType.Builder<Void> builder() {
        return new ListOfNetworkGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNetworkGroupDataType.Builder<_B> copyOf(final ListOfNetworkGroupDataType _other) {
        final ListOfNetworkGroupDataType.Builder<_B> _newBuilder = new ListOfNetworkGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNetworkGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree networkGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkGroupDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkGroupDataTypePropertyTree!= null):((networkGroupDataTypePropertyTree == null)||(!networkGroupDataTypePropertyTree.isLeaf())))) {
            if (this.networkGroupDataType == null) {
                _other.networkGroupDataType = null;
            } else {
                _other.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
                for (NetworkGroupDataType _item: this.networkGroupDataType) {
                    _other.networkGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, networkGroupDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNetworkGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNetworkGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNetworkGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNetworkGroupDataType.Builder<_B> copyOf(final ListOfNetworkGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNetworkGroupDataType.Builder<_B> _newBuilder = new ListOfNetworkGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNetworkGroupDataType.Builder<Void> copyExcept(final ListOfNetworkGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNetworkGroupDataType.Builder<Void> copyOnly(final ListOfNetworkGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNetworkGroupDataType _storedValue;
        private List<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>> networkGroupDataType;

        public Builder(final _B _parentBuilder, final ListOfNetworkGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.networkGroupDataType == null) {
                        this.networkGroupDataType = null;
                    } else {
                        this.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
                        for (NetworkGroupDataType _item: _other.networkGroupDataType) {
                            this.networkGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNetworkGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree networkGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkGroupDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkGroupDataTypePropertyTree!= null):((networkGroupDataTypePropertyTree == null)||(!networkGroupDataTypePropertyTree.isLeaf())))) {
                        if (_other.networkGroupDataType == null) {
                            this.networkGroupDataType = null;
                        } else {
                            this.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
                            for (NetworkGroupDataType _item: _other.networkGroupDataType) {
                                this.networkGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this, networkGroupDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNetworkGroupDataType >_P init(final _P _product) {
            if (this.networkGroupDataType!= null) {
                final List<NetworkGroupDataType> networkGroupDataType = new ArrayList<NetworkGroupDataType>(this.networkGroupDataType.size());
                for (NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>> _item: this.networkGroupDataType) {
                    networkGroupDataType.add(_item.build());
                }
                _product.networkGroupDataType = networkGroupDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "networkGroupDataType" hinzu.
         * 
         * @param networkGroupDataType
         *     Werte, die zur Eigenschaft "networkGroupDataType" hinzugefügt werden.
         */
        public ListOfNetworkGroupDataType.Builder<_B> addNetworkGroupDataType(final Iterable<? extends NetworkGroupDataType> networkGroupDataType) {
            if (networkGroupDataType!= null) {
                if (this.networkGroupDataType == null) {
                    this.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
                }
                for (NetworkGroupDataType _item: networkGroupDataType) {
                    this.networkGroupDataType.add(new NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkGroupDataType
         *     Neuer Wert der Eigenschaft "networkGroupDataType".
         */
        public ListOfNetworkGroupDataType.Builder<_B> withNetworkGroupDataType(final Iterable<? extends NetworkGroupDataType> networkGroupDataType) {
            if (this.networkGroupDataType!= null) {
                this.networkGroupDataType.clear();
            }
            return addNetworkGroupDataType(networkGroupDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "networkGroupDataType" hinzu.
         * 
         * @param networkGroupDataType
         *     Werte, die zur Eigenschaft "networkGroupDataType" hinzugefügt werden.
         */
        public ListOfNetworkGroupDataType.Builder<_B> addNetworkGroupDataType(NetworkGroupDataType... networkGroupDataType) {
            addNetworkGroupDataType(Arrays.asList(networkGroupDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkGroupDataType
         *     Neuer Wert der Eigenschaft "networkGroupDataType".
         */
        public ListOfNetworkGroupDataType.Builder<_B> withNetworkGroupDataType(NetworkGroupDataType... networkGroupDataType) {
            withNetworkGroupDataType(Arrays.asList(networkGroupDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NetworkGroupDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.NetworkGroupDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NetworkGroupDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.NetworkGroupDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public NetworkGroupDataType.Builder<? extends ListOfNetworkGroupDataType.Builder<_B>> addNetworkGroupDataType() {
            if (this.networkGroupDataType == null) {
                this.networkGroupDataType = new ArrayList<NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>>();
            }
            final NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>> networkGroupDataType_Builder = new NetworkGroupDataType.Builder<ListOfNetworkGroupDataType.Builder<_B>>(this, null, false);
            this.networkGroupDataType.add(networkGroupDataType_Builder);
            return networkGroupDataType_Builder;
        }

        @Override
        public ListOfNetworkGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfNetworkGroupDataType());
            } else {
                return ((ListOfNetworkGroupDataType) _storedValue);
            }
        }

        public ListOfNetworkGroupDataType.Builder<_B> copyOf(final ListOfNetworkGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNetworkGroupDataType.Builder<_B> copyOf(final ListOfNetworkGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNetworkGroupDataType.Selector<ListOfNetworkGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNetworkGroupDataType.Select _root() {
            return new ListOfNetworkGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NetworkGroupDataType.Selector<TRoot, ListOfNetworkGroupDataType.Selector<TRoot, TParent>> networkGroupDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.networkGroupDataType!= null) {
                products.put("networkGroupDataType", this.networkGroupDataType.init());
            }
            return products;
        }

        public NetworkGroupDataType.Selector<TRoot, ListOfNetworkGroupDataType.Selector<TRoot, TParent>> networkGroupDataType() {
            return ((this.networkGroupDataType == null)?this.networkGroupDataType = new NetworkGroupDataType.Selector<TRoot, ListOfNetworkGroupDataType.Selector<TRoot, TParent>>(this._root, this, "networkGroupDataType"):this.networkGroupDataType);
        }

    }

}
