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
 * <p>Java-Klasse für TrustListDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrustListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecifiedLists" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TrustedCertificates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *         &lt;element name="TrustedCrls" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *         &lt;element name="IssuerCertificates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *         &lt;element name="IssuerCrls" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustListDataType", propOrder = {
    "specifiedLists",
    "trustedCertificates",
    "trustedCrls",
    "issuerCertificates",
    "issuerCrls"
})
public class TrustListDataType {

    @XmlElement(name = "SpecifiedLists")
    @XmlSchemaType(name = "unsignedInt")
    protected Long specifiedLists;
    @XmlElementRef(name = "TrustedCertificates", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> trustedCertificates;
    @XmlElementRef(name = "TrustedCrls", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> trustedCrls;
    @XmlElementRef(name = "IssuerCertificates", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> issuerCertificates;
    @XmlElementRef(name = "IssuerCrls", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> issuerCrls;

    /**
     * Ruft den Wert der specifiedLists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpecifiedLists() {
        return specifiedLists;
    }

    /**
     * Legt den Wert der specifiedLists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpecifiedLists(Long value) {
        this.specifiedLists = value;
    }

    /**
     * Ruft den Wert der trustedCertificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getTrustedCertificates() {
        return trustedCertificates;
    }

    /**
     * Legt den Wert der trustedCertificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setTrustedCertificates(JAXBElement<ListOfByteString> value) {
        this.trustedCertificates = value;
    }

    /**
     * Ruft den Wert der trustedCrls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getTrustedCrls() {
        return trustedCrls;
    }

    /**
     * Legt den Wert der trustedCrls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setTrustedCrls(JAXBElement<ListOfByteString> value) {
        this.trustedCrls = value;
    }

    /**
     * Ruft den Wert der issuerCertificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getIssuerCertificates() {
        return issuerCertificates;
    }

    /**
     * Legt den Wert der issuerCertificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setIssuerCertificates(JAXBElement<ListOfByteString> value) {
        this.issuerCertificates = value;
    }

    /**
     * Ruft den Wert der issuerCrls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getIssuerCrls() {
        return issuerCrls;
    }

    /**
     * Legt den Wert der issuerCrls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setIssuerCrls(JAXBElement<ListOfByteString> value) {
        this.issuerCrls = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TrustListDataType.Builder<_B> _other) {
        _other.specifiedLists = this.specifiedLists;
        _other.trustedCertificates = this.trustedCertificates;
        _other.trustedCrls = this.trustedCrls;
        _other.issuerCertificates = this.issuerCertificates;
        _other.issuerCrls = this.issuerCrls;
    }

    public<_B >TrustListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TrustListDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public TrustListDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TrustListDataType.Builder<Void> builder() {
        return new TrustListDataType.Builder<Void>(null, null, false);
    }

    public static<_B >TrustListDataType.Builder<_B> copyOf(final TrustListDataType _other) {
        final TrustListDataType.Builder<_B> _newBuilder = new TrustListDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final TrustListDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree specifiedListsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specifiedLists"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specifiedListsPropertyTree!= null):((specifiedListsPropertyTree == null)||(!specifiedListsPropertyTree.isLeaf())))) {
            _other.specifiedLists = this.specifiedLists;
        }
        final PropertyTree trustedCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustedCertificates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustedCertificatesPropertyTree!= null):((trustedCertificatesPropertyTree == null)||(!trustedCertificatesPropertyTree.isLeaf())))) {
            _other.trustedCertificates = this.trustedCertificates;
        }
        final PropertyTree trustedCrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustedCrls"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustedCrlsPropertyTree!= null):((trustedCrlsPropertyTree == null)||(!trustedCrlsPropertyTree.isLeaf())))) {
            _other.trustedCrls = this.trustedCrls;
        }
        final PropertyTree issuerCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerCertificates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerCertificatesPropertyTree!= null):((issuerCertificatesPropertyTree == null)||(!issuerCertificatesPropertyTree.isLeaf())))) {
            _other.issuerCertificates = this.issuerCertificates;
        }
        final PropertyTree issuerCrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerCrls"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerCrlsPropertyTree!= null):((issuerCrlsPropertyTree == null)||(!issuerCrlsPropertyTree.isLeaf())))) {
            _other.issuerCrls = this.issuerCrls;
        }
    }

    public<_B >TrustListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TrustListDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TrustListDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TrustListDataType.Builder<_B> copyOf(final TrustListDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TrustListDataType.Builder<_B> _newBuilder = new TrustListDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TrustListDataType.Builder<Void> copyExcept(final TrustListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TrustListDataType.Builder<Void> copyOnly(final TrustListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final TrustListDataType _storedValue;
        private Long specifiedLists;
        private JAXBElement<ListOfByteString> trustedCertificates;
        private JAXBElement<ListOfByteString> trustedCrls;
        private JAXBElement<ListOfByteString> issuerCertificates;
        private JAXBElement<ListOfByteString> issuerCrls;

        public Builder(final _B _parentBuilder, final TrustListDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.specifiedLists = _other.specifiedLists;
                    this.trustedCertificates = _other.trustedCertificates;
                    this.trustedCrls = _other.trustedCrls;
                    this.issuerCertificates = _other.issuerCertificates;
                    this.issuerCrls = _other.issuerCrls;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final TrustListDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree specifiedListsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specifiedLists"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specifiedListsPropertyTree!= null):((specifiedListsPropertyTree == null)||(!specifiedListsPropertyTree.isLeaf())))) {
                        this.specifiedLists = _other.specifiedLists;
                    }
                    final PropertyTree trustedCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustedCertificates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustedCertificatesPropertyTree!= null):((trustedCertificatesPropertyTree == null)||(!trustedCertificatesPropertyTree.isLeaf())))) {
                        this.trustedCertificates = _other.trustedCertificates;
                    }
                    final PropertyTree trustedCrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustedCrls"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustedCrlsPropertyTree!= null):((trustedCrlsPropertyTree == null)||(!trustedCrlsPropertyTree.isLeaf())))) {
                        this.trustedCrls = _other.trustedCrls;
                    }
                    final PropertyTree issuerCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerCertificates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerCertificatesPropertyTree!= null):((issuerCertificatesPropertyTree == null)||(!issuerCertificatesPropertyTree.isLeaf())))) {
                        this.issuerCertificates = _other.issuerCertificates;
                    }
                    final PropertyTree issuerCrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerCrls"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerCrlsPropertyTree!= null):((issuerCrlsPropertyTree == null)||(!issuerCrlsPropertyTree.isLeaf())))) {
                        this.issuerCrls = _other.issuerCrls;
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

        protected<_P extends TrustListDataType >_P init(final _P _product) {
            _product.specifiedLists = this.specifiedLists;
            _product.trustedCertificates = this.trustedCertificates;
            _product.trustedCrls = this.trustedCrls;
            _product.issuerCertificates = this.issuerCertificates;
            _product.issuerCrls = this.issuerCrls;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedLists" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param specifiedLists
         *     Neuer Wert der Eigenschaft "specifiedLists".
         */
        public TrustListDataType.Builder<_B> withSpecifiedLists(final Long specifiedLists) {
            this.specifiedLists = specifiedLists;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "trustedCertificates" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param trustedCertificates
         *     Neuer Wert der Eigenschaft "trustedCertificates".
         */
        public TrustListDataType.Builder<_B> withTrustedCertificates(final JAXBElement<ListOfByteString> trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "trustedCrls" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param trustedCrls
         *     Neuer Wert der Eigenschaft "trustedCrls".
         */
        public TrustListDataType.Builder<_B> withTrustedCrls(final JAXBElement<ListOfByteString> trustedCrls) {
            this.trustedCrls = trustedCrls;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "issuerCertificates" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param issuerCertificates
         *     Neuer Wert der Eigenschaft "issuerCertificates".
         */
        public TrustListDataType.Builder<_B> withIssuerCertificates(final JAXBElement<ListOfByteString> issuerCertificates) {
            this.issuerCertificates = issuerCertificates;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "issuerCrls" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param issuerCrls
         *     Neuer Wert der Eigenschaft "issuerCrls".
         */
        public TrustListDataType.Builder<_B> withIssuerCrls(final JAXBElement<ListOfByteString> issuerCrls) {
            this.issuerCrls = issuerCrls;
            return this;
        }

        @Override
        public TrustListDataType build() {
            if (_storedValue == null) {
                return this.init(new TrustListDataType());
            } else {
                return ((TrustListDataType) _storedValue);
            }
        }

        public TrustListDataType.Builder<_B> copyOf(final TrustListDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public TrustListDataType.Builder<_B> copyOf(final TrustListDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends TrustListDataType.Selector<TrustListDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TrustListDataType.Select _root() {
            return new TrustListDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> specifiedLists = null;
        private com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> trustedCertificates = null;
        private com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> trustedCrls = null;
        private com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> issuerCertificates = null;
        private com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> issuerCrls = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.specifiedLists!= null) {
                products.put("specifiedLists", this.specifiedLists.init());
            }
            if (this.trustedCertificates!= null) {
                products.put("trustedCertificates", this.trustedCertificates.init());
            }
            if (this.trustedCrls!= null) {
                products.put("trustedCrls", this.trustedCrls.init());
            }
            if (this.issuerCertificates!= null) {
                products.put("issuerCertificates", this.issuerCertificates.init());
            }
            if (this.issuerCrls!= null) {
                products.put("issuerCrls", this.issuerCrls.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> specifiedLists() {
            return ((this.specifiedLists == null)?this.specifiedLists = new com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>>(this._root, this, "specifiedLists"):this.specifiedLists);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> trustedCertificates() {
            return ((this.trustedCertificates == null)?this.trustedCertificates = new com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>>(this._root, this, "trustedCertificates"):this.trustedCertificates);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> trustedCrls() {
            return ((this.trustedCrls == null)?this.trustedCrls = new com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>>(this._root, this, "trustedCrls"):this.trustedCrls);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> issuerCertificates() {
            return ((this.issuerCertificates == null)?this.issuerCertificates = new com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>>(this._root, this, "issuerCertificates"):this.issuerCertificates);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>> issuerCrls() {
            return ((this.issuerCrls == null)?this.issuerCrls = new com.kscs.util.jaxb.Selector<TRoot, TrustListDataType.Selector<TRoot, TParent>>(this._root, this, "issuerCrls"):this.issuerCrls);
        }

    }

}
