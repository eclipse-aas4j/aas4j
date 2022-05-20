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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für PublishRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionAcknowledgements" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSubscriptionAcknowledgement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishRequest", propOrder = {
    "requestHeader",
    "subscriptionAcknowledgements"
})
public class PublishRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "SubscriptionAcknowledgements", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSubscriptionAcknowledgement> subscriptionAcknowledgements;

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
     * Ruft den Wert der subscriptionAcknowledgements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSubscriptionAcknowledgement }{@code >}
     *     
     */
    public JAXBElement<ListOfSubscriptionAcknowledgement> getSubscriptionAcknowledgements() {
        return subscriptionAcknowledgements;
    }

    /**
     * Legt den Wert der subscriptionAcknowledgements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSubscriptionAcknowledgement }{@code >}
     *     
     */
    public void setSubscriptionAcknowledgements(JAXBElement<ListOfSubscriptionAcknowledgement> value) {
        this.subscriptionAcknowledgements = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.subscriptionAcknowledgements = this.subscriptionAcknowledgements;
    }

    public<_B >PublishRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public PublishRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishRequest.Builder<Void> builder() {
        return new PublishRequest.Builder<Void>(null, null, false);
    }

    public static<_B >PublishRequest.Builder<_B> copyOf(final PublishRequest _other) {
        final PublishRequest.Builder<_B> _newBuilder = new PublishRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree subscriptionAcknowledgementsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionAcknowledgements"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionAcknowledgementsPropertyTree!= null):((subscriptionAcknowledgementsPropertyTree == null)||(!subscriptionAcknowledgementsPropertyTree.isLeaf())))) {
            _other.subscriptionAcknowledgements = this.subscriptionAcknowledgements;
        }
    }

    public<_B >PublishRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PublishRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishRequest.Builder<_B> copyOf(final PublishRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishRequest.Builder<_B> _newBuilder = new PublishRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishRequest.Builder<Void> copyExcept(final PublishRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishRequest.Builder<Void> copyOnly(final PublishRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PublishRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfSubscriptionAcknowledgement> subscriptionAcknowledgements;

        public Builder(final _B _parentBuilder, final PublishRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.subscriptionAcknowledgements = _other.subscriptionAcknowledgements;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PublishRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree subscriptionAcknowledgementsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionAcknowledgements"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionAcknowledgementsPropertyTree!= null):((subscriptionAcknowledgementsPropertyTree == null)||(!subscriptionAcknowledgementsPropertyTree.isLeaf())))) {
                        this.subscriptionAcknowledgements = _other.subscriptionAcknowledgements;
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

        protected<_P extends PublishRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.subscriptionAcknowledgements = this.subscriptionAcknowledgements;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public PublishRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionAcknowledgements" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscriptionAcknowledgements
         *     Neuer Wert der Eigenschaft "subscriptionAcknowledgements".
         */
        public PublishRequest.Builder<_B> withSubscriptionAcknowledgements(final JAXBElement<ListOfSubscriptionAcknowledgement> subscriptionAcknowledgements) {
            this.subscriptionAcknowledgements = subscriptionAcknowledgements;
            return this;
        }

        @Override
        public PublishRequest build() {
            if (_storedValue == null) {
                return this.init(new PublishRequest());
            } else {
                return ((PublishRequest) _storedValue);
            }
        }

        public PublishRequest.Builder<_B> copyOf(final PublishRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishRequest.Builder<_B> copyOf(final PublishRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishRequest.Selector<PublishRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishRequest.Select _root() {
            return new PublishRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>> subscriptionAcknowledgements = null;

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
            if (this.subscriptionAcknowledgements!= null) {
                products.put("subscriptionAcknowledgements", this.subscriptionAcknowledgements.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>> subscriptionAcknowledgements() {
            return ((this.subscriptionAcknowledgements == null)?this.subscriptionAcknowledgements = new com.kscs.util.jaxb.Selector<TRoot, PublishRequest.Selector<TRoot, TParent>>(this._root, this, "subscriptionAcknowledgements"):this.subscriptionAcknowledgements);
        }

    }

}
