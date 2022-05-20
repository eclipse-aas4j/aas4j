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
 * <p>Java-Klasse für ListOfMonitoredItemCreateResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfMonitoredItemCreateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemCreateResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoredItemCreateResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMonitoredItemCreateResult", propOrder = {
    "monitoredItemCreateResult"
})
public class ListOfMonitoredItemCreateResult {

    @XmlElement(name = "MonitoredItemCreateResult", nillable = true)
    protected List<MonitoredItemCreateResult> monitoredItemCreateResult;

    /**
     * Gets the value of the monitoredItemCreateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredItemCreateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredItemCreateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredItemCreateResult }
     * 
     * 
     */
    public List<MonitoredItemCreateResult> getMonitoredItemCreateResult() {
        if (monitoredItemCreateResult == null) {
            monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult>();
        }
        return this.monitoredItemCreateResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfMonitoredItemCreateResult.Builder<_B> _other) {
        if (this.monitoredItemCreateResult == null) {
            _other.monitoredItemCreateResult = null;
        } else {
            _other.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
            for (MonitoredItemCreateResult _item: this.monitoredItemCreateResult) {
                _other.monitoredItemCreateResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfMonitoredItemCreateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfMonitoredItemCreateResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfMonitoredItemCreateResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfMonitoredItemCreateResult.Builder<Void> builder() {
        return new ListOfMonitoredItemCreateResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfMonitoredItemCreateResult.Builder<_B> copyOf(final ListOfMonitoredItemCreateResult _other) {
        final ListOfMonitoredItemCreateResult.Builder<_B> _newBuilder = new ListOfMonitoredItemCreateResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfMonitoredItemCreateResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemCreateResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCreateResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCreateResultPropertyTree!= null):((monitoredItemCreateResultPropertyTree == null)||(!monitoredItemCreateResultPropertyTree.isLeaf())))) {
            if (this.monitoredItemCreateResult == null) {
                _other.monitoredItemCreateResult = null;
            } else {
                _other.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
                for (MonitoredItemCreateResult _item: this.monitoredItemCreateResult) {
                    _other.monitoredItemCreateResult.add(((_item == null)?null:_item.newCopyBuilder(_other, monitoredItemCreateResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfMonitoredItemCreateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfMonitoredItemCreateResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfMonitoredItemCreateResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfMonitoredItemCreateResult.Builder<_B> copyOf(final ListOfMonitoredItemCreateResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfMonitoredItemCreateResult.Builder<_B> _newBuilder = new ListOfMonitoredItemCreateResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfMonitoredItemCreateResult.Builder<Void> copyExcept(final ListOfMonitoredItemCreateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfMonitoredItemCreateResult.Builder<Void> copyOnly(final ListOfMonitoredItemCreateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfMonitoredItemCreateResult _storedValue;
        private List<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>> monitoredItemCreateResult;

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemCreateResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.monitoredItemCreateResult == null) {
                        this.monitoredItemCreateResult = null;
                    } else {
                        this.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
                        for (MonitoredItemCreateResult _item: _other.monitoredItemCreateResult) {
                            this.monitoredItemCreateResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemCreateResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemCreateResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCreateResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCreateResultPropertyTree!= null):((monitoredItemCreateResultPropertyTree == null)||(!monitoredItemCreateResultPropertyTree.isLeaf())))) {
                        if (_other.monitoredItemCreateResult == null) {
                            this.monitoredItemCreateResult = null;
                        } else {
                            this.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
                            for (MonitoredItemCreateResult _item: _other.monitoredItemCreateResult) {
                                this.monitoredItemCreateResult.add(((_item == null)?null:_item.newCopyBuilder(this, monitoredItemCreateResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfMonitoredItemCreateResult >_P init(final _P _product) {
            if (this.monitoredItemCreateResult!= null) {
                final List<MonitoredItemCreateResult> monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult>(this.monitoredItemCreateResult.size());
                for (MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>> _item: this.monitoredItemCreateResult) {
                    monitoredItemCreateResult.add(_item.build());
                }
                _product.monitoredItemCreateResult = monitoredItemCreateResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemCreateResult" hinzu.
         * 
         * @param monitoredItemCreateResult
         *     Werte, die zur Eigenschaft "monitoredItemCreateResult" hinzugefügt werden.
         */
        public ListOfMonitoredItemCreateResult.Builder<_B> addMonitoredItemCreateResult(final Iterable<? extends MonitoredItemCreateResult> monitoredItemCreateResult) {
            if (monitoredItemCreateResult!= null) {
                if (this.monitoredItemCreateResult == null) {
                    this.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
                }
                for (MonitoredItemCreateResult _item: monitoredItemCreateResult) {
                    this.monitoredItemCreateResult.add(new MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCreateResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemCreateResult
         *     Neuer Wert der Eigenschaft "monitoredItemCreateResult".
         */
        public ListOfMonitoredItemCreateResult.Builder<_B> withMonitoredItemCreateResult(final Iterable<? extends MonitoredItemCreateResult> monitoredItemCreateResult) {
            if (this.monitoredItemCreateResult!= null) {
                this.monitoredItemCreateResult.clear();
            }
            return addMonitoredItemCreateResult(monitoredItemCreateResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemCreateResult" hinzu.
         * 
         * @param monitoredItemCreateResult
         *     Werte, die zur Eigenschaft "monitoredItemCreateResult" hinzugefügt werden.
         */
        public ListOfMonitoredItemCreateResult.Builder<_B> addMonitoredItemCreateResult(MonitoredItemCreateResult... monitoredItemCreateResult) {
            addMonitoredItemCreateResult(Arrays.asList(monitoredItemCreateResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCreateResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemCreateResult
         *     Neuer Wert der Eigenschaft "monitoredItemCreateResult".
         */
        public ListOfMonitoredItemCreateResult.Builder<_B> withMonitoredItemCreateResult(MonitoredItemCreateResult... monitoredItemCreateResult) {
            withMonitoredItemCreateResult(Arrays.asList(monitoredItemCreateResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "MonitoredItemCreateResult".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "MonitoredItemCreateResult".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.MonitoredItemCreateResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public MonitoredItemCreateResult.Builder<? extends ListOfMonitoredItemCreateResult.Builder<_B>> addMonitoredItemCreateResult() {
            if (this.monitoredItemCreateResult == null) {
                this.monitoredItemCreateResult = new ArrayList<MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>>();
            }
            final MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>> monitoredItemCreateResult_Builder = new MonitoredItemCreateResult.Builder<ListOfMonitoredItemCreateResult.Builder<_B>>(this, null, false);
            this.monitoredItemCreateResult.add(monitoredItemCreateResult_Builder);
            return monitoredItemCreateResult_Builder;
        }

        @Override
        public ListOfMonitoredItemCreateResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfMonitoredItemCreateResult());
            } else {
                return ((ListOfMonitoredItemCreateResult) _storedValue);
            }
        }

        public ListOfMonitoredItemCreateResult.Builder<_B> copyOf(final ListOfMonitoredItemCreateResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfMonitoredItemCreateResult.Builder<_B> copyOf(final ListOfMonitoredItemCreateResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfMonitoredItemCreateResult.Selector<ListOfMonitoredItemCreateResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfMonitoredItemCreateResult.Select _root() {
            return new ListOfMonitoredItemCreateResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private MonitoredItemCreateResult.Selector<TRoot, ListOfMonitoredItemCreateResult.Selector<TRoot, TParent>> monitoredItemCreateResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemCreateResult!= null) {
                products.put("monitoredItemCreateResult", this.monitoredItemCreateResult.init());
            }
            return products;
        }

        public MonitoredItemCreateResult.Selector<TRoot, ListOfMonitoredItemCreateResult.Selector<TRoot, TParent>> monitoredItemCreateResult() {
            return ((this.monitoredItemCreateResult == null)?this.monitoredItemCreateResult = new MonitoredItemCreateResult.Selector<TRoot, ListOfMonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "monitoredItemCreateResult"):this.monitoredItemCreateResult);
        }

    }

}
