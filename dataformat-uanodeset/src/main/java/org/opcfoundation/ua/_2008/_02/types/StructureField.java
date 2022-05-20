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
 * <p>Java-Klasse für StructureField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StructureField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ValueRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ArrayDimensions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *         &lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IsOptional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureField", propOrder = {
    "name",
    "description",
    "dataType",
    "valueRank",
    "arrayDimensions",
    "maxStringLength",
    "isOptional"
})
public class StructureField {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;
    @XmlElementRef(name = "DataType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> dataType;
    @XmlElement(name = "ValueRank")
    protected Integer valueRank;
    @XmlElementRef(name = "ArrayDimensions", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> arrayDimensions;
    @XmlElement(name = "MaxStringLength")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxStringLength;
    @XmlElement(name = "IsOptional")
    protected Boolean isOptional;

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
     * Ruft den Wert der dataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getDataType() {
        return dataType;
    }

    /**
     * Legt den Wert der dataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setDataType(JAXBElement<NodeId> value) {
        this.dataType = value;
    }

    /**
     * Ruft den Wert der valueRank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueRank() {
        return valueRank;
    }

    /**
     * Legt den Wert der valueRank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueRank(Integer value) {
        this.valueRank = value;
    }

    /**
     * Ruft den Wert der arrayDimensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getArrayDimensions() {
        return arrayDimensions;
    }

    /**
     * Legt den Wert der arrayDimensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setArrayDimensions(JAXBElement<ListOfUInt32> value) {
        this.arrayDimensions = value;
    }

    /**
     * Ruft den Wert der maxStringLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Legt den Wert der maxStringLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxStringLength(Long value) {
        this.maxStringLength = value;
    }

    /**
     * Ruft den Wert der isOptional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOptional() {
        return isOptional;
    }

    /**
     * Legt den Wert der isOptional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOptional(Boolean value) {
        this.isOptional = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final StructureField.Builder<_B> _other) {
        _other.name = this.name;
        _other.description = this.description;
        _other.dataType = this.dataType;
        _other.valueRank = this.valueRank;
        _other.arrayDimensions = this.arrayDimensions;
        _other.maxStringLength = this.maxStringLength;
        _other.isOptional = this.isOptional;
    }

    public<_B >StructureField.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new StructureField.Builder<_B>(_parentBuilder, this, true);
    }

    public StructureField.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static StructureField.Builder<Void> builder() {
        return new StructureField.Builder<Void>(null, null, false);
    }

    public static<_B >StructureField.Builder<_B> copyOf(final StructureField _other) {
        final StructureField.Builder<_B> _newBuilder = new StructureField.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final StructureField.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
            _other.description = this.description;
        }
        final PropertyTree dataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypePropertyTree!= null):((dataTypePropertyTree == null)||(!dataTypePropertyTree.isLeaf())))) {
            _other.dataType = this.dataType;
        }
        final PropertyTree valueRankPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("valueRank"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valueRankPropertyTree!= null):((valueRankPropertyTree == null)||(!valueRankPropertyTree.isLeaf())))) {
            _other.valueRank = this.valueRank;
        }
        final PropertyTree arrayDimensionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("arrayDimensions"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(arrayDimensionsPropertyTree!= null):((arrayDimensionsPropertyTree == null)||(!arrayDimensionsPropertyTree.isLeaf())))) {
            _other.arrayDimensions = this.arrayDimensions;
        }
        final PropertyTree maxStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxStringLength"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxStringLengthPropertyTree!= null):((maxStringLengthPropertyTree == null)||(!maxStringLengthPropertyTree.isLeaf())))) {
            _other.maxStringLength = this.maxStringLength;
        }
        final PropertyTree isOptionalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isOptional"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isOptionalPropertyTree!= null):((isOptionalPropertyTree == null)||(!isOptionalPropertyTree.isLeaf())))) {
            _other.isOptional = this.isOptional;
        }
    }

    public<_B >StructureField.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new StructureField.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public StructureField.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >StructureField.Builder<_B> copyOf(final StructureField _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StructureField.Builder<_B> _newBuilder = new StructureField.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static StructureField.Builder<Void> copyExcept(final StructureField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StructureField.Builder<Void> copyOnly(final StructureField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final StructureField _storedValue;
        private JAXBElement<String> name;
        private JAXBElement<LocalizedText> description;
        private JAXBElement<NodeId> dataType;
        private Integer valueRank;
        private JAXBElement<ListOfUInt32> arrayDimensions;
        private Long maxStringLength;
        private Boolean isOptional;

        public Builder(final _B _parentBuilder, final StructureField _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.description = _other.description;
                    this.dataType = _other.dataType;
                    this.valueRank = _other.valueRank;
                    this.arrayDimensions = _other.arrayDimensions;
                    this.maxStringLength = _other.maxStringLength;
                    this.isOptional = _other.isOptional;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final StructureField _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
                        this.description = _other.description;
                    }
                    final PropertyTree dataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypePropertyTree!= null):((dataTypePropertyTree == null)||(!dataTypePropertyTree.isLeaf())))) {
                        this.dataType = _other.dataType;
                    }
                    final PropertyTree valueRankPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("valueRank"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valueRankPropertyTree!= null):((valueRankPropertyTree == null)||(!valueRankPropertyTree.isLeaf())))) {
                        this.valueRank = _other.valueRank;
                    }
                    final PropertyTree arrayDimensionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("arrayDimensions"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(arrayDimensionsPropertyTree!= null):((arrayDimensionsPropertyTree == null)||(!arrayDimensionsPropertyTree.isLeaf())))) {
                        this.arrayDimensions = _other.arrayDimensions;
                    }
                    final PropertyTree maxStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxStringLength"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxStringLengthPropertyTree!= null):((maxStringLengthPropertyTree == null)||(!maxStringLengthPropertyTree.isLeaf())))) {
                        this.maxStringLength = _other.maxStringLength;
                    }
                    final PropertyTree isOptionalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isOptional"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isOptionalPropertyTree!= null):((isOptionalPropertyTree == null)||(!isOptionalPropertyTree.isLeaf())))) {
                        this.isOptional = _other.isOptional;
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

        protected<_P extends StructureField >_P init(final _P _product) {
            _product.name = this.name;
            _product.description = this.description;
            _product.dataType = this.dataType;
            _product.valueRank = this.valueRank;
            _product.arrayDimensions = this.arrayDimensions;
            _product.maxStringLength = this.maxStringLength;
            _product.isOptional = this.isOptional;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public StructureField.Builder<_B> withName(final JAXBElement<String> name) {
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
        public StructureField.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataType
         *     Neuer Wert der Eigenschaft "dataType".
         */
        public StructureField.Builder<_B> withDataType(final JAXBElement<NodeId> dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "valueRank" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param valueRank
         *     Neuer Wert der Eigenschaft "valueRank".
         */
        public StructureField.Builder<_B> withValueRank(final Integer valueRank) {
            this.valueRank = valueRank;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "arrayDimensions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param arrayDimensions
         *     Neuer Wert der Eigenschaft "arrayDimensions".
         */
        public StructureField.Builder<_B> withArrayDimensions(final JAXBElement<ListOfUInt32> arrayDimensions) {
            this.arrayDimensions = arrayDimensions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxStringLength" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param maxStringLength
         *     Neuer Wert der Eigenschaft "maxStringLength".
         */
        public StructureField.Builder<_B> withMaxStringLength(final Long maxStringLength) {
            this.maxStringLength = maxStringLength;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isOptional" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isOptional
         *     Neuer Wert der Eigenschaft "isOptional".
         */
        public StructureField.Builder<_B> withIsOptional(final Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }

        @Override
        public StructureField build() {
            if (_storedValue == null) {
                return this.init(new StructureField());
            } else {
                return ((StructureField) _storedValue);
            }
        }

        public StructureField.Builder<_B> copyOf(final StructureField _other) {
            _other.copyTo(this);
            return this;
        }

        public StructureField.Builder<_B> copyOf(final StructureField.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends StructureField.Selector<StructureField.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static StructureField.Select _root() {
            return new StructureField.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> description = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> dataType = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> valueRank = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> arrayDimensions = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> maxStringLength = null;
        private com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> isOptional = null;

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
            if (this.dataType!= null) {
                products.put("dataType", this.dataType.init());
            }
            if (this.valueRank!= null) {
                products.put("valueRank", this.valueRank.init());
            }
            if (this.arrayDimensions!= null) {
                products.put("arrayDimensions", this.arrayDimensions.init());
            }
            if (this.maxStringLength!= null) {
                products.put("maxStringLength", this.maxStringLength.init());
            }
            if (this.isOptional!= null) {
                products.put("isOptional", this.isOptional.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> dataType() {
            return ((this.dataType == null)?this.dataType = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "dataType"):this.dataType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> valueRank() {
            return ((this.valueRank == null)?this.valueRank = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "valueRank"):this.valueRank);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> arrayDimensions() {
            return ((this.arrayDimensions == null)?this.arrayDimensions = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "arrayDimensions"):this.arrayDimensions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> maxStringLength() {
            return ((this.maxStringLength == null)?this.maxStringLength = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "maxStringLength"):this.maxStringLength);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>> isOptional() {
            return ((this.isOptional == null)?this.isOptional = new com.kscs.util.jaxb.Selector<TRoot, StructureField.Selector<TRoot, TParent>>(this._root, this, "isOptional"):this.isOptional);
        }

    }

}
