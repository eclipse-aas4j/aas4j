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
 * <p>Java-Klasse für TranslateBrowsePathsToNodeIdsRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TranslateBrowsePathsToNodeIdsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="BrowsePaths" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfBrowsePath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslateBrowsePathsToNodeIdsRequest", propOrder = {
    "requestHeader",
    "browsePaths"
})
public class TranslateBrowsePathsToNodeIdsRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "BrowsePaths", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfBrowsePath> browsePaths;

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
     * Ruft den Wert der browsePaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfBrowsePath }{@code >}
     *     
     */
    public JAXBElement<ListOfBrowsePath> getBrowsePaths() {
        return browsePaths;
    }

    /**
     * Legt den Wert der browsePaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfBrowsePath }{@code >}
     *     
     */
    public void setBrowsePaths(JAXBElement<ListOfBrowsePath> value) {
        this.browsePaths = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TranslateBrowsePathsToNodeIdsRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.browsePaths = this.browsePaths;
    }

    public<_B >TranslateBrowsePathsToNodeIdsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TranslateBrowsePathsToNodeIdsRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public TranslateBrowsePathsToNodeIdsRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TranslateBrowsePathsToNodeIdsRequest.Builder<Void> builder() {
        return new TranslateBrowsePathsToNodeIdsRequest.Builder<Void>(null, null, false);
    }

    public static<_B >TranslateBrowsePathsToNodeIdsRequest.Builder<_B> copyOf(final TranslateBrowsePathsToNodeIdsRequest _other) {
        final TranslateBrowsePathsToNodeIdsRequest.Builder<_B> _newBuilder = new TranslateBrowsePathsToNodeIdsRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final TranslateBrowsePathsToNodeIdsRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree browsePathsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePaths"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathsPropertyTree!= null):((browsePathsPropertyTree == null)||(!browsePathsPropertyTree.isLeaf())))) {
            _other.browsePaths = this.browsePaths;
        }
    }

    public<_B >TranslateBrowsePathsToNodeIdsRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TranslateBrowsePathsToNodeIdsRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TranslateBrowsePathsToNodeIdsRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TranslateBrowsePathsToNodeIdsRequest.Builder<_B> copyOf(final TranslateBrowsePathsToNodeIdsRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TranslateBrowsePathsToNodeIdsRequest.Builder<_B> _newBuilder = new TranslateBrowsePathsToNodeIdsRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TranslateBrowsePathsToNodeIdsRequest.Builder<Void> copyExcept(final TranslateBrowsePathsToNodeIdsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TranslateBrowsePathsToNodeIdsRequest.Builder<Void> copyOnly(final TranslateBrowsePathsToNodeIdsRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final TranslateBrowsePathsToNodeIdsRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfBrowsePath> browsePaths;

        public Builder(final _B _parentBuilder, final TranslateBrowsePathsToNodeIdsRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.browsePaths = _other.browsePaths;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final TranslateBrowsePathsToNodeIdsRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree browsePathsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePaths"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathsPropertyTree!= null):((browsePathsPropertyTree == null)||(!browsePathsPropertyTree.isLeaf())))) {
                        this.browsePaths = _other.browsePaths;
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

        protected<_P extends TranslateBrowsePathsToNodeIdsRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.browsePaths = this.browsePaths;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public TranslateBrowsePathsToNodeIdsRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePaths" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browsePaths
         *     Neuer Wert der Eigenschaft "browsePaths".
         */
        public TranslateBrowsePathsToNodeIdsRequest.Builder<_B> withBrowsePaths(final JAXBElement<ListOfBrowsePath> browsePaths) {
            this.browsePaths = browsePaths;
            return this;
        }

        @Override
        public TranslateBrowsePathsToNodeIdsRequest build() {
            if (_storedValue == null) {
                return this.init(new TranslateBrowsePathsToNodeIdsRequest());
            } else {
                return ((TranslateBrowsePathsToNodeIdsRequest) _storedValue);
            }
        }

        public TranslateBrowsePathsToNodeIdsRequest.Builder<_B> copyOf(final TranslateBrowsePathsToNodeIdsRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public TranslateBrowsePathsToNodeIdsRequest.Builder<_B> copyOf(final TranslateBrowsePathsToNodeIdsRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends TranslateBrowsePathsToNodeIdsRequest.Selector<TranslateBrowsePathsToNodeIdsRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TranslateBrowsePathsToNodeIdsRequest.Select _root() {
            return new TranslateBrowsePathsToNodeIdsRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>> browsePaths = null;

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
            if (this.browsePaths!= null) {
                products.put("browsePaths", this.browsePaths.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>> browsePaths() {
            return ((this.browsePaths == null)?this.browsePaths = new com.kscs.util.jaxb.Selector<TRoot, TranslateBrowsePathsToNodeIdsRequest.Selector<TRoot, TParent>>(this._root, this, "browsePaths"):this.browsePaths);
        }

    }

}
