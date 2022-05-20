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
 * <p>Java-Klasse für WriteValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WriteValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteValue", propOrder = {
    "nodeId",
    "attributeId",
    "indexRange",
    "value"
})
public class WriteValue {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;
    @XmlElementRef(name = "Value", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DataValue> value;

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
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataValue }{@code >}
     *     
     */
    public JAXBElement<DataValue> getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataValue }{@code >}
     *     
     */
    public void setValue(JAXBElement<DataValue> value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final WriteValue.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.attributeId = this.attributeId;
        _other.indexRange = this.indexRange;
        _other.value = this.value;
    }

    public<_B >WriteValue.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new WriteValue.Builder<_B>(_parentBuilder, this, true);
    }

    public WriteValue.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static WriteValue.Builder<Void> builder() {
        return new WriteValue.Builder<Void>(null, null, false);
    }

    public static<_B >WriteValue.Builder<_B> copyOf(final WriteValue _other) {
        final WriteValue.Builder<_B> _newBuilder = new WriteValue.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final WriteValue.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
            _other.attributeId = this.attributeId;
        }
        final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
            _other.indexRange = this.indexRange;
        }
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
    }

    public<_B >WriteValue.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new WriteValue.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public WriteValue.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >WriteValue.Builder<_B> copyOf(final WriteValue _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final WriteValue.Builder<_B> _newBuilder = new WriteValue.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static WriteValue.Builder<Void> copyExcept(final WriteValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static WriteValue.Builder<Void> copyOnly(final WriteValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final WriteValue _storedValue;
        private JAXBElement<NodeId> nodeId;
        private Long attributeId;
        private JAXBElement<String> indexRange;
        private JAXBElement<DataValue> value;

        public Builder(final _B _parentBuilder, final WriteValue _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.attributeId = _other.attributeId;
                    this.indexRange = _other.indexRange;
                    this.value = _other.value;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final WriteValue _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
                        this.attributeId = _other.attributeId;
                    }
                    final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
                        this.indexRange = _other.indexRange;
                    }
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = _other.value;
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

        protected<_P extends WriteValue >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.attributeId = this.attributeId;
            _product.indexRange = this.indexRange;
            _product.value = this.value;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public WriteValue.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeId
         *     Neuer Wert der Eigenschaft "attributeId".
         */
        public WriteValue.Builder<_B> withAttributeId(final Long attributeId) {
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
        public WriteValue.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public WriteValue.Builder<_B> withValue(final JAXBElement<DataValue> value) {
            this.value = value;
            return this;
        }

        @Override
        public WriteValue build() {
            if (_storedValue == null) {
                return this.init(new WriteValue());
            } else {
                return ((WriteValue) _storedValue);
            }
        }

        public WriteValue.Builder<_B> copyOf(final WriteValue _other) {
            _other.copyTo(this);
            return this;
        }

        public WriteValue.Builder<_B> copyOf(final WriteValue.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends WriteValue.Selector<WriteValue.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static WriteValue.Select _root() {
            return new WriteValue.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> indexRange = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> value = null;

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
            if (this.attributeId!= null) {
                products.put("attributeId", this.attributeId.init());
            }
            if (this.indexRange!= null) {
                products.put("indexRange", this.indexRange.init());
            }
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, WriteValue.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
