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
 * <p>Java-Klasse für SessionlessInvokeRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SessionlessInvokeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UrisVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NamespaceUris" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="ServerUris" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="LocaleIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
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
@XmlType(name = "SessionlessInvokeRequestType", propOrder = {
    "urisVersion",
    "namespaceUris",
    "serverUris",
    "localeIds",
    "serviceId"
})
public class SessionlessInvokeRequestType {

    @XmlElement(name = "UrisVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long urisVersion;
    @XmlElementRef(name = "NamespaceUris", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> namespaceUris;
    @XmlElementRef(name = "ServerUris", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> serverUris;
    @XmlElementRef(name = "LocaleIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> localeIds;
    @XmlElement(name = "ServiceId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serviceId;

    /**
     * Ruft den Wert der urisVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUrisVersion() {
        return urisVersion;
    }

    /**
     * Legt den Wert der urisVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUrisVersion(Long value) {
        this.urisVersion = value;
    }

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
     * Ruft den Wert der localeIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getLocaleIds() {
        return localeIds;
    }

    /**
     * Legt den Wert der localeIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setLocaleIds(JAXBElement<ListOfString> value) {
        this.localeIds = value;
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
    public<_B >void copyTo(final SessionlessInvokeRequestType.Builder<_B> _other) {
        _other.urisVersion = this.urisVersion;
        _other.namespaceUris = this.namespaceUris;
        _other.serverUris = this.serverUris;
        _other.localeIds = this.localeIds;
        _other.serviceId = this.serviceId;
    }

    public<_B >SessionlessInvokeRequestType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SessionlessInvokeRequestType.Builder<_B>(_parentBuilder, this, true);
    }

    public SessionlessInvokeRequestType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SessionlessInvokeRequestType.Builder<Void> builder() {
        return new SessionlessInvokeRequestType.Builder<Void>(null, null, false);
    }

    public static<_B >SessionlessInvokeRequestType.Builder<_B> copyOf(final SessionlessInvokeRequestType _other) {
        final SessionlessInvokeRequestType.Builder<_B> _newBuilder = new SessionlessInvokeRequestType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SessionlessInvokeRequestType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree urisVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("urisVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(urisVersionPropertyTree!= null):((urisVersionPropertyTree == null)||(!urisVersionPropertyTree.isLeaf())))) {
            _other.urisVersion = this.urisVersion;
        }
        final PropertyTree namespaceUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUris"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUrisPropertyTree!= null):((namespaceUrisPropertyTree == null)||(!namespaceUrisPropertyTree.isLeaf())))) {
            _other.namespaceUris = this.namespaceUris;
        }
        final PropertyTree serverUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUris"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUrisPropertyTree!= null):((serverUrisPropertyTree == null)||(!serverUrisPropertyTree.isLeaf())))) {
            _other.serverUris = this.serverUris;
        }
        final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
            _other.localeIds = this.localeIds;
        }
        final PropertyTree serviceIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceIdPropertyTree!= null):((serviceIdPropertyTree == null)||(!serviceIdPropertyTree.isLeaf())))) {
            _other.serviceId = this.serviceId;
        }
    }

    public<_B >SessionlessInvokeRequestType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SessionlessInvokeRequestType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SessionlessInvokeRequestType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SessionlessInvokeRequestType.Builder<_B> copyOf(final SessionlessInvokeRequestType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SessionlessInvokeRequestType.Builder<_B> _newBuilder = new SessionlessInvokeRequestType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SessionlessInvokeRequestType.Builder<Void> copyExcept(final SessionlessInvokeRequestType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SessionlessInvokeRequestType.Builder<Void> copyOnly(final SessionlessInvokeRequestType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SessionlessInvokeRequestType _storedValue;
        private Long urisVersion;
        private JAXBElement<ListOfString> namespaceUris;
        private JAXBElement<ListOfString> serverUris;
        private JAXBElement<ListOfString> localeIds;
        private Long serviceId;

        public Builder(final _B _parentBuilder, final SessionlessInvokeRequestType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.urisVersion = _other.urisVersion;
                    this.namespaceUris = _other.namespaceUris;
                    this.serverUris = _other.serverUris;
                    this.localeIds = _other.localeIds;
                    this.serviceId = _other.serviceId;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SessionlessInvokeRequestType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree urisVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("urisVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(urisVersionPropertyTree!= null):((urisVersionPropertyTree == null)||(!urisVersionPropertyTree.isLeaf())))) {
                        this.urisVersion = _other.urisVersion;
                    }
                    final PropertyTree namespaceUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUris"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUrisPropertyTree!= null):((namespaceUrisPropertyTree == null)||(!namespaceUrisPropertyTree.isLeaf())))) {
                        this.namespaceUris = _other.namespaceUris;
                    }
                    final PropertyTree serverUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUris"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUrisPropertyTree!= null):((serverUrisPropertyTree == null)||(!serverUrisPropertyTree.isLeaf())))) {
                        this.serverUris = _other.serverUris;
                    }
                    final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
                        this.localeIds = _other.localeIds;
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

        protected<_P extends SessionlessInvokeRequestType >_P init(final _P _product) {
            _product.urisVersion = this.urisVersion;
            _product.namespaceUris = this.namespaceUris;
            _product.serverUris = this.serverUris;
            _product.localeIds = this.localeIds;
            _product.serviceId = this.serviceId;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "urisVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param urisVersion
         *     Neuer Wert der Eigenschaft "urisVersion".
         */
        public SessionlessInvokeRequestType.Builder<_B> withUrisVersion(final Long urisVersion) {
            this.urisVersion = urisVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaceUris" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param namespaceUris
         *     Neuer Wert der Eigenschaft "namespaceUris".
         */
        public SessionlessInvokeRequestType.Builder<_B> withNamespaceUris(final JAXBElement<ListOfString> namespaceUris) {
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
        public SessionlessInvokeRequestType.Builder<_B> withServerUris(final JAXBElement<ListOfString> serverUris) {
            this.serverUris = serverUris;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localeIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param localeIds
         *     Neuer Wert der Eigenschaft "localeIds".
         */
        public SessionlessInvokeRequestType.Builder<_B> withLocaleIds(final JAXBElement<ListOfString> localeIds) {
            this.localeIds = localeIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serviceId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serviceId
         *     Neuer Wert der Eigenschaft "serviceId".
         */
        public SessionlessInvokeRequestType.Builder<_B> withServiceId(final Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public SessionlessInvokeRequestType build() {
            if (_storedValue == null) {
                return this.init(new SessionlessInvokeRequestType());
            } else {
                return ((SessionlessInvokeRequestType) _storedValue);
            }
        }

        public SessionlessInvokeRequestType.Builder<_B> copyOf(final SessionlessInvokeRequestType _other) {
            _other.copyTo(this);
            return this;
        }

        public SessionlessInvokeRequestType.Builder<_B> copyOf(final SessionlessInvokeRequestType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SessionlessInvokeRequestType.Selector<SessionlessInvokeRequestType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SessionlessInvokeRequestType.Select _root() {
            return new SessionlessInvokeRequestType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> urisVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> namespaceUris = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> serverUris = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> localeIds = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> serviceId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.urisVersion!= null) {
                products.put("urisVersion", this.urisVersion.init());
            }
            if (this.namespaceUris!= null) {
                products.put("namespaceUris", this.namespaceUris.init());
            }
            if (this.serverUris!= null) {
                products.put("serverUris", this.serverUris.init());
            }
            if (this.localeIds!= null) {
                products.put("localeIds", this.localeIds.init());
            }
            if (this.serviceId!= null) {
                products.put("serviceId", this.serviceId.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> urisVersion() {
            return ((this.urisVersion == null)?this.urisVersion = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>>(this._root, this, "urisVersion"):this.urisVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> namespaceUris() {
            return ((this.namespaceUris == null)?this.namespaceUris = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>>(this._root, this, "namespaceUris"):this.namespaceUris);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> serverUris() {
            return ((this.serverUris == null)?this.serverUris = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>>(this._root, this, "serverUris"):this.serverUris);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> localeIds() {
            return ((this.localeIds == null)?this.localeIds = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>>(this._root, this, "localeIds"):this.localeIds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>> serviceId() {
            return ((this.serviceId == null)?this.serviceId = new com.kscs.util.jaxb.Selector<TRoot, SessionlessInvokeRequestType.Selector<TRoot, TParent>>(this._root, this, "serviceId"):this.serviceId);
        }

    }

}
