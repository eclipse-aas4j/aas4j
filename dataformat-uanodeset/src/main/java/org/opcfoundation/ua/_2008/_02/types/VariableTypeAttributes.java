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
 * <p>Java-Klasse für VariableTypeAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VariableTypeAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ValueRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ArrayDimensions" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *         &lt;element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableTypeAttributes", propOrder = {
    "value",
    "dataType",
    "valueRank",
    "arrayDimensions",
    "isAbstract"
})
public class VariableTypeAttributes
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
    @XmlElement(name = "IsAbstract")
    protected Boolean isAbstract;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final VariableTypeAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other));
        _other.dataType = this.dataType;
        _other.valueRank = this.valueRank;
        _other.arrayDimensions = this.arrayDimensions;
        _other.isAbstract = this.isAbstract;
    }

    @Override
    public<_B >VariableTypeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new VariableTypeAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public VariableTypeAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static VariableTypeAttributes.Builder<Void> builder() {
        return new VariableTypeAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >VariableTypeAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final VariableTypeAttributes.Builder<_B> _newBuilder = new VariableTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >VariableTypeAttributes.Builder<_B> copyOf(final VariableTypeAttributes _other) {
        final VariableTypeAttributes.Builder<_B> _newBuilder = new VariableTypeAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final VariableTypeAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
        final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
            _other.isAbstract = this.isAbstract;
        }
    }

    @Override
    public<_B >VariableTypeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new VariableTypeAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public VariableTypeAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >VariableTypeAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VariableTypeAttributes.Builder<_B> _newBuilder = new VariableTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >VariableTypeAttributes.Builder<_B> copyOf(final VariableTypeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final VariableTypeAttributes.Builder<_B> _newBuilder = new VariableTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static VariableTypeAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VariableTypeAttributes.Builder<Void> copyExcept(final VariableTypeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static VariableTypeAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static VariableTypeAttributes.Builder<Void> copyOnly(final VariableTypeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private Variant.Builder<VariableTypeAttributes.Builder<_B>> value;
        private JAXBElement<NodeId> dataType;
        private Integer valueRank;
        private JAXBElement<ListOfUInt32> arrayDimensions;
        private Boolean isAbstract;

        public Builder(final _B _parentBuilder, final VariableTypeAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this));
                this.dataType = _other.dataType;
                this.valueRank = _other.valueRank;
                this.arrayDimensions = _other.arrayDimensions;
                this.isAbstract = _other.isAbstract;
            }
        }

        public Builder(final _B _parentBuilder, final VariableTypeAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
                    this.isAbstract = _other.isAbstract;
                }
            }
        }

        protected<_P extends VariableTypeAttributes >_P init(final _P _product) {
            _product.value = ((this.value == null)?null:this.value.build());
            _product.dataType = this.dataType;
            _product.valueRank = this.valueRank;
            _product.arrayDimensions = this.arrayDimensions;
            _product.isAbstract = this.isAbstract;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public VariableTypeAttributes.Builder<_B> withValue(final Variant value) {
            this.value = ((value == null)?null:new Variant.Builder<VariableTypeAttributes.Builder<_B>>(this, value, false));
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
        public Variant.Builder<? extends VariableTypeAttributes.Builder<_B>> withValue() {
            if (this.value!= null) {
                return this.value;
            }
            return this.value = new Variant.Builder<VariableTypeAttributes.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataType
         *     Neuer Wert der Eigenschaft "dataType".
         */
        public VariableTypeAttributes.Builder<_B> withDataType(final JAXBElement<NodeId> dataType) {
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
        public VariableTypeAttributes.Builder<_B> withValueRank(final Integer valueRank) {
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
        public VariableTypeAttributes.Builder<_B> withArrayDimensions(final JAXBElement<ListOfUInt32> arrayDimensions) {
            this.arrayDimensions = arrayDimensions;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isAbstract" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isAbstract
         *     Neuer Wert der Eigenschaft "isAbstract".
         */
        public VariableTypeAttributes.Builder<_B> withIsAbstract(final Boolean isAbstract) {
            this.isAbstract = isAbstract;
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
        public VariableTypeAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
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
        public VariableTypeAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public VariableTypeAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
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
        public VariableTypeAttributes.Builder<_B> withWriteMask(final Long writeMask) {
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
        public VariableTypeAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public VariableTypeAttributes build() {
            if (_storedValue == null) {
                return this.init(new VariableTypeAttributes());
            } else {
                return ((VariableTypeAttributes) _storedValue);
            }
        }

        public VariableTypeAttributes.Builder<_B> copyOf(final VariableTypeAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public VariableTypeAttributes.Builder<_B> copyOf(final VariableTypeAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends VariableTypeAttributes.Selector<VariableTypeAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static VariableTypeAttributes.Select _root() {
            return new VariableTypeAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private Variant.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> value = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> dataType = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> valueRank = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> arrayDimensions = null;
        private com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> isAbstract = null;

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
            if (this.isAbstract!= null) {
                products.put("isAbstract", this.isAbstract.init());
            }
            return products;
        }

        public Variant.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new Variant.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> dataType() {
            return ((this.dataType == null)?this.dataType = new com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "dataType"):this.dataType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> valueRank() {
            return ((this.valueRank == null)?this.valueRank = new com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "valueRank"):this.valueRank);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> arrayDimensions() {
            return ((this.arrayDimensions == null)?this.arrayDimensions = new com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "arrayDimensions"):this.arrayDimensions);
        }

        public com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>> isAbstract() {
            return ((this.isAbstract == null)?this.isAbstract = new com.kscs.util.jaxb.Selector<TRoot, VariableTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "isAbstract"):this.isAbstract);
        }

    }

}
