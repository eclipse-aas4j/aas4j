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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für NetworkGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkPaths" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEndpointUrlListDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkGroupDataType", propOrder = {
    "serverUri",
    "networkPaths"
})
public class NetworkGroupDataType {

    @XmlElementRef(name = "ServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverUri;
    @XmlElementRef(name = "NetworkPaths", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEndpointUrlListDataType> networkPaths;

    /**
     * Ruft den Wert der serverUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerUri() {
        return serverUri;
    }

    /**
     * Legt den Wert der serverUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerUri(JAXBElement<String> value) {
        this.serverUri = value;
    }

    /**
     * Ruft den Wert der networkPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointUrlListDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfEndpointUrlListDataType> getNetworkPaths() {
        return networkPaths;
    }

    /**
     * Legt den Wert der networkPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointUrlListDataType }{@code >}
     *     
     */
    public void setNetworkPaths(JAXBElement<ListOfEndpointUrlListDataType> value) {
        this.networkPaths = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NetworkGroupDataType.Builder<_B> _other) {
        _other.serverUri = this.serverUri;
        _other.networkPaths = this.networkPaths;
    }

    public<_B >NetworkGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NetworkGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public NetworkGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NetworkGroupDataType.Builder<Void> builder() {
        return new NetworkGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >NetworkGroupDataType.Builder<_B> copyOf(final NetworkGroupDataType _other) {
        final NetworkGroupDataType.Builder<_B> _newBuilder = new NetworkGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NetworkGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
            _other.serverUri = this.serverUri;
        }
        final PropertyTree networkPathsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkPaths"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkPathsPropertyTree!= null):((networkPathsPropertyTree == null)||(!networkPathsPropertyTree.isLeaf())))) {
            _other.networkPaths = this.networkPaths;
        }
    }

    public<_B >NetworkGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NetworkGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NetworkGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NetworkGroupDataType.Builder<_B> copyOf(final NetworkGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NetworkGroupDataType.Builder<_B> _newBuilder = new NetworkGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NetworkGroupDataType.Builder<Void> copyExcept(final NetworkGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NetworkGroupDataType.Builder<Void> copyOnly(final NetworkGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NetworkGroupDataType _storedValue;
        private JAXBElement<String> serverUri;
        private JAXBElement<ListOfEndpointUrlListDataType> networkPaths;

        public Builder(final _B _parentBuilder, final NetworkGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.serverUri = _other.serverUri;
                    this.networkPaths = _other.networkPaths;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NetworkGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
                        this.serverUri = _other.serverUri;
                    }
                    final PropertyTree networkPathsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkPaths"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkPathsPropertyTree!= null):((networkPathsPropertyTree == null)||(!networkPathsPropertyTree.isLeaf())))) {
                        this.networkPaths = _other.networkPaths;
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

        protected<_P extends NetworkGroupDataType >_P init(final _P _product) {
            _product.serverUri = this.serverUri;
            _product.networkPaths = this.networkPaths;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverUri
         *     Neuer Wert der Eigenschaft "serverUri".
         */
        public NetworkGroupDataType.Builder<_B> withServerUri(final JAXBElement<String> serverUri) {
            this.serverUri = serverUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkPaths" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param networkPaths
         *     Neuer Wert der Eigenschaft "networkPaths".
         */
        public NetworkGroupDataType.Builder<_B> withNetworkPaths(final JAXBElement<ListOfEndpointUrlListDataType> networkPaths) {
            this.networkPaths = networkPaths;
            return this;
        }

        @Override
        public NetworkGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new NetworkGroupDataType());
            } else {
                return ((NetworkGroupDataType) _storedValue);
            }
        }

        public NetworkGroupDataType.Builder<_B> copyOf(final NetworkGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public NetworkGroupDataType.Builder<_B> copyOf(final NetworkGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NetworkGroupDataType.Selector<NetworkGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NetworkGroupDataType.Select _root() {
            return new NetworkGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>> serverUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>> networkPaths = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.serverUri!= null) {
                products.put("serverUri", this.serverUri.init());
            }
            if (this.networkPaths!= null) {
                products.put("networkPaths", this.networkPaths.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>> serverUri() {
            return ((this.serverUri == null)?this.serverUri = new com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>>(this._root, this, "serverUri"):this.serverUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>> networkPaths() {
            return ((this.networkPaths == null)?this.networkPaths = new com.kscs.util.jaxb.Selector<TRoot, NetworkGroupDataType.Selector<TRoot, TParent>>(this._root, this, "networkPaths"):this.networkPaths);
        }

    }

}
