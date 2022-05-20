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
 * <p>Java-Klasse für ListOfStatusResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStatusResult", propOrder = {
    "statusResult"
})
public class ListOfStatusResult {

    @XmlElement(name = "StatusResult", nillable = true)
    protected List<StatusResult> statusResult;

    /**
     * Gets the value of the statusResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusResult }
     * 
     * 
     */
    public List<StatusResult> getStatusResult() {
        if (statusResult == null) {
            statusResult = new ArrayList<StatusResult>();
        }
        return this.statusResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfStatusResult.Builder<_B> _other) {
        if (this.statusResult == null) {
            _other.statusResult = null;
        } else {
            _other.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
            for (StatusResult _item: this.statusResult) {
                _other.statusResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfStatusResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfStatusResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfStatusResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfStatusResult.Builder<Void> builder() {
        return new ListOfStatusResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfStatusResult.Builder<_B> copyOf(final ListOfStatusResult _other) {
        final ListOfStatusResult.Builder<_B> _newBuilder = new ListOfStatusResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfStatusResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusResultPropertyTree!= null):((statusResultPropertyTree == null)||(!statusResultPropertyTree.isLeaf())))) {
            if (this.statusResult == null) {
                _other.statusResult = null;
            } else {
                _other.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
                for (StatusResult _item: this.statusResult) {
                    _other.statusResult.add(((_item == null)?null:_item.newCopyBuilder(_other, statusResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfStatusResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfStatusResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfStatusResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfStatusResult.Builder<_B> copyOf(final ListOfStatusResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfStatusResult.Builder<_B> _newBuilder = new ListOfStatusResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfStatusResult.Builder<Void> copyExcept(final ListOfStatusResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfStatusResult.Builder<Void> copyOnly(final ListOfStatusResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfStatusResult _storedValue;
        private List<StatusResult.Builder<ListOfStatusResult.Builder<_B>>> statusResult;

        public Builder(final _B _parentBuilder, final ListOfStatusResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.statusResult == null) {
                        this.statusResult = null;
                    } else {
                        this.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
                        for (StatusResult _item: _other.statusResult) {
                            this.statusResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfStatusResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusResultPropertyTree!= null):((statusResultPropertyTree == null)||(!statusResultPropertyTree.isLeaf())))) {
                        if (_other.statusResult == null) {
                            this.statusResult = null;
                        } else {
                            this.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
                            for (StatusResult _item: _other.statusResult) {
                                this.statusResult.add(((_item == null)?null:_item.newCopyBuilder(this, statusResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfStatusResult >_P init(final _P _product) {
            if (this.statusResult!= null) {
                final List<StatusResult> statusResult = new ArrayList<StatusResult>(this.statusResult.size());
                for (StatusResult.Builder<ListOfStatusResult.Builder<_B>> _item: this.statusResult) {
                    statusResult.add(_item.build());
                }
                _product.statusResult = statusResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "statusResult" hinzu.
         * 
         * @param statusResult
         *     Werte, die zur Eigenschaft "statusResult" hinzugefügt werden.
         */
        public ListOfStatusResult.Builder<_B> addStatusResult(final Iterable<? extends StatusResult> statusResult) {
            if (statusResult!= null) {
                if (this.statusResult == null) {
                    this.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
                }
                for (StatusResult _item: statusResult) {
                    this.statusResult.add(new StatusResult.Builder<ListOfStatusResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param statusResult
         *     Neuer Wert der Eigenschaft "statusResult".
         */
        public ListOfStatusResult.Builder<_B> withStatusResult(final Iterable<? extends StatusResult> statusResult) {
            if (this.statusResult!= null) {
                this.statusResult.clear();
            }
            return addStatusResult(statusResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "statusResult" hinzu.
         * 
         * @param statusResult
         *     Werte, die zur Eigenschaft "statusResult" hinzugefügt werden.
         */
        public ListOfStatusResult.Builder<_B> addStatusResult(StatusResult... statusResult) {
            addStatusResult(Arrays.asList(statusResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param statusResult
         *     Neuer Wert der Eigenschaft "statusResult".
         */
        public ListOfStatusResult.Builder<_B> withStatusResult(StatusResult... statusResult) {
            withStatusResult(Arrays.asList(statusResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "StatusResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusResult.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "StatusResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusResult.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusResult.Builder<? extends ListOfStatusResult.Builder<_B>> addStatusResult() {
            if (this.statusResult == null) {
                this.statusResult = new ArrayList<StatusResult.Builder<ListOfStatusResult.Builder<_B>>>();
            }
            final StatusResult.Builder<ListOfStatusResult.Builder<_B>> statusResult_Builder = new StatusResult.Builder<ListOfStatusResult.Builder<_B>>(this, null, false);
            this.statusResult.add(statusResult_Builder);
            return statusResult_Builder;
        }

        @Override
        public ListOfStatusResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfStatusResult());
            } else {
                return ((ListOfStatusResult) _storedValue);
            }
        }

        public ListOfStatusResult.Builder<_B> copyOf(final ListOfStatusResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfStatusResult.Builder<_B> copyOf(final ListOfStatusResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfStatusResult.Selector<ListOfStatusResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfStatusResult.Select _root() {
            return new ListOfStatusResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusResult.Selector<TRoot, ListOfStatusResult.Selector<TRoot, TParent>> statusResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusResult!= null) {
                products.put("statusResult", this.statusResult.init());
            }
            return products;
        }

        public StatusResult.Selector<TRoot, ListOfStatusResult.Selector<TRoot, TParent>> statusResult() {
            return ((this.statusResult == null)?this.statusResult = new StatusResult.Selector<TRoot, ListOfStatusResult.Selector<TRoot, TParent>>(this._root, this, "statusResult"):this.statusResult);
        }

    }

}
