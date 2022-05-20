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
 * <p>Java-Klasse für PublishedDataSetDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishedDataSetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSetFolder" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="DataSetMetaData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetMetaDataType" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionFields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="DataSetSource" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishedDataSetDataType", propOrder = {
    "name",
    "dataSetFolder",
    "dataSetMetaData",
    "extensionFields",
    "dataSetSource"
})
public class PublishedDataSetDataType {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "DataSetFolder", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> dataSetFolder;
    @XmlElementRef(name = "DataSetMetaData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DataSetMetaDataType> dataSetMetaData;
    @XmlElementRef(name = "ExtensionFields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> extensionFields;
    @XmlElementRef(name = "DataSetSource", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> dataSetSource;

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
     * Ruft den Wert der dataSetFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getDataSetFolder() {
        return dataSetFolder;
    }

    /**
     * Legt den Wert der dataSetFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setDataSetFolder(JAXBElement<ListOfString> value) {
        this.dataSetFolder = value;
    }

    /**
     * Ruft den Wert der dataSetMetaData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataSetMetaDataType }{@code >}
     *     
     */
    public JAXBElement<DataSetMetaDataType> getDataSetMetaData() {
        return dataSetMetaData;
    }

    /**
     * Legt den Wert der dataSetMetaData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataSetMetaDataType }{@code >}
     *     
     */
    public void setDataSetMetaData(JAXBElement<DataSetMetaDataType> value) {
        this.dataSetMetaData = value;
    }

    /**
     * Ruft den Wert der extensionFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getExtensionFields() {
        return extensionFields;
    }

    /**
     * Legt den Wert der extensionFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setExtensionFields(JAXBElement<ListOfKeyValuePair> value) {
        this.extensionFields = value;
    }

    /**
     * Ruft den Wert der dataSetSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getDataSetSource() {
        return dataSetSource;
    }

    /**
     * Legt den Wert der dataSetSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setDataSetSource(JAXBElement<ExtensionObject> value) {
        this.dataSetSource = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishedDataSetDataType.Builder<_B> _other) {
        _other.name = this.name;
        _other.dataSetFolder = this.dataSetFolder;
        _other.dataSetMetaData = this.dataSetMetaData;
        _other.extensionFields = this.extensionFields;
        _other.dataSetSource = this.dataSetSource;
    }

    public<_B >PublishedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishedDataSetDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public PublishedDataSetDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishedDataSetDataType.Builder<Void> builder() {
        return new PublishedDataSetDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PublishedDataSetDataType.Builder<_B> copyOf(final PublishedDataSetDataType _other) {
        final PublishedDataSetDataType.Builder<_B> _newBuilder = new PublishedDataSetDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishedDataSetDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree dataSetFolderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFolder"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFolderPropertyTree!= null):((dataSetFolderPropertyTree == null)||(!dataSetFolderPropertyTree.isLeaf())))) {
            _other.dataSetFolder = this.dataSetFolder;
        }
        final PropertyTree dataSetMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataPropertyTree!= null):((dataSetMetaDataPropertyTree == null)||(!dataSetMetaDataPropertyTree.isLeaf())))) {
            _other.dataSetMetaData = this.dataSetMetaData;
        }
        final PropertyTree extensionFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("extensionFields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(extensionFieldsPropertyTree!= null):((extensionFieldsPropertyTree == null)||(!extensionFieldsPropertyTree.isLeaf())))) {
            _other.extensionFields = this.extensionFields;
        }
        final PropertyTree dataSetSourcePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetSource"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetSourcePropertyTree!= null):((dataSetSourcePropertyTree == null)||(!dataSetSourcePropertyTree.isLeaf())))) {
            _other.dataSetSource = this.dataSetSource;
        }
    }

    public<_B >PublishedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishedDataSetDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PublishedDataSetDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishedDataSetDataType.Builder<_B> copyOf(final PublishedDataSetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedDataSetDataType.Builder<_B> _newBuilder = new PublishedDataSetDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishedDataSetDataType.Builder<Void> copyExcept(final PublishedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedDataSetDataType.Builder<Void> copyOnly(final PublishedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PublishedDataSetDataType _storedValue;
        private JAXBElement<String> name;
        private JAXBElement<ListOfString> dataSetFolder;
        private JAXBElement<DataSetMetaDataType> dataSetMetaData;
        private JAXBElement<ListOfKeyValuePair> extensionFields;
        private JAXBElement<ExtensionObject> dataSetSource;

        public Builder(final _B _parentBuilder, final PublishedDataSetDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.dataSetFolder = _other.dataSetFolder;
                    this.dataSetMetaData = _other.dataSetMetaData;
                    this.extensionFields = _other.extensionFields;
                    this.dataSetSource = _other.dataSetSource;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PublishedDataSetDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree dataSetFolderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFolder"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFolderPropertyTree!= null):((dataSetFolderPropertyTree == null)||(!dataSetFolderPropertyTree.isLeaf())))) {
                        this.dataSetFolder = _other.dataSetFolder;
                    }
                    final PropertyTree dataSetMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataPropertyTree!= null):((dataSetMetaDataPropertyTree == null)||(!dataSetMetaDataPropertyTree.isLeaf())))) {
                        this.dataSetMetaData = _other.dataSetMetaData;
                    }
                    final PropertyTree extensionFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("extensionFields"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(extensionFieldsPropertyTree!= null):((extensionFieldsPropertyTree == null)||(!extensionFieldsPropertyTree.isLeaf())))) {
                        this.extensionFields = _other.extensionFields;
                    }
                    final PropertyTree dataSetSourcePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetSource"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetSourcePropertyTree!= null):((dataSetSourcePropertyTree == null)||(!dataSetSourcePropertyTree.isLeaf())))) {
                        this.dataSetSource = _other.dataSetSource;
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

        protected<_P extends PublishedDataSetDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.dataSetFolder = this.dataSetFolder;
            _product.dataSetMetaData = this.dataSetMetaData;
            _product.extensionFields = this.extensionFields;
            _product.dataSetSource = this.dataSetSource;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public PublishedDataSetDataType.Builder<_B> withName(final JAXBElement<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFolder" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetFolder
         *     Neuer Wert der Eigenschaft "dataSetFolder".
         */
        public PublishedDataSetDataType.Builder<_B> withDataSetFolder(final JAXBElement<ListOfString> dataSetFolder) {
            this.dataSetFolder = dataSetFolder;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMetaData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetMetaData
         *     Neuer Wert der Eigenschaft "dataSetMetaData".
         */
        public PublishedDataSetDataType.Builder<_B> withDataSetMetaData(final JAXBElement<DataSetMetaDataType> dataSetMetaData) {
            this.dataSetMetaData = dataSetMetaData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "extensionFields" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param extensionFields
         *     Neuer Wert der Eigenschaft "extensionFields".
         */
        public PublishedDataSetDataType.Builder<_B> withExtensionFields(final JAXBElement<ListOfKeyValuePair> extensionFields) {
            this.extensionFields = extensionFields;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetSource" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetSource
         *     Neuer Wert der Eigenschaft "dataSetSource".
         */
        public PublishedDataSetDataType.Builder<_B> withDataSetSource(final JAXBElement<ExtensionObject> dataSetSource) {
            this.dataSetSource = dataSetSource;
            return this;
        }

        @Override
        public PublishedDataSetDataType build() {
            if (_storedValue == null) {
                return this.init(new PublishedDataSetDataType());
            } else {
                return ((PublishedDataSetDataType) _storedValue);
            }
        }

        public PublishedDataSetDataType.Builder<_B> copyOf(final PublishedDataSetDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishedDataSetDataType.Builder<_B> copyOf(final PublishedDataSetDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishedDataSetDataType.Selector<PublishedDataSetDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishedDataSetDataType.Select _root() {
            return new PublishedDataSetDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetFolder = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetMetaData = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> extensionFields = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetSource = null;

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
            if (this.dataSetFolder!= null) {
                products.put("dataSetFolder", this.dataSetFolder.init());
            }
            if (this.dataSetMetaData!= null) {
                products.put("dataSetMetaData", this.dataSetMetaData.init());
            }
            if (this.extensionFields!= null) {
                products.put("extensionFields", this.extensionFields.init());
            }
            if (this.dataSetSource!= null) {
                products.put("dataSetSource", this.dataSetSource.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetFolder() {
            return ((this.dataSetFolder == null)?this.dataSetFolder = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetFolder"):this.dataSetFolder);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetMetaData() {
            return ((this.dataSetMetaData == null)?this.dataSetMetaData = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMetaData"):this.dataSetMetaData);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> extensionFields() {
            return ((this.extensionFields == null)?this.extensionFields = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "extensionFields"):this.extensionFields);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>> dataSetSource() {
            return ((this.dataSetSource == null)?this.dataSetSource = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetSource"):this.dataSetSource);
        }

    }

}
