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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für UserIdentityToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserIdentityToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolicyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentityToken", propOrder = {
    "policyId"
})
@XmlSeeAlso({
    AnonymousIdentityToken.class,
    UserNameIdentityToken.class,
    X509IdentityToken.class,
    IssuedIdentityToken.class
})
public class UserIdentityToken {

    @XmlElementRef(name = "PolicyId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyId;

    /**
     * Ruft den Wert der policyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyId() {
        return policyId;
    }

    /**
     * Legt den Wert der policyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyId(JAXBElement<String> value) {
        this.policyId = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UserIdentityToken.Builder<_B> _other) {
        _other.policyId = this.policyId;
    }

    public<_B >UserIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UserIdentityToken.Builder<_B>(_parentBuilder, this, true);
    }

    public UserIdentityToken.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UserIdentityToken.Builder<Void> builder() {
        return new UserIdentityToken.Builder<Void>(null, null, false);
    }

    public static<_B >UserIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other) {
        final UserIdentityToken.Builder<_B> _newBuilder = new UserIdentityToken.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UserIdentityToken.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree policyIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("policyId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(policyIdPropertyTree!= null):((policyIdPropertyTree == null)||(!policyIdPropertyTree.isLeaf())))) {
            _other.policyId = this.policyId;
        }
    }

    public<_B >UserIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UserIdentityToken.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public UserIdentityToken.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UserIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserIdentityToken.Builder<_B> _newBuilder = new UserIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UserIdentityToken.Builder<Void> copyExcept(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UserIdentityToken.Builder<Void> copyOnly(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final UserIdentityToken _storedValue;
        private JAXBElement<String> policyId;

        public Builder(final _B _parentBuilder, final UserIdentityToken _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.policyId = _other.policyId;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final UserIdentityToken _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree policyIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("policyId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(policyIdPropertyTree!= null):((policyIdPropertyTree == null)||(!policyIdPropertyTree.isLeaf())))) {
                        this.policyId = _other.policyId;
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

        protected<_P extends UserIdentityToken >_P init(final _P _product) {
            _product.policyId = this.policyId;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "policyId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param policyId
         *     Neuer Wert der Eigenschaft "policyId".
         */
        public UserIdentityToken.Builder<_B> withPolicyId(final JAXBElement<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        @Override
        public UserIdentityToken build() {
            if (_storedValue == null) {
                return this.init(new UserIdentityToken());
            } else {
                return ((UserIdentityToken) _storedValue);
            }
        }

        public UserIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other) {
            _other.copyTo(this);
            return this;
        }

        public UserIdentityToken.Builder<_B> copyOf(final UserIdentityToken.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UserIdentityToken.Selector<UserIdentityToken.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UserIdentityToken.Select _root() {
            return new UserIdentityToken.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UserIdentityToken.Selector<TRoot, TParent>> policyId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.policyId!= null) {
                products.put("policyId", this.policyId.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserIdentityToken.Selector<TRoot, TParent>> policyId() {
            return ((this.policyId == null)?this.policyId = new com.kscs.util.jaxb.Selector<TRoot, UserIdentityToken.Selector<TRoot, TParent>>(this._root, this, "policyId"):this.policyId);
        }

    }

}
