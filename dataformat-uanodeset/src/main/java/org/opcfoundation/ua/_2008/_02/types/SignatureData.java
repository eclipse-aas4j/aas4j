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
 * <p>Java-Klasse für SignatureData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SignatureData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SignatureData", propOrder = {
    "algorithm",
    "signature"
})
public class SignatureData {

    @XmlElementRef(name = "Algorithm", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> algorithm;
    @XmlElementRef(name = "Signature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signature;

    /**
     * Ruft den Wert der algorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlgorithm() {
        return algorithm;
    }

    /**
     * Legt den Wert der algorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlgorithm(JAXBElement<String> value) {
        this.algorithm = value;
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
    public<_B >void copyTo(final SignatureData.Builder<_B> _other) {
        _other.algorithm = this.algorithm;
        _other.signature = this.signature;
    }

    public<_B >SignatureData.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SignatureData.Builder<_B>(_parentBuilder, this, true);
    }

    public SignatureData.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SignatureData.Builder<Void> builder() {
        return new SignatureData.Builder<Void>(null, null, false);
    }

    public static<_B >SignatureData.Builder<_B> copyOf(final SignatureData _other) {
        final SignatureData.Builder<_B> _newBuilder = new SignatureData.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SignatureData.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree algorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("algorithm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(algorithmPropertyTree!= null):((algorithmPropertyTree == null)||(!algorithmPropertyTree.isLeaf())))) {
            _other.algorithm = this.algorithm;
        }
        final PropertyTree signaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signaturePropertyTree!= null):((signaturePropertyTree == null)||(!signaturePropertyTree.isLeaf())))) {
            _other.signature = this.signature;
        }
    }

    public<_B >SignatureData.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SignatureData.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SignatureData.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SignatureData.Builder<_B> copyOf(final SignatureData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SignatureData.Builder<_B> _newBuilder = new SignatureData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SignatureData.Builder<Void> copyExcept(final SignatureData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SignatureData.Builder<Void> copyOnly(final SignatureData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SignatureData _storedValue;
        private JAXBElement<String> algorithm;
        private JAXBElement<byte[]> signature;

        public Builder(final _B _parentBuilder, final SignatureData _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.algorithm = _other.algorithm;
                    this.signature = _other.signature;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SignatureData _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree algorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("algorithm"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(algorithmPropertyTree!= null):((algorithmPropertyTree == null)||(!algorithmPropertyTree.isLeaf())))) {
                        this.algorithm = _other.algorithm;
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

        protected<_P extends SignatureData >_P init(final _P _product) {
            _product.algorithm = this.algorithm;
            _product.signature = this.signature;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "algorithm" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param algorithm
         *     Neuer Wert der Eigenschaft "algorithm".
         */
        public SignatureData.Builder<_B> withAlgorithm(final JAXBElement<String> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "signature" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param signature
         *     Neuer Wert der Eigenschaft "signature".
         */
        public SignatureData.Builder<_B> withSignature(final JAXBElement<byte[]> signature) {
            this.signature = signature;
            return this;
        }

        @Override
        public SignatureData build() {
            if (_storedValue == null) {
                return this.init(new SignatureData());
            } else {
                return ((SignatureData) _storedValue);
            }
        }

        public SignatureData.Builder<_B> copyOf(final SignatureData _other) {
            _other.copyTo(this);
            return this;
        }

        public SignatureData.Builder<_B> copyOf(final SignatureData.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SignatureData.Selector<SignatureData.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SignatureData.Select _root() {
            return new SignatureData.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>> algorithm = null;
        private com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>> signature = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.algorithm!= null) {
                products.put("algorithm", this.algorithm.init());
            }
            if (this.signature!= null) {
                products.put("signature", this.signature.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>> algorithm() {
            return ((this.algorithm == null)?this.algorithm = new com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>>(this._root, this, "algorithm"):this.algorithm);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>> signature() {
            return ((this.signature == null)?this.signature = new com.kscs.util.jaxb.Selector<TRoot, SignatureData.Selector<TRoot, TParent>>(this._root, this, "signature"):this.signature);
        }

    }

}
