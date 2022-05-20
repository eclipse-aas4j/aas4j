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
 * <p>Java-Klasse für UnregisterNodesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnregisterNodesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="NodesToUnregister" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnregisterNodesRequest", propOrder = {
    "requestHeader",
    "nodesToUnregister"
})
public class UnregisterNodesRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "NodesToUnregister", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNodeId> nodesToUnregister;

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
     * Ruft den Wert der nodesToUnregister-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public JAXBElement<ListOfNodeId> getNodesToUnregister() {
        return nodesToUnregister;
    }

    /**
     * Legt den Wert der nodesToUnregister-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public void setNodesToUnregister(JAXBElement<ListOfNodeId> value) {
        this.nodesToUnregister = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UnregisterNodesRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.nodesToUnregister = this.nodesToUnregister;
    }

    public<_B >UnregisterNodesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UnregisterNodesRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public UnregisterNodesRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UnregisterNodesRequest.Builder<Void> builder() {
        return new UnregisterNodesRequest.Builder<Void>(null, null, false);
    }

    public static<_B >UnregisterNodesRequest.Builder<_B> copyOf(final UnregisterNodesRequest _other) {
        final UnregisterNodesRequest.Builder<_B> _newBuilder = new UnregisterNodesRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UnregisterNodesRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree nodesToUnregisterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToUnregister"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToUnregisterPropertyTree!= null):((nodesToUnregisterPropertyTree == null)||(!nodesToUnregisterPropertyTree.isLeaf())))) {
            _other.nodesToUnregister = this.nodesToUnregister;
        }
    }

    public<_B >UnregisterNodesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UnregisterNodesRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public UnregisterNodesRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UnregisterNodesRequest.Builder<_B> copyOf(final UnregisterNodesRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UnregisterNodesRequest.Builder<_B> _newBuilder = new UnregisterNodesRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UnregisterNodesRequest.Builder<Void> copyExcept(final UnregisterNodesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UnregisterNodesRequest.Builder<Void> copyOnly(final UnregisterNodesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final UnregisterNodesRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfNodeId> nodesToUnregister;

        public Builder(final _B _parentBuilder, final UnregisterNodesRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.nodesToUnregister = _other.nodesToUnregister;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final UnregisterNodesRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree nodesToUnregisterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToUnregister"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToUnregisterPropertyTree!= null):((nodesToUnregisterPropertyTree == null)||(!nodesToUnregisterPropertyTree.isLeaf())))) {
                        this.nodesToUnregister = _other.nodesToUnregister;
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

        protected<_P extends UnregisterNodesRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.nodesToUnregister = this.nodesToUnregister;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public UnregisterNodesRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToUnregister" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param nodesToUnregister
         *     Neuer Wert der Eigenschaft "nodesToUnregister".
         */
        public UnregisterNodesRequest.Builder<_B> withNodesToUnregister(final JAXBElement<ListOfNodeId> nodesToUnregister) {
            this.nodesToUnregister = nodesToUnregister;
            return this;
        }

        @Override
        public UnregisterNodesRequest build() {
            if (_storedValue == null) {
                return this.init(new UnregisterNodesRequest());
            } else {
                return ((UnregisterNodesRequest) _storedValue);
            }
        }

        public UnregisterNodesRequest.Builder<_B> copyOf(final UnregisterNodesRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public UnregisterNodesRequest.Builder<_B> copyOf(final UnregisterNodesRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UnregisterNodesRequest.Selector<UnregisterNodesRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UnregisterNodesRequest.Select _root() {
            return new UnregisterNodesRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>> nodesToUnregister = null;

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
            if (this.nodesToUnregister!= null) {
                products.put("nodesToUnregister", this.nodesToUnregister.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>> nodesToUnregister() {
            return ((this.nodesToUnregister == null)?this.nodesToUnregister = new com.kscs.util.jaxb.Selector<TRoot, UnregisterNodesRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToUnregister"):this.nodesToUnregister);
        }

    }

}
