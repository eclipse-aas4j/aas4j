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
 * <p>Java-Klasse für PublishedVariableDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishedVariableDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedVariable" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SamplingIntervalHint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeadbandType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DeadbandValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubstituteValue" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="MetaDataProperties" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfQualifiedName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishedVariableDataType", propOrder = {
    "publishedVariable",
    "attributeId",
    "samplingIntervalHint",
    "deadbandType",
    "deadbandValue",
    "indexRange",
    "substituteValue",
    "metaDataProperties"
})
public class PublishedVariableDataType {

    @XmlElementRef(name = "PublishedVariable", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> publishedVariable;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElement(name = "SamplingIntervalHint")
    protected Double samplingIntervalHint;
    @XmlElement(name = "DeadbandType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long deadbandType;
    @XmlElement(name = "DeadbandValue")
    protected Double deadbandValue;
    @XmlElementRef(name = "IndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indexRange;
    @XmlElement(name = "SubstituteValue")
    protected Variant substituteValue;
    @XmlElementRef(name = "MetaDataProperties", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfQualifiedName> metaDataProperties;

    /**
     * Ruft den Wert der publishedVariable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getPublishedVariable() {
        return publishedVariable;
    }

    /**
     * Legt den Wert der publishedVariable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setPublishedVariable(JAXBElement<NodeId> value) {
        this.publishedVariable = value;
    }

    /**
     * Ruft den Wert der attributeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * Legt den Wert der attributeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttributeId(Long value) {
        this.attributeId = value;
    }

    /**
     * Ruft den Wert der samplingIntervalHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSamplingIntervalHint() {
        return samplingIntervalHint;
    }

    /**
     * Legt den Wert der samplingIntervalHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSamplingIntervalHint(Double value) {
        this.samplingIntervalHint = value;
    }

    /**
     * Ruft den Wert der deadbandType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeadbandType() {
        return deadbandType;
    }

    /**
     * Legt den Wert der deadbandType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeadbandType(Long value) {
        this.deadbandType = value;
    }

    /**
     * Ruft den Wert der deadbandValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeadbandValue() {
        return deadbandValue;
    }

    /**
     * Legt den Wert der deadbandValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeadbandValue(Double value) {
        this.deadbandValue = value;
    }

    /**
     * Ruft den Wert der indexRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndexRange() {
        return indexRange;
    }

    /**
     * Legt den Wert der indexRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndexRange(JAXBElement<String> value) {
        this.indexRange = value;
    }

    /**
     * Ruft den Wert der substituteValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getSubstituteValue() {
        return substituteValue;
    }

    /**
     * Legt den Wert der substituteValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setSubstituteValue(Variant value) {
        this.substituteValue = value;
    }

    /**
     * Ruft den Wert der metaDataProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfQualifiedName }{@code >}
     *     
     */
    public JAXBElement<ListOfQualifiedName> getMetaDataProperties() {
        return metaDataProperties;
    }

    /**
     * Legt den Wert der metaDataProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfQualifiedName }{@code >}
     *     
     */
    public void setMetaDataProperties(JAXBElement<ListOfQualifiedName> value) {
        this.metaDataProperties = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishedVariableDataType.Builder<_B> _other) {
        _other.publishedVariable = this.publishedVariable;
        _other.attributeId = this.attributeId;
        _other.samplingIntervalHint = this.samplingIntervalHint;
        _other.deadbandType = this.deadbandType;
        _other.deadbandValue = this.deadbandValue;
        _other.indexRange = this.indexRange;
        _other.substituteValue = ((this.substituteValue == null)?null:this.substituteValue.newCopyBuilder(_other));
        _other.metaDataProperties = this.metaDataProperties;
    }

    public<_B >PublishedVariableDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishedVariableDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public PublishedVariableDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishedVariableDataType.Builder<Void> builder() {
        return new PublishedVariableDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PublishedVariableDataType.Builder<_B> copyOf(final PublishedVariableDataType _other) {
        final PublishedVariableDataType.Builder<_B> _newBuilder = new PublishedVariableDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishedVariableDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedVariablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedVariable"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedVariablePropertyTree!= null):((publishedVariablePropertyTree == null)||(!publishedVariablePropertyTree.isLeaf())))) {
            _other.publishedVariable = this.publishedVariable;
        }
        final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
            _other.attributeId = this.attributeId;
        }
        final PropertyTree samplingIntervalHintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingIntervalHint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalHintPropertyTree!= null):((samplingIntervalHintPropertyTree == null)||(!samplingIntervalHintPropertyTree.isLeaf())))) {
            _other.samplingIntervalHint = this.samplingIntervalHint;
        }
        final PropertyTree deadbandTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandTypePropertyTree!= null):((deadbandTypePropertyTree == null)||(!deadbandTypePropertyTree.isLeaf())))) {
            _other.deadbandType = this.deadbandType;
        }
        final PropertyTree deadbandValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandValuePropertyTree!= null):((deadbandValuePropertyTree == null)||(!deadbandValuePropertyTree.isLeaf())))) {
            _other.deadbandValue = this.deadbandValue;
        }
        final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
            _other.indexRange = this.indexRange;
        }
        final PropertyTree substituteValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("substituteValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(substituteValuePropertyTree!= null):((substituteValuePropertyTree == null)||(!substituteValuePropertyTree.isLeaf())))) {
            _other.substituteValue = ((this.substituteValue == null)?null:this.substituteValue.newCopyBuilder(_other, substituteValuePropertyTree, _propertyTreeUse));
        }
        final PropertyTree metaDataPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("metaDataProperties"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(metaDataPropertiesPropertyTree!= null):((metaDataPropertiesPropertyTree == null)||(!metaDataPropertiesPropertyTree.isLeaf())))) {
            _other.metaDataProperties = this.metaDataProperties;
        }
    }

    public<_B >PublishedVariableDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishedVariableDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PublishedVariableDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishedVariableDataType.Builder<_B> copyOf(final PublishedVariableDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedVariableDataType.Builder<_B> _newBuilder = new PublishedVariableDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishedVariableDataType.Builder<Void> copyExcept(final PublishedVariableDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedVariableDataType.Builder<Void> copyOnly(final PublishedVariableDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PublishedVariableDataType _storedValue;
        private JAXBElement<NodeId> publishedVariable;
        private Long attributeId;
        private Double samplingIntervalHint;
        private Long deadbandType;
        private Double deadbandValue;
        private JAXBElement<String> indexRange;
        private Variant.Builder<PublishedVariableDataType.Builder<_B>> substituteValue;
        private JAXBElement<ListOfQualifiedName> metaDataProperties;

        public Builder(final _B _parentBuilder, final PublishedVariableDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.publishedVariable = _other.publishedVariable;
                    this.attributeId = _other.attributeId;
                    this.samplingIntervalHint = _other.samplingIntervalHint;
                    this.deadbandType = _other.deadbandType;
                    this.deadbandValue = _other.deadbandValue;
                    this.indexRange = _other.indexRange;
                    this.substituteValue = ((_other.substituteValue == null)?null:_other.substituteValue.newCopyBuilder(this));
                    this.metaDataProperties = _other.metaDataProperties;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PublishedVariableDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedVariablePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedVariable"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedVariablePropertyTree!= null):((publishedVariablePropertyTree == null)||(!publishedVariablePropertyTree.isLeaf())))) {
                        this.publishedVariable = _other.publishedVariable;
                    }
                    final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
                        this.attributeId = _other.attributeId;
                    }
                    final PropertyTree samplingIntervalHintPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingIntervalHint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalHintPropertyTree!= null):((samplingIntervalHintPropertyTree == null)||(!samplingIntervalHintPropertyTree.isLeaf())))) {
                        this.samplingIntervalHint = _other.samplingIntervalHint;
                    }
                    final PropertyTree deadbandTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandTypePropertyTree!= null):((deadbandTypePropertyTree == null)||(!deadbandTypePropertyTree.isLeaf())))) {
                        this.deadbandType = _other.deadbandType;
                    }
                    final PropertyTree deadbandValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandValuePropertyTree!= null):((deadbandValuePropertyTree == null)||(!deadbandValuePropertyTree.isLeaf())))) {
                        this.deadbandValue = _other.deadbandValue;
                    }
                    final PropertyTree indexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("indexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(indexRangePropertyTree!= null):((indexRangePropertyTree == null)||(!indexRangePropertyTree.isLeaf())))) {
                        this.indexRange = _other.indexRange;
                    }
                    final PropertyTree substituteValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("substituteValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(substituteValuePropertyTree!= null):((substituteValuePropertyTree == null)||(!substituteValuePropertyTree.isLeaf())))) {
                        this.substituteValue = ((_other.substituteValue == null)?null:_other.substituteValue.newCopyBuilder(this, substituteValuePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree metaDataPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("metaDataProperties"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(metaDataPropertiesPropertyTree!= null):((metaDataPropertiesPropertyTree == null)||(!metaDataPropertiesPropertyTree.isLeaf())))) {
                        this.metaDataProperties = _other.metaDataProperties;
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

        protected<_P extends PublishedVariableDataType >_P init(final _P _product) {
            _product.publishedVariable = this.publishedVariable;
            _product.attributeId = this.attributeId;
            _product.samplingIntervalHint = this.samplingIntervalHint;
            _product.deadbandType = this.deadbandType;
            _product.deadbandValue = this.deadbandValue;
            _product.indexRange = this.indexRange;
            _product.substituteValue = ((this.substituteValue == null)?null:this.substituteValue.build());
            _product.metaDataProperties = this.metaDataProperties;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedVariable" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishedVariable
         *     Neuer Wert der Eigenschaft "publishedVariable".
         */
        public PublishedVariableDataType.Builder<_B> withPublishedVariable(final JAXBElement<NodeId> publishedVariable) {
            this.publishedVariable = publishedVariable;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeId
         *     Neuer Wert der Eigenschaft "attributeId".
         */
        public PublishedVariableDataType.Builder<_B> withAttributeId(final Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingIntervalHint" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param samplingIntervalHint
         *     Neuer Wert der Eigenschaft "samplingIntervalHint".
         */
        public PublishedVariableDataType.Builder<_B> withSamplingIntervalHint(final Double samplingIntervalHint) {
            this.samplingIntervalHint = samplingIntervalHint;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deadbandType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param deadbandType
         *     Neuer Wert der Eigenschaft "deadbandType".
         */
        public PublishedVariableDataType.Builder<_B> withDeadbandType(final Long deadbandType) {
            this.deadbandType = deadbandType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deadbandValue" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param deadbandValue
         *     Neuer Wert der Eigenschaft "deadbandValue".
         */
        public PublishedVariableDataType.Builder<_B> withDeadbandValue(final Double deadbandValue) {
            this.deadbandValue = deadbandValue;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "indexRange" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param indexRange
         *     Neuer Wert der Eigenschaft "indexRange".
         */
        public PublishedVariableDataType.Builder<_B> withIndexRange(final JAXBElement<String> indexRange) {
            this.indexRange = indexRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "substituteValue" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param substituteValue
         *     Neuer Wert der Eigenschaft "substituteValue".
         */
        public PublishedVariableDataType.Builder<_B> withSubstituteValue(final Variant substituteValue) {
            this.substituteValue = ((substituteValue == null)?null:new Variant.Builder<PublishedVariableDataType.Builder<_B>>(this, substituteValue, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "substituteValue".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "substituteValue".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends PublishedVariableDataType.Builder<_B>> withSubstituteValue() {
            if (this.substituteValue!= null) {
                return this.substituteValue;
            }
            return this.substituteValue = new Variant.Builder<PublishedVariableDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "metaDataProperties" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param metaDataProperties
         *     Neuer Wert der Eigenschaft "metaDataProperties".
         */
        public PublishedVariableDataType.Builder<_B> withMetaDataProperties(final JAXBElement<ListOfQualifiedName> metaDataProperties) {
            this.metaDataProperties = metaDataProperties;
            return this;
        }

        @Override
        public PublishedVariableDataType build() {
            if (_storedValue == null) {
                return this.init(new PublishedVariableDataType());
            } else {
                return ((PublishedVariableDataType) _storedValue);
            }
        }

        public PublishedVariableDataType.Builder<_B> copyOf(final PublishedVariableDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishedVariableDataType.Builder<_B> copyOf(final PublishedVariableDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishedVariableDataType.Selector<PublishedVariableDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishedVariableDataType.Select _root() {
            return new PublishedVariableDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> publishedVariable = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> samplingIntervalHint = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> deadbandType = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> deadbandValue = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> indexRange = null;
        private Variant.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> substituteValue = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> metaDataProperties = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedVariable!= null) {
                products.put("publishedVariable", this.publishedVariable.init());
            }
            if (this.attributeId!= null) {
                products.put("attributeId", this.attributeId.init());
            }
            if (this.samplingIntervalHint!= null) {
                products.put("samplingIntervalHint", this.samplingIntervalHint.init());
            }
            if (this.deadbandType!= null) {
                products.put("deadbandType", this.deadbandType.init());
            }
            if (this.deadbandValue!= null) {
                products.put("deadbandValue", this.deadbandValue.init());
            }
            if (this.indexRange!= null) {
                products.put("indexRange", this.indexRange.init());
            }
            if (this.substituteValue!= null) {
                products.put("substituteValue", this.substituteValue.init());
            }
            if (this.metaDataProperties!= null) {
                products.put("metaDataProperties", this.metaDataProperties.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> publishedVariable() {
            return ((this.publishedVariable == null)?this.publishedVariable = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "publishedVariable"):this.publishedVariable);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> samplingIntervalHint() {
            return ((this.samplingIntervalHint == null)?this.samplingIntervalHint = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "samplingIntervalHint"):this.samplingIntervalHint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> deadbandType() {
            return ((this.deadbandType == null)?this.deadbandType = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "deadbandType"):this.deadbandType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> deadbandValue() {
            return ((this.deadbandValue == null)?this.deadbandValue = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "deadbandValue"):this.deadbandValue);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> indexRange() {
            return ((this.indexRange == null)?this.indexRange = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "indexRange"):this.indexRange);
        }

        public Variant.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> substituteValue() {
            return ((this.substituteValue == null)?this.substituteValue = new Variant.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "substituteValue"):this.substituteValue);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>> metaDataProperties() {
            return ((this.metaDataProperties == null)?this.metaDataProperties = new com.kscs.util.jaxb.Selector<TRoot, PublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "metaDataProperties"):this.metaDataProperties);
        }

    }

}
