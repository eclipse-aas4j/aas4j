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
 * <p>Java-Klasse für ListOfTransferResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfTransferResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TransferResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTransferResult", propOrder = {
    "transferResult"
})
public class ListOfTransferResult {

    @XmlElement(name = "TransferResult", nillable = true)
    protected List<TransferResult> transferResult;

    /**
     * Gets the value of the transferResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferResult }
     * 
     * 
     */
    public List<TransferResult> getTransferResult() {
        if (transferResult == null) {
            transferResult = new ArrayList<TransferResult>();
        }
        return this.transferResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfTransferResult.Builder<_B> _other) {
        if (this.transferResult == null) {
            _other.transferResult = null;
        } else {
            _other.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
            for (TransferResult _item: this.transferResult) {
                _other.transferResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfTransferResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfTransferResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfTransferResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfTransferResult.Builder<Void> builder() {
        return new ListOfTransferResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfTransferResult.Builder<_B> copyOf(final ListOfTransferResult _other) {
        final ListOfTransferResult.Builder<_B> _newBuilder = new ListOfTransferResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfTransferResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree transferResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferResultPropertyTree!= null):((transferResultPropertyTree == null)||(!transferResultPropertyTree.isLeaf())))) {
            if (this.transferResult == null) {
                _other.transferResult = null;
            } else {
                _other.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
                for (TransferResult _item: this.transferResult) {
                    _other.transferResult.add(((_item == null)?null:_item.newCopyBuilder(_other, transferResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfTransferResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfTransferResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfTransferResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfTransferResult.Builder<_B> copyOf(final ListOfTransferResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfTransferResult.Builder<_B> _newBuilder = new ListOfTransferResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfTransferResult.Builder<Void> copyExcept(final ListOfTransferResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfTransferResult.Builder<Void> copyOnly(final ListOfTransferResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfTransferResult _storedValue;
        private List<TransferResult.Builder<ListOfTransferResult.Builder<_B>>> transferResult;

        public Builder(final _B _parentBuilder, final ListOfTransferResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.transferResult == null) {
                        this.transferResult = null;
                    } else {
                        this.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
                        for (TransferResult _item: _other.transferResult) {
                            this.transferResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfTransferResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree transferResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferResultPropertyTree!= null):((transferResultPropertyTree == null)||(!transferResultPropertyTree.isLeaf())))) {
                        if (_other.transferResult == null) {
                            this.transferResult = null;
                        } else {
                            this.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
                            for (TransferResult _item: _other.transferResult) {
                                this.transferResult.add(((_item == null)?null:_item.newCopyBuilder(this, transferResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfTransferResult >_P init(final _P _product) {
            if (this.transferResult!= null) {
                final List<TransferResult> transferResult = new ArrayList<TransferResult>(this.transferResult.size());
                for (TransferResult.Builder<ListOfTransferResult.Builder<_B>> _item: this.transferResult) {
                    transferResult.add(_item.build());
                }
                _product.transferResult = transferResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "transferResult" hinzu.
         * 
         * @param transferResult
         *     Werte, die zur Eigenschaft "transferResult" hinzugefügt werden.
         */
        public ListOfTransferResult.Builder<_B> addTransferResult(final Iterable<? extends TransferResult> transferResult) {
            if (transferResult!= null) {
                if (this.transferResult == null) {
                    this.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
                }
                for (TransferResult _item: transferResult) {
                    this.transferResult.add(new TransferResult.Builder<ListOfTransferResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param transferResult
         *     Neuer Wert der Eigenschaft "transferResult".
         */
        public ListOfTransferResult.Builder<_B> withTransferResult(final Iterable<? extends TransferResult> transferResult) {
            if (this.transferResult!= null) {
                this.transferResult.clear();
            }
            return addTransferResult(transferResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "transferResult" hinzu.
         * 
         * @param transferResult
         *     Werte, die zur Eigenschaft "transferResult" hinzugefügt werden.
         */
        public ListOfTransferResult.Builder<_B> addTransferResult(TransferResult... transferResult) {
            addTransferResult(Arrays.asList(transferResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param transferResult
         *     Neuer Wert der Eigenschaft "transferResult".
         */
        public ListOfTransferResult.Builder<_B> withTransferResult(TransferResult... transferResult) {
            withTransferResult(Arrays.asList(transferResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "TransferResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.TransferResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "TransferResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.TransferResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public TransferResult.Builder<? extends ListOfTransferResult.Builder<_B>> addTransferResult() {
            if (this.transferResult == null) {
                this.transferResult = new ArrayList<TransferResult.Builder<ListOfTransferResult.Builder<_B>>>();
            }
            final TransferResult.Builder<ListOfTransferResult.Builder<_B>> transferResult_Builder = new TransferResult.Builder<ListOfTransferResult.Builder<_B>>(this, null, false);
            this.transferResult.add(transferResult_Builder);
            return transferResult_Builder;
        }

        @Override
        public ListOfTransferResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfTransferResult());
            } else {
                return ((ListOfTransferResult) _storedValue);
            }
        }

        public ListOfTransferResult.Builder<_B> copyOf(final ListOfTransferResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfTransferResult.Builder<_B> copyOf(final ListOfTransferResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfTransferResult.Selector<ListOfTransferResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfTransferResult.Select _root() {
            return new ListOfTransferResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private TransferResult.Selector<TRoot, ListOfTransferResult.Selector<TRoot, TParent>> transferResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.transferResult!= null) {
                products.put("transferResult", this.transferResult.init());
            }
            return products;
        }

        public TransferResult.Selector<TRoot, ListOfTransferResult.Selector<TRoot, TParent>> transferResult() {
            return ((this.transferResult == null)?this.transferResult = new TransferResult.Selector<TRoot, ListOfTransferResult.Selector<TRoot, TParent>>(this._root, this, "transferResult"):this.transferResult);
        }

    }

}
