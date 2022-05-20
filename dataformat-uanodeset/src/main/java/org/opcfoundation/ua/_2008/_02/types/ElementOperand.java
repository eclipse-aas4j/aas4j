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
 * <p>Java-Klasse für ElementOperand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ElementOperand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}FilterOperand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementOperand", propOrder = {
    "index"
})
public class ElementOperand
    extends FilterOperand
{

    @XmlElement(name = "Index")
    @XmlSchemaType(name = "unsignedInt")
    protected Long index;

    /**
     * Ruft den Wert der index-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Legt den Wert der index-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ElementOperand.Builder<_B> _other) {
        super.copyTo(_other);
        _other.index = this.index;
    }

    @Override
    public<_B >ElementOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ElementOperand.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ElementOperand.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ElementOperand.Builder<Void> builder() {
        return new ElementOperand.Builder<Void>(null, null, false);
    }

    public static<_B >ElementOperand.Builder<_B> copyOf(final FilterOperand _other) {
        final ElementOperand.Builder<_B> _newBuilder = new ElementOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ElementOperand.Builder<_B> copyOf(final ElementOperand _other) {
        final ElementOperand.Builder<_B> _newBuilder = new ElementOperand.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ElementOperand.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree indexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("index"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexPropertyTree!= null):((indexPropertyTree == null)||(!indexPropertyTree.isLeaf())))) {
            _other.index = this.index;
        }
    }

    @Override
    public<_B >ElementOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ElementOperand.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ElementOperand.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ElementOperand.Builder<_B> copyOf(final FilterOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ElementOperand.Builder<_B> _newBuilder = new ElementOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ElementOperand.Builder<_B> copyOf(final ElementOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ElementOperand.Builder<_B> _newBuilder = new ElementOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ElementOperand.Builder<Void> copyExcept(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ElementOperand.Builder<Void> copyExcept(final ElementOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ElementOperand.Builder<Void> copyOnly(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ElementOperand.Builder<Void> copyOnly(final ElementOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends FilterOperand.Builder<_B>
        implements Buildable
    {

        private Long index;

        public Builder(final _B _parentBuilder, final ElementOperand _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.index = _other.index;
            }
        }

        public Builder(final _B _parentBuilder, final ElementOperand _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree indexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("index"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexPropertyTree!= null):((indexPropertyTree == null)||(!indexPropertyTree.isLeaf())))) {
                    this.index = _other.index;
                }
            }
        }

        protected<_P extends ElementOperand >_P init(final _P _product) {
            _product.index = this.index;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "index" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param index
         *     Neuer Wert der Eigenschaft "index".
         */
        public ElementOperand.Builder<_B> withIndex(final Long index) {
            this.index = index;
            return this;
        }

        @Override
        public ElementOperand build() {
            if (_storedValue == null) {
                return this.init(new ElementOperand());
            } else {
                return ((ElementOperand) _storedValue);
            }
        }

        public ElementOperand.Builder<_B> copyOf(final ElementOperand _other) {
            _other.copyTo(this);
            return this;
        }

        public ElementOperand.Builder<_B> copyOf(final ElementOperand.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ElementOperand.Selector<ElementOperand.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ElementOperand.Select _root() {
            return new ElementOperand.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends FilterOperand.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ElementOperand.Selector<TRoot, TParent>> index = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.index!= null) {
                products.put("index", this.index.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ElementOperand.Selector<TRoot, TParent>> index() {
            return ((this.index == null)?this.index = new com.kscs.util.jaxb.Selector<TRoot, ElementOperand.Selector<TRoot, TParent>>(this._root, this, "index"):this.index);
        }

    }

}
