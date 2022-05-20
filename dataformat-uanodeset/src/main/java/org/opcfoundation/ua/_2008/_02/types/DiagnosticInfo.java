//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DiagnosticInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolicId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NamespaceUri" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalizedText" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InnerStatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="InnerDiagnosticInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticInfo", propOrder = {
    "symbolicId",
    "namespaceUri",
    "locale",
    "localizedText",
    "additionalInfo",
    "innerStatusCode",
    "innerDiagnosticInfo"
})
public class DiagnosticInfo {

    @XmlElement(name = "SymbolicId")
    protected Integer symbolicId;
    @XmlElement(name = "NamespaceUri")
    protected Integer namespaceUri;
    @XmlElement(name = "Locale")
    protected Integer locale;
    @XmlElement(name = "LocalizedText")
    protected Integer localizedText;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "InnerStatusCode")
    protected StatusCode innerStatusCode;
    @XmlElement(name = "InnerDiagnosticInfo")
    protected DiagnosticInfo innerDiagnosticInfo;

    /**
     * Ruft den Wert der symbolicId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSymbolicId() {
        return symbolicId;
    }

    /**
     * Legt den Wert der symbolicId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSymbolicId(Integer value) {
        this.symbolicId = value;
    }

    /**
     * Ruft den Wert der namespaceUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNamespaceUri() {
        return namespaceUri;
    }

    /**
     * Legt den Wert der namespaceUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNamespaceUri(Integer value) {
        this.namespaceUri = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocale(Integer value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der localizedText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalizedText() {
        return localizedText;
    }

    /**
     * Legt den Wert der localizedText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalizedText(Integer value) {
        this.localizedText = value;
    }

    /**
     * Ruft den Wert der additionalInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Legt den Wert der additionalInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Ruft den Wert der innerStatusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getInnerStatusCode() {
        return innerStatusCode;
    }

    /**
     * Legt den Wert der innerStatusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setInnerStatusCode(StatusCode value) {
        this.innerStatusCode = value;
    }

    /**
     * Ruft den Wert der innerDiagnosticInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticInfo }
     *     
     */
    public DiagnosticInfo getInnerDiagnosticInfo() {
        return innerDiagnosticInfo;
    }

    /**
     * Legt den Wert der innerDiagnosticInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticInfo }
     *     
     */
    public void setInnerDiagnosticInfo(DiagnosticInfo value) {
        this.innerDiagnosticInfo = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DiagnosticInfo.Builder<_B> _other) {
        _other.symbolicId = this.symbolicId;
        _other.namespaceUri = this.namespaceUri;
        _other.locale = this.locale;
        _other.localizedText = this.localizedText;
        _other.additionalInfo = this.additionalInfo;
        _other.innerStatusCode = ((this.innerStatusCode == null)?null:this.innerStatusCode.newCopyBuilder(_other));
        _other.innerDiagnosticInfo = ((this.innerDiagnosticInfo == null)?null:this.innerDiagnosticInfo.newCopyBuilder(_other));
    }

    public<_B >DiagnosticInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DiagnosticInfo.Builder<_B>(_parentBuilder, this, true);
    }

    public DiagnosticInfo.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DiagnosticInfo.Builder<Void> builder() {
        return new DiagnosticInfo.Builder<Void>(null, null, false);
    }

    public static<_B >DiagnosticInfo.Builder<_B> copyOf(final DiagnosticInfo _other) {
        final DiagnosticInfo.Builder<_B> _newBuilder = new DiagnosticInfo.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DiagnosticInfo.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree symbolicIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("symbolicId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(symbolicIdPropertyTree!= null):((symbolicIdPropertyTree == null)||(!symbolicIdPropertyTree.isLeaf())))) {
            _other.symbolicId = this.symbolicId;
        }
        final PropertyTree namespaceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUriPropertyTree!= null):((namespaceUriPropertyTree == null)||(!namespaceUriPropertyTree.isLeaf())))) {
            _other.namespaceUri = this.namespaceUri;
        }
        final PropertyTree localePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("locale"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localePropertyTree!= null):((localePropertyTree == null)||(!localePropertyTree.isLeaf())))) {
            _other.locale = this.locale;
        }
        final PropertyTree localizedTextPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localizedText"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localizedTextPropertyTree!= null):((localizedTextPropertyTree == null)||(!localizedTextPropertyTree.isLeaf())))) {
            _other.localizedText = this.localizedText;
        }
        final PropertyTree additionalInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("additionalInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(additionalInfoPropertyTree!= null):((additionalInfoPropertyTree == null)||(!additionalInfoPropertyTree.isLeaf())))) {
            _other.additionalInfo = this.additionalInfo;
        }
        final PropertyTree innerStatusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("innerStatusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(innerStatusCodePropertyTree!= null):((innerStatusCodePropertyTree == null)||(!innerStatusCodePropertyTree.isLeaf())))) {
            _other.innerStatusCode = ((this.innerStatusCode == null)?null:this.innerStatusCode.newCopyBuilder(_other, innerStatusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree innerDiagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("innerDiagnosticInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(innerDiagnosticInfoPropertyTree!= null):((innerDiagnosticInfoPropertyTree == null)||(!innerDiagnosticInfoPropertyTree.isLeaf())))) {
            _other.innerDiagnosticInfo = ((this.innerDiagnosticInfo == null)?null:this.innerDiagnosticInfo.newCopyBuilder(_other, innerDiagnosticInfoPropertyTree, _propertyTreeUse));
        }
    }

    public<_B >DiagnosticInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DiagnosticInfo.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DiagnosticInfo.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DiagnosticInfo.Builder<_B> copyOf(final DiagnosticInfo _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DiagnosticInfo.Builder<_B> _newBuilder = new DiagnosticInfo.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DiagnosticInfo.Builder<Void> copyExcept(final DiagnosticInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DiagnosticInfo.Builder<Void> copyOnly(final DiagnosticInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DiagnosticInfo _storedValue;
        private Integer symbolicId;
        private Integer namespaceUri;
        private Integer locale;
        private Integer localizedText;
        private String additionalInfo;
        private StatusCode.Builder<DiagnosticInfo.Builder<_B>> innerStatusCode;
        private DiagnosticInfo.Builder<DiagnosticInfo.Builder<_B>> innerDiagnosticInfo;

        public Builder(final _B _parentBuilder, final DiagnosticInfo _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.symbolicId = _other.symbolicId;
                    this.namespaceUri = _other.namespaceUri;
                    this.locale = _other.locale;
                    this.localizedText = _other.localizedText;
                    this.additionalInfo = _other.additionalInfo;
                    this.innerStatusCode = ((_other.innerStatusCode == null)?null:_other.innerStatusCode.newCopyBuilder(this));
                    this.innerDiagnosticInfo = ((_other.innerDiagnosticInfo == null)?null:_other.innerDiagnosticInfo.newCopyBuilder(this));
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DiagnosticInfo _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree symbolicIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("symbolicId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(symbolicIdPropertyTree!= null):((symbolicIdPropertyTree == null)||(!symbolicIdPropertyTree.isLeaf())))) {
                        this.symbolicId = _other.symbolicId;
                    }
                    final PropertyTree namespaceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUriPropertyTree!= null):((namespaceUriPropertyTree == null)||(!namespaceUriPropertyTree.isLeaf())))) {
                        this.namespaceUri = _other.namespaceUri;
                    }
                    final PropertyTree localePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("locale"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localePropertyTree!= null):((localePropertyTree == null)||(!localePropertyTree.isLeaf())))) {
                        this.locale = _other.locale;
                    }
                    final PropertyTree localizedTextPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localizedText"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localizedTextPropertyTree!= null):((localizedTextPropertyTree == null)||(!localizedTextPropertyTree.isLeaf())))) {
                        this.localizedText = _other.localizedText;
                    }
                    final PropertyTree additionalInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("additionalInfo"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(additionalInfoPropertyTree!= null):((additionalInfoPropertyTree == null)||(!additionalInfoPropertyTree.isLeaf())))) {
                        this.additionalInfo = _other.additionalInfo;
                    }
                    final PropertyTree innerStatusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("innerStatusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(innerStatusCodePropertyTree!= null):((innerStatusCodePropertyTree == null)||(!innerStatusCodePropertyTree.isLeaf())))) {
                        this.innerStatusCode = ((_other.innerStatusCode == null)?null:_other.innerStatusCode.newCopyBuilder(this, innerStatusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree innerDiagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("innerDiagnosticInfo"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(innerDiagnosticInfoPropertyTree!= null):((innerDiagnosticInfoPropertyTree == null)||(!innerDiagnosticInfoPropertyTree.isLeaf())))) {
                        this.innerDiagnosticInfo = ((_other.innerDiagnosticInfo == null)?null:_other.innerDiagnosticInfo.newCopyBuilder(this, innerDiagnosticInfoPropertyTree, _propertyTreeUse));
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

        protected<_P extends DiagnosticInfo >_P init(final _P _product) {
            _product.symbolicId = this.symbolicId;
            _product.namespaceUri = this.namespaceUri;
            _product.locale = this.locale;
            _product.localizedText = this.localizedText;
            _product.additionalInfo = this.additionalInfo;
            _product.innerStatusCode = ((this.innerStatusCode == null)?null:this.innerStatusCode.build());
            _product.innerDiagnosticInfo = ((this.innerDiagnosticInfo == null)?null:this.innerDiagnosticInfo.build());
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "symbolicId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param symbolicId
         *     Neuer Wert der Eigenschaft "symbolicId".
         */
        public DiagnosticInfo.Builder<_B> withSymbolicId(final Integer symbolicId) {
            this.symbolicId = symbolicId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaceUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param namespaceUri
         *     Neuer Wert der Eigenschaft "namespaceUri".
         */
        public DiagnosticInfo.Builder<_B> withNamespaceUri(final Integer namespaceUri) {
            this.namespaceUri = namespaceUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "locale" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param locale
         *     Neuer Wert der Eigenschaft "locale".
         */
        public DiagnosticInfo.Builder<_B> withLocale(final Integer locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localizedText" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param localizedText
         *     Neuer Wert der Eigenschaft "localizedText".
         */
        public DiagnosticInfo.Builder<_B> withLocalizedText(final Integer localizedText) {
            this.localizedText = localizedText;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "additionalInfo" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param additionalInfo
         *     Neuer Wert der Eigenschaft "additionalInfo".
         */
        public DiagnosticInfo.Builder<_B> withAdditionalInfo(final String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "innerStatusCode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param innerStatusCode
         *     Neuer Wert der Eigenschaft "innerStatusCode".
         */
        public DiagnosticInfo.Builder<_B> withInnerStatusCode(final StatusCode innerStatusCode) {
            this.innerStatusCode = ((innerStatusCode == null)?null:new StatusCode.Builder<DiagnosticInfo.Builder<_B>>(this, innerStatusCode, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "innerStatusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "innerStatusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends DiagnosticInfo.Builder<_B>> withInnerStatusCode() {
            if (this.innerStatusCode!= null) {
                return this.innerStatusCode;
            }
            return this.innerStatusCode = new StatusCode.Builder<DiagnosticInfo.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "innerDiagnosticInfo" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param innerDiagnosticInfo
         *     Neuer Wert der Eigenschaft "innerDiagnosticInfo".
         */
        public DiagnosticInfo.Builder<_B> withInnerDiagnosticInfo(final DiagnosticInfo innerDiagnosticInfo) {
            this.innerDiagnosticInfo = ((innerDiagnosticInfo == null)?null:new DiagnosticInfo.Builder<DiagnosticInfo.Builder<_B>>(this, innerDiagnosticInfo, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "innerDiagnosticInfo".
         * Mit {@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "innerDiagnosticInfo".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DiagnosticInfo.Builder<? extends DiagnosticInfo.Builder<_B>> withInnerDiagnosticInfo() {
            if (this.innerDiagnosticInfo!= null) {
                return this.innerDiagnosticInfo;
            }
            return this.innerDiagnosticInfo = new DiagnosticInfo.Builder<DiagnosticInfo.Builder<_B>>(this, null, false);
        }

        @Override
        public DiagnosticInfo build() {
            if (_storedValue == null) {
                return this.init(new DiagnosticInfo());
            } else {
                return ((DiagnosticInfo) _storedValue);
            }
        }

        public DiagnosticInfo.Builder<_B> copyOf(final DiagnosticInfo _other) {
            _other.copyTo(this);
            return this;
        }

        public DiagnosticInfo.Builder<_B> copyOf(final DiagnosticInfo.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DiagnosticInfo.Selector<DiagnosticInfo.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DiagnosticInfo.Select _root() {
            return new DiagnosticInfo.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> symbolicId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> namespaceUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> locale = null;
        private com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> localizedText = null;
        private com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> additionalInfo = null;
        private StatusCode.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> innerStatusCode = null;
        private DiagnosticInfo.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> innerDiagnosticInfo = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.symbolicId!= null) {
                products.put("symbolicId", this.symbolicId.init());
            }
            if (this.namespaceUri!= null) {
                products.put("namespaceUri", this.namespaceUri.init());
            }
            if (this.locale!= null) {
                products.put("locale", this.locale.init());
            }
            if (this.localizedText!= null) {
                products.put("localizedText", this.localizedText.init());
            }
            if (this.additionalInfo!= null) {
                products.put("additionalInfo", this.additionalInfo.init());
            }
            if (this.innerStatusCode!= null) {
                products.put("innerStatusCode", this.innerStatusCode.init());
            }
            if (this.innerDiagnosticInfo!= null) {
                products.put("innerDiagnosticInfo", this.innerDiagnosticInfo.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> symbolicId() {
            return ((this.symbolicId == null)?this.symbolicId = new com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "symbolicId"):this.symbolicId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> namespaceUri() {
            return ((this.namespaceUri == null)?this.namespaceUri = new com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "namespaceUri"):this.namespaceUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> locale() {
            return ((this.locale == null)?this.locale = new com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "locale"):this.locale);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> localizedText() {
            return ((this.localizedText == null)?this.localizedText = new com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "localizedText"):this.localizedText);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> additionalInfo() {
            return ((this.additionalInfo == null)?this.additionalInfo = new com.kscs.util.jaxb.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "additionalInfo"):this.additionalInfo);
        }

        public StatusCode.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> innerStatusCode() {
            return ((this.innerStatusCode == null)?this.innerStatusCode = new StatusCode.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "innerStatusCode"):this.innerStatusCode);
        }

        public DiagnosticInfo.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>> innerDiagnosticInfo() {
            return ((this.innerDiagnosticInfo == null)?this.innerDiagnosticInfo = new DiagnosticInfo.Selector<TRoot, DiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "innerDiagnosticInfo"):this.innerDiagnosticInfo);
        }

    }

}
