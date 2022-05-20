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
 * <p>Java-Klasse für ListOfGuid complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfGuid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Guid" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Guid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfGuid", propOrder = {
    "guid"
})
public class ListOfGuid {

    @XmlElement(name = "Guid")
    protected List<Guid> guid;

    /**
     * Gets the value of the guid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guid }
     * 
     * 
     */
    public List<Guid> getGuid() {
        if (guid == null) {
            guid = new ArrayList<Guid>();
        }
        return this.guid;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfGuid.Builder<_B> _other) {
        if (this.guid == null) {
            _other.guid = null;
        } else {
            _other.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
            for (Guid _item: this.guid) {
                _other.guid.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfGuid.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfGuid.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfGuid.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfGuid.Builder<Void> builder() {
        return new ListOfGuid.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfGuid.Builder<_B> copyOf(final ListOfGuid _other) {
        final ListOfGuid.Builder<_B> _newBuilder = new ListOfGuid.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfGuid.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree guidPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("guid"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(guidPropertyTree!= null):((guidPropertyTree == null)||(!guidPropertyTree.isLeaf())))) {
            if (this.guid == null) {
                _other.guid = null;
            } else {
                _other.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
                for (Guid _item: this.guid) {
                    _other.guid.add(((_item == null)?null:_item.newCopyBuilder(_other, guidPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfGuid.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfGuid.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfGuid.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfGuid.Builder<_B> copyOf(final ListOfGuid _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfGuid.Builder<_B> _newBuilder = new ListOfGuid.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfGuid.Builder<Void> copyExcept(final ListOfGuid _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfGuid.Builder<Void> copyOnly(final ListOfGuid _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfGuid _storedValue;
        private List<Guid.Builder<ListOfGuid.Builder<_B>>> guid;

        public Builder(final _B _parentBuilder, final ListOfGuid _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.guid == null) {
                        this.guid = null;
                    } else {
                        this.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
                        for (Guid _item: _other.guid) {
                            this.guid.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfGuid _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree guidPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("guid"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(guidPropertyTree!= null):((guidPropertyTree == null)||(!guidPropertyTree.isLeaf())))) {
                        if (_other.guid == null) {
                            this.guid = null;
                        } else {
                            this.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
                            for (Guid _item: _other.guid) {
                                this.guid.add(((_item == null)?null:_item.newCopyBuilder(this, guidPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfGuid >_P init(final _P _product) {
            if (this.guid!= null) {
                final List<Guid> guid = new ArrayList<Guid>(this.guid.size());
                for (Guid.Builder<ListOfGuid.Builder<_B>> _item: this.guid) {
                    guid.add(_item.build());
                }
                _product.guid = guid;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "guid" hinzu.
         * 
         * @param guid
         *     Werte, die zur Eigenschaft "guid" hinzugefügt werden.
         */
        public ListOfGuid.Builder<_B> addGuid(final Iterable<? extends Guid> guid) {
            if (guid!= null) {
                if (this.guid == null) {
                    this.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
                }
                for (Guid _item: guid) {
                    this.guid.add(new Guid.Builder<ListOfGuid.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "guid" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param guid
         *     Neuer Wert der Eigenschaft "guid".
         */
        public ListOfGuid.Builder<_B> withGuid(final Iterable<? extends Guid> guid) {
            if (this.guid!= null) {
                this.guid.clear();
            }
            return addGuid(guid);
        }

        /**
         * Fügt Werte zur Eigenschaft "guid" hinzu.
         * 
         * @param guid
         *     Werte, die zur Eigenschaft "guid" hinzugefügt werden.
         */
        public ListOfGuid.Builder<_B> addGuid(Guid... guid) {
            addGuid(Arrays.asList(guid));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "guid" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param guid
         *     Neuer Wert der Eigenschaft "guid".
         */
        public ListOfGuid.Builder<_B> withGuid(Guid... guid) {
            withGuid(Arrays.asList(guid));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Guid".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Guid".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Guid.Builder<? extends ListOfGuid.Builder<_B>> addGuid() {
            if (this.guid == null) {
                this.guid = new ArrayList<Guid.Builder<ListOfGuid.Builder<_B>>>();
            }
            final Guid.Builder<ListOfGuid.Builder<_B>> guid_Builder = new Guid.Builder<ListOfGuid.Builder<_B>>(this, null, false);
            this.guid.add(guid_Builder);
            return guid_Builder;
        }

        @Override
        public ListOfGuid build() {
            if (_storedValue == null) {
                return this.init(new ListOfGuid());
            } else {
                return ((ListOfGuid) _storedValue);
            }
        }

        public ListOfGuid.Builder<_B> copyOf(final ListOfGuid _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfGuid.Builder<_B> copyOf(final ListOfGuid.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfGuid.Selector<ListOfGuid.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfGuid.Select _root() {
            return new ListOfGuid.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Guid.Selector<TRoot, ListOfGuid.Selector<TRoot, TParent>> guid = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.guid!= null) {
                products.put("guid", this.guid.init());
            }
            return products;
        }

        public Guid.Selector<TRoot, ListOfGuid.Selector<TRoot, TParent>> guid() {
            return ((this.guid == null)?this.guid = new Guid.Selector<TRoot, ListOfGuid.Selector<TRoot, TParent>>(this._root, this, "guid"):this.guid);
        }

    }

}
