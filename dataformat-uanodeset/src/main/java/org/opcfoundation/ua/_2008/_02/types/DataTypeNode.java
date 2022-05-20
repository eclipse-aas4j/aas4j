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
 * <p>Java-Klasse für DataTypeNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataTypeNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}TypeNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeNode", propOrder = {
    "isAbstract",
    "dataTypeDefinition"
})
public class DataTypeNode
    extends TypeNode
{

    @XmlElement(name = "IsAbstract")
    protected Boolean isAbstract;
    @XmlElementRef(name = "DataTypeDefinition", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> dataTypeDefinition;

    /**
     * Ruft den Wert der isAbstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Legt den Wert der isAbstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstract(Boolean value) {
        this.isAbstract = value;
    }

    /**
     * Ruft den Wert der dataTypeDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getDataTypeDefinition() {
        return dataTypeDefinition;
    }

    /**
     * Legt den Wert der dataTypeDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setDataTypeDefinition(JAXBElement<ExtensionObject> value) {
        this.dataTypeDefinition = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeNode.Builder<_B> _other) {
        super.copyTo(_other);
        _other.isAbstract = this.isAbstract;
        _other.dataTypeDefinition = this.dataTypeDefinition;
    }

    @Override
    public<_B >DataTypeNode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataTypeNode.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DataTypeNode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataTypeNode.Builder<Void> builder() {
        return new DataTypeNode.Builder<Void>(null, null, false);
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final Node _other) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final TypeNode _other) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final DataTypeNode _other) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataTypeNode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
            _other.isAbstract = this.isAbstract;
        }
        final PropertyTree dataTypeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDefinitionPropertyTree!= null):((dataTypeDefinitionPropertyTree == null)||(!dataTypeDefinitionPropertyTree.isLeaf())))) {
            _other.dataTypeDefinition = this.dataTypeDefinition;
        }
    }

    @Override
    public<_B >DataTypeNode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataTypeNode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DataTypeNode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final Node _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final TypeNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataTypeNode.Builder<_B> copyOf(final DataTypeNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeNode.Builder<_B> _newBuilder = new DataTypeNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataTypeNode.Builder<Void> copyExcept(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeNode.Builder<Void> copyExcept(final TypeNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeNode.Builder<Void> copyExcept(final DataTypeNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeNode.Builder<Void> copyOnly(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataTypeNode.Builder<Void> copyOnly(final TypeNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataTypeNode.Builder<Void> copyOnly(final DataTypeNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends TypeNode.Builder<_B>
        implements Buildable
    {

        private Boolean isAbstract;
        private JAXBElement<ExtensionObject> dataTypeDefinition;

        public Builder(final _B _parentBuilder, final DataTypeNode _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.isAbstract = _other.isAbstract;
                this.dataTypeDefinition = _other.dataTypeDefinition;
            }
        }

        public Builder(final _B _parentBuilder, final DataTypeNode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
                    this.isAbstract = _other.isAbstract;
                }
                final PropertyTree dataTypeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDefinition"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDefinitionPropertyTree!= null):((dataTypeDefinitionPropertyTree == null)||(!dataTypeDefinitionPropertyTree.isLeaf())))) {
                    this.dataTypeDefinition = _other.dataTypeDefinition;
                }
            }
        }

        protected<_P extends DataTypeNode >_P init(final _P _product) {
            _product.isAbstract = this.isAbstract;
            _product.dataTypeDefinition = this.dataTypeDefinition;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isAbstract" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isAbstract
         *     Neuer Wert der Eigenschaft "isAbstract".
         */
        public DataTypeNode.Builder<_B> withIsAbstract(final Boolean isAbstract) {
            this.isAbstract = isAbstract;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeDefinition
         *     Neuer Wert der Eigenschaft "dataTypeDefinition".
         */
        public DataTypeNode.Builder<_B> withDataTypeDefinition(final JAXBElement<ExtensionObject> dataTypeDefinition) {
            this.dataTypeDefinition = dataTypeDefinition;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public DataTypeNode.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClass" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeClass
         *     Neuer Wert der Eigenschaft "nodeClass".
         */
        @Override
        public DataTypeNode.Builder<_B> withNodeClass(final NodeClass nodeClass) {
            super.withNodeClass(nodeClass);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browseName
         *     Neuer Wert der Eigenschaft "browseName".
         */
        @Override
        public DataTypeNode.Builder<_B> withBrowseName(final JAXBElement<QualifiedName> browseName) {
            super.withBrowseName(browseName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        @Override
        public DataTypeNode.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        @Override
        public DataTypeNode.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            super.withDescription(description);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        @Override
        public DataTypeNode.Builder<_B> withWriteMask(final Long writeMask) {
            super.withWriteMask(writeMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        @Override
        public DataTypeNode.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rolePermissions
         *     Neuer Wert der Eigenschaft "rolePermissions".
         */
        @Override
        public DataTypeNode.Builder<_B> withRolePermissions(final JAXBElement<ListOfRolePermissionType> rolePermissions) {
            super.withRolePermissions(rolePermissions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userRolePermissions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userRolePermissions
         *     Neuer Wert der Eigenschaft "userRolePermissions".
         */
        @Override
        public DataTypeNode.Builder<_B> withUserRolePermissions(final JAXBElement<ListOfRolePermissionType> userRolePermissions) {
            super.withUserRolePermissions(userRolePermissions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "accessRestrictions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param accessRestrictions
         *     Neuer Wert der Eigenschaft "accessRestrictions".
         */
        @Override
        public DataTypeNode.Builder<_B> withAccessRestrictions(final Integer accessRestrictions) {
            super.withAccessRestrictions(accessRestrictions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "references" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param references
         *     Neuer Wert der Eigenschaft "references".
         */
        @Override
        public DataTypeNode.Builder<_B> withReferences(final JAXBElement<ListOfReferenceNode> references) {
            super.withReferences(references);
            return this;
        }

        @Override
        public DataTypeNode build() {
            if (_storedValue == null) {
                return this.init(new DataTypeNode());
            } else {
                return ((DataTypeNode) _storedValue);
            }
        }

        public DataTypeNode.Builder<_B> copyOf(final DataTypeNode _other) {
            _other.copyTo(this);
            return this;
        }

        public DataTypeNode.Builder<_B> copyOf(final DataTypeNode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataTypeNode.Selector<DataTypeNode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataTypeNode.Select _root() {
            return new DataTypeNode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends TypeNode.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>> isAbstract = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>> dataTypeDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.isAbstract!= null) {
                products.put("isAbstract", this.isAbstract.init());
            }
            if (this.dataTypeDefinition!= null) {
                products.put("dataTypeDefinition", this.dataTypeDefinition.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>> isAbstract() {
            return ((this.isAbstract == null)?this.isAbstract = new com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>>(this._root, this, "isAbstract"):this.isAbstract);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>> dataTypeDefinition() {
            return ((this.dataTypeDefinition == null)?this.dataTypeDefinition = new com.kscs.util.jaxb.Selector<TRoot, DataTypeNode.Selector<TRoot, TParent>>(this._root, this, "dataTypeDefinition"):this.dataTypeDefinition);
        }

    }

}
