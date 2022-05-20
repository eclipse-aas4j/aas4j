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
 * <p>Java-Klasse für RolePermissionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RolePermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Permissions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PermissionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePermissionType", propOrder = {
    "roleId",
    "permissions"
})
public class RolePermissionType {

    @XmlElementRef(name = "RoleId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> roleId;
    @XmlElement(name = "Permissions")
    @XmlSchemaType(name = "unsignedInt")
    protected Long permissions;

    /**
     * Ruft den Wert der roleId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getRoleId() {
        return roleId;
    }

    /**
     * Legt den Wert der roleId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setRoleId(JAXBElement<NodeId> value) {
        this.roleId = value;
    }

    /**
     * Ruft den Wert der permissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPermissions() {
        return permissions;
    }

    /**
     * Legt den Wert der permissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPermissions(Long value) {
        this.permissions = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RolePermissionType.Builder<_B> _other) {
        _other.roleId = this.roleId;
        _other.permissions = this.permissions;
    }

    public<_B >RolePermissionType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RolePermissionType.Builder<_B>(_parentBuilder, this, true);
    }

    public RolePermissionType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RolePermissionType.Builder<Void> builder() {
        return new RolePermissionType.Builder<Void>(null, null, false);
    }

    public static<_B >RolePermissionType.Builder<_B> copyOf(final RolePermissionType _other) {
        final RolePermissionType.Builder<_B> _newBuilder = new RolePermissionType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RolePermissionType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree roleIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("roleId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(roleIdPropertyTree!= null):((roleIdPropertyTree == null)||(!roleIdPropertyTree.isLeaf())))) {
            _other.roleId = this.roleId;
        }
        final PropertyTree permissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("permissions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(permissionsPropertyTree!= null):((permissionsPropertyTree == null)||(!permissionsPropertyTree.isLeaf())))) {
            _other.permissions = this.permissions;
        }
    }

    public<_B >RolePermissionType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RolePermissionType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RolePermissionType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RolePermissionType.Builder<_B> copyOf(final RolePermissionType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RolePermissionType.Builder<_B> _newBuilder = new RolePermissionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RolePermissionType.Builder<Void> copyExcept(final RolePermissionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RolePermissionType.Builder<Void> copyOnly(final RolePermissionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RolePermissionType _storedValue;
        private JAXBElement<NodeId> roleId;
        private Long permissions;

        public Builder(final _B _parentBuilder, final RolePermissionType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.roleId = _other.roleId;
                    this.permissions = _other.permissions;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RolePermissionType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree roleIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("roleId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(roleIdPropertyTree!= null):((roleIdPropertyTree == null)||(!roleIdPropertyTree.isLeaf())))) {
                        this.roleId = _other.roleId;
                    }
                    final PropertyTree permissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("permissions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(permissionsPropertyTree!= null):((permissionsPropertyTree == null)||(!permissionsPropertyTree.isLeaf())))) {
                        this.permissions = _other.permissions;
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

        protected<_P extends RolePermissionType >_P init(final _P _product) {
            _product.roleId = this.roleId;
            _product.permissions = this.permissions;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "roleId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param roleId
         *     Neuer Wert der Eigenschaft "roleId".
         */
        public RolePermissionType.Builder<_B> withRoleId(final JAXBElement<NodeId> roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "permissions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param permissions
         *     Neuer Wert der Eigenschaft "permissions".
         */
        public RolePermissionType.Builder<_B> withPermissions(final Long permissions) {
            this.permissions = permissions;
            return this;
        }

        @Override
        public RolePermissionType build() {
            if (_storedValue == null) {
                return this.init(new RolePermissionType());
            } else {
                return ((RolePermissionType) _storedValue);
            }
        }

        public RolePermissionType.Builder<_B> copyOf(final RolePermissionType _other) {
            _other.copyTo(this);
            return this;
        }

        public RolePermissionType.Builder<_B> copyOf(final RolePermissionType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RolePermissionType.Selector<RolePermissionType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RolePermissionType.Select _root() {
            return new RolePermissionType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>> roleId = null;
        private com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>> permissions = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.roleId!= null) {
                products.put("roleId", this.roleId.init());
            }
            if (this.permissions!= null) {
                products.put("permissions", this.permissions.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>> roleId() {
            return ((this.roleId == null)?this.roleId = new com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>>(this._root, this, "roleId"):this.roleId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>> permissions() {
            return ((this.permissions == null)?this.permissions = new com.kscs.util.jaxb.Selector<TRoot, RolePermissionType.Selector<TRoot, TParent>>(this._root, this, "permissions"):this.permissions);
        }

    }

}
