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
 * <p>Java-Klasse für RegisterServerRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegisterServerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="Server" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RegisteredServer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterServerRequest", propOrder = {
    "requestHeader",
    "server"
})
public class RegisterServerRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "Server", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RegisteredServer> server;

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
     * Ruft den Wert der server-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegisteredServer }{@code >}
     *     
     */
    public JAXBElement<RegisteredServer> getServer() {
        return server;
    }

    /**
     * Legt den Wert der server-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegisteredServer }{@code >}
     *     
     */
    public void setServer(JAXBElement<RegisteredServer> value) {
        this.server = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RegisterServerRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.server = this.server;
    }

    public<_B >RegisterServerRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RegisterServerRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public RegisterServerRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RegisterServerRequest.Builder<Void> builder() {
        return new RegisterServerRequest.Builder<Void>(null, null, false);
    }

    public static<_B >RegisterServerRequest.Builder<_B> copyOf(final RegisterServerRequest _other) {
        final RegisterServerRequest.Builder<_B> _newBuilder = new RegisterServerRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RegisterServerRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
            _other.server = this.server;
        }
    }

    public<_B >RegisterServerRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RegisterServerRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RegisterServerRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RegisterServerRequest.Builder<_B> copyOf(final RegisterServerRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RegisterServerRequest.Builder<_B> _newBuilder = new RegisterServerRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RegisterServerRequest.Builder<Void> copyExcept(final RegisterServerRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RegisterServerRequest.Builder<Void> copyOnly(final RegisterServerRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RegisterServerRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<RegisteredServer> server;

        public Builder(final _B _parentBuilder, final RegisterServerRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.server = _other.server;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RegisterServerRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
                        this.server = _other.server;
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

        protected<_P extends RegisterServerRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.server = this.server;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public RegisterServerRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "server" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param server
         *     Neuer Wert der Eigenschaft "server".
         */
        public RegisterServerRequest.Builder<_B> withServer(final JAXBElement<RegisteredServer> server) {
            this.server = server;
            return this;
        }

        @Override
        public RegisterServerRequest build() {
            if (_storedValue == null) {
                return this.init(new RegisterServerRequest());
            } else {
                return ((RegisterServerRequest) _storedValue);
            }
        }

        public RegisterServerRequest.Builder<_B> copyOf(final RegisterServerRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public RegisterServerRequest.Builder<_B> copyOf(final RegisterServerRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RegisterServerRequest.Selector<RegisterServerRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RegisterServerRequest.Select _root() {
            return new RegisterServerRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>> server = null;

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
            if (this.server!= null) {
                products.put("server", this.server.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>> server() {
            return ((this.server == null)?this.server = new com.kscs.util.jaxb.Selector<TRoot, RegisterServerRequest.Selector<TRoot, TParent>>(this._root, this, "server"):this.server);
        }

    }

}
