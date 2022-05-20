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
 * <p>Java-Klasse für ReferenceDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReferenceDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="BrowseName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="NodeClass" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeClass" minOccurs="0"/&gt;
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
@XmlType(name = "ReferenceDescription", propOrder = {
    "referenceTypeId",
    "isForward",
    "nodeId",
    "browseName",
    "displayName",
    "nodeClass",
    "typeDefinition"
})
public class ReferenceDescription {

    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsForward")
    protected Boolean isForward;
    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> nodeId;
    @XmlElementRef(name = "BrowseName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> browseName;
    @XmlElementRef(name = "DisplayName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> displayName;
    @XmlElement(name = "NodeClass")
    @XmlSchemaType(name = "string")
    protected NodeClass nodeClass;
    @XmlElementRef(name = "TypeDefinition", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> typeDefinition;

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
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<LocalizedText> value) {
        this.displayName = value;
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
    public<_B >void copyTo(final ReferenceDescription.Builder<_B> _other) {
        _other.referenceTypeId = this.referenceTypeId;
        _other.isForward = this.isForward;
        _other.nodeId = this.nodeId;
        _other.browseName = this.browseName;
        _other.displayName = this.displayName;
        _other.nodeClass = this.nodeClass;
        _other.typeDefinition = this.typeDefinition;
    }

    public<_B >ReferenceDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReferenceDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ReferenceDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReferenceDescription.Builder<Void> builder() {
        return new ReferenceDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ReferenceDescription.Builder<_B> copyOf(final ReferenceDescription _other) {
        final ReferenceDescription.Builder<_B> _newBuilder = new ReferenceDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReferenceDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
            _other.isForward = this.isForward;
        }
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
            _other.browseName = this.browseName;
        }
        final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
            _other.displayName = this.displayName;
        }
        final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
            _other.nodeClass = this.nodeClass;
        }
        final PropertyTree typeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionPropertyTree!= null):((typeDefinitionPropertyTree == null)||(!typeDefinitionPropertyTree.isLeaf())))) {
            _other.typeDefinition = this.typeDefinition;
        }
    }

    public<_B >ReferenceDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReferenceDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ReferenceDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReferenceDescription.Builder<_B> copyOf(final ReferenceDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReferenceDescription.Builder<_B> _newBuilder = new ReferenceDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReferenceDescription.Builder<Void> copyExcept(final ReferenceDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReferenceDescription.Builder<Void> copyOnly(final ReferenceDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ReferenceDescription _storedValue;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isForward;
        private JAXBElement<ExpandedNodeId> nodeId;
        private JAXBElement<QualifiedName> browseName;
        private JAXBElement<LocalizedText> displayName;
        private NodeClass nodeClass;
        private JAXBElement<ExpandedNodeId> typeDefinition;

        public Builder(final _B _parentBuilder, final ReferenceDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isForward = _other.isForward;
                    this.nodeId = _other.nodeId;
                    this.browseName = _other.browseName;
                    this.displayName = _other.displayName;
                    this.nodeClass = _other.nodeClass;
                    this.typeDefinition = _other.typeDefinition;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ReferenceDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree isForwardPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isForward"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isForwardPropertyTree!= null):((isForwardPropertyTree == null)||(!isForwardPropertyTree.isLeaf())))) {
                        this.isForward = _other.isForward;
                    }
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
                        this.browseName = _other.browseName;
                    }
                    final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
                        this.displayName = _other.displayName;
                    }
                    final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
                        this.nodeClass = _other.nodeClass;
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

        protected<_P extends ReferenceDescription >_P init(final _P _product) {
            _product.referenceTypeId = this.referenceTypeId;
            _product.isForward = this.isForward;
            _product.nodeId = this.nodeId;
            _product.browseName = this.browseName;
            _product.displayName = this.displayName;
            _product.nodeClass = this.nodeClass;
            _product.typeDefinition = this.typeDefinition;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public ReferenceDescription.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
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
        public ReferenceDescription.Builder<_B> withIsForward(final Boolean isForward) {
            this.isForward = isForward;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public ReferenceDescription.Builder<_B> withNodeId(final JAXBElement<ExpandedNodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browseName
         *     Neuer Wert der Eigenschaft "browseName".
         */
        public ReferenceDescription.Builder<_B> withBrowseName(final JAXBElement<QualifiedName> browseName) {
            this.browseName = browseName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        public ReferenceDescription.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClass" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeClass
         *     Neuer Wert der Eigenschaft "nodeClass".
         */
        public ReferenceDescription.Builder<_B> withNodeClass(final NodeClass nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeDefinition" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param typeDefinition
         *     Neuer Wert der Eigenschaft "typeDefinition".
         */
        public ReferenceDescription.Builder<_B> withTypeDefinition(final JAXBElement<ExpandedNodeId> typeDefinition) {
            this.typeDefinition = typeDefinition;
            return this;
        }

        @Override
        public ReferenceDescription build() {
            if (_storedValue == null) {
                return this.init(new ReferenceDescription());
            } else {
                return ((ReferenceDescription) _storedValue);
            }
        }

        public ReferenceDescription.Builder<_B> copyOf(final ReferenceDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ReferenceDescription.Builder<_B> copyOf(final ReferenceDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReferenceDescription.Selector<ReferenceDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReferenceDescription.Select _root() {
            return new ReferenceDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> isForward = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> browseName = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> displayName = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> nodeClass = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> typeDefinition = null;

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
            if (this.isForward!= null) {
                products.put("isForward", this.isForward.init());
            }
            if (this.nodeId!= null) {
                products.put("nodeId", this.nodeId.init());
            }
            if (this.browseName!= null) {
                products.put("browseName", this.browseName.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            if (this.nodeClass!= null) {
                products.put("nodeClass", this.nodeClass.init());
            }
            if (this.typeDefinition!= null) {
                products.put("typeDefinition", this.typeDefinition.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> isForward() {
            return ((this.isForward == null)?this.isForward = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "isForward"):this.isForward);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> browseName() {
            return ((this.browseName == null)?this.browseName = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "browseName"):this.browseName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> nodeClass() {
            return ((this.nodeClass == null)?this.nodeClass = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "nodeClass"):this.nodeClass);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>> typeDefinition() {
            return ((this.typeDefinition == null)?this.typeDefinition = new com.kscs.util.jaxb.Selector<TRoot, ReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "typeDefinition"):this.typeDefinition);
        }

    }

}
