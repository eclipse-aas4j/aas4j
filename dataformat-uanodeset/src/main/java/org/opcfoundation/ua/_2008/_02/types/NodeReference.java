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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für NodeReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedNodeIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeReference", propOrder = {
    "nodeId",
    "referenceTypeId",
    "isForward",
    "referencedNodeIds"
})
public class NodeReference {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsForward")
    protected Boolean isForward;
    @XmlElementRef(name = "ReferencedNodeIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfNodeId> referencedNodeIds;

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
     * Ruft den Wert der referenceTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getReferenceTypeId() {
        return referenceTypeId;
    }

    /**
     * Legt den Wert der referenceTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setReferenceTypeId(JAXBElement<NodeId> value) {
        this.referenceTypeId = value;
    }

    /**
     * Ruft den Wert der isForward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForward() {
        return isForward;
    }

    /**
     * Legt den Wert der isForward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForward(Boolean value) {
        this.isForward = value;
    }

    /**
     * Ruft den Wert der referencedNodeIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public JAXBElement<ListOfNodeId> getReferencedNodeIds() {
        return referencedNodeIds;
    }

    /**
     * Legt den Wert der referencedNodeIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfNodeId }{@code >}
     *     
     */
    public void setReferencedNodeIds(JAXBElement<ListOfNodeId> value) {
        this.referencedNodeIds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NodeReference.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.referenceTypeId = this.referenceTypeId;
        _other.isForward = this.isForward;
        _other.referencedNodeIds = this.referencedNodeIds;
    }

    public<_B >NodeReference.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NodeReference.Builder<_B>(_parentBuilder, this, true);
    }

    public NodeReference.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NodeReference.Builder<Void> builder() {
        return new NodeReference.Builder<Void>(null, null, false);
    }

    public static<_B >NodeReference.Builder<_B> copyOf(final NodeReference _other) {
        final NodeReference.Builder<_B> _newBuilder = new NodeReference.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NodeReference.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
            _other.isForward = this.isForward;
        }
        final PropertyTree referencedNodeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencedNodeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencedNodeIdsPropertyTree!= null):((referencedNodeIdsPropertyTree == null)||(!referencedNodeIdsPropertyTree.isLeaf())))) {
            _other.referencedNodeIds = this.referencedNodeIds;
        }
    }

    public<_B >NodeReference.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NodeReference.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NodeReference.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NodeReference.Builder<_B> copyOf(final NodeReference _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NodeReference.Builder<_B> _newBuilder = new NodeReference.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NodeReference.Builder<Void> copyExcept(final NodeReference _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NodeReference.Builder<Void> copyOnly(final NodeReference _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NodeReference _storedValue;
        private JAXBElement<NodeId> nodeId;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isForward;
        private JAXBElement<ListOfNodeId> referencedNodeIds;

        public Builder(final _B _parentBuilder, final NodeReference _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isForward = _other.isForward;
                    this.referencedNodeIds = _other.referencedNodeIds;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NodeReference _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
                        this.isForward = _other.isForward;
                    }
                    final PropertyTree referencedNodeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencedNodeIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencedNodeIdsPropertyTree!= null):((referencedNodeIdsPropertyTree == null)||(!referencedNodeIdsPropertyTree.isLeaf())))) {
                        this.referencedNodeIds = _other.referencedNodeIds;
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

        protected<_P extends NodeReference >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.referenceTypeId = this.referenceTypeId;
            _product.isForward = this.isForward;
            _product.referencedNodeIds = this.referencedNodeIds;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public NodeReference.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public NodeReference.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
            this.referenceTypeId = referenceTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isForward" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isForward
         *     Neuer Wert der Eigenschaft "isForward".
         */
        public NodeReference.Builder<_B> withIsForward(final Boolean isForward) {
            this.isForward = isForward;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referencedNodeIds" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param referencedNodeIds
         *     Neuer Wert der Eigenschaft "referencedNodeIds".
         */
        public NodeReference.Builder<_B> withReferencedNodeIds(final JAXBElement<ListOfNodeId> referencedNodeIds) {
            this.referencedNodeIds = referencedNodeIds;
            return this;
        }

        @Override
        public NodeReference build() {
            if (_storedValue == null) {
                return this.init(new NodeReference());
            } else {
                return ((NodeReference) _storedValue);
            }
        }

        public NodeReference.Builder<_B> copyOf(final NodeReference _other) {
            _other.copyTo(this);
            return this;
        }

        public NodeReference.Builder<_B> copyOf(final NodeReference.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NodeReference.Selector<NodeReference.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NodeReference.Select _root() {
            return new NodeReference.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> isForward = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> referencedNodeIds = null;

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
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.isForward!= null) {
                products.put("isForward", this.isForward.init());
            }
            if (this.referencedNodeIds!= null) {
                products.put("referencedNodeIds", this.referencedNodeIds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> isForward() {
            return ((this.isForward == null)?this.isForward = new com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>>(this._root, this, "isForward"):this.isForward);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>> referencedNodeIds() {
            return ((this.referencedNodeIds == null)?this.referencedNodeIds = new com.kscs.util.jaxb.Selector<TRoot, NodeReference.Selector<TRoot, TParent>>(this._root, this, "referencedNodeIds"):this.referencedNodeIds);
        }

    }

}
