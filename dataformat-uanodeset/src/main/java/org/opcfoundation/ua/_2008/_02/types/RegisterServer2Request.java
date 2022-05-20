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
 * <p>Java-Klasse für RegisterServer2Request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegisterServer2Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="Server" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RegisteredServer" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryConfiguration" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterServer2Request", propOrder = {
    "requestHeader",
    "server",
    "discoveryConfiguration"
})
public class RegisterServer2Request {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "Server", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RegisteredServer> server;
    @XmlElementRef(name = "DiscoveryConfiguration", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExtensionObject> discoveryConfiguration;

    /**
     * Ruft den Wert der requestHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public JAXBElement<RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Legt den Wert der requestHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public void setRequestHeader(JAXBElement<RequestHeader> value) {
        this.requestHeader = value;
    }

    /**
     * Ruft den Wert der server-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegisteredServer }{@code >}
     *     
     */
    public JAXBElement<RegisteredServer> getServer() {
        return server;
    }

    /**
     * Legt den Wert der server-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegisteredServer }{@code >}
     *     
     */
    public void setServer(JAXBElement<RegisteredServer> value) {
        this.server = value;
    }

    /**
     * Ruft den Wert der discoveryConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ListOfExtensionObject> getDiscoveryConfiguration() {
        return discoveryConfiguration;
    }

    /**
     * Legt den Wert der discoveryConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public void setDiscoveryConfiguration(JAXBElement<ListOfExtensionObject> value) {
        this.discoveryConfiguration = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RegisterServer2Request.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.server = this.server;
        _other.discoveryConfiguration = this.discoveryConfiguration;
    }

    public<_B >RegisterServer2Request.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RegisterServer2Request.Builder<_B>(_parentBuilder, this, true);
    }

    public RegisterServer2Request.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RegisterServer2Request.Builder<Void> builder() {
        return new RegisterServer2Request.Builder<Void>(null, null, false);
    }

    public static<_B >RegisterServer2Request.Builder<_B> copyOf(final RegisterServer2Request _other) {
        final RegisterServer2Request.Builder<_B> _newBuilder = new RegisterServer2Request.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RegisterServer2Request.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
            _other.server = this.server;
        }
        final PropertyTree discoveryConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryConfiguration"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryConfigurationPropertyTree!= null):((discoveryConfigurationPropertyTree == null)||(!discoveryConfigurationPropertyTree.isLeaf())))) {
            _other.discoveryConfiguration = this.discoveryConfiguration;
        }
    }

    public<_B >RegisterServer2Request.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RegisterServer2Request.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RegisterServer2Request.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RegisterServer2Request.Builder<_B> copyOf(final RegisterServer2Request _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RegisterServer2Request.Builder<_B> _newBuilder = new RegisterServer2Request.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RegisterServer2Request.Builder<Void> copyExcept(final RegisterServer2Request _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RegisterServer2Request.Builder<Void> copyOnly(final RegisterServer2Request _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RegisterServer2Request _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<RegisteredServer> server;
        private JAXBElement<ListOfExtensionObject> discoveryConfiguration;

        public Builder(final _B _parentBuilder, final RegisterServer2Request _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.server = _other.server;
                    this.discoveryConfiguration = _other.discoveryConfiguration;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RegisterServer2Request _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
                        this.server = _other.server;
                    }
                    final PropertyTree discoveryConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryConfiguration"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryConfigurationPropertyTree!= null):((discoveryConfigurationPropertyTree == null)||(!discoveryConfigurationPropertyTree.isLeaf())))) {
                        this.discoveryConfiguration = _other.discoveryConfiguration;
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

        protected<_P extends RegisterServer2Request >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.server = this.server;
            _product.discoveryConfiguration = this.discoveryConfiguration;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public RegisterServer2Request.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "server" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param server
         *     Neuer Wert der Eigenschaft "server".
         */
        public RegisterServer2Request.Builder<_B> withServer(final JAXBElement<RegisteredServer> server) {
            this.server = server;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryConfiguration" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param discoveryConfiguration
         *     Neuer Wert der Eigenschaft "discoveryConfiguration".
         */
        public RegisterServer2Request.Builder<_B> withDiscoveryConfiguration(final JAXBElement<ListOfExtensionObject> discoveryConfiguration) {
            this.discoveryConfiguration = discoveryConfiguration;
            return this;
        }

        @Override
        public RegisterServer2Request build() {
            if (_storedValue == null) {
                return this.init(new RegisterServer2Request());
            } else {
                return ((RegisterServer2Request) _storedValue);
            }
        }

        public RegisterServer2Request.Builder<_B> copyOf(final RegisterServer2Request _other) {
            _other.copyTo(this);
            return this;
        }

        public RegisterServer2Request.Builder<_B> copyOf(final RegisterServer2Request.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RegisterServer2Request.Selector<RegisterServer2Request.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RegisterServer2Request.Select _root() {
            return new RegisterServer2Request.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> server = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> discoveryConfiguration = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.requestHeader!= null) {
                products.put("requestHeader", this.requestHeader.init());
            }
            if (this.server!= null) {
                products.put("server", this.server.init());
            }
            if (this.discoveryConfiguration!= null) {
                products.put("discoveryConfiguration", this.discoveryConfiguration.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> server() {
            return ((this.server == null)?this.server = new com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>>(this._root, this, "server"):this.server);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>> discoveryConfiguration() {
            return ((this.discoveryConfiguration == null)?this.discoveryConfiguration = new com.kscs.util.jaxb.Selector<TRoot, RegisterServer2Request.Selector<TRoot, TParent>>(this._root, this, "discoveryConfiguration"):this.discoveryConfiguration);
        }

    }

}
