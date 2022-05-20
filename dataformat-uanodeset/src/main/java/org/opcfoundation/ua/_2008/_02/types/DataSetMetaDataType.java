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
 * <p>Java-Klasse für DataSetMetaDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSetMetaDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeSchemaHeader"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="Fields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfFieldMetaData" minOccurs="0"/&gt;
 *         &lt;element name="DataSetClassId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Guid" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurationVersion" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ConfigurationVersionDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetMetaDataType", propOrder = {
    "name",
    "description",
    "fields",
    "dataSetClassId",
    "configurationVersion"
})
public class DataSetMetaDataType
    extends DataTypeSchemaHeader
{

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;
    @XmlElementRef(name = "Fields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfFieldMetaData> fields;
    @XmlElement(name = "DataSetClassId")
    protected Guid dataSetClassId;
    @XmlElementRef(name = "ConfigurationVersion", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ConfigurationVersionDataType> configurationVersion;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfFieldMetaData }{@code >}
     *     
     */
    public JAXBElement<ListOfFieldMetaData> getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfFieldMetaData }{@code >}
     *     
     */
    public void setFields(JAXBElement<ListOfFieldMetaData> value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der dataSetClassId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getDataSetClassId() {
        return dataSetClassId;
    }

    /**
     * Legt den Wert der dataSetClassId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setDataSetClassId(Guid value) {
        this.dataSetClassId = value;
    }

    /**
     * Ruft den Wert der configurationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConfigurationVersionDataType }{@code >}
     *     
     */
    public JAXBElement<ConfigurationVersionDataType> getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * Legt den Wert der configurationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConfigurationVersionDataType }{@code >}
     *     
     */
    public void setConfigurationVersion(JAXBElement<ConfigurationVersionDataType> value) {
        this.configurationVersion = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataSetMetaDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.name = this.name;
        _other.description = this.description;
        _other.fields = this.fields;
        _other.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.newCopyBuilder(_other));
        _other.configurationVersion = this.configurationVersion;
    }

    @Override
    public<_B >DataSetMetaDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataSetMetaDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DataSetMetaDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataSetMetaDataType.Builder<Void> builder() {
        return new DataSetMetaDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DataSetMetaDataType.Builder<_B> copyOf(final DataTypeSchemaHeader _other) {
        final DataSetMetaDataType.Builder<_B> _newBuilder = new DataSetMetaDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataSetMetaDataType.Builder<_B> copyOf(final DataSetMetaDataType _other) {
        final DataSetMetaDataType.Builder<_B> _newBuilder = new DataSetMetaDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataSetMetaDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
            _other.description = this.description;
        }
        final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
            _other.fields = this.fields;
        }
        final PropertyTree dataSetClassIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetClassId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetClassIdPropertyTree!= null):((dataSetClassIdPropertyTree == null)||(!dataSetClassIdPropertyTree.isLeaf())))) {
            _other.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.newCopyBuilder(_other, dataSetClassIdPropertyTree, _propertyTreeUse));
        }
        final PropertyTree configurationVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configurationVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configurationVersionPropertyTree!= null):((configurationVersionPropertyTree == null)||(!configurationVersionPropertyTree.isLeaf())))) {
            _other.configurationVersion = this.configurationVersion;
        }
    }

    @Override
    public<_B >DataSetMetaDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataSetMetaDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DataSetMetaDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataSetMetaDataType.Builder<_B> copyOf(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataSetMetaDataType.Builder<_B> _newBuilder = new DataSetMetaDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataSetMetaDataType.Builder<_B> copyOf(final DataSetMetaDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataSetMetaDataType.Builder<_B> _newBuilder = new DataSetMetaDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataSetMetaDataType.Builder<Void> copyExcept(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataSetMetaDataType.Builder<Void> copyExcept(final DataSetMetaDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataSetMetaDataType.Builder<Void> copyOnly(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataSetMetaDataType.Builder<Void> copyOnly(final DataSetMetaDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeSchemaHeader.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> name;
        private JAXBElement<LocalizedText> description;
        private JAXBElement<ListOfFieldMetaData> fields;
        private Guid.Builder<DataSetMetaDataType.Builder<_B>> dataSetClassId;
        private JAXBElement<ConfigurationVersionDataType> configurationVersion;

        public Builder(final _B _parentBuilder, final DataSetMetaDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.name = _other.name;
                this.description = _other.description;
                this.fields = _other.fields;
                this.dataSetClassId = ((_other.dataSetClassId == null)?null:_other.dataSetClassId.newCopyBuilder(this));
                this.configurationVersion = _other.configurationVersion;
            }
        }

        public Builder(final _B _parentBuilder, final DataSetMetaDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                    this.name = _other.name;
                }
                final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
                    this.description = _other.description;
                }
                final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
                    this.fields = _other.fields;
                }
                final PropertyTree dataSetClassIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetClassId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetClassIdPropertyTree!= null):((dataSetClassIdPropertyTree == null)||(!dataSetClassIdPropertyTree.isLeaf())))) {
                    this.dataSetClassId = ((_other.dataSetClassId == null)?null:_other.dataSetClassId.newCopyBuilder(this, dataSetClassIdPropertyTree, _propertyTreeUse));
                }
                final PropertyTree configurationVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configurationVersion"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configurationVersionPropertyTree!= null):((configurationVersionPropertyTree == null)||(!configurationVersionPropertyTree.isLeaf())))) {
                    this.configurationVersion = _other.configurationVersion;
                }
            }
        }

        protected<_P extends DataSetMetaDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.description = this.description;
            _product.fields = this.fields;
            _product.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.build());
            _product.configurationVersion = this.configurationVersion;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public DataSetMetaDataType.Builder<_B> withName(final JAXBElement<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        public DataSetMetaDataType.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fields" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param fields
         *     Neuer Wert der Eigenschaft "fields".
         */
        public DataSetMetaDataType.Builder<_B> withFields(final JAXBElement<ListOfFieldMetaData> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetClassId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetClassId
         *     Neuer Wert der Eigenschaft "dataSetClassId".
         */
        public DataSetMetaDataType.Builder<_B> withDataSetClassId(final Guid dataSetClassId) {
            this.dataSetClassId = ((dataSetClassId == null)?null:new Guid.Builder<DataSetMetaDataType.Builder<_B>>(this, dataSetClassId, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "dataSetClassId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "dataSetClassId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Guid.Builder<? extends DataSetMetaDataType.Builder<_B>> withDataSetClassId() {
            if (this.dataSetClassId!= null) {
                return this.dataSetClassId;
            }
            return this.dataSetClassId = new Guid.Builder<DataSetMetaDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "configurationVersion" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param configurationVersion
         *     Neuer Wert der Eigenschaft "configurationVersion".
         */
        public DataSetMetaDataType.Builder<_B> withConfigurationVersion(final JAXBElement<ConfigurationVersionDataType> configurationVersion) {
            this.configurationVersion = configurationVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaces" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param namespaces
         *     Neuer Wert der Eigenschaft "namespaces".
         */
        @Override
        public DataSetMetaDataType.Builder<_B> withNamespaces(final JAXBElement<ListOfString> namespaces) {
            super.withNamespaces(namespaces);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDataTypes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDataTypes
         *     Neuer Wert der Eigenschaft "structureDataTypes".
         */
        @Override
        public DataSetMetaDataType.Builder<_B> withStructureDataTypes(final JAXBElement<ListOfStructureDescription> structureDataTypes) {
            super.withStructureDataTypes(structureDataTypes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDataTypes
         *     Neuer Wert der Eigenschaft "enumDataTypes".
         */
        @Override
        public DataSetMetaDataType.Builder<_B> withEnumDataTypes(final JAXBElement<ListOfEnumDescription> enumDataTypes) {
            super.withEnumDataTypes(enumDataTypes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "simpleDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param simpleDataTypes
         *     Neuer Wert der Eigenschaft "simpleDataTypes".
         */
        @Override
        public DataSetMetaDataType.Builder<_B> withSimpleDataTypes(final JAXBElement<ListOfSimpleTypeDescription> simpleDataTypes) {
            super.withSimpleDataTypes(simpleDataTypes);
            return this;
        }

        @Override
        public DataSetMetaDataType build() {
            if (_storedValue == null) {
                return this.init(new DataSetMetaDataType());
            } else {
                return ((DataSetMetaDataType) _storedValue);
            }
        }

        public DataSetMetaDataType.Builder<_B> copyOf(final DataSetMetaDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DataSetMetaDataType.Builder<_B> copyOf(final DataSetMetaDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataSetMetaDataType.Selector<DataSetMetaDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataSetMetaDataType.Select _root() {
            return new DataSetMetaDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeSchemaHeader.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> description = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> fields = null;
        private Guid.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> dataSetClassId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> configurationVersion = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.description!= null) {
                products.put("description", this.description.init());
            }
            if (this.fields!= null) {
                products.put("fields", this.fields.init());
            }
            if (this.dataSetClassId!= null) {
                products.put("dataSetClassId", this.dataSetClassId.init());
            }
            if (this.configurationVersion!= null) {
                products.put("configurationVersion", this.configurationVersion.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> fields() {
            return ((this.fields == null)?this.fields = new com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "fields"):this.fields);
        }

        public Guid.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> dataSetClassId() {
            return ((this.dataSetClassId == null)?this.dataSetClassId = new Guid.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetClassId"):this.dataSetClassId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>> configurationVersion() {
            return ((this.configurationVersion == null)?this.configurationVersion = new com.kscs.util.jaxb.Selector<TRoot, DataSetMetaDataType.Selector<TRoot, TParent>>(this._root, this, "configurationVersion"):this.configurationVersion);
        }

    }

}
