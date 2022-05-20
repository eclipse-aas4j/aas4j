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
 * <p>Java-Klasse für AggregateFilterResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AggregateFilterResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringFilterResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RevisedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RevisedProcessingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RevisedAggregateConfiguration" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AggregateConfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateFilterResult", propOrder = {
    "revisedStartTime",
    "revisedProcessingInterval",
    "revisedAggregateConfiguration"
})
public class AggregateFilterResult
    extends MonitoringFilterResult
{

    @XmlElement(name = "RevisedStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revisedStartTime;
    @XmlElement(name = "RevisedProcessingInterval")
    protected Double revisedProcessingInterval;
    @XmlElementRef(name = "RevisedAggregateConfiguration", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AggregateConfiguration> revisedAggregateConfiguration;

    /**
     * Ruft den Wert der revisedStartTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevisedStartTime() {
        return revisedStartTime;
    }

    /**
     * Legt den Wert der revisedStartTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevisedStartTime(XMLGregorianCalendar value) {
        this.revisedStartTime = value;
    }

    /**
     * Ruft den Wert der revisedProcessingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevisedProcessingInterval() {
        return revisedProcessingInterval;
    }

    /**
     * Legt den Wert der revisedProcessingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevisedProcessingInterval(Double value) {
        this.revisedProcessingInterval = value;
    }

    /**
     * Ruft den Wert der revisedAggregateConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AggregateConfiguration }{@code >}
     *     
     */
    public JAXBElement<AggregateConfiguration> getRevisedAggregateConfiguration() {
        return revisedAggregateConfiguration;
    }

    /**
     * Legt den Wert der revisedAggregateConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AggregateConfiguration }{@code >}
     *     
     */
    public void setRevisedAggregateConfiguration(JAXBElement<AggregateConfiguration> value) {
        this.revisedAggregateConfiguration = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AggregateFilterResult.Builder<_B> _other) {
        super.copyTo(_other);
        _other.revisedStartTime = ((this.revisedStartTime == null)?null:((XMLGregorianCalendar) this.revisedStartTime.clone()));
        _other.revisedProcessingInterval = this.revisedProcessingInterval;
        _other.revisedAggregateConfiguration = this.revisedAggregateConfiguration;
    }

    @Override
    public<_B >AggregateFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AggregateFilterResult.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public AggregateFilterResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AggregateFilterResult.Builder<Void> builder() {
        return new AggregateFilterResult.Builder<Void>(null, null, false);
    }

    public static<_B >AggregateFilterResult.Builder<_B> copyOf(final MonitoringFilterResult _other) {
        final AggregateFilterResult.Builder<_B> _newBuilder = new AggregateFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >AggregateFilterResult.Builder<_B> copyOf(final AggregateFilterResult _other) {
        final AggregateFilterResult.Builder<_B> _newBuilder = new AggregateFilterResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AggregateFilterResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree revisedStartTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedStartTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedStartTimePropertyTree!= null):((revisedStartTimePropertyTree == null)||(!revisedStartTimePropertyTree.isLeaf())))) {
            _other.revisedStartTime = ((this.revisedStartTime == null)?null:((XMLGregorianCalendar) this.revisedStartTime.clone()));
        }
        final PropertyTree revisedProcessingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedProcessingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedProcessingIntervalPropertyTree!= null):((revisedProcessingIntervalPropertyTree == null)||(!revisedProcessingIntervalPropertyTree.isLeaf())))) {
            _other.revisedProcessingInterval = this.revisedProcessingInterval;
        }
        final PropertyTree revisedAggregateConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedAggregateConfiguration"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedAggregateConfigurationPropertyTree!= null):((revisedAggregateConfigurationPropertyTree == null)||(!revisedAggregateConfigurationPropertyTree.isLeaf())))) {
            _other.revisedAggregateConfiguration = this.revisedAggregateConfiguration;
        }
    }

    @Override
    public<_B >AggregateFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AggregateFilterResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public AggregateFilterResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AggregateFilterResult.Builder<_B> copyOf(final MonitoringFilterResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AggregateFilterResult.Builder<_B> _newBuilder = new AggregateFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >AggregateFilterResult.Builder<_B> copyOf(final AggregateFilterResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AggregateFilterResult.Builder<_B> _newBuilder = new AggregateFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AggregateFilterResult.Builder<Void> copyExcept(final MonitoringFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AggregateFilterResult.Builder<Void> copyExcept(final AggregateFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AggregateFilterResult.Builder<Void> copyOnly(final MonitoringFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static AggregateFilterResult.Builder<Void> copyOnly(final AggregateFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends MonitoringFilterResult.Builder<_B>
        implements Buildable
    {

        private XMLGregorianCalendar revisedStartTime;
        private Double revisedProcessingInterval;
        private JAXBElement<AggregateConfiguration> revisedAggregateConfiguration;

        public Builder(final _B _parentBuilder, final AggregateFilterResult _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.revisedStartTime = ((_other.revisedStartTime == null)?null:((XMLGregorianCalendar) _other.revisedStartTime.clone()));
                this.revisedProcessingInterval = _other.revisedProcessingInterval;
                this.revisedAggregateConfiguration = _other.revisedAggregateConfiguration;
            }
        }

        public Builder(final _B _parentBuilder, final AggregateFilterResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree revisedStartTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedStartTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedStartTimePropertyTree!= null):((revisedStartTimePropertyTree == null)||(!revisedStartTimePropertyTree.isLeaf())))) {
                    this.revisedStartTime = ((_other.revisedStartTime == null)?null:((XMLGregorianCalendar) _other.revisedStartTime.clone()));
                }
                final PropertyTree revisedProcessingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedProcessingInterval"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedProcessingIntervalPropertyTree!= null):((revisedProcessingIntervalPropertyTree == null)||(!revisedProcessingIntervalPropertyTree.isLeaf())))) {
                    this.revisedProcessingInterval = _other.revisedProcessingInterval;
                }
                final PropertyTree revisedAggregateConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedAggregateConfiguration"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedAggregateConfigurationPropertyTree!= null):((revisedAggregateConfigurationPropertyTree == null)||(!revisedAggregateConfigurationPropertyTree.isLeaf())))) {
                    this.revisedAggregateConfiguration = _other.revisedAggregateConfiguration;
                }
            }
        }

        protected<_P extends AggregateFilterResult >_P init(final _P _product) {
            _product.revisedStartTime = this.revisedStartTime;
            _product.revisedProcessingInterval = this.revisedProcessingInterval;
            _product.revisedAggregateConfiguration = this.revisedAggregateConfiguration;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedStartTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param revisedStartTime
         *     Neuer Wert der Eigenschaft "revisedStartTime".
         */
        public AggregateFilterResult.Builder<_B> withRevisedStartTime(final XMLGregorianCalendar revisedStartTime) {
            this.revisedStartTime = revisedStartTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedProcessingInterval" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedProcessingInterval
         *     Neuer Wert der Eigenschaft "revisedProcessingInterval".
         */
        public AggregateFilterResult.Builder<_B> withRevisedProcessingInterval(final Double revisedProcessingInterval) {
            this.revisedProcessingInterval = revisedProcessingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedAggregateConfiguration" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedAggregateConfiguration
         *     Neuer Wert der Eigenschaft "revisedAggregateConfiguration".
         */
        public AggregateFilterResult.Builder<_B> withRevisedAggregateConfiguration(final JAXBElement<AggregateConfiguration> revisedAggregateConfiguration) {
            this.revisedAggregateConfiguration = revisedAggregateConfiguration;
            return this;
        }

        @Override
        public AggregateFilterResult build() {
            if (_storedValue == null) {
                return this.init(new AggregateFilterResult());
            } else {
                return ((AggregateFilterResult) _storedValue);
            }
        }

        public AggregateFilterResult.Builder<_B> copyOf(final AggregateFilterResult _other) {
            _other.copyTo(this);
            return this;
        }

        public AggregateFilterResult.Builder<_B> copyOf(final AggregateFilterResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AggregateFilterResult.Selector<AggregateFilterResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AggregateFilterResult.Select _root() {
            return new AggregateFilterResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MonitoringFilterResult.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedStartTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedProcessingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedAggregateConfiguration = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.revisedStartTime!= null) {
                products.put("revisedStartTime", this.revisedStartTime.init());
            }
            if (this.revisedProcessingInterval!= null) {
                products.put("revisedProcessingInterval", this.revisedProcessingInterval.init());
            }
            if (this.revisedAggregateConfiguration!= null) {
                products.put("revisedAggregateConfiguration", this.revisedAggregateConfiguration.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedStartTime() {
            return ((this.revisedStartTime == null)?this.revisedStartTime = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>>(this._root, this, "revisedStartTime"):this.revisedStartTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedProcessingInterval() {
            return ((this.revisedProcessingInterval == null)?this.revisedProcessingInterval = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>>(this._root, this, "revisedProcessingInterval"):this.revisedProcessingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>> revisedAggregateConfiguration() {
            return ((this.revisedAggregateConfiguration == null)?this.revisedAggregateConfiguration = new com.kscs.util.jaxb.Selector<TRoot, AggregateFilterResult.Selector<TRoot, TParent>>(this._root, this, "revisedAggregateConfiguration"):this.revisedAggregateConfiguration);
        }

    }

}
