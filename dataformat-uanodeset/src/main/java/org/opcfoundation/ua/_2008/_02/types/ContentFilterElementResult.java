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
 * <p>Java-Klasse für ContentFilterElementResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentFilterElementResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="OperandStatusCodes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="OperandDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentFilterElementResult", propOrder = {
    "statusCode",
    "operandStatusCodes",
    "operandDiagnosticInfos"
})
public class ContentFilterElementResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "OperandStatusCodes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> operandStatusCodes;
    @XmlElementRef(name = "OperandDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> operandDiagnosticInfos;

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
     * Ruft den Wert der operandStatusCodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getOperandStatusCodes() {
        return operandStatusCodes;
    }

    /**
     * Legt den Wert der operandStatusCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setOperandStatusCodes(JAXBElement<ListOfStatusCode> value) {
        this.operandStatusCodes = value;
    }

    /**
     * Ruft den Wert der operandDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getOperandDiagnosticInfos() {
        return operandDiagnosticInfos;
    }

    /**
     * Legt den Wert der operandDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setOperandDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.operandDiagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ContentFilterElementResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.operandStatusCodes = this.operandStatusCodes;
        _other.operandDiagnosticInfos = this.operandDiagnosticInfos;
    }

    public<_B >ContentFilterElementResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ContentFilterElementResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ContentFilterElementResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ContentFilterElementResult.Builder<Void> builder() {
        return new ContentFilterElementResult.Builder<Void>(null, null, false);
    }

    public static<_B >ContentFilterElementResult.Builder<_B> copyOf(final ContentFilterElementResult _other) {
        final ContentFilterElementResult.Builder<_B> _newBuilder = new ContentFilterElementResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ContentFilterElementResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree operandStatusCodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operandStatusCodes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operandStatusCodesPropertyTree!= null):((operandStatusCodesPropertyTree == null)||(!operandStatusCodesPropertyTree.isLeaf())))) {
            _other.operandStatusCodes = this.operandStatusCodes;
        }
        final PropertyTree operandDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operandDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operandDiagnosticInfosPropertyTree!= null):((operandDiagnosticInfosPropertyTree == null)||(!operandDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.operandDiagnosticInfos = this.operandDiagnosticInfos;
        }
    }

    public<_B >ContentFilterElementResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ContentFilterElementResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ContentFilterElementResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ContentFilterElementResult.Builder<_B> copyOf(final ContentFilterElementResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ContentFilterElementResult.Builder<_B> _newBuilder = new ContentFilterElementResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ContentFilterElementResult.Builder<Void> copyExcept(final ContentFilterElementResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ContentFilterElementResult.Builder<Void> copyOnly(final ContentFilterElementResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ContentFilterElementResult _storedValue;
        private StatusCode.Builder<ContentFilterElementResult.Builder<_B>> statusCode;
        private JAXBElement<ListOfStatusCode> operandStatusCodes;
        private JAXBElement<ListOfDiagnosticInfo> operandDiagnosticInfos;

        public Builder(final _B _parentBuilder, final ContentFilterElementResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.operandStatusCodes = _other.operandStatusCodes;
                    this.operandDiagnosticInfos = _other.operandDiagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ContentFilterElementResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree operandStatusCodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operandStatusCodes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operandStatusCodesPropertyTree!= null):((operandStatusCodesPropertyTree == null)||(!operandStatusCodesPropertyTree.isLeaf())))) {
                        this.operandStatusCodes = _other.operandStatusCodes;
                    }
                    final PropertyTree operandDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operandDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operandDiagnosticInfosPropertyTree!= null):((operandDiagnosticInfosPropertyTree == null)||(!operandDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.operandDiagnosticInfos = _other.operandDiagnosticInfos;
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

        protected<_P extends ContentFilterElementResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.operandStatusCodes = this.operandStatusCodes;
            _product.operandDiagnosticInfos = this.operandDiagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public ContentFilterElementResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<ContentFilterElementResult.Builder<_B>>(this, statusCode, false));
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
        public StatusCode.Builder<? extends ContentFilterElementResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<ContentFilterElementResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "operandStatusCodes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param operandStatusCodes
         *     Neuer Wert der Eigenschaft "operandStatusCodes".
         */
        public ContentFilterElementResult.Builder<_B> withOperandStatusCodes(final JAXBElement<ListOfStatusCode> operandStatusCodes) {
            this.operandStatusCodes = operandStatusCodes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "operandDiagnosticInfos" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param operandDiagnosticInfos
         *     Neuer Wert der Eigenschaft "operandDiagnosticInfos".
         */
        public ContentFilterElementResult.Builder<_B> withOperandDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> operandDiagnosticInfos) {
            this.operandDiagnosticInfos = operandDiagnosticInfos;
            return this;
        }

        @Override
        public ContentFilterElementResult build() {
            if (_storedValue == null) {
                return this.init(new ContentFilterElementResult());
            } else {
                return ((ContentFilterElementResult) _storedValue);
            }
        }

        public ContentFilterElementResult.Builder<_B> copyOf(final ContentFilterElementResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ContentFilterElementResult.Builder<_B> copyOf(final ContentFilterElementResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ContentFilterElementResult.Selector<ContentFilterElementResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ContentFilterElementResult.Select _root() {
            return new ContentFilterElementResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> operandStatusCodes = null;
        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> operandDiagnosticInfos = null;

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
            if (this.operandStatusCodes!= null) {
                products.put("operandStatusCodes", this.operandStatusCodes.init());
            }
            if (this.operandDiagnosticInfos!= null) {
                products.put("operandDiagnosticInfos", this.operandDiagnosticInfos.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> operandStatusCodes() {
            return ((this.operandStatusCodes == null)?this.operandStatusCodes = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>>(this._root, this, "operandStatusCodes"):this.operandStatusCodes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>> operandDiagnosticInfos() {
            return ((this.operandDiagnosticInfos == null)?this.operandDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterElementResult.Selector<TRoot, TParent>>(this._root, this, "operandDiagnosticInfos"):this.operandDiagnosticInfos);
        }

    }

}
