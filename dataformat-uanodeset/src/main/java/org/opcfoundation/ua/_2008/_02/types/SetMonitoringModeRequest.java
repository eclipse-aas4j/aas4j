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
 * <p>Java-Klasse für SetMonitoringModeRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetMonitoringModeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringMode" minOccurs="0"/&gt;
 *         &lt;element name="MonitoredItemIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMonitoringModeRequest", propOrder = {
    "requestHeader",
    "subscriptionId",
    "monitoringMode",
    "monitoredItemIds"
})
public class SetMonitoringModeRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "MonitoringMode")
    @XmlSchemaType(name = "string")
    protected MonitoringMode monitoringMode;
    @XmlElementRef(name = "MonitoredItemIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> monitoredItemIds;

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
     * Ruft den Wert der monitoringMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringMode }
     *     
     */
    public MonitoringMode getMonitoringMode() {
        return monitoringMode;
    }

    /**
     * Legt den Wert der monitoringMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringMode }
     *     
     */
    public void setMonitoringMode(MonitoringMode value) {
        this.monitoringMode = value;
    }

    /**
     * Ruft den Wert der monitoredItemIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getMonitoredItemIds() {
        return monitoredItemIds;
    }

    /**
     * Legt den Wert der monitoredItemIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setMonitoredItemIds(JAXBElement<ListOfUInt32> value) {
        this.monitoredItemIds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SetMonitoringModeRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.subscriptionId = this.subscriptionId;
        _other.monitoringMode = this.monitoringMode;
        _other.monitoredItemIds = this.monitoredItemIds;
    }

    public<_B >SetMonitoringModeRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SetMonitoringModeRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public SetMonitoringModeRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SetMonitoringModeRequest.Builder<Void> builder() {
        return new SetMonitoringModeRequest.Builder<Void>(null, null, false);
    }

    public static<_B >SetMonitoringModeRequest.Builder<_B> copyOf(final SetMonitoringModeRequest _other) {
        final SetMonitoringModeRequest.Builder<_B> _newBuilder = new SetMonitoringModeRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SetMonitoringModeRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree monitoringModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringModePropertyTree!= null):((monitoringModePropertyTree == null)||(!monitoringModePropertyTree.isLeaf())))) {
            _other.monitoringMode = this.monitoringMode;
        }
        final PropertyTree monitoredItemIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdsPropertyTree!= null):((monitoredItemIdsPropertyTree == null)||(!monitoredItemIdsPropertyTree.isLeaf())))) {
            _other.monitoredItemIds = this.monitoredItemIds;
        }
    }

    public<_B >SetMonitoringModeRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SetMonitoringModeRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SetMonitoringModeRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SetMonitoringModeRequest.Builder<_B> copyOf(final SetMonitoringModeRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SetMonitoringModeRequest.Builder<_B> _newBuilder = new SetMonitoringModeRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SetMonitoringModeRequest.Builder<Void> copyExcept(final SetMonitoringModeRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SetMonitoringModeRequest.Builder<Void> copyOnly(final SetMonitoringModeRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SetMonitoringModeRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long subscriptionId;
        private MonitoringMode monitoringMode;
        private JAXBElement<ListOfUInt32> monitoredItemIds;

        public Builder(final _B _parentBuilder, final SetMonitoringModeRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.subscriptionId = _other.subscriptionId;
                    this.monitoringMode = _other.monitoringMode;
                    this.monitoredItemIds = _other.monitoredItemIds;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SetMonitoringModeRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree monitoringModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringModePropertyTree!= null):((monitoringModePropertyTree == null)||(!monitoringModePropertyTree.isLeaf())))) {
                        this.monitoringMode = _other.monitoringMode;
                    }
                    final PropertyTree monitoredItemIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdsPropertyTree!= null):((monitoredItemIdsPropertyTree == null)||(!monitoredItemIdsPropertyTree.isLeaf())))) {
                        this.monitoredItemIds = _other.monitoredItemIds;
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

        protected<_P extends SetMonitoringModeRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.subscriptionId = this.subscriptionId;
            _product.monitoringMode = this.monitoringMode;
            _product.monitoredItemIds = this.monitoredItemIds;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public SetMonitoringModeRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
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
        public SetMonitoringModeRequest.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoringMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param monitoringMode
         *     Neuer Wert der Eigenschaft "monitoringMode".
         */
        public SetMonitoringModeRequest.Builder<_B> withMonitoringMode(final MonitoringMode monitoringMode) {
            this.monitoringMode = monitoringMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemIds" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param monitoredItemIds
         *     Neuer Wert der Eigenschaft "monitoredItemIds".
         */
        public SetMonitoringModeRequest.Builder<_B> withMonitoredItemIds(final JAXBElement<ListOfUInt32> monitoredItemIds) {
            this.monitoredItemIds = monitoredItemIds;
            return this;
        }

        @Override
        public SetMonitoringModeRequest build() {
            if (_storedValue == null) {
                return this.init(new SetMonitoringModeRequest());
            } else {
                return ((SetMonitoringModeRequest) _storedValue);
            }
        }

        public SetMonitoringModeRequest.Builder<_B> copyOf(final SetMonitoringModeRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public SetMonitoringModeRequest.Builder<_B> copyOf(final SetMonitoringModeRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SetMonitoringModeRequest.Selector<SetMonitoringModeRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SetMonitoringModeRequest.Select _root() {
            return new SetMonitoringModeRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> monitoringMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> monitoredItemIds = null;

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
            if (this.monitoringMode!= null) {
                products.put("monitoringMode", this.monitoringMode.init());
            }
            if (this.monitoredItemIds!= null) {
                products.put("monitoredItemIds", this.monitoredItemIds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> monitoringMode() {
            return ((this.monitoringMode == null)?this.monitoringMode = new com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>>(this._root, this, "monitoringMode"):this.monitoringMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>> monitoredItemIds() {
            return ((this.monitoredItemIds == null)?this.monitoredItemIds = new com.kscs.util.jaxb.Selector<TRoot, SetMonitoringModeRequest.Selector<TRoot, TParent>>(this._root, this, "monitoredItemIds"):this.monitoredItemIds);
        }

    }

}
