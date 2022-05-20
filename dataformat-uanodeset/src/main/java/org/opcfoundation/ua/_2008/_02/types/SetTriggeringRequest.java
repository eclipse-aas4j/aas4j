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
 * <p>Java-Klasse für SetTriggeringRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetTriggeringRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TriggeringItemId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="LinksToAdd" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *         &lt;element name="LinksToRemove" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTriggeringRequest", propOrder = {
    "requestHeader",
    "subscriptionId",
    "triggeringItemId",
    "linksToAdd",
    "linksToRemove"
})
public class SetTriggeringRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "TriggeringItemId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long triggeringItemId;
    @XmlElementRef(name = "LinksToAdd", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> linksToAdd;
    @XmlElementRef(name = "LinksToRemove", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> linksToRemove;

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
     * Ruft den Wert der triggeringItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTriggeringItemId() {
        return triggeringItemId;
    }

    /**
     * Legt den Wert der triggeringItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTriggeringItemId(Long value) {
        this.triggeringItemId = value;
    }

    /**
     * Ruft den Wert der linksToAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getLinksToAdd() {
        return linksToAdd;
    }

    /**
     * Legt den Wert der linksToAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setLinksToAdd(JAXBElement<ListOfUInt32> value) {
        this.linksToAdd = value;
    }

    /**
     * Ruft den Wert der linksToRemove-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getLinksToRemove() {
        return linksToRemove;
    }

    /**
     * Legt den Wert der linksToRemove-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setLinksToRemove(JAXBElement<ListOfUInt32> value) {
        this.linksToRemove = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SetTriggeringRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.subscriptionId = this.subscriptionId;
        _other.triggeringItemId = this.triggeringItemId;
        _other.linksToAdd = this.linksToAdd;
        _other.linksToRemove = this.linksToRemove;
    }

    public<_B >SetTriggeringRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SetTriggeringRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public SetTriggeringRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SetTriggeringRequest.Builder<Void> builder() {
        return new SetTriggeringRequest.Builder<Void>(null, null, false);
    }

    public static<_B >SetTriggeringRequest.Builder<_B> copyOf(final SetTriggeringRequest _other) {
        final SetTriggeringRequest.Builder<_B> _newBuilder = new SetTriggeringRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SetTriggeringRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree triggeringItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("triggeringItemId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(triggeringItemIdPropertyTree!= null):((triggeringItemIdPropertyTree == null)||(!triggeringItemIdPropertyTree.isLeaf())))) {
            _other.triggeringItemId = this.triggeringItemId;
        }
        final PropertyTree linksToAddPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linksToAdd"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linksToAddPropertyTree!= null):((linksToAddPropertyTree == null)||(!linksToAddPropertyTree.isLeaf())))) {
            _other.linksToAdd = this.linksToAdd;
        }
        final PropertyTree linksToRemovePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linksToRemove"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linksToRemovePropertyTree!= null):((linksToRemovePropertyTree == null)||(!linksToRemovePropertyTree.isLeaf())))) {
            _other.linksToRemove = this.linksToRemove;
        }
    }

    public<_B >SetTriggeringRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SetTriggeringRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SetTriggeringRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SetTriggeringRequest.Builder<_B> copyOf(final SetTriggeringRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SetTriggeringRequest.Builder<_B> _newBuilder = new SetTriggeringRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SetTriggeringRequest.Builder<Void> copyExcept(final SetTriggeringRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SetTriggeringRequest.Builder<Void> copyOnly(final SetTriggeringRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SetTriggeringRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long subscriptionId;
        private Long triggeringItemId;
        private JAXBElement<ListOfUInt32> linksToAdd;
        private JAXBElement<ListOfUInt32> linksToRemove;

        public Builder(final _B _parentBuilder, final SetTriggeringRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.subscriptionId = _other.subscriptionId;
                    this.triggeringItemId = _other.triggeringItemId;
                    this.linksToAdd = _other.linksToAdd;
                    this.linksToRemove = _other.linksToRemove;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SetTriggeringRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree triggeringItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("triggeringItemId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(triggeringItemIdPropertyTree!= null):((triggeringItemIdPropertyTree == null)||(!triggeringItemIdPropertyTree.isLeaf())))) {
                        this.triggeringItemId = _other.triggeringItemId;
                    }
                    final PropertyTree linksToAddPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linksToAdd"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linksToAddPropertyTree!= null):((linksToAddPropertyTree == null)||(!linksToAddPropertyTree.isLeaf())))) {
                        this.linksToAdd = _other.linksToAdd;
                    }
                    final PropertyTree linksToRemovePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("linksToRemove"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(linksToRemovePropertyTree!= null):((linksToRemovePropertyTree == null)||(!linksToRemovePropertyTree.isLeaf())))) {
                        this.linksToRemove = _other.linksToRemove;
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

        protected<_P extends SetTriggeringRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.subscriptionId = this.subscriptionId;
            _product.triggeringItemId = this.triggeringItemId;
            _product.linksToAdd = this.linksToAdd;
            _product.linksToRemove = this.linksToRemove;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public SetTriggeringRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
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
        public SetTriggeringRequest.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "triggeringItemId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param triggeringItemId
         *     Neuer Wert der Eigenschaft "triggeringItemId".
         */
        public SetTriggeringRequest.Builder<_B> withTriggeringItemId(final Long triggeringItemId) {
            this.triggeringItemId = triggeringItemId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "linksToAdd" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param linksToAdd
         *     Neuer Wert der Eigenschaft "linksToAdd".
         */
        public SetTriggeringRequest.Builder<_B> withLinksToAdd(final JAXBElement<ListOfUInt32> linksToAdd) {
            this.linksToAdd = linksToAdd;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "linksToRemove" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param linksToRemove
         *     Neuer Wert der Eigenschaft "linksToRemove".
         */
        public SetTriggeringRequest.Builder<_B> withLinksToRemove(final JAXBElement<ListOfUInt32> linksToRemove) {
            this.linksToRemove = linksToRemove;
            return this;
        }

        @Override
        public SetTriggeringRequest build() {
            if (_storedValue == null) {
                return this.init(new SetTriggeringRequest());
            } else {
                return ((SetTriggeringRequest) _storedValue);
            }
        }

        public SetTriggeringRequest.Builder<_B> copyOf(final SetTriggeringRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public SetTriggeringRequest.Builder<_B> copyOf(final SetTriggeringRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SetTriggeringRequest.Selector<SetTriggeringRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SetTriggeringRequest.Select _root() {
            return new SetTriggeringRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> triggeringItemId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> linksToAdd = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> linksToRemove = null;

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
            if (this.triggeringItemId!= null) {
                products.put("triggeringItemId", this.triggeringItemId.init());
            }
            if (this.linksToAdd!= null) {
                products.put("linksToAdd", this.linksToAdd.init());
            }
            if (this.linksToRemove!= null) {
                products.put("linksToRemove", this.linksToRemove.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> triggeringItemId() {
            return ((this.triggeringItemId == null)?this.triggeringItemId = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>>(this._root, this, "triggeringItemId"):this.triggeringItemId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> linksToAdd() {
            return ((this.linksToAdd == null)?this.linksToAdd = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>>(this._root, this, "linksToAdd"):this.linksToAdd);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>> linksToRemove() {
            return ((this.linksToRemove == null)?this.linksToRemove = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringRequest.Selector<TRoot, TParent>>(this._root, this, "linksToRemove"):this.linksToRemove);
        }

    }

}
