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
 * <p>Java-Klasse für CreateSessionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateSessionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="SessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="RevisedSessionTimeout" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ServerNonce" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ServerCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ServerEndpoints" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEndpointDescription" minOccurs="0"/&gt;
 *         &lt;element name="ServerSoftwareCertificates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSignedSoftwareCertificate" minOccurs="0"/&gt;
 *         &lt;element name="ServerSignature" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SignatureData" minOccurs="0"/&gt;
 *         &lt;element name="MaxRequestMessageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSessionResponse", propOrder = {
    "responseHeader",
    "sessionId",
    "authenticationToken",
    "revisedSessionTimeout",
    "serverNonce",
    "serverCertificate",
    "serverEndpoints",
    "serverSoftwareCertificates",
    "serverSignature",
    "maxRequestMessageSize"
})
public class CreateSessionResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "SessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sessionId;
    @XmlElementRef(name = "AuthenticationToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> authenticationToken;
    @XmlElement(name = "RevisedSessionTimeout")
    protected Double revisedSessionTimeout;
    @XmlElementRef(name = "ServerNonce", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> serverNonce;
    @XmlElementRef(name = "ServerCertificate", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> serverCertificate;
    @XmlElementRef(name = "ServerEndpoints", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEndpointDescription> serverEndpoints;
    @XmlElementRef(name = "ServerSoftwareCertificates", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSignedSoftwareCertificate> serverSoftwareCertificates;
    @XmlElementRef(name = "ServerSignature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatureData> serverSignature;
    @XmlElement(name = "MaxRequestMessageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxRequestMessageSize;

    /**
     * Ruft den Wert der responseHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public JAXBElement<ResponseHeader> getResponseHeader() {
        return responseHeader;
    }

    /**
     * Legt den Wert der responseHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public void setResponseHeader(JAXBElement<ResponseHeader> value) {
        this.responseHeader = value;
    }

    /**
     * Ruft den Wert der sessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getSessionId() {
        return sessionId;
    }

    /**
     * Legt den Wert der sessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setSessionId(JAXBElement<NodeId> value) {
        this.sessionId = value;
    }

    /**
     * Ruft den Wert der authenticationToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Legt den Wert der authenticationToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setAuthenticationToken(JAXBElement<NodeId> value) {
        this.authenticationToken = value;
    }

    /**
     * Ruft den Wert der revisedSessionTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevisedSessionTimeout() {
        return revisedSessionTimeout;
    }

    /**
     * Legt den Wert der revisedSessionTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevisedSessionTimeout(Double value) {
        this.revisedSessionTimeout = value;
    }

    /**
     * Ruft den Wert der serverNonce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getServerNonce() {
        return serverNonce;
    }

    /**
     * Legt den Wert der serverNonce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setServerNonce(JAXBElement<byte[]> value) {
        this.serverNonce = value;
    }

    /**
     * Ruft den Wert der serverCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getServerCertificate() {
        return serverCertificate;
    }

    /**
     * Legt den Wert der serverCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setServerCertificate(JAXBElement<byte[]> value) {
        this.serverCertificate = value;
    }

    /**
     * Ruft den Wert der serverEndpoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfEndpointDescription> getServerEndpoints() {
        return serverEndpoints;
    }

    /**
     * Legt den Wert der serverEndpoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public void setServerEndpoints(JAXBElement<ListOfEndpointDescription> value) {
        this.serverEndpoints = value;
    }

    /**
     * Ruft den Wert der serverSoftwareCertificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSignedSoftwareCertificate }{@code >}
     *     
     */
    public JAXBElement<ListOfSignedSoftwareCertificate> getServerSoftwareCertificates() {
        return serverSoftwareCertificates;
    }

    /**
     * Legt den Wert der serverSoftwareCertificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSignedSoftwareCertificate }{@code >}
     *     
     */
    public void setServerSoftwareCertificates(JAXBElement<ListOfSignedSoftwareCertificate> value) {
        this.serverSoftwareCertificates = value;
    }

    /**
     * Ruft den Wert der serverSignature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public JAXBElement<SignatureData> getServerSignature() {
        return serverSignature;
    }

    /**
     * Legt den Wert der serverSignature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public void setServerSignature(JAXBElement<SignatureData> value) {
        this.serverSignature = value;
    }

    /**
     * Ruft den Wert der maxRequestMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRequestMessageSize() {
        return maxRequestMessageSize;
    }

    /**
     * Legt den Wert der maxRequestMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRequestMessageSize(Long value) {
        this.maxRequestMessageSize = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CreateSessionResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.sessionId = this.sessionId;
        _other.authenticationToken = this.authenticationToken;
        _other.revisedSessionTimeout = this.revisedSessionTimeout;
        _other.serverNonce = this.serverNonce;
        _other.serverCertificate = this.serverCertificate;
        _other.serverEndpoints = this.serverEndpoints;
        _other.serverSoftwareCertificates = this.serverSoftwareCertificates;
        _other.serverSignature = this.serverSignature;
        _other.maxRequestMessageSize = this.maxRequestMessageSize;
    }

    public<_B >CreateSessionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CreateSessionResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public CreateSessionResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CreateSessionResponse.Builder<Void> builder() {
        return new CreateSessionResponse.Builder<Void>(null, null, false);
    }

    public static<_B >CreateSessionResponse.Builder<_B> copyOf(final CreateSessionResponse _other) {
        final CreateSessionResponse.Builder<_B> _newBuilder = new CreateSessionResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CreateSessionResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
            _other.sessionId = this.sessionId;
        }
        final PropertyTree authenticationTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationTokenPropertyTree!= null):((authenticationTokenPropertyTree == null)||(!authenticationTokenPropertyTree.isLeaf())))) {
            _other.authenticationToken = this.authenticationToken;
        }
        final PropertyTree revisedSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedSessionTimeout"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedSessionTimeoutPropertyTree!= null):((revisedSessionTimeoutPropertyTree == null)||(!revisedSessionTimeoutPropertyTree.isLeaf())))) {
            _other.revisedSessionTimeout = this.revisedSessionTimeout;
        }
        final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
            _other.serverNonce = this.serverNonce;
        }
        final PropertyTree serverCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCertificate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCertificatePropertyTree!= null):((serverCertificatePropertyTree == null)||(!serverCertificatePropertyTree.isLeaf())))) {
            _other.serverCertificate = this.serverCertificate;
        }
        final PropertyTree serverEndpointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverEndpoints"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverEndpointsPropertyTree!= null):((serverEndpointsPropertyTree == null)||(!serverEndpointsPropertyTree.isLeaf())))) {
            _other.serverEndpoints = this.serverEndpoints;
        }
        final PropertyTree serverSoftwareCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverSoftwareCertificates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverSoftwareCertificatesPropertyTree!= null):((serverSoftwareCertificatesPropertyTree == null)||(!serverSoftwareCertificatesPropertyTree.isLeaf())))) {
            _other.serverSoftwareCertificates = this.serverSoftwareCertificates;
        }
        final PropertyTree serverSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverSignature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverSignaturePropertyTree!= null):((serverSignaturePropertyTree == null)||(!serverSignaturePropertyTree.isLeaf())))) {
            _other.serverSignature = this.serverSignature;
        }
        final PropertyTree maxRequestMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxRequestMessageSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxRequestMessageSizePropertyTree!= null):((maxRequestMessageSizePropertyTree == null)||(!maxRequestMessageSizePropertyTree.isLeaf())))) {
            _other.maxRequestMessageSize = this.maxRequestMessageSize;
        }
    }

    public<_B >CreateSessionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CreateSessionResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CreateSessionResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CreateSessionResponse.Builder<_B> copyOf(final CreateSessionResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CreateSessionResponse.Builder<_B> _newBuilder = new CreateSessionResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CreateSessionResponse.Builder<Void> copyExcept(final CreateSessionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CreateSessionResponse.Builder<Void> copyOnly(final CreateSessionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CreateSessionResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<NodeId> sessionId;
        private JAXBElement<NodeId> authenticationToken;
        private Double revisedSessionTimeout;
        private JAXBElement<byte[]> serverNonce;
        private JAXBElement<byte[]> serverCertificate;
        private JAXBElement<ListOfEndpointDescription> serverEndpoints;
        private JAXBElement<ListOfSignedSoftwareCertificate> serverSoftwareCertificates;
        private JAXBElement<SignatureData> serverSignature;
        private Long maxRequestMessageSize;

        public Builder(final _B _parentBuilder, final CreateSessionResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.sessionId = _other.sessionId;
                    this.authenticationToken = _other.authenticationToken;
                    this.revisedSessionTimeout = _other.revisedSessionTimeout;
                    this.serverNonce = _other.serverNonce;
                    this.serverCertificate = _other.serverCertificate;
                    this.serverEndpoints = _other.serverEndpoints;
                    this.serverSoftwareCertificates = _other.serverSoftwareCertificates;
                    this.serverSignature = _other.serverSignature;
                    this.maxRequestMessageSize = _other.maxRequestMessageSize;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CreateSessionResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
                        this.sessionId = _other.sessionId;
                    }
                    final PropertyTree authenticationTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationToken"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationTokenPropertyTree!= null):((authenticationTokenPropertyTree == null)||(!authenticationTokenPropertyTree.isLeaf())))) {
                        this.authenticationToken = _other.authenticationToken;
                    }
                    final PropertyTree revisedSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedSessionTimeout"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedSessionTimeoutPropertyTree!= null):((revisedSessionTimeoutPropertyTree == null)||(!revisedSessionTimeoutPropertyTree.isLeaf())))) {
                        this.revisedSessionTimeout = _other.revisedSessionTimeout;
                    }
                    final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
                        this.serverNonce = _other.serverNonce;
                    }
                    final PropertyTree serverCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCertificate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCertificatePropertyTree!= null):((serverCertificatePropertyTree == null)||(!serverCertificatePropertyTree.isLeaf())))) {
                        this.serverCertificate = _other.serverCertificate;
                    }
                    final PropertyTree serverEndpointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverEndpoints"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverEndpointsPropertyTree!= null):((serverEndpointsPropertyTree == null)||(!serverEndpointsPropertyTree.isLeaf())))) {
                        this.serverEndpoints = _other.serverEndpoints;
                    }
                    final PropertyTree serverSoftwareCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverSoftwareCertificates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverSoftwareCertificatesPropertyTree!= null):((serverSoftwareCertificatesPropertyTree == null)||(!serverSoftwareCertificatesPropertyTree.isLeaf())))) {
                        this.serverSoftwareCertificates = _other.serverSoftwareCertificates;
                    }
                    final PropertyTree serverSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverSignature"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverSignaturePropertyTree!= null):((serverSignaturePropertyTree == null)||(!serverSignaturePropertyTree.isLeaf())))) {
                        this.serverSignature = _other.serverSignature;
                    }
                    final PropertyTree maxRequestMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxRequestMessageSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxRequestMessageSizePropertyTree!= null):((maxRequestMessageSizePropertyTree == null)||(!maxRequestMessageSizePropertyTree.isLeaf())))) {
                        this.maxRequestMessageSize = _other.maxRequestMessageSize;
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

        protected<_P extends CreateSessionResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.sessionId = this.sessionId;
            _product.authenticationToken = this.authenticationToken;
            _product.revisedSessionTimeout = this.revisedSessionTimeout;
            _product.serverNonce = this.serverNonce;
            _product.serverCertificate = this.serverCertificate;
            _product.serverEndpoints = this.serverEndpoints;
            _product.serverSoftwareCertificates = this.serverSoftwareCertificates;
            _product.serverSignature = this.serverSignature;
            _product.maxRequestMessageSize = this.maxRequestMessageSize;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public CreateSessionResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sessionId
         *     Neuer Wert der Eigenschaft "sessionId".
         */
        public CreateSessionResponse.Builder<_B> withSessionId(final JAXBElement<NodeId> sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "authenticationToken" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param authenticationToken
         *     Neuer Wert der Eigenschaft "authenticationToken".
         */
        public CreateSessionResponse.Builder<_B> withAuthenticationToken(final JAXBElement<NodeId> authenticationToken) {
            this.authenticationToken = authenticationToken;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedSessionTimeout" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedSessionTimeout
         *     Neuer Wert der Eigenschaft "revisedSessionTimeout".
         */
        public CreateSessionResponse.Builder<_B> withRevisedSessionTimeout(final Double revisedSessionTimeout) {
            this.revisedSessionTimeout = revisedSessionTimeout;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverNonce" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverNonce
         *     Neuer Wert der Eigenschaft "serverNonce".
         */
        public CreateSessionResponse.Builder<_B> withServerNonce(final JAXBElement<byte[]> serverNonce) {
            this.serverNonce = serverNonce;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverCertificate" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serverCertificate
         *     Neuer Wert der Eigenschaft "serverCertificate".
         */
        public CreateSessionResponse.Builder<_B> withServerCertificate(final JAXBElement<byte[]> serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverEndpoints" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverEndpoints
         *     Neuer Wert der Eigenschaft "serverEndpoints".
         */
        public CreateSessionResponse.Builder<_B> withServerEndpoints(final JAXBElement<ListOfEndpointDescription> serverEndpoints) {
            this.serverEndpoints = serverEndpoints;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverSoftwareCertificates" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param serverSoftwareCertificates
         *     Neuer Wert der Eigenschaft "serverSoftwareCertificates".
         */
        public CreateSessionResponse.Builder<_B> withServerSoftwareCertificates(final JAXBElement<ListOfSignedSoftwareCertificate> serverSoftwareCertificates) {
            this.serverSoftwareCertificates = serverSoftwareCertificates;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverSignature" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverSignature
         *     Neuer Wert der Eigenschaft "serverSignature".
         */
        public CreateSessionResponse.Builder<_B> withServerSignature(final JAXBElement<SignatureData> serverSignature) {
            this.serverSignature = serverSignature;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxRequestMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxRequestMessageSize
         *     Neuer Wert der Eigenschaft "maxRequestMessageSize".
         */
        public CreateSessionResponse.Builder<_B> withMaxRequestMessageSize(final Long maxRequestMessageSize) {
            this.maxRequestMessageSize = maxRequestMessageSize;
            return this;
        }

        @Override
        public CreateSessionResponse build() {
            if (_storedValue == null) {
                return this.init(new CreateSessionResponse());
            } else {
                return ((CreateSessionResponse) _storedValue);
            }
        }

        public CreateSessionResponse.Builder<_B> copyOf(final CreateSessionResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public CreateSessionResponse.Builder<_B> copyOf(final CreateSessionResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CreateSessionResponse.Selector<CreateSessionResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CreateSessionResponse.Select _root() {
            return new CreateSessionResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> sessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> authenticationToken = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> revisedSessionTimeout = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverNonce = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverCertificate = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverEndpoints = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverSoftwareCertificates = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverSignature = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> maxRequestMessageSize = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.responseHeader!= null) {
                products.put("responseHeader", this.responseHeader.init());
            }
            if (this.sessionId!= null) {
                products.put("sessionId", this.sessionId.init());
            }
            if (this.authenticationToken!= null) {
                products.put("authenticationToken", this.authenticationToken.init());
            }
            if (this.revisedSessionTimeout!= null) {
                products.put("revisedSessionTimeout", this.revisedSessionTimeout.init());
            }
            if (this.serverNonce!= null) {
                products.put("serverNonce", this.serverNonce.init());
            }
            if (this.serverCertificate!= null) {
                products.put("serverCertificate", this.serverCertificate.init());
            }
            if (this.serverEndpoints!= null) {
                products.put("serverEndpoints", this.serverEndpoints.init());
            }
            if (this.serverSoftwareCertificates!= null) {
                products.put("serverSoftwareCertificates", this.serverSoftwareCertificates.init());
            }
            if (this.serverSignature!= null) {
                products.put("serverSignature", this.serverSignature.init());
            }
            if (this.maxRequestMessageSize!= null) {
                products.put("maxRequestMessageSize", this.maxRequestMessageSize.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> sessionId() {
            return ((this.sessionId == null)?this.sessionId = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "sessionId"):this.sessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> authenticationToken() {
            return ((this.authenticationToken == null)?this.authenticationToken = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "authenticationToken"):this.authenticationToken);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> revisedSessionTimeout() {
            return ((this.revisedSessionTimeout == null)?this.revisedSessionTimeout = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "revisedSessionTimeout"):this.revisedSessionTimeout);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverNonce() {
            return ((this.serverNonce == null)?this.serverNonce = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverNonce"):this.serverNonce);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverCertificate() {
            return ((this.serverCertificate == null)?this.serverCertificate = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverCertificate"):this.serverCertificate);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverEndpoints() {
            return ((this.serverEndpoints == null)?this.serverEndpoints = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverEndpoints"):this.serverEndpoints);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverSoftwareCertificates() {
            return ((this.serverSoftwareCertificates == null)?this.serverSoftwareCertificates = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverSoftwareCertificates"):this.serverSoftwareCertificates);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> serverSignature() {
            return ((this.serverSignature == null)?this.serverSignature = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverSignature"):this.serverSignature);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>> maxRequestMessageSize() {
            return ((this.maxRequestMessageSize == null)?this.maxRequestMessageSize = new com.kscs.util.jaxb.Selector<TRoot, CreateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "maxRequestMessageSize"):this.maxRequestMessageSize);
        }

    }

}
