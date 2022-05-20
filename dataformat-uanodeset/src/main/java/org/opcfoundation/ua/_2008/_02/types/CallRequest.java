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
 * <p>Java-Klasse für CallRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="MethodsToCall" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfCallMethodRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallRequest", propOrder = {
    "requestHeader",
    "methodsToCall"
})
public class CallRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "MethodsToCall", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfCallMethodRequest> methodsToCall;

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
     * Ruft den Wert der methodsToCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfCallMethodRequest }{@code >}
     *     
     */
    public JAXBElement<ListOfCallMethodRequest> getMethodsToCall() {
        return methodsToCall;
    }

    /**
     * Legt den Wert der methodsToCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfCallMethodRequest }{@code >}
     *     
     */
    public void setMethodsToCall(JAXBElement<ListOfCallMethodRequest> value) {
        this.methodsToCall = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CallRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.methodsToCall = this.methodsToCall;
    }

    public<_B >CallRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CallRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CallRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CallRequest.Builder<Void> builder() {
        return new CallRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CallRequest.Builder<_B> copyOf(final CallRequest _other) {
        final CallRequest.Builder<_B> _newBuilder = new CallRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CallRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree methodsToCallPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("methodsToCall"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(methodsToCallPropertyTree!= null):((methodsToCallPropertyTree == null)||(!methodsToCallPropertyTree.isLeaf())))) {
            _other.methodsToCall = this.methodsToCall;
        }
    }

    public<_B >CallRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CallRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CallRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CallRequest.Builder<_B> copyOf(final CallRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CallRequest.Builder<_B> _newBuilder = new CallRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CallRequest.Builder<Void> copyExcept(final CallRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CallRequest.Builder<Void> copyOnly(final CallRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CallRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfCallMethodRequest> methodsToCall;

        public Builder(final _B _parentBuilder, final CallRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.methodsToCall = _other.methodsToCall;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CallRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree methodsToCallPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("methodsToCall"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(methodsToCallPropertyTree!= null):((methodsToCallPropertyTree == null)||(!methodsToCallPropertyTree.isLeaf())))) {
                        this.methodsToCall = _other.methodsToCall;
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

        protected<_P extends CallRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.methodsToCall = this.methodsToCall;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public CallRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "methodsToCall" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param methodsToCall
         *     Neuer Wert der Eigenschaft "methodsToCall".
         */
        public CallRequest.Builder<_B> withMethodsToCall(final JAXBElement<ListOfCallMethodRequest> methodsToCall) {
            this.methodsToCall = methodsToCall;
            return this;
        }

        @Override
        public CallRequest build() {
            if (_storedValue == null) {
                return this.init(new CallRequest());
            } else {
                return ((CallRequest) _storedValue);
            }
        }

        public CallRequest.Builder<_B> copyOf(final CallRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CallRequest.Builder<_B> copyOf(final CallRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CallRequest.Selector<CallRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CallRequest.Select _root() {
            return new CallRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>> methodsToCall = null;

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
            if (this.methodsToCall!= null) {
                products.put("methodsToCall", this.methodsToCall.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>> methodsToCall() {
            return ((this.methodsToCall == null)?this.methodsToCall = new com.kscs.util.jaxb.Selector<TRoot, CallRequest.Selector<TRoot, TParent>>(this._root, this, "methodsToCall"):this.methodsToCall);
        }

    }

}
