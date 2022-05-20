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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfDateTime complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDateTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDateTime", propOrder = {
    "dateTime"
})
public class ListOfDateTime {

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dateTime;

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dateTime;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDateTime.Builder<_B> _other) {
        if (this.dateTime == null) {
            _other.dateTime = null;
        } else {
            _other.dateTime = new ArrayList<Buildable>();
            for (XMLGregorianCalendar _item: this.dateTime) {
                _other.dateTime.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item.clone())));
            }
        }
    }

    public<_B >ListOfDateTime.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDateTime.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDateTime.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDateTime.Builder<Void> builder() {
        return new ListOfDateTime.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDateTime.Builder<_B> copyOf(final ListOfDateTime _other) {
        final ListOfDateTime.Builder<_B> _newBuilder = new ListOfDateTime.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDateTime.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dateTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dateTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dateTimePropertyTree!= null):((dateTimePropertyTree == null)||(!dateTimePropertyTree.isLeaf())))) {
            if (this.dateTime == null) {
                _other.dateTime = null;
            } else {
                _other.dateTime = new ArrayList<Buildable>();
                for (XMLGregorianCalendar _item: this.dateTime) {
                    _other.dateTime.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item.clone())));
                }
            }
        }
    }

    public<_B >ListOfDateTime.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDateTime.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDateTime.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDateTime.Builder<_B> copyOf(final ListOfDateTime _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDateTime.Builder<_B> _newBuilder = new ListOfDateTime.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDateTime.Builder<Void> copyExcept(final ListOfDateTime _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDateTime.Builder<Void> copyOnly(final ListOfDateTime _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDateTime _storedValue;
        private List<Buildable> dateTime;

        public Builder(final _B _parentBuilder, final ListOfDateTime _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dateTime == null) {
                        this.dateTime = null;
                    } else {
                        this.dateTime = new ArrayList<Buildable>();
                        for (XMLGregorianCalendar _item: _other.dateTime) {
                            this.dateTime.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item.clone())));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDateTime _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dateTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dateTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dateTimePropertyTree!= null):((dateTimePropertyTree == null)||(!dateTimePropertyTree.isLeaf())))) {
                        if (_other.dateTime == null) {
                            this.dateTime = null;
                        } else {
                            this.dateTime = new ArrayList<Buildable>();
                            for (XMLGregorianCalendar _item: _other.dateTime) {
                                this.dateTime.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item.clone())));
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

        protected<_P extends ListOfDateTime >_P init(final _P _product) {
            if (this.dateTime!= null) {
                final List<XMLGregorianCalendar> dateTime = new ArrayList<XMLGregorianCalendar>(this.dateTime.size());
                for (Buildable _item: this.dateTime) {
                    dateTime.add(((XMLGregorianCalendar) _item.build()));
                }
                _product.dateTime = dateTime;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dateTime" hinzu.
         * 
         * @param dateTime
         *     Werte, die zur Eigenschaft "dateTime" hinzugefügt werden.
         */
        public ListOfDateTime.Builder<_B> addDateTime(final Iterable<? extends XMLGregorianCalendar> dateTime) {
            if (dateTime!= null) {
                if (this.dateTime == null) {
                    this.dateTime = new ArrayList<Buildable>();
                }
                for (XMLGregorianCalendar _item: dateTime) {
                    this.dateTime.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dateTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dateTime
         *     Neuer Wert der Eigenschaft "dateTime".
         */
        public ListOfDateTime.Builder<_B> withDateTime(final Iterable<? extends XMLGregorianCalendar> dateTime) {
            if (this.dateTime!= null) {
                this.dateTime.clear();
            }
            return addDateTime(dateTime);
        }

        /**
         * Fügt Werte zur Eigenschaft "dateTime" hinzu.
         * 
         * @param dateTime
         *     Werte, die zur Eigenschaft "dateTime" hinzugefügt werden.
         */
        public ListOfDateTime.Builder<_B> addDateTime(XMLGregorianCalendar... dateTime) {
            addDateTime(Arrays.asList(dateTime));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dateTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dateTime
         *     Neuer Wert der Eigenschaft "dateTime".
         */
        public ListOfDateTime.Builder<_B> withDateTime(XMLGregorianCalendar... dateTime) {
            withDateTime(Arrays.asList(dateTime));
            return this;
        }

        @Override
        public ListOfDateTime build() {
            if (_storedValue == null) {
                return this.init(new ListOfDateTime());
            } else {
                return ((ListOfDateTime) _storedValue);
            }
        }

        public ListOfDateTime.Builder<_B> copyOf(final ListOfDateTime _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDateTime.Builder<_B> copyOf(final ListOfDateTime.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDateTime.Selector<ListOfDateTime.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDateTime.Select _root() {
            return new ListOfDateTime.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfDateTime.Selector<TRoot, TParent>> dateTime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dateTime!= null) {
                products.put("dateTime", this.dateTime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfDateTime.Selector<TRoot, TParent>> dateTime() {
            return ((this.dateTime == null)?this.dateTime = new com.kscs.util.jaxb.Selector<TRoot, ListOfDateTime.Selector<TRoot, TParent>>(this._root, this, "dateTime"):this.dateTime);
        }

    }

}
