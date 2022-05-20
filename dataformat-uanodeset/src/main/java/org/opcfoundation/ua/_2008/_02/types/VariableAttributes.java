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
 * <p>Java-Klasse für VariableAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VariableAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ValueRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ArrayDimensions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *         &lt;element name="AccessLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="UserAccessLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Historizing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableAttributes", propOrder = {
    "value",
    "dataType",
    "valueRank",
    "arrayDimensions",
    "accessLevel",
    "userAccessLevel",
    "minimumSamplingInterval",
    "historizing"
})
public class VariableAttributes
    extends NodeAttributes
{

    @XmlElement(name = "Value")
    protected Variant value;
    @XmlElementRef(name = "DataType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> dataType;
    @XmlElement(name = "ValueRank")
    protected Integer valueRank;
    @XmlElementRef(name = "ArrayDimensions", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> arrayDimensions;
    @XmlElement(name = "AccessLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected Short accessLevel;
    @XmlElement(name = "UserAccessLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected Short userAccessLevel;
    @XmlElement(name = "MinimumSamplingInterval")
    protected Double minimumSamplingInterval;
    @XmlElement(name = "Historizing")
    protected Boolean historizing;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setValue(Variant value) {
        this.value = value;
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
     * Ruft den Wert der accessLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAccessLevel() {
        return accessLevel;
    }

    /**
     * Legt den Wert der accessLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAccessLevel(Short value) {
        this.accessLevel = value;
    }

    /**
     * Ruft den Wert der userAccessLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserAccessLevel() {
        return userAccessLevel;
    }

    /**
     * Legt den Wert der userAccessLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserAccessLevel(Short value) {
        this.userAccessLevel = value;
    }

    /**
     * Ruft den Wert der minimumSamplingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumSamplingInterval() {
        return minimumSamplingInterval;
    }

    /**
     * Legt den Wert der minimumSamplingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumSamplingInterval(Double value) {
        this.minimumSamplingInterval = value;
    }

    /**
     * Ruft den Wert der historizing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistorizing() {
        return historizing;
    }

    /**
     * Legt den Wert der historizing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistorizing(Boolean value) {
        this.historizing = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final VariableAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other));
        _other.dataType = this.dataType;
        _other.valueRank = this.valueRank;
        _other.arrayDimensions = this.arrayDimensions;
        _other.accessLevel = this.accessLevel;
        _other.userAccessLevel = this.userAccessLevel;
        _other.minimumSamplingInterval = this.minimumSamplingInterval;
        _other.historizing = this.historizing;
    }

    @Override
    public<_B >VariableAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new VariableAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public VariableAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static VariableAttributes.Builder<Void> builder() {
        return new VariableAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >VariableAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final VariableAttributes.Builder<_B> _newBuilder = new VariableAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >VariableAttributes.Builder<_B> copyOf(final VariableAttributes _other) {
        final VariableAttributes.Builder<_B> _newBuilder = new VariableAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final VariableAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other, valuePropertyTree, _propertyTreeUse));
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
        final PropertyTree accessLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("accessLevel"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(accessLevelPropertyTree!= null):((accessLevelPropertyTree == null)||(!accessLevelPropertyTree.isLeaf())))) {
            _other.accessLevel = this.accessLevel;
        }
        final PropertyTree userAccessLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userAccessLevel"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userAccessLevelPropertyTree!= null):((userAccessLevelPropertyTree == null)||(!userAccessLevelPropertyTree.isLeaf())))) {
            _other.userAccessLevel = this.userAccessLevel;
        }
        final PropertyTree minimumSamplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("minimumSamplingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(minimumSamplingIntervalPropertyTree!= null):((minimumSamplingIntervalPropertyTree == null)||(!minimumSamplingIntervalPropertyTree.isLeaf())))) {
            _other.minimumSamplingInterval = this.minimumSamplingInterval;
        }
        final PropertyTree historizingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historizing"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historizingPropertyTree!= null):((historizingPropertyTree == null)||(!historizingPropertyTree.isLeaf())))) {
            _other.historizing = this.historizing;
        }
    }

    @Override
    public<_B >VariableAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new VariableAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public VariableAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >VariableAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VariableAttributes.Builder<_B> _newBuilder = new VariableAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >VariableAttributes.Builder<_B> copyOf(final VariableAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VariableAttributes.Builder<_B> _newBuilder = new VariableAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static VariableAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VariableAttributes.Builder<Void> copyExcept(final VariableAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VariableAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static VariableAttributes.Builder<Void> copyOnly(final VariableAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private Variant.Builder<VariableAttributes.Builder<_B>> value;
        private JAXBElement<NodeId> dataType;
        private Integer valueRank;
        private JAXBElement<ListOfUInt32> arrayDimensions;
        private Short accessLevel;
        private Short userAccessLevel;
        private Double minimumSamplingInterval;
        private Boolean historizing;

        public Builder(final _B _parentBuilder, final VariableAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this));
                this.dataType = _other.dataType;
                this.valueRank = _other.valueRank;
                this.arrayDimensions = _other.arrayDimensions;
                this.accessLevel = _other.accessLevel;
                this.userAccessLevel = _other.userAccessLevel;
                this.minimumSamplingInterval = _other.minimumSamplingInterval;
                this.historizing = _other.historizing;
            }
        }

        public Builder(final _B _parentBuilder, final VariableAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                    this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this, valuePropertyTree, _propertyTreeUse));
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
                final PropertyTree accessLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("accessLevel"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(accessLevelPropertyTree!= null):((accessLevelPropertyTree == null)||(!accessLevelPropertyTree.isLeaf())))) {
                    this.accessLevel = _other.accessLevel;
                }
                final PropertyTree userAccessLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userAccessLevel"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userAccessLevelPropertyTree!= null):((userAccessLevelPropertyTree == null)||(!userAccessLevelPropertyTree.isLeaf())))) {
                    this.userAccessLevel = _other.userAccessLevel;
                }
                final PropertyTree minimumSamplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("minimumSamplingInterval"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(minimumSamplingIntervalPropertyTree!= null):((minimumSamplingIntervalPropertyTree == null)||(!minimumSamplingIntervalPropertyTree.isLeaf())))) {
                    this.minimumSamplingInterval = _other.minimumSamplingInterval;
                }
                final PropertyTree historizingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historizing"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historizingPropertyTree!= null):((historizingPropertyTree == null)||(!historizingPropertyTree.isLeaf())))) {
                    this.historizing = _other.historizing;
                }
            }
        }

        protected<_P extends VariableAttributes >_P init(final _P _product) {
            _product.value = ((this.value == null)?null:this.value.build());
            _product.dataType = this.dataType;
            _product.valueRank = this.valueRank;
            _product.arrayDimensions = this.arrayDimensions;
            _product.accessLevel = this.accessLevel;
            _product.userAccessLevel = this.userAccessLevel;
            _product.minimumSamplingInterval = this.minimumSamplingInterval;
            _product.historizing = this.historizing;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public VariableAttributes.Builder<_B> withValue(final Variant value) {
            this.value = ((value == null)?null:new Variant.Builder<VariableAttributes.Builder<_B>>(this, value, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "value".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "value".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends VariableAttributes.Builder<_B>> withValue() {
            if (this.value!= null) {
                return this.value;
            }
            return this.value = new Variant.Builder<VariableAttributes.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataType
         *     Neuer Wert der Eigenschaft "dataType".
         */
        public VariableAttributes.Builder<_B> withDataType(final JAXBElement<NodeId> dataType) {
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
        public VariableAttributes.Builder<_B> withValueRank(final Integer valueRank) {
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
        public VariableAttributes.Builder<_B> withArrayDimensions(final JAXBElement<ListOfUInt32> arrayDimensions) {
            this.arrayDimensions = arrayDimensions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "accessLevel" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param accessLevel
         *     Neuer Wert der Eigenschaft "accessLevel".
         */
        public VariableAttributes.Builder<_B> withAccessLevel(final Short accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userAccessLevel" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userAccessLevel
         *     Neuer Wert der Eigenschaft "userAccessLevel".
         */
        public VariableAttributes.Builder<_B> withUserAccessLevel(final Short userAccessLevel) {
            this.userAccessLevel = userAccessLevel;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "minimumSamplingInterval" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param minimumSamplingInterval
         *     Neuer Wert der Eigenschaft "minimumSamplingInterval".
         */
        public VariableAttributes.Builder<_B> withMinimumSamplingInterval(final Double minimumSamplingInterval) {
            this.minimumSamplingInterval = minimumSamplingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historizing" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param historizing
         *     Neuer Wert der Eigenschaft "historizing".
         */
        public VariableAttributes.Builder<_B> withHistorizing(final Boolean historizing) {
            this.historizing = historizing;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedAttributes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param specifiedAttributes
         *     Neuer Wert der Eigenschaft "specifiedAttributes".
         */
        @Override
        public VariableAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
            super.withSpecifiedAttributes(specifiedAttributes);
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
        public VariableAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public VariableAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
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
        public VariableAttributes.Builder<_B> withWriteMask(final Long writeMask) {
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
        public VariableAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public VariableAttributes build() {
            if (_storedValue == null) {
                return this.init(new VariableAttributes());
            } else {
                return ((VariableAttributes) _storedValue);
            }
        }

        public VariableAttributes.Builder<_B> copyOf(final VariableAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public VariableAttributes.Builder<_B> copyOf(final VariableAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends VariableAttributes.Selector<VariableAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static VariableAttributes.Select _root() {
            return new VariableAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private Variant.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> value = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> dataType = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> valueRank = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> arrayDimensions = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> accessLevel = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> userAccessLevel = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> minimumSamplingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> historizing = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.value!= null) {
                products.put("value", this.value.init());
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
            if (this.accessLevel!= null) {
                products.put("accessLevel", this.accessLevel.init());
            }
            if (this.userAccessLevel!= null) {
                products.put("userAccessLevel", this.userAccessLevel.init());
            }
            if (this.minimumSamplingInterval!= null) {
                products.put("minimumSamplingInterval", this.minimumSamplingInterval.init());
            }
            if (this.historizing!= null) {
                products.put("historizing", this.historizing.init());
            }
            return products;
        }

        public Variant.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new Variant.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> dataType() {
            return ((this.dataType == null)?this.dataType = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "dataType"):this.dataType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> valueRank() {
            return ((this.valueRank == null)?this.valueRank = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "valueRank"):this.valueRank);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> arrayDimensions() {
            return ((this.arrayDimensions == null)?this.arrayDimensions = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "arrayDimensions"):this.arrayDimensions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> accessLevel() {
            return ((this.accessLevel == null)?this.accessLevel = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "accessLevel"):this.accessLevel);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> userAccessLevel() {
            return ((this.userAccessLevel == null)?this.userAccessLevel = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "userAccessLevel"):this.userAccessLevel);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> minimumSamplingInterval() {
            return ((this.minimumSamplingInterval == null)?this.minimumSamplingInterval = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "minimumSamplingInterval"):this.minimumSamplingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>> historizing() {
            return ((this.historizing == null)?this.historizing = new com.kscs.util.jaxb.Selector<TRoot, VariableAttributes.Selector<TRoot, TParent>>(this._root, this, "historizing"):this.historizing);
        }

    }

}
