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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataTypeSchemaHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataTypeSchemaHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Namespaces" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="StructureDataTypes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStructureDescription" minOccurs="0"/&gt;
 *         &lt;element name="EnumDataTypes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEnumDescription" minOccurs="0"/&gt;
 *         &lt;element name="SimpleDataTypes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSimpleTypeDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeSchemaHeader", propOrder = {
    "namespaces",
    "structureDataTypes",
    "enumDataTypes",
    "simpleDataTypes"
})
@XmlSeeAlso({
    UABinaryFileDataType.class,
    DataSetMetaDataType.class
})
public class DataTypeSchemaHeader {

    @XmlElementRef(name = "Namespaces", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> namespaces;
    @XmlElementRef(name = "StructureDataTypes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStructureDescription> structureDataTypes;
    @XmlElementRef(name = "EnumDataTypes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEnumDescription> enumDataTypes;
    @XmlElementRef(name = "SimpleDataTypes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSimpleTypeDescription> simpleDataTypes;

    /**
     * Ruft den Wert der namespaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getNamespaces() {
        return namespaces;
    }

    /**
     * Legt den Wert der namespaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setNamespaces(JAXBElement<ListOfString> value) {
        this.namespaces = value;
    }

    /**
     * Ruft den Wert der structureDataTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStructureDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfStructureDescription> getStructureDataTypes() {
        return structureDataTypes;
    }

    /**
     * Legt den Wert der structureDataTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStructureDescription }{@code >}
     *     
     */
    public void setStructureDataTypes(JAXBElement<ListOfStructureDescription> value) {
        this.structureDataTypes = value;
    }

    /**
     * Ruft den Wert der enumDataTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEnumDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfEnumDescription> getEnumDataTypes() {
        return enumDataTypes;
    }

    /**
     * Legt den Wert der enumDataTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEnumDescription }{@code >}
     *     
     */
    public void setEnumDataTypes(JAXBElement<ListOfEnumDescription> value) {
        this.enumDataTypes = value;
    }

    /**
     * Ruft den Wert der simpleDataTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleTypeDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfSimpleTypeDescription> getSimpleDataTypes() {
        return simpleDataTypes;
    }

    /**
     * Legt den Wert der simpleDataTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleTypeDescription }{@code >}
     *     
     */
    public void setSimpleDataTypes(JAXBElement<ListOfSimpleTypeDescription> value) {
        this.simpleDataTypes = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeSchemaHeader.Builder<_B> _other) {
        _other.namespaces = this.namespaces;
        _other.structureDataTypes = this.structureDataTypes;
        _other.enumDataTypes = this.enumDataTypes;
        _other.simpleDataTypes = this.simpleDataTypes;
    }

    public<_B >DataTypeSchemaHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataTypeSchemaHeader.Builder<_B>(_parentBuilder, this, true);
    }

    public DataTypeSchemaHeader.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataTypeSchemaHeader.Builder<Void> builder() {
        return new DataTypeSchemaHeader.Builder<Void>(null, null, false);
    }

    public static<_B >DataTypeSchemaHeader.Builder<_B> copyOf(final DataTypeSchemaHeader _other) {
        final DataTypeSchemaHeader.Builder<_B> _newBuilder = new DataTypeSchemaHeader.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataTypeSchemaHeader.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namespacesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaces"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespacesPropertyTree!= null):((namespacesPropertyTree == null)||(!namespacesPropertyTree.isLeaf())))) {
            _other.namespaces = this.namespaces;
        }
        final PropertyTree structureDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDataTypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDataTypesPropertyTree!= null):((structureDataTypesPropertyTree == null)||(!structureDataTypesPropertyTree.isLeaf())))) {
            _other.structureDataTypes = this.structureDataTypes;
        }
        final PropertyTree enumDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDataTypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDataTypesPropertyTree!= null):((enumDataTypesPropertyTree == null)||(!enumDataTypesPropertyTree.isLeaf())))) {
            _other.enumDataTypes = this.enumDataTypes;
        }
        final PropertyTree simpleDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("simpleDataTypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(simpleDataTypesPropertyTree!= null):((simpleDataTypesPropertyTree == null)||(!simpleDataTypesPropertyTree.isLeaf())))) {
            _other.simpleDataTypes = this.simpleDataTypes;
        }
    }

    public<_B >DataTypeSchemaHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataTypeSchemaHeader.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataTypeSchemaHeader.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataTypeSchemaHeader.Builder<_B> copyOf(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeSchemaHeader.Builder<_B> _newBuilder = new DataTypeSchemaHeader.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataTypeSchemaHeader.Builder<Void> copyExcept(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeSchemaHeader.Builder<Void> copyOnly(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataTypeSchemaHeader _storedValue;
        private JAXBElement<ListOfString> namespaces;
        private JAXBElement<ListOfStructureDescription> structureDataTypes;
        private JAXBElement<ListOfEnumDescription> enumDataTypes;
        private JAXBElement<ListOfSimpleTypeDescription> simpleDataTypes;

        public Builder(final _B _parentBuilder, final DataTypeSchemaHeader _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.namespaces = _other.namespaces;
                    this.structureDataTypes = _other.structureDataTypes;
                    this.enumDataTypes = _other.enumDataTypes;
                    this.simpleDataTypes = _other.simpleDataTypes;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataTypeSchemaHeader _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namespacesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaces"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespacesPropertyTree!= null):((namespacesPropertyTree == null)||(!namespacesPropertyTree.isLeaf())))) {
                        this.namespaces = _other.namespaces;
                    }
                    final PropertyTree structureDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDataTypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDataTypesPropertyTree!= null):((structureDataTypesPropertyTree == null)||(!structureDataTypesPropertyTree.isLeaf())))) {
                        this.structureDataTypes = _other.structureDataTypes;
                    }
                    final PropertyTree enumDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDataTypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDataTypesPropertyTree!= null):((enumDataTypesPropertyTree == null)||(!enumDataTypesPropertyTree.isLeaf())))) {
                        this.enumDataTypes = _other.enumDataTypes;
                    }
                    final PropertyTree simpleDataTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("simpleDataTypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(simpleDataTypesPropertyTree!= null):((simpleDataTypesPropertyTree == null)||(!simpleDataTypesPropertyTree.isLeaf())))) {
                        this.simpleDataTypes = _other.simpleDataTypes;
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

        protected<_P extends DataTypeSchemaHeader >_P init(final _P _product) {
            _product.namespaces = this.namespaces;
            _product.structureDataTypes = this.structureDataTypes;
            _product.enumDataTypes = this.enumDataTypes;
            _product.simpleDataTypes = this.simpleDataTypes;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaces" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param namespaces
         *     Neuer Wert der Eigenschaft "namespaces".
         */
        public DataTypeSchemaHeader.Builder<_B> withNamespaces(final JAXBElement<ListOfString> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDataTypes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDataTypes
         *     Neuer Wert der Eigenschaft "structureDataTypes".
         */
        public DataTypeSchemaHeader.Builder<_B> withStructureDataTypes(final JAXBElement<ListOfStructureDescription> structureDataTypes) {
            this.structureDataTypes = structureDataTypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDataTypes
         *     Neuer Wert der Eigenschaft "enumDataTypes".
         */
        public DataTypeSchemaHeader.Builder<_B> withEnumDataTypes(final JAXBElement<ListOfEnumDescription> enumDataTypes) {
            this.enumDataTypes = enumDataTypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "simpleDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param simpleDataTypes
         *     Neuer Wert der Eigenschaft "simpleDataTypes".
         */
        public DataTypeSchemaHeader.Builder<_B> withSimpleDataTypes(final JAXBElement<ListOfSimpleTypeDescription> simpleDataTypes) {
            this.simpleDataTypes = simpleDataTypes;
            return this;
        }

        @Override
        public DataTypeSchemaHeader build() {
            if (_storedValue == null) {
                return this.init(new DataTypeSchemaHeader());
            } else {
                return ((DataTypeSchemaHeader) _storedValue);
            }
        }

        public DataTypeSchemaHeader.Builder<_B> copyOf(final DataTypeSchemaHeader _other) {
            _other.copyTo(this);
            return this;
        }

        public DataTypeSchemaHeader.Builder<_B> copyOf(final DataTypeSchemaHeader.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataTypeSchemaHeader.Selector<DataTypeSchemaHeader.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataTypeSchemaHeader.Select _root() {
            return new DataTypeSchemaHeader.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> namespaces = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> structureDataTypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> enumDataTypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> simpleDataTypes = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.namespaces!= null) {
                products.put("namespaces", this.namespaces.init());
            }
            if (this.structureDataTypes!= null) {
                products.put("structureDataTypes", this.structureDataTypes.init());
            }
            if (this.enumDataTypes!= null) {
                products.put("enumDataTypes", this.enumDataTypes.init());
            }
            if (this.simpleDataTypes!= null) {
                products.put("simpleDataTypes", this.simpleDataTypes.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> namespaces() {
            return ((this.namespaces == null)?this.namespaces = new com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>>(this._root, this, "namespaces"):this.namespaces);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> structureDataTypes() {
            return ((this.structureDataTypes == null)?this.structureDataTypes = new com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>>(this._root, this, "structureDataTypes"):this.structureDataTypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> enumDataTypes() {
            return ((this.enumDataTypes == null)?this.enumDataTypes = new com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>>(this._root, this, "enumDataTypes"):this.enumDataTypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>> simpleDataTypes() {
            return ((this.simpleDataTypes == null)?this.simpleDataTypes = new com.kscs.util.jaxb.Selector<TRoot, DataTypeSchemaHeader.Selector<TRoot, TParent>>(this._root, this, "simpleDataTypes"):this.simpleDataTypes);
        }

    }

}
