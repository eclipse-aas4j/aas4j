//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für StatusCode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatusCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCode", propOrder = {
    "code"
})
public class StatusCode {

    @XmlElement(name = "Code")
    @XmlSchemaType(name = "unsignedInt")
    protected Long code;

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCode(Long value) {
        this.code = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final StatusCode.Builder<_B> _other) {
        _other.code = this.code;
    }

    public<_B >StatusCode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new StatusCode.Builder<_B>(_parentBuilder, this, true);
    }

    public StatusCode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static StatusCode.Builder<Void> builder() {
        return new StatusCode.Builder<Void>(null, null, false);
    }

    public static<_B >StatusCode.Builder<_B> copyOf(final StatusCode _other) {
        final StatusCode.Builder<_B> _newBuilder = new StatusCode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final StatusCode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree codePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("code"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codePropertyTree!= null):((codePropertyTree == null)||(!codePropertyTree.isLeaf())))) {
            _other.code = this.code;
        }
    }

    public<_B >StatusCode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new StatusCode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public StatusCode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >StatusCode.Builder<_B> copyOf(final StatusCode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StatusCode.Builder<_B> _newBuilder = new StatusCode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static StatusCode.Builder<Void> copyExcept(final StatusCode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StatusCode.Builder<Void> copyOnly(final StatusCode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final StatusCode _storedValue;
        private Long code;

        public Builder(final _B _parentBuilder, final StatusCode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.code = _other.code;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final StatusCode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree codePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("code"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(codePropertyTree!= null):((codePropertyTree == null)||(!codePropertyTree.isLeaf())))) {
                        this.code = _other.code;
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

        protected<_P extends StatusCode >_P init(final _P _product) {
            _product.code = this.code;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "code" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param code
         *     Neuer Wert der Eigenschaft "code".
         */
        public StatusCode.Builder<_B> withCode(final Long code) {
            this.code = code;
            return this;
        }

        @Override
        public StatusCode build() {
            if (_storedValue == null) {
                return this.init(new StatusCode());
            } else {
                return ((StatusCode) _storedValue);
            }
        }

        public StatusCode.Builder<_B> copyOf(final StatusCode _other) {
            _other.copyTo(this);
            return this;
        }

        public StatusCode.Builder<_B> copyOf(final StatusCode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends StatusCode.Selector<StatusCode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static StatusCode.Select _root() {
            return new StatusCode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, StatusCode.Selector<TRoot, TParent>> code = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.code!= null) {
                products.put("code", this.code.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, StatusCode.Selector<TRoot, TParent>> code() {
            return ((this.code == null)?this.code = new com.kscs.util.jaxb.Selector<TRoot, StatusCode.Selector<TRoot, TParent>>(this._root, this, "code"):this.code);
        }

    }

}
