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
 * <p>Java-Klasse für SimpleAttributeOperand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleAttributeOperand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}FilterOperand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeDefinitionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="BrowsePath" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfQualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleAttributeOperand", propOrder = {
    "typeDefinitionId",
    "browsePath",
    "attributeId",
    "indexRange"
})
public class SimpleAttributeOperand
    extends FilterOperand
{

    @XmlElementRef(name = "TypeDefinitionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> typeDefinitionId;
    @XmlElementRef(name = "BrowsePath", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfQualifiedName> browsePath;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;

    /**
     * Ruft den Wert der typeDefinitionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getTypeDefinitionId() {
        return typeDefinitionId;
    }

    /**
     * Legt den Wert der typeDefinitionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setTypeDefinitionId(JAXBElement<NodeId> value) {
        this.typeDefinitionId = value;
    }

    /**
     * Ruft den Wert der browsePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfQualifiedName }{@code >}
     *     
     */
    public JAXBElement<ListOfQualifiedName> getBrowsePath() {
        return browsePath;
    }

    /**
     * Legt den Wert der browsePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfQualifiedName }{@code >}
     *     
     */
    public void setBrowsePath(JAXBElement<ListOfQualifiedName> value) {
        this.browsePath = value;
    }

    /**
     * Ruft den Wert der attributeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * Legt den Wert der attributeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttributeId(Long value) {
        this.attributeId = value;
    }

    /**
     * Ruft den Wert der indexRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndexRange() {
        return indexRange;
    }

    /**
     * Legt den Wert der indexRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndexRange(JAXBElement<String> value) {
        this.indexRange = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SimpleAttributeOperand.Builder<_B> _other) {
        super.copyTo(_other);
        _other.typeDefinitionId = this.typeDefinitionId;
        _other.browsePath = this.browsePath;
        _other.attributeId = this.attributeId;
        _other.indexRange = this.indexRange;
    }

    @Override
    public<_B >SimpleAttributeOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SimpleAttributeOperand.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public SimpleAttributeOperand.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SimpleAttributeOperand.Builder<Void> builder() {
        return new SimpleAttributeOperand.Builder<Void>(null, null, false);
    }

    public static<_B >SimpleAttributeOperand.Builder<_B> copyOf(final FilterOperand _other) {
        final SimpleAttributeOperand.Builder<_B> _newBuilder = new SimpleAttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >SimpleAttributeOperand.Builder<_B> copyOf(final SimpleAttributeOperand _other) {
        final SimpleAttributeOperand.Builder<_B> _newBuilder = new SimpleAttributeOperand.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SimpleAttributeOperand.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree typeDefinitionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionIdPropertyTree!= null):((typeDefinitionIdPropertyTree == null)||(!typeDefinitionIdPropertyTree.isLeaf())))) {
            _other.typeDefinitionId = this.typeDefinitionId;
        }
        final PropertyTree browsePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePath"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathPropertyTree!= null):((browsePathPropertyTree == null)||(!browsePathPropertyTree.isLeaf())))) {
            _other.browsePath = this.browsePath;
        }
        final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
            _other.attributeId = this.attributeId;
        }
        final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
            _other.indexRange = this.indexRange;
        }
    }

    @Override
    public<_B >SimpleAttributeOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SimpleAttributeOperand.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public SimpleAttributeOperand.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SimpleAttributeOperand.Builder<_B> copyOf(final FilterOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SimpleAttributeOperand.Builder<_B> _newBuilder = new SimpleAttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >SimpleAttributeOperand.Builder<_B> copyOf(final SimpleAttributeOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SimpleAttributeOperand.Builder<_B> _newBuilder = new SimpleAttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SimpleAttributeOperand.Builder<Void> copyExcept(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SimpleAttributeOperand.Builder<Void> copyExcept(final SimpleAttributeOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SimpleAttributeOperand.Builder<Void> copyOnly(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static SimpleAttributeOperand.Builder<Void> copyOnly(final SimpleAttributeOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends FilterOperand.Builder<_B>
        implements Buildable
    {

        private JAXBElement<NodeId> typeDefinitionId;
        private JAXBElement<ListOfQualifiedName> browsePath;
        private Long attributeId;
        private JAXBElement<String> indexRange;

        public Builder(final _B _parentBuilder, final SimpleAttributeOperand _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.typeDefinitionId = _other.typeDefinitionId;
                this.browsePath = _other.browsePath;
                this.attributeId = _other.attributeId;
                this.indexRange = _other.indexRange;
            }
        }

        public Builder(final _B _parentBuilder, final SimpleAttributeOperand _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree typeDefinitionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionIdPropertyTree!= null):((typeDefinitionIdPropertyTree == null)||(!typeDefinitionIdPropertyTree.isLeaf())))) {
                    this.typeDefinitionId = _other.typeDefinitionId;
                }
                final PropertyTree browsePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePath"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathPropertyTree!= null):((browsePathPropertyTree == null)||(!browsePathPropertyTree.isLeaf())))) {
                    this.browsePath = _other.browsePath;
                }
                final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
                    this.attributeId = _other.attributeId;
                }
                final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
                    this.indexRange = _other.indexRange;
                }
            }
        }

        protected<_P extends SimpleAttributeOperand >_P init(final _P _product) {
            _product.typeDefinitionId = this.typeDefinitionId;
            _product.browsePath = this.browsePath;
            _product.attributeId = this.attributeId;
            _product.indexRange = this.indexRange;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeDefinitionId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param typeDefinitionId
         *     Neuer Wert der Eigenschaft "typeDefinitionId".
         */
        public SimpleAttributeOperand.Builder<_B> withTypeDefinitionId(final JAXBElement<NodeId> typeDefinitionId) {
            this.typeDefinitionId = typeDefinitionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePath" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browsePath
         *     Neuer Wert der Eigenschaft "browsePath".
         */
        public SimpleAttributeOperand.Builder<_B> withBrowsePath(final JAXBElement<ListOfQualifiedName> browsePath) {
            this.browsePath = browsePath;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeId
         *     Neuer Wert der Eigenschaft "attributeId".
         */
        public SimpleAttributeOperand.Builder<_B> withAttributeId(final Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "indexRange" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param indexRange
         *     Neuer Wert der Eigenschaft "indexRange".
         */
        public SimpleAttributeOperand.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        @Override
        public SimpleAttributeOperand build() {
            if (_storedValue == null) {
                return this.init(new SimpleAttributeOperand());
            } else {
                return ((SimpleAttributeOperand) _storedValue);
            }
        }

        public SimpleAttributeOperand.Builder<_B> copyOf(final SimpleAttributeOperand _other) {
            _other.copyTo(this);
            return this;
        }

        public SimpleAttributeOperand.Builder<_B> copyOf(final SimpleAttributeOperand.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SimpleAttributeOperand.Selector<SimpleAttributeOperand.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SimpleAttributeOperand.Select _root() {
            return new SimpleAttributeOperand.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends FilterOperand.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> typeDefinitionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> browsePath = null;
        private com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> indexRange = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.typeDefinitionId!= null) {
                products.put("typeDefinitionId", this.typeDefinitionId.init());
            }
            if (this.browsePath!= null) {
                products.put("browsePath", this.browsePath.init());
            }
            if (this.attributeId!= null) {
                products.put("attributeId", this.attributeId.init());
            }
            if (this.indexRange!= null) {
                products.put("indexRange", this.indexRange.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> typeDefinitionId() {
            return ((this.typeDefinitionId == null)?this.typeDefinitionId = new com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>>(this._root, this, "typeDefinitionId"):this.typeDefinitionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> browsePath() {
            return ((this.browsePath == null)?this.browsePath = new com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>>(this._root, this, "browsePath"):this.browsePath);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, SimpleAttributeOperand.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

    }

}
