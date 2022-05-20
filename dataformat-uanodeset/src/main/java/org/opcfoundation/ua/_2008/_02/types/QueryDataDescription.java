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
 * <p>Java-Klasse für QueryDataDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryDataDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelativePath" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RelativePath" minOccurs="0"/&gt;
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDataDescription", propOrder = {
    "relativePath",
    "attributeId",
    "indexRange"
})
public class QueryDataDescription {

    @XmlElementRef(name = "RelativePath", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RelativePath> relativePath;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;

    /**
     * Ruft den Wert der relativePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public JAXBElement<RelativePath> getRelativePath() {
        return relativePath;
    }

    /**
     * Legt den Wert der relativePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public void setRelativePath(JAXBElement<RelativePath> value) {
        this.relativePath = value;
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
    public<_B >void copyTo(final QueryDataDescription.Builder<_B> _other) {
        _other.relativePath = this.relativePath;
        _other.attributeId = this.attributeId;
        _other.indexRange = this.indexRange;
    }

    public<_B >QueryDataDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryDataDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryDataDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryDataDescription.Builder<Void> builder() {
        return new QueryDataDescription.Builder<Void>(null, null, false);
    }

    public static<_B >QueryDataDescription.Builder<_B> copyOf(final QueryDataDescription _other) {
        final QueryDataDescription.Builder<_B> _newBuilder = new QueryDataDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryDataDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree relativePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePath"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathPropertyTree!= null):((relativePathPropertyTree == null)||(!relativePathPropertyTree.isLeaf())))) {
            _other.relativePath = this.relativePath;
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

    public<_B >QueryDataDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryDataDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryDataDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryDataDescription.Builder<_B> copyOf(final QueryDataDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryDataDescription.Builder<_B> _newBuilder = new QueryDataDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryDataDescription.Builder<Void> copyExcept(final QueryDataDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryDataDescription.Builder<Void> copyOnly(final QueryDataDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryDataDescription _storedValue;
        private JAXBElement<RelativePath> relativePath;
        private Long attributeId;
        private JAXBElement<String> indexRange;

        public Builder(final _B _parentBuilder, final QueryDataDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.relativePath = _other.relativePath;
                    this.attributeId = _other.attributeId;
                    this.indexRange = _other.indexRange;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryDataDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree relativePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePath"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathPropertyTree!= null):((relativePathPropertyTree == null)||(!relativePathPropertyTree.isLeaf())))) {
                        this.relativePath = _other.relativePath;
                    }
                    final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
                        this.attributeId = _other.attributeId;
                    }
                    final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
                        this.indexRange = _other.indexRange;
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

        protected<_P extends QueryDataDescription >_P init(final _P _product) {
            _product.relativePath = this.relativePath;
            _product.attributeId = this.attributeId;
            _product.indexRange = this.indexRange;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "relativePath" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param relativePath
         *     Neuer Wert der Eigenschaft "relativePath".
         */
        public QueryDataDescription.Builder<_B> withRelativePath(final JAXBElement<RelativePath> relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeId
         *     Neuer Wert der Eigenschaft "attributeId".
         */
        public QueryDataDescription.Builder<_B> withAttributeId(final Long attributeId) {
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
        public QueryDataDescription.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        @Override
        public QueryDataDescription build() {
            if (_storedValue == null) {
                return this.init(new QueryDataDescription());
            } else {
                return ((QueryDataDescription) _storedValue);
            }
        }

        public QueryDataDescription.Builder<_B> copyOf(final QueryDataDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryDataDescription.Builder<_B> copyOf(final QueryDataDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryDataDescription.Selector<QueryDataDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryDataDescription.Select _root() {
            return new QueryDataDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> relativePath = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> indexRange = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.relativePath!= null) {
                products.put("relativePath", this.relativePath.init());
            }
            if (this.attributeId!= null) {
                products.put("attributeId", this.attributeId.init());
            }
            if (this.indexRange!= null) {
                products.put("indexRange", this.indexRange.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> relativePath() {
            return ((this.relativePath == null)?this.relativePath = new com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>>(this._root, this, "relativePath"):this.relativePath);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, QueryDataDescription.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

    }

}
