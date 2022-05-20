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
 * <p>Java-Klasse für HistoryReadResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryReadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfHistoryReadResult" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryReadResponse", propOrder = {
    "responseHeader",
    "results",
    "diagnosticInfos"
})
public class HistoryReadResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "Results", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfHistoryReadResult> results;
    @XmlElementRef(name = "DiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

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
     * Ruft den Wert der results-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryReadResult }{@code >}
     *     
     */
    public JAXBElement<ListOfHistoryReadResult> getResults() {
        return results;
    }

    /**
     * Legt den Wert der results-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryReadResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ListOfHistoryReadResult> value) {
        this.results = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryReadResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.results = this.results;
        _other.diagnosticInfos = this.diagnosticInfos;
    }

    public<_B >HistoryReadResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryReadResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryReadResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryReadResponse.Builder<Void> builder() {
        return new HistoryReadResponse.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryReadResponse.Builder<_B> copyOf(final HistoryReadResponse _other) {
        final HistoryReadResponse.Builder<_B> _newBuilder = new HistoryReadResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryReadResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree resultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("results"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultsPropertyTree!= null):((resultsPropertyTree == null)||(!resultsPropertyTree.isLeaf())))) {
            _other.results = this.results;
        }
        final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
            _other.diagnosticInfos = this.diagnosticInfos;
        }
    }

    public<_B >HistoryReadResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryReadResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryReadResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryReadResponse.Builder<_B> copyOf(final HistoryReadResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryReadResponse.Builder<_B> _newBuilder = new HistoryReadResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryReadResponse.Builder<Void> copyExcept(final HistoryReadResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryReadResponse.Builder<Void> copyOnly(final HistoryReadResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryReadResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<ListOfHistoryReadResult> results;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

        public Builder(final _B _parentBuilder, final HistoryReadResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.results = _other.results;
                    this.diagnosticInfos = _other.diagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryReadResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree resultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("results"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultsPropertyTree!= null):((resultsPropertyTree == null)||(!resultsPropertyTree.isLeaf())))) {
                        this.results = _other.results;
                    }
                    final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
                        this.diagnosticInfos = _other.diagnosticInfos;
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

        protected<_P extends HistoryReadResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.results = this.results;
            _product.diagnosticInfos = this.diagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public HistoryReadResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "results" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param results
         *     Neuer Wert der Eigenschaft "results".
         */
        public HistoryReadResponse.Builder<_B> withResults(final JAXBElement<ListOfHistoryReadResult> results) {
            this.results = results;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfos" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfos
         *     Neuer Wert der Eigenschaft "diagnosticInfos".
         */
        public HistoryReadResponse.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        @Override
        public HistoryReadResponse build() {
            if (_storedValue == null) {
                return this.init(new HistoryReadResponse());
            } else {
                return ((HistoryReadResponse) _storedValue);
            }
        }

        public HistoryReadResponse.Builder<_B> copyOf(final HistoryReadResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryReadResponse.Builder<_B> copyOf(final HistoryReadResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryReadResponse.Selector<HistoryReadResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryReadResponse.Select _root() {
            return new HistoryReadResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> results = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> diagnosticInfos = null;

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
            if (this.results!= null) {
                products.put("results", this.results.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> results() {
            return ((this.results == null)?this.results = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>>(this._root, this, "results"):this.results);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadResponse.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

    }

}
