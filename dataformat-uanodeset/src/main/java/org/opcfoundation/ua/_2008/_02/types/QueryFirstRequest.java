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
 * <p>Java-Klasse für QueryFirstRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryFirstRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="View" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ViewDescription" minOccurs="0"/&gt;
 *         &lt;element name="NodeTypes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfNodeTypeDescription" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilter" minOccurs="0"/&gt;
 *         &lt;element name="MaxDataSetsToReturn" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxReferencesToReturn" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFirstRequest", propOrder = {
    "requestHeader",
    "view",
    "nodeTypes",
    "filter",
    "maxDataSetsToReturn",
    "maxReferencesToReturn"
})
public class QueryFirstRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "View", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ViewDescription> view;
    @XmlElementRef(name = "NodeTypes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNodeTypeDescription> nodeTypes;
    @XmlElementRef(name = "Filter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilter> filter;
    @XmlElement(name = "MaxDataSetsToReturn")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxDataSetsToReturn;
    @XmlElement(name = "MaxReferencesToReturn")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxReferencesToReturn;

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
     * Ruft den Wert der nodeTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeTypeDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfNodeTypeDescription> getNodeTypes() {
        return nodeTypes;
    }

    /**
     * Legt den Wert der nodeTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeTypeDescription }{@code >}
     *     
     */
    public void setNodeTypes(JAXBElement<ListOfNodeTypeDescription> value) {
        this.nodeTypes = value;
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public JAXBElement<ContentFilter> getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public void setFilter(JAXBElement<ContentFilter> value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der maxDataSetsToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDataSetsToReturn() {
        return maxDataSetsToReturn;
    }

    /**
     * Legt den Wert der maxDataSetsToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDataSetsToReturn(Long value) {
        this.maxDataSetsToReturn = value;
    }

    /**
     * Ruft den Wert der maxReferencesToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxReferencesToReturn() {
        return maxReferencesToReturn;
    }

    /**
     * Legt den Wert der maxReferencesToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxReferencesToReturn(Long value) {
        this.maxReferencesToReturn = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QueryFirstRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.view = this.view;
        _other.nodeTypes = this.nodeTypes;
        _other.filter = this.filter;
        _other.maxDataSetsToReturn = this.maxDataSetsToReturn;
        _other.maxReferencesToReturn = this.maxReferencesToReturn;
    }

    public<_B >QueryFirstRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryFirstRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryFirstRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryFirstRequest.Builder<Void> builder() {
        return new QueryFirstRequest.Builder<Void>(null, null, false);
    }

    public static<_B >QueryFirstRequest.Builder<_B> copyOf(final QueryFirstRequest _other) {
        final QueryFirstRequest.Builder<_B> _newBuilder = new QueryFirstRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryFirstRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree viewPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("view"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewPropertyTree!= null):((viewPropertyTree == null)||(!viewPropertyTree.isLeaf())))) {
            _other.view = this.view;
        }
        final PropertyTree nodeTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeTypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeTypesPropertyTree!= null):((nodeTypesPropertyTree == null)||(!nodeTypesPropertyTree.isLeaf())))) {
            _other.nodeTypes = this.nodeTypes;
        }
        final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
            _other.filter = this.filter;
        }
        final PropertyTree maxDataSetsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxDataSetsToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxDataSetsToReturnPropertyTree!= null):((maxDataSetsToReturnPropertyTree == null)||(!maxDataSetsToReturnPropertyTree.isLeaf())))) {
            _other.maxDataSetsToReturn = this.maxDataSetsToReturn;
        }
        final PropertyTree maxReferencesToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxReferencesToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxReferencesToReturnPropertyTree!= null):((maxReferencesToReturnPropertyTree == null)||(!maxReferencesToReturnPropertyTree.isLeaf())))) {
            _other.maxReferencesToReturn = this.maxReferencesToReturn;
        }
    }

    public<_B >QueryFirstRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryFirstRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryFirstRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryFirstRequest.Builder<_B> copyOf(final QueryFirstRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryFirstRequest.Builder<_B> _newBuilder = new QueryFirstRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryFirstRequest.Builder<Void> copyExcept(final QueryFirstRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryFirstRequest.Builder<Void> copyOnly(final QueryFirstRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryFirstRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ViewDescription> view;
        private JAXBElement<ListOfNodeTypeDescription> nodeTypes;
        private JAXBElement<ContentFilter> filter;
        private Long maxDataSetsToReturn;
        private Long maxReferencesToReturn;

        public Builder(final _B _parentBuilder, final QueryFirstRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.view = _other.view;
                    this.nodeTypes = _other.nodeTypes;
                    this.filter = _other.filter;
                    this.maxDataSetsToReturn = _other.maxDataSetsToReturn;
                    this.maxReferencesToReturn = _other.maxReferencesToReturn;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryFirstRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree nodeTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeTypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeTypesPropertyTree!= null):((nodeTypesPropertyTree == null)||(!nodeTypesPropertyTree.isLeaf())))) {
                        this.nodeTypes = _other.nodeTypes;
                    }
                    final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
                        this.filter = _other.filter;
                    }
                    final PropertyTree maxDataSetsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxDataSetsToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxDataSetsToReturnPropertyTree!= null):((maxDataSetsToReturnPropertyTree == null)||(!maxDataSetsToReturnPropertyTree.isLeaf())))) {
                        this.maxDataSetsToReturn = _other.maxDataSetsToReturn;
                    }
                    final PropertyTree maxReferencesToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxReferencesToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxReferencesToReturnPropertyTree!= null):((maxReferencesToReturnPropertyTree == null)||(!maxReferencesToReturnPropertyTree.isLeaf())))) {
                        this.maxReferencesToReturn = _other.maxReferencesToReturn;
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

        protected<_P extends QueryFirstRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.view = this.view;
            _product.nodeTypes = this.nodeTypes;
            _product.filter = this.filter;
            _product.maxDataSetsToReturn = this.maxDataSetsToReturn;
            _product.maxReferencesToReturn = this.maxReferencesToReturn;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public QueryFirstRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
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
        public QueryFirstRequest.Builder<_B> withView(final JAXBElement<ViewDescription> view) {
            this.view = view;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeTypes" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeTypes
         *     Neuer Wert der Eigenschaft "nodeTypes".
         */
        public QueryFirstRequest.Builder<_B> withNodeTypes(final JAXBElement<ListOfNodeTypeDescription> nodeTypes) {
            this.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filter" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param filter
         *     Neuer Wert der Eigenschaft "filter".
         */
        public QueryFirstRequest.Builder<_B> withFilter(final JAXBElement<ContentFilter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxDataSetsToReturn" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param maxDataSetsToReturn
         *     Neuer Wert der Eigenschaft "maxDataSetsToReturn".
         */
        public QueryFirstRequest.Builder<_B> withMaxDataSetsToReturn(final Long maxDataSetsToReturn) {
            this.maxDataSetsToReturn = maxDataSetsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxReferencesToReturn" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxReferencesToReturn
         *     Neuer Wert der Eigenschaft "maxReferencesToReturn".
         */
        public QueryFirstRequest.Builder<_B> withMaxReferencesToReturn(final Long maxReferencesToReturn) {
            this.maxReferencesToReturn = maxReferencesToReturn;
            return this;
        }

        @Override
        public QueryFirstRequest build() {
            if (_storedValue == null) {
                return this.init(new QueryFirstRequest());
            } else {
                return ((QueryFirstRequest) _storedValue);
            }
        }

        public QueryFirstRequest.Builder<_B> copyOf(final QueryFirstRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryFirstRequest.Builder<_B> copyOf(final QueryFirstRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryFirstRequest.Selector<QueryFirstRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryFirstRequest.Select _root() {
            return new QueryFirstRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> view = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> nodeTypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> filter = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> maxDataSetsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> maxReferencesToReturn = null;

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
            if (this.nodeTypes!= null) {
                products.put("nodeTypes", this.nodeTypes.init());
            }
            if (this.filter!= null) {
                products.put("filter", this.filter.init());
            }
            if (this.maxDataSetsToReturn!= null) {
                products.put("maxDataSetsToReturn", this.maxDataSetsToReturn.init());
            }
            if (this.maxReferencesToReturn!= null) {
                products.put("maxReferencesToReturn", this.maxReferencesToReturn.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> view() {
            return ((this.view == null)?this.view = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "view"):this.view);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> nodeTypes() {
            return ((this.nodeTypes == null)?this.nodeTypes = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "nodeTypes"):this.nodeTypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> filter() {
            return ((this.filter == null)?this.filter = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "filter"):this.filter);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> maxDataSetsToReturn() {
            return ((this.maxDataSetsToReturn == null)?this.maxDataSetsToReturn = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "maxDataSetsToReturn"):this.maxDataSetsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>> maxReferencesToReturn() {
            return ((this.maxReferencesToReturn == null)?this.maxReferencesToReturn = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstRequest.Selector<TRoot, TParent>>(this._root, this, "maxReferencesToReturn"):this.maxReferencesToReturn);
        }

    }

}
