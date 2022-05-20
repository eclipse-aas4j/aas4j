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
 * <p>Java-Klasse für UpdateEventDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateEventDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformInsertReplace" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PerformUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EventFilter" minOccurs="0"/&gt;
 *         &lt;element name="EventData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfHistoryEventFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateEventDetails", propOrder = {
    "performInsertReplace",
    "filter",
    "eventData"
})
public class UpdateEventDetails
    extends HistoryUpdateDetails
{

    @XmlElement(name = "PerformInsertReplace")
    @XmlSchemaType(name = "string")
    protected PerformUpdateType performInsertReplace;
    @XmlElementRef(name = "Filter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EventFilter> filter;
    @XmlElementRef(name = "EventData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfHistoryEventFieldList> eventData;

    /**
     * Ruft den Wert der performInsertReplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PerformUpdateType }
     *     
     */
    public PerformUpdateType getPerformInsertReplace() {
        return performInsertReplace;
    }

    /**
     * Legt den Wert der performInsertReplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformUpdateType }
     *     
     */
    public void setPerformInsertReplace(PerformUpdateType value) {
        this.performInsertReplace = value;
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventFilter }{@code >}
     *     
     */
    public JAXBElement<EventFilter> getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventFilter }{@code >}
     *     
     */
    public void setFilter(JAXBElement<EventFilter> value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der eventData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryEventFieldList }{@code >}
     *     
     */
    public JAXBElement<ListOfHistoryEventFieldList> getEventData() {
        return eventData;
    }

    /**
     * Legt den Wert der eventData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryEventFieldList }{@code >}
     *     
     */
    public void setEventData(JAXBElement<ListOfHistoryEventFieldList> value) {
        this.eventData = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UpdateEventDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.performInsertReplace = this.performInsertReplace;
        _other.filter = this.filter;
        _other.eventData = this.eventData;
    }

    @Override
    public<_B >UpdateEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UpdateEventDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UpdateEventDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UpdateEventDetails.Builder<Void> builder() {
        return new UpdateEventDetails.Builder<Void>(null, null, false);
    }

    public static<_B >UpdateEventDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
        final UpdateEventDetails.Builder<_B> _newBuilder = new UpdateEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UpdateEventDetails.Builder<_B> copyOf(final UpdateEventDetails _other) {
        final UpdateEventDetails.Builder<_B> _newBuilder = new UpdateEventDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UpdateEventDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree performInsertReplacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("performInsertReplace"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(performInsertReplacePropertyTree!= null):((performInsertReplacePropertyTree == null)||(!performInsertReplacePropertyTree.isLeaf())))) {
            _other.performInsertReplace = this.performInsertReplace;
        }
        final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
            _other.filter = this.filter;
        }
        final PropertyTree eventDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventDataPropertyTree!= null):((eventDataPropertyTree == null)||(!eventDataPropertyTree.isLeaf())))) {
            _other.eventData = this.eventData;
        }
    }

    @Override
    public<_B >UpdateEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UpdateEventDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UpdateEventDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UpdateEventDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UpdateEventDetails.Builder<_B> _newBuilder = new UpdateEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UpdateEventDetails.Builder<_B> copyOf(final UpdateEventDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UpdateEventDetails.Builder<_B> _newBuilder = new UpdateEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UpdateEventDetails.Builder<Void> copyExcept(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UpdateEventDetails.Builder<Void> copyExcept(final UpdateEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UpdateEventDetails.Builder<Void> copyOnly(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UpdateEventDetails.Builder<Void> copyOnly(final UpdateEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryUpdateDetails.Builder<_B>
        implements Buildable
    {

        private PerformUpdateType performInsertReplace;
        private JAXBElement<EventFilter> filter;
        private JAXBElement<ListOfHistoryEventFieldList> eventData;

        public Builder(final _B _parentBuilder, final UpdateEventDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.performInsertReplace = _other.performInsertReplace;
                this.filter = _other.filter;
                this.eventData = _other.eventData;
            }
        }

        public Builder(final _B _parentBuilder, final UpdateEventDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree performInsertReplacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("performInsertReplace"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(performInsertReplacePropertyTree!= null):((performInsertReplacePropertyTree == null)||(!performInsertReplacePropertyTree.isLeaf())))) {
                    this.performInsertReplace = _other.performInsertReplace;
                }
                final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
                    this.filter = _other.filter;
                }
                final PropertyTree eventDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventData"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventDataPropertyTree!= null):((eventDataPropertyTree == null)||(!eventDataPropertyTree.isLeaf())))) {
                    this.eventData = _other.eventData;
                }
            }
        }

        protected<_P extends UpdateEventDetails >_P init(final _P _product) {
            _product.performInsertReplace = this.performInsertReplace;
            _product.filter = this.filter;
            _product.eventData = this.eventData;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "performInsertReplace" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param performInsertReplace
         *     Neuer Wert der Eigenschaft "performInsertReplace".
         */
        public UpdateEventDetails.Builder<_B> withPerformInsertReplace(final PerformUpdateType performInsertReplace) {
            this.performInsertReplace = performInsertReplace;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filter" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param filter
         *     Neuer Wert der Eigenschaft "filter".
         */
        public UpdateEventDetails.Builder<_B> withFilter(final JAXBElement<EventFilter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventData" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param eventData
         *     Neuer Wert der Eigenschaft "eventData".
         */
        public UpdateEventDetails.Builder<_B> withEventData(final JAXBElement<ListOfHistoryEventFieldList> eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public UpdateEventDetails.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        @Override
        public UpdateEventDetails build() {
            if (_storedValue == null) {
                return this.init(new UpdateEventDetails());
            } else {
                return ((UpdateEventDetails) _storedValue);
            }
        }

        public UpdateEventDetails.Builder<_B> copyOf(final UpdateEventDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public UpdateEventDetails.Builder<_B> copyOf(final UpdateEventDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UpdateEventDetails.Selector<UpdateEventDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UpdateEventDetails.Select _root() {
            return new UpdateEventDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryUpdateDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> performInsertReplace = null;
        private com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> filter = null;
        private com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> eventData = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.performInsertReplace!= null) {
                products.put("performInsertReplace", this.performInsertReplace.init());
            }
            if (this.filter!= null) {
                products.put("filter", this.filter.init());
            }
            if (this.eventData!= null) {
                products.put("eventData", this.eventData.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> performInsertReplace() {
            return ((this.performInsertReplace == null)?this.performInsertReplace = new com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>>(this._root, this, "performInsertReplace"):this.performInsertReplace);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> filter() {
            return ((this.filter == null)?this.filter = new com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>>(this._root, this, "filter"):this.filter);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>> eventData() {
            return ((this.eventData == null)?this.eventData = new com.kscs.util.jaxb.Selector<TRoot, UpdateEventDetails.Selector<TRoot, TParent>>(this._root, this, "eventData"):this.eventData);
        }

    }

}
