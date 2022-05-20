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
 * <p>Java-Klasse für RepublishResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RepublishResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMessage" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NotificationMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepublishResponse", propOrder = {
    "responseHeader",
    "notificationMessage"
})
public class RepublishResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "NotificationMessage", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotificationMessage> notificationMessage;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RepublishResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.notificationMessage = this.notificationMessage;
    }

    public<_B >RepublishResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RepublishResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public RepublishResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RepublishResponse.Builder<Void> builder() {
        return new RepublishResponse.Builder<Void>(null, null, false);
    }

    public static<_B >RepublishResponse.Builder<_B> copyOf(final RepublishResponse _other) {
        final RepublishResponse.Builder<_B> _newBuilder = new RepublishResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RepublishResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree notificationMessagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationMessage"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationMessagePropertyTree!= null):((notificationMessagePropertyTree == null)||(!notificationMessagePropertyTree.isLeaf())))) {
            _other.notificationMessage = this.notificationMessage;
        }
    }

    public<_B >RepublishResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RepublishResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RepublishResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RepublishResponse.Builder<_B> copyOf(final RepublishResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RepublishResponse.Builder<_B> _newBuilder = new RepublishResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RepublishResponse.Builder<Void> copyExcept(final RepublishResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RepublishResponse.Builder<Void> copyOnly(final RepublishResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RepublishResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<NotificationMessage> notificationMessage;

        public Builder(final _B _parentBuilder, final RepublishResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.notificationMessage = _other.notificationMessage;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RepublishResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree notificationMessagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationMessage"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationMessagePropertyTree!= null):((notificationMessagePropertyTree == null)||(!notificationMessagePropertyTree.isLeaf())))) {
                        this.notificationMessage = _other.notificationMessage;
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

        protected<_P extends RepublishResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.notificationMessage = this.notificationMessage;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public RepublishResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "notificationMessage" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param notificationMessage
         *     Neuer Wert der Eigenschaft "notificationMessage".
         */
        public RepublishResponse.Builder<_B> withNotificationMessage(final JAXBElement<NotificationMessage> notificationMessage) {
            this.notificationMessage = notificationMessage;
            return this;
        }

        @Override
        public RepublishResponse build() {
            if (_storedValue == null) {
                return this.init(new RepublishResponse());
            } else {
                return ((RepublishResponse) _storedValue);
            }
        }

        public RepublishResponse.Builder<_B> copyOf(final RepublishResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public RepublishResponse.Builder<_B> copyOf(final RepublishResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RepublishResponse.Selector<RepublishResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RepublishResponse.Select _root() {
            return new RepublishResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>> notificationMessage = null;

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
            if (this.notificationMessage!= null) {
                products.put("notificationMessage", this.notificationMessage.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>> notificationMessage() {
            return ((this.notificationMessage == null)?this.notificationMessage = new com.kscs.util.jaxb.Selector<TRoot, RepublishResponse.Selector<TRoot, TParent>>(this._root, this, "notificationMessage"):this.notificationMessage);
        }

    }

}
