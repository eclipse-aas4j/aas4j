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
 * <p>Java-Klasse für HistoryReadValueId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryReadValueId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataEncoding" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="ContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryReadValueId", propOrder = {
    "nodeId",
    "indexRange",
    "dataEncoding",
    "continuationPoint"
})
public class HistoryReadValueId {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;
    @XmlElementRef(name = "DataEncoding", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> dataEncoding;
    @XmlElementRef(name = "ContinuationPoint", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> continuationPoint;

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
     * Ruft den Wert der dataEncoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getDataEncoding() {
        return dataEncoding;
    }

    /**
     * Legt den Wert der dataEncoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setDataEncoding(JAXBElement<QualifiedName> value) {
        this.dataEncoding = value;
    }

    /**
     * Ruft den Wert der continuationPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContinuationPoint() {
        return continuationPoint;
    }

    /**
     * Legt den Wert der continuationPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContinuationPoint(JAXBElement<byte[]> value) {
        this.continuationPoint = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryReadValueId.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.indexRange = this.indexRange;
        _other.dataEncoding = this.dataEncoding;
        _other.continuationPoint = this.continuationPoint;
    }

    public<_B >HistoryReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryReadValueId.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryReadValueId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryReadValueId.Builder<Void> builder() {
        return new HistoryReadValueId.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryReadValueId.Builder<_B> copyOf(final HistoryReadValueId _other) {
        final HistoryReadValueId.Builder<_B> _newBuilder = new HistoryReadValueId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryReadValueId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
            _other.indexRange = this.indexRange;
        }
        final PropertyTree dataEncodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataEncoding"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataEncodingPropertyTree!= null):((dataEncodingPropertyTree == null)||(!dataEncodingPropertyTree.isLeaf())))) {
            _other.dataEncoding = this.dataEncoding;
        }
        final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
            _other.continuationPoint = this.continuationPoint;
        }
    }

    public<_B >HistoryReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryReadValueId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryReadValueId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryReadValueId.Builder<_B> copyOf(final HistoryReadValueId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryReadValueId.Builder<_B> _newBuilder = new HistoryReadValueId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryReadValueId.Builder<Void> copyExcept(final HistoryReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryReadValueId.Builder<Void> copyOnly(final HistoryReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryReadValueId _storedValue;
        private JAXBElement<NodeId> nodeId;
        private JAXBElement<String> indexRange;
        private JAXBElement<QualifiedName> dataEncoding;
        private JAXBElement<byte[]> continuationPoint;

        public Builder(final _B _parentBuilder, final HistoryReadValueId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.indexRange = _other.indexRange;
                    this.dataEncoding = _other.dataEncoding;
                    this.continuationPoint = _other.continuationPoint;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryReadValueId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
                        this.indexRange = _other.indexRange;
                    }
                    final PropertyTree dataEncodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataEncoding"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataEncodingPropertyTree!= null):((dataEncodingPropertyTree == null)||(!dataEncodingPropertyTree.isLeaf())))) {
                        this.dataEncoding = _other.dataEncoding;
                    }
                    final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
                        this.continuationPoint = _other.continuationPoint;
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

        protected<_P extends HistoryReadValueId >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.indexRange = this.indexRange;
            _product.dataEncoding = this.dataEncoding;
            _product.continuationPoint = this.continuationPoint;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public HistoryReadValueId.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "indexRange" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param indexRange
         *     Neuer Wert der Eigenschaft "indexRange".
         */
        public HistoryReadValueId.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataEncoding" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataEncoding
         *     Neuer Wert der Eigenschaft "dataEncoding".
         */
        public HistoryReadValueId.Builder<_B> withDataEncoding(final JAXBElement<QualifiedName> dataEncoding) {
            this.dataEncoding = dataEncoding;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "continuationPoint" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param continuationPoint
         *     Neuer Wert der Eigenschaft "continuationPoint".
         */
        public HistoryReadValueId.Builder<_B> withContinuationPoint(final JAXBElement<byte[]> continuationPoint) {
            this.continuationPoint = continuationPoint;
            return this;
        }

        @Override
        public HistoryReadValueId build() {
            if (_storedValue == null) {
                return this.init(new HistoryReadValueId());
            } else {
                return ((HistoryReadValueId) _storedValue);
            }
        }

        public HistoryReadValueId.Builder<_B> copyOf(final HistoryReadValueId _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryReadValueId.Builder<_B> copyOf(final HistoryReadValueId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryReadValueId.Selector<HistoryReadValueId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryReadValueId.Select _root() {
            return new HistoryReadValueId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> indexRange = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> dataEncoding = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> continuationPoint = null;

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
            if (this.indexRange!= null) {
                products.put("indexRange", this.indexRange.init());
            }
            if (this.dataEncoding!= null) {
                products.put("dataEncoding", this.dataEncoding.init());
            }
            if (this.continuationPoint!= null) {
                products.put("continuationPoint", this.continuationPoint.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> dataEncoding() {
            return ((this.dataEncoding == null)?this.dataEncoding = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>>(this._root, this, "dataEncoding"):this.dataEncoding);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>> continuationPoint() {
            return ((this.continuationPoint == null)?this.continuationPoint = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadValueId.Selector<TRoot, TParent>>(this._root, this, "continuationPoint"):this.continuationPoint);
        }

    }

}
