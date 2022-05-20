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
 * <p>Java-Klasse für AddNodesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddNodesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="RequestedNewNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="BrowseName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="NodeClass" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeClass" minOccurs="0"/&gt;
 *         &lt;element name="NodeAttributes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="TypeDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNodesItem", propOrder = {
    "parentNodeId",
    "referenceTypeId",
    "requestedNewNodeId",
    "browseName",
    "nodeClass",
    "nodeAttributes",
    "typeDefinition"
})
public class AddNodesItem {

    @XmlElementRef(name = "ParentNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> parentNodeId;
    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElementRef(name = "RequestedNewNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> requestedNewNodeId;
    @XmlElementRef(name = "BrowseName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> browseName;
    @XmlElement(name = "NodeClass")
    @XmlSchemaType(name = "string")
    protected NodeClass nodeClass;
    @XmlElementRef(name = "NodeAttributes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> nodeAttributes;
    @XmlElementRef(name = "TypeDefinition", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> typeDefinition;

    /**
     * Ruft den Wert der parentNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Legt den Wert der parentNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setParentNodeId(JAXBElement<ExpandedNodeId> value) {
        this.parentNodeId = value;
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
     * Ruft den Wert der requestedNewNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getRequestedNewNodeId() {
        return requestedNewNodeId;
    }

    /**
     * Legt den Wert der requestedNewNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setRequestedNewNodeId(JAXBElement<ExpandedNodeId> value) {
        this.requestedNewNodeId = value;
    }

    /**
     * Ruft den Wert der browseName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getBrowseName() {
        return browseName;
    }

    /**
     * Legt den Wert der browseName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setBrowseName(JAXBElement<QualifiedName> value) {
        this.browseName = value;
    }

    /**
     * Ruft den Wert der nodeClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NodeClass }
     *     
     */
    public NodeClass getNodeClass() {
        return nodeClass;
    }

    /**
     * Legt den Wert der nodeClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeClass }
     *     
     */
    public void setNodeClass(NodeClass value) {
        this.nodeClass = value;
    }

    /**
     * Ruft den Wert der nodeAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getNodeAttributes() {
        return nodeAttributes;
    }

    /**
     * Legt den Wert der nodeAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setNodeAttributes(JAXBElement<ExtensionObject> value) {
        this.nodeAttributes = value;
    }

    /**
     * Ruft den Wert der typeDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Legt den Wert der typeDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTypeDefinition(JAXBElement<ExpandedNodeId> value) {
        this.typeDefinition = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AddNodesItem.Builder<_B> _other) {
        _other.parentNodeId = this.parentNodeId;
        _other.referenceTypeId = this.referenceTypeId;
        _other.requestedNewNodeId = this.requestedNewNodeId;
        _other.browseName = this.browseName;
        _other.nodeClass = this.nodeClass;
        _other.nodeAttributes = this.nodeAttributes;
        _other.typeDefinition = this.typeDefinition;
    }

    public<_B >AddNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AddNodesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public AddNodesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AddNodesItem.Builder<Void> builder() {
        return new AddNodesItem.Builder<Void>(null, null, false);
    }

    public static<_B >AddNodesItem.Builder<_B> copyOf(final AddNodesItem _other) {
        final AddNodesItem.Builder<_B> _newBuilder = new AddNodesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AddNodesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree parentNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parentNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parentNodeIdPropertyTree!= null):((parentNodeIdPropertyTree == null)||(!parentNodeIdPropertyTree.isLeaf())))) {
            _other.parentNodeId = this.parentNodeId;
        }
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree requestedNewNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedNewNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedNewNodeIdPropertyTree!= null):((requestedNewNodeIdPropertyTree == null)||(!requestedNewNodeIdPropertyTree.isLeaf())))) {
            _other.requestedNewNodeId = this.requestedNewNodeId;
        }
        final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
            _other.browseName = this.browseName;
        }
        final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
            _other.nodeClass = this.nodeClass;
        }
        final PropertyTree nodeAttributesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeAttributes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeAttributesPropertyTree!= null):((nodeAttributesPropertyTree == null)||(!nodeAttributesPropertyTree.isLeaf())))) {
            _other.nodeAttributes = this.nodeAttributes;
        }
        final PropertyTree typeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionPropertyTree!= null):((typeDefinitionPropertyTree == null)||(!typeDefinitionPropertyTree.isLeaf())))) {
            _other.typeDefinition = this.typeDefinition;
        }
    }

    public<_B >AddNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AddNodesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AddNodesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AddNodesItem.Builder<_B> copyOf(final AddNodesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AddNodesItem.Builder<_B> _newBuilder = new AddNodesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AddNodesItem.Builder<Void> copyExcept(final AddNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AddNodesItem.Builder<Void> copyOnly(final AddNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AddNodesItem _storedValue;
        private JAXBElement<ExpandedNodeId> parentNodeId;
        private JAXBElement<NodeId> referenceTypeId;
        private JAXBElement<ExpandedNodeId> requestedNewNodeId;
        private JAXBElement<QualifiedName> browseName;
        private NodeClass nodeClass;
        private JAXBElement<ExtensionObject> nodeAttributes;
        private JAXBElement<ExpandedNodeId> typeDefinition;

        public Builder(final _B _parentBuilder, final AddNodesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.parentNodeId = _other.parentNodeId;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.requestedNewNodeId = _other.requestedNewNodeId;
                    this.browseName = _other.browseName;
                    this.nodeClass = _other.nodeClass;
                    this.nodeAttributes = _other.nodeAttributes;
                    this.typeDefinition = _other.typeDefinition;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AddNodesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree parentNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parentNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parentNodeIdPropertyTree!= null):((parentNodeIdPropertyTree == null)||(!parentNodeIdPropertyTree.isLeaf())))) {
                        this.parentNodeId = _other.parentNodeId;
                    }
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree requestedNewNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedNewNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedNewNodeIdPropertyTree!= null):((requestedNewNodeIdPropertyTree == null)||(!requestedNewNodeIdPropertyTree.isLeaf())))) {
                        this.requestedNewNodeId = _other.requestedNewNodeId;
                    }
                    final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
                        this.browseName = _other.browseName;
                    }
                    final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
                        this.nodeClass = _other.nodeClass;
                    }
                    final PropertyTree nodeAttributesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeAttributes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeAttributesPropertyTree!= null):((nodeAttributesPropertyTree == null)||(!nodeAttributesPropertyTree.isLeaf())))) {
                        this.nodeAttributes = _other.nodeAttributes;
                    }
                    final PropertyTree typeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinition"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionPropertyTree!= null):((typeDefinitionPropertyTree == null)||(!typeDefinitionPropertyTree.isLeaf())))) {
                        this.typeDefinition = _other.typeDefinition;
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

        protected<_P extends AddNodesItem >_P init(final _P _product) {
            _product.parentNodeId = this.parentNodeId;
            _product.referenceTypeId = this.referenceTypeId;
            _product.requestedNewNodeId = this.requestedNewNodeId;
            _product.browseName = this.browseName;
            _product.nodeClass = this.nodeClass;
            _product.nodeAttributes = this.nodeAttributes;
            _product.typeDefinition = this.typeDefinition;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parentNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param parentNodeId
         *     Neuer Wert der Eigenschaft "parentNodeId".
         */
        public AddNodesItem.Builder<_B> withParentNodeId(final JAXBElement<ExpandedNodeId> parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public AddNodesItem.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
            this.referenceTypeId = referenceTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedNewNodeId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param requestedNewNodeId
         *     Neuer Wert der Eigenschaft "requestedNewNodeId".
         */
        public AddNodesItem.Builder<_B> withRequestedNewNodeId(final JAXBElement<ExpandedNodeId> requestedNewNodeId) {
            this.requestedNewNodeId = requestedNewNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browseName
         *     Neuer Wert der Eigenschaft "browseName".
         */
        public AddNodesItem.Builder<_B> withBrowseName(final JAXBElement<QualifiedName> browseName) {
            this.browseName = browseName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClass" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeClass
         *     Neuer Wert der Eigenschaft "nodeClass".
         */
        public AddNodesItem.Builder<_B> withNodeClass(final NodeClass nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeAttributes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodeAttributes
         *     Neuer Wert der Eigenschaft "nodeAttributes".
         */
        public AddNodesItem.Builder<_B> withNodeAttributes(final JAXBElement<ExtensionObject> nodeAttributes) {
            this.nodeAttributes = nodeAttributes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeDefinition" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param typeDefinition
         *     Neuer Wert der Eigenschaft "typeDefinition".
         */
        public AddNodesItem.Builder<_B> withTypeDefinition(final JAXBElement<ExpandedNodeId> typeDefinition) {
            this.typeDefinition = typeDefinition;
            return this;
        }

        @Override
        public AddNodesItem build() {
            if (_storedValue == null) {
                return this.init(new AddNodesItem());
            } else {
                return ((AddNodesItem) _storedValue);
            }
        }

        public AddNodesItem.Builder<_B> copyOf(final AddNodesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public AddNodesItem.Builder<_B> copyOf(final AddNodesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AddNodesItem.Selector<AddNodesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AddNodesItem.Select _root() {
            return new AddNodesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> parentNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> requestedNewNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> browseName = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> nodeClass = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> nodeAttributes = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> typeDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.parentNodeId!= null) {
                products.put("parentNodeId", this.parentNodeId.init());
            }
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.requestedNewNodeId!= null) {
                products.put("requestedNewNodeId", this.requestedNewNodeId.init());
            }
            if (this.browseName!= null) {
                products.put("browseName", this.browseName.init());
            }
            if (this.nodeClass!= null) {
                products.put("nodeClass", this.nodeClass.init());
            }
            if (this.nodeAttributes!= null) {
                products.put("nodeAttributes", this.nodeAttributes.init());
            }
            if (this.typeDefinition!= null) {
                products.put("typeDefinition", this.typeDefinition.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> parentNodeId() {
            return ((this.parentNodeId == null)?this.parentNodeId = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "parentNodeId"):this.parentNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> requestedNewNodeId() {
            return ((this.requestedNewNodeId == null)?this.requestedNewNodeId = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "requestedNewNodeId"):this.requestedNewNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> browseName() {
            return ((this.browseName == null)?this.browseName = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "browseName"):this.browseName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> nodeClass() {
            return ((this.nodeClass == null)?this.nodeClass = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "nodeClass"):this.nodeClass);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> nodeAttributes() {
            return ((this.nodeAttributes == null)?this.nodeAttributes = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "nodeAttributes"):this.nodeAttributes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>> typeDefinition() {
            return ((this.typeDefinition == null)?this.typeDefinition = new com.kscs.util.jaxb.Selector<TRoot, AddNodesItem.Selector<TRoot, TParent>>(this._root, this, "typeDefinition"):this.typeDefinition);
        }

    }

}
