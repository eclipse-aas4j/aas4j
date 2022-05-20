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
 * <p>Java-Klasse für ListOfBrowsePath complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrowsePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrowsePath" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrowsePath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrowsePath", propOrder = {
    "browsePath"
})
public class ListOfBrowsePath {

    @XmlElement(name = "BrowsePath", nillable = true)
    protected List<BrowsePath> browsePath;

    /**
     * Gets the value of the browsePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browsePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowsePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowsePath }
     * 
     * 
     */
    public List<BrowsePath> getBrowsePath() {
        if (browsePath == null) {
            browsePath = new ArrayList<BrowsePath>();
        }
        return this.browsePath;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrowsePath.Builder<_B> _other) {
        if (this.browsePath == null) {
            _other.browsePath = null;
        } else {
            _other.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
            for (BrowsePath _item: this.browsePath) {
                _other.browsePath.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrowsePath.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrowsePath.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrowsePath.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrowsePath.Builder<Void> builder() {
        return new ListOfBrowsePath.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrowsePath.Builder<_B> copyOf(final ListOfBrowsePath _other) {
        final ListOfBrowsePath.Builder<_B> _newBuilder = new ListOfBrowsePath.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrowsePath.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree browsePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePath"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathPropertyTree!= null):((browsePathPropertyTree == null)||(!browsePathPropertyTree.isLeaf())))) {
            if (this.browsePath == null) {
                _other.browsePath = null;
            } else {
                _other.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
                for (BrowsePath _item: this.browsePath) {
                    _other.browsePath.add(((_item == null)?null:_item.newCopyBuilder(_other, browsePathPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrowsePath.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrowsePath.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrowsePath.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrowsePath.Builder<_B> copyOf(final ListOfBrowsePath _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrowsePath.Builder<_B> _newBuilder = new ListOfBrowsePath.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrowsePath.Builder<Void> copyExcept(final ListOfBrowsePath _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrowsePath.Builder<Void> copyOnly(final ListOfBrowsePath _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrowsePath _storedValue;
        private List<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>> browsePath;

        public Builder(final _B _parentBuilder, final ListOfBrowsePath _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.browsePath == null) {
                        this.browsePath = null;
                    } else {
                        this.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
                        for (BrowsePath _item: _other.browsePath) {
                            this.browsePath.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrowsePath _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree browsePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePath"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathPropertyTree!= null):((browsePathPropertyTree == null)||(!browsePathPropertyTree.isLeaf())))) {
                        if (_other.browsePath == null) {
                            this.browsePath = null;
                        } else {
                            this.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
                            for (BrowsePath _item: _other.browsePath) {
                                this.browsePath.add(((_item == null)?null:_item.newCopyBuilder(this, browsePathPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrowsePath >_P init(final _P _product) {
            if (this.browsePath!= null) {
                final List<BrowsePath> browsePath = new ArrayList<BrowsePath>(this.browsePath.size());
                for (BrowsePath.Builder<ListOfBrowsePath.Builder<_B>> _item: this.browsePath) {
                    browsePath.add(_item.build());
                }
                _product.browsePath = browsePath;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "browsePath" hinzu.
         * 
         * @param browsePath
         *     Werte, die zur Eigenschaft "browsePath" hinzugefügt werden.
         */
        public ListOfBrowsePath.Builder<_B> addBrowsePath(final Iterable<? extends BrowsePath> browsePath) {
            if (browsePath!= null) {
                if (this.browsePath == null) {
                    this.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
                }
                for (BrowsePath _item: browsePath) {
                    this.browsePath.add(new BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePath" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browsePath
         *     Neuer Wert der Eigenschaft "browsePath".
         */
        public ListOfBrowsePath.Builder<_B> withBrowsePath(final Iterable<? extends BrowsePath> browsePath) {
            if (this.browsePath!= null) {
                this.browsePath.clear();
            }
            return addBrowsePath(browsePath);
        }

        /**
         * Fügt Werte zur Eigenschaft "browsePath" hinzu.
         * 
         * @param browsePath
         *     Werte, die zur Eigenschaft "browsePath" hinzugefügt werden.
         */
        public ListOfBrowsePath.Builder<_B> addBrowsePath(BrowsePath... browsePath) {
            addBrowsePath(Arrays.asList(browsePath));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePath" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browsePath
         *     Neuer Wert der Eigenschaft "browsePath".
         */
        public ListOfBrowsePath.Builder<_B> withBrowsePath(BrowsePath... browsePath) {
            withBrowsePath(Arrays.asList(browsePath));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrowsePath".
         * Mit {@link org.opcfoundation.ua._2008._02.types.BrowsePath.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrowsePath".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.BrowsePath.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public BrowsePath.Builder<? extends ListOfBrowsePath.Builder<_B>> addBrowsePath() {
            if (this.browsePath == null) {
                this.browsePath = new ArrayList<BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>>();
            }
            final BrowsePath.Builder<ListOfBrowsePath.Builder<_B>> browsePath_Builder = new BrowsePath.Builder<ListOfBrowsePath.Builder<_B>>(this, null, false);
            this.browsePath.add(browsePath_Builder);
            return browsePath_Builder;
        }

        @Override
        public ListOfBrowsePath build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrowsePath());
            } else {
                return ((ListOfBrowsePath) _storedValue);
            }
        }

        public ListOfBrowsePath.Builder<_B> copyOf(final ListOfBrowsePath _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrowsePath.Builder<_B> copyOf(final ListOfBrowsePath.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrowsePath.Selector<ListOfBrowsePath.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrowsePath.Select _root() {
            return new ListOfBrowsePath.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrowsePath.Selector<TRoot, ListOfBrowsePath.Selector<TRoot, TParent>> browsePath = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.browsePath!= null) {
                products.put("browsePath", this.browsePath.init());
            }
            return products;
        }

        public BrowsePath.Selector<TRoot, ListOfBrowsePath.Selector<TRoot, TParent>> browsePath() {
            return ((this.browsePath == null)?this.browsePath = new BrowsePath.Selector<TRoot, ListOfBrowsePath.Selector<TRoot, TParent>>(this._root, this, "browsePath"):this.browsePath);
        }

    }

}
