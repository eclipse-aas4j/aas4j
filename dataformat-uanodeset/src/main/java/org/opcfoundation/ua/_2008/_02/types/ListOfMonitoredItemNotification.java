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
 * <p>Java-Klasse für ListOfMonitoredItemNotification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfMonitoredItemNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemNotification" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoredItemNotification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMonitoredItemNotification", propOrder = {
    "monitoredItemNotification"
})
public class ListOfMonitoredItemNotification {

    @XmlElement(name = "MonitoredItemNotification", nillable = true)
    protected List<MonitoredItemNotification> monitoredItemNotification;

    /**
     * Gets the value of the monitoredItemNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredItemNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredItemNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredItemNotification }
     * 
     * 
     */
    public List<MonitoredItemNotification> getMonitoredItemNotification() {
        if (monitoredItemNotification == null) {
            monitoredItemNotification = new ArrayList<MonitoredItemNotification>();
        }
        return this.monitoredItemNotification;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfMonitoredItemNotification.Builder<_B> _other) {
        if (this.monitoredItemNotification == null) {
            _other.monitoredItemNotification = null;
        } else {
            _other.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
            for (MonitoredItemNotification _item: this.monitoredItemNotification) {
                _other.monitoredItemNotification.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfMonitoredItemNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfMonitoredItemNotification.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfMonitoredItemNotification.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfMonitoredItemNotification.Builder<Void> builder() {
        return new ListOfMonitoredItemNotification.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfMonitoredItemNotification.Builder<_B> copyOf(final ListOfMonitoredItemNotification _other) {
        final ListOfMonitoredItemNotification.Builder<_B> _newBuilder = new ListOfMonitoredItemNotification.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfMonitoredItemNotification.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemNotificationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemNotification"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemNotificationPropertyTree!= null):((monitoredItemNotificationPropertyTree == null)||(!monitoredItemNotificationPropertyTree.isLeaf())))) {
            if (this.monitoredItemNotification == null) {
                _other.monitoredItemNotification = null;
            } else {
                _other.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
                for (MonitoredItemNotification _item: this.monitoredItemNotification) {
                    _other.monitoredItemNotification.add(((_item == null)?null:_item.newCopyBuilder(_other, monitoredItemNotificationPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfMonitoredItemNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfMonitoredItemNotification.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfMonitoredItemNotification.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfMonitoredItemNotification.Builder<_B> copyOf(final ListOfMonitoredItemNotification _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfMonitoredItemNotification.Builder<_B> _newBuilder = new ListOfMonitoredItemNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfMonitoredItemNotification.Builder<Void> copyExcept(final ListOfMonitoredItemNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfMonitoredItemNotification.Builder<Void> copyOnly(final ListOfMonitoredItemNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfMonitoredItemNotification _storedValue;
        private List<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>> monitoredItemNotification;

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemNotification _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.monitoredItemNotification == null) {
                        this.monitoredItemNotification = null;
                    } else {
                        this.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
                        for (MonitoredItemNotification _item: _other.monitoredItemNotification) {
                            this.monitoredItemNotification.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemNotification _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemNotificationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemNotification"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemNotificationPropertyTree!= null):((monitoredItemNotificationPropertyTree == null)||(!monitoredItemNotificationPropertyTree.isLeaf())))) {
                        if (_other.monitoredItemNotification == null) {
                            this.monitoredItemNotification = null;
                        } else {
                            this.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
                            for (MonitoredItemNotification _item: _other.monitoredItemNotification) {
                                this.monitoredItemNotification.add(((_item == null)?null:_item.newCopyBuilder(this, monitoredItemNotificationPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfMonitoredItemNotification >_P init(final _P _product) {
            if (this.monitoredItemNotification!= null) {
                final List<MonitoredItemNotification> monitoredItemNotification = new ArrayList<MonitoredItemNotification>(this.monitoredItemNotification.size());
                for (MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>> _item: this.monitoredItemNotification) {
                    monitoredItemNotification.add(_item.build());
                }
                _product.monitoredItemNotification = monitoredItemNotification;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemNotification" hinzu.
         * 
         * @param monitoredItemNotification
         *     Werte, die zur Eigenschaft "monitoredItemNotification" hinzugefügt werden.
         */
        public ListOfMonitoredItemNotification.Builder<_B> addMonitoredItemNotification(final Iterable<? extends MonitoredItemNotification> monitoredItemNotification) {
            if (monitoredItemNotification!= null) {
                if (this.monitoredItemNotification == null) {
                    this.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
                }
                for (MonitoredItemNotification _item: monitoredItemNotification) {
                    this.monitoredItemNotification.add(new MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemNotification" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemNotification
         *     Neuer Wert der Eigenschaft "monitoredItemNotification".
         */
        public ListOfMonitoredItemNotification.Builder<_B> withMonitoredItemNotification(final Iterable<? extends MonitoredItemNotification> monitoredItemNotification) {
            if (this.monitoredItemNotification!= null) {
                this.monitoredItemNotification.clear();
            }
            return addMonitoredItemNotification(monitoredItemNotification);
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemNotification" hinzu.
         * 
         * @param monitoredItemNotification
         *     Werte, die zur Eigenschaft "monitoredItemNotification" hinzugefügt werden.
         */
        public ListOfMonitoredItemNotification.Builder<_B> addMonitoredItemNotification(MonitoredItemNotification... monitoredItemNotification) {
            addMonitoredItemNotification(Arrays.asList(monitoredItemNotification));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemNotification" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemNotification
         *     Neuer Wert der Eigenschaft "monitoredItemNotification".
         */
        public ListOfMonitoredItemNotification.Builder<_B> withMonitoredItemNotification(MonitoredItemNotification... monitoredItemNotification) {
            withMonitoredItemNotification(Arrays.asList(monitoredItemNotification));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "MonitoredItemNotification".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.MonitoredItemNotification.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "MonitoredItemNotification".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.MonitoredItemNotification.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public MonitoredItemNotification.Builder<? extends ListOfMonitoredItemNotification.Builder<_B>> addMonitoredItemNotification() {
            if (this.monitoredItemNotification == null) {
                this.monitoredItemNotification = new ArrayList<MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>>();
            }
            final MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>> monitoredItemNotification_Builder = new MonitoredItemNotification.Builder<ListOfMonitoredItemNotification.Builder<_B>>(this, null, false);
            this.monitoredItemNotification.add(monitoredItemNotification_Builder);
            return monitoredItemNotification_Builder;
        }

        @Override
        public ListOfMonitoredItemNotification build() {
            if (_storedValue == null) {
                return this.init(new ListOfMonitoredItemNotification());
            } else {
                return ((ListOfMonitoredItemNotification) _storedValue);
            }
        }

        public ListOfMonitoredItemNotification.Builder<_B> copyOf(final ListOfMonitoredItemNotification _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfMonitoredItemNotification.Builder<_B> copyOf(final ListOfMonitoredItemNotification.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfMonitoredItemNotification.Selector<ListOfMonitoredItemNotification.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfMonitoredItemNotification.Select _root() {
            return new ListOfMonitoredItemNotification.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private MonitoredItemNotification.Selector<TRoot, ListOfMonitoredItemNotification.Selector<TRoot, TParent>> monitoredItemNotification = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemNotification!= null) {
                products.put("monitoredItemNotification", this.monitoredItemNotification.init());
            }
            return products;
        }

        public MonitoredItemNotification.Selector<TRoot, ListOfMonitoredItemNotification.Selector<TRoot, TParent>> monitoredItemNotification() {
            return ((this.monitoredItemNotification == null)?this.monitoredItemNotification = new MonitoredItemNotification.Selector<TRoot, ListOfMonitoredItemNotification.Selector<TRoot, TParent>>(this._root, this, "monitoredItemNotification"):this.monitoredItemNotification);
        }

    }

}
