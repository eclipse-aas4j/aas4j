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
 * <p>Java-Klasse für SignedSoftwareCertificate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignedSoftwareCertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedSoftwareCertificate", propOrder = {
    "certificateData",
    "signature"
})
public class SignedSoftwareCertificate {

    @XmlElementRef(name = "CertificateData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> certificateData;
    @XmlElementRef(name = "Signature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signature;

    /**
     * Ruft den Wert der certificateData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCertificateData() {
        return certificateData;
    }

    /**
     * Legt den Wert der certificateData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCertificateData(JAXBElement<byte[]> value) {
        this.certificateData = value;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSignature(JAXBElement<byte[]> value) {
        this.signature = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SignedSoftwareCertificate.Builder<_B> _other) {
        _other.certificateData = this.certificateData;
        _other.signature = this.signature;
    }

    public<_B >SignedSoftwareCertificate.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SignedSoftwareCertificate.Builder<_B>(_parentBuilder, this, true);
    }

    public SignedSoftwareCertificate.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SignedSoftwareCertificate.Builder<Void> builder() {
        return new SignedSoftwareCertificate.Builder<Void>(null, null, false);
    }

    public static<_B >SignedSoftwareCertificate.Builder<_B> copyOf(final SignedSoftwareCertificate _other) {
        final SignedSoftwareCertificate.Builder<_B> _newBuilder = new SignedSoftwareCertificate.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SignedSoftwareCertificate.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree certificateDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("certificateData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(certificateDataPropertyTree!= null):((certificateDataPropertyTree == null)||(!certificateDataPropertyTree.isLeaf())))) {
            _other.certificateData = this.certificateData;
        }
        final PropertyTree signaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signaturePropertyTree!= null):((signaturePropertyTree == null)||(!signaturePropertyTree.isLeaf())))) {
            _other.signature = this.signature;
        }
    }

    public<_B >SignedSoftwareCertificate.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SignedSoftwareCertificate.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SignedSoftwareCertificate.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SignedSoftwareCertificate.Builder<_B> copyOf(final SignedSoftwareCertificate _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SignedSoftwareCertificate.Builder<_B> _newBuilder = new SignedSoftwareCertificate.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SignedSoftwareCertificate.Builder<Void> copyExcept(final SignedSoftwareCertificate _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SignedSoftwareCertificate.Builder<Void> copyOnly(final SignedSoftwareCertificate _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SignedSoftwareCertificate _storedValue;
        private JAXBElement<byte[]> certificateData;
        private JAXBElement<byte[]> signature;

        public Builder(final _B _parentBuilder, final SignedSoftwareCertificate _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.certificateData = _other.certificateData;
                    this.signature = _other.signature;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SignedSoftwareCertificate _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree certificateDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("certificateData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(certificateDataPropertyTree!= null):((certificateDataPropertyTree == null)||(!certificateDataPropertyTree.isLeaf())))) {
                        this.certificateData = _other.certificateData;
                    }
                    final PropertyTree signaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signature"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signaturePropertyTree!= null):((signaturePropertyTree == null)||(!signaturePropertyTree.isLeaf())))) {
                        this.signature = _other.signature;
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

        protected<_P extends SignedSoftwareCertificate >_P init(final _P _product) {
            _product.certificateData = this.certificateData;
            _product.signature = this.signature;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "certificateData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param certificateData
         *     Neuer Wert der Eigenschaft "certificateData".
         */
        public SignedSoftwareCertificate.Builder<_B> withCertificateData(final JAXBElement<byte[]> certificateData) {
            this.certificateData = certificateData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "signature" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param signature
         *     Neuer Wert der Eigenschaft "signature".
         */
        public SignedSoftwareCertificate.Builder<_B> withSignature(final JAXBElement<byte[]> signature) {
            this.signature = signature;
            return this;
        }

        @Override
        public SignedSoftwareCertificate build() {
            if (_storedValue == null) {
                return this.init(new SignedSoftwareCertificate());
            } else {
                return ((SignedSoftwareCertificate) _storedValue);
            }
        }

        public SignedSoftwareCertificate.Builder<_B> copyOf(final SignedSoftwareCertificate _other) {
            _other.copyTo(this);
            return this;
        }

        public SignedSoftwareCertificate.Builder<_B> copyOf(final SignedSoftwareCertificate.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SignedSoftwareCertificate.Selector<SignedSoftwareCertificate.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SignedSoftwareCertificate.Select _root() {
            return new SignedSoftwareCertificate.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>> certificateData = null;
        private com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>> signature = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.certificateData!= null) {
                products.put("certificateData", this.certificateData.init());
            }
            if (this.signature!= null) {
                products.put("signature", this.signature.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>> certificateData() {
            return ((this.certificateData == null)?this.certificateData = new com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>>(this._root, this, "certificateData"):this.certificateData);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>> signature() {
            return ((this.signature == null)?this.signature = new com.kscs.util.jaxb.Selector<TRoot, SignedSoftwareCertificate.Selector<TRoot, TParent>>(this._root, this, "signature"):this.signature);
        }

    }

}
