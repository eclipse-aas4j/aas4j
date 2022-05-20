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
 * <p>Java-Klasse für ModifyMonitoredItemsRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModifyMonitoredItemsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TimestampsToReturn" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TimestampsToReturn" minOccurs="0"/&gt;
 *         &lt;element name="ItemsToModify" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfMonitoredItemModifyRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMonitoredItemsRequest", propOrder = {
    "requestHeader",
    "subscriptionId",
    "timestampsToReturn",
    "itemsToModify"
})
public class ModifyMonitoredItemsRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "TimestampsToReturn")
    @XmlSchemaType(name = "string")
    protected TimestampsToReturn timestampsToReturn;
    @XmlElementRef(name = "ItemsToModify", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfMonitoredItemModifyRequest> itemsToModify;

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
     * Ruft den Wert der itemsToModify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemModifyRequest }{@code >}
     *     
     */
    public JAXBElement<ListOfMonitoredItemModifyRequest> getItemsToModify() {
        return itemsToModify;
    }

    /**
     * Legt den Wert der itemsToModify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemModifyRequest }{@code >}
     *     
     */
    public void setItemsToModify(JAXBElement<ListOfMonitoredItemModifyRequest> value) {
        this.itemsToModify = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ModifyMonitoredItemsRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.subscriptionId = this.subscriptionId;
        _other.timestampsToReturn = this.timestampsToReturn;
        _other.itemsToModify = this.itemsToModify;
    }

    public<_B >ModifyMonitoredItemsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ModifyMonitoredItemsRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ModifyMonitoredItemsRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ModifyMonitoredItemsRequest.Builder<Void> builder() {
        return new ModifyMonitoredItemsRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ModifyMonitoredItemsRequest.Builder<_B> copyOf(final ModifyMonitoredItemsRequest _other) {
        final ModifyMonitoredItemsRequest.Builder<_B> _newBuilder = new ModifyMonitoredItemsRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ModifyMonitoredItemsRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
        final PropertyTree itemsToModifyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemsToModify"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemsToModifyPropertyTree!= null):((itemsToModifyPropertyTree == null)||(!itemsToModifyPropertyTree.isLeaf())))) {
            _other.itemsToModify = this.itemsToModify;
        }
    }

    public<_B >ModifyMonitoredItemsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ModifyMonitoredItemsRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ModifyMonitoredItemsRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ModifyMonitoredItemsRequest.Builder<_B> copyOf(final ModifyMonitoredItemsRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ModifyMonitoredItemsRequest.Builder<_B> _newBuilder = new ModifyMonitoredItemsRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ModifyMonitoredItemsRequest.Builder<Void> copyExcept(final ModifyMonitoredItemsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ModifyMonitoredItemsRequest.Builder<Void> copyOnly(final ModifyMonitoredItemsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ModifyMonitoredItemsRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long subscriptionId;
        private TimestampsToReturn timestampsToReturn;
        private JAXBElement<ListOfMonitoredItemModifyRequest> itemsToModify;

        public Builder(final _B _parentBuilder, final ModifyMonitoredItemsRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.subscriptionId = _other.subscriptionId;
                    this.timestampsToReturn = _other.timestampsToReturn;
                    this.itemsToModify = _other.itemsToModify;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ModifyMonitoredItemsRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree itemsToModifyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemsToModify"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemsToModifyPropertyTree!= null):((itemsToModifyPropertyTree == null)||(!itemsToModifyPropertyTree.isLeaf())))) {
                        this.itemsToModify = _other.itemsToModify;
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

        protected<_P extends ModifyMonitoredItemsRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.subscriptionId = this.subscriptionId;
            _product.timestampsToReturn = this.timestampsToReturn;
            _product.itemsToModify = this.itemsToModify;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public ModifyMonitoredItemsRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
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
        public ModifyMonitoredItemsRequest.Builder<_B> withSubscriptionId(final Long subscriptionId) {
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
        public ModifyMonitoredItemsRequest.Builder<_B> withTimestampsToReturn(final TimestampsToReturn timestampsToReturn) {
            this.timestampsToReturn = timestampsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "itemsToModify" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param itemsToModify
         *     Neuer Wert der Eigenschaft "itemsToModify".
         */
        public ModifyMonitoredItemsRequest.Builder<_B> withItemsToModify(final JAXBElement<ListOfMonitoredItemModifyRequest> itemsToModify) {
            this.itemsToModify = itemsToModify;
            return this;
        }

        @Override
        public ModifyMonitoredItemsRequest build() {
            if (_storedValue == null) {
                return this.init(new ModifyMonitoredItemsRequest());
            } else {
                return ((ModifyMonitoredItemsRequest) _storedValue);
            }
        }

        public ModifyMonitoredItemsRequest.Builder<_B> copyOf(final ModifyMonitoredItemsRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ModifyMonitoredItemsRequest.Builder<_B> copyOf(final ModifyMonitoredItemsRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ModifyMonitoredItemsRequest.Selector<ModifyMonitoredItemsRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ModifyMonitoredItemsRequest.Select _root() {
            return new ModifyMonitoredItemsRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> timestampsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> itemsToModify = null;

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
            if (this.itemsToModify!= null) {
                products.put("itemsToModify", this.itemsToModify.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> timestampsToReturn() {
            return ((this.timestampsToReturn == null)?this.timestampsToReturn = new com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "timestampsToReturn"):this.timestampsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>> itemsToModify() {
            return ((this.itemsToModify == null)?this.itemsToModify = new com.kscs.util.jaxb.Selector<TRoot, ModifyMonitoredItemsRequest.Selector<TRoot, TParent>>(this._root, this, "itemsToModify"):this.itemsToModify);
        }

    }

}
