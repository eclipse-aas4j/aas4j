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
 * <p>Java-Klasse für EventFieldList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventFieldList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="EventFields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFieldList", propOrder = {
    "clientHandle",
    "eventFields"
})
public class EventFieldList {

    @XmlElement(name = "ClientHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long clientHandle;
    @XmlElementRef(name = "EventFields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> eventFields;

    /**
     * Ruft den Wert der clientHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientHandle() {
        return clientHandle;
    }

    /**
     * Legt den Wert der clientHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientHandle(Long value) {
        this.clientHandle = value;
    }

    /**
     * Ruft den Wert der eventFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getEventFields() {
        return eventFields;
    }

    /**
     * Legt den Wert der eventFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setEventFields(JAXBElement<ListOfVariant> value) {
        this.eventFields = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EventFieldList.Builder<_B> _other) {
        _other.clientHandle = this.clientHandle;
        _other.eventFields = this.eventFields;
    }

    public<_B >EventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EventFieldList.Builder<_B>(_parentBuilder, this, true);
    }

    public EventFieldList.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EventFieldList.Builder<Void> builder() {
        return new EventFieldList.Builder<Void>(null, null, false);
    }

    public static<_B >EventFieldList.Builder<_B> copyOf(final EventFieldList _other) {
        final EventFieldList.Builder<_B> _newBuilder = new EventFieldList.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EventFieldList.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
            _other.clientHandle = this.clientHandle;
        }
        final PropertyTree eventFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldsPropertyTree!= null):((eventFieldsPropertyTree == null)||(!eventFieldsPropertyTree.isLeaf())))) {
            _other.eventFields = this.eventFields;
        }
    }

    public<_B >EventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EventFieldList.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EventFieldList.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EventFieldList.Builder<_B> copyOf(final EventFieldList _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventFieldList.Builder<_B> _newBuilder = new EventFieldList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EventFieldList.Builder<Void> copyExcept(final EventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventFieldList.Builder<Void> copyOnly(final EventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EventFieldList _storedValue;
        private Long clientHandle;
        private JAXBElement<ListOfVariant> eventFields;

        public Builder(final _B _parentBuilder, final EventFieldList _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.clientHandle = _other.clientHandle;
                    this.eventFields = _other.eventFields;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EventFieldList _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
                        this.clientHandle = _other.clientHandle;
                    }
                    final PropertyTree eventFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFields"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldsPropertyTree!= null):((eventFieldsPropertyTree == null)||(!eventFieldsPropertyTree.isLeaf())))) {
                        this.eventFields = _other.eventFields;
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

        protected<_P extends EventFieldList >_P init(final _P _product) {
            _product.clientHandle = this.clientHandle;
            _product.eventFields = this.eventFields;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientHandle" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientHandle
         *     Neuer Wert der Eigenschaft "clientHandle".
         */
        public EventFieldList.Builder<_B> withClientHandle(final Long clientHandle) {
            this.clientHandle = clientHandle;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventFields" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventFields
         *     Neuer Wert der Eigenschaft "eventFields".
         */
        public EventFieldList.Builder<_B> withEventFields(final JAXBElement<ListOfVariant> eventFields) {
            this.eventFields = eventFields;
            return this;
        }

        @Override
        public EventFieldList build() {
            if (_storedValue == null) {
                return this.init(new EventFieldList());
            } else {
                return ((EventFieldList) _storedValue);
            }
        }

        public EventFieldList.Builder<_B> copyOf(final EventFieldList _other) {
            _other.copyTo(this);
            return this;
        }

        public EventFieldList.Builder<_B> copyOf(final EventFieldList.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EventFieldList.Selector<EventFieldList.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EventFieldList.Select _root() {
            return new EventFieldList.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>> clientHandle = null;
        private com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>> eventFields = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.clientHandle!= null) {
                products.put("clientHandle", this.clientHandle.init());
            }
            if (this.eventFields!= null) {
                products.put("eventFields", this.eventFields.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>> clientHandle() {
            return ((this.clientHandle == null)?this.clientHandle = new com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>>(this._root, this, "clientHandle"):this.clientHandle);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>> eventFields() {
            return ((this.eventFields == null)?this.eventFields = new com.kscs.util.jaxb.Selector<TRoot, EventFieldList.Selector<TRoot, TParent>>(this._root, this, "eventFields"):this.eventFields);
        }

    }

}
