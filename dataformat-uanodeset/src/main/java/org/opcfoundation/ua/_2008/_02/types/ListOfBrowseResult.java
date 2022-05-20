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
 * <p>Java-Klasse für ListOfBrowseResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfBrowseResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrowseResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrowseResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBrowseResult", propOrder = {
    "browseResult"
})
public class ListOfBrowseResult {

    @XmlElement(name = "BrowseResult", nillable = true)
    protected List<BrowseResult> browseResult;

    /**
     * Gets the value of the browseResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browseResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowseResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowseResult }
     * 
     * 
     */
    public List<BrowseResult> getBrowseResult() {
        if (browseResult == null) {
            browseResult = new ArrayList<BrowseResult>();
        }
        return this.browseResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfBrowseResult.Builder<_B> _other) {
        if (this.browseResult == null) {
            _other.browseResult = null;
        } else {
            _other.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
            for (BrowseResult _item: this.browseResult) {
                _other.browseResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfBrowseResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfBrowseResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfBrowseResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfBrowseResult.Builder<Void> builder() {
        return new ListOfBrowseResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfBrowseResult.Builder<_B> copyOf(final ListOfBrowseResult _other) {
        final ListOfBrowseResult.Builder<_B> _newBuilder = new ListOfBrowseResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfBrowseResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree browseResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseResultPropertyTree!= null):((browseResultPropertyTree == null)||(!browseResultPropertyTree.isLeaf())))) {
            if (this.browseResult == null) {
                _other.browseResult = null;
            } else {
                _other.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
                for (BrowseResult _item: this.browseResult) {
                    _other.browseResult.add(((_item == null)?null:_item.newCopyBuilder(_other, browseResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfBrowseResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfBrowseResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfBrowseResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfBrowseResult.Builder<_B> copyOf(final ListOfBrowseResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfBrowseResult.Builder<_B> _newBuilder = new ListOfBrowseResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfBrowseResult.Builder<Void> copyExcept(final ListOfBrowseResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfBrowseResult.Builder<Void> copyOnly(final ListOfBrowseResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfBrowseResult _storedValue;
        private List<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>> browseResult;

        public Builder(final _B _parentBuilder, final ListOfBrowseResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.browseResult == null) {
                        this.browseResult = null;
                    } else {
                        this.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
                        for (BrowseResult _item: _other.browseResult) {
                            this.browseResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfBrowseResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree browseResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseResultPropertyTree!= null):((browseResultPropertyTree == null)||(!browseResultPropertyTree.isLeaf())))) {
                        if (_other.browseResult == null) {
                            this.browseResult = null;
                        } else {
                            this.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
                            for (BrowseResult _item: _other.browseResult) {
                                this.browseResult.add(((_item == null)?null:_item.newCopyBuilder(this, browseResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfBrowseResult >_P init(final _P _product) {
            if (this.browseResult!= null) {
                final List<BrowseResult> browseResult = new ArrayList<BrowseResult>(this.browseResult.size());
                for (BrowseResult.Builder<ListOfBrowseResult.Builder<_B>> _item: this.browseResult) {
                    browseResult.add(_item.build());
                }
                _product.browseResult = browseResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "browseResult" hinzu.
         * 
         * @param browseResult
         *     Werte, die zur Eigenschaft "browseResult" hinzugefügt werden.
         */
        public ListOfBrowseResult.Builder<_B> addBrowseResult(final Iterable<? extends BrowseResult> browseResult) {
            if (browseResult!= null) {
                if (this.browseResult == null) {
                    this.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
                }
                for (BrowseResult _item: browseResult) {
                    this.browseResult.add(new BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browseResult
         *     Neuer Wert der Eigenschaft "browseResult".
         */
        public ListOfBrowseResult.Builder<_B> withBrowseResult(final Iterable<? extends BrowseResult> browseResult) {
            if (this.browseResult!= null) {
                this.browseResult.clear();
            }
            return addBrowseResult(browseResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "browseResult" hinzu.
         * 
         * @param browseResult
         *     Werte, die zur Eigenschaft "browseResult" hinzugefügt werden.
         */
        public ListOfBrowseResult.Builder<_B> addBrowseResult(BrowseResult... browseResult) {
            addBrowseResult(Arrays.asList(browseResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browseResult
         *     Neuer Wert der Eigenschaft "browseResult".
         */
        public ListOfBrowseResult.Builder<_B> withBrowseResult(BrowseResult... browseResult) {
            withBrowseResult(Arrays.asList(browseResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "BrowseResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.BrowseResult.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "BrowseResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.BrowseResult.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public BrowseResult.Builder<? extends ListOfBrowseResult.Builder<_B>> addBrowseResult() {
            if (this.browseResult == null) {
                this.browseResult = new ArrayList<BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>>();
            }
            final BrowseResult.Builder<ListOfBrowseResult.Builder<_B>> browseResult_Builder = new BrowseResult.Builder<ListOfBrowseResult.Builder<_B>>(this, null, false);
            this.browseResult.add(browseResult_Builder);
            return browseResult_Builder;
        }

        @Override
        public ListOfBrowseResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfBrowseResult());
            } else {
                return ((ListOfBrowseResult) _storedValue);
            }
        }

        public ListOfBrowseResult.Builder<_B> copyOf(final ListOfBrowseResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfBrowseResult.Builder<_B> copyOf(final ListOfBrowseResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfBrowseResult.Selector<ListOfBrowseResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfBrowseResult.Select _root() {
            return new ListOfBrowseResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private BrowseResult.Selector<TRoot, ListOfBrowseResult.Selector<TRoot, TParent>> browseResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.browseResult!= null) {
                products.put("browseResult", this.browseResult.init());
            }
            return products;
        }

        public BrowseResult.Selector<TRoot, ListOfBrowseResult.Selector<TRoot, TParent>> browseResult() {
            return ((this.browseResult == null)?this.browseResult = new BrowseResult.Selector<TRoot, ListOfBrowseResult.Selector<TRoot, TParent>>(this._root, this, "browseResult"):this.browseResult);
        }

    }

}
