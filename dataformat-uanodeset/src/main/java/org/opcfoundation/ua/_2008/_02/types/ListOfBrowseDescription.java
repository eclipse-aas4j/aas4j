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
 * <p>Java-Klasse für ListOfBrowseDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrowseDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrowseDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrowseDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrowseDescription", propOrder = {
    "browseDescription"
})
public class ListOfBrowseDescription {

    @XmlElement(name = "BrowseDescription", nillable = true)
    protected List<BrowseDescription> browseDescription;

    /**
     * Gets the value of the browseDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browseDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowseDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowseDescription }
     * 
     * 
     */
    public List<BrowseDescription> getBrowseDescription() {
        if (browseDescription == null) {
            browseDescription = new ArrayList<BrowseDescription>();
        }
        return this.browseDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrowseDescription.Builder<_B> _other) {
        if (this.browseDescription == null) {
            _other.browseDescription = null;
        } else {
            _other.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
            for (BrowseDescription _item: this.browseDescription) {
                _other.browseDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrowseDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrowseDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrowseDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrowseDescription.Builder<Void> builder() {
        return new ListOfBrowseDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrowseDescription.Builder<_B> copyOf(final ListOfBrowseDescription _other) {
        final ListOfBrowseDescription.Builder<_B> _newBuilder = new ListOfBrowseDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrowseDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree browseDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseDescriptionPropertyTree!= null):((browseDescriptionPropertyTree == null)||(!browseDescriptionPropertyTree.isLeaf())))) {
            if (this.browseDescription == null) {
                _other.browseDescription = null;
            } else {
                _other.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
                for (BrowseDescription _item: this.browseDescription) {
                    _other.browseDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, browseDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrowseDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrowseDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrowseDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrowseDescription.Builder<_B> copyOf(final ListOfBrowseDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrowseDescription.Builder<_B> _newBuilder = new ListOfBrowseDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrowseDescription.Builder<Void> copyExcept(final ListOfBrowseDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrowseDescription.Builder<Void> copyOnly(final ListOfBrowseDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrowseDescription _storedValue;
        private List<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>> browseDescription;

        public Builder(final _B _parentBuilder, final ListOfBrowseDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.browseDescription == null) {
                        this.browseDescription = null;
                    } else {
                        this.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
                        for (BrowseDescription _item: _other.browseDescription) {
                            this.browseDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrowseDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree browseDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseDescriptionPropertyTree!= null):((browseDescriptionPropertyTree == null)||(!browseDescriptionPropertyTree.isLeaf())))) {
                        if (_other.browseDescription == null) {
                            this.browseDescription = null;
                        } else {
                            this.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
                            for (BrowseDescription _item: _other.browseDescription) {
                                this.browseDescription.add(((_item == null)?null:_item.newCopyBuilder(this, browseDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrowseDescription >_P init(final _P _product) {
            if (this.browseDescription!= null) {
                final List<BrowseDescription> browseDescription = new ArrayList<BrowseDescription>(this.browseDescription.size());
                for (BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>> _item: this.browseDescription) {
                    browseDescription.add(_item.build());
                }
                _product.browseDescription = browseDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "browseDescription" hinzu.
         * 
         * @param browseDescription
         *     Werte, die zur Eigenschaft "browseDescription" hinzugefügt werden.
         */
        public ListOfBrowseDescription.Builder<_B> addBrowseDescription(final Iterable<? extends BrowseDescription> browseDescription) {
            if (browseDescription!= null) {
                if (this.browseDescription == null) {
                    this.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
                }
                for (BrowseDescription _item: browseDescription) {
                    this.browseDescription.add(new BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param browseDescription
         *     Neuer Wert der Eigenschaft "browseDescription".
         */
        public ListOfBrowseDescription.Builder<_B> withBrowseDescription(final Iterable<? extends BrowseDescription> browseDescription) {
            if (this.browseDescription!= null) {
                this.browseDescription.clear();
            }
            return addBrowseDescription(browseDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "browseDescription" hinzu.
         * 
         * @param browseDescription
         *     Werte, die zur Eigenschaft "browseDescription" hinzugefügt werden.
         */
        public ListOfBrowseDescription.Builder<_B> addBrowseDescription(BrowseDescription... browseDescription) {
            addBrowseDescription(Arrays.asList(browseDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param browseDescription
         *     Neuer Wert der Eigenschaft "browseDescription".
         */
        public ListOfBrowseDescription.Builder<_B> withBrowseDescription(BrowseDescription... browseDescription) {
            withBrowseDescription(Arrays.asList(browseDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrowseDescription".
         * Mit {@link org.opcfoundation.ua._2008._02.types.BrowseDescription.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrowseDescription".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.BrowseDescription.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrowseDescription.Builder<? extends ListOfBrowseDescription.Builder<_B>> addBrowseDescription() {
            if (this.browseDescription == null) {
                this.browseDescription = new ArrayList<BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>>();
            }
            final BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>> browseDescription_Builder = new BrowseDescription.Builder<ListOfBrowseDescription.Builder<_B>>(this, null, false);
            this.browseDescription.add(browseDescription_Builder);
            return browseDescription_Builder;
        }

        @Override
        public ListOfBrowseDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrowseDescription());
            } else {
                return ((ListOfBrowseDescription) _storedValue);
            }
        }

        public ListOfBrowseDescription.Builder<_B> copyOf(final ListOfBrowseDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrowseDescription.Builder<_B> copyOf(final ListOfBrowseDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrowseDescription.Selector<ListOfBrowseDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrowseDescription.Select _root() {
            return new ListOfBrowseDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrowseDescription.Selector<TRoot, ListOfBrowseDescription.Selector<TRoot, TParent>> browseDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.browseDescription!= null) {
                products.put("browseDescription", this.browseDescription.init());
            }
            return products;
        }

        public BrowseDescription.Selector<TRoot, ListOfBrowseDescription.Selector<TRoot, TParent>> browseDescription() {
            return ((this.browseDescription == null)?this.browseDescription = new BrowseDescription.Selector<TRoot, ListOfBrowseDescription.Selector<TRoot, TParent>>(this._root, this, "browseDescription"):this.browseDescription);
        }

    }

}
