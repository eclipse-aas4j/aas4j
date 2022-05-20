//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfRolePermissionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfRolePermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RolePermissionType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RolePermissionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRolePermissionType", propOrder = {
    "rolePermissionType"
})
public class ListOfRolePermissionType {

    @XmlElement(name = "RolePermissionType", nillable = true)
    protected List<RolePermissionType> rolePermissionType;

    /**
     * Gets the value of the rolePermissionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePermissionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePermissionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePermissionType }
     * 
     * 
     */
    public List<RolePermissionType> getRolePermissionType() {
        if (rolePermissionType == null) {
            rolePermissionType = new ArrayList<RolePermissionType>();
        }
        return this.rolePermissionType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfRolePermissionType.Builder<_B> _other) {
        if (this.rolePermissionType == null) {
            _other.rolePermissionType = null;
        } else {
            _other.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
            for (RolePermissionType _item: this.rolePermissionType) {
                _other.rolePermissionType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfRolePermissionType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfRolePermissionType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfRolePermissionType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfRolePermissionType.Builder<Void> builder() {
        return new ListOfRolePermissionType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfRolePermissionType.Builder<_B> copyOf(final ListOfRolePermissionType _other) {
        final ListOfRolePermissionType.Builder<_B> _newBuilder = new ListOfRolePermissionType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfRolePermissionType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree rolePermissionTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissionType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionTypePropertyTree!= null):((rolePermissionTypePropertyTree == null)||(!rolePermissionTypePropertyTree.isLeaf())))) {
            if (this.rolePermissionType == null) {
                _other.rolePermissionType = null;
            } else {
                _other.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
                for (RolePermissionType _item: this.rolePermissionType) {
                    _other.rolePermissionType.add(((_item == null)?null:_item.newCopyBuilder(_other, rolePermissionTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfRolePermissionType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfRolePermissionType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfRolePermissionType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfRolePermissionType.Builder<_B> copyOf(final ListOfRolePermissionType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfRolePermissionType.Builder<_B> _newBuilder = new ListOfRolePermissionType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfRolePermissionType.Builder<Void> copyExcept(final ListOfRolePermissionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfRolePermissionType.Builder<Void> copyOnly(final ListOfRolePermissionType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfRolePermissionType _storedValue;
        private List<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>> rolePermissionType;

        public Builder(final _B _parentBuilder, final ListOfRolePermissionType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.rolePermissionType == null) {
                        this.rolePermissionType = null;
                    } else {
                        this.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
                        for (RolePermissionType _item: _other.rolePermissionType) {
                            this.rolePermissionType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfRolePermissionType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree rolePermissionTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rolePermissionType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rolePermissionTypePropertyTree!= null):((rolePermissionTypePropertyTree == null)||(!rolePermissionTypePropertyTree.isLeaf())))) {
                        if (_other.rolePermissionType == null) {
                            this.rolePermissionType = null;
                        } else {
                            this.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
                            for (RolePermissionType _item: _other.rolePermissionType) {
                                this.rolePermissionType.add(((_item == null)?null:_item.newCopyBuilder(this, rolePermissionTypePropertyTree, _propertyTreeUse)));
                            }
                        }
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

        protected<_P extends ListOfRolePermissionType >_P init(final _P _product) {
            if (this.rolePermissionType!= null) {
                final List<RolePermissionType> rolePermissionType = new ArrayList<RolePermissionType>(this.rolePermissionType.size());
                for (RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>> _item: this.rolePermissionType) {
                    rolePermissionType.add(_item.build());
                }
                _product.rolePermissionType = rolePermissionType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "rolePermissionType" hinzu.
         * 
         * @param rolePermissionType
         *     Werte, die zur Eigenschaft "rolePermissionType" hinzugefügt werden.
         */
        public ListOfRolePermissionType.Builder<_B> addRolePermissionType(final Iterable<? extends RolePermissionType> rolePermissionType) {
            if (rolePermissionType!= null) {
                if (this.rolePermissionType == null) {
                    this.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
                }
                for (RolePermissionType _item: rolePermissionType) {
                    this.rolePermissionType.add(new RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissionType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param rolePermissionType
         *     Neuer Wert der Eigenschaft "rolePermissionType".
         */
        public ListOfRolePermissionType.Builder<_B> withRolePermissionType(final Iterable<? extends RolePermissionType> rolePermissionType) {
            if (this.rolePermissionType!= null) {
                this.rolePermissionType.clear();
            }
            return addRolePermissionType(rolePermissionType);
        }

        /**
         * Fügt Werte zur Eigenschaft "rolePermissionType" hinzu.
         * 
         * @param rolePermissionType
         *     Werte, die zur Eigenschaft "rolePermissionType" hinzugefügt werden.
         */
        public ListOfRolePermissionType.Builder<_B> addRolePermissionType(RolePermissionType... rolePermissionType) {
            addRolePermissionType(Arrays.asList(rolePermissionType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissionType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param rolePermissionType
         *     Neuer Wert der Eigenschaft "rolePermissionType".
         */
        public ListOfRolePermissionType.Builder<_B> withRolePermissionType(RolePermissionType... rolePermissionType) {
            withRolePermissionType(Arrays.asList(rolePermissionType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "RolePermissionType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.RolePermissionType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "RolePermissionType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.RolePermissionType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public RolePermissionType.Builder<? extends ListOfRolePermissionType.Builder<_B>> addRolePermissionType() {
            if (this.rolePermissionType == null) {
                this.rolePermissionType = new ArrayList<RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>>();
            }
            final RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>> rolePermissionType_Builder = new RolePermissionType.Builder<ListOfRolePermissionType.Builder<_B>>(this, null, false);
            this.rolePermissionType.add(rolePermissionType_Builder);
            return rolePermissionType_Builder;
        }

        @Override
        public ListOfRolePermissionType build() {
            if (_storedValue == null) {
                return this.init(new ListOfRolePermissionType());
            } else {
                return ((ListOfRolePermissionType) _storedValue);
            }
        }

        public ListOfRolePermissionType.Builder<_B> copyOf(final ListOfRolePermissionType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfRolePermissionType.Builder<_B> copyOf(final ListOfRolePermissionType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfRolePermissionType.Selector<ListOfRolePermissionType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfRolePermissionType.Select _root() {
            return new ListOfRolePermissionType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private RolePermissionType.Selector<TRoot, ListOfRolePermissionType.Selector<TRoot, TParent>> rolePermissionType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.rolePermissionType!= null) {
                products.put("rolePermissionType", this.rolePermissionType.init());
            }
            return products;
        }

        public RolePermissionType.Selector<TRoot, ListOfRolePermissionType.Selector<TRoot, TParent>> rolePermissionType() {
            return ((this.rolePermissionType == null)?this.rolePermissionType = new RolePermissionType.Selector<TRoot, ListOfRolePermissionType.Selector<TRoot, TParent>>(this._root, this, "rolePermissionType"):this.rolePermissionType);
        }

    }

}
