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
 * <p>Java-Klasse für EphemeralKeyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EphemeralKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublicKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
@XmlType(name = "EphemeralKeyType", propOrder = {
    "publicKey",
    "signature"
})
public class EphemeralKeyType {

    @XmlElementRef(name = "PublicKey", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> publicKey;
    @XmlElementRef(name = "Signature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signature;

    /**
     * Ruft den Wert der publicKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPublicKey() {
        return publicKey;
    }

    /**
     * Legt den Wert der publicKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPublicKey(JAXBElement<byte[]> value) {
        this.publicKey = value;
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
    public<_B >void copyTo(final EphemeralKeyType.Builder<_B> _other) {
        _other.publicKey = this.publicKey;
        _other.signature = this.signature;
    }

    public<_B >EphemeralKeyType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EphemeralKeyType.Builder<_B>(_parentBuilder, this, true);
    }

    public EphemeralKeyType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EphemeralKeyType.Builder<Void> builder() {
        return new EphemeralKeyType.Builder<Void>(null, null, false);
    }

    public static<_B >EphemeralKeyType.Builder<_B> copyOf(final EphemeralKeyType _other) {
        final EphemeralKeyType.Builder<_B> _newBuilder = new EphemeralKeyType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EphemeralKeyType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publicKeyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publicKey"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publicKeyPropertyTree!= null):((publicKeyPropertyTree == null)||(!publicKeyPropertyTree.isLeaf())))) {
            _other.publicKey = this.publicKey;
        }
        final PropertyTree signaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signaturePropertyTree!= null):((signaturePropertyTree == null)||(!signaturePropertyTree.isLeaf())))) {
            _other.signature = this.signature;
        }
    }

    public<_B >EphemeralKeyType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EphemeralKeyType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EphemeralKeyType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EphemeralKeyType.Builder<_B> copyOf(final EphemeralKeyType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EphemeralKeyType.Builder<_B> _newBuilder = new EphemeralKeyType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EphemeralKeyType.Builder<Void> copyExcept(final EphemeralKeyType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EphemeralKeyType.Builder<Void> copyOnly(final EphemeralKeyType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EphemeralKeyType _storedValue;
        private JAXBElement<byte[]> publicKey;
        private JAXBElement<byte[]> signature;

        public Builder(final _B _parentBuilder, final EphemeralKeyType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.publicKey = _other.publicKey;
                    this.signature = _other.signature;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EphemeralKeyType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publicKeyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publicKey"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publicKeyPropertyTree!= null):((publicKeyPropertyTree == null)||(!publicKeyPropertyTree.isLeaf())))) {
                        this.publicKey = _other.publicKey;
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

        protected<_P extends EphemeralKeyType >_P init(final _P _product) {
            _product.publicKey = this.publicKey;
            _product.signature = this.signature;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publicKey" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param publicKey
         *     Neuer Wert der Eigenschaft "publicKey".
         */
        public EphemeralKeyType.Builder<_B> withPublicKey(final JAXBElement<byte[]> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "signature" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param signature
         *     Neuer Wert der Eigenschaft "signature".
         */
        public EphemeralKeyType.Builder<_B> withSignature(final JAXBElement<byte[]> signature) {
            this.signature = signature;
            return this;
        }

        @Override
        public EphemeralKeyType build() {
            if (_storedValue == null) {
                return this.init(new EphemeralKeyType());
            } else {
                return ((EphemeralKeyType) _storedValue);
            }
        }

        public EphemeralKeyType.Builder<_B> copyOf(final EphemeralKeyType _other) {
            _other.copyTo(this);
            return this;
        }

        public EphemeralKeyType.Builder<_B> copyOf(final EphemeralKeyType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EphemeralKeyType.Selector<EphemeralKeyType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EphemeralKeyType.Select _root() {
            return new EphemeralKeyType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>> publicKey = null;
        private com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>> signature = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publicKey!= null) {
                products.put("publicKey", this.publicKey.init());
            }
            if (this.signature!= null) {
                products.put("signature", this.signature.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>> publicKey() {
            return ((this.publicKey == null)?this.publicKey = new com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>>(this._root, this, "publicKey"):this.publicKey);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>> signature() {
            return ((this.signature == null)?this.signature = new com.kscs.util.jaxb.Selector<TRoot, EphemeralKeyType.Selector<TRoot, TParent>>(this._root, this, "signature"):this.signature);
        }

    }

}
