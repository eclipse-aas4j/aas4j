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
 * <p>Java-Klasse für CancelRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CancelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="RequestHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRequest", propOrder = {
    "requestHeader",
    "requestHandle"
})
public class CancelRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "RequestHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestHandle;

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
     * Ruft den Wert der requestHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestHandle() {
        return requestHandle;
    }

    /**
     * Legt den Wert der requestHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestHandle(Long value) {
        this.requestHandle = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CancelRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.requestHandle = this.requestHandle;
    }

    public<_B >CancelRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CancelRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CancelRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CancelRequest.Builder<Void> builder() {
        return new CancelRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CancelRequest.Builder<_B> copyOf(final CancelRequest _other) {
        final CancelRequest.Builder<_B> _newBuilder = new CancelRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CancelRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
            _other.requestHandle = this.requestHandle;
        }
    }

    public<_B >CancelRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CancelRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CancelRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CancelRequest.Builder<_B> copyOf(final CancelRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CancelRequest.Builder<_B> _newBuilder = new CancelRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CancelRequest.Builder<Void> copyExcept(final CancelRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CancelRequest.Builder<Void> copyOnly(final CancelRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CancelRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long requestHandle;

        public Builder(final _B _parentBuilder, final CancelRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.requestHandle = _other.requestHandle;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CancelRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree requestHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHandlePropertyTree!= null):((requestHandlePropertyTree == null)||(!requestHandlePropertyTree.isLeaf())))) {
                        this.requestHandle = _other.requestHandle;
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

        protected<_P extends CancelRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.requestHandle = this.requestHandle;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CancelRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHandle" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHandle
         *     Neuer Wert der Eigenschaft "requestHandle".
         */
        public CancelRequest.Builder<_B> withRequestHandle(final Long requestHandle) {
            this.requestHandle = requestHandle;
            return this;
        }

        @Override
        public CancelRequest build() {
            if (_storedValue == null) {
                return this.init(new CancelRequest());
            } else {
                return ((CancelRequest) _storedValue);
            }
        }

        public CancelRequest.Builder<_B> copyOf(final CancelRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CancelRequest.Builder<_B> copyOf(final CancelRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CancelRequest.Selector<CancelRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CancelRequest.Select _root() {
            return new CancelRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>> requestHandle = null;

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
            if (this.requestHandle!= null) {
                products.put("requestHandle", this.requestHandle.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>> requestHandle() {
            return ((this.requestHandle == null)?this.requestHandle = new com.kscs.util.jaxb.Selector<TRoot, CancelRequest.Selector<TRoot, TParent>>(this._root, this, "requestHandle"):this.requestHandle);
        }

    }

}
