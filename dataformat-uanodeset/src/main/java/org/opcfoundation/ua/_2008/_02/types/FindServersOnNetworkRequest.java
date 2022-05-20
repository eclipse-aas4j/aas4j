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
 * <p>Java-Klasse für FindServersOnNetworkRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindServersOnNetworkRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="StartingRecordId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxRecordsToReturn" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ServerCapabilityFilter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindServersOnNetworkRequest", propOrder = {
    "requestHeader",
    "startingRecordId",
    "maxRecordsToReturn",
    "serverCapabilityFilter"
})
public class FindServersOnNetworkRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "StartingRecordId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long startingRecordId;
    @XmlElement(name = "MaxRecordsToReturn")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxRecordsToReturn;
    @XmlElementRef(name = "ServerCapabilityFilter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> serverCapabilityFilter;

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
     * Ruft den Wert der startingRecordId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartingRecordId() {
        return startingRecordId;
    }

    /**
     * Legt den Wert der startingRecordId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartingRecordId(Long value) {
        this.startingRecordId = value;
    }

    /**
     * Ruft den Wert der maxRecordsToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRecordsToReturn() {
        return maxRecordsToReturn;
    }

    /**
     * Legt den Wert der maxRecordsToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRecordsToReturn(Long value) {
        this.maxRecordsToReturn = value;
    }

    /**
     * Ruft den Wert der serverCapabilityFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getServerCapabilityFilter() {
        return serverCapabilityFilter;
    }

    /**
     * Legt den Wert der serverCapabilityFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setServerCapabilityFilter(JAXBElement<ListOfString> value) {
        this.serverCapabilityFilter = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final FindServersOnNetworkRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.startingRecordId = this.startingRecordId;
        _other.maxRecordsToReturn = this.maxRecordsToReturn;
        _other.serverCapabilityFilter = this.serverCapabilityFilter;
    }

    public<_B >FindServersOnNetworkRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new FindServersOnNetworkRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public FindServersOnNetworkRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static FindServersOnNetworkRequest.Builder<Void> builder() {
        return new FindServersOnNetworkRequest.Builder<Void>(null, null, false);
    }

    public static<_B >FindServersOnNetworkRequest.Builder<_B> copyOf(final FindServersOnNetworkRequest _other) {
        final FindServersOnNetworkRequest.Builder<_B> _newBuilder = new FindServersOnNetworkRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final FindServersOnNetworkRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree startingRecordIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startingRecordId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startingRecordIdPropertyTree!= null):((startingRecordIdPropertyTree == null)||(!startingRecordIdPropertyTree.isLeaf())))) {
            _other.startingRecordId = this.startingRecordId;
        }
        final PropertyTree maxRecordsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxRecordsToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxRecordsToReturnPropertyTree!= null):((maxRecordsToReturnPropertyTree == null)||(!maxRecordsToReturnPropertyTree.isLeaf())))) {
            _other.maxRecordsToReturn = this.maxRecordsToReturn;
        }
        final PropertyTree serverCapabilityFilterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilityFilter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilityFilterPropertyTree!= null):((serverCapabilityFilterPropertyTree == null)||(!serverCapabilityFilterPropertyTree.isLeaf())))) {
            _other.serverCapabilityFilter = this.serverCapabilityFilter;
        }
    }

    public<_B >FindServersOnNetworkRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new FindServersOnNetworkRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public FindServersOnNetworkRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >FindServersOnNetworkRequest.Builder<_B> copyOf(final FindServersOnNetworkRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final FindServersOnNetworkRequest.Builder<_B> _newBuilder = new FindServersOnNetworkRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static FindServersOnNetworkRequest.Builder<Void> copyExcept(final FindServersOnNetworkRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static FindServersOnNetworkRequest.Builder<Void> copyOnly(final FindServersOnNetworkRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final FindServersOnNetworkRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long startingRecordId;
        private Long maxRecordsToReturn;
        private JAXBElement<ListOfString> serverCapabilityFilter;

        public Builder(final _B _parentBuilder, final FindServersOnNetworkRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.startingRecordId = _other.startingRecordId;
                    this.maxRecordsToReturn = _other.maxRecordsToReturn;
                    this.serverCapabilityFilter = _other.serverCapabilityFilter;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final FindServersOnNetworkRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree startingRecordIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startingRecordId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startingRecordIdPropertyTree!= null):((startingRecordIdPropertyTree == null)||(!startingRecordIdPropertyTree.isLeaf())))) {
                        this.startingRecordId = _other.startingRecordId;
                    }
                    final PropertyTree maxRecordsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxRecordsToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxRecordsToReturnPropertyTree!= null):((maxRecordsToReturnPropertyTree == null)||(!maxRecordsToReturnPropertyTree.isLeaf())))) {
                        this.maxRecordsToReturn = _other.maxRecordsToReturn;
                    }
                    final PropertyTree serverCapabilityFilterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilityFilter"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilityFilterPropertyTree!= null):((serverCapabilityFilterPropertyTree == null)||(!serverCapabilityFilterPropertyTree.isLeaf())))) {
                        this.serverCapabilityFilter = _other.serverCapabilityFilter;
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

        protected<_P extends FindServersOnNetworkRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.startingRecordId = this.startingRecordId;
            _product.maxRecordsToReturn = this.maxRecordsToReturn;
            _product.serverCapabilityFilter = this.serverCapabilityFilter;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public FindServersOnNetworkRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startingRecordId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param startingRecordId
         *     Neuer Wert der Eigenschaft "startingRecordId".
         */
        public FindServersOnNetworkRequest.Builder<_B> withStartingRecordId(final Long startingRecordId) {
            this.startingRecordId = startingRecordId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxRecordsToReturn" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param maxRecordsToReturn
         *     Neuer Wert der Eigenschaft "maxRecordsToReturn".
         */
        public FindServersOnNetworkRequest.Builder<_B> withMaxRecordsToReturn(final Long maxRecordsToReturn) {
            this.maxRecordsToReturn = maxRecordsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverCapabilityFilter" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param serverCapabilityFilter
         *     Neuer Wert der Eigenschaft "serverCapabilityFilter".
         */
        public FindServersOnNetworkRequest.Builder<_B> withServerCapabilityFilter(final JAXBElement<ListOfString> serverCapabilityFilter) {
            this.serverCapabilityFilter = serverCapabilityFilter;
            return this;
        }

        @Override
        public FindServersOnNetworkRequest build() {
            if (_storedValue == null) {
                return this.init(new FindServersOnNetworkRequest());
            } else {
                return ((FindServersOnNetworkRequest) _storedValue);
            }
        }

        public FindServersOnNetworkRequest.Builder<_B> copyOf(final FindServersOnNetworkRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public FindServersOnNetworkRequest.Builder<_B> copyOf(final FindServersOnNetworkRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends FindServersOnNetworkRequest.Selector<FindServersOnNetworkRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static FindServersOnNetworkRequest.Select _root() {
            return new FindServersOnNetworkRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> startingRecordId = null;
        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> maxRecordsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> serverCapabilityFilter = null;

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
            if (this.startingRecordId!= null) {
                products.put("startingRecordId", this.startingRecordId.init());
            }
            if (this.maxRecordsToReturn!= null) {
                products.put("maxRecordsToReturn", this.maxRecordsToReturn.init());
            }
            if (this.serverCapabilityFilter!= null) {
                products.put("serverCapabilityFilter", this.serverCapabilityFilter.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> startingRecordId() {
            return ((this.startingRecordId == null)?this.startingRecordId = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>>(this._root, this, "startingRecordId"):this.startingRecordId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> maxRecordsToReturn() {
            return ((this.maxRecordsToReturn == null)?this.maxRecordsToReturn = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>>(this._root, this, "maxRecordsToReturn"):this.maxRecordsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>> serverCapabilityFilter() {
            return ((this.serverCapabilityFilter == null)?this.serverCapabilityFilter = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkRequest.Selector<TRoot, TParent>>(this._root, this, "serverCapabilityFilter"):this.serverCapabilityFilter);
        }

    }

}
