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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für SetPublishingModeRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetPublishingModeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="PublishingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPublishingModeRequest", propOrder = {
    "requestHeader",
    "publishingEnabled",
    "subscriptionIds"
})
public class SetPublishingModeRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "PublishingEnabled")
    protected Boolean publishingEnabled;
    @XmlElementRef(name = "SubscriptionIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> subscriptionIds;

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
     * Ruft den Wert der subscriptionIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Legt den Wert der subscriptionIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setSubscriptionIds(JAXBElement<ListOfUInt32> value) {
        this.subscriptionIds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SetPublishingModeRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.publishingEnabled = this.publishingEnabled;
        _other.subscriptionIds = this.subscriptionIds;
    }

    public<_B >SetPublishingModeRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SetPublishingModeRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public SetPublishingModeRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SetPublishingModeRequest.Builder<Void> builder() {
        return new SetPublishingModeRequest.Builder<Void>(null, null, false);
    }

    public static<_B >SetPublishingModeRequest.Builder<_B> copyOf(final SetPublishingModeRequest _other) {
        final SetPublishingModeRequest.Builder<_B> _newBuilder = new SetPublishingModeRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SetPublishingModeRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
            _other.publishingEnabled = this.publishingEnabled;
        }
        final PropertyTree subscriptionIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdsPropertyTree!= null):((subscriptionIdsPropertyTree == null)||(!subscriptionIdsPropertyTree.isLeaf())))) {
            _other.subscriptionIds = this.subscriptionIds;
        }
    }

    public<_B >SetPublishingModeRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SetPublishingModeRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SetPublishingModeRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SetPublishingModeRequest.Builder<_B> copyOf(final SetPublishingModeRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SetPublishingModeRequest.Builder<_B> _newBuilder = new SetPublishingModeRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SetPublishingModeRequest.Builder<Void> copyExcept(final SetPublishingModeRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SetPublishingModeRequest.Builder<Void> copyOnly(final SetPublishingModeRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SetPublishingModeRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Boolean publishingEnabled;
        private JAXBElement<ListOfUInt32> subscriptionIds;

        public Builder(final _B _parentBuilder, final SetPublishingModeRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.publishingEnabled = _other.publishingEnabled;
                    this.subscriptionIds = _other.subscriptionIds;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SetPublishingModeRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
                        this.publishingEnabled = _other.publishingEnabled;
                    }
                    final PropertyTree subscriptionIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdsPropertyTree!= null):((subscriptionIdsPropertyTree == null)||(!subscriptionIdsPropertyTree.isLeaf())))) {
                        this.subscriptionIds = _other.subscriptionIds;
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

        protected<_P extends SetPublishingModeRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.publishingEnabled = this.publishingEnabled;
            _product.subscriptionIds = this.subscriptionIds;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public SetPublishingModeRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingEnabled" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingEnabled
         *     Neuer Wert der Eigenschaft "publishingEnabled".
         */
        public SetPublishingModeRequest.Builder<_B> withPublishingEnabled(final Boolean publishingEnabled) {
            this.publishingEnabled = publishingEnabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionIds" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param subscriptionIds
         *     Neuer Wert der Eigenschaft "subscriptionIds".
         */
        public SetPublishingModeRequest.Builder<_B> withSubscriptionIds(final JAXBElement<ListOfUInt32> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        @Override
        public SetPublishingModeRequest build() {
            if (_storedValue == null) {
                return this.init(new SetPublishingModeRequest());
            } else {
                return ((SetPublishingModeRequest) _storedValue);
            }
        }

        public SetPublishingModeRequest.Builder<_B> copyOf(final SetPublishingModeRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public SetPublishingModeRequest.Builder<_B> copyOf(final SetPublishingModeRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SetPublishingModeRequest.Selector<SetPublishingModeRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SetPublishingModeRequest.Select _root() {
            return new SetPublishingModeRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> publishingEnabled = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> subscriptionIds = null;

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
            if (this.publishingEnabled!= null) {
                products.put("publishingEnabled", this.publishingEnabled.init());
            }
            if (this.subscriptionIds!= null) {
                products.put("subscriptionIds", this.subscriptionIds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> publishingEnabled() {
            return ((this.publishingEnabled == null)?this.publishingEnabled = new com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>>(this._root, this, "publishingEnabled"):this.publishingEnabled);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>> subscriptionIds() {
            return ((this.subscriptionIds == null)?this.subscriptionIds = new com.kscs.util.jaxb.Selector<TRoot, SetPublishingModeRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionIds"):this.subscriptionIds);
        }

    }

}
