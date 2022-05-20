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
 * <p>Java-Klasse für ContentFilter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Elements" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfContentFilterElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentFilter", propOrder = {
    "elements"
})
public class ContentFilter {

    @XmlElementRef(name = "Elements", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfContentFilterElement> elements;

    /**
     * Ruft den Wert der elements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfContentFilterElement }{@code >}
     *     
     */
    public JAXBElement<ListOfContentFilterElement> getElements() {
        return elements;
    }

    /**
     * Legt den Wert der elements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfContentFilterElement }{@code >}
     *     
     */
    public void setElements(JAXBElement<ListOfContentFilterElement> value) {
        this.elements = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ContentFilter.Builder<_B> _other) {
        _other.elements = this.elements;
    }

    public<_B >ContentFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ContentFilter.Builder<_B>(_parentBuilder, this, true);
    }

    public ContentFilter.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ContentFilter.Builder<Void> builder() {
        return new ContentFilter.Builder<Void>(null, null, false);
    }

    public static<_B >ContentFilter.Builder<_B> copyOf(final ContentFilter _other) {
        final ContentFilter.Builder<_B> _newBuilder = new ContentFilter.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ContentFilter.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree elementsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elements"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementsPropertyTree!= null):((elementsPropertyTree == null)||(!elementsPropertyTree.isLeaf())))) {
            _other.elements = this.elements;
        }
    }

    public<_B >ContentFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ContentFilter.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ContentFilter.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ContentFilter.Builder<_B> copyOf(final ContentFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ContentFilter.Builder<_B> _newBuilder = new ContentFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ContentFilter.Builder<Void> copyExcept(final ContentFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ContentFilter.Builder<Void> copyOnly(final ContentFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ContentFilter _storedValue;
        private JAXBElement<ListOfContentFilterElement> elements;

        public Builder(final _B _parentBuilder, final ContentFilter _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.elements = _other.elements;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ContentFilter _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree elementsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elements"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementsPropertyTree!= null):((elementsPropertyTree == null)||(!elementsPropertyTree.isLeaf())))) {
                        this.elements = _other.elements;
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

        protected<_P extends ContentFilter >_P init(final _P _product) {
            _product.elements = this.elements;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "elements" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param elements
         *     Neuer Wert der Eigenschaft "elements".
         */
        public ContentFilter.Builder<_B> withElements(final JAXBElement<ListOfContentFilterElement> elements) {
            this.elements = elements;
            return this;
        }

        @Override
        public ContentFilter build() {
            if (_storedValue == null) {
                return this.init(new ContentFilter());
            } else {
                return ((ContentFilter) _storedValue);
            }
        }

        public ContentFilter.Builder<_B> copyOf(final ContentFilter _other) {
            _other.copyTo(this);
            return this;
        }

        public ContentFilter.Builder<_B> copyOf(final ContentFilter.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ContentFilter.Selector<ContentFilter.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ContentFilter.Select _root() {
            return new ContentFilter.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ContentFilter.Selector<TRoot, TParent>> elements = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.elements!= null) {
                products.put("elements", this.elements.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilter.Selector<TRoot, TParent>> elements() {
            return ((this.elements == null)?this.elements = new com.kscs.util.jaxb.Selector<TRoot, ContentFilter.Selector<TRoot, TParent>>(this._root, this, "elements"):this.elements);
        }

    }

}
