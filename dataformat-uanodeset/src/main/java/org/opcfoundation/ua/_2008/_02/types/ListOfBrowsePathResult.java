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
 * <p>Java-Klasse für ListOfBrowsePathResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrowsePathResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrowsePathResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrowsePathResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrowsePathResult", propOrder = {
    "browsePathResult"
})
public class ListOfBrowsePathResult {

    @XmlElement(name = "BrowsePathResult", nillable = true)
    protected List<BrowsePathResult> browsePathResult;

    /**
     * Gets the value of the browsePathResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browsePathResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowsePathResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowsePathResult }
     * 
     * 
     */
    public List<BrowsePathResult> getBrowsePathResult() {
        if (browsePathResult == null) {
            browsePathResult = new ArrayList<BrowsePathResult>();
        }
        return this.browsePathResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrowsePathResult.Builder<_B> _other) {
        if (this.browsePathResult == null) {
            _other.browsePathResult = null;
        } else {
            _other.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
            for (BrowsePathResult _item: this.browsePathResult) {
                _other.browsePathResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrowsePathResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrowsePathResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrowsePathResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrowsePathResult.Builder<Void> builder() {
        return new ListOfBrowsePathResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrowsePathResult.Builder<_B> copyOf(final ListOfBrowsePathResult _other) {
        final ListOfBrowsePathResult.Builder<_B> _newBuilder = new ListOfBrowsePathResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrowsePathResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree browsePathResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePathResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathResultPropertyTree!= null):((browsePathResultPropertyTree == null)||(!browsePathResultPropertyTree.isLeaf())))) {
            if (this.browsePathResult == null) {
                _other.browsePathResult = null;
            } else {
                _other.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
                for (BrowsePathResult _item: this.browsePathResult) {
                    _other.browsePathResult.add(((_item == null)?null:_item.newCopyBuilder(_other, browsePathResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrowsePathResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrowsePathResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrowsePathResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrowsePathResult.Builder<_B> copyOf(final ListOfBrowsePathResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrowsePathResult.Builder<_B> _newBuilder = new ListOfBrowsePathResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrowsePathResult.Builder<Void> copyExcept(final ListOfBrowsePathResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrowsePathResult.Builder<Void> copyOnly(final ListOfBrowsePathResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrowsePathResult _storedValue;
        private List<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>> browsePathResult;

        public Builder(final _B _parentBuilder, final ListOfBrowsePathResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.browsePathResult == null) {
                        this.browsePathResult = null;
                    } else {
                        this.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
                        for (BrowsePathResult _item: _other.browsePathResult) {
                            this.browsePathResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrowsePathResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree browsePathResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browsePathResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browsePathResultPropertyTree!= null):((browsePathResultPropertyTree == null)||(!browsePathResultPropertyTree.isLeaf())))) {
                        if (_other.browsePathResult == null) {
                            this.browsePathResult = null;
                        } else {
                            this.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
                            for (BrowsePathResult _item: _other.browsePathResult) {
                                this.browsePathResult.add(((_item == null)?null:_item.newCopyBuilder(this, browsePathResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrowsePathResult >_P init(final _P _product) {
            if (this.browsePathResult!= null) {
                final List<BrowsePathResult> browsePathResult = new ArrayList<BrowsePathResult>(this.browsePathResult.size());
                for (BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>> _item: this.browsePathResult) {
                    browsePathResult.add(_item.build());
                }
                _product.browsePathResult = browsePathResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "browsePathResult" hinzu.
         * 
         * @param browsePathResult
         *     Werte, die zur Eigenschaft "browsePathResult" hinzugefügt werden.
         */
        public ListOfBrowsePathResult.Builder<_B> addBrowsePathResult(final Iterable<? extends BrowsePathResult> browsePathResult) {
            if (browsePathResult!= null) {
                if (this.browsePathResult == null) {
                    this.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
                }
                for (BrowsePathResult _item: browsePathResult) {
                    this.browsePathResult.add(new BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePathResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param browsePathResult
         *     Neuer Wert der Eigenschaft "browsePathResult".
         */
        public ListOfBrowsePathResult.Builder<_B> withBrowsePathResult(final Iterable<? extends BrowsePathResult> browsePathResult) {
            if (this.browsePathResult!= null) {
                this.browsePathResult.clear();
            }
            return addBrowsePathResult(browsePathResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "browsePathResult" hinzu.
         * 
         * @param browsePathResult
         *     Werte, die zur Eigenschaft "browsePathResult" hinzugefügt werden.
         */
        public ListOfBrowsePathResult.Builder<_B> addBrowsePathResult(BrowsePathResult... browsePathResult) {
            addBrowsePathResult(Arrays.asList(browsePathResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browsePathResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param browsePathResult
         *     Neuer Wert der Eigenschaft "browsePathResult".
         */
        public ListOfBrowsePathResult.Builder<_B> withBrowsePathResult(BrowsePathResult... browsePathResult) {
            withBrowsePathResult(Arrays.asList(browsePathResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrowsePathResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.BrowsePathResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrowsePathResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.BrowsePathResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public BrowsePathResult.Builder<? extends ListOfBrowsePathResult.Builder<_B>> addBrowsePathResult() {
            if (this.browsePathResult == null) {
                this.browsePathResult = new ArrayList<BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>>();
            }
            final BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>> browsePathResult_Builder = new BrowsePathResult.Builder<ListOfBrowsePathResult.Builder<_B>>(this, null, false);
            this.browsePathResult.add(browsePathResult_Builder);
            return browsePathResult_Builder;
        }

        @Override
        public ListOfBrowsePathResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrowsePathResult());
            } else {
                return ((ListOfBrowsePathResult) _storedValue);
            }
        }

        public ListOfBrowsePathResult.Builder<_B> copyOf(final ListOfBrowsePathResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrowsePathResult.Builder<_B> copyOf(final ListOfBrowsePathResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrowsePathResult.Selector<ListOfBrowsePathResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrowsePathResult.Select _root() {
            return new ListOfBrowsePathResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrowsePathResult.Selector<TRoot, ListOfBrowsePathResult.Selector<TRoot, TParent>> browsePathResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.browsePathResult!= null) {
                products.put("browsePathResult", this.browsePathResult.init());
            }
            return products;
        }

        public BrowsePathResult.Selector<TRoot, ListOfBrowsePathResult.Selector<TRoot, TParent>> browsePathResult() {
            return ((this.browsePathResult == null)?this.browsePathResult = new BrowsePathResult.Selector<TRoot, ListOfBrowsePathResult.Selector<TRoot, TParent>>(this._root, this, "browsePathResult"):this.browsePathResult);
        }

    }

}
