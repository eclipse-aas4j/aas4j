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
 * <p>Java-Klasse für SessionlessInvokeResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SessionlessInvokeResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamespaceUris" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="ServerUris" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionlessInvokeResponseType", propOrder = {
    "namespaceUris",
    "serverUris",
    "serviceId"
})
public class SessionlessInvokeResponseType {

    @XmlElementRef(name = "NamespaceUris", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> namespaceUris;
    @XmlElementRef(name = "ServerUris", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> serverUris;
    @XmlElement(name = "ServiceId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serviceId;

    /**
     * Ruft den Wert der namespaceUris-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getNamespaceUris() {
        return namespaceUris;
    }

    /**
     * Legt den Wert der namespaceUris-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setNamespaceUris(JAXBElement<ListOfString> value) {
        this.namespaceUris = value;
    }

    /**
     * Ruft den Wert der serverUris-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getServerUris() {
        return serverUris;
    }

    /**
     * Legt den Wert der serverUris-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setServerUris(JAXBElement<ListOfString> value) {
        this.serverUris = value;
    }

    /**
     * Ruft den Wert der serviceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Legt den Wert der serviceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SessionlessInvokeResponseType.Builder<_B> _other) {
        _other.namespaceUris = this.namespaceUris;
        _other.serverUris = this.serverUris;
        _other.serviceId = this.serviceId;
    }

    public<_B >SessionlessInvokeResponseType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SessionlessInvokeResponseType.Builder<_B>(_parentBuilder, this, true);
    }

    public SessionlessInvokeResponseType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SessionlessInvokeResponseType.Builder<Void> builder() {
        return new SessionlessInvokeResponseType.Builder<Void>(null, null, false);
    }

    public static<_B >SessionlessInvokeResponseType.Builder<_B> copyOf(final SessionlessInvokeResponseType _other) {
        final SessionlessInvokeResponseType.Builder<_B> _newBuilder = new SessionlessInvokeResponseType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SessionlessInvokeResponseType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namespaceUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUris"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUrisPropertyTree!= null):((namespaceUrisPropertyTree == null)||(!namespaceUrisPropertyTree.isLeaf())))) {
            _other.namespaceUris = this.namespaceUris;
        }
        final PropertyTree serverUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUris"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUrisPropertyTree!= null):((serverUrisPropertyTree == null)||(!serverUrisPropertyTree.isLeaf())))) {
            _other.serverUris = this.serverUris;
        }
        final PropertyTree serviceIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceIdPropertyTree!= null):((serviceIdPropertyTree == null)||(!serviceIdPropertyTree.isLeaf())))) {
            _other.serviceId = this.serviceId;
        }
    }

    public<_B >SessionlessInvokeResponseType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SessionlessInvokeResponseType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SessionlessInvokeResponseType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SessionlessInvokeResponseType.Builder<_B> copyOf(final SessionlessInvokeResponseType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SessionlessInvokeResponseType.Builder<_B> _newBuilder = new SessionlessInvokeResponseType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SessionlessInvokeResponseType.Builder<Void> copyExcept(final SessionlessInvokeResponseType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SessionlessInvokeResponseType.Builder<Void> copyOnly(final SessionlessInvokeResponseType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SessionlessInvokeResponseType _storedValue;
        private JAXBElement<ListOfString> namespaceUris;
        private JAXBElement<ListOfString> serverUris;
        private Long serviceId;

        public Builder(final _B _parentBuilder, final SessionlessInvokeResponseType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.namespaceUris = _other.namespaceUris;
                    this.serverUris = _other.serverUris;
                    this.serviceId = _other.serviceId;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SessionlessInvokeResponseType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namespaceUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUris"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUrisPropertyTree!= null):((namespaceUrisPropertyTree == null)||(!namespaceUrisPropertyTree.isLeaf())))) {
                        this.namespaceUris = _other.namespaceUris;
                    }
                    final PropertyTree serverUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUris"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUrisPropertyTree!= null):((serverUrisPropertyTree == null)||(!serverUrisPropertyTree.isLeaf())))) {
                        this.serverUris = _other.serverUris;
                    }
                    final PropertyTree serviceIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceIdPropertyTree!= null):((serviceIdPropertyTree == null)||(!serviceIdPropertyTree.isLeaf())))) {
                        this.serviceId = _other.serviceId;
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

        protected<_P extends SessionlessInvokeResponseType >_P init(final _P _product) {
            _product.namespaceUris = this.namespaceUris;
            _product.serverUris = this.serverUris;
            _product.serviceId = this.serviceId;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaceUris" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param namespaceUris
         *     Neuer Wert der Eigenschaft "namespaceUris".
         */
        public SessionlessInvokeResponseType.Builder<_B> withNamespaceUris(final JAXBElement<ListOfString> namespaceUris) {
            this.namespaceUris = namespaceUris;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverUris" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverUris
         *     Neuer Wert der Eigenschaft "serverUris".
         */
        public SessionlessInvokeResponseType.Builder<_B> withServerUris(final JAXBElement<ListOfString> serverUris) {
            this.serverUris = serverUris;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serviceId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serviceId
         *     Neuer Wert der Eigenschaft "serviceId".
         */
        public SessionlessInvokeResponseType.Builder<_B> withServiceId(final Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public SessionlessInvokeResponseType build() {
            if (_storedValue == null) {
                return this.init(new SessionlessInvokeResponseType());
            } else {
                return ((SessionlessInvokeResponseType) _storedValue);
            }
        }

        public SessionlessInvokeResponseType.Builder<_B> copyOf(final SessionlessInvokeResponseType _other) {
            _other.copyTo(this);
            return this;
        }

        public SessionlessInvokeResponseType.Builder<_B> copyOf(final SessionlessInvokeResponseType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SessionlessInvokeResponseType.Selector<SessionlessInvokeResponseType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SessionlessInvokeResponseType.Select _root() {
            return new SessionlessInvokeResponseType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> namespaceUris = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> serverUris = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> serviceId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.namespaceUris!= null) {
                products.put("namespaceUris", this.namespaceUris.init());
            }
            if (this.serverUris!= null) {
                products.put("serverUris", this.serverUris.init());
            }
            if (this.serviceId!= null) {
                products.put("serviceId", this.serviceId.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> namespaceUris() {
            return ((this.namespaceUris == null)?this.namespaceUris = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>>(this._root, this, "namespaceUris"):this.namespaceUris);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> serverUris() {
            return ((this.serverUris == null)?this.serverUris = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>>(this._root, this, "serverUris"):this.serverUris);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>> serviceId() {
            return ((this.serviceId == null)?this.serviceId = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeResponseType.Selector<TRoot, TParent>>(this._root, this, "serviceId"):this.serviceId);
        }

    }

}
