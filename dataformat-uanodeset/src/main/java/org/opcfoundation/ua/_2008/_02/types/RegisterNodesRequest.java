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
 * <p>Java-Klasse für RegisterNodesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegisterNodesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="NodesToRegister" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterNodesRequest", propOrder = {
    "requestHeader",
    "nodesToRegister"
})
public class RegisterNodesRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "NodesToRegister", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNodeId> nodesToRegister;

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
     * Ruft den Wert der nodesToRegister-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public JAXBElement<ListOfNodeId> getNodesToRegister() {
        return nodesToRegister;
    }

    /**
     * Legt den Wert der nodesToRegister-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public void setNodesToRegister(JAXBElement<ListOfNodeId> value) {
        this.nodesToRegister = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RegisterNodesRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.nodesToRegister = this.nodesToRegister;
    }

    public<_B >RegisterNodesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RegisterNodesRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public RegisterNodesRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RegisterNodesRequest.Builder<Void> builder() {
        return new RegisterNodesRequest.Builder<Void>(null, null, false);
    }

    public static<_B >RegisterNodesRequest.Builder<_B> copyOf(final RegisterNodesRequest _other) {
        final RegisterNodesRequest.Builder<_B> _newBuilder = new RegisterNodesRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RegisterNodesRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree nodesToRegisterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToRegister"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToRegisterPropertyTree!= null):((nodesToRegisterPropertyTree == null)||(!nodesToRegisterPropertyTree.isLeaf())))) {
            _other.nodesToRegister = this.nodesToRegister;
        }
    }

    public<_B >RegisterNodesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RegisterNodesRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RegisterNodesRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RegisterNodesRequest.Builder<_B> copyOf(final RegisterNodesRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RegisterNodesRequest.Builder<_B> _newBuilder = new RegisterNodesRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RegisterNodesRequest.Builder<Void> copyExcept(final RegisterNodesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RegisterNodesRequest.Builder<Void> copyOnly(final RegisterNodesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RegisterNodesRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfNodeId> nodesToRegister;

        public Builder(final _B _parentBuilder, final RegisterNodesRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.nodesToRegister = _other.nodesToRegister;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RegisterNodesRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree nodesToRegisterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToRegister"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToRegisterPropertyTree!= null):((nodesToRegisterPropertyTree == null)||(!nodesToRegisterPropertyTree.isLeaf())))) {
                        this.nodesToRegister = _other.nodesToRegister;
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

        protected<_P extends RegisterNodesRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.nodesToRegister = this.nodesToRegister;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public RegisterNodesRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToRegister" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodesToRegister
         *     Neuer Wert der Eigenschaft "nodesToRegister".
         */
        public RegisterNodesRequest.Builder<_B> withNodesToRegister(final JAXBElement<ListOfNodeId> nodesToRegister) {
            this.nodesToRegister = nodesToRegister;
            return this;
        }

        @Override
        public RegisterNodesRequest build() {
            if (_storedValue == null) {
                return this.init(new RegisterNodesRequest());
            } else {
                return ((RegisterNodesRequest) _storedValue);
            }
        }

        public RegisterNodesRequest.Builder<_B> copyOf(final RegisterNodesRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public RegisterNodesRequest.Builder<_B> copyOf(final RegisterNodesRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RegisterNodesRequest.Selector<RegisterNodesRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RegisterNodesRequest.Select _root() {
            return new RegisterNodesRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>> nodesToRegister = null;

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
            if (this.nodesToRegister!= null) {
                products.put("nodesToRegister", this.nodesToRegister.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>> nodesToRegister() {
            return ((this.nodesToRegister == null)?this.nodesToRegister = new com.kscs.util.jaxb.Selector<TRoot, RegisterNodesRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToRegister"):this.nodesToRegister);
        }

    }

}
