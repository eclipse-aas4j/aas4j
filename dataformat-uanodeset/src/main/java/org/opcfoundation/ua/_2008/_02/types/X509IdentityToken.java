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
 * <p>Java-Klasse für X509IdentityToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X509IdentityToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserIdentityToken"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509IdentityToken", propOrder = {
    "certificateData"
})
public class X509IdentityToken
    extends UserIdentityToken
{

    @XmlElementRef(name = "CertificateData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> certificateData;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final X509IdentityToken.Builder<_B> _other) {
        super.copyTo(_other);
        _other.certificateData = this.certificateData;
    }

    @Override
    public<_B >X509IdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new X509IdentityToken.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public X509IdentityToken.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static X509IdentityToken.Builder<Void> builder() {
        return new X509IdentityToken.Builder<Void>(null, null, false);
    }

    public static<_B >X509IdentityToken.Builder<_B> copyOf(final UserIdentityToken _other) {
        final X509IdentityToken.Builder<_B> _newBuilder = new X509IdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >X509IdentityToken.Builder<_B> copyOf(final X509IdentityToken _other) {
        final X509IdentityToken.Builder<_B> _newBuilder = new X509IdentityToken.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final X509IdentityToken.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree certificateDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("certificateData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(certificateDataPropertyTree!= null):((certificateDataPropertyTree == null)||(!certificateDataPropertyTree.isLeaf())))) {
            _other.certificateData = this.certificateData;
        }
    }

    @Override
    public<_B >X509IdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new X509IdentityToken.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public X509IdentityToken.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >X509IdentityToken.Builder<_B> copyOf(final UserIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final X509IdentityToken.Builder<_B> _newBuilder = new X509IdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >X509IdentityToken.Builder<_B> copyOf(final X509IdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final X509IdentityToken.Builder<_B> _newBuilder = new X509IdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static X509IdentityToken.Builder<Void> copyExcept(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static X509IdentityToken.Builder<Void> copyExcept(final X509IdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static X509IdentityToken.Builder<Void> copyOnly(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static X509IdentityToken.Builder<Void> copyOnly(final X509IdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends UserIdentityToken.Builder<_B>
        implements Buildable
    {

        private JAXBElement<byte[]> certificateData;

        public Builder(final _B _parentBuilder, final X509IdentityToken _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.certificateData = _other.certificateData;
            }
        }

        public Builder(final _B _parentBuilder, final X509IdentityToken _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree certificateDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("certificateData"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(certificateDataPropertyTree!= null):((certificateDataPropertyTree == null)||(!certificateDataPropertyTree.isLeaf())))) {
                    this.certificateData = _other.certificateData;
                }
            }
        }

        protected<_P extends X509IdentityToken >_P init(final _P _product) {
            _product.certificateData = this.certificateData;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "certificateData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param certificateData
         *     Neuer Wert der Eigenschaft "certificateData".
         */
        public X509IdentityToken.Builder<_B> withCertificateData(final JAXBElement<byte[]> certificateData) {
            this.certificateData = certificateData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "policyId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param policyId
         *     Neuer Wert der Eigenschaft "policyId".
         */
        @Override
        public X509IdentityToken.Builder<_B> withPolicyId(final JAXBElement<String> policyId) {
            super.withPolicyId(policyId);
            return this;
        }

        @Override
        public X509IdentityToken build() {
            if (_storedValue == null) {
                return this.init(new X509IdentityToken());
            } else {
                return ((X509IdentityToken) _storedValue);
            }
        }

        public X509IdentityToken.Builder<_B> copyOf(final X509IdentityToken _other) {
            _other.copyTo(this);
            return this;
        }

        public X509IdentityToken.Builder<_B> copyOf(final X509IdentityToken.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends X509IdentityToken.Selector<X509IdentityToken.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static X509IdentityToken.Select _root() {
            return new X509IdentityToken.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends UserIdentityToken.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, X509IdentityToken.Selector<TRoot, TParent>> certificateData = null;

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
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, X509IdentityToken.Selector<TRoot, TParent>> certificateData() {
            return ((this.certificateData == null)?this.certificateData = new com.kscs.util.jaxb.Selector<TRoot, X509IdentityToken.Selector<TRoot, TParent>>(this._root, this, "certificateData"):this.certificateData);
        }

    }

}
