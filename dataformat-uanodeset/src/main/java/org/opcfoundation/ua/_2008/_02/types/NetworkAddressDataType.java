//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für NetworkAddressDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkAddressDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkAddressDataType", propOrder = {
    "networkInterface"
})
@XmlSeeAlso({
    NetworkAddressUrlDataType.class
})
public class NetworkAddressDataType {

    @XmlElementRef(name = "NetworkInterface", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkInterface;

    /**
     * Ruft den Wert der networkInterface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkInterface() {
        return networkInterface;
    }

    /**
     * Legt den Wert der networkInterface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkInterface(JAXBElement<String> value) {
        this.networkInterface = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NetworkAddressDataType.Builder<_B> _other) {
        _other.networkInterface = this.networkInterface;
    }

    public<_B >NetworkAddressDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NetworkAddressDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public NetworkAddressDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NetworkAddressDataType.Builder<Void> builder() {
        return new NetworkAddressDataType.Builder<Void>(null, null, false);
    }

    public static<_B >NetworkAddressDataType.Builder<_B> copyOf(final NetworkAddressDataType _other) {
        final NetworkAddressDataType.Builder<_B> _newBuilder = new NetworkAddressDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NetworkAddressDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree networkInterfacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkInterface"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkInterfacePropertyTree!= null):((networkInterfacePropertyTree == null)||(!networkInterfacePropertyTree.isLeaf())))) {
            _other.networkInterface = this.networkInterface;
        }
    }

    public<_B >NetworkAddressDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NetworkAddressDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NetworkAddressDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NetworkAddressDataType.Builder<_B> copyOf(final NetworkAddressDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NetworkAddressDataType.Builder<_B> _newBuilder = new NetworkAddressDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NetworkAddressDataType.Builder<Void> copyExcept(final NetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NetworkAddressDataType.Builder<Void> copyOnly(final NetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NetworkAddressDataType _storedValue;
        private JAXBElement<String> networkInterface;

        public Builder(final _B _parentBuilder, final NetworkAddressDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.networkInterface = _other.networkInterface;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NetworkAddressDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree networkInterfacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkInterface"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkInterfacePropertyTree!= null):((networkInterfacePropertyTree == null)||(!networkInterfacePropertyTree.isLeaf())))) {
                        this.networkInterface = _other.networkInterface;
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

        protected<_P extends NetworkAddressDataType >_P init(final _P _product) {
            _product.networkInterface = this.networkInterface;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkInterface" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkInterface
         *     Neuer Wert der Eigenschaft "networkInterface".
         */
        public NetworkAddressDataType.Builder<_B> withNetworkInterface(final JAXBElement<String> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }

        @Override
        public NetworkAddressDataType build() {
            if (_storedValue == null) {
                return this.init(new NetworkAddressDataType());
            } else {
                return ((NetworkAddressDataType) _storedValue);
            }
        }

        public NetworkAddressDataType.Builder<_B> copyOf(final NetworkAddressDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public NetworkAddressDataType.Builder<_B> copyOf(final NetworkAddressDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NetworkAddressDataType.Selector<NetworkAddressDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NetworkAddressDataType.Select _root() {
            return new NetworkAddressDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NetworkAddressDataType.Selector<TRoot, TParent>> networkInterface = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.networkInterface!= null) {
                products.put("networkInterface", this.networkInterface.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NetworkAddressDataType.Selector<TRoot, TParent>> networkInterface() {
            return ((this.networkInterface == null)?this.networkInterface = new com.kscs.util.jaxb.Selector<TRoot, NetworkAddressDataType.Selector<TRoot, TParent>>(this._root, this, "networkInterface"):this.networkInterface);
        }

    }

}
