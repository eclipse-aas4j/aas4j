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
 * <p>Java-Klasse für ReadEventDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReadEventDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryReadDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumValuesPerNode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EventFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadEventDetails", propOrder = {
    "numValuesPerNode",
    "startTime",
    "endTime",
    "filter"
})
public class ReadEventDetails
    extends HistoryReadDetails
{

    @XmlElement(name = "NumValuesPerNode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numValuesPerNode;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElementRef(name = "Filter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EventFilter> filter;

    /**
     * Ruft den Wert der numValuesPerNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumValuesPerNode() {
        return numValuesPerNode;
    }

    /**
     * Legt den Wert der numValuesPerNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumValuesPerNode(Long value) {
        this.numValuesPerNode = value;
    }

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
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReadEventDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.numValuesPerNode = this.numValuesPerNode;
        _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
        _other.filter = this.filter;
    }

    @Override
    public<_B >ReadEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReadEventDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ReadEventDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReadEventDetails.Builder<Void> builder() {
        return new ReadEventDetails.Builder<Void>(null, null, false);
    }

    public static<_B >ReadEventDetails.Builder<_B> copyOf(final HistoryReadDetails _other) {
        final ReadEventDetails.Builder<_B> _newBuilder = new ReadEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ReadEventDetails.Builder<_B> copyOf(final ReadEventDetails _other) {
        final ReadEventDetails.Builder<_B> _newBuilder = new ReadEventDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReadEventDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree numValuesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numValuesPerNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numValuesPerNodePropertyTree!= null):((numValuesPerNodePropertyTree == null)||(!numValuesPerNodePropertyTree.isLeaf())))) {
            _other.numValuesPerNode = this.numValuesPerNode;
        }
        final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
            _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        }
        final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
            _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
        }
        final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
            _other.filter = this.filter;
        }
    }

    @Override
    public<_B >ReadEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReadEventDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ReadEventDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReadEventDetails.Builder<_B> copyOf(final HistoryReadDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadEventDetails.Builder<_B> _newBuilder = new ReadEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ReadEventDetails.Builder<_B> copyOf(final ReadEventDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadEventDetails.Builder<_B> _newBuilder = new ReadEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReadEventDetails.Builder<Void> copyExcept(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadEventDetails.Builder<Void> copyExcept(final ReadEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadEventDetails.Builder<Void> copyOnly(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ReadEventDetails.Builder<Void> copyOnly(final ReadEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryReadDetails.Builder<_B>
        implements Buildable
    {

        private Long numValuesPerNode;
        private XMLGregorianCalendar startTime;
        private XMLGregorianCalendar endTime;
        private JAXBElement<EventFilter> filter;

        public Builder(final _B _parentBuilder, final ReadEventDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.numValuesPerNode = _other.numValuesPerNode;
                this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
                this.filter = _other.filter;
            }
        }

        public Builder(final _B _parentBuilder, final ReadEventDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree numValuesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numValuesPerNode"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numValuesPerNodePropertyTree!= null):((numValuesPerNodePropertyTree == null)||(!numValuesPerNodePropertyTree.isLeaf())))) {
                    this.numValuesPerNode = _other.numValuesPerNode;
                }
                final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
                    this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                }
                final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
                    this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
                }
                final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
                    this.filter = _other.filter;
                }
            }
        }

        protected<_P extends ReadEventDetails >_P init(final _P _product) {
            _product.numValuesPerNode = this.numValuesPerNode;
            _product.startTime = this.startTime;
            _product.endTime = this.endTime;
            _product.filter = this.filter;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "numValuesPerNode" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param numValuesPerNode
         *     Neuer Wert der Eigenschaft "numValuesPerNode".
         */
        public ReadEventDetails.Builder<_B> withNumValuesPerNode(final Long numValuesPerNode) {
            this.numValuesPerNode = numValuesPerNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param startTime
         *     Neuer Wert der Eigenschaft "startTime".
         */
        public ReadEventDetails.Builder<_B> withStartTime(final XMLGregorianCalendar startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param endTime
         *     Neuer Wert der Eigenschaft "endTime".
         */
        public ReadEventDetails.Builder<_B> withEndTime(final XMLGregorianCalendar endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filter" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param filter
         *     Neuer Wert der Eigenschaft "filter".
         */
        public ReadEventDetails.Builder<_B> withFilter(final JAXBElement<EventFilter> filter) {
            this.filter = filter;
            return this;
        }

        @Override
        public ReadEventDetails build() {
            if (_storedValue == null) {
                return this.init(new ReadEventDetails());
            } else {
                return ((ReadEventDetails) _storedValue);
            }
        }

        public ReadEventDetails.Builder<_B> copyOf(final ReadEventDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public ReadEventDetails.Builder<_B> copyOf(final ReadEventDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReadEventDetails.Selector<ReadEventDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReadEventDetails.Select _root() {
            return new ReadEventDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryReadDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> numValuesPerNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> startTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> endTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> filter = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.numValuesPerNode!= null) {
                products.put("numValuesPerNode", this.numValuesPerNode.init());
            }
            if (this.startTime!= null) {
                products.put("startTime", this.startTime.init());
            }
            if (this.endTime!= null) {
                products.put("endTime", this.endTime.init());
            }
            if (this.filter!= null) {
                products.put("filter", this.filter.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> numValuesPerNode() {
            return ((this.numValuesPerNode == null)?this.numValuesPerNode = new com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>>(this._root, this, "numValuesPerNode"):this.numValuesPerNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> startTime() {
            return ((this.startTime == null)?this.startTime = new com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>>(this._root, this, "startTime"):this.startTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> endTime() {
            return ((this.endTime == null)?this.endTime = new com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>>(this._root, this, "endTime"):this.endTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>> filter() {
            return ((this.filter == null)?this.filter = new com.kscs.util.jaxb.Selector<TRoot, ReadEventDetails.Selector<TRoot, TParent>>(this._root, this, "filter"):this.filter);
        }

    }

}
