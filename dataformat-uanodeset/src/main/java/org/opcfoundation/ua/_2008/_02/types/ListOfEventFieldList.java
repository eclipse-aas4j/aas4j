//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfEventFieldList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEventFieldList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventFieldList" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EventFieldList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEventFieldList", propOrder = {
    "eventFieldList"
})
public class ListOfEventFieldList {

    @XmlElement(name = "EventFieldList", nillable = true)
    protected List<EventFieldList> eventFieldList;

    /**
     * Gets the value of the eventFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventFieldList }
     * 
     * 
     */
    public List<EventFieldList> getEventFieldList() {
        if (eventFieldList == null) {
            eventFieldList = new ArrayList<EventFieldList>();
        }
        return this.eventFieldList;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEventFieldList.Builder<_B> _other) {
        if (this.eventFieldList == null) {
            _other.eventFieldList = null;
        } else {
            _other.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
            for (EventFieldList _item: this.eventFieldList) {
                _other.eventFieldList.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEventFieldList.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEventFieldList.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEventFieldList.Builder<Void> builder() {
        return new ListOfEventFieldList.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEventFieldList.Builder<_B> copyOf(final ListOfEventFieldList _other) {
        final ListOfEventFieldList.Builder<_B> _newBuilder = new ListOfEventFieldList.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEventFieldList.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree eventFieldListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFieldList"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldListPropertyTree!= null):((eventFieldListPropertyTree == null)||(!eventFieldListPropertyTree.isLeaf())))) {
            if (this.eventFieldList == null) {
                _other.eventFieldList = null;
            } else {
                _other.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
                for (EventFieldList _item: this.eventFieldList) {
                    _other.eventFieldList.add(((_item == null)?null:_item.newCopyBuilder(_other, eventFieldListPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEventFieldList.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEventFieldList.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEventFieldList.Builder<_B> copyOf(final ListOfEventFieldList _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEventFieldList.Builder<_B> _newBuilder = new ListOfEventFieldList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEventFieldList.Builder<Void> copyExcept(final ListOfEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEventFieldList.Builder<Void> copyOnly(final ListOfEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEventFieldList _storedValue;
        private List<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>> eventFieldList;

        public Builder(final _B _parentBuilder, final ListOfEventFieldList _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.eventFieldList == null) {
                        this.eventFieldList = null;
                    } else {
                        this.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
                        for (EventFieldList _item: _other.eventFieldList) {
                            this.eventFieldList.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEventFieldList _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree eventFieldListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFieldList"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldListPropertyTree!= null):((eventFieldListPropertyTree == null)||(!eventFieldListPropertyTree.isLeaf())))) {
                        if (_other.eventFieldList == null) {
                            this.eventFieldList = null;
                        } else {
                            this.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
                            for (EventFieldList _item: _other.eventFieldList) {
                                this.eventFieldList.add(((_item == null)?null:_item.newCopyBuilder(this, eventFieldListPropertyTree, _propertyTreeUse)));
                            }
                        }
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

        protected<_P extends ListOfEventFieldList >_P init(final _P _product) {
            if (this.eventFieldList!= null) {
                final List<EventFieldList> eventFieldList = new ArrayList<EventFieldList>(this.eventFieldList.size());
                for (EventFieldList.Builder<ListOfEventFieldList.Builder<_B>> _item: this.eventFieldList) {
                    eventFieldList.add(_item.build());
                }
                _product.eventFieldList = eventFieldList;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "eventFieldList" hinzu.
         * 
         * @param eventFieldList
         *     Werte, die zur Eigenschaft "eventFieldList" hinzugefügt werden.
         */
        public ListOfEventFieldList.Builder<_B> addEventFieldList(final Iterable<? extends EventFieldList> eventFieldList) {
            if (eventFieldList!= null) {
                if (this.eventFieldList == null) {
                    this.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
                }
                for (EventFieldList _item: eventFieldList) {
                    this.eventFieldList.add(new EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventFieldList" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventFieldList
         *     Neuer Wert der Eigenschaft "eventFieldList".
         */
        public ListOfEventFieldList.Builder<_B> withEventFieldList(final Iterable<? extends EventFieldList> eventFieldList) {
            if (this.eventFieldList!= null) {
                this.eventFieldList.clear();
            }
            return addEventFieldList(eventFieldList);
        }

        /**
         * Fügt Werte zur Eigenschaft "eventFieldList" hinzu.
         * 
         * @param eventFieldList
         *     Werte, die zur Eigenschaft "eventFieldList" hinzugefügt werden.
         */
        public ListOfEventFieldList.Builder<_B> addEventFieldList(EventFieldList... eventFieldList) {
            addEventFieldList(Arrays.asList(eventFieldList));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventFieldList" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventFieldList
         *     Neuer Wert der Eigenschaft "eventFieldList".
         */
        public ListOfEventFieldList.Builder<_B> withEventFieldList(EventFieldList... eventFieldList) {
            withEventFieldList(Arrays.asList(eventFieldList));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EventFieldList".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EventFieldList.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EventFieldList".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EventFieldList.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public EventFieldList.Builder<? extends ListOfEventFieldList.Builder<_B>> addEventFieldList() {
            if (this.eventFieldList == null) {
                this.eventFieldList = new ArrayList<EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>>();
            }
            final EventFieldList.Builder<ListOfEventFieldList.Builder<_B>> eventFieldList_Builder = new EventFieldList.Builder<ListOfEventFieldList.Builder<_B>>(this, null, false);
            this.eventFieldList.add(eventFieldList_Builder);
            return eventFieldList_Builder;
        }

        @Override
        public ListOfEventFieldList build() {
            if (_storedValue == null) {
                return this.init(new ListOfEventFieldList());
            } else {
                return ((ListOfEventFieldList) _storedValue);
            }
        }

        public ListOfEventFieldList.Builder<_B> copyOf(final ListOfEventFieldList _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEventFieldList.Builder<_B> copyOf(final ListOfEventFieldList.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEventFieldList.Selector<ListOfEventFieldList.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEventFieldList.Select _root() {
            return new ListOfEventFieldList.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EventFieldList.Selector<TRoot, ListOfEventFieldList.Selector<TRoot, TParent>> eventFieldList = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.eventFieldList!= null) {
                products.put("eventFieldList", this.eventFieldList.init());
            }
            return products;
        }

        public EventFieldList.Selector<TRoot, ListOfEventFieldList.Selector<TRoot, TParent>> eventFieldList() {
            return ((this.eventFieldList == null)?this.eventFieldList = new EventFieldList.Selector<TRoot, ListOfEventFieldList.Selector<TRoot, TParent>>(this._root, this, "eventFieldList"):this.eventFieldList);
        }

    }

}
