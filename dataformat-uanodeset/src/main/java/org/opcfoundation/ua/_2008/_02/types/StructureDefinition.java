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
 * <p>Java-Klasse für StructureDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StructureDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultEncodingId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="BaseDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="StructureType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StructureType" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStructureField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureDefinition", propOrder = {
    "defaultEncodingId",
    "baseDataType",
    "structureType",
    "fields"
})
public class StructureDefinition
    extends DataTypeDefinition
{

    @XmlElementRef(name = "DefaultEncodingId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> defaultEncodingId;
    @XmlElementRef(name = "BaseDataType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> baseDataType;
    @XmlElement(name = "StructureType")
    @XmlSchemaType(name = "string")
    protected StructureType structureType;
    @XmlElementRef(name = "Fields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStructureField> fields;

    /**
     * Ruft den Wert der defaultEncodingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getDefaultEncodingId() {
        return defaultEncodingId;
    }

    /**
     * Legt den Wert der defaultEncodingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setDefaultEncodingId(JAXBElement<NodeId> value) {
        this.defaultEncodingId = value;
    }

    /**
     * Ruft den Wert der baseDataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getBaseDataType() {
        return baseDataType;
    }

    /**
     * Legt den Wert der baseDataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setBaseDataType(JAXBElement<NodeId> value) {
        this.baseDataType = value;
    }

    /**
     * Ruft den Wert der structureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StructureType }
     *     
     */
    public StructureType getStructureType() {
        return structureType;
    }

    /**
     * Legt den Wert der structureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureType }
     *     
     */
    public void setStructureType(StructureType value) {
        this.structureType = value;
    }

    /**
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStructureField }{@code >}
     *     
     */
    public JAXBElement<ListOfStructureField> getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStructureField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ListOfStructureField> value) {
        this.fields = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final StructureDefinition.Builder<_B> _other) {
        super.copyTo(_other);
        _other.defaultEncodingId = this.defaultEncodingId;
        _other.baseDataType = this.baseDataType;
        _other.structureType = this.structureType;
        _other.fields = this.fields;
    }

    @Override
    public<_B >StructureDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new StructureDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public StructureDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static StructureDefinition.Builder<Void> builder() {
        return new StructureDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >StructureDefinition.Builder<_B> copyOf(final DataTypeDefinition _other) {
        final StructureDefinition.Builder<_B> _newBuilder = new StructureDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >StructureDefinition.Builder<_B> copyOf(final StructureDefinition _other) {
        final StructureDefinition.Builder<_B> _newBuilder = new StructureDefinition.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final StructureDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree defaultEncodingIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("defaultEncodingId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(defaultEncodingIdPropertyTree!= null):((defaultEncodingIdPropertyTree == null)||(!defaultEncodingIdPropertyTree.isLeaf())))) {
            _other.defaultEncodingId = this.defaultEncodingId;
        }
        final PropertyTree baseDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("baseDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(baseDataTypePropertyTree!= null):((baseDataTypePropertyTree == null)||(!baseDataTypePropertyTree.isLeaf())))) {
            _other.baseDataType = this.baseDataType;
        }
        final PropertyTree structureTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureTypePropertyTree!= null):((structureTypePropertyTree == null)||(!structureTypePropertyTree.isLeaf())))) {
            _other.structureType = this.structureType;
        }
        final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
            _other.fields = this.fields;
        }
    }

    @Override
    public<_B >StructureDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new StructureDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public StructureDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >StructureDefinition.Builder<_B> copyOf(final DataTypeDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StructureDefinition.Builder<_B> _newBuilder = new StructureDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >StructureDefinition.Builder<_B> copyOf(final StructureDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StructureDefinition.Builder<_B> _newBuilder = new StructureDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static StructureDefinition.Builder<Void> copyExcept(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StructureDefinition.Builder<Void> copyExcept(final StructureDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StructureDefinition.Builder<Void> copyOnly(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static StructureDefinition.Builder<Void> copyOnly(final StructureDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeDefinition.Builder<_B>
        implements Buildable
    {

        private JAXBElement<NodeId> defaultEncodingId;
        private JAXBElement<NodeId> baseDataType;
        private StructureType structureType;
        private JAXBElement<ListOfStructureField> fields;

        public Builder(final _B _parentBuilder, final StructureDefinition _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.defaultEncodingId = _other.defaultEncodingId;
                this.baseDataType = _other.baseDataType;
                this.structureType = _other.structureType;
                this.fields = _other.fields;
            }
        }

        public Builder(final _B _parentBuilder, final StructureDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree defaultEncodingIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("defaultEncodingId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(defaultEncodingIdPropertyTree!= null):((defaultEncodingIdPropertyTree == null)||(!defaultEncodingIdPropertyTree.isLeaf())))) {
                    this.defaultEncodingId = _other.defaultEncodingId;
                }
                final PropertyTree baseDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("baseDataType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(baseDataTypePropertyTree!= null):((baseDataTypePropertyTree == null)||(!baseDataTypePropertyTree.isLeaf())))) {
                    this.baseDataType = _other.baseDataType;
                }
                final PropertyTree structureTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureTypePropertyTree!= null):((structureTypePropertyTree == null)||(!structureTypePropertyTree.isLeaf())))) {
                    this.structureType = _other.structureType;
                }
                final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
                    this.fields = _other.fields;
                }
            }
        }

        protected<_P extends StructureDefinition >_P init(final _P _product) {
            _product.defaultEncodingId = this.defaultEncodingId;
            _product.baseDataType = this.baseDataType;
            _product.structureType = this.structureType;
            _product.fields = this.fields;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "defaultEncodingId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param defaultEncodingId
         *     Neuer Wert der Eigenschaft "defaultEncodingId".
         */
        public StructureDefinition.Builder<_B> withDefaultEncodingId(final JAXBElement<NodeId> defaultEncodingId) {
            this.defaultEncodingId = defaultEncodingId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "baseDataType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param baseDataType
         *     Neuer Wert der Eigenschaft "baseDataType".
         */
        public StructureDefinition.Builder<_B> withBaseDataType(final JAXBElement<NodeId> baseDataType) {
            this.baseDataType = baseDataType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param structureType
         *     Neuer Wert der Eigenschaft "structureType".
         */
        public StructureDefinition.Builder<_B> withStructureType(final StructureType structureType) {
            this.structureType = structureType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fields" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param fields
         *     Neuer Wert der Eigenschaft "fields".
         */
        public StructureDefinition.Builder<_B> withFields(final JAXBElement<ListOfStructureField> fields) {
            this.fields = fields;
            return this;
        }

        @Override
        public StructureDefinition build() {
            if (_storedValue == null) {
                return this.init(new StructureDefinition());
            } else {
                return ((StructureDefinition) _storedValue);
            }
        }

        public StructureDefinition.Builder<_B> copyOf(final StructureDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public StructureDefinition.Builder<_B> copyOf(final StructureDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends StructureDefinition.Selector<StructureDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static StructureDefinition.Select _root() {
            return new StructureDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeDefinition.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> defaultEncodingId = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> baseDataType = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> structureType = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> fields = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.defaultEncodingId!= null) {
                products.put("defaultEncodingId", this.defaultEncodingId.init());
            }
            if (this.baseDataType!= null) {
                products.put("baseDataType", this.baseDataType.init());
            }
            if (this.structureType!= null) {
                products.put("structureType", this.structureType.init());
            }
            if (this.fields!= null) {
                products.put("fields", this.fields.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> defaultEncodingId() {
            return ((this.defaultEncodingId == null)?this.defaultEncodingId = new com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>>(this._root, this, "defaultEncodingId"):this.defaultEncodingId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> baseDataType() {
            return ((this.baseDataType == null)?this.baseDataType = new com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>>(this._root, this, "baseDataType"):this.baseDataType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> structureType() {
            return ((this.structureType == null)?this.structureType = new com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>>(this._root, this, "structureType"):this.structureType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>> fields() {
            return ((this.fields == null)?this.fields = new com.kscs.util.jaxb.Selector<TRoot, StructureDefinition.Selector<TRoot, TParent>>(this._root, this, "fields"):this.fields);
        }

    }

}
