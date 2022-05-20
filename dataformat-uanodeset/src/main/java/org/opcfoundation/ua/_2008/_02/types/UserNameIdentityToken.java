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
 * <p>Java-Klasse für UserNameIdentityToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserNameIdentityToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserIdentityToken"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
@XmlType(name = "UserNameIdentityToken", propOrder = {
    "userName",
    "password",
    "encryptionAlgorithm"
})
public class UserNameIdentityToken
    extends UserIdentityToken
{

    @XmlElementRef(name = "UserName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "Password", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> password;
    @XmlElementRef(name = "EncryptionAlgorithm", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> encryptionAlgorithm;

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPassword(JAXBElement<byte[]> value) {
        this.password = value;
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
    public<_B >void copyTo(final UserNameIdentityToken.Builder<_B> _other) {
        super.copyTo(_other);
        _other.userName = this.userName;
        _other.password = this.password;
        _other.encryptionAlgorithm = this.encryptionAlgorithm;
    }

    @Override
    public<_B >UserNameIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UserNameIdentityToken.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UserNameIdentityToken.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UserNameIdentityToken.Builder<Void> builder() {
        return new UserNameIdentityToken.Builder<Void>(null, null, false);
    }

    public static<_B >UserNameIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other) {
        final UserNameIdentityToken.Builder<_B> _newBuilder = new UserNameIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UserNameIdentityToken.Builder<_B> copyOf(final UserNameIdentityToken _other) {
        final UserNameIdentityToken.Builder<_B> _newBuilder = new UserNameIdentityToken.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UserNameIdentityToken.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
            _other.userName = this.userName;
        }
        final PropertyTree passwordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("password"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(passwordPropertyTree!= null):((passwordPropertyTree == null)||(!passwordPropertyTree.isLeaf())))) {
            _other.password = this.password;
        }
        final PropertyTree encryptionAlgorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encryptionAlgorithm"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encryptionAlgorithmPropertyTree!= null):((encryptionAlgorithmPropertyTree == null)||(!encryptionAlgorithmPropertyTree.isLeaf())))) {
            _other.encryptionAlgorithm = this.encryptionAlgorithm;
        }
    }

    @Override
    public<_B >UserNameIdentityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UserNameIdentityToken.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UserNameIdentityToken.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UserNameIdentityToken.Builder<_B> copyOf(final UserIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserNameIdentityToken.Builder<_B> _newBuilder = new UserNameIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UserNameIdentityToken.Builder<_B> copyOf(final UserNameIdentityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserNameIdentityToken.Builder<_B> _newBuilder = new UserNameIdentityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UserNameIdentityToken.Builder<Void> copyExcept(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UserNameIdentityToken.Builder<Void> copyExcept(final UserNameIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UserNameIdentityToken.Builder<Void> copyOnly(final UserIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UserNameIdentityToken.Builder<Void> copyOnly(final UserNameIdentityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends UserIdentityToken.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> userName;
        private JAXBElement<byte[]> password;
        private JAXBElement<String> encryptionAlgorithm;

        public Builder(final _B _parentBuilder, final UserNameIdentityToken _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.userName = _other.userName;
                this.password = _other.password;
                this.encryptionAlgorithm = _other.encryptionAlgorithm;
            }
        }

        public Builder(final _B _parentBuilder, final UserNameIdentityToken _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
                    this.userName = _other.userName;
                }
                final PropertyTree passwordPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("password"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(passwordPropertyTree!= null):((passwordPropertyTree == null)||(!passwordPropertyTree.isLeaf())))) {
                    this.password = _other.password;
                }
                final PropertyTree encryptionAlgorithmPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encryptionAlgorithm"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encryptionAlgorithmPropertyTree!= null):((encryptionAlgorithmPropertyTree == null)||(!encryptionAlgorithmPropertyTree.isLeaf())))) {
                    this.encryptionAlgorithm = _other.encryptionAlgorithm;
                }
            }
        }

        protected<_P extends UserNameIdentityToken >_P init(final _P _product) {
            _product.userName = this.userName;
            _product.password = this.password;
            _product.encryptionAlgorithm = this.encryptionAlgorithm;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param userName
         *     Neuer Wert der Eigenschaft "userName".
         */
        public UserNameIdentityToken.Builder<_B> withUserName(final JAXBElement<String> userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "password" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param password
         *     Neuer Wert der Eigenschaft "password".
         */
        public UserNameIdentityToken.Builder<_B> withPassword(final JAXBElement<byte[]> password) {
            this.password = password;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "encryptionAlgorithm" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param encryptionAlgorithm
         *     Neuer Wert der Eigenschaft "encryptionAlgorithm".
         */
        public UserNameIdentityToken.Builder<_B> withEncryptionAlgorithm(final JAXBElement<String> encryptionAlgorithm) {
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
        public UserNameIdentityToken.Builder<_B> withPolicyId(final JAXBElement<String> policyId) {
            super.withPolicyId(policyId);
            return this;
        }

        @Override
        public UserNameIdentityToken build() {
            if (_storedValue == null) {
                return this.init(new UserNameIdentityToken());
            } else {
                return ((UserNameIdentityToken) _storedValue);
            }
        }

        public UserNameIdentityToken.Builder<_B> copyOf(final UserNameIdentityToken _other) {
            _other.copyTo(this);
            return this;
        }

        public UserNameIdentityToken.Builder<_B> copyOf(final UserNameIdentityToken.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UserNameIdentityToken.Selector<UserNameIdentityToken.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UserNameIdentityToken.Select _root() {
            return new UserNameIdentityToken.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends UserIdentityToken.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> userName = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> password = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> encryptionAlgorithm = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.userName!= null) {
                products.put("userName", this.userName.init());
            }
            if (this.password!= null) {
                products.put("password", this.password.init());
            }
            if (this.encryptionAlgorithm!= null) {
                products.put("encryptionAlgorithm", this.encryptionAlgorithm.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> userName() {
            return ((this.userName == null)?this.userName = new com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>>(this._root, this, "userName"):this.userName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> password() {
            return ((this.password == null)?this.password = new com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>>(this._root, this, "password"):this.password);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>> encryptionAlgorithm() {
            return ((this.encryptionAlgorithm == null)?this.encryptionAlgorithm = new com.kscs.util.jaxb.Selector<TRoot, UserNameIdentityToken.Selector<TRoot, TParent>>(this._root, this, "encryptionAlgorithm"):this.encryptionAlgorithm);
        }

    }

}
