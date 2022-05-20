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
 * <p>Java-Klasse für LocalizedText complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocalizedText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedText", propOrder = {
    "locale",
    "text"
})
public class LocalizedText {

    @XmlElementRef(name = "Locale", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locale;
    @XmlElementRef(name = "Text", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocale(JAXBElement<String> value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final LocalizedText.Builder<_B> _other) {
        _other.locale = this.locale;
        _other.text = this.text;
    }

    public<_B >LocalizedText.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new LocalizedText.Builder<_B>(_parentBuilder, this, true);
    }

    public LocalizedText.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static LocalizedText.Builder<Void> builder() {
        return new LocalizedText.Builder<Void>(null, null, false);
    }

    public static<_B >LocalizedText.Builder<_B> copyOf(final LocalizedText _other) {
        final LocalizedText.Builder<_B> _newBuilder = new LocalizedText.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final LocalizedText.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree localePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("locale"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localePropertyTree!= null):((localePropertyTree == null)||(!localePropertyTree.isLeaf())))) {
            _other.locale = this.locale;
        }
        final PropertyTree textPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("text"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(textPropertyTree!= null):((textPropertyTree == null)||(!textPropertyTree.isLeaf())))) {
            _other.text = this.text;
        }
    }

    public<_B >LocalizedText.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new LocalizedText.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public LocalizedText.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >LocalizedText.Builder<_B> copyOf(final LocalizedText _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final LocalizedText.Builder<_B> _newBuilder = new LocalizedText.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static LocalizedText.Builder<Void> copyExcept(final LocalizedText _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static LocalizedText.Builder<Void> copyOnly(final LocalizedText _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final LocalizedText _storedValue;
        private JAXBElement<String> locale;
        private JAXBElement<String> text;

        public Builder(final _B _parentBuilder, final LocalizedText _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.locale = _other.locale;
                    this.text = _other.text;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final LocalizedText _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree localePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("locale"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localePropertyTree!= null):((localePropertyTree == null)||(!localePropertyTree.isLeaf())))) {
                        this.locale = _other.locale;
                    }
                    final PropertyTree textPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("text"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(textPropertyTree!= null):((textPropertyTree == null)||(!textPropertyTree.isLeaf())))) {
                        this.text = _other.text;
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

        protected<_P extends LocalizedText >_P init(final _P _product) {
            _product.locale = this.locale;
            _product.text = this.text;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "locale" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param locale
         *     Neuer Wert der Eigenschaft "locale".
         */
        public LocalizedText.Builder<_B> withLocale(final JAXBElement<String> locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "text" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param text
         *     Neuer Wert der Eigenschaft "text".
         */
        public LocalizedText.Builder<_B> withText(final JAXBElement<String> text) {
            this.text = text;
            return this;
        }

        @Override
        public LocalizedText build() {
            if (_storedValue == null) {
                return this.init(new LocalizedText());
            } else {
                return ((LocalizedText) _storedValue);
            }
        }

        public LocalizedText.Builder<_B> copyOf(final LocalizedText _other) {
            _other.copyTo(this);
            return this;
        }

        public LocalizedText.Builder<_B> copyOf(final LocalizedText.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends LocalizedText.Selector<LocalizedText.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static LocalizedText.Select _root() {
            return new LocalizedText.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>> locale = null;
        private com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>> text = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.locale!= null) {
                products.put("locale", this.locale.init());
            }
            if (this.text!= null) {
                products.put("text", this.text.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>> locale() {
            return ((this.locale == null)?this.locale = new com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>>(this._root, this, "locale"):this.locale);
        }

        public com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>> text() {
            return ((this.text == null)?this.text = new com.kscs.util.jaxb.Selector<TRoot, LocalizedText.Selector<TRoot, TParent>>(this._root, this, "text"):this.text);
        }

    }

}
