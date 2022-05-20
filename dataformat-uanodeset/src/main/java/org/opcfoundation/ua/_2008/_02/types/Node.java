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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für Node complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Node"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="NodeClass" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeClass" minOccurs="0"/&gt;
 *         &lt;element name="BrowseName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="WriteMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UserWriteMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RolePermissions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfRolePermissionType" minOccurs="0"/&gt;
 *         &lt;element name="UserRolePermissions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfRolePermissionType" minOccurs="0"/&gt;
 *         &lt;element name="AccessRestrictions" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="References" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfReferenceNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node", propOrder = {
    "nodeId",
    "nodeClass",
    "browseName",
    "displayName",
    "description",
    "writeMask",
    "userWriteMask",
    "rolePermissions",
    "userRolePermissions",
    "accessRestrictions",
    "references"
})
@XmlSeeAlso({
    InstanceNode.class,
    TypeNode.class
})
public class Node {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElement(name = "NodeClass")
    @XmlSchemaType(name = "string")
    protected NodeClass nodeClass;
    @XmlElementRef(name = "BrowseName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> browseName;
    @XmlElementRef(name = "DisplayName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> displayName;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;
    @XmlElement(name = "WriteMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long writeMask;
    @XmlElement(name = "UserWriteMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long userWriteMask;
    @XmlElementRef(name = "RolePermissions", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfRolePermissionType> rolePermissions;
    @XmlElementRef(name = "UserRolePermissions", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfRolePermissionType> userRolePermissions;
    @XmlElement(name = "AccessRestrictions")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer accessRestrictions;
    @XmlElementRef(name = "References", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfReferenceNode> references;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setDescription(JAXBElement<LocalizedText> value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der writeMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWriteMask() {
        return writeMask;
    }

    /**
     * Legt den Wert der writeMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWriteMask(Long value) {
        this.writeMask = value;
    }

    /**
     * Ruft den Wert der userWriteMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserWriteMask() {
        return userWriteMask;
    }

    /**
     * Legt den Wert der userWriteMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserWriteMask(Long value) {
        this.userWriteMask = value;
    }

    /**
     * Ruft den Wert der rolePermissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfRolePermissionType }{@code >}
     *     
     */
    public JAXBElement<ListOfRolePermissionType> getRolePermissions() {
        return rolePermissions;
    }

    /**
     * Legt den Wert der rolePermissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfRolePermissionType }{@code >}
     *     
     */
    public void setRolePermissions(JAXBElement<ListOfRolePermissionType> value) {
        this.rolePermissions = value;
    }

    /**
     * Ruft den Wert der userRolePermissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfRolePermissionType }{@code >}
     *     
     */
    public JAXBElement<ListOfRolePermissionType> getUserRolePermissions() {
        return userRolePermissions;
    }

    /**
     * Legt den Wert der userRolePermissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfRolePermissionType }{@code >}
     *     
     */
    public void setUserRolePermissions(JAXBElement<ListOfRolePermissionType> value) {
        this.userRolePermissions = value;
    }

    /**
     * Ruft den Wert der accessRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessRestrictions() {
        return accessRestrictions;
    }

    /**
     * Legt den Wert der accessRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessRestrictions(Integer value) {
        this.accessRestrictions = value;
    }

    /**
     * Ruft den Wert der references-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfReferenceNode }{@code >}
     *     
     */
    public JAXBElement<ListOfReferenceNode> getReferences() {
        return references;
    }

    /**
     * Legt den Wert der references-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfReferenceNode }{@code >}
     *     
     */
    public void setReferences(JAXBElement<ListOfReferenceNode> value) {
        this.references = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Node.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.nodeClass = this.nodeClass;
        _other.browseName = this.browseName;
        _other.displayName = this.displayName;
        _other.description = this.description;
        _other.writeMask = this.writeMask;
        _other.userWriteMask = this.userWriteMask;
        _other.rolePermissions = this.rolePermissions;
        _other.userRolePermissions = this.userRolePermissions;
        _other.accessRestrictions = this.accessRestrictions;
        _other.references = this.references;
    }

    public<_B >Node.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Node.Builder<_B>(_parentBuilder, this, true);
    }

    public Node.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Node.Builder<Void> builder() {
        return new Node.Builder<Void>(null, null, false);
    }

    public static<_B >Node.Builder<_B> copyOf(final Node _other) {
        final Node.Builder<_B> _newBuilder = new Node.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final Node.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
            _other.nodeClass = this.nodeClass;
        }
        final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
            _other.browseName = this.browseName;
        }
        final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
            _other.displayName = this.displayName;
        }
        final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
            _other.description = this.description;
        }
        final PropertyTree writeMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeMaskPropertyTree!= null):((writeMaskPropertyTree == null)||(!writeMaskPropertyTree.isLeaf())))) {
            _other.writeMask = this.writeMask;
        }
        final PropertyTree userWriteMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userWriteMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userWriteMaskPropertyTree!= null):((userWriteMaskPropertyTree == null)||(!userWriteMaskPropertyTree.isLeaf())))) {
            _other.userWriteMask = this.userWriteMask;
        }
        final PropertyTree rolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionsPropertyTree!= null):((rolePermissionsPropertyTree == null)||(!rolePermissionsPropertyTree.isLeaf())))) {
            _other.rolePermissions = this.rolePermissions;
        }
        final PropertyTree userRolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userRolePermissions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userRolePermissionsPropertyTree!= null):((userRolePermissionsPropertyTree == null)||(!userRolePermissionsPropertyTree.isLeaf())))) {
            _other.userRolePermissions = this.userRolePermissions;
        }
        final PropertyTree accessRestrictionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("accessRestrictions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(accessRestrictionsPropertyTree!= null):((accessRestrictionsPropertyTree == null)||(!accessRestrictionsPropertyTree.isLeaf())))) {
            _other.accessRestrictions = this.accessRestrictions;
        }
        final PropertyTree referencesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("references"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencesPropertyTree!= null):((referencesPropertyTree == null)||(!referencesPropertyTree.isLeaf())))) {
            _other.references = this.references;
        }
    }

    public<_B >Node.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Node.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Node.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Node.Builder<_B> copyOf(final Node _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Node.Builder<_B> _newBuilder = new Node.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Node.Builder<Void> copyExcept(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Node.Builder<Void> copyOnly(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Node _storedValue;
        private JAXBElement<NodeId> nodeId;
        private NodeClass nodeClass;
        private JAXBElement<QualifiedName> browseName;
        private JAXBElement<LocalizedText> displayName;
        private JAXBElement<LocalizedText> description;
        private Long writeMask;
        private Long userWriteMask;
        private JAXBElement<ListOfRolePermissionType> rolePermissions;
        private JAXBElement<ListOfRolePermissionType> userRolePermissions;
        private Integer accessRestrictions;
        private JAXBElement<ListOfReferenceNode> references;

        public Builder(final _B _parentBuilder, final Node _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.nodeClass = _other.nodeClass;
                    this.browseName = _other.browseName;
                    this.displayName = _other.displayName;
                    this.description = _other.description;
                    this.writeMask = _other.writeMask;
                    this.userWriteMask = _other.userWriteMask;
                    this.rolePermissions = _other.rolePermissions;
                    this.userRolePermissions = _other.userRolePermissions;
                    this.accessRestrictions = _other.accessRestrictions;
                    this.references = _other.references;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Node _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree nodeClassPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClass"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassPropertyTree!= null):((nodeClassPropertyTree == null)||(!nodeClassPropertyTree.isLeaf())))) {
                        this.nodeClass = _other.nodeClass;
                    }
                    final PropertyTree browseNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNamePropertyTree!= null):((browseNamePropertyTree == null)||(!browseNamePropertyTree.isLeaf())))) {
                        this.browseName = _other.browseName;
                    }
                    final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
                        this.displayName = _other.displayName;
                    }
                    final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
                        this.description = _other.description;
                    }
                    final PropertyTree writeMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeMaskPropertyTree!= null):((writeMaskPropertyTree == null)||(!writeMaskPropertyTree.isLeaf())))) {
                        this.writeMask = _other.writeMask;
                    }
                    final PropertyTree userWriteMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userWriteMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userWriteMaskPropertyTree!= null):((userWriteMaskPropertyTree == null)||(!userWriteMaskPropertyTree.isLeaf())))) {
                        this.userWriteMask = _other.userWriteMask;
                    }
                    final PropertyTree rolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionsPropertyTree!= null):((rolePermissionsPropertyTree == null)||(!rolePermissionsPropertyTree.isLeaf())))) {
                        this.rolePermissions = _other.rolePermissions;
                    }
                    final PropertyTree userRolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userRolePermissions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userRolePermissionsPropertyTree!= null):((userRolePermissionsPropertyTree == null)||(!userRolePermissionsPropertyTree.isLeaf())))) {
                        this.userRolePermissions = _other.userRolePermissions;
                    }
                    final PropertyTree accessRestrictionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("accessRestrictions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(accessRestrictionsPropertyTree!= null):((accessRestrictionsPropertyTree == null)||(!accessRestrictionsPropertyTree.isLeaf())))) {
                        this.accessRestrictions = _other.accessRestrictions;
                    }
                    final PropertyTree referencesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("references"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencesPropertyTree!= null):((referencesPropertyTree == null)||(!referencesPropertyTree.isLeaf())))) {
                        this.references = _other.references;
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

        protected<_P extends Node >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.nodeClass = this.nodeClass;
            _product.browseName = this.browseName;
            _product.displayName = this.displayName;
            _product.description = this.description;
            _product.writeMask = this.writeMask;
            _product.userWriteMask = this.userWriteMask;
            _product.rolePermissions = this.rolePermissions;
            _product.userRolePermissions = this.userRolePermissions;
            _product.accessRestrictions = this.accessRestrictions;
            _product.references = this.references;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public Node.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClass" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeClass
         *     Neuer Wert der Eigenschaft "nodeClass".
         */
        public Node.Builder<_B> withNodeClass(final NodeClass nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browseName
         *     Neuer Wert der Eigenschaft "browseName".
         */
        public Node.Builder<_B> withBrowseName(final JAXBElement<QualifiedName> browseName) {
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
        public Node.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        public Node.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        public Node.Builder<_B> withWriteMask(final Long writeMask) {
            this.writeMask = writeMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        public Node.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            this.userWriteMask = userWriteMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rolePermissions
         *     Neuer Wert der Eigenschaft "rolePermissions".
         */
        public Node.Builder<_B> withRolePermissions(final JAXBElement<ListOfRolePermissionType> rolePermissions) {
            this.rolePermissions = rolePermissions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userRolePermissions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userRolePermissions
         *     Neuer Wert der Eigenschaft "userRolePermissions".
         */
        public Node.Builder<_B> withUserRolePermissions(final JAXBElement<ListOfRolePermissionType> userRolePermissions) {
            this.userRolePermissions = userRolePermissions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "accessRestrictions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param accessRestrictions
         *     Neuer Wert der Eigenschaft "accessRestrictions".
         */
        public Node.Builder<_B> withAccessRestrictions(final Integer accessRestrictions) {
            this.accessRestrictions = accessRestrictions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "references" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param references
         *     Neuer Wert der Eigenschaft "references".
         */
        public Node.Builder<_B> withReferences(final JAXBElement<ListOfReferenceNode> references) {
            this.references = references;
            return this;
        }

        @Override
        public Node build() {
            if (_storedValue == null) {
                return this.init(new Node());
            } else {
                return ((Node) _storedValue);
            }
        }

        public Node.Builder<_B> copyOf(final Node _other) {
            _other.copyTo(this);
            return this;
        }

        public Node.Builder<_B> copyOf(final Node.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends Node.Selector<Node.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Node.Select _root() {
            return new Node.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> nodeClass = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> browseName = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> displayName = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> description = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> writeMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> userWriteMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> rolePermissions = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> userRolePermissions = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> accessRestrictions = null;
        private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> references = null;

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
            if (this.nodeClass!= null) {
                products.put("nodeClass", this.nodeClass.init());
            }
            if (this.browseName!= null) {
                products.put("browseName", this.browseName.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            if (this.description!= null) {
                products.put("description", this.description.init());
            }
            if (this.writeMask!= null) {
                products.put("writeMask", this.writeMask.init());
            }
            if (this.userWriteMask!= null) {
                products.put("userWriteMask", this.userWriteMask.init());
            }
            if (this.rolePermissions!= null) {
                products.put("rolePermissions", this.rolePermissions.init());
            }
            if (this.userRolePermissions!= null) {
                products.put("userRolePermissions", this.userRolePermissions.init());
            }
            if (this.accessRestrictions!= null) {
                products.put("accessRestrictions", this.accessRestrictions.init());
            }
            if (this.references!= null) {
                products.put("references", this.references.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> nodeClass() {
            return ((this.nodeClass == null)?this.nodeClass = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "nodeClass"):this.nodeClass);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> browseName() {
            return ((this.browseName == null)?this.browseName = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "browseName"):this.browseName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> writeMask() {
            return ((this.writeMask == null)?this.writeMask = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "writeMask"):this.writeMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> userWriteMask() {
            return ((this.userWriteMask == null)?this.userWriteMask = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "userWriteMask"):this.userWriteMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> rolePermissions() {
            return ((this.rolePermissions == null)?this.rolePermissions = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "rolePermissions"):this.rolePermissions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> userRolePermissions() {
            return ((this.userRolePermissions == null)?this.userRolePermissions = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "userRolePermissions"):this.userRolePermissions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> accessRestrictions() {
            return ((this.accessRestrictions == null)?this.accessRestrictions = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "accessRestrictions"):this.accessRestrictions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> references() {
            return ((this.references == null)?this.references = new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this, "references"):this.references);
        }

    }

}
