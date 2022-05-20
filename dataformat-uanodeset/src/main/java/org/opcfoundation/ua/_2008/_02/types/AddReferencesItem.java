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
 * <p>Java-Klasse für AddReferencesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddReferencesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="TargetNodeClass" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeClass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddReferencesItem", propOrder = {
    "sourceNodeId",
    "referenceTypeId",
    "isForward",
    "targetServerUri",
    "targetNodeId",
    "targetNodeClass"
})
public class AddReferencesItem {

    @XmlElementRef(name = "SourceNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sourceNodeId;
    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsForward")
    protected Boolean isForward;
    @XmlElementRef(name = "TargetServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetServerUri;
    @XmlElementRef(name = "TargetNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> targetNodeId;
    @XmlElement(name = "TargetNodeClass")
    @XmlSchemaType(name = "string")
    protected NodeClass targetNodeClass;

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
     * Ruft den Wert der targetServerUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetServerUri() {
        return targetServerUri;
    }

    /**
     * Legt den Wert der targetServerUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetServerUri(JAXBElement<String> value) {
        this.targetServerUri = value;
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
     * Ruft den Wert der targetNodeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NodeClass }
     *     
     */
    public NodeClass getTargetNodeClass() {
        return targetNodeClass;
    }

    /**
     * Legt den Wert der targetNodeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeClass }
     *     
     */
    public void setTargetNodeClass(NodeClass value) {
        this.targetNodeClass = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AddReferencesItem.Builder<_B> _other) {
        _other.sourceNodeId = this.sourceNodeId;
        _other.referenceTypeId = this.referenceTypeId;
        _other.isForward = this.isForward;
        _other.targetServerUri = this.targetServerUri;
        _other.targetNodeId = this.targetNodeId;
        _other.targetNodeClass = this.targetNodeClass;
    }

    public<_B >AddReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AddReferencesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public AddReferencesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AddReferencesItem.Builder<Void> builder() {
        return new AddReferencesItem.Builder<Void>(null, null, false);
    }

    public static<_B >AddReferencesItem.Builder<_B> copyOf(final AddReferencesItem _other) {
        final AddReferencesItem.Builder<_B> _newBuilder = new AddReferencesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AddReferencesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
        final PropertyTree targetServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetServerUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetServerUriPropertyTree!= null):((targetServerUriPropertyTree == null)||(!targetServerUriPropertyTree.isLeaf())))) {
            _other.targetServerUri = this.targetServerUri;
        }
        final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
            _other.targetNodeId = this.targetNodeId;
        }
        final PropertyTree targetNodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeClass"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeClassPropertyTree!= null):((targetNodeClassPropertyTree == null)||(!targetNodeClassPropertyTree.isLeaf())))) {
            _other.targetNodeClass = this.targetNodeClass;
        }
    }

    public<_B >AddReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AddReferencesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AddReferencesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AddReferencesItem.Builder<_B> copyOf(final AddReferencesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AddReferencesItem.Builder<_B> _newBuilder = new AddReferencesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AddReferencesItem.Builder<Void> copyExcept(final AddReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AddReferencesItem.Builder<Void> copyOnly(final AddReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AddReferencesItem _storedValue;
        private JAXBElement<NodeId> sourceNodeId;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isForward;
        private JAXBElement<String> targetServerUri;
        private JAXBElement<ExpandedNodeId> targetNodeId;
        private NodeClass targetNodeClass;

        public Builder(final _B _parentBuilder, final AddReferencesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sourceNodeId = _other.sourceNodeId;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isForward = _other.isForward;
                    this.targetServerUri = _other.targetServerUri;
                    this.targetNodeId = _other.targetNodeId;
                    this.targetNodeClass = _other.targetNodeClass;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AddReferencesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree targetServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetServerUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetServerUriPropertyTree!= null):((targetServerUriPropertyTree == null)||(!targetServerUriPropertyTree.isLeaf())))) {
                        this.targetServerUri = _other.targetServerUri;
                    }
                    final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
                        this.targetNodeId = _other.targetNodeId;
                    }
                    final PropertyTree targetNodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeClass"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeClassPropertyTree!= null):((targetNodeClassPropertyTree == null)||(!targetNodeClassPropertyTree.isLeaf())))) {
                        this.targetNodeClass = _other.targetNodeClass;
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

        protected<_P extends AddReferencesItem >_P init(final _P _product) {
            _product.sourceNodeId = this.sourceNodeId;
            _product.referenceTypeId = this.referenceTypeId;
            _product.isForward = this.isForward;
            _product.targetServerUri = this.targetServerUri;
            _product.targetNodeId = this.targetNodeId;
            _product.targetNodeClass = this.targetNodeClass;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sourceNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sourceNodeId
         *     Neuer Wert der Eigenschaft "sourceNodeId".
         */
        public AddReferencesItem.Builder<_B> withSourceNodeId(final JAXBElement<NodeId> sourceNodeId) {
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
        public AddReferencesItem.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
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
        public AddReferencesItem.Builder<_B> withIsForward(final Boolean isForward) {
            this.isForward = isForward;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetServerUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetServerUri
         *     Neuer Wert der Eigenschaft "targetServerUri".
         */
        public AddReferencesItem.Builder<_B> withTargetServerUri(final JAXBElement<String> targetServerUri) {
            this.targetServerUri = targetServerUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetNodeId
         *     Neuer Wert der Eigenschaft "targetNodeId".
         */
        public AddReferencesItem.Builder<_B> withTargetNodeId(final JAXBElement<ExpandedNodeId> targetNodeId) {
            this.targetNodeId = targetNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetNodeClass" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetNodeClass
         *     Neuer Wert der Eigenschaft "targetNodeClass".
         */
        public AddReferencesItem.Builder<_B> withTargetNodeClass(final NodeClass targetNodeClass) {
            this.targetNodeClass = targetNodeClass;
            return this;
        }

        @Override
        public AddReferencesItem build() {
            if (_storedValue == null) {
                return this.init(new AddReferencesItem());
            } else {
                return ((AddReferencesItem) _storedValue);
            }
        }

        public AddReferencesItem.Builder<_B> copyOf(final AddReferencesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public AddReferencesItem.Builder<_B> copyOf(final AddReferencesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AddReferencesItem.Selector<AddReferencesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AddReferencesItem.Select _root() {
            return new AddReferencesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> sourceNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> isForward = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetServerUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetNodeClass = null;

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
            if (this.targetServerUri!= null) {
                products.put("targetServerUri", this.targetServerUri.init());
            }
            if (this.targetNodeId!= null) {
                products.put("targetNodeId", this.targetNodeId.init());
            }
            if (this.targetNodeClass!= null) {
                products.put("targetNodeClass", this.targetNodeClass.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> sourceNodeId() {
            return ((this.sourceNodeId == null)?this.sourceNodeId = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "sourceNodeId"):this.sourceNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> isForward() {
            return ((this.isForward == null)?this.isForward = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "isForward"):this.isForward);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetServerUri() {
            return ((this.targetServerUri == null)?this.targetServerUri = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "targetServerUri"):this.targetServerUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetNodeId() {
            return ((this.targetNodeId == null)?this.targetNodeId = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "targetNodeId"):this.targetNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>> targetNodeClass() {
            return ((this.targetNodeClass == null)?this.targetNodeClass = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "targetNodeClass"):this.targetNodeClass);
        }

    }

}
