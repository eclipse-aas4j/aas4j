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
 * <p>Java-Klasse für CreateSubscriptionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateSubscriptionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPublishingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLifetimeCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaxKeepAliveCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxNotificationsPerPublish" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PublishingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSubscriptionRequest", propOrder = {
    "requestHeader",
    "requestedPublishingInterval",
    "requestedLifetimeCount",
    "requestedMaxKeepAliveCount",
    "maxNotificationsPerPublish",
    "publishingEnabled",
    "priority"
})
public class CreateSubscriptionRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "RequestedPublishingInterval")
    protected Double requestedPublishingInterval;
    @XmlElement(name = "RequestedLifetimeCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestedLifetimeCount;
    @XmlElement(name = "RequestedMaxKeepAliveCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestedMaxKeepAliveCount;
    @XmlElement(name = "MaxNotificationsPerPublish")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxNotificationsPerPublish;
    @XmlElement(name = "PublishingEnabled")
    protected Boolean publishingEnabled;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "unsignedByte")
    protected Short priority;

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
     * Ruft den Wert der requestedPublishingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedPublishingInterval() {
        return requestedPublishingInterval;
    }

    /**
     * Legt den Wert der requestedPublishingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedPublishingInterval(Double value) {
        this.requestedPublishingInterval = value;
    }

    /**
     * Ruft den Wert der requestedLifetimeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedLifetimeCount() {
        return requestedLifetimeCount;
    }

    /**
     * Legt den Wert der requestedLifetimeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedLifetimeCount(Long value) {
        this.requestedLifetimeCount = value;
    }

    /**
     * Ruft den Wert der requestedMaxKeepAliveCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedMaxKeepAliveCount() {
        return requestedMaxKeepAliveCount;
    }

    /**
     * Legt den Wert der requestedMaxKeepAliveCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedMaxKeepAliveCount(Long value) {
        this.requestedMaxKeepAliveCount = value;
    }

    /**
     * Ruft den Wert der maxNotificationsPerPublish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxNotificationsPerPublish() {
        return maxNotificationsPerPublish;
    }

    /**
     * Legt den Wert der maxNotificationsPerPublish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxNotificationsPerPublish(Long value) {
        this.maxNotificationsPerPublish = value;
    }

    /**
     * Ruft den Wert der publishingEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishingEnabled() {
        return publishingEnabled;
    }

    /**
     * Legt den Wert der publishingEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishingEnabled(Boolean value) {
        this.publishingEnabled = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CreateSubscriptionRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.requestedPublishingInterval = this.requestedPublishingInterval;
        _other.requestedLifetimeCount = this.requestedLifetimeCount;
        _other.requestedMaxKeepAliveCount = this.requestedMaxKeepAliveCount;
        _other.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
        _other.publishingEnabled = this.publishingEnabled;
        _other.priority = this.priority;
    }

    public<_B >CreateSubscriptionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CreateSubscriptionRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CreateSubscriptionRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CreateSubscriptionRequest.Builder<Void> builder() {
        return new CreateSubscriptionRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CreateSubscriptionRequest.Builder<_B> copyOf(final CreateSubscriptionRequest _other) {
        final CreateSubscriptionRequest.Builder<_B> _newBuilder = new CreateSubscriptionRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CreateSubscriptionRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree requestedPublishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedPublishingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedPublishingIntervalPropertyTree!= null):((requestedPublishingIntervalPropertyTree == null)||(!requestedPublishingIntervalPropertyTree.isLeaf())))) {
            _other.requestedPublishingInterval = this.requestedPublishingInterval;
        }
        final PropertyTree requestedLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedLifetimeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedLifetimeCountPropertyTree!= null):((requestedLifetimeCountPropertyTree == null)||(!requestedLifetimeCountPropertyTree.isLeaf())))) {
            _other.requestedLifetimeCount = this.requestedLifetimeCount;
        }
        final PropertyTree requestedMaxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedMaxKeepAliveCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedMaxKeepAliveCountPropertyTree!= null):((requestedMaxKeepAliveCountPropertyTree == null)||(!requestedMaxKeepAliveCountPropertyTree.isLeaf())))) {
            _other.requestedMaxKeepAliveCount = this.requestedMaxKeepAliveCount;
        }
        final PropertyTree maxNotificationsPerPublishPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNotificationsPerPublish"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNotificationsPerPublishPropertyTree!= null):((maxNotificationsPerPublishPropertyTree == null)||(!maxNotificationsPerPublishPropertyTree.isLeaf())))) {
            _other.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
        }
        final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
            _other.publishingEnabled = this.publishingEnabled;
        }
        final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
            _other.priority = this.priority;
        }
    }

    public<_B >CreateSubscriptionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CreateSubscriptionRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CreateSubscriptionRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CreateSubscriptionRequest.Builder<_B> copyOf(final CreateSubscriptionRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CreateSubscriptionRequest.Builder<_B> _newBuilder = new CreateSubscriptionRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CreateSubscriptionRequest.Builder<Void> copyExcept(final CreateSubscriptionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CreateSubscriptionRequest.Builder<Void> copyOnly(final CreateSubscriptionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CreateSubscriptionRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Double requestedPublishingInterval;
        private Long requestedLifetimeCount;
        private Long requestedMaxKeepAliveCount;
        private Long maxNotificationsPerPublish;
        private Boolean publishingEnabled;
        private Short priority;

        public Builder(final _B _parentBuilder, final CreateSubscriptionRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.requestedPublishingInterval = _other.requestedPublishingInterval;
                    this.requestedLifetimeCount = _other.requestedLifetimeCount;
                    this.requestedMaxKeepAliveCount = _other.requestedMaxKeepAliveCount;
                    this.maxNotificationsPerPublish = _other.maxNotificationsPerPublish;
                    this.publishingEnabled = _other.publishingEnabled;
                    this.priority = _other.priority;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CreateSubscriptionRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree requestedPublishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedPublishingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedPublishingIntervalPropertyTree!= null):((requestedPublishingIntervalPropertyTree == null)||(!requestedPublishingIntervalPropertyTree.isLeaf())))) {
                        this.requestedPublishingInterval = _other.requestedPublishingInterval;
                    }
                    final PropertyTree requestedLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedLifetimeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedLifetimeCountPropertyTree!= null):((requestedLifetimeCountPropertyTree == null)||(!requestedLifetimeCountPropertyTree.isLeaf())))) {
                        this.requestedLifetimeCount = _other.requestedLifetimeCount;
                    }
                    final PropertyTree requestedMaxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedMaxKeepAliveCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedMaxKeepAliveCountPropertyTree!= null):((requestedMaxKeepAliveCountPropertyTree == null)||(!requestedMaxKeepAliveCountPropertyTree.isLeaf())))) {
                        this.requestedMaxKeepAliveCount = _other.requestedMaxKeepAliveCount;
                    }
                    final PropertyTree maxNotificationsPerPublishPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNotificationsPerPublish"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNotificationsPerPublishPropertyTree!= null):((maxNotificationsPerPublishPropertyTree == null)||(!maxNotificationsPerPublishPropertyTree.isLeaf())))) {
                        this.maxNotificationsPerPublish = _other.maxNotificationsPerPublish;
                    }
                    final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
                        this.publishingEnabled = _other.publishingEnabled;
                    }
                    final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
                        this.priority = _other.priority;
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

        protected<_P extends CreateSubscriptionRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.requestedPublishingInterval = this.requestedPublishingInterval;
            _product.requestedLifetimeCount = this.requestedLifetimeCount;
            _product.requestedMaxKeepAliveCount = this.requestedMaxKeepAliveCount;
            _product.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
            _product.publishingEnabled = this.publishingEnabled;
            _product.priority = this.priority;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CreateSubscriptionRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedPublishingInterval" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedPublishingInterval
         *     Neuer Wert der Eigenschaft "requestedPublishingInterval".
         */
        public CreateSubscriptionRequest.Builder<_B> withRequestedPublishingInterval(final Double requestedPublishingInterval) {
            this.requestedPublishingInterval = requestedPublishingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedLifetimeCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedLifetimeCount
         *     Neuer Wert der Eigenschaft "requestedLifetimeCount".
         */
        public CreateSubscriptionRequest.Builder<_B> withRequestedLifetimeCount(final Long requestedLifetimeCount) {
            this.requestedLifetimeCount = requestedLifetimeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedMaxKeepAliveCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedMaxKeepAliveCount
         *     Neuer Wert der Eigenschaft "requestedMaxKeepAliveCount".
         */
        public CreateSubscriptionRequest.Builder<_B> withRequestedMaxKeepAliveCount(final Long requestedMaxKeepAliveCount) {
            this.requestedMaxKeepAliveCount = requestedMaxKeepAliveCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxNotificationsPerPublish" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxNotificationsPerPublish
         *     Neuer Wert der Eigenschaft "maxNotificationsPerPublish".
         */
        public CreateSubscriptionRequest.Builder<_B> withMaxNotificationsPerPublish(final Long maxNotificationsPerPublish) {
            this.maxNotificationsPerPublish = maxNotificationsPerPublish;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingEnabled" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingEnabled
         *     Neuer Wert der Eigenschaft "publishingEnabled".
         */
        public CreateSubscriptionRequest.Builder<_B> withPublishingEnabled(final Boolean publishingEnabled) {
            this.publishingEnabled = publishingEnabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "priority" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param priority
         *     Neuer Wert der Eigenschaft "priority".
         */
        public CreateSubscriptionRequest.Builder<_B> withPriority(final Short priority) {
            this.priority = priority;
            return this;
        }

        @Override
        public CreateSubscriptionRequest build() {
            if (_storedValue == null) {
                return this.init(new CreateSubscriptionRequest());
            } else {
                return ((CreateSubscriptionRequest) _storedValue);
            }
        }

        public CreateSubscriptionRequest.Builder<_B> copyOf(final CreateSubscriptionRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CreateSubscriptionRequest.Builder<_B> copyOf(final CreateSubscriptionRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CreateSubscriptionRequest.Selector<CreateSubscriptionRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CreateSubscriptionRequest.Select _root() {
            return new CreateSubscriptionRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedPublishingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedLifetimeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedMaxKeepAliveCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> maxNotificationsPerPublish = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> publishingEnabled = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> priority = null;

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
            if (this.requestedPublishingInterval!= null) {
                products.put("requestedPublishingInterval", this.requestedPublishingInterval.init());
            }
            if (this.requestedLifetimeCount!= null) {
                products.put("requestedLifetimeCount", this.requestedLifetimeCount.init());
            }
            if (this.requestedMaxKeepAliveCount!= null) {
                products.put("requestedMaxKeepAliveCount", this.requestedMaxKeepAliveCount.init());
            }
            if (this.maxNotificationsPerPublish!= null) {
                products.put("maxNotificationsPerPublish", this.maxNotificationsPerPublish.init());
            }
            if (this.publishingEnabled!= null) {
                products.put("publishingEnabled", this.publishingEnabled.init());
            }
            if (this.priority!= null) {
                products.put("priority", this.priority.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedPublishingInterval() {
            return ((this.requestedPublishingInterval == null)?this.requestedPublishingInterval = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "requestedPublishingInterval"):this.requestedPublishingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedLifetimeCount() {
            return ((this.requestedLifetimeCount == null)?this.requestedLifetimeCount = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "requestedLifetimeCount"):this.requestedLifetimeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> requestedMaxKeepAliveCount() {
            return ((this.requestedMaxKeepAliveCount == null)?this.requestedMaxKeepAliveCount = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "requestedMaxKeepAliveCount"):this.requestedMaxKeepAliveCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> maxNotificationsPerPublish() {
            return ((this.maxNotificationsPerPublish == null)?this.maxNotificationsPerPublish = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "maxNotificationsPerPublish"):this.maxNotificationsPerPublish);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> publishingEnabled() {
            return ((this.publishingEnabled == null)?this.publishingEnabled = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "publishingEnabled"):this.publishingEnabled);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>> priority() {
            return ((this.priority == null)?this.priority = new com.kscs.util.jaxb.Selector<TRoot, CreateSubscriptionRequest.Selector<TRoot, TParent>>(this._root, this, "priority"):this.priority);
        }

    }

}
