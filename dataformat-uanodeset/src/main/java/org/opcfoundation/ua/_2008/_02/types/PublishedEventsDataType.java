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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für PublishedEventsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishedEventsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedDataSetSourceDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventNotifier" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="SelectedFields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSimpleAttributeOperand" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishedEventsDataType", propOrder = {
    "eventNotifier",
    "selectedFields",
    "filter"
})
public class PublishedEventsDataType
    extends PublishedDataSetSourceDataType
{

    @XmlElementRef(name = "EventNotifier", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> eventNotifier;
    @XmlElementRef(name = "SelectedFields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSimpleAttributeOperand> selectedFields;
    @XmlElementRef(name = "Filter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilter> filter;

    /**
     * Ruft den Wert der eventNotifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getEventNotifier() {
        return eventNotifier;
    }

    /**
     * Legt den Wert der eventNotifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setEventNotifier(JAXBElement<NodeId> value) {
        this.eventNotifier = value;
    }

    /**
     * Ruft den Wert der selectedFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleAttributeOperand }{@code >}
     *     
     */
    public JAXBElement<ListOfSimpleAttributeOperand> getSelectedFields() {
        return selectedFields;
    }

    /**
     * Legt den Wert der selectedFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleAttributeOperand }{@code >}
     *     
     */
    public void setSelectedFields(JAXBElement<ListOfSimpleAttributeOperand> value) {
        this.selectedFields = value;
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public JAXBElement<ContentFilter> getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public void setFilter(JAXBElement<ContentFilter> value) {
        this.filter = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishedEventsDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.eventNotifier = this.eventNotifier;
        _other.selectedFields = this.selectedFields;
        _other.filter = this.filter;
    }

    @Override
    public<_B >PublishedEventsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishedEventsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public PublishedEventsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishedEventsDataType.Builder<Void> builder() {
        return new PublishedEventsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PublishedEventsDataType.Builder<_B> copyOf(final PublishedDataSetSourceDataType _other) {
        final PublishedEventsDataType.Builder<_B> _newBuilder = new PublishedEventsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >PublishedEventsDataType.Builder<_B> copyOf(final PublishedEventsDataType _other) {
        final PublishedEventsDataType.Builder<_B> _newBuilder = new PublishedEventsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishedEventsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
            _other.eventNotifier = this.eventNotifier;
        }
        final PropertyTree selectedFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectedFields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectedFieldsPropertyTree!= null):((selectedFieldsPropertyTree == null)||(!selectedFieldsPropertyTree.isLeaf())))) {
            _other.selectedFields = this.selectedFields;
        }
        final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
            _other.filter = this.filter;
        }
    }

    @Override
    public<_B >PublishedEventsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishedEventsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public PublishedEventsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishedEventsDataType.Builder<_B> copyOf(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedEventsDataType.Builder<_B> _newBuilder = new PublishedEventsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >PublishedEventsDataType.Builder<_B> copyOf(final PublishedEventsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedEventsDataType.Builder<_B> _newBuilder = new PublishedEventsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishedEventsDataType.Builder<Void> copyExcept(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedEventsDataType.Builder<Void> copyExcept(final PublishedEventsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedEventsDataType.Builder<Void> copyOnly(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static PublishedEventsDataType.Builder<Void> copyOnly(final PublishedEventsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends PublishedDataSetSourceDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<NodeId> eventNotifier;
        private JAXBElement<ListOfSimpleAttributeOperand> selectedFields;
        private JAXBElement<ContentFilter> filter;

        public Builder(final _B _parentBuilder, final PublishedEventsDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.eventNotifier = _other.eventNotifier;
                this.selectedFields = _other.selectedFields;
                this.filter = _other.filter;
            }
        }

        public Builder(final _B _parentBuilder, final PublishedEventsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
                    this.eventNotifier = _other.eventNotifier;
                }
                final PropertyTree selectedFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectedFields"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectedFieldsPropertyTree!= null):((selectedFieldsPropertyTree == null)||(!selectedFieldsPropertyTree.isLeaf())))) {
                    this.selectedFields = _other.selectedFields;
                }
                final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
                    this.filter = _other.filter;
                }
            }
        }

        protected<_P extends PublishedEventsDataType >_P init(final _P _product) {
            _product.eventNotifier = this.eventNotifier;
            _product.selectedFields = this.selectedFields;
            _product.filter = this.filter;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventNotifier" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventNotifier
         *     Neuer Wert der Eigenschaft "eventNotifier".
         */
        public PublishedEventsDataType.Builder<_B> withEventNotifier(final JAXBElement<NodeId> eventNotifier) {
            this.eventNotifier = eventNotifier;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "selectedFields" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param selectedFields
         *     Neuer Wert der Eigenschaft "selectedFields".
         */
        public PublishedEventsDataType.Builder<_B> withSelectedFields(final JAXBElement<ListOfSimpleAttributeOperand> selectedFields) {
            this.selectedFields = selectedFields;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filter" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param filter
         *     Neuer Wert der Eigenschaft "filter".
         */
        public PublishedEventsDataType.Builder<_B> withFilter(final JAXBElement<ContentFilter> filter) {
            this.filter = filter;
            return this;
        }

        @Override
        public PublishedEventsDataType build() {
            if (_storedValue == null) {
                return this.init(new PublishedEventsDataType());
            } else {
                return ((PublishedEventsDataType) _storedValue);
            }
        }

        public PublishedEventsDataType.Builder<_B> copyOf(final PublishedEventsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishedEventsDataType.Builder<_B> copyOf(final PublishedEventsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishedEventsDataType.Selector<PublishedEventsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishedEventsDataType.Select _root() {
            return new PublishedEventsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends PublishedDataSetSourceDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> eventNotifier = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> selectedFields = null;
        private com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> filter = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.eventNotifier!= null) {
                products.put("eventNotifier", this.eventNotifier.init());
            }
            if (this.selectedFields!= null) {
                products.put("selectedFields", this.selectedFields.init());
            }
            if (this.filter!= null) {
                products.put("filter", this.filter.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> eventNotifier() {
            return ((this.eventNotifier == null)?this.eventNotifier = new com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>>(this._root, this, "eventNotifier"):this.eventNotifier);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> selectedFields() {
            return ((this.selectedFields == null)?this.selectedFields = new com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>>(this._root, this, "selectedFields"):this.selectedFields);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>> filter() {
            return ((this.filter == null)?this.filter = new com.kscs.util.jaxb.Selector<TRoot, PublishedEventsDataType.Selector<TRoot, TParent>>(this._root, this, "filter"):this.filter);
        }

    }

}
