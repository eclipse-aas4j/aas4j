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
 * <p>Java-Klasse für CloseSessionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CloseSessionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="DeleteSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloseSessionRequest", propOrder = {
    "requestHeader",
    "deleteSubscriptions"
})
public class CloseSessionRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "DeleteSubscriptions")
    protected Boolean deleteSubscriptions;

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
     * Ruft den Wert der deleteSubscriptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSubscriptions() {
        return deleteSubscriptions;
    }

    /**
     * Legt den Wert der deleteSubscriptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSubscriptions(Boolean value) {
        this.deleteSubscriptions = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CloseSessionRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.deleteSubscriptions = this.deleteSubscriptions;
    }

    public<_B >CloseSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CloseSessionRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CloseSessionRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CloseSessionRequest.Builder<Void> builder() {
        return new CloseSessionRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CloseSessionRequest.Builder<_B> copyOf(final CloseSessionRequest _other) {
        final CloseSessionRequest.Builder<_B> _newBuilder = new CloseSessionRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CloseSessionRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree deleteSubscriptionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteSubscriptions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteSubscriptionsPropertyTree!= null):((deleteSubscriptionsPropertyTree == null)||(!deleteSubscriptionsPropertyTree.isLeaf())))) {
            _other.deleteSubscriptions = this.deleteSubscriptions;
        }
    }

    public<_B >CloseSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CloseSessionRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CloseSessionRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CloseSessionRequest.Builder<_B> copyOf(final CloseSessionRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CloseSessionRequest.Builder<_B> _newBuilder = new CloseSessionRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CloseSessionRequest.Builder<Void> copyExcept(final CloseSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CloseSessionRequest.Builder<Void> copyOnly(final CloseSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CloseSessionRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Boolean deleteSubscriptions;

        public Builder(final _B _parentBuilder, final CloseSessionRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.deleteSubscriptions = _other.deleteSubscriptions;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CloseSessionRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree deleteSubscriptionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteSubscriptions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteSubscriptionsPropertyTree!= null):((deleteSubscriptionsPropertyTree == null)||(!deleteSubscriptionsPropertyTree.isLeaf())))) {
                        this.deleteSubscriptions = _other.deleteSubscriptions;
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

        protected<_P extends CloseSessionRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.deleteSubscriptions = this.deleteSubscriptions;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CloseSessionRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteSubscriptions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param deleteSubscriptions
         *     Neuer Wert der Eigenschaft "deleteSubscriptions".
         */
        public CloseSessionRequest.Builder<_B> withDeleteSubscriptions(final Boolean deleteSubscriptions) {
            this.deleteSubscriptions = deleteSubscriptions;
            return this;
        }

        @Override
        public CloseSessionRequest build() {
            if (_storedValue == null) {
                return this.init(new CloseSessionRequest());
            } else {
                return ((CloseSessionRequest) _storedValue);
            }
        }

        public CloseSessionRequest.Builder<_B> copyOf(final CloseSessionRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CloseSessionRequest.Builder<_B> copyOf(final CloseSessionRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CloseSessionRequest.Selector<CloseSessionRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CloseSessionRequest.Select _root() {
            return new CloseSessionRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>> deleteSubscriptions = null;

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
            if (this.deleteSubscriptions!= null) {
                products.put("deleteSubscriptions", this.deleteSubscriptions.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>> deleteSubscriptions() {
            return ((this.deleteSubscriptions == null)?this.deleteSubscriptions = new com.kscs.util.jaxb.Selector<TRoot, CloseSessionRequest.Selector<TRoot, TParent>>(this._root, this, "deleteSubscriptions"):this.deleteSubscriptions);
        }

    }

}
