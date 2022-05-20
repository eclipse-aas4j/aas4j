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
 * <p>Java-Klasse für AttributeOperand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttributeOperand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}FilterOperand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrowsePath" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RelativePath" minOccurs="0"/&gt;
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
@XmlType(name = "AttributeOperand", propOrder = {
    "nodeId",
    "alias",
    "browsePath",
    "attributeId",
    "indexRange"
})
public class AttributeOperand
    extends FilterOperand
{

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElementRef(name = "Alias", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alias;
    @XmlElementRef(name = "BrowsePath", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RelativePath> browsePath;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;

    /**
     * Ruft den Wert der nodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getNodeId() {
        return nodeId;
    }

    /**
     * Legt den Wert der nodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setNodeId(JAXBElement<NodeId> value) {
        this.nodeId = value;
    }

    /**
     * Ruft den Wert der alias-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlias() {
        return alias;
    }

    /**
     * Legt den Wert der alias-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlias(JAXBElement<String> value) {
        this.alias = value;
    }

    /**
     * Ruft den Wert der browsePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public JAXBElement<RelativePath> getBrowsePath() {
        return browsePath;
    }

    /**
     * Legt den Wert der browsePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public void setBrowsePath(JAXBElement<RelativePath> value) {
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
    public<_B >void copyTo(final AttributeOperand.Builder<_B> _other) {
        super.copyTo(_other);
        _other.nodeId = this.nodeId;
        _other.alias = this.alias;
        _other.browsePath = this.browsePath;
        _other.attributeId = this.attributeId;
        _other.indexRange = this.indexRange;
    }

    @Override
    public<_B >AttributeOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AttributeOperand.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public AttributeOperand.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AttributeOperand.Builder<Void> builder() {
        return new AttributeOperand.Builder<Void>(null, null, false);
    }

    public static<_B >AttributeOperand.Builder<_B> copyOf(final FilterOperand _other) {
        final AttributeOperand.Builder<_B> _newBuilder = new AttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >AttributeOperand.Builder<_B> copyOf(final AttributeOperand _other) {
        final AttributeOperand.Builder<_B> _newBuilder = new AttributeOperand.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AttributeOperand.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree aliasPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("alias"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasPropertyTree!= null):((aliasPropertyTree == null)||(!aliasPropertyTree.isLeaf())))) {
            _other.alias = this.alias;
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
    public<_B >AttributeOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AttributeOperand.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public AttributeOperand.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AttributeOperand.Builder<_B> copyOf(final FilterOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AttributeOperand.Builder<_B> _newBuilder = new AttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >AttributeOperand.Builder<_B> copyOf(final AttributeOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AttributeOperand.Builder<_B> _newBuilder = new AttributeOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AttributeOperand.Builder<Void> copyExcept(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AttributeOperand.Builder<Void> copyExcept(final AttributeOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AttributeOperand.Builder<Void> copyOnly(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static AttributeOperand.Builder<Void> copyOnly(final AttributeOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends FilterOperand.Builder<_B>
        implements Buildable
    {

        private JAXBElement<NodeId> nodeId;
        private JAXBElement<String> alias;
        private JAXBElement<RelativePath> browsePath;
        private Long attributeId;
        private JAXBElement<String> indexRange;

        public Builder(final _B _parentBuilder, final AttributeOperand _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.nodeId = _other.nodeId;
                this.alias = _other.alias;
                this.browsePath = _other.browsePath;
                this.attributeId = _other.attributeId;
                this.indexRange = _other.indexRange;
            }
        }

        public Builder(final _B _parentBuilder, final AttributeOperand _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                    this.nodeId = _other.nodeId;
                }
                final PropertyTree aliasPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("alias"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasPropertyTree!= null):((aliasPropertyTree == null)||(!aliasPropertyTree.isLeaf())))) {
                    this.alias = _other.alias;
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

        protected<_P extends AttributeOperand >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.alias = this.alias;
            _product.browsePath = this.browsePath;
            _product.attributeId = this.attributeId;
            _product.indexRange = this.indexRange;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public AttributeOperand.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "alias" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param alias
         *     Neuer Wert der Eigenschaft "alias".
         */
        public AttributeOperand.Builder<_B> withAlias(final JAXBElement<String> alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePath" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browsePath
         *     Neuer Wert der Eigenschaft "browsePath".
         */
        public AttributeOperand.Builder<_B> withBrowsePath(final JAXBElement<RelativePath> browsePath) {
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
        public AttributeOperand.Builder<_B> withAttributeId(final Long attributeId) {
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
        public AttributeOperand.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        @Override
        public AttributeOperand build() {
            if (_storedValue == null) {
                return this.init(new AttributeOperand());
            } else {
                return ((AttributeOperand) _storedValue);
            }
        }

        public AttributeOperand.Builder<_B> copyOf(final AttributeOperand _other) {
            _other.copyTo(this);
            return this;
        }

        public AttributeOperand.Builder<_B> copyOf(final AttributeOperand.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AttributeOperand.Selector<AttributeOperand.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AttributeOperand.Select _root() {
            return new AttributeOperand.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends FilterOperand.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> alias = null;
        private com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> browsePath = null;
        private com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> indexRange = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeId!= null) {
                products.put("nodeId", this.nodeId.init());
            }
            if (this.alias!= null) {
                products.put("alias", this.alias.init());
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

        public com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> alias() {
            return ((this.alias == null)?this.alias = new com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>>(this._root, this, "alias"):this.alias);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> browsePath() {
            return ((this.browsePath == null)?this.browsePath = new com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>>(this._root, this, "browsePath"):this.browsePath);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, AttributeOperand.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

    }

}
