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
 * <p>Java-Klasse für ListOfMonitoredItemCreateRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfMonitoredItemCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemCreateRequest" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoredItemCreateRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMonitoredItemCreateRequest", propOrder = {
    "monitoredItemCreateRequest"
})
public class ListOfMonitoredItemCreateRequest {

    @XmlElement(name = "MonitoredItemCreateRequest", nillable = true)
    protected List<MonitoredItemCreateRequest> monitoredItemCreateRequest;

    /**
     * Gets the value of the monitoredItemCreateRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredItemCreateRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredItemCreateRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredItemCreateRequest }
     * 
     * 
     */
    public List<MonitoredItemCreateRequest> getMonitoredItemCreateRequest() {
        if (monitoredItemCreateRequest == null) {
            monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest>();
        }
        return this.monitoredItemCreateRequest;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfMonitoredItemCreateRequest.Builder<_B> _other) {
        if (this.monitoredItemCreateRequest == null) {
            _other.monitoredItemCreateRequest = null;
        } else {
            _other.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
            for (MonitoredItemCreateRequest _item: this.monitoredItemCreateRequest) {
                _other.monitoredItemCreateRequest.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfMonitoredItemCreateRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfMonitoredItemCreateRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfMonitoredItemCreateRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfMonitoredItemCreateRequest.Builder<Void> builder() {
        return new ListOfMonitoredItemCreateRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfMonitoredItemCreateRequest.Builder<_B> copyOf(final ListOfMonitoredItemCreateRequest _other) {
        final ListOfMonitoredItemCreateRequest.Builder<_B> _newBuilder = new ListOfMonitoredItemCreateRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfMonitoredItemCreateRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemCreateRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCreateRequest"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCreateRequestPropertyTree!= null):((monitoredItemCreateRequestPropertyTree == null)||(!monitoredItemCreateRequestPropertyTree.isLeaf())))) {
            if (this.monitoredItemCreateRequest == null) {
                _other.monitoredItemCreateRequest = null;
            } else {
                _other.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
                for (MonitoredItemCreateRequest _item: this.monitoredItemCreateRequest) {
                    _other.monitoredItemCreateRequest.add(((_item == null)?null:_item.newCopyBuilder(_other, monitoredItemCreateRequestPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfMonitoredItemCreateRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfMonitoredItemCreateRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfMonitoredItemCreateRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfMonitoredItemCreateRequest.Builder<_B> copyOf(final ListOfMonitoredItemCreateRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfMonitoredItemCreateRequest.Builder<_B> _newBuilder = new ListOfMonitoredItemCreateRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfMonitoredItemCreateRequest.Builder<Void> copyExcept(final ListOfMonitoredItemCreateRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfMonitoredItemCreateRequest.Builder<Void> copyOnly(final ListOfMonitoredItemCreateRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfMonitoredItemCreateRequest _storedValue;
        private List<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>> monitoredItemCreateRequest;

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemCreateRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.monitoredItemCreateRequest == null) {
                        this.monitoredItemCreateRequest = null;
                    } else {
                        this.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
                        for (MonitoredItemCreateRequest _item: _other.monitoredItemCreateRequest) {
                            this.monitoredItemCreateRequest.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfMonitoredItemCreateRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemCreateRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCreateRequest"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCreateRequestPropertyTree!= null):((monitoredItemCreateRequestPropertyTree == null)||(!monitoredItemCreateRequestPropertyTree.isLeaf())))) {
                        if (_other.monitoredItemCreateRequest == null) {
                            this.monitoredItemCreateRequest = null;
                        } else {
                            this.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
                            for (MonitoredItemCreateRequest _item: _other.monitoredItemCreateRequest) {
                                this.monitoredItemCreateRequest.add(((_item == null)?null:_item.newCopyBuilder(this, monitoredItemCreateRequestPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfMonitoredItemCreateRequest >_P init(final _P _product) {
            if (this.monitoredItemCreateRequest!= null) {
                final List<MonitoredItemCreateRequest> monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest>(this.monitoredItemCreateRequest.size());
                for (MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>> _item: this.monitoredItemCreateRequest) {
                    monitoredItemCreateRequest.add(_item.build());
                }
                _product.monitoredItemCreateRequest = monitoredItemCreateRequest;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemCreateRequest" hinzu.
         * 
         * @param monitoredItemCreateRequest
         *     Werte, die zur Eigenschaft "monitoredItemCreateRequest" hinzugefügt werden.
         */
        public ListOfMonitoredItemCreateRequest.Builder<_B> addMonitoredItemCreateRequest(final Iterable<? extends MonitoredItemCreateRequest> monitoredItemCreateRequest) {
            if (monitoredItemCreateRequest!= null) {
                if (this.monitoredItemCreateRequest == null) {
                    this.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
                }
                for (MonitoredItemCreateRequest _item: monitoredItemCreateRequest) {
                    this.monitoredItemCreateRequest.add(new MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCreateRequest" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemCreateRequest
         *     Neuer Wert der Eigenschaft "monitoredItemCreateRequest".
         */
        public ListOfMonitoredItemCreateRequest.Builder<_B> withMonitoredItemCreateRequest(final Iterable<? extends MonitoredItemCreateRequest> monitoredItemCreateRequest) {
            if (this.monitoredItemCreateRequest!= null) {
                this.monitoredItemCreateRequest.clear();
            }
            return addMonitoredItemCreateRequest(monitoredItemCreateRequest);
        }

        /**
         * Fügt Werte zur Eigenschaft "monitoredItemCreateRequest" hinzu.
         * 
         * @param monitoredItemCreateRequest
         *     Werte, die zur Eigenschaft "monitoredItemCreateRequest" hinzugefügt werden.
         */
        public ListOfMonitoredItemCreateRequest.Builder<_B> addMonitoredItemCreateRequest(MonitoredItemCreateRequest... monitoredItemCreateRequest) {
            addMonitoredItemCreateRequest(Arrays.asList(monitoredItemCreateRequest));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCreateRequest" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoredItemCreateRequest
         *     Neuer Wert der Eigenschaft "monitoredItemCreateRequest".
         */
        public ListOfMonitoredItemCreateRequest.Builder<_B> withMonitoredItemCreateRequest(MonitoredItemCreateRequest... monitoredItemCreateRequest) {
            withMonitoredItemCreateRequest(Arrays.asList(monitoredItemCreateRequest));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "MonitoredItemCreateRequest".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "MonitoredItemCreateRequest".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.MonitoredItemCreateRequest.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public MonitoredItemCreateRequest.Builder<? extends ListOfMonitoredItemCreateRequest.Builder<_B>> addMonitoredItemCreateRequest() {
            if (this.monitoredItemCreateRequest == null) {
                this.monitoredItemCreateRequest = new ArrayList<MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>>();
            }
            final MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>> monitoredItemCreateRequest_Builder = new MonitoredItemCreateRequest.Builder<ListOfMonitoredItemCreateRequest.Builder<_B>>(this, null, false);
            this.monitoredItemCreateRequest.add(monitoredItemCreateRequest_Builder);
            return monitoredItemCreateRequest_Builder;
        }

        @Override
        public ListOfMonitoredItemCreateRequest build() {
            if (_storedValue == null) {
                return this.init(new ListOfMonitoredItemCreateRequest());
            } else {
                return ((ListOfMonitoredItemCreateRequest) _storedValue);
            }
        }

        public ListOfMonitoredItemCreateRequest.Builder<_B> copyOf(final ListOfMonitoredItemCreateRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfMonitoredItemCreateRequest.Builder<_B> copyOf(final ListOfMonitoredItemCreateRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfMonitoredItemCreateRequest.Selector<ListOfMonitoredItemCreateRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfMonitoredItemCreateRequest.Select _root() {
            return new ListOfMonitoredItemCreateRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private MonitoredItemCreateRequest.Selector<TRoot, ListOfMonitoredItemCreateRequest.Selector<TRoot, TParent>> monitoredItemCreateRequest = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemCreateRequest!= null) {
                products.put("monitoredItemCreateRequest", this.monitoredItemCreateRequest.init());
            }
            return products;
        }

        public MonitoredItemCreateRequest.Selector<TRoot, ListOfMonitoredItemCreateRequest.Selector<TRoot, TParent>> monitoredItemCreateRequest() {
            return ((this.monitoredItemCreateRequest == null)?this.monitoredItemCreateRequest = new MonitoredItemCreateRequest.Selector<TRoot, ListOfMonitoredItemCreateRequest.Selector<TRoot, TParent>>(this._root, this, "monitoredItemCreateRequest"):this.monitoredItemCreateRequest);
        }

    }

}
