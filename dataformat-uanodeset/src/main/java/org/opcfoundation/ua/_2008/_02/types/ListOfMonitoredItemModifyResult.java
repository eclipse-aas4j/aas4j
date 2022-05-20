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
 * <p>Java-Klasse für ListOfMonitoredItemModifyResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfMonitoredItemModifyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemModifyResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoredItemModifyResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMonitoredItemModifyResult", propOrder = {
    "monitoredItemModifyResult"
})
public class ListOfMonitoredItemModifyResult {

    @XmlElement(name = "MonitoredItemModifyResult", nillable = true)
    protected List<MonitoredItemModifyResult> monitoredItemModifyResult;

    /**
     * Gets the value of the monitoredItemModifyResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredItemModifyResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredItemModifyResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredItemModifyResult }
     * 
     * 
     */
    public List<MonitoredItemModifyResult> getMonitoredItemModifyResult() {
        if (monitoredItemModifyResult == null) {
            monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult>();
        }
        return this.monitoredItemModifyResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfMonitoredItemModifyResult.Builder<_B> _other) {
        if (this.monitoredItemModifyResult == null) {
            _other.monitoredItemModifyResult = null;
        } else {
            _other.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
            for (MonitoredItemModifyResult _item: this.monitoredItemModifyResult) {
                _other.monitoredItemModifyResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfMonitoredItemModifyResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfMonitoredItemModifyResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfMonitoredItemModifyResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfMonitoredItemModifyResult.Builder<Void> builder() {
        return new ListOfMonitoredItemModifyResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfMonitoredItemModifyResult.Builder<_B> copyOf(final ListOfMonitoredItemModifyResult _other) {
        final ListOfMonitoredItemModifyResult.Builder<_B> _newBuilder = new ListOfMonitoredItemModifyResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfMonitoredItemModifyResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemModifyResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemModifyResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemModifyResultPropertyTree!= null):((monitoredItemModifyResultPropertyTree == null)||(!monitoredItemModifyResultPropertyTree.isLeaf())))) {
            if (this.monitoredItemModifyResult == null) {
                _other.monitoredItemModifyResult = null;
            } else {
                _other.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
                for (MonitoredItemModifyResult _item: this.monitoredItemModifyResult) {
                    _other.monitoredItemModifyResult.add(((_item == null)?null:_item.newCopyBuilder(_other, monitoredItemModifyResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfMonitoredItemModifyResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfMonitoredItemModifyResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfMonitoredItemModifyResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfMonitoredItemModifyResult.Builder<_B> copyOf(final ListOfMonitoredItemModifyResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfMonitoredItemModifyResult.Builder<_B> _newBuilder = new ListOfMonitoredItemModifyResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfMonitoredItemModifyResult.Builder<Void> copyExcept(final ListOfMonitoredItemModifyResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfMonitoredItemModifyResult.Builder<Void> copyOnly(final ListOfMonitoredItemModifyResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfMonitoredItemModifyResult _storedValue;
        private List<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>> monitoredItemModifyResult;

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemModifyResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.monitoredItemModifyResult == null) {
                        this.monitoredItemModifyResult = null;
                    } else {
                        this.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
                        for (MonitoredItemModifyResult _item: _other.monitoredItemModifyResult) {
                            this.monitoredItemModifyResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemModifyResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemModifyResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemModifyResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemModifyResultPropertyTree!= null):((monitoredItemModifyResultPropertyTree == null)||(!monitoredItemModifyResultPropertyTree.isLeaf())))) {
                        if (_other.monitoredItemModifyResult == null) {
                            this.monitoredItemModifyResult = null;
                        } else {
                            this.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
                            for (MonitoredItemModifyResult _item: _other.monitoredItemModifyResult) {
                                this.monitoredItemModifyResult.add(((_item == null)?null:_item.newCopyBuilder(this, monitoredItemModifyResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfMonitoredItemModifyResult >_P init(final _P _product) {
            if (this.monitoredItemModifyResult!= null) {
                final List<MonitoredItemModifyResult> monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult>(this.monitoredItemModifyResult.size());
                for (MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>> _item: this.monitoredItemModifyResult) {
                    monitoredItemModifyResult.add(_item.build());
                }
                _product.monitoredItemModifyResult = monitoredItemModifyResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemModifyResult" hinzu.
         * 
         * @param monitoredItemModifyResult
         *     Werte, die zur Eigenschaft "monitoredItemModifyResult" hinzugefügt werden.
         */
        public ListOfMonitoredItemModifyResult.Builder<_B> addMonitoredItemModifyResult(final Iterable<? extends MonitoredItemModifyResult> monitoredItemModifyResult) {
            if (monitoredItemModifyResult!= null) {
                if (this.monitoredItemModifyResult == null) {
                    this.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
                }
                for (MonitoredItemModifyResult _item: monitoredItemModifyResult) {
                    this.monitoredItemModifyResult.add(new MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemModifyResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemModifyResult
         *     Neuer Wert der Eigenschaft "monitoredItemModifyResult".
         */
        public ListOfMonitoredItemModifyResult.Builder<_B> withMonitoredItemModifyResult(final Iterable<? extends MonitoredItemModifyResult> monitoredItemModifyResult) {
            if (this.monitoredItemModifyResult!= null) {
                this.monitoredItemModifyResult.clear();
            }
            return addMonitoredItemModifyResult(monitoredItemModifyResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemModifyResult" hinzu.
         * 
         * @param monitoredItemModifyResult
         *     Werte, die zur Eigenschaft "monitoredItemModifyResult" hinzugefügt werden.
         */
        public ListOfMonitoredItemModifyResult.Builder<_B> addMonitoredItemModifyResult(MonitoredItemModifyResult... monitoredItemModifyResult) {
            addMonitoredItemModifyResult(Arrays.asList(monitoredItemModifyResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemModifyResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemModifyResult
         *     Neuer Wert der Eigenschaft "monitoredItemModifyResult".
         */
        public ListOfMonitoredItemModifyResult.Builder<_B> withMonitoredItemModifyResult(MonitoredItemModifyResult... monitoredItemModifyResult) {
            withMonitoredItemModifyResult(Arrays.asList(monitoredItemModifyResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "MonitoredItemModifyResult".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "MonitoredItemModifyResult".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.MonitoredItemModifyResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public MonitoredItemModifyResult.Builder<? extends ListOfMonitoredItemModifyResult.Builder<_B>> addMonitoredItemModifyResult() {
            if (this.monitoredItemModifyResult == null) {
                this.monitoredItemModifyResult = new ArrayList<MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>>();
            }
            final MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>> monitoredItemModifyResult_Builder = new MonitoredItemModifyResult.Builder<ListOfMonitoredItemModifyResult.Builder<_B>>(this, null, false);
            this.monitoredItemModifyResult.add(monitoredItemModifyResult_Builder);
            return monitoredItemModifyResult_Builder;
        }

        @Override
        public ListOfMonitoredItemModifyResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfMonitoredItemModifyResult());
            } else {
                return ((ListOfMonitoredItemModifyResult) _storedValue);
            }
        }

        public ListOfMonitoredItemModifyResult.Builder<_B> copyOf(final ListOfMonitoredItemModifyResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfMonitoredItemModifyResult.Builder<_B> copyOf(final ListOfMonitoredItemModifyResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfMonitoredItemModifyResult.Selector<ListOfMonitoredItemModifyResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfMonitoredItemModifyResult.Select _root() {
            return new ListOfMonitoredItemModifyResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private MonitoredItemModifyResult.Selector<TRoot, ListOfMonitoredItemModifyResult.Selector<TRoot, TParent>> monitoredItemModifyResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemModifyResult!= null) {
                products.put("monitoredItemModifyResult", this.monitoredItemModifyResult.init());
            }
            return products;
        }

        public MonitoredItemModifyResult.Selector<TRoot, ListOfMonitoredItemModifyResult.Selector<TRoot, TParent>> monitoredItemModifyResult() {
            return ((this.monitoredItemModifyResult == null)?this.monitoredItemModifyResult = new MonitoredItemModifyResult.Selector<TRoot, ListOfMonitoredItemModifyResult.Selector<TRoot, TParent>>(this._root, this, "monitoredItemModifyResult"):this.monitoredItemModifyResult);
        }

    }

}
