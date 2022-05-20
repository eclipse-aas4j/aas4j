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
 * <p>Java-Klasse für HistoryEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Events" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfHistoryEventFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryEvent", propOrder = {
    "events"
})
public class HistoryEvent {

    @XmlElementRef(name = "Events", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfHistoryEventFieldList> events;

    /**
     * Ruft den Wert der events-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryEventFieldList }{@code >}
     *     
     */
    public JAXBElement<ListOfHistoryEventFieldList> getEvents() {
        return events;
    }

    /**
     * Legt den Wert der events-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryEventFieldList }{@code >}
     *     
     */
    public void setEvents(JAXBElement<ListOfHistoryEventFieldList> value) {
        this.events = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryEvent.Builder<_B> _other) {
        _other.events = this.events;
    }

    public<_B >HistoryEvent.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryEvent.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryEvent.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryEvent.Builder<Void> builder() {
        return new HistoryEvent.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryEvent.Builder<_B> copyOf(final HistoryEvent _other) {
        final HistoryEvent.Builder<_B> _newBuilder = new HistoryEvent.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryEvent.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree eventsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("events"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventsPropertyTree!= null):((eventsPropertyTree == null)||(!eventsPropertyTree.isLeaf())))) {
            _other.events = this.events;
        }
    }

    public<_B >HistoryEvent.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryEvent.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryEvent.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryEvent.Builder<_B> copyOf(final HistoryEvent _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryEvent.Builder<_B> _newBuilder = new HistoryEvent.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryEvent.Builder<Void> copyExcept(final HistoryEvent _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryEvent.Builder<Void> copyOnly(final HistoryEvent _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryEvent _storedValue;
        private JAXBElement<ListOfHistoryEventFieldList> events;

        public Builder(final _B _parentBuilder, final HistoryEvent _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.events = _other.events;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryEvent _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree eventsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("events"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventsPropertyTree!= null):((eventsPropertyTree == null)||(!eventsPropertyTree.isLeaf())))) {
                        this.events = _other.events;
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

        protected<_P extends HistoryEvent >_P init(final _P _product) {
            _product.events = this.events;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "events" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param events
         *     Neuer Wert der Eigenschaft "events".
         */
        public HistoryEvent.Builder<_B> withEvents(final JAXBElement<ListOfHistoryEventFieldList> events) {
            this.events = events;
            return this;
        }

        @Override
        public HistoryEvent build() {
            if (_storedValue == null) {
                return this.init(new HistoryEvent());
            } else {
                return ((HistoryEvent) _storedValue);
            }
        }

        public HistoryEvent.Builder<_B> copyOf(final HistoryEvent _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryEvent.Builder<_B> copyOf(final HistoryEvent.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryEvent.Selector<HistoryEvent.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryEvent.Select _root() {
            return new HistoryEvent.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryEvent.Selector<TRoot, TParent>> events = null;

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

        public com.kscs.util.jaxb.Selector<TRoot, HistoryEvent.Selector<TRoot, TParent>> events() {
            return ((this.events == null)?this.events = new com.kscs.util.jaxb.Selector<TRoot, HistoryEvent.Selector<TRoot, TParent>>(this._root, this, "events"):this.events);
        }

    }

}
