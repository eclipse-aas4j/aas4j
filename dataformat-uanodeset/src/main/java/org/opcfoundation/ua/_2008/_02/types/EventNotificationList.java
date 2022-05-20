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
 * <p>Java-Klasse für EventNotificationList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventNotificationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NotificationData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Events" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEventFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventNotificationList", propOrder = {
    "events"
})
public class EventNotificationList
    extends NotificationData
{

    @XmlElementRef(name = "Events", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEventFieldList> events;

    /**
     * Ruft den Wert der events-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEventFieldList }{@code >}
     *     
     */
    public JAXBElement<ListOfEventFieldList> getEvents() {
        return events;
    }

    /**
     * Legt den Wert der events-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEventFieldList }{@code >}
     *     
     */
    public void setEvents(JAXBElement<ListOfEventFieldList> value) {
        this.events = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EventNotificationList.Builder<_B> _other) {
        super.copyTo(_other);
        _other.events = this.events;
    }

    @Override
    public<_B >EventNotificationList.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EventNotificationList.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public EventNotificationList.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EventNotificationList.Builder<Void> builder() {
        return new EventNotificationList.Builder<Void>(null, null, false);
    }

    public static<_B >EventNotificationList.Builder<_B> copyOf(final NotificationData _other) {
        final EventNotificationList.Builder<_B> _newBuilder = new EventNotificationList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >EventNotificationList.Builder<_B> copyOf(final EventNotificationList _other) {
        final EventNotificationList.Builder<_B> _newBuilder = new EventNotificationList.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EventNotificationList.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree eventsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("events"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventsPropertyTree!= null):((eventsPropertyTree == null)||(!eventsPropertyTree.isLeaf())))) {
            _other.events = this.events;
        }
    }

    @Override
    public<_B >EventNotificationList.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EventNotificationList.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public EventNotificationList.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EventNotificationList.Builder<_B> copyOf(final NotificationData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventNotificationList.Builder<_B> _newBuilder = new EventNotificationList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >EventNotificationList.Builder<_B> copyOf(final EventNotificationList _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventNotificationList.Builder<_B> _newBuilder = new EventNotificationList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EventNotificationList.Builder<Void> copyExcept(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventNotificationList.Builder<Void> copyExcept(final EventNotificationList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventNotificationList.Builder<Void> copyOnly(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static EventNotificationList.Builder<Void> copyOnly(final EventNotificationList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NotificationData.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfEventFieldList> events;

        public Builder(final _B _parentBuilder, final EventNotificationList _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.events = _other.events;
            }
        }

        public Builder(final _B _parentBuilder, final EventNotificationList _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree eventsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("events"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventsPropertyTree!= null):((eventsPropertyTree == null)||(!eventsPropertyTree.isLeaf())))) {
                    this.events = _other.events;
                }
            }
        }

        protected<_P extends EventNotificationList >_P init(final _P _product) {
            _product.events = this.events;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "events" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param events
         *     Neuer Wert der Eigenschaft "events".
         */
        public EventNotificationList.Builder<_B> withEvents(final JAXBElement<ListOfEventFieldList> events) {
            this.events = events;
            return this;
        }

        @Override
        public EventNotificationList build() {
            if (_storedValue == null) {
                return this.init(new EventNotificationList());
            } else {
                return ((EventNotificationList) _storedValue);
            }
        }

        public EventNotificationList.Builder<_B> copyOf(final EventNotificationList _other) {
            _other.copyTo(this);
            return this;
        }

        public EventNotificationList.Builder<_B> copyOf(final EventNotificationList.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EventNotificationList.Selector<EventNotificationList.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EventNotificationList.Select _root() {
            return new EventNotificationList.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NotificationData.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EventNotificationList.Selector<TRoot, TParent>> events = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.events!= null) {
                products.put("events", this.events.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventNotificationList.Selector<TRoot, TParent>> events() {
            return ((this.events == null)?this.events = new com.kscs.util.jaxb.Selector<TRoot, EventNotificationList.Selector<TRoot, TParent>>(this._root, this, "events"):this.events);
        }

    }

}
