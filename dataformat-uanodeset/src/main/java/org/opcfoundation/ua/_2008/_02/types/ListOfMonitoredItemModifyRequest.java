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
 * <p>Java-Klasse für ListOfMonitoredItemModifyRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfMonitoredItemModifyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemModifyRequest" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoredItemModifyRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMonitoredItemModifyRequest", propOrder = {
    "monitoredItemModifyRequest"
})
public class ListOfMonitoredItemModifyRequest {

    @XmlElement(name = "MonitoredItemModifyRequest", nillable = true)
    protected List<MonitoredItemModifyRequest> monitoredItemModifyRequest;

    /**
     * Gets the value of the monitoredItemModifyRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredItemModifyRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredItemModifyRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredItemModifyRequest }
     * 
     * 
     */
    public List<MonitoredItemModifyRequest> getMonitoredItemModifyRequest() {
        if (monitoredItemModifyRequest == null) {
            monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest>();
        }
        return this.monitoredItemModifyRequest;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfMonitoredItemModifyRequest.Builder<_B> _other) {
        if (this.monitoredItemModifyRequest == null) {
            _other.monitoredItemModifyRequest = null;
        } else {
            _other.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
            for (MonitoredItemModifyRequest _item: this.monitoredItemModifyRequest) {
                _other.monitoredItemModifyRequest.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfMonitoredItemModifyRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfMonitoredItemModifyRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfMonitoredItemModifyRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfMonitoredItemModifyRequest.Builder<Void> builder() {
        return new ListOfMonitoredItemModifyRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfMonitoredItemModifyRequest.Builder<_B> copyOf(final ListOfMonitoredItemModifyRequest _other) {
        final ListOfMonitoredItemModifyRequest.Builder<_B> _newBuilder = new ListOfMonitoredItemModifyRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfMonitoredItemModifyRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemModifyRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemModifyRequest"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemModifyRequestPropertyTree!= null):((monitoredItemModifyRequestPropertyTree == null)||(!monitoredItemModifyRequestPropertyTree.isLeaf())))) {
            if (this.monitoredItemModifyRequest == null) {
                _other.monitoredItemModifyRequest = null;
            } else {
                _other.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
                for (MonitoredItemModifyRequest _item: this.monitoredItemModifyRequest) {
                    _other.monitoredItemModifyRequest.add(((_item == null)?null:_item.newCopyBuilder(_other, monitoredItemModifyRequestPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfMonitoredItemModifyRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfMonitoredItemModifyRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfMonitoredItemModifyRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfMonitoredItemModifyRequest.Builder<_B> copyOf(final ListOfMonitoredItemModifyRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfMonitoredItemModifyRequest.Builder<_B> _newBuilder = new ListOfMonitoredItemModifyRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfMonitoredItemModifyRequest.Builder<Void> copyExcept(final ListOfMonitoredItemModifyRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfMonitoredItemModifyRequest.Builder<Void> copyOnly(final ListOfMonitoredItemModifyRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfMonitoredItemModifyRequest _storedValue;
        private List<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>> monitoredItemModifyRequest;

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemModifyRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.monitoredItemModifyRequest == null) {
                        this.monitoredItemModifyRequest = null;
                    } else {
                        this.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
                        for (MonitoredItemModifyRequest _item: _other.monitoredItemModifyRequest) {
                            this.monitoredItemModifyRequest.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemModifyRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemModifyRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemModifyRequest"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemModifyRequestPropertyTree!= null):((monitoredItemModifyRequestPropertyTree == null)||(!monitoredItemModifyRequestPropertyTree.isLeaf())))) {
                        if (_other.monitoredItemModifyRequest == null) {
                            this.monitoredItemModifyRequest = null;
                        } else {
                            this.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
                            for (MonitoredItemModifyRequest _item: _other.monitoredItemModifyRequest) {
                                this.monitoredItemModifyRequest.add(((_item == null)?null:_item.newCopyBuilder(this, monitoredItemModifyRequestPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfMonitoredItemModifyRequest >_P init(final _P _product) {
            if (this.monitoredItemModifyRequest!= null) {
                final List<MonitoredItemModifyRequest> monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest>(this.monitoredItemModifyRequest.size());
                for (MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>> _item: this.monitoredItemModifyRequest) {
                    monitoredItemModifyRequest.add(_item.build());
                }
                _product.monitoredItemModifyRequest = monitoredItemModifyRequest;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemModifyRequest" hinzu.
         * 
         * @param monitoredItemModifyRequest
         *     Werte, die zur Eigenschaft "monitoredItemModifyRequest" hinzugefügt werden.
         */
        public ListOfMonitoredItemModifyRequest.Builder<_B> addMonitoredItemModifyRequest(final Iterable<? extends MonitoredItemModifyRequest> monitoredItemModifyRequest) {
            if (monitoredItemModifyRequest!= null) {
                if (this.monitoredItemModifyRequest == null) {
                    this.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
                }
                for (MonitoredItemModifyRequest _item: monitoredItemModifyRequest) {
                    this.monitoredItemModifyRequest.add(new MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemModifyRequest" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemModifyRequest
         *     Neuer Wert der Eigenschaft "monitoredItemModifyRequest".
         */
        public ListOfMonitoredItemModifyRequest.Builder<_B> withMonitoredItemModifyRequest(final Iterable<? extends MonitoredItemModifyRequest> monitoredItemModifyRequest) {
            if (this.monitoredItemModifyRequest!= null) {
                this.monitoredItemModifyRequest.clear();
            }
            return addMonitoredItemModifyRequest(monitoredItemModifyRequest);
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemModifyRequest" hinzu.
         * 
         * @param monitoredItemModifyRequest
         *     Werte, die zur Eigenschaft "monitoredItemModifyRequest" hinzugefügt werden.
         */
        public ListOfMonitoredItemModifyRequest.Builder<_B> addMonitoredItemModifyRequest(MonitoredItemModifyRequest... monitoredItemModifyRequest) {
            addMonitoredItemModifyRequest(Arrays.asList(monitoredItemModifyRequest));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemModifyRequest" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemModifyRequest
         *     Neuer Wert der Eigenschaft "monitoredItemModifyRequest".
         */
        public ListOfMonitoredItemModifyRequest.Builder<_B> withMonitoredItemModifyRequest(MonitoredItemModifyRequest... monitoredItemModifyRequest) {
            withMonitoredItemModifyRequest(Arrays.asList(monitoredItemModifyRequest));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "MonitoredItemModifyRequest".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "MonitoredItemModifyRequest".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.MonitoredItemModifyRequest.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public MonitoredItemModifyRequest.Builder<? extends ListOfMonitoredItemModifyRequest.Builder<_B>> addMonitoredItemModifyRequest() {
            if (this.monitoredItemModifyRequest == null) {
                this.monitoredItemModifyRequest = new ArrayList<MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>>();
            }
            final MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>> monitoredItemModifyRequest_Builder = new MonitoredItemModifyRequest.Builder<ListOfMonitoredItemModifyRequest.Builder<_B>>(this, null, false);
            this.monitoredItemModifyRequest.add(monitoredItemModifyRequest_Builder);
            return monitoredItemModifyRequest_Builder;
        }

        @Override
        public ListOfMonitoredItemModifyRequest build() {
            if (_storedValue == null) {
                return this.init(new ListOfMonitoredItemModifyRequest());
            } else {
                return ((ListOfMonitoredItemModifyRequest) _storedValue);
            }
        }

        public ListOfMonitoredItemModifyRequest.Builder<_B> copyOf(final ListOfMonitoredItemModifyRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfMonitoredItemModifyRequest.Builder<_B> copyOf(final ListOfMonitoredItemModifyRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfMonitoredItemModifyRequest.Selector<ListOfMonitoredItemModifyRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfMonitoredItemModifyRequest.Select _root() {
            return new ListOfMonitoredItemModifyRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private MonitoredItemModifyRequest.Selector<TRoot, ListOfMonitoredItemModifyRequest.Selector<TRoot, TParent>> monitoredItemModifyRequest = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemModifyRequest!= null) {
                products.put("monitoredItemModifyRequest", this.monitoredItemModifyRequest.init());
            }
            return products;
        }

        public MonitoredItemModifyRequest.Selector<TRoot, ListOfMonitoredItemModifyRequest.Selector<TRoot, TParent>> monitoredItemModifyRequest() {
            return ((this.monitoredItemModifyRequest == null)?this.monitoredItemModifyRequest = new MonitoredItemModifyRequest.Selector<TRoot, ListOfMonitoredItemModifyRequest.Selector<TRoot, TParent>>(this._root, this, "monitoredItemModifyRequest"):this.monitoredItemModifyRequest);
        }

    }

}
