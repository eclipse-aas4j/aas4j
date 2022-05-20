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
 * <p>Java-Klasse für ParsingResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParsingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="DataStatusCodes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="DataDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParsingResult", propOrder = {
    "statusCode",
    "dataStatusCodes",
    "dataDiagnosticInfos"
})
public class ParsingResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "DataStatusCodes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> dataStatusCodes;
    @XmlElementRef(name = "DataDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> dataDiagnosticInfos;

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
     * Ruft den Wert der dataStatusCodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getDataStatusCodes() {
        return dataStatusCodes;
    }

    /**
     * Legt den Wert der dataStatusCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setDataStatusCodes(JAXBElement<ListOfStatusCode> value) {
        this.dataStatusCodes = value;
    }

    /**
     * Ruft den Wert der dataDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getDataDiagnosticInfos() {
        return dataDiagnosticInfos;
    }

    /**
     * Legt den Wert der dataDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setDataDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.dataDiagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ParsingResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.dataStatusCodes = this.dataStatusCodes;
        _other.dataDiagnosticInfos = this.dataDiagnosticInfos;
    }

    public<_B >ParsingResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ParsingResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ParsingResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ParsingResult.Builder<Void> builder() {
        return new ParsingResult.Builder<Void>(null, null, false);
    }

    public static<_B >ParsingResult.Builder<_B> copyOf(final ParsingResult _other) {
        final ParsingResult.Builder<_B> _newBuilder = new ParsingResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ParsingResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree dataStatusCodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataStatusCodes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataStatusCodesPropertyTree!= null):((dataStatusCodesPropertyTree == null)||(!dataStatusCodesPropertyTree.isLeaf())))) {
            _other.dataStatusCodes = this.dataStatusCodes;
        }
        final PropertyTree dataDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataDiagnosticInfosPropertyTree!= null):((dataDiagnosticInfosPropertyTree == null)||(!dataDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.dataDiagnosticInfos = this.dataDiagnosticInfos;
        }
    }

    public<_B >ParsingResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ParsingResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ParsingResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ParsingResult.Builder<_B> copyOf(final ParsingResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ParsingResult.Builder<_B> _newBuilder = new ParsingResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ParsingResult.Builder<Void> copyExcept(final ParsingResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ParsingResult.Builder<Void> copyOnly(final ParsingResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ParsingResult _storedValue;
        private StatusCode.Builder<ParsingResult.Builder<_B>> statusCode;
        private JAXBElement<ListOfStatusCode> dataStatusCodes;
        private JAXBElement<ListOfDiagnosticInfo> dataDiagnosticInfos;

        public Builder(final _B _parentBuilder, final ParsingResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.dataStatusCodes = _other.dataStatusCodes;
                    this.dataDiagnosticInfos = _other.dataDiagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ParsingResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree dataStatusCodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataStatusCodes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataStatusCodesPropertyTree!= null):((dataStatusCodesPropertyTree == null)||(!dataStatusCodesPropertyTree.isLeaf())))) {
                        this.dataStatusCodes = _other.dataStatusCodes;
                    }
                    final PropertyTree dataDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataDiagnosticInfosPropertyTree!= null):((dataDiagnosticInfosPropertyTree == null)||(!dataDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.dataDiagnosticInfos = _other.dataDiagnosticInfos;
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

        protected<_P extends ParsingResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.dataStatusCodes = this.dataStatusCodes;
            _product.dataDiagnosticInfos = this.dataDiagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public ParsingResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<ParsingResult.Builder<_B>>(this, statusCode, false));
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
        public StatusCode.Builder<? extends ParsingResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<ParsingResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataStatusCodes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataStatusCodes
         *     Neuer Wert der Eigenschaft "dataStatusCodes".
         */
        public ParsingResult.Builder<_B> withDataStatusCodes(final JAXBElement<ListOfStatusCode> dataStatusCodes) {
            this.dataStatusCodes = dataStatusCodes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataDiagnosticInfos" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataDiagnosticInfos
         *     Neuer Wert der Eigenschaft "dataDiagnosticInfos".
         */
        public ParsingResult.Builder<_B> withDataDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> dataDiagnosticInfos) {
            this.dataDiagnosticInfos = dataDiagnosticInfos;
            return this;
        }

        @Override
        public ParsingResult build() {
            if (_storedValue == null) {
                return this.init(new ParsingResult());
            } else {
                return ((ParsingResult) _storedValue);
            }
        }

        public ParsingResult.Builder<_B> copyOf(final ParsingResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ParsingResult.Builder<_B> copyOf(final ParsingResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ParsingResult.Selector<ParsingResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ParsingResult.Select _root() {
            return new ParsingResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> dataStatusCodes = null;
        private com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> dataDiagnosticInfos = null;

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
            if (this.dataStatusCodes!= null) {
                products.put("dataStatusCodes", this.dataStatusCodes.init());
            }
            if (this.dataDiagnosticInfos!= null) {
                products.put("dataDiagnosticInfos", this.dataDiagnosticInfos.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> dataStatusCodes() {
            return ((this.dataStatusCodes == null)?this.dataStatusCodes = new com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>>(this._root, this, "dataStatusCodes"):this.dataStatusCodes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>> dataDiagnosticInfos() {
            return ((this.dataDiagnosticInfos == null)?this.dataDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, ParsingResult.Selector<TRoot, TParent>>(this._root, this, "dataDiagnosticInfos"):this.dataDiagnosticInfos);
        }

    }

}
