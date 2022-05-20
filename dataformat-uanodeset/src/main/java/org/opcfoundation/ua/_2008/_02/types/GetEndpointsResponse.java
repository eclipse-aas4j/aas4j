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
 * <p>Java-Klasse für GetEndpointsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetEndpointsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="Endpoints" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEndpointDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEndpointsResponse", propOrder = {
    "responseHeader",
    "endpoints"
})
public class GetEndpointsResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "Endpoints", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEndpointDescription> endpoints;

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
     * Ruft den Wert der endpoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfEndpointDescription> getEndpoints() {
        return endpoints;
    }

    /**
     * Legt den Wert der endpoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public void setEndpoints(JAXBElement<ListOfEndpointDescription> value) {
        this.endpoints = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GetEndpointsResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.endpoints = this.endpoints;
    }

    public<_B >GetEndpointsResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new GetEndpointsResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public GetEndpointsResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static GetEndpointsResponse.Builder<Void> builder() {
        return new GetEndpointsResponse.Builder<Void>(null, null, false);
    }

    public static<_B >GetEndpointsResponse.Builder<_B> copyOf(final GetEndpointsResponse _other) {
        final GetEndpointsResponse.Builder<_B> _newBuilder = new GetEndpointsResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final GetEndpointsResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree endpointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpoints"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointsPropertyTree!= null):((endpointsPropertyTree == null)||(!endpointsPropertyTree.isLeaf())))) {
            _other.endpoints = this.endpoints;
        }
    }

    public<_B >GetEndpointsResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new GetEndpointsResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public GetEndpointsResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >GetEndpointsResponse.Builder<_B> copyOf(final GetEndpointsResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GetEndpointsResponse.Builder<_B> _newBuilder = new GetEndpointsResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static GetEndpointsResponse.Builder<Void> copyExcept(final GetEndpointsResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GetEndpointsResponse.Builder<Void> copyOnly(final GetEndpointsResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final GetEndpointsResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<ListOfEndpointDescription> endpoints;

        public Builder(final _B _parentBuilder, final GetEndpointsResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.endpoints = _other.endpoints;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final GetEndpointsResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree endpointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpoints"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointsPropertyTree!= null):((endpointsPropertyTree == null)||(!endpointsPropertyTree.isLeaf())))) {
                        this.endpoints = _other.endpoints;
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

        protected<_P extends GetEndpointsResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.endpoints = this.endpoints;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public GetEndpointsResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpoints" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param endpoints
         *     Neuer Wert der Eigenschaft "endpoints".
         */
        public GetEndpointsResponse.Builder<_B> withEndpoints(final JAXBElement<ListOfEndpointDescription> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        @Override
        public GetEndpointsResponse build() {
            if (_storedValue == null) {
                return this.init(new GetEndpointsResponse());
            } else {
                return ((GetEndpointsResponse) _storedValue);
            }
        }

        public GetEndpointsResponse.Builder<_B> copyOf(final GetEndpointsResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public GetEndpointsResponse.Builder<_B> copyOf(final GetEndpointsResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends GetEndpointsResponse.Selector<GetEndpointsResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static GetEndpointsResponse.Select _root() {
            return new GetEndpointsResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>> endpoints = null;

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
            if (this.endpoints!= null) {
                products.put("endpoints", this.endpoints.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>> endpoints() {
            return ((this.endpoints == null)?this.endpoints = new com.kscs.util.jaxb.Selector<TRoot, GetEndpointsResponse.Selector<TRoot, TParent>>(this._root, this, "endpoints"):this.endpoints);
        }

    }

}
