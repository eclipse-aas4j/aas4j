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
 * <p>Java-Klasse für Guid complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Guid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guid", propOrder = {
    "string"
})
public class Guid {

    @XmlElementRef(name = "String", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> string;

    /**
     * Ruft den Wert der string-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getString() {
        return string;
    }

    /**
     * Legt den Wert der string-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setString(JAXBElement<String> value) {
        this.string = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Guid.Builder<_B> _other) {
        _other.string = this.string;
    }

    public<_B >Guid.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Guid.Builder<_B>(_parentBuilder, this, true);
    }

    public Guid.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Guid.Builder<Void> builder() {
        return new Guid.Builder<Void>(null, null, false);
    }

    public static<_B >Guid.Builder<_B> copyOf(final Guid _other) {
        final Guid.Builder<_B> _newBuilder = new Guid.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final Guid.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree stringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("string"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringPropertyTree!= null):((stringPropertyTree == null)||(!stringPropertyTree.isLeaf())))) {
            _other.string = this.string;
        }
    }

    public<_B >Guid.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Guid.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Guid.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Guid.Builder<_B> copyOf(final Guid _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Guid.Builder<_B> _newBuilder = new Guid.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Guid.Builder<Void> copyExcept(final Guid _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Guid.Builder<Void> copyOnly(final Guid _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Guid _storedValue;
        private JAXBElement<String> string;

        public Builder(final _B _parentBuilder, final Guid _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.string = _other.string;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Guid _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree stringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("string"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringPropertyTree!= null):((stringPropertyTree == null)||(!stringPropertyTree.isLeaf())))) {
                        this.string = _other.string;
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

        protected<_P extends Guid >_P init(final _P _product) {
            _product.string = this.string;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "string" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param string
         *     Neuer Wert der Eigenschaft "string".
         */
        public Guid.Builder<_B> withString(final JAXBElement<String> string) {
            this.string = string;
            return this;
        }

        @Override
        public Guid build() {
            if (_storedValue == null) {
                return this.init(new Guid());
            } else {
                return ((Guid) _storedValue);
            }
        }

        public Guid.Builder<_B> copyOf(final Guid _other) {
            _other.copyTo(this);
            return this;
        }

        public Guid.Builder<_B> copyOf(final Guid.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends Guid.Selector<Guid.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Guid.Select _root() {
            return new Guid.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Guid.Selector<TRoot, TParent>> string = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.string!= null) {
                products.put("string", this.string.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Guid.Selector<TRoot, TParent>> string() {
            return ((this.string == null)?this.string = new com.kscs.util.jaxb.Selector<TRoot, Guid.Selector<TRoot, TParent>>(this._root, this, "string"):this.string);
        }

    }

}
