//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataChangeFilter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataChangeFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringFilter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Trigger" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataChangeTrigger" minOccurs="0"/&gt;
 *         &lt;element name="DeadbandType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DeadbandValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataChangeFilter", propOrder = {
    "trigger",
    "deadbandType",
    "deadbandValue"
})
public class DataChangeFilter
    extends MonitoringFilter
{

    @XmlElement(name = "Trigger")
    @XmlSchemaType(name = "string")
    protected DataChangeTrigger trigger;
    @XmlElement(name = "DeadbandType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long deadbandType;
    @XmlElement(name = "DeadbandValue")
    protected Double deadbandValue;

    /**
     * Ruft den Wert der trigger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataChangeTrigger }
     *     
     */
    public DataChangeTrigger getTrigger() {
        return trigger;
    }

    /**
     * Legt den Wert der trigger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataChangeTrigger }
     *     
     */
    public void setTrigger(DataChangeTrigger value) {
        this.trigger = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataChangeFilter.Builder<_B> _other) {
        super.copyTo(_other);
        _other.trigger = this.trigger;
        _other.deadbandType = this.deadbandType;
        _other.deadbandValue = this.deadbandValue;
    }

    @Override
    public<_B >DataChangeFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataChangeFilter.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DataChangeFilter.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataChangeFilter.Builder<Void> builder() {
        return new DataChangeFilter.Builder<Void>(null, null, false);
    }

    public static<_B >DataChangeFilter.Builder<_B> copyOf(final MonitoringFilter _other) {
        final DataChangeFilter.Builder<_B> _newBuilder = new DataChangeFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataChangeFilter.Builder<_B> copyOf(final DataChangeFilter _other) {
        final DataChangeFilter.Builder<_B> _newBuilder = new DataChangeFilter.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataChangeFilter.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree triggerPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trigger"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(triggerPropertyTree!= null):((triggerPropertyTree == null)||(!triggerPropertyTree.isLeaf())))) {
            _other.trigger = this.trigger;
        }
        final PropertyTree deadbandTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandTypePropertyTree!= null):((deadbandTypePropertyTree == null)||(!deadbandTypePropertyTree.isLeaf())))) {
            _other.deadbandType = this.deadbandType;
        }
        final PropertyTree deadbandValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandValuePropertyTree!= null):((deadbandValuePropertyTree == null)||(!deadbandValuePropertyTree.isLeaf())))) {
            _other.deadbandValue = this.deadbandValue;
        }
    }

    @Override
    public<_B >DataChangeFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataChangeFilter.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DataChangeFilter.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataChangeFilter.Builder<_B> copyOf(final MonitoringFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataChangeFilter.Builder<_B> _newBuilder = new DataChangeFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataChangeFilter.Builder<_B> copyOf(final DataChangeFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataChangeFilter.Builder<_B> _newBuilder = new DataChangeFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataChangeFilter.Builder<Void> copyExcept(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataChangeFilter.Builder<Void> copyExcept(final DataChangeFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataChangeFilter.Builder<Void> copyOnly(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataChangeFilter.Builder<Void> copyOnly(final DataChangeFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends MonitoringFilter.Builder<_B>
        implements Buildable
    {

        private DataChangeTrigger trigger;
        private Long deadbandType;
        private Double deadbandValue;

        public Builder(final _B _parentBuilder, final DataChangeFilter _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.trigger = _other.trigger;
                this.deadbandType = _other.deadbandType;
                this.deadbandValue = _other.deadbandValue;
            }
        }

        public Builder(final _B _parentBuilder, final DataChangeFilter _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree triggerPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trigger"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(triggerPropertyTree!= null):((triggerPropertyTree == null)||(!triggerPropertyTree.isLeaf())))) {
                    this.trigger = _other.trigger;
                }
                final PropertyTree deadbandTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandTypePropertyTree!= null):((deadbandTypePropertyTree == null)||(!deadbandTypePropertyTree.isLeaf())))) {
                    this.deadbandType = _other.deadbandType;
                }
                final PropertyTree deadbandValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deadbandValue"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deadbandValuePropertyTree!= null):((deadbandValuePropertyTree == null)||(!deadbandValuePropertyTree.isLeaf())))) {
                    this.deadbandValue = _other.deadbandValue;
                }
            }
        }

        protected<_P extends DataChangeFilter >_P init(final _P _product) {
            _product.trigger = this.trigger;
            _product.deadbandType = this.deadbandType;
            _product.deadbandValue = this.deadbandValue;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "trigger" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param trigger
         *     Neuer Wert der Eigenschaft "trigger".
         */
        public DataChangeFilter.Builder<_B> withTrigger(final DataChangeTrigger trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deadbandType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param deadbandType
         *     Neuer Wert der Eigenschaft "deadbandType".
         */
        public DataChangeFilter.Builder<_B> withDeadbandType(final Long deadbandType) {
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
        public DataChangeFilter.Builder<_B> withDeadbandValue(final Double deadbandValue) {
            this.deadbandValue = deadbandValue;
            return this;
        }

        @Override
        public DataChangeFilter build() {
            if (_storedValue == null) {
                return this.init(new DataChangeFilter());
            } else {
                return ((DataChangeFilter) _storedValue);
            }
        }

        public DataChangeFilter.Builder<_B> copyOf(final DataChangeFilter _other) {
            _other.copyTo(this);
            return this;
        }

        public DataChangeFilter.Builder<_B> copyOf(final DataChangeFilter.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataChangeFilter.Selector<DataChangeFilter.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataChangeFilter.Select _root() {
            return new DataChangeFilter.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MonitoringFilter.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> trigger = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> deadbandType = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> deadbandValue = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.trigger!= null) {
                products.put("trigger", this.trigger.init());
            }
            if (this.deadbandType!= null) {
                products.put("deadbandType", this.deadbandType.init());
            }
            if (this.deadbandValue!= null) {
                products.put("deadbandValue", this.deadbandValue.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> trigger() {
            return ((this.trigger == null)?this.trigger = new com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>>(this._root, this, "trigger"):this.trigger);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> deadbandType() {
            return ((this.deadbandType == null)?this.deadbandType = new com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>>(this._root, this, "deadbandType"):this.deadbandType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>> deadbandValue() {
            return ((this.deadbandValue == null)?this.deadbandValue = new com.kscs.util.jaxb.Selector<TRoot, DataChangeFilter.Selector<TRoot, TParent>>(this._root, this, "deadbandValue"):this.deadbandValue);
        }

    }

}
