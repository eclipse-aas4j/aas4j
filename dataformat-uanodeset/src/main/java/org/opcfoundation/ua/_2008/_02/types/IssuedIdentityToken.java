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
 * <p>Java-Klasse für IssuedIdentityToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IssuedIdentityToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserIdentityToken"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TokenData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedIdentityToken", propOrder = {
    "tokenData",
    "encryptionAlgorithm"
})
public class IssuedIdentityToken
    extends UserIdentityToken
{

    @XmlElementRef(name = "TokenData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> tokenData;
    @XmlElementRef(name = "EncryptionAlgorithm", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> encryptionAlgorithm;

    /**
     * Ruft den Wert der tokenData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getTokenData() {
        return tokenData;
    }

    /**
     * Legt den Wert der tokenData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setTokenData(JAXBElement<byte[]> value) {
        this.tokenData = value;
    }

    /**
     * Ruft den Wert der encryptionAlgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Legt den Wert der encryptionAlgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEncryptionAlgorithm(JAXBElement<String> value) {
        this.encryptionAlgorithm = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final IssuedIdentityToken.Builder<_B> _other) {
        super.copyTo(_other);
        _other.tokenData = this.tokenData;
        _other.encryptionAlgorithm = this.encryptionAlgorithm;
    }

    @Override
    public<_B >IssuedIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new IssuedIdentityToken.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public IssuedIdentityToken.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static IssuedIdentityToken.Builder<Void> builder() {
        return new IssuedIdentityToken.Builder<Void>(null, null, false);
    }

    public static<_B >IssuedIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other) {
        final IssuedIdentityToken.Builder<_B> _newBuilder = new IssuedIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >IssuedIdentityToken.Builder<_B> copyOf(final IssuedIdentityToken _other) {
        final IssuedIdentityToken.Builder<_B> _newBuilder = new IssuedIdentityToken.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final IssuedIdentityToken.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree tokenDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenDataPropertyTree!= null):((tokenDataPropertyTree == null)||(!tokenDataPropertyTree.isLeaf())))) {
            _other.tokenData = this.tokenData;
        }
        final PropertyTree encryptionAlgorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encryptionAlgorithm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encryptionAlgorithmPropertyTree!= null):((encryptionAlgorithmPropertyTree == null)||(!encryptionAlgorithmPropertyTree.isLeaf())))) {
            _other.encryptionAlgorithm = this.encryptionAlgorithm;
        }
    }

    @Override
    public<_B >IssuedIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new IssuedIdentityToken.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public IssuedIdentityToken.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >IssuedIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final IssuedIdentityToken.Builder<_B> _newBuilder = new IssuedIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >IssuedIdentityToken.Builder<_B> copyOf(final IssuedIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final IssuedIdentityToken.Builder<_B> _newBuilder = new IssuedIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static IssuedIdentityToken.Builder<Void> copyExcept(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static IssuedIdentityToken.Builder<Void> copyExcept(final IssuedIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static IssuedIdentityToken.Builder<Void> copyOnly(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static IssuedIdentityToken.Builder<Void> copyOnly(final IssuedIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends UserIdentityToken.Builder<_B>
        implements Buildable
    {

        private JAXBElement<byte[]> tokenData;
        private JAXBElement<String> encryptionAlgorithm;

        public Builder(final _B _parentBuilder, final IssuedIdentityToken _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.tokenData = _other.tokenData;
                this.encryptionAlgorithm = _other.encryptionAlgorithm;
            }
        }

        public Builder(final _B _parentBuilder, final IssuedIdentityToken _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree tokenDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenData"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenDataPropertyTree!= null):((tokenDataPropertyTree == null)||(!tokenDataPropertyTree.isLeaf())))) {
                    this.tokenData = _other.tokenData;
                }
                final PropertyTree encryptionAlgorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encryptionAlgorithm"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encryptionAlgorithmPropertyTree!= null):((encryptionAlgorithmPropertyTree == null)||(!encryptionAlgorithmPropertyTree.isLeaf())))) {
                    this.encryptionAlgorithm = _other.encryptionAlgorithm;
                }
            }
        }

        protected<_P extends IssuedIdentityToken >_P init(final _P _product) {
            _product.tokenData = this.tokenData;
            _product.encryptionAlgorithm = this.encryptionAlgorithm;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "tokenData" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param tokenData
         *     Neuer Wert der Eigenschaft "tokenData".
         */
        public IssuedIdentityToken.Builder<_B> withTokenData(final JAXBElement<byte[]> tokenData) {
            this.tokenData = tokenData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "encryptionAlgorithm" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param encryptionAlgorithm
         *     Neuer Wert der Eigenschaft "encryptionAlgorithm".
         */
        public IssuedIdentityToken.Builder<_B> withEncryptionAlgorithm(final JAXBElement<String> encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
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
        public IssuedIdentityToken.Builder<_B> withPolicyId(final JAXBElement<String> policyId) {
            super.withPolicyId(policyId);
            return this;
        }

        @Override
        public IssuedIdentityToken build() {
            if (_storedValue == null) {
                return this.init(new IssuedIdentityToken());
            } else {
                return ((IssuedIdentityToken) _storedValue);
            }
        }

        public IssuedIdentityToken.Builder<_B> copyOf(final IssuedIdentityToken _other) {
            _other.copyTo(this);
            return this;
        }

        public IssuedIdentityToken.Builder<_B> copyOf(final IssuedIdentityToken.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends IssuedIdentityToken.Selector<IssuedIdentityToken.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static IssuedIdentityToken.Select _root() {
            return new IssuedIdentityToken.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends UserIdentityToken.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>> tokenData = null;
        private com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>> encryptionAlgorithm = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.tokenData!= null) {
                products.put("tokenData", this.tokenData.init());
            }
            if (this.encryptionAlgorithm!= null) {
                products.put("encryptionAlgorithm", this.encryptionAlgorithm.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>> tokenData() {
            return ((this.tokenData == null)?this.tokenData = new com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>>(this._root, this, "tokenData"):this.tokenData);
        }

        public com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>> encryptionAlgorithm() {
            return ((this.encryptionAlgorithm == null)?this.encryptionAlgorithm = new com.kscs.util.jaxb.Selector<TRoot, IssuedIdentityToken.Selector<TRoot, TParent>>(this._root, this, "encryptionAlgorithm"):this.encryptionAlgorithm);
        }

    }

}
