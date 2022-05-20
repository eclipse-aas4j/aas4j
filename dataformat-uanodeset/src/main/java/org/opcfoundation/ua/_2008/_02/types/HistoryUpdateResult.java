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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für HistoryUpdateResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryUpdateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="OperationResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
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
@XmlType(name = "HistoryUpdateResult", propOrder = {
    "statusCode",
    "operationResults",
    "diagnosticInfos"
})
public class HistoryUpdateResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "OperationResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> operationResults;
    @XmlElementRef(name = "DiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

    /**
     * Ruft den Wert der operationResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getOperationResults() {
        return operationResults;
    }

    /**
     * Legt den Wert der operationResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setOperationResults(JAXBElement<ListOfStatusCode> value) {
        this.operationResults = value;
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
    public<_B >void copyTo(final HistoryUpdateResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.operationResults = this.operationResults;
        _other.diagnosticInfos = this.diagnosticInfos;
    }

    public<_B >HistoryUpdateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryUpdateResult.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryUpdateResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryUpdateResult.Builder<Void> builder() {
        return new HistoryUpdateResult.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryUpdateResult.Builder<_B> copyOf(final HistoryUpdateResult _other) {
        final HistoryUpdateResult.Builder<_B> _newBuilder = new HistoryUpdateResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryUpdateResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree operationResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operationResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operationResultsPropertyTree!= null):((operationResultsPropertyTree == null)||(!operationResultsPropertyTree.isLeaf())))) {
            _other.operationResults = this.operationResults;
        }
        final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
            _other.diagnosticInfos = this.diagnosticInfos;
        }
    }

    public<_B >HistoryUpdateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryUpdateResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryUpdateResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryUpdateResult.Builder<_B> copyOf(final HistoryUpdateResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryUpdateResult.Builder<_B> _newBuilder = new HistoryUpdateResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryUpdateResult.Builder<Void> copyExcept(final HistoryUpdateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryUpdateResult.Builder<Void> copyOnly(final HistoryUpdateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryUpdateResult _storedValue;
        private StatusCode.Builder<HistoryUpdateResult.Builder<_B>> statusCode;
        private JAXBElement<ListOfStatusCode> operationResults;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

        public Builder(final _B _parentBuilder, final HistoryUpdateResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.operationResults = _other.operationResults;
                    this.diagnosticInfos = _other.diagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryUpdateResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree operationResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operationResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operationResultsPropertyTree!= null):((operationResultsPropertyTree == null)||(!operationResultsPropertyTree.isLeaf())))) {
                        this.operationResults = _other.operationResults;
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

        protected<_P extends HistoryUpdateResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.operationResults = this.operationResults;
            _product.diagnosticInfos = this.diagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public HistoryUpdateResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<HistoryUpdateResult.Builder<_B>>(this, statusCode, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "statusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "statusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends HistoryUpdateResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<HistoryUpdateResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "operationResults" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param operationResults
         *     Neuer Wert der Eigenschaft "operationResults".
         */
        public HistoryUpdateResult.Builder<_B> withOperationResults(final JAXBElement<ListOfStatusCode> operationResults) {
            this.operationResults = operationResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfos" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfos
         *     Neuer Wert der Eigenschaft "diagnosticInfos".
         */
        public HistoryUpdateResult.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        @Override
        public HistoryUpdateResult build() {
            if (_storedValue == null) {
                return this.init(new HistoryUpdateResult());
            } else {
                return ((HistoryUpdateResult) _storedValue);
            }
        }

        public HistoryUpdateResult.Builder<_B> copyOf(final HistoryUpdateResult _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryUpdateResult.Builder<_B> copyOf(final HistoryUpdateResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryUpdateResult.Selector<HistoryUpdateResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryUpdateResult.Select _root() {
            return new HistoryUpdateResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> operationResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> diagnosticInfos = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            if (this.operationResults!= null) {
                products.put("operationResults", this.operationResults.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> operationResults() {
            return ((this.operationResults == null)?this.operationResults = new com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>>(this._root, this, "operationResults"):this.operationResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateResult.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

    }

}
