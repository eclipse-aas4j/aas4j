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
 * <p>Java-Klasse für ResponseHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ServiceResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDiagnostics" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticInfo" minOccurs="0"/&gt;
 *         &lt;element name="StringTable" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
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
@XmlType(name = "ResponseHeader", propOrder = {
    "timestamp",
    "requestHandle",
    "serviceResult",
    "serviceDiagnostics",
    "stringTable",
    "additionalHeader"
})
public class ResponseHeader {

    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "RequestHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestHandle;
    @XmlElement(name = "ServiceResult")
    protected StatusCode serviceResult;
    @XmlElementRef(name = "ServiceDiagnostics", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DiagnosticInfo> serviceDiagnostics;
    @XmlElementRef(name = "StringTable", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> stringTable;
    @XmlElementRef(name = "AdditionalHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> additionalHeader;

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
     * Ruft den Wert der serviceResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getServiceResult() {
        return serviceResult;
    }

    /**
     * Legt den Wert der serviceResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setServiceResult(StatusCode value) {
        this.serviceResult = value;
    }

    /**
     * Ruft den Wert der serviceDiagnostics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<DiagnosticInfo> getServiceDiagnostics() {
        return serviceDiagnostics;
    }

    /**
     * Legt den Wert der serviceDiagnostics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticInfo }{@code >}
     *     
     */
    public void setServiceDiagnostics(JAXBElement<DiagnosticInfo> value) {
        this.serviceDiagnostics = value;
    }

    /**
     * Ruft den Wert der stringTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getStringTable() {
        return stringTable;
    }

    /**
     * Legt den Wert der stringTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setStringTable(JAXBElement<ListOfString> value) {
        this.stringTable = value;
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
    public<_B >void copyTo(final ResponseHeader.Builder<_B> _other) {
        _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        _other.requestHandle = this.requestHandle;
        _other.serviceResult = ((this.serviceResult == null)?null:this.serviceResult.newCopyBuilder(_other));
        _other.serviceDiagnostics = this.serviceDiagnostics;
        _other.stringTable = this.stringTable;
        _other.additionalHeader = this.additionalHeader;
    }

    public<_B >ResponseHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ResponseHeader.Builder<_B>(_parentBuilder, this, true);
    }

    public ResponseHeader.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ResponseHeader.Builder<Void> builder() {
        return new ResponseHeader.Builder<Void>(null, null, false);
    }

    public static<_B >ResponseHeader.Builder<_B> copyOf(final ResponseHeader _other) {
        final ResponseHeader.Builder<_B> _newBuilder = new ResponseHeader.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ResponseHeader.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
            _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        }
        final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
            _other.requestHandle = this.requestHandle;
        }
        final PropertyTree serviceResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceResultPropertyTree!= null):((serviceResultPropertyTree == null)||(!serviceResultPropertyTree.isLeaf())))) {
            _other.serviceResult = ((this.serviceResult == null)?null:this.serviceResult.newCopyBuilder(_other, serviceResultPropertyTree, _propertyTreeUse));
        }
        final PropertyTree serviceDiagnosticsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceDiagnostics"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceDiagnosticsPropertyTree!= null):((serviceDiagnosticsPropertyTree == null)||(!serviceDiagnosticsPropertyTree.isLeaf())))) {
            _other.serviceDiagnostics = this.serviceDiagnostics;
        }
        final PropertyTree stringTablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("stringTable"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringTablePropertyTree!= null):((stringTablePropertyTree == null)||(!stringTablePropertyTree.isLeaf())))) {
            _other.stringTable = this.stringTable;
        }
        final PropertyTree additionalHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("additionalHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(additionalHeaderPropertyTree!= null):((additionalHeaderPropertyTree == null)||(!additionalHeaderPropertyTree.isLeaf())))) {
            _other.additionalHeader = this.additionalHeader;
        }
    }

    public<_B >ResponseHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ResponseHeader.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ResponseHeader.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ResponseHeader.Builder<_B> copyOf(final ResponseHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ResponseHeader.Builder<_B> _newBuilder = new ResponseHeader.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ResponseHeader.Builder<Void> copyExcept(final ResponseHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ResponseHeader.Builder<Void> copyOnly(final ResponseHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ResponseHeader _storedValue;
        private XMLGregorianCalendar timestamp;
        private Long requestHandle;
        private StatusCode.Builder<ResponseHeader.Builder<_B>> serviceResult;
        private JAXBElement<DiagnosticInfo> serviceDiagnostics;
        private JAXBElement<ListOfString> stringTable;
        private JAXBElement<ExtensionObject> additionalHeader;

        public Builder(final _B _parentBuilder, final ResponseHeader _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    this.requestHandle = _other.requestHandle;
                    this.serviceResult = ((_other.serviceResult == null)?null:_other.serviceResult.newCopyBuilder(this));
                    this.serviceDiagnostics = _other.serviceDiagnostics;
                    this.stringTable = _other.stringTable;
                    this.additionalHeader = _other.additionalHeader;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ResponseHeader _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
                        this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    }
                    final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
                        this.requestHandle = _other.requestHandle;
                    }
                    final PropertyTree serviceResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceResultPropertyTree!= null):((serviceResultPropertyTree == null)||(!serviceResultPropertyTree.isLeaf())))) {
                        this.serviceResult = ((_other.serviceResult == null)?null:_other.serviceResult.newCopyBuilder(this, serviceResultPropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree serviceDiagnosticsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceDiagnostics"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceDiagnosticsPropertyTree!= null):((serviceDiagnosticsPropertyTree == null)||(!serviceDiagnosticsPropertyTree.isLeaf())))) {
                        this.serviceDiagnostics = _other.serviceDiagnostics;
                    }
                    final PropertyTree stringTablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("stringTable"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringTablePropertyTree!= null):((stringTablePropertyTree == null)||(!stringTablePropertyTree.isLeaf())))) {
                        this.stringTable = _other.stringTable;
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

        protected<_P extends ResponseHeader >_P init(final _P _product) {
            _product.timestamp = this.timestamp;
            _product.requestHandle = this.requestHandle;
            _product.serviceResult = ((this.serviceResult == null)?null:this.serviceResult.build());
            _product.serviceDiagnostics = this.serviceDiagnostics;
            _product.stringTable = this.stringTable;
            _product.additionalHeader = this.additionalHeader;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestamp" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param timestamp
         *     Neuer Wert der Eigenschaft "timestamp".
         */
        public ResponseHeader.Builder<_B> withTimestamp(final XMLGregorianCalendar timestamp) {
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
        public ResponseHeader.Builder<_B> withRequestHandle(final Long requestHandle) {
            this.requestHandle = requestHandle;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serviceResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serviceResult
         *     Neuer Wert der Eigenschaft "serviceResult".
         */
        public ResponseHeader.Builder<_B> withServiceResult(final StatusCode serviceResult) {
            this.serviceResult = ((serviceResult == null)?null:new StatusCode.Builder<ResponseHeader.Builder<_B>>(this, serviceResult, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "serviceResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "serviceResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends ResponseHeader.Builder<_B>> withServiceResult() {
            if (this.serviceResult!= null) {
                return this.serviceResult;
            }
            return this.serviceResult = new StatusCode.Builder<ResponseHeader.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serviceDiagnostics" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serviceDiagnostics
         *     Neuer Wert der Eigenschaft "serviceDiagnostics".
         */
        public ResponseHeader.Builder<_B> withServiceDiagnostics(final JAXBElement<DiagnosticInfo> serviceDiagnostics) {
            this.serviceDiagnostics = serviceDiagnostics;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "stringTable" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param stringTable
         *     Neuer Wert der Eigenschaft "stringTable".
         */
        public ResponseHeader.Builder<_B> withStringTable(final JAXBElement<ListOfString> stringTable) {
            this.stringTable = stringTable;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "additionalHeader" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param additionalHeader
         *     Neuer Wert der Eigenschaft "additionalHeader".
         */
        public ResponseHeader.Builder<_B> withAdditionalHeader(final JAXBElement<ExtensionObject> additionalHeader) {
            this.additionalHeader = additionalHeader;
            return this;
        }

        @Override
        public ResponseHeader build() {
            if (_storedValue == null) {
                return this.init(new ResponseHeader());
            } else {
                return ((ResponseHeader) _storedValue);
            }
        }

        public ResponseHeader.Builder<_B> copyOf(final ResponseHeader _other) {
            _other.copyTo(this);
            return this;
        }

        public ResponseHeader.Builder<_B> copyOf(final ResponseHeader.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ResponseHeader.Selector<ResponseHeader.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ResponseHeader.Select _root() {
            return new ResponseHeader.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> timestamp = null;
        private com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> requestHandle = null;
        private StatusCode.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> serviceResult = null;
        private com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> serviceDiagnostics = null;
        private com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> stringTable = null;
        private com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> additionalHeader = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.timestamp!= null) {
                products.put("timestamp", this.timestamp.init());
            }
            if (this.requestHandle!= null) {
                products.put("requestHandle", this.requestHandle.init());
            }
            if (this.serviceResult!= null) {
                products.put("serviceResult", this.serviceResult.init());
            }
            if (this.serviceDiagnostics!= null) {
                products.put("serviceDiagnostics", this.serviceDiagnostics.init());
            }
            if (this.stringTable!= null) {
                products.put("stringTable", this.stringTable.init());
            }
            if (this.additionalHeader!= null) {
                products.put("additionalHeader", this.additionalHeader.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> timestamp() {
            return ((this.timestamp == null)?this.timestamp = new com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "timestamp"):this.timestamp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> requestHandle() {
            return ((this.requestHandle == null)?this.requestHandle = new com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "requestHandle"):this.requestHandle);
        }

        public StatusCode.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> serviceResult() {
            return ((this.serviceResult == null)?this.serviceResult = new StatusCode.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "serviceResult"):this.serviceResult);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> serviceDiagnostics() {
            return ((this.serviceDiagnostics == null)?this.serviceDiagnostics = new com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "serviceDiagnostics"):this.serviceDiagnostics);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> stringTable() {
            return ((this.stringTable == null)?this.stringTable = new com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "stringTable"):this.stringTable);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>> additionalHeader() {
            return ((this.additionalHeader == null)?this.additionalHeader = new com.kscs.util.jaxb.Selector<TRoot, ResponseHeader.Selector<TRoot, TParent>>(this._root, this, "additionalHeader"):this.additionalHeader);
        }

    }

}
