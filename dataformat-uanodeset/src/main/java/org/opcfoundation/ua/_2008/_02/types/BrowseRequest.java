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
 * <p>Java-Klasse für BrowseRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrowseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="View" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ViewDescription" minOccurs="0"/&gt;
 *         &lt;element name="RequestedMaxReferencesPerNode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NodesToBrowse" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfBrowseDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseRequest", propOrder = {
    "requestHeader",
    "view",
    "requestedMaxReferencesPerNode",
    "nodesToBrowse"
})
public class BrowseRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "View", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ViewDescription> view;
    @XmlElement(name = "RequestedMaxReferencesPerNode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestedMaxReferencesPerNode;
    @XmlElementRef(name = "NodesToBrowse", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfBrowseDescription> nodesToBrowse;

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
     * Ruft den Wert der view-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ViewDescription }{@code >}
     *     
     */
    public JAXBElement<ViewDescription> getView() {
        return view;
    }

    /**
     * Legt den Wert der view-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ViewDescription }{@code >}
     *     
     */
    public void setView(JAXBElement<ViewDescription> value) {
        this.view = value;
    }

    /**
     * Ruft den Wert der requestedMaxReferencesPerNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedMaxReferencesPerNode() {
        return requestedMaxReferencesPerNode;
    }

    /**
     * Legt den Wert der requestedMaxReferencesPerNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedMaxReferencesPerNode(Long value) {
        this.requestedMaxReferencesPerNode = value;
    }

    /**
     * Ruft den Wert der nodesToBrowse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfBrowseDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfBrowseDescription> getNodesToBrowse() {
        return nodesToBrowse;
    }

    /**
     * Legt den Wert der nodesToBrowse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfBrowseDescription }{@code >}
     *     
     */
    public void setNodesToBrowse(JAXBElement<ListOfBrowseDescription> value) {
        this.nodesToBrowse = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrowseRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.view = this.view;
        _other.requestedMaxReferencesPerNode = this.requestedMaxReferencesPerNode;
        _other.nodesToBrowse = this.nodesToBrowse;
    }

    public<_B >BrowseRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrowseRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public BrowseRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrowseRequest.Builder<Void> builder() {
        return new BrowseRequest.Builder<Void>(null, null, false);
    }

    public static<_B >BrowseRequest.Builder<_B> copyOf(final BrowseRequest _other) {
        final BrowseRequest.Builder<_B> _newBuilder = new BrowseRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrowseRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree viewPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("view"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewPropertyTree!= null):((viewPropertyTree == null)||(!viewPropertyTree.isLeaf())))) {
            _other.view = this.view;
        }
        final PropertyTree requestedMaxReferencesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedMaxReferencesPerNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedMaxReferencesPerNodePropertyTree!= null):((requestedMaxReferencesPerNodePropertyTree == null)||(!requestedMaxReferencesPerNodePropertyTree.isLeaf())))) {
            _other.requestedMaxReferencesPerNode = this.requestedMaxReferencesPerNode;
        }
        final PropertyTree nodesToBrowsePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToBrowse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToBrowsePropertyTree!= null):((nodesToBrowsePropertyTree == null)||(!nodesToBrowsePropertyTree.isLeaf())))) {
            _other.nodesToBrowse = this.nodesToBrowse;
        }
    }

    public<_B >BrowseRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrowseRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BrowseRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrowseRequest.Builder<_B> copyOf(final BrowseRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrowseRequest.Builder<_B> _newBuilder = new BrowseRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrowseRequest.Builder<Void> copyExcept(final BrowseRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrowseRequest.Builder<Void> copyOnly(final BrowseRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BrowseRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ViewDescription> view;
        private Long requestedMaxReferencesPerNode;
        private JAXBElement<ListOfBrowseDescription> nodesToBrowse;

        public Builder(final _B _parentBuilder, final BrowseRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.view = _other.view;
                    this.requestedMaxReferencesPerNode = _other.requestedMaxReferencesPerNode;
                    this.nodesToBrowse = _other.nodesToBrowse;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BrowseRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree viewPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("view"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewPropertyTree!= null):((viewPropertyTree == null)||(!viewPropertyTree.isLeaf())))) {
                        this.view = _other.view;
                    }
                    final PropertyTree requestedMaxReferencesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedMaxReferencesPerNode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedMaxReferencesPerNodePropertyTree!= null):((requestedMaxReferencesPerNodePropertyTree == null)||(!requestedMaxReferencesPerNodePropertyTree.isLeaf())))) {
                        this.requestedMaxReferencesPerNode = _other.requestedMaxReferencesPerNode;
                    }
                    final PropertyTree nodesToBrowsePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToBrowse"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToBrowsePropertyTree!= null):((nodesToBrowsePropertyTree == null)||(!nodesToBrowsePropertyTree.isLeaf())))) {
                        this.nodesToBrowse = _other.nodesToBrowse;
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

        protected<_P extends BrowseRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.view = this.view;
            _product.requestedMaxReferencesPerNode = this.requestedMaxReferencesPerNode;
            _product.nodesToBrowse = this.nodesToBrowse;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public BrowseRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "view" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param view
         *     Neuer Wert der Eigenschaft "view".
         */
        public BrowseRequest.Builder<_B> withView(final JAXBElement<ViewDescription> view) {
            this.view = view;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedMaxReferencesPerNode" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedMaxReferencesPerNode
         *     Neuer Wert der Eigenschaft "requestedMaxReferencesPerNode".
         */
        public BrowseRequest.Builder<_B> withRequestedMaxReferencesPerNode(final Long requestedMaxReferencesPerNode) {
            this.requestedMaxReferencesPerNode = requestedMaxReferencesPerNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToBrowse" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodesToBrowse
         *     Neuer Wert der Eigenschaft "nodesToBrowse".
         */
        public BrowseRequest.Builder<_B> withNodesToBrowse(final JAXBElement<ListOfBrowseDescription> nodesToBrowse) {
            this.nodesToBrowse = nodesToBrowse;
            return this;
        }

        @Override
        public BrowseRequest build() {
            if (_storedValue == null) {
                return this.init(new BrowseRequest());
            } else {
                return ((BrowseRequest) _storedValue);
            }
        }

        public BrowseRequest.Builder<_B> copyOf(final BrowseRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public BrowseRequest.Builder<_B> copyOf(final BrowseRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrowseRequest.Selector<BrowseRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrowseRequest.Select _root() {
            return new BrowseRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> view = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> requestedMaxReferencesPerNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> nodesToBrowse = null;

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
            if (this.view!= null) {
                products.put("view", this.view.init());
            }
            if (this.requestedMaxReferencesPerNode!= null) {
                products.put("requestedMaxReferencesPerNode", this.requestedMaxReferencesPerNode.init());
            }
            if (this.nodesToBrowse!= null) {
                products.put("nodesToBrowse", this.nodesToBrowse.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> view() {
            return ((this.view == null)?this.view = new com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>>(this._root, this, "view"):this.view);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> requestedMaxReferencesPerNode() {
            return ((this.requestedMaxReferencesPerNode == null)?this.requestedMaxReferencesPerNode = new com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>>(this._root, this, "requestedMaxReferencesPerNode"):this.requestedMaxReferencesPerNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>> nodesToBrowse() {
            return ((this.nodesToBrowse == null)?this.nodesToBrowse = new com.kscs.util.jaxb.Selector<TRoot, BrowseRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToBrowse"):this.nodesToBrowse);
        }

    }

}
