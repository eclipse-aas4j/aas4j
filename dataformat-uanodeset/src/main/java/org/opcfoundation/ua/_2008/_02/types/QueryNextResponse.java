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
 * <p>Java-Klasse für QueryNextResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryNextResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="QueryDataSets" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfQueryDataSet" minOccurs="0"/&gt;
 *         &lt;element name="RevisedContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNextResponse", propOrder = {
    "responseHeader",
    "queryDataSets",
    "revisedContinuationPoint"
})
public class QueryNextResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "QueryDataSets", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfQueryDataSet> queryDataSets;
    @XmlElementRef(name = "RevisedContinuationPoint", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> revisedContinuationPoint;

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
     * Ruft den Wert der queryDataSets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfQueryDataSet }{@code >}
     *     
     */
    public JAXBElement<ListOfQueryDataSet> getQueryDataSets() {
        return queryDataSets;
    }

    /**
     * Legt den Wert der queryDataSets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfQueryDataSet }{@code >}
     *     
     */
    public void setQueryDataSets(JAXBElement<ListOfQueryDataSet> value) {
        this.queryDataSets = value;
    }

    /**
     * Ruft den Wert der revisedContinuationPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getRevisedContinuationPoint() {
        return revisedContinuationPoint;
    }

    /**
     * Legt den Wert der revisedContinuationPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRevisedContinuationPoint(JAXBElement<byte[]> value) {
        this.revisedContinuationPoint = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QueryNextResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.queryDataSets = this.queryDataSets;
        _other.revisedContinuationPoint = this.revisedContinuationPoint;
    }

    public<_B >QueryNextResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryNextResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryNextResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryNextResponse.Builder<Void> builder() {
        return new QueryNextResponse.Builder<Void>(null, null, false);
    }

    public static<_B >QueryNextResponse.Builder<_B> copyOf(final QueryNextResponse _other) {
        final QueryNextResponse.Builder<_B> _newBuilder = new QueryNextResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryNextResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree queryDataSetsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataSets"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataSetsPropertyTree!= null):((queryDataSetsPropertyTree == null)||(!queryDataSetsPropertyTree.isLeaf())))) {
            _other.queryDataSets = this.queryDataSets;
        }
        final PropertyTree revisedContinuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedContinuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedContinuationPointPropertyTree!= null):((revisedContinuationPointPropertyTree == null)||(!revisedContinuationPointPropertyTree.isLeaf())))) {
            _other.revisedContinuationPoint = this.revisedContinuationPoint;
        }
    }

    public<_B >QueryNextResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryNextResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryNextResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryNextResponse.Builder<_B> copyOf(final QueryNextResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryNextResponse.Builder<_B> _newBuilder = new QueryNextResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryNextResponse.Builder<Void> copyExcept(final QueryNextResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryNextResponse.Builder<Void> copyOnly(final QueryNextResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryNextResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<ListOfQueryDataSet> queryDataSets;
        private JAXBElement<byte[]> revisedContinuationPoint;

        public Builder(final _B _parentBuilder, final QueryNextResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.queryDataSets = _other.queryDataSets;
                    this.revisedContinuationPoint = _other.revisedContinuationPoint;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryNextResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree queryDataSetsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataSets"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataSetsPropertyTree!= null):((queryDataSetsPropertyTree == null)||(!queryDataSetsPropertyTree.isLeaf())))) {
                        this.queryDataSets = _other.queryDataSets;
                    }
                    final PropertyTree revisedContinuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedContinuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedContinuationPointPropertyTree!= null):((revisedContinuationPointPropertyTree == null)||(!revisedContinuationPointPropertyTree.isLeaf())))) {
                        this.revisedContinuationPoint = _other.revisedContinuationPoint;
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

        protected<_P extends QueryNextResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.queryDataSets = this.queryDataSets;
            _product.revisedContinuationPoint = this.revisedContinuationPoint;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public QueryNextResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryDataSets" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param queryDataSets
         *     Neuer Wert der Eigenschaft "queryDataSets".
         */
        public QueryNextResponse.Builder<_B> withQueryDataSets(final JAXBElement<ListOfQueryDataSet> queryDataSets) {
            this.queryDataSets = queryDataSets;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedContinuationPoint" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedContinuationPoint
         *     Neuer Wert der Eigenschaft "revisedContinuationPoint".
         */
        public QueryNextResponse.Builder<_B> withRevisedContinuationPoint(final JAXBElement<byte[]> revisedContinuationPoint) {
            this.revisedContinuationPoint = revisedContinuationPoint;
            return this;
        }

        @Override
        public QueryNextResponse build() {
            if (_storedValue == null) {
                return this.init(new QueryNextResponse());
            } else {
                return ((QueryNextResponse) _storedValue);
            }
        }

        public QueryNextResponse.Builder<_B> copyOf(final QueryNextResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryNextResponse.Builder<_B> copyOf(final QueryNextResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryNextResponse.Selector<QueryNextResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryNextResponse.Select _root() {
            return new QueryNextResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> queryDataSets = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> revisedContinuationPoint = null;

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
            if (this.queryDataSets!= null) {
                products.put("queryDataSets", this.queryDataSets.init());
            }
            if (this.revisedContinuationPoint!= null) {
                products.put("revisedContinuationPoint", this.revisedContinuationPoint.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> queryDataSets() {
            return ((this.queryDataSets == null)?this.queryDataSets = new com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>>(this._root, this, "queryDataSets"):this.queryDataSets);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>> revisedContinuationPoint() {
            return ((this.revisedContinuationPoint == null)?this.revisedContinuationPoint = new com.kscs.util.jaxb.Selector<TRoot, QueryNextResponse.Selector<TRoot, TParent>>(this._root, this, "revisedContinuationPoint"):this.revisedContinuationPoint);
        }

    }

}
