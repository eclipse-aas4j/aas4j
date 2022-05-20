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
 * <p>Java-Klasse für ListOfAddNodesResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfAddNodesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddNodesResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AddNodesResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAddNodesResult", propOrder = {
    "addNodesResult"
})
public class ListOfAddNodesResult {

    @XmlElement(name = "AddNodesResult", nillable = true)
    protected List<AddNodesResult> addNodesResult;

    /**
     * Gets the value of the addNodesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addNodesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddNodesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddNodesResult }
     * 
     * 
     */
    public List<AddNodesResult> getAddNodesResult() {
        if (addNodesResult == null) {
            addNodesResult = new ArrayList<AddNodesResult>();
        }
        return this.addNodesResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfAddNodesResult.Builder<_B> _other) {
        if (this.addNodesResult == null) {
            _other.addNodesResult = null;
        } else {
            _other.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
            for (AddNodesResult _item: this.addNodesResult) {
                _other.addNodesResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfAddNodesResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfAddNodesResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfAddNodesResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfAddNodesResult.Builder<Void> builder() {
        return new ListOfAddNodesResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfAddNodesResult.Builder<_B> copyOf(final ListOfAddNodesResult _other) {
        final ListOfAddNodesResult.Builder<_B> _newBuilder = new ListOfAddNodesResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfAddNodesResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree addNodesResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesResultPropertyTree!= null):((addNodesResultPropertyTree == null)||(!addNodesResultPropertyTree.isLeaf())))) {
            if (this.addNodesResult == null) {
                _other.addNodesResult = null;
            } else {
                _other.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
                for (AddNodesResult _item: this.addNodesResult) {
                    _other.addNodesResult.add(((_item == null)?null:_item.newCopyBuilder(_other, addNodesResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfAddNodesResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfAddNodesResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfAddNodesResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfAddNodesResult.Builder<_B> copyOf(final ListOfAddNodesResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfAddNodesResult.Builder<_B> _newBuilder = new ListOfAddNodesResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfAddNodesResult.Builder<Void> copyExcept(final ListOfAddNodesResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfAddNodesResult.Builder<Void> copyOnly(final ListOfAddNodesResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfAddNodesResult _storedValue;
        private List<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>> addNodesResult;

        public Builder(final _B _parentBuilder, final ListOfAddNodesResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.addNodesResult == null) {
                        this.addNodesResult = null;
                    } else {
                        this.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
                        for (AddNodesResult _item: _other.addNodesResult) {
                            this.addNodesResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfAddNodesResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree addNodesResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesResultPropertyTree!= null):((addNodesResultPropertyTree == null)||(!addNodesResultPropertyTree.isLeaf())))) {
                        if (_other.addNodesResult == null) {
                            this.addNodesResult = null;
                        } else {
                            this.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
                            for (AddNodesResult _item: _other.addNodesResult) {
                                this.addNodesResult.add(((_item == null)?null:_item.newCopyBuilder(this, addNodesResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfAddNodesResult >_P init(final _P _product) {
            if (this.addNodesResult!= null) {
                final List<AddNodesResult> addNodesResult = new ArrayList<AddNodesResult>(this.addNodesResult.size());
                for (AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>> _item: this.addNodesResult) {
                    addNodesResult.add(_item.build());
                }
                _product.addNodesResult = addNodesResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "addNodesResult" hinzu.
         * 
         * @param addNodesResult
         *     Werte, die zur Eigenschaft "addNodesResult" hinzugefügt werden.
         */
        public ListOfAddNodesResult.Builder<_B> addAddNodesResult(final Iterable<? extends AddNodesResult> addNodesResult) {
            if (addNodesResult!= null) {
                if (this.addNodesResult == null) {
                    this.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
                }
                for (AddNodesResult _item: addNodesResult) {
                    this.addNodesResult.add(new AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addNodesResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param addNodesResult
         *     Neuer Wert der Eigenschaft "addNodesResult".
         */
        public ListOfAddNodesResult.Builder<_B> withAddNodesResult(final Iterable<? extends AddNodesResult> addNodesResult) {
            if (this.addNodesResult!= null) {
                this.addNodesResult.clear();
            }
            return addAddNodesResult(addNodesResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "addNodesResult" hinzu.
         * 
         * @param addNodesResult
         *     Werte, die zur Eigenschaft "addNodesResult" hinzugefügt werden.
         */
        public ListOfAddNodesResult.Builder<_B> addAddNodesResult(AddNodesResult... addNodesResult) {
            addAddNodesResult(Arrays.asList(addNodesResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addNodesResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param addNodesResult
         *     Neuer Wert der Eigenschaft "addNodesResult".
         */
        public ListOfAddNodesResult.Builder<_B> withAddNodesResult(AddNodesResult... addNodesResult) {
            withAddNodesResult(Arrays.asList(addNodesResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "AddNodesResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.AddNodesResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "AddNodesResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.AddNodesResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public AddNodesResult.Builder<? extends ListOfAddNodesResult.Builder<_B>> addAddNodesResult() {
            if (this.addNodesResult == null) {
                this.addNodesResult = new ArrayList<AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>>();
            }
            final AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>> addNodesResult_Builder = new AddNodesResult.Builder<ListOfAddNodesResult.Builder<_B>>(this, null, false);
            this.addNodesResult.add(addNodesResult_Builder);
            return addNodesResult_Builder;
        }

        @Override
        public ListOfAddNodesResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfAddNodesResult());
            } else {
                return ((ListOfAddNodesResult) _storedValue);
            }
        }

        public ListOfAddNodesResult.Builder<_B> copyOf(final ListOfAddNodesResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfAddNodesResult.Builder<_B> copyOf(final ListOfAddNodesResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfAddNodesResult.Selector<ListOfAddNodesResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfAddNodesResult.Select _root() {
            return new ListOfAddNodesResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private AddNodesResult.Selector<TRoot, ListOfAddNodesResult.Selector<TRoot, TParent>> addNodesResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.addNodesResult!= null) {
                products.put("addNodesResult", this.addNodesResult.init());
            }
            return products;
        }

        public AddNodesResult.Selector<TRoot, ListOfAddNodesResult.Selector<TRoot, TParent>> addNodesResult() {
            return ((this.addNodesResult == null)?this.addNodesResult = new AddNodesResult.Selector<TRoot, ListOfAddNodesResult.Selector<TRoot, TParent>>(this._root, this, "addNodesResult"):this.addNodesResult);
        }

    }

}
