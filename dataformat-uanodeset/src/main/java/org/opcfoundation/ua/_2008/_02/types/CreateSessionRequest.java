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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für CreateSessionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateSessionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ClientDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationDescription" minOccurs="0"/&gt;
 *         &lt;element name="ServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientNonce" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ClientCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="RequestedSessionTimeout" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxResponseMessageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSessionRequest", propOrder = {
    "requestHeader",
    "clientDescription",
    "serverUri",
    "endpointUrl",
    "sessionName",
    "clientNonce",
    "clientCertificate",
    "requestedSessionTimeout",
    "maxResponseMessageSize"
})
public class CreateSessionRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "ClientDescription", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicationDescription> clientDescription;
    @XmlElementRef(name = "ServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverUri;
    @XmlElementRef(name = "EndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointUrl;
    @XmlElementRef(name = "SessionName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionName;
    @XmlElementRef(name = "ClientNonce", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> clientNonce;
    @XmlElementRef(name = "ClientCertificate", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> clientCertificate;
    @XmlElement(name = "RequestedSessionTimeout")
    protected Double requestedSessionTimeout;
    @XmlElement(name = "MaxResponseMessageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxResponseMessageSize;

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
     * Ruft den Wert der clientDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public JAXBElement<ApplicationDescription> getClientDescription() {
        return clientDescription;
    }

    /**
     * Legt den Wert der clientDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public void setClientDescription(JAXBElement<ApplicationDescription> value) {
        this.clientDescription = value;
    }

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
     * Ruft den Wert der endpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * Legt den Wert der endpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointUrl(JAXBElement<String> value) {
        this.endpointUrl = value;
    }

    /**
     * Ruft den Wert der sessionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionName() {
        return sessionName;
    }

    /**
     * Legt den Wert der sessionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionName(JAXBElement<String> value) {
        this.sessionName = value;
    }

    /**
     * Ruft den Wert der clientNonce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getClientNonce() {
        return clientNonce;
    }

    /**
     * Legt den Wert der clientNonce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setClientNonce(JAXBElement<byte[]> value) {
        this.clientNonce = value;
    }

    /**
     * Ruft den Wert der clientCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getClientCertificate() {
        return clientCertificate;
    }

    /**
     * Legt den Wert der clientCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setClientCertificate(JAXBElement<byte[]> value) {
        this.clientCertificate = value;
    }

    /**
     * Ruft den Wert der requestedSessionTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedSessionTimeout() {
        return requestedSessionTimeout;
    }

    /**
     * Legt den Wert der requestedSessionTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedSessionTimeout(Double value) {
        this.requestedSessionTimeout = value;
    }

    /**
     * Ruft den Wert der maxResponseMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxResponseMessageSize() {
        return maxResponseMessageSize;
    }

    /**
     * Legt den Wert der maxResponseMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxResponseMessageSize(Long value) {
        this.maxResponseMessageSize = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CreateSessionRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.clientDescription = this.clientDescription;
        _other.serverUri = this.serverUri;
        _other.endpointUrl = this.endpointUrl;
        _other.sessionName = this.sessionName;
        _other.clientNonce = this.clientNonce;
        _other.clientCertificate = this.clientCertificate;
        _other.requestedSessionTimeout = this.requestedSessionTimeout;
        _other.maxResponseMessageSize = this.maxResponseMessageSize;
    }

    public<_B >CreateSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CreateSessionRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CreateSessionRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CreateSessionRequest.Builder<Void> builder() {
        return new CreateSessionRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CreateSessionRequest.Builder<_B> copyOf(final CreateSessionRequest _other) {
        final CreateSessionRequest.Builder<_B> _newBuilder = new CreateSessionRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CreateSessionRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree clientDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientDescriptionPropertyTree!= null):((clientDescriptionPropertyTree == null)||(!clientDescriptionPropertyTree.isLeaf())))) {
            _other.clientDescription = this.clientDescription;
        }
        final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
            _other.serverUri = this.serverUri;
        }
        final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
            _other.endpointUrl = this.endpointUrl;
        }
        final PropertyTree sessionNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionNamePropertyTree!= null):((sessionNamePropertyTree == null)||(!sessionNamePropertyTree.isLeaf())))) {
            _other.sessionName = this.sessionName;
        }
        final PropertyTree clientNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientNonce"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientNoncePropertyTree!= null):((clientNoncePropertyTree == null)||(!clientNoncePropertyTree.isLeaf())))) {
            _other.clientNonce = this.clientNonce;
        }
        final PropertyTree clientCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientCertificate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientCertificatePropertyTree!= null):((clientCertificatePropertyTree == null)||(!clientCertificatePropertyTree.isLeaf())))) {
            _other.clientCertificate = this.clientCertificate;
        }
        final PropertyTree requestedSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedSessionTimeout"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedSessionTimeoutPropertyTree!= null):((requestedSessionTimeoutPropertyTree == null)||(!requestedSessionTimeoutPropertyTree.isLeaf())))) {
            _other.requestedSessionTimeout = this.requestedSessionTimeout;
        }
        final PropertyTree maxResponseMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxResponseMessageSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxResponseMessageSizePropertyTree!= null):((maxResponseMessageSizePropertyTree == null)||(!maxResponseMessageSizePropertyTree.isLeaf())))) {
            _other.maxResponseMessageSize = this.maxResponseMessageSize;
        }
    }

    public<_B >CreateSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CreateSessionRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CreateSessionRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CreateSessionRequest.Builder<_B> copyOf(final CreateSessionRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CreateSessionRequest.Builder<_B> _newBuilder = new CreateSessionRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CreateSessionRequest.Builder<Void> copyExcept(final CreateSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CreateSessionRequest.Builder<Void> copyOnly(final CreateSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CreateSessionRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ApplicationDescription> clientDescription;
        private JAXBElement<String> serverUri;
        private JAXBElement<String> endpointUrl;
        private JAXBElement<String> sessionName;
        private JAXBElement<byte[]> clientNonce;
        private JAXBElement<byte[]> clientCertificate;
        private Double requestedSessionTimeout;
        private Long maxResponseMessageSize;

        public Builder(final _B _parentBuilder, final CreateSessionRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.clientDescription = _other.clientDescription;
                    this.serverUri = _other.serverUri;
                    this.endpointUrl = _other.endpointUrl;
                    this.sessionName = _other.sessionName;
                    this.clientNonce = _other.clientNonce;
                    this.clientCertificate = _other.clientCertificate;
                    this.requestedSessionTimeout = _other.requestedSessionTimeout;
                    this.maxResponseMessageSize = _other.maxResponseMessageSize;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CreateSessionRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree clientDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientDescriptionPropertyTree!= null):((clientDescriptionPropertyTree == null)||(!clientDescriptionPropertyTree.isLeaf())))) {
                        this.clientDescription = _other.clientDescription;
                    }
                    final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
                        this.serverUri = _other.serverUri;
                    }
                    final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
                        this.endpointUrl = _other.endpointUrl;
                    }
                    final PropertyTree sessionNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionNamePropertyTree!= null):((sessionNamePropertyTree == null)||(!sessionNamePropertyTree.isLeaf())))) {
                        this.sessionName = _other.sessionName;
                    }
                    final PropertyTree clientNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientNonce"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientNoncePropertyTree!= null):((clientNoncePropertyTree == null)||(!clientNoncePropertyTree.isLeaf())))) {
                        this.clientNonce = _other.clientNonce;
                    }
                    final PropertyTree clientCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientCertificate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientCertificatePropertyTree!= null):((clientCertificatePropertyTree == null)||(!clientCertificatePropertyTree.isLeaf())))) {
                        this.clientCertificate = _other.clientCertificate;
                    }
                    final PropertyTree requestedSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedSessionTimeout"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedSessionTimeoutPropertyTree!= null):((requestedSessionTimeoutPropertyTree == null)||(!requestedSessionTimeoutPropertyTree.isLeaf())))) {
                        this.requestedSessionTimeout = _other.requestedSessionTimeout;
                    }
                    final PropertyTree maxResponseMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxResponseMessageSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxResponseMessageSizePropertyTree!= null):((maxResponseMessageSizePropertyTree == null)||(!maxResponseMessageSizePropertyTree.isLeaf())))) {
                        this.maxResponseMessageSize = _other.maxResponseMessageSize;
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

        protected<_P extends CreateSessionRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.clientDescription = this.clientDescription;
            _product.serverUri = this.serverUri;
            _product.endpointUrl = this.endpointUrl;
            _product.sessionName = this.sessionName;
            _product.clientNonce = this.clientNonce;
            _product.clientCertificate = this.clientCertificate;
            _product.requestedSessionTimeout = this.requestedSessionTimeout;
            _product.maxResponseMessageSize = this.maxResponseMessageSize;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CreateSessionRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientDescription
         *     Neuer Wert der Eigenschaft "clientDescription".
         */
        public CreateSessionRequest.Builder<_B> withClientDescription(final JAXBElement<ApplicationDescription> clientDescription) {
            this.clientDescription = clientDescription;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverUri
         *     Neuer Wert der Eigenschaft "serverUri".
         */
        public CreateSessionRequest.Builder<_B> withServerUri(final JAXBElement<String> serverUri) {
            this.serverUri = serverUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrl
         *     Neuer Wert der Eigenschaft "endpointUrl".
         */
        public CreateSessionRequest.Builder<_B> withEndpointUrl(final JAXBElement<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sessionName
         *     Neuer Wert der Eigenschaft "sessionName".
         */
        public CreateSessionRequest.Builder<_B> withSessionName(final JAXBElement<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientNonce" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientNonce
         *     Neuer Wert der Eigenschaft "clientNonce".
         */
        public CreateSessionRequest.Builder<_B> withClientNonce(final JAXBElement<byte[]> clientNonce) {
            this.clientNonce = clientNonce;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientCertificate" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientCertificate
         *     Neuer Wert der Eigenschaft "clientCertificate".
         */
        public CreateSessionRequest.Builder<_B> withClientCertificate(final JAXBElement<byte[]> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedSessionTimeout" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedSessionTimeout
         *     Neuer Wert der Eigenschaft "requestedSessionTimeout".
         */
        public CreateSessionRequest.Builder<_B> withRequestedSessionTimeout(final Double requestedSessionTimeout) {
            this.requestedSessionTimeout = requestedSessionTimeout;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxResponseMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxResponseMessageSize
         *     Neuer Wert der Eigenschaft "maxResponseMessageSize".
         */
        public CreateSessionRequest.Builder<_B> withMaxResponseMessageSize(final Long maxResponseMessageSize) {
            this.maxResponseMessageSize = maxResponseMessageSize;
            return this;
        }

        @Override
        public CreateSessionRequest build() {
            if (_storedValue == null) {
                return this.init(new CreateSessionRequest());
            } else {
                return ((CreateSessionRequest) _storedValue);
            }
        }

        public CreateSessionRequest.Builder<_B> copyOf(final CreateSessionRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CreateSessionRequest.Builder<_B> copyOf(final CreateSessionRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CreateSessionRequest.Selector<CreateSessionRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CreateSessionRequest.Select _root() {
            return new CreateSessionRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientDescription = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> serverUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> endpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> sessionName = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientNonce = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientCertificate = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> requestedSessionTimeout = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> maxResponseMessageSize = null;

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
            if (this.clientDescription!= null) {
                products.put("clientDescription", this.clientDescription.init());
            }
            if (this.serverUri!= null) {
                products.put("serverUri", this.serverUri.init());
            }
            if (this.endpointUrl!= null) {
                products.put("endpointUrl", this.endpointUrl.init());
            }
            if (this.sessionName!= null) {
                products.put("sessionName", this.sessionName.init());
            }
            if (this.clientNonce!= null) {
                products.put("clientNonce", this.clientNonce.init());
            }
            if (this.clientCertificate!= null) {
                products.put("clientCertificate", this.clientCertificate.init());
            }
            if (this.requestedSessionTimeout!= null) {
                products.put("requestedSessionTimeout", this.requestedSessionTimeout.init());
            }
            if (this.maxResponseMessageSize!= null) {
                products.put("maxResponseMessageSize", this.maxResponseMessageSize.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientDescription() {
            return ((this.clientDescription == null)?this.clientDescription = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "clientDescription"):this.clientDescription);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> serverUri() {
            return ((this.serverUri == null)?this.serverUri = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "serverUri"):this.serverUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> endpointUrl() {
            return ((this.endpointUrl == null)?this.endpointUrl = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "endpointUrl"):this.endpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> sessionName() {
            return ((this.sessionName == null)?this.sessionName = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "sessionName"):this.sessionName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientNonce() {
            return ((this.clientNonce == null)?this.clientNonce = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "clientNonce"):this.clientNonce);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> clientCertificate() {
            return ((this.clientCertificate == null)?this.clientCertificate = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "clientCertificate"):this.clientCertificate);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> requestedSessionTimeout() {
            return ((this.requestedSessionTimeout == null)?this.requestedSessionTimeout = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "requestedSessionTimeout"):this.requestedSessionTimeout);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>> maxResponseMessageSize() {
            return ((this.maxResponseMessageSize == null)?this.maxResponseMessageSize = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "maxResponseMessageSize"):this.maxResponseMessageSize);
        }

    }

}
