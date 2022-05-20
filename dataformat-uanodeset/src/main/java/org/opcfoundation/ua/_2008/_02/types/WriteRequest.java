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
 * <p>Java-Klasse für WriteRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WriteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="NodesToWrite" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfWriteValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteRequest", propOrder = {
    "requestHeader",
    "nodesToWrite"
})
public class WriteRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "NodesToWrite", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfWriteValue> nodesToWrite;

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
     * Ruft den Wert der nodesToWrite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfWriteValue }{@code >}
     *     
     */
    public JAXBElement<ListOfWriteValue> getNodesToWrite() {
        return nodesToWrite;
    }

    /**
     * Legt den Wert der nodesToWrite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfWriteValue }{@code >}
     *     
     */
    public void setNodesToWrite(JAXBElement<ListOfWriteValue> value) {
        this.nodesToWrite = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final WriteRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.nodesToWrite = this.nodesToWrite;
    }

    public<_B >WriteRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new WriteRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public WriteRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static WriteRequest.Builder<Void> builder() {
        return new WriteRequest.Builder<Void>(null, null, false);
    }

    public static<_B >WriteRequest.Builder<_B> copyOf(final WriteRequest _other) {
        final WriteRequest.Builder<_B> _newBuilder = new WriteRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final WriteRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree nodesToWritePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToWrite"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToWritePropertyTree!= null):((nodesToWritePropertyTree == null)||(!nodesToWritePropertyTree.isLeaf())))) {
            _other.nodesToWrite = this.nodesToWrite;
        }
    }

    public<_B >WriteRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new WriteRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public WriteRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >WriteRequest.Builder<_B> copyOf(final WriteRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final WriteRequest.Builder<_B> _newBuilder = new WriteRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static WriteRequest.Builder<Void> copyExcept(final WriteRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static WriteRequest.Builder<Void> copyOnly(final WriteRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final WriteRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfWriteValue> nodesToWrite;

        public Builder(final _B _parentBuilder, final WriteRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.nodesToWrite = _other.nodesToWrite;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final WriteRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree nodesToWritePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToWrite"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToWritePropertyTree!= null):((nodesToWritePropertyTree == null)||(!nodesToWritePropertyTree.isLeaf())))) {
                        this.nodesToWrite = _other.nodesToWrite;
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

        protected<_P extends WriteRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.nodesToWrite = this.nodesToWrite;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public WriteRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToWrite" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodesToWrite
         *     Neuer Wert der Eigenschaft "nodesToWrite".
         */
        public WriteRequest.Builder<_B> withNodesToWrite(final JAXBElement<ListOfWriteValue> nodesToWrite) {
            this.nodesToWrite = nodesToWrite;
            return this;
        }

        @Override
        public WriteRequest build() {
            if (_storedValue == null) {
                return this.init(new WriteRequest());
            } else {
                return ((WriteRequest) _storedValue);
            }
        }

        public WriteRequest.Builder<_B> copyOf(final WriteRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public WriteRequest.Builder<_B> copyOf(final WriteRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends WriteRequest.Selector<WriteRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static WriteRequest.Select _root() {
            return new WriteRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>> nodesToWrite = null;

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
            if (this.nodesToWrite!= null) {
                products.put("nodesToWrite", this.nodesToWrite.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>> nodesToWrite() {
            return ((this.nodesToWrite == null)?this.nodesToWrite = new com.kscs.util.jaxb.Selector<TRoot, WriteRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToWrite"):this.nodesToWrite);
        }

    }

}
