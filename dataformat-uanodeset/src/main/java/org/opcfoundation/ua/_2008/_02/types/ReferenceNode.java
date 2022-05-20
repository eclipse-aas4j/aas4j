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
 * <p>Java-Klasse für ReferenceNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReferenceNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsInverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceNode", propOrder = {
    "referenceTypeId",
    "isInverse",
    "targetId"
})
public class ReferenceNode {

    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsInverse")
    protected Boolean isInverse;
    @XmlElementRef(name = "TargetId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> targetId;

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
     * Ruft den Wert der isInverse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInverse() {
        return isInverse;
    }

    /**
     * Legt den Wert der isInverse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInverse(Boolean value) {
        this.isInverse = value;
    }

    /**
     * Ruft den Wert der targetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTargetId() {
        return targetId;
    }

    /**
     * Legt den Wert der targetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTargetId(JAXBElement<ExpandedNodeId> value) {
        this.targetId = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReferenceNode.Builder<_B> _other) {
        _other.referenceTypeId = this.referenceTypeId;
        _other.isInverse = this.isInverse;
        _other.targetId = this.targetId;
    }

    public<_B >ReferenceNode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReferenceNode.Builder<_B>(_parentBuilder, this, true);
    }

    public ReferenceNode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReferenceNode.Builder<Void> builder() {
        return new ReferenceNode.Builder<Void>(null, null, false);
    }

    public static<_B >ReferenceNode.Builder<_B> copyOf(final ReferenceNode _other) {
        final ReferenceNode.Builder<_B> _newBuilder = new ReferenceNode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReferenceNode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree isInversePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isInverse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isInversePropertyTree!= null):((isInversePropertyTree == null)||(!isInversePropertyTree.isLeaf())))) {
            _other.isInverse = this.isInverse;
        }
        final PropertyTree targetIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetIdPropertyTree!= null):((targetIdPropertyTree == null)||(!targetIdPropertyTree.isLeaf())))) {
            _other.targetId = this.targetId;
        }
    }

    public<_B >ReferenceNode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReferenceNode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ReferenceNode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReferenceNode.Builder<_B> copyOf(final ReferenceNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReferenceNode.Builder<_B> _newBuilder = new ReferenceNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReferenceNode.Builder<Void> copyExcept(final ReferenceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReferenceNode.Builder<Void> copyOnly(final ReferenceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ReferenceNode _storedValue;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isInverse;
        private JAXBElement<ExpandedNodeId> targetId;

        public Builder(final _B _parentBuilder, final ReferenceNode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isInverse = _other.isInverse;
                    this.targetId = _other.targetId;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ReferenceNode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree isInversePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isInverse"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isInversePropertyTree!= null):((isInversePropertyTree == null)||(!isInversePropertyTree.isLeaf())))) {
                        this.isInverse = _other.isInverse;
                    }
                    final PropertyTree targetIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetIdPropertyTree!= null):((targetIdPropertyTree == null)||(!targetIdPropertyTree.isLeaf())))) {
                        this.targetId = _other.targetId;
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

        protected<_P extends ReferenceNode >_P init(final _P _product) {
            _product.referenceTypeId = this.referenceTypeId;
            _product.isInverse = this.isInverse;
            _product.targetId = this.targetId;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public ReferenceNode.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
            this.referenceTypeId = referenceTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isInverse" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isInverse
         *     Neuer Wert der Eigenschaft "isInverse".
         */
        public ReferenceNode.Builder<_B> withIsInverse(final Boolean isInverse) {
            this.isInverse = isInverse;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param targetId
         *     Neuer Wert der Eigenschaft "targetId".
         */
        public ReferenceNode.Builder<_B> withTargetId(final JAXBElement<ExpandedNodeId> targetId) {
            this.targetId = targetId;
            return this;
        }

        @Override
        public ReferenceNode build() {
            if (_storedValue == null) {
                return this.init(new ReferenceNode());
            } else {
                return ((ReferenceNode) _storedValue);
            }
        }

        public ReferenceNode.Builder<_B> copyOf(final ReferenceNode _other) {
            _other.copyTo(this);
            return this;
        }

        public ReferenceNode.Builder<_B> copyOf(final ReferenceNode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReferenceNode.Selector<ReferenceNode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReferenceNode.Select _root() {
            return new ReferenceNode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> isInverse = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> targetId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.isInverse!= null) {
                products.put("isInverse", this.isInverse.init());
            }
            if (this.targetId!= null) {
                products.put("targetId", this.targetId.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> isInverse() {
            return ((this.isInverse == null)?this.isInverse = new com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>>(this._root, this, "isInverse"):this.isInverse);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>> targetId() {
            return ((this.targetId == null)?this.targetId = new com.kscs.util.jaxb.Selector<TRoot, ReferenceNode.Selector<TRoot, TParent>>(this._root, this, "targetId"):this.targetId);
        }

    }

}
