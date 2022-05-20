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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ContentFilterElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentFilterElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterOperator" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}FilterOperator" minOccurs="0"/&gt;
 *         &lt;element name="FilterOperands" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentFilterElement", propOrder = {
    "filterOperator",
    "filterOperands"
})
public class ContentFilterElement {

    @XmlElement(name = "FilterOperator")
    @XmlSchemaType(name = "string")
    protected FilterOperator filterOperator;
    @XmlElementRef(name = "FilterOperands", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExtensionObject> filterOperands;

    /**
     * Ruft den Wert der filterOperator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterOperator }
     *     
     */
    public FilterOperator getFilterOperator() {
        return filterOperator;
    }

    /**
     * Legt den Wert der filterOperator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOperator }
     *     
     */
    public void setFilterOperator(FilterOperator value) {
        this.filterOperator = value;
    }

    /**
     * Ruft den Wert der filterOperands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ListOfExtensionObject> getFilterOperands() {
        return filterOperands;
    }

    /**
     * Legt den Wert der filterOperands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public void setFilterOperands(JAXBElement<ListOfExtensionObject> value) {
        this.filterOperands = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ContentFilterElement.Builder<_B> _other) {
        _other.filterOperator = this.filterOperator;
        _other.filterOperands = this.filterOperands;
    }

    public<_B >ContentFilterElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ContentFilterElement.Builder<_B>(_parentBuilder, this, true);
    }

    public ContentFilterElement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ContentFilterElement.Builder<Void> builder() {
        return new ContentFilterElement.Builder<Void>(null, null, false);
    }

    public static<_B >ContentFilterElement.Builder<_B> copyOf(final ContentFilterElement _other) {
        final ContentFilterElement.Builder<_B> _newBuilder = new ContentFilterElement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ContentFilterElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree filterOperatorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterOperator"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterOperatorPropertyTree!= null):((filterOperatorPropertyTree == null)||(!filterOperatorPropertyTree.isLeaf())))) {
            _other.filterOperator = this.filterOperator;
        }
        final PropertyTree filterOperandsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterOperands"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterOperandsPropertyTree!= null):((filterOperandsPropertyTree == null)||(!filterOperandsPropertyTree.isLeaf())))) {
            _other.filterOperands = this.filterOperands;
        }
    }

    public<_B >ContentFilterElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ContentFilterElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ContentFilterElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ContentFilterElement.Builder<_B> copyOf(final ContentFilterElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ContentFilterElement.Builder<_B> _newBuilder = new ContentFilterElement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ContentFilterElement.Builder<Void> copyExcept(final ContentFilterElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ContentFilterElement.Builder<Void> copyOnly(final ContentFilterElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ContentFilterElement _storedValue;
        private FilterOperator filterOperator;
        private JAXBElement<ListOfExtensionObject> filterOperands;

        public Builder(final _B _parentBuilder, final ContentFilterElement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.filterOperator = _other.filterOperator;
                    this.filterOperands = _other.filterOperands;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ContentFilterElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree filterOperatorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterOperator"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterOperatorPropertyTree!= null):((filterOperatorPropertyTree == null)||(!filterOperatorPropertyTree.isLeaf())))) {
                        this.filterOperator = _other.filterOperator;
                    }
                    final PropertyTree filterOperandsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterOperands"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterOperandsPropertyTree!= null):((filterOperandsPropertyTree == null)||(!filterOperandsPropertyTree.isLeaf())))) {
                        this.filterOperands = _other.filterOperands;
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

        protected<_P extends ContentFilterElement >_P init(final _P _product) {
            _product.filterOperator = this.filterOperator;
            _product.filterOperands = this.filterOperands;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filterOperator" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param filterOperator
         *     Neuer Wert der Eigenschaft "filterOperator".
         */
        public ContentFilterElement.Builder<_B> withFilterOperator(final FilterOperator filterOperator) {
            this.filterOperator = filterOperator;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filterOperands" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param filterOperands
         *     Neuer Wert der Eigenschaft "filterOperands".
         */
        public ContentFilterElement.Builder<_B> withFilterOperands(final JAXBElement<ListOfExtensionObject> filterOperands) {
            this.filterOperands = filterOperands;
            return this;
        }

        @Override
        public ContentFilterElement build() {
            if (_storedValue == null) {
                return this.init(new ContentFilterElement());
            } else {
                return ((ContentFilterElement) _storedValue);
            }
        }

        public ContentFilterElement.Builder<_B> copyOf(final ContentFilterElement _other) {
            _other.copyTo(this);
            return this;
        }

        public ContentFilterElement.Builder<_B> copyOf(final ContentFilterElement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ContentFilterElement.Selector<ContentFilterElement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ContentFilterElement.Select _root() {
            return new ContentFilterElement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>> filterOperator = null;
        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>> filterOperands = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.filterOperator!= null) {
                products.put("filterOperator", this.filterOperator.init());
            }
            if (this.filterOperands!= null) {
                products.put("filterOperands", this.filterOperands.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>> filterOperator() {
            return ((this.filterOperator == null)?this.filterOperator = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>>(this._root, this, "filterOperator"):this.filterOperator);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>> filterOperands() {
            return ((this.filterOperands == null)?this.filterOperands = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterElement.Selector<TRoot, TParent>>(this._root, this, "filterOperands"):this.filterOperands);
        }

    }

}
