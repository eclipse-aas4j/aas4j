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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für RequestHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenticationToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDiagnostics" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AuditEntryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeoutHint" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", propOrder = {
    "authenticationToken",
    "timestamp",
    "requestHandle",
    "returnDiagnostics",
    "auditEntryId",
    "timeoutHint",
    "additionalHeader"
})
public class RequestHeader {

    @XmlElementRef(name = "AuthenticationToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> authenticationToken;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "RequestHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestHandle;
    @XmlElement(name = "ReturnDiagnostics")
    @XmlSchemaType(name = "unsignedInt")
    protected Long returnDiagnostics;
    @XmlElementRef(name = "AuditEntryId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auditEntryId;
    @XmlElement(name = "TimeoutHint")
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeoutHint;
    @XmlElementRef(name = "AdditionalHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> additionalHeader;

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
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der requestHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestHandle() {
        return requestHandle;
    }

    /**
     * Legt den Wert der requestHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestHandle(Long value) {
        this.requestHandle = value;
    }

    /**
     * Ruft den Wert der returnDiagnostics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnDiagnostics() {
        return returnDiagnostics;
    }

    /**
     * Legt den Wert der returnDiagnostics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnDiagnostics(Long value) {
        this.returnDiagnostics = value;
    }

    /**
     * Ruft den Wert der auditEntryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuditEntryId() {
        return auditEntryId;
    }

    /**
     * Legt den Wert der auditEntryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuditEntryId(JAXBElement<String> value) {
        this.auditEntryId = value;
    }

    /**
     * Ruft den Wert der timeoutHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeoutHint() {
        return timeoutHint;
    }

    /**
     * Legt den Wert der timeoutHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeoutHint(Long value) {
        this.timeoutHint = value;
    }

    /**
     * Ruft den Wert der additionalHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getAdditionalHeader() {
        return additionalHeader;
    }

    /**
     * Legt den Wert der additionalHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setAdditionalHeader(JAXBElement<ExtensionObject> value) {
        this.additionalHeader = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RequestHeader.Builder<_B> _other) {
        _other.authenticationToken = this.authenticationToken;
        _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        _other.requestHandle = this.requestHandle;
        _other.returnDiagnostics = this.returnDiagnostics;
        _other.auditEntryId = this.auditEntryId;
        _other.timeoutHint = this.timeoutHint;
        _other.additionalHeader = this.additionalHeader;
    }

    public<_B >RequestHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RequestHeader.Builder<_B>(_parentBuilder, this, true);
    }

    public RequestHeader.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RequestHeader.Builder<Void> builder() {
        return new RequestHeader.Builder<Void>(null, null, false);
    }

    public static<_B >RequestHeader.Builder<_B> copyOf(final RequestHeader _other) {
        final RequestHeader.Builder<_B> _newBuilder = new RequestHeader.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RequestHeader.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree authenticationTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationTokenPropertyTree!= null):((authenticationTokenPropertyTree == null)||(!authenticationTokenPropertyTree.isLeaf())))) {
            _other.authenticationToken = this.authenticationToken;
        }
        final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
            _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        }
        final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
            _other.requestHandle = this.requestHandle;
        }
        final PropertyTree returnDiagnosticsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("returnDiagnostics"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(returnDiagnosticsPropertyTree!= null):((returnDiagnosticsPropertyTree == null)||(!returnDiagnosticsPropertyTree.isLeaf())))) {
            _other.returnDiagnostics = this.returnDiagnostics;
        }
        final PropertyTree auditEntryIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("auditEntryId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(auditEntryIdPropertyTree!= null):((auditEntryIdPropertyTree == null)||(!auditEntryIdPropertyTree.isLeaf())))) {
            _other.auditEntryId = this.auditEntryId;
        }
        final PropertyTree timeoutHintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timeoutHint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timeoutHintPropertyTree!= null):((timeoutHintPropertyTree == null)||(!timeoutHintPropertyTree.isLeaf())))) {
            _other.timeoutHint = this.timeoutHint;
        }
        final PropertyTree additionalHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("additionalHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(additionalHeaderPropertyTree!= null):((additionalHeaderPropertyTree == null)||(!additionalHeaderPropertyTree.isLeaf())))) {
            _other.additionalHeader = this.additionalHeader;
        }
    }

    public<_B >RequestHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RequestHeader.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RequestHeader.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RequestHeader.Builder<_B> copyOf(final RequestHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RequestHeader.Builder<_B> _newBuilder = new RequestHeader.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RequestHeader.Builder<Void> copyExcept(final RequestHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RequestHeader.Builder<Void> copyOnly(final RequestHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RequestHeader _storedValue;
        private JAXBElement<NodeId> authenticationToken;
        private XMLGregorianCalendar timestamp;
        private Long requestHandle;
        private Long returnDiagnostics;
        private JAXBElement<String> auditEntryId;
        private Long timeoutHint;
        private JAXBElement<ExtensionObject> additionalHeader;

        public Builder(final _B _parentBuilder, final RequestHeader _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.authenticationToken = _other.authenticationToken;
                    this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    this.requestHandle = _other.requestHandle;
                    this.returnDiagnostics = _other.returnDiagnostics;
                    this.auditEntryId = _other.auditEntryId;
                    this.timeoutHint = _other.timeoutHint;
                    this.additionalHeader = _other.additionalHeader;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RequestHeader _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree authenticationTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationToken"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationTokenPropertyTree!= null):((authenticationTokenPropertyTree == null)||(!authenticationTokenPropertyTree.isLeaf())))) {
                        this.authenticationToken = _other.authenticationToken;
                    }
                    final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
                        this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    }
                    final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
                        this.requestHandle = _other.requestHandle;
                    }
                    final PropertyTree returnDiagnosticsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("returnDiagnostics"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(returnDiagnosticsPropertyTree!= null):((returnDiagnosticsPropertyTree == null)||(!returnDiagnosticsPropertyTree.isLeaf())))) {
                        this.returnDiagnostics = _other.returnDiagnostics;
                    }
                    final PropertyTree auditEntryIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("auditEntryId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(auditEntryIdPropertyTree!= null):((auditEntryIdPropertyTree == null)||(!auditEntryIdPropertyTree.isLeaf())))) {
                        this.auditEntryId = _other.auditEntryId;
                    }
                    final PropertyTree timeoutHintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timeoutHint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timeoutHintPropertyTree!= null):((timeoutHintPropertyTree == null)||(!timeoutHintPropertyTree.isLeaf())))) {
                        this.timeoutHint = _other.timeoutHint;
                    }
                    final PropertyTree additionalHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("additionalHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(additionalHeaderPropertyTree!= null):((additionalHeaderPropertyTree == null)||(!additionalHeaderPropertyTree.isLeaf())))) {
                        this.additionalHeader = _other.additionalHeader;
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

        protected<_P extends RequestHeader >_P init(final _P _product) {
            _product.authenticationToken = this.authenticationToken;
            _product.timestamp = this.timestamp;
            _product.requestHandle = this.requestHandle;
            _product.returnDiagnostics = this.returnDiagnostics;
            _product.auditEntryId = this.auditEntryId;
            _product.timeoutHint = this.timeoutHint;
            _product.additionalHeader = this.additionalHeader;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "authenticationToken" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param authenticationToken
         *     Neuer Wert der Eigenschaft "authenticationToken".
         */
        public RequestHeader.Builder<_B> withAuthenticationToken(final JAXBElement<NodeId> authenticationToken) {
            this.authenticationToken = authenticationToken;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestamp" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param timestamp
         *     Neuer Wert der Eigenschaft "timestamp".
         */
        public RequestHeader.Builder<_B> withTimestamp(final XMLGregorianCalendar timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHandle" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHandle
         *     Neuer Wert der Eigenschaft "requestHandle".
         */
        public RequestHeader.Builder<_B> withRequestHandle(final Long requestHandle) {
            this.requestHandle = requestHandle;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "returnDiagnostics" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param returnDiagnostics
         *     Neuer Wert der Eigenschaft "returnDiagnostics".
         */
        public RequestHeader.Builder<_B> withReturnDiagnostics(final Long returnDiagnostics) {
            this.returnDiagnostics = returnDiagnostics;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "auditEntryId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param auditEntryId
         *     Neuer Wert der Eigenschaft "auditEntryId".
         */
        public RequestHeader.Builder<_B> withAuditEntryId(final JAXBElement<String> auditEntryId) {
            this.auditEntryId = auditEntryId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timeoutHint" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param timeoutHint
         *     Neuer Wert der Eigenschaft "timeoutHint".
         */
        public RequestHeader.Builder<_B> withTimeoutHint(final Long timeoutHint) {
            this.timeoutHint = timeoutHint;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "additionalHeader" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param additionalHeader
         *     Neuer Wert der Eigenschaft "additionalHeader".
         */
        public RequestHeader.Builder<_B> withAdditionalHeader(final JAXBElement<ExtensionObject> additionalHeader) {
            this.additionalHeader = additionalHeader;
            return this;
        }

        @Override
        public RequestHeader build() {
            if (_storedValue == null) {
                return this.init(new RequestHeader());
            } else {
                return ((RequestHeader) _storedValue);
            }
        }

        public RequestHeader.Builder<_B> copyOf(final RequestHeader _other) {
            _other.copyTo(this);
            return this;
        }

        public RequestHeader.Builder<_B> copyOf(final RequestHeader.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RequestHeader.Selector<RequestHeader.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RequestHeader.Select _root() {
            return new RequestHeader.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> authenticationToken = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> timestamp = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> requestHandle = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> returnDiagnostics = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> auditEntryId = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> timeoutHint = null;
        private com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> additionalHeader = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.authenticationToken!= null) {
                products.put("authenticationToken", this.authenticationToken.init());
            }
            if (this.timestamp!= null) {
                products.put("timestamp", this.timestamp.init());
            }
            if (this.requestHandle!= null) {
                products.put("requestHandle", this.requestHandle.init());
            }
            if (this.returnDiagnostics!= null) {
                products.put("returnDiagnostics", this.returnDiagnostics.init());
            }
            if (this.auditEntryId!= null) {
                products.put("auditEntryId", this.auditEntryId.init());
            }
            if (this.timeoutHint!= null) {
                products.put("timeoutHint", this.timeoutHint.init());
            }
            if (this.additionalHeader!= null) {
                products.put("additionalHeader", this.additionalHeader.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> authenticationToken() {
            return ((this.authenticationToken == null)?this.authenticationToken = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "authenticationToken"):this.authenticationToken);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> timestamp() {
            return ((this.timestamp == null)?this.timestamp = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "timestamp"):this.timestamp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> requestHandle() {
            return ((this.requestHandle == null)?this.requestHandle = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "requestHandle"):this.requestHandle);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> returnDiagnostics() {
            return ((this.returnDiagnostics == null)?this.returnDiagnostics = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "returnDiagnostics"):this.returnDiagnostics);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> auditEntryId() {
            return ((this.auditEntryId == null)?this.auditEntryId = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "auditEntryId"):this.auditEntryId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> timeoutHint() {
            return ((this.timeoutHint == null)?this.timeoutHint = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "timeoutHint"):this.timeoutHint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>> additionalHeader() {
            return ((this.additionalHeader == null)?this.additionalHeader = new com.kscs.util.jaxb.Selector<TRoot, RequestHeader.Selector<TRoot, TParent>>(this._root, this, "additionalHeader"):this.additionalHeader);
        }

    }

}
