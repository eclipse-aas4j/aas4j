//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:06:57 PM CEST 
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
 * <p>Java-Klasse für ExampleExtensionObjectBody complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExampleExtensionObjectBody"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObjectBody"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Argument" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Argument" minOccurs="0"/&gt;
 *         &lt;element name="UserIdentityToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserIdentityToken" minOccurs="0"/&gt;
 *         &lt;element name="UserNameIdentityToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserNameIdentityToken" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExampleExtensionObjectBody", propOrder = {
    "argument",
    "userIdentityToken",
    "userNameIdentityToken"
})
public class ExampleExtensionObjectBody
    extends ExtensionObjectBody
{

    @XmlElementRef(name = "Argument", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Argument> argument;
    @XmlElementRef(name = "UserIdentityToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentityToken> userIdentityToken;
    @XmlElementRef(name = "UserNameIdentityToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<UserNameIdentityToken> userNameIdentityToken;

    /**
     * Ruft den Wert der argument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Argument }{@code >}
     *     
     */
    public JAXBElement<Argument> getArgument() {
        return argument;
    }

    /**
     * Legt den Wert der argument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Argument }{@code >}
     *     
     */
    public void setArgument(JAXBElement<Argument> value) {
        this.argument = value;
    }

    /**
     * Ruft den Wert der userIdentityToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentityToken }{@code >}
     *     
     */
    public JAXBElement<UserIdentityToken> getUserIdentityToken() {
        return userIdentityToken;
    }

    /**
     * Legt den Wert der userIdentityToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentityToken }{@code >}
     *     
     */
    public void setUserIdentityToken(JAXBElement<UserIdentityToken> value) {
        this.userIdentityToken = value;
    }

    /**
     * Ruft den Wert der userNameIdentityToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserNameIdentityToken }{@code >}
     *     
     */
    public JAXBElement<UserNameIdentityToken> getUserNameIdentityToken() {
        return userNameIdentityToken;
    }

    /**
     * Legt den Wert der userNameIdentityToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserNameIdentityToken }{@code >}
     *     
     */
    public void setUserNameIdentityToken(JAXBElement<UserNameIdentityToken> value) {
        this.userNameIdentityToken = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ExampleExtensionObjectBody.Builder<_B> _other) {
        super.copyTo(_other);
        _other.argument = this.argument;
        _other.userIdentityToken = this.userIdentityToken;
        _other.userNameIdentityToken = this.userNameIdentityToken;
    }

    @Override
    public<_B >ExampleExtensionObjectBody.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ExampleExtensionObjectBody.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ExampleExtensionObjectBody.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ExampleExtensionObjectBody.Builder<Void> builder() {
        return new ExampleExtensionObjectBody.Builder<Void>(null, null, false);
    }

    public static<_B >ExampleExtensionObjectBody.Builder<_B> copyOf(final ExtensionObjectBody _other) {
        final ExampleExtensionObjectBody.Builder<_B> _newBuilder = new ExampleExtensionObjectBody.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ExampleExtensionObjectBody.Builder<_B> copyOf(final ExampleExtensionObjectBody _other) {
        final ExampleExtensionObjectBody.Builder<_B> _newBuilder = new ExampleExtensionObjectBody.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ExampleExtensionObjectBody.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree argumentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("argument"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(argumentPropertyTree!= null):((argumentPropertyTree == null)||(!argumentPropertyTree.isLeaf())))) {
            _other.argument = this.argument;
        }
        final PropertyTree userIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokenPropertyTree!= null):((userIdentityTokenPropertyTree == null)||(!userIdentityTokenPropertyTree.isLeaf())))) {
            _other.userIdentityToken = this.userIdentityToken;
        }
        final PropertyTree userNameIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userNameIdentityToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNameIdentityTokenPropertyTree!= null):((userNameIdentityTokenPropertyTree == null)||(!userNameIdentityTokenPropertyTree.isLeaf())))) {
            _other.userNameIdentityToken = this.userNameIdentityToken;
        }
    }

    @Override
    public<_B >ExampleExtensionObjectBody.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ExampleExtensionObjectBody.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ExampleExtensionObjectBody.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ExampleExtensionObjectBody.Builder<_B> copyOf(final ExtensionObjectBody _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ExampleExtensionObjectBody.Builder<_B> _newBuilder = new ExampleExtensionObjectBody.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ExampleExtensionObjectBody.Builder<_B> copyOf(final ExampleExtensionObjectBody _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ExampleExtensionObjectBody.Builder<_B> _newBuilder = new ExampleExtensionObjectBody.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ExampleExtensionObjectBody.Builder<Void> copyExcept(final ExtensionObjectBody _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ExampleExtensionObjectBody.Builder<Void> copyExcept(final ExampleExtensionObjectBody _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ExampleExtensionObjectBody.Builder<Void> copyOnly(final ExtensionObjectBody _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ExampleExtensionObjectBody.Builder<Void> copyOnly(final ExampleExtensionObjectBody _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends ExtensionObjectBody.Builder<_B>
        implements Buildable
    {

        private JAXBElement<Argument> argument;
        private JAXBElement<UserIdentityToken> userIdentityToken;
        private JAXBElement<UserNameIdentityToken> userNameIdentityToken;

        public Builder(final _B _parentBuilder, final ExampleExtensionObjectBody _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.argument = _other.argument;
                this.userIdentityToken = _other.userIdentityToken;
                this.userNameIdentityToken = _other.userNameIdentityToken;
            }
        }

        public Builder(final _B _parentBuilder, final ExampleExtensionObjectBody _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree argumentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("argument"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(argumentPropertyTree!= null):((argumentPropertyTree == null)||(!argumentPropertyTree.isLeaf())))) {
                    this.argument = _other.argument;
                }
                final PropertyTree userIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityToken"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokenPropertyTree!= null):((userIdentityTokenPropertyTree == null)||(!userIdentityTokenPropertyTree.isLeaf())))) {
                    this.userIdentityToken = _other.userIdentityToken;
                }
                final PropertyTree userNameIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userNameIdentityToken"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNameIdentityTokenPropertyTree!= null):((userNameIdentityTokenPropertyTree == null)||(!userNameIdentityTokenPropertyTree.isLeaf())))) {
                    this.userNameIdentityToken = _other.userNameIdentityToken;
                }
            }
        }

        protected<_P extends ExampleExtensionObjectBody >_P init(final _P _product) {
            _product.argument = this.argument;
            _product.userIdentityToken = this.userIdentityToken;
            _product.userNameIdentityToken = this.userNameIdentityToken;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "argument" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param argument
         *     Neuer Wert der Eigenschaft "argument".
         */
        public ExampleExtensionObjectBody.Builder<_B> withArgument(final JAXBElement<Argument> argument) {
            this.argument = argument;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userIdentityToken" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userIdentityToken
         *     Neuer Wert der Eigenschaft "userIdentityToken".
         */
        public ExampleExtensionObjectBody.Builder<_B> withUserIdentityToken(final JAXBElement<UserIdentityToken> userIdentityToken) {
            this.userIdentityToken = userIdentityToken;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userNameIdentityToken" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param userNameIdentityToken
         *     Neuer Wert der Eigenschaft "userNameIdentityToken".
         */
        public ExampleExtensionObjectBody.Builder<_B> withUserNameIdentityToken(final JAXBElement<UserNameIdentityToken> userNameIdentityToken) {
            this.userNameIdentityToken = userNameIdentityToken;
            return this;
        }

        @Override
        public ExampleExtensionObjectBody build() {
            if (_storedValue == null) {
                return this.init(new ExampleExtensionObjectBody());
            } else {
                return ((ExampleExtensionObjectBody) _storedValue);
            }
        }

        public ExampleExtensionObjectBody.Builder<_B> copyOf(final ExampleExtensionObjectBody _other) {
            _other.copyTo(this);
            return this;
        }

        public ExampleExtensionObjectBody.Builder<_B> copyOf(final ExampleExtensionObjectBody.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ExampleExtensionObjectBody.Selector<ExampleExtensionObjectBody.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ExampleExtensionObjectBody.Select _root() {
            return new ExampleExtensionObjectBody.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends ExtensionObjectBody.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> argument = null;
        private com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> userIdentityToken = null;
        private com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> userNameIdentityToken = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.argument!= null) {
                products.put("argument", this.argument.init());
            }
            if (this.userIdentityToken!= null) {
                products.put("userIdentityToken", this.userIdentityToken.init());
            }
            if (this.userNameIdentityToken!= null) {
                products.put("userNameIdentityToken", this.userNameIdentityToken.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> argument() {
            return ((this.argument == null)?this.argument = new com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>>(this._root, this, "argument"):this.argument);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> userIdentityToken() {
            return ((this.userIdentityToken == null)?this.userIdentityToken = new com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>>(this._root, this, "userIdentityToken"):this.userIdentityToken);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>> userNameIdentityToken() {
            return ((this.userNameIdentityToken == null)?this.userNameIdentityToken = new com.kscs.util.jaxb.Selector<TRoot, ExampleExtensionObjectBody.Selector<TRoot, TParent>>(this._root, this, "userNameIdentityToken"):this.userNameIdentityToken);
        }

    }

}
