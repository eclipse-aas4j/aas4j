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
 * <p>Java-Klasse für DeleteReferencesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteReferencesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="DeleteBidirectional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteReferencesItem", propOrder = {
    "sourceNodeId",
    "referenceTypeId",
    "isForward",
    "targetNodeId",
    "deleteBidirectional"
})
public class DeleteReferencesItem {

    @XmlElementRef(name = "SourceNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sourceNodeId;
    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsForward")
    protected Boolean isForward;
    @XmlElementRef(name = "TargetNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> targetNodeId;
    @XmlElement(name = "DeleteBidirectional")
    protected Boolean deleteBidirectional;

    /**
     * Ruft den Wert der sourceNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getSourceNodeId() {
        return sourceNodeId;
    }

    /**
     * Legt den Wert der sourceNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setSourceNodeId(JAXBElement<NodeId> value) {
        this.sourceNodeId = value;
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
     * Ruft den Wert der targetNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTargetNodeId() {
        return targetNodeId;
    }

    /**
     * Legt den Wert der targetNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTargetNodeId(JAXBElement<ExpandedNodeId> value) {
        this.targetNodeId = value;
    }

    /**
     * Ruft den Wert der deleteBidirectional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteBidirectional() {
        return deleteBidirectional;
    }

    /**
     * Legt den Wert der deleteBidirectional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteBidirectional(Boolean value) {
        this.deleteBidirectional = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DeleteReferencesItem.Builder<_B> _other) {
        _other.sourceNodeId = this.sourceNodeId;
        _other.referenceTypeId = this.referenceTypeId;
        _other.isForward = this.isForward;
        _other.targetNodeId = this.targetNodeId;
        _other.deleteBidirectional = this.deleteBidirectional;
    }

    public<_B >DeleteReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DeleteReferencesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public DeleteReferencesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DeleteReferencesItem.Builder<Void> builder() {
        return new DeleteReferencesItem.Builder<Void>(null, null, false);
    }

    public static<_B >DeleteReferencesItem.Builder<_B> copyOf(final DeleteReferencesItem _other) {
        final DeleteReferencesItem.Builder<_B> _newBuilder = new DeleteReferencesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DeleteReferencesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sourceNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourceNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourceNodeIdPropertyTree!= null):((sourceNodeIdPropertyTree == null)||(!sourceNodeIdPropertyTree.isLeaf())))) {
            _other.sourceNodeId = this.sourceNodeId;
        }
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
            _other.isForward = this.isForward;
        }
        final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
            _other.targetNodeId = this.targetNodeId;
        }
        final PropertyTree deleteBidirectionalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteBidirectional"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteBidirectionalPropertyTree!= null):((deleteBidirectionalPropertyTree == null)||(!deleteBidirectionalPropertyTree.isLeaf())))) {
            _other.deleteBidirectional = this.deleteBidirectional;
        }
    }

    public<_B >DeleteReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DeleteReferencesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DeleteReferencesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DeleteReferencesItem.Builder<_B> copyOf(final DeleteReferencesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteReferencesItem.Builder<_B> _newBuilder = new DeleteReferencesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DeleteReferencesItem.Builder<Void> copyExcept(final DeleteReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteReferencesItem.Builder<Void> copyOnly(final DeleteReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DeleteReferencesItem _storedValue;
        private JAXBElement<NodeId> sourceNodeId;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isForward;
        private JAXBElement<ExpandedNodeId> targetNodeId;
        private Boolean deleteBidirectional;

        public Builder(final _B _parentBuilder, final DeleteReferencesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sourceNodeId = _other.sourceNodeId;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isForward = _other.isForward;
                    this.targetNodeId = _other.targetNodeId;
                    this.deleteBidirectional = _other.deleteBidirectional;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DeleteReferencesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sourceNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourceNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourceNodeIdPropertyTree!= null):((sourceNodeIdPropertyTree == null)||(!sourceNodeIdPropertyTree.isLeaf())))) {
                        this.sourceNodeId = _other.sourceNodeId;
                    }
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
                        this.isForward = _other.isForward;
                    }
                    final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
                        this.targetNodeId = _other.targetNodeId;
                    }
                    final PropertyTree deleteBidirectionalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteBidirectional"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteBidirectionalPropertyTree!= null):((deleteBidirectionalPropertyTree == null)||(!deleteBidirectionalPropertyTree.isLeaf())))) {
                        this.deleteBidirectional = _other.deleteBidirectional;
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

        protected<_P extends DeleteReferencesItem >_P init(final _P _product) {
            _product.sourceNodeId = this.sourceNodeId;
            _product.referenceTypeId = this.referenceTypeId;
            _product.isForward = this.isForward;
            _product.targetNodeId = this.targetNodeId;
            _product.deleteBidirectional = this.deleteBidirectional;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sourceNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sourceNodeId
         *     Neuer Wert der Eigenschaft "sourceNodeId".
         */
        public DeleteReferencesItem.Builder<_B> withSourceNodeId(final JAXBElement<NodeId> sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public DeleteReferencesItem.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
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
        public DeleteReferencesItem.Builder<_B> withIsForward(final Boolean isForward) {
            this.isForward = isForward;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetNodeId
         *     Neuer Wert der Eigenschaft "targetNodeId".
         */
        public DeleteReferencesItem.Builder<_B> withTargetNodeId(final JAXBElement<ExpandedNodeId> targetNodeId) {
            this.targetNodeId = targetNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteBidirectional" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param deleteBidirectional
         *     Neuer Wert der Eigenschaft "deleteBidirectional".
         */
        public DeleteReferencesItem.Builder<_B> withDeleteBidirectional(final Boolean deleteBidirectional) {
            this.deleteBidirectional = deleteBidirectional;
            return this;
        }

        @Override
        public DeleteReferencesItem build() {
            if (_storedValue == null) {
                return this.init(new DeleteReferencesItem());
            } else {
                return ((DeleteReferencesItem) _storedValue);
            }
        }

        public DeleteReferencesItem.Builder<_B> copyOf(final DeleteReferencesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public DeleteReferencesItem.Builder<_B> copyOf(final DeleteReferencesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DeleteReferencesItem.Selector<DeleteReferencesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DeleteReferencesItem.Select _root() {
            return new DeleteReferencesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> sourceNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> isForward = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> targetNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> deleteBidirectional = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sourceNodeId!= null) {
                products.put("sourceNodeId", this.sourceNodeId.init());
            }
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.isForward!= null) {
                products.put("isForward", this.isForward.init());
            }
            if (this.targetNodeId!= null) {
                products.put("targetNodeId", this.targetNodeId.init());
            }
            if (this.deleteBidirectional!= null) {
                products.put("deleteBidirectional", this.deleteBidirectional.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> sourceNodeId() {
            return ((this.sourceNodeId == null)?this.sourceNodeId = new com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "sourceNodeId"):this.sourceNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> isForward() {
            return ((this.isForward == null)?this.isForward = new com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "isForward"):this.isForward);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> targetNodeId() {
            return ((this.targetNodeId == null)?this.targetNodeId = new com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "targetNodeId"):this.targetNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>> deleteBidirectional() {
            return ((this.deleteBidirectional == null)?this.deleteBidirectional = new com.kscs.util.jaxb.Selector<TRoot, DeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "deleteBidirectional"):this.deleteBidirectional);
        }

    }

}
