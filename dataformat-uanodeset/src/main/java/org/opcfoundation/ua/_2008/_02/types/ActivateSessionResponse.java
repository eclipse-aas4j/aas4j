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
 * <p>Java-Klasse für ActivateSessionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivateSessionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="ServerNonce" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
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
@XmlType(name = "ActivateSessionResponse", propOrder = {
    "responseHeader",
    "serverNonce",
    "results",
    "diagnosticInfos"
})
public class ActivateSessionResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "ServerNonce", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> serverNonce;
    @XmlElementRef(name = "Results", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> results;
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
     * Ruft den Wert der serverNonce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getServerNonce() {
        return serverNonce;
    }

    /**
     * Legt den Wert der serverNonce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setServerNonce(JAXBElement<byte[]> value) {
        this.serverNonce = value;
    }

    /**
     * Ruft den Wert der results-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getResults() {
        return results;
    }

    /**
     * Legt den Wert der results-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setResults(JAXBElement<ListOfStatusCode> value) {
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
    public<_B >void copyTo(final ActivateSessionResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.serverNonce = this.serverNonce;
        _other.results = this.results;
        _other.diagnosticInfos = this.diagnosticInfos;
    }

    public<_B >ActivateSessionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ActivateSessionResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public ActivateSessionResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ActivateSessionResponse.Builder<Void> builder() {
        return new ActivateSessionResponse.Builder<Void>(null, null, false);
    }

    public static<_B >ActivateSessionResponse.Builder<_B> copyOf(final ActivateSessionResponse _other) {
        final ActivateSessionResponse.Builder<_B> _newBuilder = new ActivateSessionResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ActivateSessionResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
            _other.serverNonce = this.serverNonce;
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

    public<_B >ActivateSessionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ActivateSessionResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ActivateSessionResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ActivateSessionResponse.Builder<_B> copyOf(final ActivateSessionResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ActivateSessionResponse.Builder<_B> _newBuilder = new ActivateSessionResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ActivateSessionResponse.Builder<Void> copyExcept(final ActivateSessionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ActivateSessionResponse.Builder<Void> copyOnly(final ActivateSessionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ActivateSessionResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<byte[]> serverNonce;
        private JAXBElement<ListOfStatusCode> results;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

        public Builder(final _B _parentBuilder, final ActivateSessionResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.serverNonce = _other.serverNonce;
                    this.results = _other.results;
                    this.diagnosticInfos = _other.diagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ActivateSessionResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
                        this.serverNonce = _other.serverNonce;
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

        protected<_P extends ActivateSessionResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.serverNonce = this.serverNonce;
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
        public ActivateSessionResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverNonce" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverNonce
         *     Neuer Wert der Eigenschaft "serverNonce".
         */
        public ActivateSessionResponse.Builder<_B> withServerNonce(final JAXBElement<byte[]> serverNonce) {
            this.serverNonce = serverNonce;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "results" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param results
         *     Neuer Wert der Eigenschaft "results".
         */
        public ActivateSessionResponse.Builder<_B> withResults(final JAXBElement<ListOfStatusCode> results) {
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
        public ActivateSessionResponse.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        @Override
        public ActivateSessionResponse build() {
            if (_storedValue == null) {
                return this.init(new ActivateSessionResponse());
            } else {
                return ((ActivateSessionResponse) _storedValue);
            }
        }

        public ActivateSessionResponse.Builder<_B> copyOf(final ActivateSessionResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public ActivateSessionResponse.Builder<_B> copyOf(final ActivateSessionResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ActivateSessionResponse.Selector<ActivateSessionResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ActivateSessionResponse.Select _root() {
            return new ActivateSessionResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> serverNonce = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> results = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> diagnosticInfos = null;

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
            if (this.serverNonce!= null) {
                products.put("serverNonce", this.serverNonce.init());
            }
            if (this.results!= null) {
                products.put("results", this.results.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> serverNonce() {
            return ((this.serverNonce == null)?this.serverNonce = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "serverNonce"):this.serverNonce);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> results() {
            return ((this.results == null)?this.results = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "results"):this.results);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionResponse.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

    }

}
