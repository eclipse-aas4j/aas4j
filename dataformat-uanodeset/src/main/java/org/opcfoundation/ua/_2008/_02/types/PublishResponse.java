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
 * <p>Java-Klasse für PublishResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AvailableSequenceNumbers" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *         &lt;element name="MoreNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMessage" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NotificationMessage" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishResponse", propOrder = {
    "responseHeader",
    "subscriptionId",
    "availableSequenceNumbers",
    "moreNotifications",
    "notificationMessage",
    "results",
    "diagnosticInfos"
})
public class PublishResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElementRef(name = "AvailableSequenceNumbers", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> availableSequenceNumbers;
    @XmlElement(name = "MoreNotifications")
    protected Boolean moreNotifications;
    @XmlElementRef(name = "NotificationMessage", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotificationMessage> notificationMessage;
    @XmlElementRef(name = "Results", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> results;
    @XmlElementRef(name = "DiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

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
     * Ruft den Wert der subscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Legt den Wert der subscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionId(Long value) {
        this.subscriptionId = value;
    }

    /**
     * Ruft den Wert der availableSequenceNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getAvailableSequenceNumbers() {
        return availableSequenceNumbers;
    }

    /**
     * Legt den Wert der availableSequenceNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setAvailableSequenceNumbers(JAXBElement<ListOfUInt32> value) {
        this.availableSequenceNumbers = value;
    }

    /**
     * Ruft den Wert der moreNotifications-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreNotifications() {
        return moreNotifications;
    }

    /**
     * Legt den Wert der moreNotifications-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreNotifications(Boolean value) {
        this.moreNotifications = value;
    }

    /**
     * Ruft den Wert der notificationMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotificationMessage }{@code >}
     *     
     */
    public JAXBElement<NotificationMessage> getNotificationMessage() {
        return notificationMessage;
    }

    /**
     * Legt den Wert der notificationMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotificationMessage }{@code >}
     *     
     */
    public void setNotificationMessage(JAXBElement<NotificationMessage> value) {
        this.notificationMessage = value;
    }

    /**
     * Ruft den Wert der results-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getResults() {
        return results;
    }

    /**
     * Legt den Wert der results-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setResults(JAXBElement<ListOfStatusCode> value) {
        this.results = value;
    }

    /**
     * Ruft den Wert der diagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getDiagnosticInfos() {
        return diagnosticInfos;
    }

    /**
     * Legt den Wert der diagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.diagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.subscriptionId = this.subscriptionId;
        _other.availableSequenceNumbers = this.availableSequenceNumbers;
        _other.moreNotifications = this.moreNotifications;
        _other.notificationMessage = this.notificationMessage;
        _other.results = this.results;
        _other.diagnosticInfos = this.diagnosticInfos;
    }

    public<_B >PublishResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public PublishResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishResponse.Builder<Void> builder() {
        return new PublishResponse.Builder<Void>(null, null, false);
    }

    public static<_B >PublishResponse.Builder<_B> copyOf(final PublishResponse _other) {
        final PublishResponse.Builder<_B> _newBuilder = new PublishResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree availableSequenceNumbersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("availableSequenceNumbers"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(availableSequenceNumbersPropertyTree!= null):((availableSequenceNumbersPropertyTree == null)||(!availableSequenceNumbersPropertyTree.isLeaf())))) {
            _other.availableSequenceNumbers = this.availableSequenceNumbers;
        }
        final PropertyTree moreNotificationsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("moreNotifications"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(moreNotificationsPropertyTree!= null):((moreNotificationsPropertyTree == null)||(!moreNotificationsPropertyTree.isLeaf())))) {
            _other.moreNotifications = this.moreNotifications;
        }
        final PropertyTree notificationMessagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationMessage"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationMessagePropertyTree!= null):((notificationMessagePropertyTree == null)||(!notificationMessagePropertyTree.isLeaf())))) {
            _other.notificationMessage = this.notificationMessage;
        }
        final PropertyTree resultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("results"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultsPropertyTree!= null):((resultsPropertyTree == null)||(!resultsPropertyTree.isLeaf())))) {
            _other.results = this.results;
        }
        final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
            _other.diagnosticInfos = this.diagnosticInfos;
        }
    }

    public<_B >PublishResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PublishResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishResponse.Builder<_B> copyOf(final PublishResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishResponse.Builder<_B> _newBuilder = new PublishResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishResponse.Builder<Void> copyExcept(final PublishResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishResponse.Builder<Void> copyOnly(final PublishResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PublishResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private Long subscriptionId;
        private JAXBElement<ListOfUInt32> availableSequenceNumbers;
        private Boolean moreNotifications;
        private JAXBElement<NotificationMessage> notificationMessage;
        private JAXBElement<ListOfStatusCode> results;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

        public Builder(final _B _parentBuilder, final PublishResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.subscriptionId = _other.subscriptionId;
                    this.availableSequenceNumbers = _other.availableSequenceNumbers;
                    this.moreNotifications = _other.moreNotifications;
                    this.notificationMessage = _other.notificationMessage;
                    this.results = _other.results;
                    this.diagnosticInfos = _other.diagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PublishResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
                        this.subscriptionId = _other.subscriptionId;
                    }
                    final PropertyTree availableSequenceNumbersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("availableSequenceNumbers"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(availableSequenceNumbersPropertyTree!= null):((availableSequenceNumbersPropertyTree == null)||(!availableSequenceNumbersPropertyTree.isLeaf())))) {
                        this.availableSequenceNumbers = _other.availableSequenceNumbers;
                    }
                    final PropertyTree moreNotificationsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("moreNotifications"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(moreNotificationsPropertyTree!= null):((moreNotificationsPropertyTree == null)||(!moreNotificationsPropertyTree.isLeaf())))) {
                        this.moreNotifications = _other.moreNotifications;
                    }
                    final PropertyTree notificationMessagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationMessage"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationMessagePropertyTree!= null):((notificationMessagePropertyTree == null)||(!notificationMessagePropertyTree.isLeaf())))) {
                        this.notificationMessage = _other.notificationMessage;
                    }
                    final PropertyTree resultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("results"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultsPropertyTree!= null):((resultsPropertyTree == null)||(!resultsPropertyTree.isLeaf())))) {
                        this.results = _other.results;
                    }
                    final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
                        this.diagnosticInfos = _other.diagnosticInfos;
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

        protected<_P extends PublishResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.subscriptionId = this.subscriptionId;
            _product.availableSequenceNumbers = this.availableSequenceNumbers;
            _product.moreNotifications = this.moreNotifications;
            _product.notificationMessage = this.notificationMessage;
            _product.results = this.results;
            _product.diagnosticInfos = this.diagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public PublishResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param subscriptionId
         *     Neuer Wert der Eigenschaft "subscriptionId".
         */
        public PublishResponse.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "availableSequenceNumbers" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param availableSequenceNumbers
         *     Neuer Wert der Eigenschaft "availableSequenceNumbers".
         */
        public PublishResponse.Builder<_B> withAvailableSequenceNumbers(final JAXBElement<ListOfUInt32> availableSequenceNumbers) {
            this.availableSequenceNumbers = availableSequenceNumbers;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "moreNotifications" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param moreNotifications
         *     Neuer Wert der Eigenschaft "moreNotifications".
         */
        public PublishResponse.Builder<_B> withMoreNotifications(final Boolean moreNotifications) {
            this.moreNotifications = moreNotifications;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "notificationMessage" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param notificationMessage
         *     Neuer Wert der Eigenschaft "notificationMessage".
         */
        public PublishResponse.Builder<_B> withNotificationMessage(final JAXBElement<NotificationMessage> notificationMessage) {
            this.notificationMessage = notificationMessage;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "results" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param results
         *     Neuer Wert der Eigenschaft "results".
         */
        public PublishResponse.Builder<_B> withResults(final JAXBElement<ListOfStatusCode> results) {
            this.results = results;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfos" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfos
         *     Neuer Wert der Eigenschaft "diagnosticInfos".
         */
        public PublishResponse.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        @Override
        public PublishResponse build() {
            if (_storedValue == null) {
                return this.init(new PublishResponse());
            } else {
                return ((PublishResponse) _storedValue);
            }
        }

        public PublishResponse.Builder<_B> copyOf(final PublishResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishResponse.Builder<_B> copyOf(final PublishResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishResponse.Selector<PublishResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishResponse.Select _root() {
            return new PublishResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> availableSequenceNumbers = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> moreNotifications = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> notificationMessage = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> results = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> diagnosticInfos = null;

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
            if (this.subscriptionId!= null) {
                products.put("subscriptionId", this.subscriptionId.init());
            }
            if (this.availableSequenceNumbers!= null) {
                products.put("availableSequenceNumbers", this.availableSequenceNumbers.init());
            }
            if (this.moreNotifications!= null) {
                products.put("moreNotifications", this.moreNotifications.init());
            }
            if (this.notificationMessage!= null) {
                products.put("notificationMessage", this.notificationMessage.init());
            }
            if (this.results!= null) {
                products.put("results", this.results.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> availableSequenceNumbers() {
            return ((this.availableSequenceNumbers == null)?this.availableSequenceNumbers = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "availableSequenceNumbers"):this.availableSequenceNumbers);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> moreNotifications() {
            return ((this.moreNotifications == null)?this.moreNotifications = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "moreNotifications"):this.moreNotifications);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> notificationMessage() {
            return ((this.notificationMessage == null)?this.notificationMessage = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "notificationMessage"):this.notificationMessage);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> results() {
            return ((this.results == null)?this.results = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "results"):this.results);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, PublishResponse.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

    }

}
