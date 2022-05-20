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
 * <p>Java-Klasse für QueryDataSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryDataSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="TypeDefinitionNode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="Values" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDataSet", propOrder = {
    "nodeId",
    "typeDefinitionNode",
    "values"
})
public class QueryDataSet {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> nodeId;
    @XmlElementRef(name = "TypeDefinitionNode", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> typeDefinitionNode;
    @XmlElementRef(name = "Values", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> values;

    /**
     * Ruft den Wert der nodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getNodeId() {
        return nodeId;
    }

    /**
     * Legt den Wert der nodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setNodeId(JAXBElement<ExpandedNodeId> value) {
        this.nodeId = value;
    }

    /**
     * Ruft den Wert der typeDefinitionNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTypeDefinitionNode() {
        return typeDefinitionNode;
    }

    /**
     * Legt den Wert der typeDefinitionNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTypeDefinitionNode(JAXBElement<ExpandedNodeId> value) {
        this.typeDefinitionNode = value;
    }

    /**
     * Ruft den Wert der values-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getValues() {
        return values;
    }

    /**
     * Legt den Wert der values-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setValues(JAXBElement<ListOfVariant> value) {
        this.values = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QueryDataSet.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.typeDefinitionNode = this.typeDefinitionNode;
        _other.values = this.values;
    }

    public<_B >QueryDataSet.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryDataSet.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryDataSet.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryDataSet.Builder<Void> builder() {
        return new QueryDataSet.Builder<Void>(null, null, false);
    }

    public static<_B >QueryDataSet.Builder<_B> copyOf(final QueryDataSet _other) {
        final QueryDataSet.Builder<_B> _newBuilder = new QueryDataSet.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryDataSet.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree typeDefinitionNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionNodePropertyTree!= null):((typeDefinitionNodePropertyTree == null)||(!typeDefinitionNodePropertyTree.isLeaf())))) {
            _other.typeDefinitionNode = this.typeDefinitionNode;
        }
        final PropertyTree valuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("values"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuesPropertyTree!= null):((valuesPropertyTree == null)||(!valuesPropertyTree.isLeaf())))) {
            _other.values = this.values;
        }
    }

    public<_B >QueryDataSet.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryDataSet.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryDataSet.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryDataSet.Builder<_B> copyOf(final QueryDataSet _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryDataSet.Builder<_B> _newBuilder = new QueryDataSet.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryDataSet.Builder<Void> copyExcept(final QueryDataSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryDataSet.Builder<Void> copyOnly(final QueryDataSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryDataSet _storedValue;
        private JAXBElement<ExpandedNodeId> nodeId;
        private JAXBElement<ExpandedNodeId> typeDefinitionNode;
        private JAXBElement<ListOfVariant> values;

        public Builder(final _B _parentBuilder, final QueryDataSet _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.typeDefinitionNode = _other.typeDefinitionNode;
                    this.values = _other.values;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryDataSet _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree typeDefinitionNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionNode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionNodePropertyTree!= null):((typeDefinitionNodePropertyTree == null)||(!typeDefinitionNodePropertyTree.isLeaf())))) {
                        this.typeDefinitionNode = _other.typeDefinitionNode;
                    }
                    final PropertyTree valuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("values"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuesPropertyTree!= null):((valuesPropertyTree == null)||(!valuesPropertyTree.isLeaf())))) {
                        this.values = _other.values;
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

        protected<_P extends QueryDataSet >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.typeDefinitionNode = this.typeDefinitionNode;
            _product.values = this.values;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public QueryDataSet.Builder<_B> withNodeId(final JAXBElement<ExpandedNodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeDefinitionNode" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param typeDefinitionNode
         *     Neuer Wert der Eigenschaft "typeDefinitionNode".
         */
        public QueryDataSet.Builder<_B> withTypeDefinitionNode(final JAXBElement<ExpandedNodeId> typeDefinitionNode) {
            this.typeDefinitionNode = typeDefinitionNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "values" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param values
         *     Neuer Wert der Eigenschaft "values".
         */
        public QueryDataSet.Builder<_B> withValues(final JAXBElement<ListOfVariant> values) {
            this.values = values;
            return this;
        }

        @Override
        public QueryDataSet build() {
            if (_storedValue == null) {
                return this.init(new QueryDataSet());
            } else {
                return ((QueryDataSet) _storedValue);
            }
        }

        public QueryDataSet.Builder<_B> copyOf(final QueryDataSet _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryDataSet.Builder<_B> copyOf(final QueryDataSet.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryDataSet.Selector<QueryDataSet.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryDataSet.Select _root() {
            return new QueryDataSet.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> typeDefinitionNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> values = null;

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
            if (this.typeDefinitionNode!= null) {
                products.put("typeDefinitionNode", this.typeDefinitionNode.init());
            }
            if (this.values!= null) {
                products.put("values", this.values.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> typeDefinitionNode() {
            return ((this.typeDefinitionNode == null)?this.typeDefinitionNode = new com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>>(this._root, this, "typeDefinitionNode"):this.typeDefinitionNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>> values() {
            return ((this.values == null)?this.values = new com.kscs.util.jaxb.Selector<TRoot, QueryDataSet.Selector<TRoot, TParent>>(this._root, this, "values"):this.values);
        }

    }

}
