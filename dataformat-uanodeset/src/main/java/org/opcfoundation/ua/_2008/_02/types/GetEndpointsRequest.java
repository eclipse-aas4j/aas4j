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
 * <p>Java-Klasse für GetEndpointsRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetEndpointsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="EndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocaleIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="ProfileUris" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEndpointsRequest", propOrder = {
    "requestHeader",
    "endpointUrl",
    "localeIds",
    "profileUris"
})
public class GetEndpointsRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "EndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointUrl;
    @XmlElementRef(name = "LocaleIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> localeIds;
    @XmlElementRef(name = "ProfileUris", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> profileUris;

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
     * Ruft den Wert der endpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * Legt den Wert der endpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointUrl(JAXBElement<String> value) {
        this.endpointUrl = value;
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
     * Ruft den Wert der profileUris-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getProfileUris() {
        return profileUris;
    }

    /**
     * Legt den Wert der profileUris-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setProfileUris(JAXBElement<ListOfString> value) {
        this.profileUris = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GetEndpointsRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.endpointUrl = this.endpointUrl;
        _other.localeIds = this.localeIds;
        _other.profileUris = this.profileUris;
    }

    public<_B >GetEndpointsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new GetEndpointsRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public GetEndpointsRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static GetEndpointsRequest.Builder<Void> builder() {
        return new GetEndpointsRequest.Builder<Void>(null, null, false);
    }

    public static<_B >GetEndpointsRequest.Builder<_B> copyOf(final GetEndpointsRequest _other) {
        final GetEndpointsRequest.Builder<_B> _newBuilder = new GetEndpointsRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final GetEndpointsRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
            _other.endpointUrl = this.endpointUrl;
        }
        final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
            _other.localeIds = this.localeIds;
        }
        final PropertyTree profileUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("profileUris"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(profileUrisPropertyTree!= null):((profileUrisPropertyTree == null)||(!profileUrisPropertyTree.isLeaf())))) {
            _other.profileUris = this.profileUris;
        }
    }

    public<_B >GetEndpointsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new GetEndpointsRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public GetEndpointsRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >GetEndpointsRequest.Builder<_B> copyOf(final GetEndpointsRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GetEndpointsRequest.Builder<_B> _newBuilder = new GetEndpointsRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static GetEndpointsRequest.Builder<Void> copyExcept(final GetEndpointsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GetEndpointsRequest.Builder<Void> copyOnly(final GetEndpointsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final GetEndpointsRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<String> endpointUrl;
        private JAXBElement<ListOfString> localeIds;
        private JAXBElement<ListOfString> profileUris;

        public Builder(final _B _parentBuilder, final GetEndpointsRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.endpointUrl = _other.endpointUrl;
                    this.localeIds = _other.localeIds;
                    this.profileUris = _other.profileUris;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final GetEndpointsRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
                        this.endpointUrl = _other.endpointUrl;
                    }
                    final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
                        this.localeIds = _other.localeIds;
                    }
                    final PropertyTree profileUrisPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("profileUris"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(profileUrisPropertyTree!= null):((profileUrisPropertyTree == null)||(!profileUrisPropertyTree.isLeaf())))) {
                        this.profileUris = _other.profileUris;
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

        protected<_P extends GetEndpointsRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.endpointUrl = this.endpointUrl;
            _product.localeIds = this.localeIds;
            _product.profileUris = this.profileUris;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public GetEndpointsRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrl
         *     Neuer Wert der Eigenschaft "endpointUrl".
         */
        public GetEndpointsRequest.Builder<_B> withEndpointUrl(final JAXBElement<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localeIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param localeIds
         *     Neuer Wert der Eigenschaft "localeIds".
         */
        public GetEndpointsRequest.Builder<_B> withLocaleIds(final JAXBElement<ListOfString> localeIds) {
            this.localeIds = localeIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "profileUris" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param profileUris
         *     Neuer Wert der Eigenschaft "profileUris".
         */
        public GetEndpointsRequest.Builder<_B> withProfileUris(final JAXBElement<ListOfString> profileUris) {
            this.profileUris = profileUris;
            return this;
        }

        @Override
        public GetEndpointsRequest build() {
            if (_storedValue == null) {
                return this.init(new GetEndpointsRequest());
            } else {
                return ((GetEndpointsRequest) _storedValue);
            }
        }

        public GetEndpointsRequest.Builder<_B> copyOf(final GetEndpointsRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public GetEndpointsRequest.Builder<_B> copyOf(final GetEndpointsRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends GetEndpointsRequest.Selector<GetEndpointsRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static GetEndpointsRequest.Select _root() {
            return new GetEndpointsRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> endpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> localeIds = null;
        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> profileUris = null;

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
            if (this.endpointUrl!= null) {
                products.put("endpointUrl", this.endpointUrl.init());
            }
            if (this.localeIds!= null) {
                products.put("localeIds", this.localeIds.init());
            }
            if (this.profileUris!= null) {
                products.put("profileUris", this.profileUris.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> endpointUrl() {
            return ((this.endpointUrl == null)?this.endpointUrl = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>>(this._root, this, "endpointUrl"):this.endpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> localeIds() {
            return ((this.localeIds == null)?this.localeIds = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>>(this._root, this, "localeIds"):this.localeIds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>> profileUris() {
            return ((this.profileUris == null)?this.profileUris = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsRequest.Selector<TRoot, TParent>>(this._root, this, "profileUris"):this.profileUris);
        }

    }

}
