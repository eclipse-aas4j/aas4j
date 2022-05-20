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
 * <p>Java-Klasse für CallMethodResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallMethodResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="InputArgumentResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="InputArgumentDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *         &lt;element name="OutputArguments" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallMethodResult", propOrder = {
    "statusCode",
    "inputArgumentResults",
    "inputArgumentDiagnosticInfos",
    "outputArguments"
})
public class CallMethodResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "InputArgumentResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> inputArgumentResults;
    @XmlElementRef(name = "InputArgumentDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> inputArgumentDiagnosticInfos;
    @XmlElementRef(name = "OutputArguments", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> outputArguments;

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
     * Ruft den Wert der inputArgumentResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getInputArgumentResults() {
        return inputArgumentResults;
    }

    /**
     * Legt den Wert der inputArgumentResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setInputArgumentResults(JAXBElement<ListOfStatusCode> value) {
        this.inputArgumentResults = value;
    }

    /**
     * Ruft den Wert der inputArgumentDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getInputArgumentDiagnosticInfos() {
        return inputArgumentDiagnosticInfos;
    }

    /**
     * Legt den Wert der inputArgumentDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setInputArgumentDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.inputArgumentDiagnosticInfos = value;
    }

    /**
     * Ruft den Wert der outputArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getOutputArguments() {
        return outputArguments;
    }

    /**
     * Legt den Wert der outputArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setOutputArguments(JAXBElement<ListOfVariant> value) {
        this.outputArguments = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CallMethodResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.inputArgumentResults = this.inputArgumentResults;
        _other.inputArgumentDiagnosticInfos = this.inputArgumentDiagnosticInfos;
        _other.outputArguments = this.outputArguments;
    }

    public<_B >CallMethodResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CallMethodResult.Builder<_B>(_parentBuilder, this, true);
    }

    public CallMethodResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CallMethodResult.Builder<Void> builder() {
        return new CallMethodResult.Builder<Void>(null, null, false);
    }

    public static<_B >CallMethodResult.Builder<_B> copyOf(final CallMethodResult _other) {
        final CallMethodResult.Builder<_B> _newBuilder = new CallMethodResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CallMethodResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree inputArgumentResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArgumentResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentResultsPropertyTree!= null):((inputArgumentResultsPropertyTree == null)||(!inputArgumentResultsPropertyTree.isLeaf())))) {
            _other.inputArgumentResults = this.inputArgumentResults;
        }
        final PropertyTree inputArgumentDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArgumentDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentDiagnosticInfosPropertyTree!= null):((inputArgumentDiagnosticInfosPropertyTree == null)||(!inputArgumentDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.inputArgumentDiagnosticInfos = this.inputArgumentDiagnosticInfos;
        }
        final PropertyTree outputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("outputArguments"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(outputArgumentsPropertyTree!= null):((outputArgumentsPropertyTree == null)||(!outputArgumentsPropertyTree.isLeaf())))) {
            _other.outputArguments = this.outputArguments;
        }
    }

    public<_B >CallMethodResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CallMethodResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CallMethodResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CallMethodResult.Builder<_B> copyOf(final CallMethodResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CallMethodResult.Builder<_B> _newBuilder = new CallMethodResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CallMethodResult.Builder<Void> copyExcept(final CallMethodResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CallMethodResult.Builder<Void> copyOnly(final CallMethodResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CallMethodResult _storedValue;
        private StatusCode.Builder<CallMethodResult.Builder<_B>> statusCode;
        private JAXBElement<ListOfStatusCode> inputArgumentResults;
        private JAXBElement<ListOfDiagnosticInfo> inputArgumentDiagnosticInfos;
        private JAXBElement<ListOfVariant> outputArguments;

        public Builder(final _B _parentBuilder, final CallMethodResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.inputArgumentResults = _other.inputArgumentResults;
                    this.inputArgumentDiagnosticInfos = _other.inputArgumentDiagnosticInfos;
                    this.outputArguments = _other.outputArguments;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CallMethodResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree inputArgumentResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArgumentResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentResultsPropertyTree!= null):((inputArgumentResultsPropertyTree == null)||(!inputArgumentResultsPropertyTree.isLeaf())))) {
                        this.inputArgumentResults = _other.inputArgumentResults;
                    }
                    final PropertyTree inputArgumentDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArgumentDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentDiagnosticInfosPropertyTree!= null):((inputArgumentDiagnosticInfosPropertyTree == null)||(!inputArgumentDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.inputArgumentDiagnosticInfos = _other.inputArgumentDiagnosticInfos;
                    }
                    final PropertyTree outputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("outputArguments"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(outputArgumentsPropertyTree!= null):((outputArgumentsPropertyTree == null)||(!outputArgumentsPropertyTree.isLeaf())))) {
                        this.outputArguments = _other.outputArguments;
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

        protected<_P extends CallMethodResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.inputArgumentResults = this.inputArgumentResults;
            _product.inputArgumentDiagnosticInfos = this.inputArgumentDiagnosticInfos;
            _product.outputArguments = this.outputArguments;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public CallMethodResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<CallMethodResult.Builder<_B>>(this, statusCode, false));
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
        public StatusCode.Builder<? extends CallMethodResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<CallMethodResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "inputArgumentResults" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param inputArgumentResults
         *     Neuer Wert der Eigenschaft "inputArgumentResults".
         */
        public CallMethodResult.Builder<_B> withInputArgumentResults(final JAXBElement<ListOfStatusCode> inputArgumentResults) {
            this.inputArgumentResults = inputArgumentResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "inputArgumentDiagnosticInfos" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param inputArgumentDiagnosticInfos
         *     Neuer Wert der Eigenschaft "inputArgumentDiagnosticInfos".
         */
        public CallMethodResult.Builder<_B> withInputArgumentDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> inputArgumentDiagnosticInfos) {
            this.inputArgumentDiagnosticInfos = inputArgumentDiagnosticInfos;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "outputArguments" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param outputArguments
         *     Neuer Wert der Eigenschaft "outputArguments".
         */
        public CallMethodResult.Builder<_B> withOutputArguments(final JAXBElement<ListOfVariant> outputArguments) {
            this.outputArguments = outputArguments;
            return this;
        }

        @Override
        public CallMethodResult build() {
            if (_storedValue == null) {
                return this.init(new CallMethodResult());
            } else {
                return ((CallMethodResult) _storedValue);
            }
        }

        public CallMethodResult.Builder<_B> copyOf(final CallMethodResult _other) {
            _other.copyTo(this);
            return this;
        }

        public CallMethodResult.Builder<_B> copyOf(final CallMethodResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CallMethodResult.Selector<CallMethodResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CallMethodResult.Select _root() {
            return new CallMethodResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> inputArgumentResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> inputArgumentDiagnosticInfos = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> outputArguments = null;

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
            if (this.inputArgumentResults!= null) {
                products.put("inputArgumentResults", this.inputArgumentResults.init());
            }
            if (this.inputArgumentDiagnosticInfos!= null) {
                products.put("inputArgumentDiagnosticInfos", this.inputArgumentDiagnosticInfos.init());
            }
            if (this.outputArguments!= null) {
                products.put("outputArguments", this.outputArguments.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> inputArgumentResults() {
            return ((this.inputArgumentResults == null)?this.inputArgumentResults = new com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>>(this._root, this, "inputArgumentResults"):this.inputArgumentResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> inputArgumentDiagnosticInfos() {
            return ((this.inputArgumentDiagnosticInfos == null)?this.inputArgumentDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>>(this._root, this, "inputArgumentDiagnosticInfos"):this.inputArgumentDiagnosticInfos);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>> outputArguments() {
            return ((this.outputArguments == null)?this.outputArguments = new com.kscs.util.jaxb.Selector<TRoot, CallMethodResult.Selector<TRoot, TParent>>(this._root, this, "outputArguments"):this.outputArguments);
        }

    }

}
