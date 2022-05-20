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
 * <p>Java-Klasse für QueryFirstResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryFirstResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="QueryDataSets" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfQueryDataSet" minOccurs="0"/&gt;
 *         &lt;element name="ContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ParsingResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfParsingResult" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *         &lt;element name="FilterResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilterResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFirstResponse", propOrder = {
    "responseHeader",
    "queryDataSets",
    "continuationPoint",
    "parsingResults",
    "diagnosticInfos",
    "filterResult"
})
public class QueryFirstResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "QueryDataSets", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfQueryDataSet> queryDataSets;
    @XmlElementRef(name = "ContinuationPoint", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> continuationPoint;
    @XmlElementRef(name = "ParsingResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfParsingResult> parsingResults;
    @XmlElementRef(name = "DiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;
    @XmlElementRef(name = "FilterResult", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilterResult> filterResult;

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
     * Ruft den Wert der continuationPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContinuationPoint() {
        return continuationPoint;
    }

    /**
     * Legt den Wert der continuationPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContinuationPoint(JAXBElement<byte[]> value) {
        this.continuationPoint = value;
    }

    /**
     * Ruft den Wert der parsingResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfParsingResult }{@code >}
     *     
     */
    public JAXBElement<ListOfParsingResult> getParsingResults() {
        return parsingResults;
    }

    /**
     * Legt den Wert der parsingResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfParsingResult }{@code >}
     *     
     */
    public void setParsingResults(JAXBElement<ListOfParsingResult> value) {
        this.parsingResults = value;
    }

    /**
     * Ruft den Wert der diagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getDiagnosticInfos() {
        return diagnosticInfos;
    }

    /**
     * Legt den Wert der diagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.diagnosticInfos = value;
    }

    /**
     * Ruft den Wert der filterResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterResult }{@code >}
     *     
     */
    public JAXBElement<ContentFilterResult> getFilterResult() {
        return filterResult;
    }

    /**
     * Legt den Wert der filterResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterResult }{@code >}
     *     
     */
    public void setFilterResult(JAXBElement<ContentFilterResult> value) {
        this.filterResult = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QueryFirstResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.queryDataSets = this.queryDataSets;
        _other.continuationPoint = this.continuationPoint;
        _other.parsingResults = this.parsingResults;
        _other.diagnosticInfos = this.diagnosticInfos;
        _other.filterResult = this.filterResult;
    }

    public<_B >QueryFirstResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryFirstResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryFirstResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryFirstResponse.Builder<Void> builder() {
        return new QueryFirstResponse.Builder<Void>(null, null, false);
    }

    public static<_B >QueryFirstResponse.Builder<_B> copyOf(final QueryFirstResponse _other) {
        final QueryFirstResponse.Builder<_B> _newBuilder = new QueryFirstResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryFirstResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree queryDataSetsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryDataSets"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryDataSetsPropertyTree!= null):((queryDataSetsPropertyTree == null)||(!queryDataSetsPropertyTree.isLeaf())))) {
            _other.queryDataSets = this.queryDataSets;
        }
        final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
            _other.continuationPoint = this.continuationPoint;
        }
        final PropertyTree parsingResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parsingResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parsingResultsPropertyTree!= null):((parsingResultsPropertyTree == null)||(!parsingResultsPropertyTree.isLeaf())))) {
            _other.parsingResults = this.parsingResults;
        }
        final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
            _other.diagnosticInfos = this.diagnosticInfos;
        }
        final PropertyTree filterResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterResultPropertyTree!= null):((filterResultPropertyTree == null)||(!filterResultPropertyTree.isLeaf())))) {
            _other.filterResult = this.filterResult;
        }
    }

    public<_B >QueryFirstResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryFirstResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryFirstResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryFirstResponse.Builder<_B> copyOf(final QueryFirstResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryFirstResponse.Builder<_B> _newBuilder = new QueryFirstResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryFirstResponse.Builder<Void> copyExcept(final QueryFirstResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryFirstResponse.Builder<Void> copyOnly(final QueryFirstResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryFirstResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<ListOfQueryDataSet> queryDataSets;
        private JAXBElement<byte[]> continuationPoint;
        private JAXBElement<ListOfParsingResult> parsingResults;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;
        private JAXBElement<ContentFilterResult> filterResult;

        public Builder(final _B _parentBuilder, final QueryFirstResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.queryDataSets = _other.queryDataSets;
                    this.continuationPoint = _other.continuationPoint;
                    this.parsingResults = _other.parsingResults;
                    this.diagnosticInfos = _other.diagnosticInfos;
                    this.filterResult = _other.filterResult;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryFirstResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
                        this.continuationPoint = _other.continuationPoint;
                    }
                    final PropertyTree parsingResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parsingResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parsingResultsPropertyTree!= null):((parsingResultsPropertyTree == null)||(!parsingResultsPropertyTree.isLeaf())))) {
                        this.parsingResults = _other.parsingResults;
                    }
                    final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
                        this.diagnosticInfos = _other.diagnosticInfos;
                    }
                    final PropertyTree filterResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterResultPropertyTree!= null):((filterResultPropertyTree == null)||(!filterResultPropertyTree.isLeaf())))) {
                        this.filterResult = _other.filterResult;
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

        protected<_P extends QueryFirstResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.queryDataSets = this.queryDataSets;
            _product.continuationPoint = this.continuationPoint;
            _product.parsingResults = this.parsingResults;
            _product.diagnosticInfos = this.diagnosticInfos;
            _product.filterResult = this.filterResult;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public QueryFirstResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
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
        public QueryFirstResponse.Builder<_B> withQueryDataSets(final JAXBElement<ListOfQueryDataSet> queryDataSets) {
            this.queryDataSets = queryDataSets;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "continuationPoint" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param continuationPoint
         *     Neuer Wert der Eigenschaft "continuationPoint".
         */
        public QueryFirstResponse.Builder<_B> withContinuationPoint(final JAXBElement<byte[]> continuationPoint) {
            this.continuationPoint = continuationPoint;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parsingResults" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param parsingResults
         *     Neuer Wert der Eigenschaft "parsingResults".
         */
        public QueryFirstResponse.Builder<_B> withParsingResults(final JAXBElement<ListOfParsingResult> parsingResults) {
            this.parsingResults = parsingResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfos" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfos
         *     Neuer Wert der Eigenschaft "diagnosticInfos".
         */
        public QueryFirstResponse.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filterResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param filterResult
         *     Neuer Wert der Eigenschaft "filterResult".
         */
        public QueryFirstResponse.Builder<_B> withFilterResult(final JAXBElement<ContentFilterResult> filterResult) {
            this.filterResult = filterResult;
            return this;
        }

        @Override
        public QueryFirstResponse build() {
            if (_storedValue == null) {
                return this.init(new QueryFirstResponse());
            } else {
                return ((QueryFirstResponse) _storedValue);
            }
        }

        public QueryFirstResponse.Builder<_B> copyOf(final QueryFirstResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryFirstResponse.Builder<_B> copyOf(final QueryFirstResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryFirstResponse.Selector<QueryFirstResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryFirstResponse.Select _root() {
            return new QueryFirstResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> queryDataSets = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> continuationPoint = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> parsingResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> diagnosticInfos = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> filterResult = null;

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
            if (this.continuationPoint!= null) {
                products.put("continuationPoint", this.continuationPoint.init());
            }
            if (this.parsingResults!= null) {
                products.put("parsingResults", this.parsingResults.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            if (this.filterResult!= null) {
                products.put("filterResult", this.filterResult.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> queryDataSets() {
            return ((this.queryDataSets == null)?this.queryDataSets = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "queryDataSets"):this.queryDataSets);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> continuationPoint() {
            return ((this.continuationPoint == null)?this.continuationPoint = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "continuationPoint"):this.continuationPoint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> parsingResults() {
            return ((this.parsingResults == null)?this.parsingResults = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "parsingResults"):this.parsingResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>> filterResult() {
            return ((this.filterResult == null)?this.filterResult = new com.kscs.util.jaxb.Selector<TRoot, QueryFirstResponse.Selector<TRoot, TParent>>(this._root, this, "filterResult"):this.filterResult);
        }

    }

}
