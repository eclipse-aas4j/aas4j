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
 * <p>Java-Klasse für SubscribedDataSetMirrorDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscribedDataSetMirrorDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscribedDataSetDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RolePermissions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfRolePermissionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribedDataSetMirrorDataType", propOrder = {
    "parentNodeName",
    "rolePermissions"
})
public class SubscribedDataSetMirrorDataType
    extends SubscribedDataSetDataType
{

    @XmlElementRef(name = "ParentNodeName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentNodeName;
    @XmlElementRef(name = "RolePermissions", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfRolePermissionType> rolePermissions;

    /**
     * Ruft den Wert der parentNodeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentNodeName() {
        return parentNodeName;
    }

    /**
     * Legt den Wert der parentNodeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentNodeName(JAXBElement<String> value) {
        this.parentNodeName = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SubscribedDataSetMirrorDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.parentNodeName = this.parentNodeName;
        _other.rolePermissions = this.rolePermissions;
    }

    @Override
    public<_B >SubscribedDataSetMirrorDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SubscribedDataSetMirrorDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public SubscribedDataSetMirrorDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SubscribedDataSetMirrorDataType.Builder<Void> builder() {
        return new SubscribedDataSetMirrorDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetDataType _other) {
        final SubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new SubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetMirrorDataType _other) {
        final SubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new SubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SubscribedDataSetMirrorDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree parentNodeNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parentNodeName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parentNodeNamePropertyTree!= null):((parentNodeNamePropertyTree == null)||(!parentNodeNamePropertyTree.isLeaf())))) {
            _other.parentNodeName = this.parentNodeName;
        }
        final PropertyTree rolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionsPropertyTree!= null):((rolePermissionsPropertyTree == null)||(!rolePermissionsPropertyTree.isLeaf())))) {
            _other.rolePermissions = this.rolePermissions;
        }
    }

    @Override
    public<_B >SubscribedDataSetMirrorDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SubscribedDataSetMirrorDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public SubscribedDataSetMirrorDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new SubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new SubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SubscribedDataSetMirrorDataType.Builder<Void> copyExcept(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SubscribedDataSetMirrorDataType.Builder<Void> copyExcept(final SubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SubscribedDataSetMirrorDataType.Builder<Void> copyOnly(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static SubscribedDataSetMirrorDataType.Builder<Void> copyOnly(final SubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends SubscribedDataSetDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> parentNodeName;
        private JAXBElement<ListOfRolePermissionType> rolePermissions;

        public Builder(final _B _parentBuilder, final SubscribedDataSetMirrorDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.parentNodeName = _other.parentNodeName;
                this.rolePermissions = _other.rolePermissions;
            }
        }

        public Builder(final _B _parentBuilder, final SubscribedDataSetMirrorDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree parentNodeNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parentNodeName"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parentNodeNamePropertyTree!= null):((parentNodeNamePropertyTree == null)||(!parentNodeNamePropertyTree.isLeaf())))) {
                    this.parentNodeName = _other.parentNodeName;
                }
                final PropertyTree rolePermissionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissions"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionsPropertyTree!= null):((rolePermissionsPropertyTree == null)||(!rolePermissionsPropertyTree.isLeaf())))) {
                    this.rolePermissions = _other.rolePermissions;
                }
            }
        }

        protected<_P extends SubscribedDataSetMirrorDataType >_P init(final _P _product) {
            _product.parentNodeName = this.parentNodeName;
            _product.rolePermissions = this.rolePermissions;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parentNodeName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param parentNodeName
         *     Neuer Wert der Eigenschaft "parentNodeName".
         */
        public SubscribedDataSetMirrorDataType.Builder<_B> withParentNodeName(final JAXBElement<String> parentNodeName) {
            this.parentNodeName = parentNodeName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rolePermissions
         *     Neuer Wert der Eigenschaft "rolePermissions".
         */
        public SubscribedDataSetMirrorDataType.Builder<_B> withRolePermissions(final JAXBElement<ListOfRolePermissionType> rolePermissions) {
            this.rolePermissions = rolePermissions;
            return this;
        }

        @Override
        public SubscribedDataSetMirrorDataType build() {
            if (_storedValue == null) {
                return this.init(new SubscribedDataSetMirrorDataType());
            } else {
                return ((SubscribedDataSetMirrorDataType) _storedValue);
            }
        }

        public SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetMirrorDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SubscribedDataSetMirrorDataType.Builder<_B> copyOf(final SubscribedDataSetMirrorDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SubscribedDataSetMirrorDataType.Selector<SubscribedDataSetMirrorDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SubscribedDataSetMirrorDataType.Select _root() {
            return new SubscribedDataSetMirrorDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends SubscribedDataSetDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> parentNodeName = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> rolePermissions = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.parentNodeName!= null) {
                products.put("parentNodeName", this.parentNodeName.init());
            }
            if (this.rolePermissions!= null) {
                products.put("rolePermissions", this.rolePermissions.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> parentNodeName() {
            return ((this.parentNodeName == null)?this.parentNodeName = new com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>>(this._root, this, "parentNodeName"):this.parentNodeName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> rolePermissions() {
            return ((this.rolePermissions == null)?this.rolePermissions = new com.kscs.util.jaxb.Selector<TRoot, SubscribedDataSetMirrorDataType.Selector<TRoot, TParent>>(this._root, this, "rolePermissions"):this.rolePermissions);
        }

    }

}
