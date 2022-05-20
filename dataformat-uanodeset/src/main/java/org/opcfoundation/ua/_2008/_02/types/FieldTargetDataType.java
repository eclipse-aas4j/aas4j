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
 * <p>Java-Klasse für FieldTargetDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FieldTargetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetFieldId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Guid" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverIndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="AttributeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="WriteIndexRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverrideValueHandling" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}OverrideValueHandling" minOccurs="0"/&gt;
 *         &lt;element name="OverrideValue" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldTargetDataType", propOrder = {
    "dataSetFieldId",
    "receiverIndexRange",
    "targetNodeId",
    "attributeId",
    "writeIndexRange",
    "overrideValueHandling",
    "overrideValue"
})
public class FieldTargetDataType {

    @XmlElement(name = "DataSetFieldId")
    protected Guid dataSetFieldId;
    @XmlElementRef(name = "ReceiverIndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverIndexRange;
    @XmlElementRef(name = "TargetNodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> targetNodeId;
    @XmlElement(name = "AttributeId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long attributeId;
    @XmlElementRef(name = "WriteIndexRange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> writeIndexRange;
    @XmlElement(name = "OverrideValueHandling")
    @XmlSchemaType(name = "string")
    protected OverrideValueHandling overrideValueHandling;
    @XmlElement(name = "OverrideValue")
    protected Variant overrideValue;

    /**
     * Ruft den Wert der dataSetFieldId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getDataSetFieldId() {
        return dataSetFieldId;
    }

    /**
     * Legt den Wert der dataSetFieldId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setDataSetFieldId(Guid value) {
        this.dataSetFieldId = value;
    }

    /**
     * Ruft den Wert der receiverIndexRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverIndexRange() {
        return receiverIndexRange;
    }

    /**
     * Legt den Wert der receiverIndexRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverIndexRange(JAXBElement<String> value) {
        this.receiverIndexRange = value;
    }

    /**
     * Ruft den Wert der targetNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getTargetNodeId() {
        return targetNodeId;
    }

    /**
     * Legt den Wert der targetNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setTargetNodeId(JAXBElement<NodeId> value) {
        this.targetNodeId = value;
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
     * Ruft den Wert der writeIndexRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWriteIndexRange() {
        return writeIndexRange;
    }

    /**
     * Legt den Wert der writeIndexRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWriteIndexRange(JAXBElement<String> value) {
        this.writeIndexRange = value;
    }

    /**
     * Ruft den Wert der overrideValueHandling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OverrideValueHandling }
     *     
     */
    public OverrideValueHandling getOverrideValueHandling() {
        return overrideValueHandling;
    }

    /**
     * Legt den Wert der overrideValueHandling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideValueHandling }
     *     
     */
    public void setOverrideValueHandling(OverrideValueHandling value) {
        this.overrideValueHandling = value;
    }

    /**
     * Ruft den Wert der overrideValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getOverrideValue() {
        return overrideValue;
    }

    /**
     * Legt den Wert der overrideValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setOverrideValue(Variant value) {
        this.overrideValue = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final FieldTargetDataType.Builder<_B> _other) {
        _other.dataSetFieldId = ((this.dataSetFieldId == null)?null:this.dataSetFieldId.newCopyBuilder(_other));
        _other.receiverIndexRange = this.receiverIndexRange;
        _other.targetNodeId = this.targetNodeId;
        _other.attributeId = this.attributeId;
        _other.writeIndexRange = this.writeIndexRange;
        _other.overrideValueHandling = this.overrideValueHandling;
        _other.overrideValue = ((this.overrideValue == null)?null:this.overrideValue.newCopyBuilder(_other));
    }

    public<_B >FieldTargetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new FieldTargetDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public FieldTargetDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static FieldTargetDataType.Builder<Void> builder() {
        return new FieldTargetDataType.Builder<Void>(null, null, false);
    }

    public static<_B >FieldTargetDataType.Builder<_B> copyOf(final FieldTargetDataType _other) {
        final FieldTargetDataType.Builder<_B> _newBuilder = new FieldTargetDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final FieldTargetDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetFieldIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldIdPropertyTree!= null):((dataSetFieldIdPropertyTree == null)||(!dataSetFieldIdPropertyTree.isLeaf())))) {
            _other.dataSetFieldId = ((this.dataSetFieldId == null)?null:this.dataSetFieldId.newCopyBuilder(_other, dataSetFieldIdPropertyTree, _propertyTreeUse));
        }
        final PropertyTree receiverIndexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("receiverIndexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(receiverIndexRangePropertyTree!= null):((receiverIndexRangePropertyTree == null)||(!receiverIndexRangePropertyTree.isLeaf())))) {
            _other.receiverIndexRange = this.receiverIndexRange;
        }
        final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
            _other.targetNodeId = this.targetNodeId;
        }
        final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
            _other.attributeId = this.attributeId;
        }
        final PropertyTree writeIndexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeIndexRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeIndexRangePropertyTree!= null):((writeIndexRangePropertyTree == null)||(!writeIndexRangePropertyTree.isLeaf())))) {
            _other.writeIndexRange = this.writeIndexRange;
        }
        final PropertyTree overrideValueHandlingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValueHandling"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValueHandlingPropertyTree!= null):((overrideValueHandlingPropertyTree == null)||(!overrideValueHandlingPropertyTree.isLeaf())))) {
            _other.overrideValueHandling = this.overrideValueHandling;
        }
        final PropertyTree overrideValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValuePropertyTree!= null):((overrideValuePropertyTree == null)||(!overrideValuePropertyTree.isLeaf())))) {
            _other.overrideValue = ((this.overrideValue == null)?null:this.overrideValue.newCopyBuilder(_other, overrideValuePropertyTree, _propertyTreeUse));
        }
    }

    public<_B >FieldTargetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new FieldTargetDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public FieldTargetDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >FieldTargetDataType.Builder<_B> copyOf(final FieldTargetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final FieldTargetDataType.Builder<_B> _newBuilder = new FieldTargetDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static FieldTargetDataType.Builder<Void> copyExcept(final FieldTargetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static FieldTargetDataType.Builder<Void> copyOnly(final FieldTargetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final FieldTargetDataType _storedValue;
        private Guid.Builder<FieldTargetDataType.Builder<_B>> dataSetFieldId;
        private JAXBElement<String> receiverIndexRange;
        private JAXBElement<NodeId> targetNodeId;
        private Long attributeId;
        private JAXBElement<String> writeIndexRange;
        private OverrideValueHandling overrideValueHandling;
        private Variant.Builder<FieldTargetDataType.Builder<_B>> overrideValue;

        public Builder(final _B _parentBuilder, final FieldTargetDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.dataSetFieldId = ((_other.dataSetFieldId == null)?null:_other.dataSetFieldId.newCopyBuilder(this));
                    this.receiverIndexRange = _other.receiverIndexRange;
                    this.targetNodeId = _other.targetNodeId;
                    this.attributeId = _other.attributeId;
                    this.writeIndexRange = _other.writeIndexRange;
                    this.overrideValueHandling = _other.overrideValueHandling;
                    this.overrideValue = ((_other.overrideValue == null)?null:_other.overrideValue.newCopyBuilder(this));
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final FieldTargetDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetFieldIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldIdPropertyTree!= null):((dataSetFieldIdPropertyTree == null)||(!dataSetFieldIdPropertyTree.isLeaf())))) {
                        this.dataSetFieldId = ((_other.dataSetFieldId == null)?null:_other.dataSetFieldId.newCopyBuilder(this, dataSetFieldIdPropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree receiverIndexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("receiverIndexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(receiverIndexRangePropertyTree!= null):((receiverIndexRangePropertyTree == null)||(!receiverIndexRangePropertyTree.isLeaf())))) {
                        this.receiverIndexRange = _other.receiverIndexRange;
                    }
                    final PropertyTree targetNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNodeIdPropertyTree!= null):((targetNodeIdPropertyTree == null)||(!targetNodeIdPropertyTree.isLeaf())))) {
                        this.targetNodeId = _other.targetNodeId;
                    }
                    final PropertyTree attributeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeIdPropertyTree!= null):((attributeIdPropertyTree == null)||(!attributeIdPropertyTree.isLeaf())))) {
                        this.attributeId = _other.attributeId;
                    }
                    final PropertyTree writeIndexRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeIndexRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeIndexRangePropertyTree!= null):((writeIndexRangePropertyTree == null)||(!writeIndexRangePropertyTree.isLeaf())))) {
                        this.writeIndexRange = _other.writeIndexRange;
                    }
                    final PropertyTree overrideValueHandlingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValueHandling"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValueHandlingPropertyTree!= null):((overrideValueHandlingPropertyTree == null)||(!overrideValueHandlingPropertyTree.isLeaf())))) {
                        this.overrideValueHandling = _other.overrideValueHandling;
                    }
                    final PropertyTree overrideValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValuePropertyTree!= null):((overrideValuePropertyTree == null)||(!overrideValuePropertyTree.isLeaf())))) {
                        this.overrideValue = ((_other.overrideValue == null)?null:_other.overrideValue.newCopyBuilder(this, overrideValuePropertyTree, _propertyTreeUse));
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

        protected<_P extends FieldTargetDataType >_P init(final _P _product) {
            _product.dataSetFieldId = ((this.dataSetFieldId == null)?null:this.dataSetFieldId.build());
            _product.receiverIndexRange = this.receiverIndexRange;
            _product.targetNodeId = this.targetNodeId;
            _product.attributeId = this.attributeId;
            _product.writeIndexRange = this.writeIndexRange;
            _product.overrideValueHandling = this.overrideValueHandling;
            _product.overrideValue = ((this.overrideValue == null)?null:this.overrideValue.build());
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFieldId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetFieldId
         *     Neuer Wert der Eigenschaft "dataSetFieldId".
         */
        public FieldTargetDataType.Builder<_B> withDataSetFieldId(final Guid dataSetFieldId) {
            this.dataSetFieldId = ((dataSetFieldId == null)?null:new Guid.Builder<FieldTargetDataType.Builder<_B>>(this, dataSetFieldId, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "dataSetFieldId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "dataSetFieldId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Guid.Builder<? extends FieldTargetDataType.Builder<_B>> withDataSetFieldId() {
            if (this.dataSetFieldId!= null) {
                return this.dataSetFieldId;
            }
            return this.dataSetFieldId = new Guid.Builder<FieldTargetDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "receiverIndexRange" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param receiverIndexRange
         *     Neuer Wert der Eigenschaft "receiverIndexRange".
         */
        public FieldTargetDataType.Builder<_B> withReceiverIndexRange(final JAXBElement<String> receiverIndexRange) {
            this.receiverIndexRange = receiverIndexRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetNodeId
         *     Neuer Wert der Eigenschaft "targetNodeId".
         */
        public FieldTargetDataType.Builder<_B> withTargetNodeId(final JAXBElement<NodeId> targetNodeId) {
            this.targetNodeId = targetNodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeId
         *     Neuer Wert der Eigenschaft "attributeId".
         */
        public FieldTargetDataType.Builder<_B> withAttributeId(final Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeIndexRange" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param writeIndexRange
         *     Neuer Wert der Eigenschaft "writeIndexRange".
         */
        public FieldTargetDataType.Builder<_B> withWriteIndexRange(final JAXBElement<String> writeIndexRange) {
            this.writeIndexRange = writeIndexRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "overrideValueHandling" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param overrideValueHandling
         *     Neuer Wert der Eigenschaft "overrideValueHandling".
         */
        public FieldTargetDataType.Builder<_B> withOverrideValueHandling(final OverrideValueHandling overrideValueHandling) {
            this.overrideValueHandling = overrideValueHandling;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "overrideValue" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param overrideValue
         *     Neuer Wert der Eigenschaft "overrideValue".
         */
        public FieldTargetDataType.Builder<_B> withOverrideValue(final Variant overrideValue) {
            this.overrideValue = ((overrideValue == null)?null:new Variant.Builder<FieldTargetDataType.Builder<_B>>(this, overrideValue, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "overrideValue".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "overrideValue".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends FieldTargetDataType.Builder<_B>> withOverrideValue() {
            if (this.overrideValue!= null) {
                return this.overrideValue;
            }
            return this.overrideValue = new Variant.Builder<FieldTargetDataType.Builder<_B>>(this, null, false);
        }

        @Override
        public FieldTargetDataType build() {
            if (_storedValue == null) {
                return this.init(new FieldTargetDataType());
            } else {
                return ((FieldTargetDataType) _storedValue);
            }
        }

        public FieldTargetDataType.Builder<_B> copyOf(final FieldTargetDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public FieldTargetDataType.Builder<_B> copyOf(final FieldTargetDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends FieldTargetDataType.Selector<FieldTargetDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static FieldTargetDataType.Select _root() {
            return new FieldTargetDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Guid.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> dataSetFieldId = null;
        private com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> receiverIndexRange = null;
        private com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> targetNodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> attributeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> writeIndexRange = null;
        private com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> overrideValueHandling = null;
        private Variant.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> overrideValue = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetFieldId!= null) {
                products.put("dataSetFieldId", this.dataSetFieldId.init());
            }
            if (this.receiverIndexRange!= null) {
                products.put("receiverIndexRange", this.receiverIndexRange.init());
            }
            if (this.targetNodeId!= null) {
                products.put("targetNodeId", this.targetNodeId.init());
            }
            if (this.attributeId!= null) {
                products.put("attributeId", this.attributeId.init());
            }
            if (this.writeIndexRange!= null) {
                products.put("writeIndexRange", this.writeIndexRange.init());
            }
            if (this.overrideValueHandling!= null) {
                products.put("overrideValueHandling", this.overrideValueHandling.init());
            }
            if (this.overrideValue!= null) {
                products.put("overrideValue", this.overrideValue.init());
            }
            return products;
        }

        public Guid.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> dataSetFieldId() {
            return ((this.dataSetFieldId == null)?this.dataSetFieldId = new Guid.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetFieldId"):this.dataSetFieldId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> receiverIndexRange() {
            return ((this.receiverIndexRange == null)?this.receiverIndexRange = new com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "receiverIndexRange"):this.receiverIndexRange);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> targetNodeId() {
            return ((this.targetNodeId == null)?this.targetNodeId = new com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "targetNodeId"):this.targetNodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> attributeId() {
            return ((this.attributeId == null)?this.attributeId = new com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "attributeId"):this.attributeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> writeIndexRange() {
            return ((this.writeIndexRange == null)?this.writeIndexRange = new com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "writeIndexRange"):this.writeIndexRange);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> overrideValueHandling() {
            return ((this.overrideValueHandling == null)?this.overrideValueHandling = new com.kscs.util.jaxb.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "overrideValueHandling"):this.overrideValueHandling);
        }

        public Variant.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>> overrideValue() {
            return ((this.overrideValue == null)?this.overrideValue = new Variant.Selector<TRoot, FieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "overrideValue"):this.overrideValue);
        }

    }

}
