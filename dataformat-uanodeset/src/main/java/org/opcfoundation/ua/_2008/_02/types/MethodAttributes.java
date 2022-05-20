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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für MethodAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MethodAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Executable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserExecutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodAttributes", propOrder = {
    "executable",
    "userExecutable"
})
public class MethodAttributes
    extends NodeAttributes
{

    @XmlElement(name = "Executable")
    protected Boolean executable;
    @XmlElement(name = "UserExecutable")
    protected Boolean userExecutable;

    /**
     * Ruft den Wert der executable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecutable() {
        return executable;
    }

    /**
     * Legt den Wert der executable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecutable(Boolean value) {
        this.executable = value;
    }

    /**
     * Ruft den Wert der userExecutable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserExecutable() {
        return userExecutable;
    }

    /**
     * Legt den Wert der userExecutable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserExecutable(Boolean value) {
        this.userExecutable = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MethodAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.executable = this.executable;
        _other.userExecutable = this.userExecutable;
    }

    @Override
    public<_B >MethodAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MethodAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public MethodAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MethodAttributes.Builder<Void> builder() {
        return new MethodAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >MethodAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final MethodAttributes.Builder<_B> _newBuilder = new MethodAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >MethodAttributes.Builder<_B> copyOf(final MethodAttributes _other) {
        final MethodAttributes.Builder<_B> _newBuilder = new MethodAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MethodAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree executablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("executable"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(executablePropertyTree!= null):((executablePropertyTree == null)||(!executablePropertyTree.isLeaf())))) {
            _other.executable = this.executable;
        }
        final PropertyTree userExecutablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userExecutable"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userExecutablePropertyTree!= null):((userExecutablePropertyTree == null)||(!userExecutablePropertyTree.isLeaf())))) {
            _other.userExecutable = this.userExecutable;
        }
    }

    @Override
    public<_B >MethodAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MethodAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public MethodAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MethodAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MethodAttributes.Builder<_B> _newBuilder = new MethodAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >MethodAttributes.Builder<_B> copyOf(final MethodAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MethodAttributes.Builder<_B> _newBuilder = new MethodAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MethodAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MethodAttributes.Builder<Void> copyExcept(final MethodAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MethodAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static MethodAttributes.Builder<Void> copyOnly(final MethodAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private Boolean executable;
        private Boolean userExecutable;

        public Builder(final _B _parentBuilder, final MethodAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.executable = _other.executable;
                this.userExecutable = _other.userExecutable;
            }
        }

        public Builder(final _B _parentBuilder, final MethodAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree executablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("executable"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(executablePropertyTree!= null):((executablePropertyTree == null)||(!executablePropertyTree.isLeaf())))) {
                    this.executable = _other.executable;
                }
                final PropertyTree userExecutablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userExecutable"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userExecutablePropertyTree!= null):((userExecutablePropertyTree == null)||(!userExecutablePropertyTree.isLeaf())))) {
                    this.userExecutable = _other.userExecutable;
                }
            }
        }

        protected<_P extends MethodAttributes >_P init(final _P _product) {
            _product.executable = this.executable;
            _product.userExecutable = this.userExecutable;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "executable" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param executable
         *     Neuer Wert der Eigenschaft "executable".
         */
        public MethodAttributes.Builder<_B> withExecutable(final Boolean executable) {
            this.executable = executable;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userExecutable" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userExecutable
         *     Neuer Wert der Eigenschaft "userExecutable".
         */
        public MethodAttributes.Builder<_B> withUserExecutable(final Boolean userExecutable) {
            this.userExecutable = userExecutable;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedAttributes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param specifiedAttributes
         *     Neuer Wert der Eigenschaft "specifiedAttributes".
         */
        @Override
        public MethodAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
            super.withSpecifiedAttributes(specifiedAttributes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        @Override
        public MethodAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        @Override
        public MethodAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            super.withDescription(description);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        @Override
        public MethodAttributes.Builder<_B> withWriteMask(final Long writeMask) {
            super.withWriteMask(writeMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        @Override
        public MethodAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public MethodAttributes build() {
            if (_storedValue == null) {
                return this.init(new MethodAttributes());
            } else {
                return ((MethodAttributes) _storedValue);
            }
        }

        public MethodAttributes.Builder<_B> copyOf(final MethodAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public MethodAttributes.Builder<_B> copyOf(final MethodAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MethodAttributes.Selector<MethodAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MethodAttributes.Select _root() {
            return new MethodAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>> executable = null;
        private com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>> userExecutable = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.executable!= null) {
                products.put("executable", this.executable.init());
            }
            if (this.userExecutable!= null) {
                products.put("userExecutable", this.userExecutable.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>> executable() {
            return ((this.executable == null)?this.executable = new com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>>(this._root, this, "executable"):this.executable);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>> userExecutable() {
            return ((this.userExecutable == null)?this.userExecutable = new com.kscs.util.jaxb.Selector<TRoot, MethodAttributes.Selector<TRoot, TParent>>(this._root, this, "userExecutable"):this.userExecutable);
        }

    }

}
