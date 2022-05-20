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
 * <p>Java-Klasse für ListOfTimeZoneDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfTimeZoneDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeZoneDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TimeZoneDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTimeZoneDataType", propOrder = {
    "timeZoneDataType"
})
public class ListOfTimeZoneDataType {

    @XmlElement(name = "TimeZoneDataType", nillable = true)
    protected List<TimeZoneDataType> timeZoneDataType;

    /**
     * Gets the value of the timeZoneDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeZoneDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeZoneDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeZoneDataType }
     * 
     * 
     */
    public List<TimeZoneDataType> getTimeZoneDataType() {
        if (timeZoneDataType == null) {
            timeZoneDataType = new ArrayList<TimeZoneDataType>();
        }
        return this.timeZoneDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfTimeZoneDataType.Builder<_B> _other) {
        if (this.timeZoneDataType == null) {
            _other.timeZoneDataType = null;
        } else {
            _other.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
            for (TimeZoneDataType _item: this.timeZoneDataType) {
                _other.timeZoneDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfTimeZoneDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfTimeZoneDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfTimeZoneDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfTimeZoneDataType.Builder<Void> builder() {
        return new ListOfTimeZoneDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfTimeZoneDataType.Builder<_B> copyOf(final ListOfTimeZoneDataType _other) {
        final ListOfTimeZoneDataType.Builder<_B> _newBuilder = new ListOfTimeZoneDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfTimeZoneDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree timeZoneDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timeZoneDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timeZoneDataTypePropertyTree!= null):((timeZoneDataTypePropertyTree == null)||(!timeZoneDataTypePropertyTree.isLeaf())))) {
            if (this.timeZoneDataType == null) {
                _other.timeZoneDataType = null;
            } else {
                _other.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
                for (TimeZoneDataType _item: this.timeZoneDataType) {
                    _other.timeZoneDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, timeZoneDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfTimeZoneDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfTimeZoneDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfTimeZoneDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfTimeZoneDataType.Builder<_B> copyOf(final ListOfTimeZoneDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfTimeZoneDataType.Builder<_B> _newBuilder = new ListOfTimeZoneDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfTimeZoneDataType.Builder<Void> copyExcept(final ListOfTimeZoneDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfTimeZoneDataType.Builder<Void> copyOnly(final ListOfTimeZoneDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfTimeZoneDataType _storedValue;
        private List<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>> timeZoneDataType;

        public Builder(final _B _parentBuilder, final ListOfTimeZoneDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.timeZoneDataType == null) {
                        this.timeZoneDataType = null;
                    } else {
                        this.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
                        for (TimeZoneDataType _item: _other.timeZoneDataType) {
                            this.timeZoneDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfTimeZoneDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree timeZoneDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timeZoneDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timeZoneDataTypePropertyTree!= null):((timeZoneDataTypePropertyTree == null)||(!timeZoneDataTypePropertyTree.isLeaf())))) {
                        if (_other.timeZoneDataType == null) {
                            this.timeZoneDataType = null;
                        } else {
                            this.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
                            for (TimeZoneDataType _item: _other.timeZoneDataType) {
                                this.timeZoneDataType.add(((_item == null)?null:_item.newCopyBuilder(this, timeZoneDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfTimeZoneDataType >_P init(final _P _product) {
            if (this.timeZoneDataType!= null) {
                final List<TimeZoneDataType> timeZoneDataType = new ArrayList<TimeZoneDataType>(this.timeZoneDataType.size());
                for (TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>> _item: this.timeZoneDataType) {
                    timeZoneDataType.add(_item.build());
                }
                _product.timeZoneDataType = timeZoneDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "timeZoneDataType" hinzu.
         * 
         * @param timeZoneDataType
         *     Werte, die zur Eigenschaft "timeZoneDataType" hinzugefügt werden.
         */
        public ListOfTimeZoneDataType.Builder<_B> addTimeZoneDataType(final Iterable<? extends TimeZoneDataType> timeZoneDataType) {
            if (timeZoneDataType!= null) {
                if (this.timeZoneDataType == null) {
                    this.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
                }
                for (TimeZoneDataType _item: timeZoneDataType) {
                    this.timeZoneDataType.add(new TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timeZoneDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param timeZoneDataType
         *     Neuer Wert der Eigenschaft "timeZoneDataType".
         */
        public ListOfTimeZoneDataType.Builder<_B> withTimeZoneDataType(final Iterable<? extends TimeZoneDataType> timeZoneDataType) {
            if (this.timeZoneDataType!= null) {
                this.timeZoneDataType.clear();
            }
            return addTimeZoneDataType(timeZoneDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "timeZoneDataType" hinzu.
         * 
         * @param timeZoneDataType
         *     Werte, die zur Eigenschaft "timeZoneDataType" hinzugefügt werden.
         */
        public ListOfTimeZoneDataType.Builder<_B> addTimeZoneDataType(TimeZoneDataType... timeZoneDataType) {
            addTimeZoneDataType(Arrays.asList(timeZoneDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timeZoneDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param timeZoneDataType
         *     Neuer Wert der Eigenschaft "timeZoneDataType".
         */
        public ListOfTimeZoneDataType.Builder<_B> withTimeZoneDataType(TimeZoneDataType... timeZoneDataType) {
            withTimeZoneDataType(Arrays.asList(timeZoneDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "TimeZoneDataType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "TimeZoneDataType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.TimeZoneDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public TimeZoneDataType.Builder<? extends ListOfTimeZoneDataType.Builder<_B>> addTimeZoneDataType() {
            if (this.timeZoneDataType == null) {
                this.timeZoneDataType = new ArrayList<TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>>();
            }
            final TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>> timeZoneDataType_Builder = new TimeZoneDataType.Builder<ListOfTimeZoneDataType.Builder<_B>>(this, null, false);
            this.timeZoneDataType.add(timeZoneDataType_Builder);
            return timeZoneDataType_Builder;
        }

        @Override
        public ListOfTimeZoneDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfTimeZoneDataType());
            } else {
                return ((ListOfTimeZoneDataType) _storedValue);
            }
        }

        public ListOfTimeZoneDataType.Builder<_B> copyOf(final ListOfTimeZoneDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfTimeZoneDataType.Builder<_B> copyOf(final ListOfTimeZoneDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfTimeZoneDataType.Selector<ListOfTimeZoneDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfTimeZoneDataType.Select _root() {
            return new ListOfTimeZoneDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private TimeZoneDataType.Selector<TRoot, ListOfTimeZoneDataType.Selector<TRoot, TParent>> timeZoneDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.timeZoneDataType!= null) {
                products.put("timeZoneDataType", this.timeZoneDataType.init());
            }
            return products;
        }

        public TimeZoneDataType.Selector<TRoot, ListOfTimeZoneDataType.Selector<TRoot, TParent>> timeZoneDataType() {
            return ((this.timeZoneDataType == null)?this.timeZoneDataType = new TimeZoneDataType.Selector<TRoot, ListOfTimeZoneDataType.Selector<TRoot, TParent>>(this._root, this, "timeZoneDataType"):this.timeZoneDataType);
        }

    }

}
