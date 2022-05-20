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
 * <p>Java-Klasse für CreateMonitoredItemsRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateMonitoredItemsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TimestampsToReturn" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TimestampsToReturn" minOccurs="0"/&gt;
 *         &lt;element name="ItemsToCreate" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfMonitoredItemCreateRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMonitoredItemsRequest", propOrder = {
    "requestHeader",
    "subscriptionId",
    "timestampsToReturn",
    "itemsToCreate"
})
public class CreateMonitoredItemsRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "TimestampsToReturn")
    @XmlSchemaType(name = "string")
    protected TimestampsToReturn timestampsToReturn;
    @XmlElementRef(name = "ItemsToCreate", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfMonitoredItemCreateRequest> itemsToCreate;

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
     * Ruft den Wert der timestampsToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampsToReturn }
     *     
     */
    public TimestampsToReturn getTimestampsToReturn() {
        return timestampsToReturn;
    }

    /**
     * Legt den Wert der timestampsToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampsToReturn }
     *     
     */
    public void setTimestampsToReturn(TimestampsToReturn value) {
        this.timestampsToReturn = value;
    }

    /**
     * Ruft den Wert der itemsToCreate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemCreateRequest }{@code >}
     *     
     */
    public JAXBElement<ListOfMonitoredItemCreateRequest> getItemsToCreate() {
        return itemsToCreate;
    }

    /**
     * Legt den Wert der itemsToCreate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemCreateRequest }{@code >}
     *     
     */
    public void setItemsToCreate(JAXBElement<ListOfMonitoredItemCreateRequest> value) {
        this.itemsToCreate = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CreateMonitoredItemsRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.subscriptionId = this.subscriptionId;
        _other.timestampsToReturn = this.timestampsToReturn;
        _other.itemsToCreate = this.itemsToCreate;
    }

    public<_B >CreateMonitoredItemsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CreateMonitoredItemsRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CreateMonitoredItemsRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CreateMonitoredItemsRequest.Builder<Void> builder() {
        return new CreateMonitoredItemsRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CreateMonitoredItemsRequest.Builder<_B> copyOf(final CreateMonitoredItemsRequest _other) {
        final CreateMonitoredItemsRequest.Builder<_B> _newBuilder = new CreateMonitoredItemsRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CreateMonitoredItemsRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
            _other.timestampsToReturn = this.timestampsToReturn;
        }
        final PropertyTree itemsToCreatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemsToCreate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemsToCreatePropertyTree!= null):((itemsToCreatePropertyTree == null)||(!itemsToCreatePropertyTree.isLeaf())))) {
            _other.itemsToCreate = this.itemsToCreate;
        }
    }

    public<_B >CreateMonitoredItemsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CreateMonitoredItemsRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CreateMonitoredItemsRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CreateMonitoredItemsRequest.Builder<_B> copyOf(final CreateMonitoredItemsRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CreateMonitoredItemsRequest.Builder<_B> _newBuilder = new CreateMonitoredItemsRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CreateMonitoredItemsRequest.Builder<Void> copyExcept(final CreateMonitoredItemsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CreateMonitoredItemsRequest.Builder<Void> copyOnly(final CreateMonitoredItemsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CreateMonitoredItemsRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long subscriptionId;
        private TimestampsToReturn timestampsToReturn;
        private JAXBElement<ListOfMonitoredItemCreateRequest> itemsToCreate;

        public Builder(final _B _parentBuilder, final CreateMonitoredItemsRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.subscriptionId = _other.subscriptionId;
                    this.timestampsToReturn = _other.timestampsToReturn;
                    this.itemsToCreate = _other.itemsToCreate;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CreateMonitoredItemsRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
                        this.subscriptionId = _other.subscriptionId;
                    }
                    final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
                        this.timestampsToReturn = _other.timestampsToReturn;
                    }
                    final PropertyTree itemsToCreatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemsToCreate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemsToCreatePropertyTree!= null):((itemsToCreatePropertyTree == null)||(!itemsToCreatePropertyTree.isLeaf())))) {
                        this.itemsToCreate = _other.itemsToCreate;
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

        protected<_P extends CreateMonitoredItemsRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.subscriptionId = this.subscriptionId;
            _product.timestampsToReturn = this.timestampsToReturn;
            _product.itemsToCreate = this.itemsToCreate;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CreateMonitoredItemsRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param subscriptionId
         *     Neuer Wert der Eigenschaft "subscriptionId".
         */
        public CreateMonitoredItemsRequest.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestampsToReturn" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param timestampsToReturn
         *     Neuer Wert der Eigenschaft "timestampsToReturn".
         */
        public CreateMonitoredItemsRequest.Builder<_B> withTimestampsToReturn(final TimestampsToReturn timestampsToReturn) {
            this.timestampsToReturn = timestampsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "itemsToCreate" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param itemsToCreate
         *     Neuer Wert der Eigenschaft "itemsToCreate".
         */
        public CreateMonitoredItemsRequest.Builder<_B> withItemsToCreate(final JAXBElement<ListOfMonitoredItemCreateRequest> itemsToCreate) {
            this.itemsToCreate = itemsToCreate;
            return this;
        }

        @Override
        public CreateMonitoredItemsRequest build() {
            if (_storedValue == null) {
                return this.init(new CreateMonitoredItemsRequest());
            } else {
                return ((CreateMonitoredItemsRequest) _storedValue);
            }
        }

        public CreateMonitoredItemsRequest.Builder<_B> copyOf(final CreateMonitoredItemsRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CreateMonitoredItemsRequest.Builder<_B> copyOf(final CreateMonitoredItemsRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CreateMonitoredItemsRequest.Selector<CreateMonitoredItemsRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CreateMonitoredItemsRequest.Select _root() {
            return new CreateMonitoredItemsRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> timestampsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> itemsToCreate = null;

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
            if (this.subscriptionId!= null) {
                products.put("subscriptionId", this.subscriptionId.init());
            }
            if (this.timestampsToReturn!= null) {
                products.put("timestampsToReturn", this.timestampsToReturn.init());
            }
            if (this.itemsToCreate!= null) {
                products.put("itemsToCreate", this.itemsToCreate.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> timestampsToReturn() {
            return ((this.timestampsToReturn == null)?this.timestampsToReturn = new com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "timestampsToReturn"):this.timestampsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>> itemsToCreate() {
            return ((this.itemsToCreate == null)?this.itemsToCreate = new com.kscs.util.jaxb.Selector<TRoot, CreateMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "itemsToCreate"):this.itemsToCreate);
        }

    }

}
