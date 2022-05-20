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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für AggregateFilter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AggregateFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringFilter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AggregateType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AggregateConfiguration" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AggregateConfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateFilter", propOrder = {
    "startTime",
    "aggregateType",
    "processingInterval",
    "aggregateConfiguration"
})
public class AggregateFilter
    extends MonitoringFilter
{

    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElementRef(name = "AggregateType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> aggregateType;
    @XmlElement(name = "ProcessingInterval")
    protected Double processingInterval;
    @XmlElementRef(name = "AggregateConfiguration", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AggregateConfiguration> aggregateConfiguration;

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der aggregateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getAggregateType() {
        return aggregateType;
    }

    /**
     * Legt den Wert der aggregateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setAggregateType(JAXBElement<NodeId> value) {
        this.aggregateType = value;
    }

    /**
     * Ruft den Wert der processingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProcessingInterval() {
        return processingInterval;
    }

    /**
     * Legt den Wert der processingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProcessingInterval(Double value) {
        this.processingInterval = value;
    }

    /**
     * Ruft den Wert der aggregateConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AggregateConfiguration }{@code >}
     *     
     */
    public JAXBElement<AggregateConfiguration> getAggregateConfiguration() {
        return aggregateConfiguration;
    }

    /**
     * Legt den Wert der aggregateConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AggregateConfiguration }{@code >}
     *     
     */
    public void setAggregateConfiguration(JAXBElement<AggregateConfiguration> value) {
        this.aggregateConfiguration = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AggregateFilter.Builder<_B> _other) {
        super.copyTo(_other);
        _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        _other.aggregateType = this.aggregateType;
        _other.processingInterval = this.processingInterval;
        _other.aggregateConfiguration = this.aggregateConfiguration;
    }

    @Override
    public<_B >AggregateFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AggregateFilter.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public AggregateFilter.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AggregateFilter.Builder<Void> builder() {
        return new AggregateFilter.Builder<Void>(null, null, false);
    }

    public static<_B >AggregateFilter.Builder<_B> copyOf(final MonitoringFilter _other) {
        final AggregateFilter.Builder<_B> _newBuilder = new AggregateFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >AggregateFilter.Builder<_B> copyOf(final AggregateFilter _other) {
        final AggregateFilter.Builder<_B> _newBuilder = new AggregateFilter.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AggregateFilter.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
            _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        }
        final PropertyTree aggregateTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aggregateType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aggregateTypePropertyTree!= null):((aggregateTypePropertyTree == null)||(!aggregateTypePropertyTree.isLeaf())))) {
            _other.aggregateType = this.aggregateType;
        }
        final PropertyTree processingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("processingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(processingIntervalPropertyTree!= null):((processingIntervalPropertyTree == null)||(!processingIntervalPropertyTree.isLeaf())))) {
            _other.processingInterval = this.processingInterval;
        }
        final PropertyTree aggregateConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aggregateConfiguration"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aggregateConfigurationPropertyTree!= null):((aggregateConfigurationPropertyTree == null)||(!aggregateConfigurationPropertyTree.isLeaf())))) {
            _other.aggregateConfiguration = this.aggregateConfiguration;
        }
    }

    @Override
    public<_B >AggregateFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AggregateFilter.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public AggregateFilter.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AggregateFilter.Builder<_B> copyOf(final MonitoringFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AggregateFilter.Builder<_B> _newBuilder = new AggregateFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >AggregateFilter.Builder<_B> copyOf(final AggregateFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AggregateFilter.Builder<_B> _newBuilder = new AggregateFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AggregateFilter.Builder<Void> copyExcept(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AggregateFilter.Builder<Void> copyExcept(final AggregateFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AggregateFilter.Builder<Void> copyOnly(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static AggregateFilter.Builder<Void> copyOnly(final AggregateFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends MonitoringFilter.Builder<_B>
        implements Buildable
    {

        private XMLGregorianCalendar startTime;
        private JAXBElement<NodeId> aggregateType;
        private Double processingInterval;
        private JAXBElement<AggregateConfiguration> aggregateConfiguration;

        public Builder(final _B _parentBuilder, final AggregateFilter _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                this.aggregateType = _other.aggregateType;
                this.processingInterval = _other.processingInterval;
                this.aggregateConfiguration = _other.aggregateConfiguration;
            }
        }

        public Builder(final _B _parentBuilder, final AggregateFilter _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
                    this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                }
                final PropertyTree aggregateTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aggregateType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aggregateTypePropertyTree!= null):((aggregateTypePropertyTree == null)||(!aggregateTypePropertyTree.isLeaf())))) {
                    this.aggregateType = _other.aggregateType;
                }
                final PropertyTree processingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("processingInterval"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(processingIntervalPropertyTree!= null):((processingIntervalPropertyTree == null)||(!processingIntervalPropertyTree.isLeaf())))) {
                    this.processingInterval = _other.processingInterval;
                }
                final PropertyTree aggregateConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aggregateConfiguration"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aggregateConfigurationPropertyTree!= null):((aggregateConfigurationPropertyTree == null)||(!aggregateConfigurationPropertyTree.isLeaf())))) {
                    this.aggregateConfiguration = _other.aggregateConfiguration;
                }
            }
        }

        protected<_P extends AggregateFilter >_P init(final _P _product) {
            _product.startTime = this.startTime;
            _product.aggregateType = this.aggregateType;
            _product.processingInterval = this.processingInterval;
            _product.aggregateConfiguration = this.aggregateConfiguration;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param startTime
         *     Neuer Wert der Eigenschaft "startTime".
         */
        public AggregateFilter.Builder<_B> withStartTime(final XMLGregorianCalendar startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "aggregateType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param aggregateType
         *     Neuer Wert der Eigenschaft "aggregateType".
         */
        public AggregateFilter.Builder<_B> withAggregateType(final JAXBElement<NodeId> aggregateType) {
            this.aggregateType = aggregateType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "processingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param processingInterval
         *     Neuer Wert der Eigenschaft "processingInterval".
         */
        public AggregateFilter.Builder<_B> withProcessingInterval(final Double processingInterval) {
            this.processingInterval = processingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "aggregateConfiguration" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param aggregateConfiguration
         *     Neuer Wert der Eigenschaft "aggregateConfiguration".
         */
        public AggregateFilter.Builder<_B> withAggregateConfiguration(final JAXBElement<AggregateConfiguration> aggregateConfiguration) {
            this.aggregateConfiguration = aggregateConfiguration;
            return this;
        }

        @Override
        public AggregateFilter build() {
            if (_storedValue == null) {
                return this.init(new AggregateFilter());
            } else {
                return ((AggregateFilter) _storedValue);
            }
        }

        public AggregateFilter.Builder<_B> copyOf(final AggregateFilter _other) {
            _other.copyTo(this);
            return this;
        }

        public AggregateFilter.Builder<_B> copyOf(final AggregateFilter.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AggregateFilter.Selector<AggregateFilter.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AggregateFilter.Select _root() {
            return new AggregateFilter.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MonitoringFilter.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> startTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> aggregateType = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> processingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> aggregateConfiguration = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.startTime!= null) {
                products.put("startTime", this.startTime.init());
            }
            if (this.aggregateType!= null) {
                products.put("aggregateType", this.aggregateType.init());
            }
            if (this.processingInterval!= null) {
                products.put("processingInterval", this.processingInterval.init());
            }
            if (this.aggregateConfiguration!= null) {
                products.put("aggregateConfiguration", this.aggregateConfiguration.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> startTime() {
            return ((this.startTime == null)?this.startTime = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>>(this._root, this, "startTime"):this.startTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> aggregateType() {
            return ((this.aggregateType == null)?this.aggregateType = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>>(this._root, this, "aggregateType"):this.aggregateType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> processingInterval() {
            return ((this.processingInterval == null)?this.processingInterval = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>>(this._root, this, "processingInterval"):this.processingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>> aggregateConfiguration() {
            return ((this.aggregateConfiguration == null)?this.aggregateConfiguration = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilter.Selector<TRoot, TParent>>(this._root, this, "aggregateConfiguration"):this.aggregateConfiguration);
        }

    }

}
