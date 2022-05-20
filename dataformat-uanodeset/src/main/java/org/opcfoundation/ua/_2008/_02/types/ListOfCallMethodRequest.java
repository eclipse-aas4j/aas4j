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
 * <p>Java-Klasse für ListOfCallMethodRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfCallMethodRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallMethodRequest" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}CallMethodRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCallMethodRequest", propOrder = {
    "callMethodRequest"
})
public class ListOfCallMethodRequest {

    @XmlElement(name = "CallMethodRequest", nillable = true)
    protected List<CallMethodRequest> callMethodRequest;

    /**
     * Gets the value of the callMethodRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callMethodRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallMethodRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallMethodRequest }
     * 
     * 
     */
    public List<CallMethodRequest> getCallMethodRequest() {
        if (callMethodRequest == null) {
            callMethodRequest = new ArrayList<CallMethodRequest>();
        }
        return this.callMethodRequest;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfCallMethodRequest.Builder<_B> _other) {
        if (this.callMethodRequest == null) {
            _other.callMethodRequest = null;
        } else {
            _other.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
            for (CallMethodRequest _item: this.callMethodRequest) {
                _other.callMethodRequest.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfCallMethodRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfCallMethodRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfCallMethodRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfCallMethodRequest.Builder<Void> builder() {
        return new ListOfCallMethodRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfCallMethodRequest.Builder<_B> copyOf(final ListOfCallMethodRequest _other) {
        final ListOfCallMethodRequest.Builder<_B> _newBuilder = new ListOfCallMethodRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfCallMethodRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree callMethodRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("callMethodRequest"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(callMethodRequestPropertyTree!= null):((callMethodRequestPropertyTree == null)||(!callMethodRequestPropertyTree.isLeaf())))) {
            if (this.callMethodRequest == null) {
                _other.callMethodRequest = null;
            } else {
                _other.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
                for (CallMethodRequest _item: this.callMethodRequest) {
                    _other.callMethodRequest.add(((_item == null)?null:_item.newCopyBuilder(_other, callMethodRequestPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfCallMethodRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfCallMethodRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfCallMethodRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfCallMethodRequest.Builder<_B> copyOf(final ListOfCallMethodRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfCallMethodRequest.Builder<_B> _newBuilder = new ListOfCallMethodRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfCallMethodRequest.Builder<Void> copyExcept(final ListOfCallMethodRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfCallMethodRequest.Builder<Void> copyOnly(final ListOfCallMethodRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfCallMethodRequest _storedValue;
        private List<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>> callMethodRequest;

        public Builder(final _B _parentBuilder, final ListOfCallMethodRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.callMethodRequest == null) {
                        this.callMethodRequest = null;
                    } else {
                        this.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
                        for (CallMethodRequest _item: _other.callMethodRequest) {
                            this.callMethodRequest.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfCallMethodRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree callMethodRequestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("callMethodRequest"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(callMethodRequestPropertyTree!= null):((callMethodRequestPropertyTree == null)||(!callMethodRequestPropertyTree.isLeaf())))) {
                        if (_other.callMethodRequest == null) {
                            this.callMethodRequest = null;
                        } else {
                            this.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
                            for (CallMethodRequest _item: _other.callMethodRequest) {
                                this.callMethodRequest.add(((_item == null)?null:_item.newCopyBuilder(this, callMethodRequestPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfCallMethodRequest >_P init(final _P _product) {
            if (this.callMethodRequest!= null) {
                final List<CallMethodRequest> callMethodRequest = new ArrayList<CallMethodRequest>(this.callMethodRequest.size());
                for (CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>> _item: this.callMethodRequest) {
                    callMethodRequest.add(_item.build());
                }
                _product.callMethodRequest = callMethodRequest;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "callMethodRequest" hinzu.
         * 
         * @param callMethodRequest
         *     Werte, die zur Eigenschaft "callMethodRequest" hinzugefügt werden.
         */
        public ListOfCallMethodRequest.Builder<_B> addCallMethodRequest(final Iterable<? extends CallMethodRequest> callMethodRequest) {
            if (callMethodRequest!= null) {
                if (this.callMethodRequest == null) {
                    this.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
                }
                for (CallMethodRequest _item: callMethodRequest) {
                    this.callMethodRequest.add(new CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "callMethodRequest" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param callMethodRequest
         *     Neuer Wert der Eigenschaft "callMethodRequest".
         */
        public ListOfCallMethodRequest.Builder<_B> withCallMethodRequest(final Iterable<? extends CallMethodRequest> callMethodRequest) {
            if (this.callMethodRequest!= null) {
                this.callMethodRequest.clear();
            }
            return addCallMethodRequest(callMethodRequest);
        }

        /**
         * Fügt Werte zur Eigenschaft "callMethodRequest" hinzu.
         * 
         * @param callMethodRequest
         *     Werte, die zur Eigenschaft "callMethodRequest" hinzugefügt werden.
         */
        public ListOfCallMethodRequest.Builder<_B> addCallMethodRequest(CallMethodRequest... callMethodRequest) {
            addCallMethodRequest(Arrays.asList(callMethodRequest));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "callMethodRequest" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param callMethodRequest
         *     Neuer Wert der Eigenschaft "callMethodRequest".
         */
        public ListOfCallMethodRequest.Builder<_B> withCallMethodRequest(CallMethodRequest... callMethodRequest) {
            withCallMethodRequest(Arrays.asList(callMethodRequest));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "CallMethodRequest".
         * Mit {@link org.opcfoundation.ua._2008._02.types.CallMethodRequest.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "CallMethodRequest".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.CallMethodRequest.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public CallMethodRequest.Builder<? extends ListOfCallMethodRequest.Builder<_B>> addCallMethodRequest() {
            if (this.callMethodRequest == null) {
                this.callMethodRequest = new ArrayList<CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>>();
            }
            final CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>> callMethodRequest_Builder = new CallMethodRequest.Builder<ListOfCallMethodRequest.Builder<_B>>(this, null, false);
            this.callMethodRequest.add(callMethodRequest_Builder);
            return callMethodRequest_Builder;
        }

        @Override
        public ListOfCallMethodRequest build() {
            if (_storedValue == null) {
                return this.init(new ListOfCallMethodRequest());
            } else {
                return ((ListOfCallMethodRequest) _storedValue);
            }
        }

        public ListOfCallMethodRequest.Builder<_B> copyOf(final ListOfCallMethodRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfCallMethodRequest.Builder<_B> copyOf(final ListOfCallMethodRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfCallMethodRequest.Selector<ListOfCallMethodRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfCallMethodRequest.Select _root() {
            return new ListOfCallMethodRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private CallMethodRequest.Selector<TRoot, ListOfCallMethodRequest.Selector<TRoot, TParent>> callMethodRequest = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.callMethodRequest!= null) {
                products.put("callMethodRequest", this.callMethodRequest.init());
            }
            return products;
        }

        public CallMethodRequest.Selector<TRoot, ListOfCallMethodRequest.Selector<TRoot, TParent>> callMethodRequest() {
            return ((this.callMethodRequest == null)?this.callMethodRequest = new CallMethodRequest.Selector<TRoot, ListOfCallMethodRequest.Selector<TRoot, TParent>>(this._root, this, "callMethodRequest"):this.callMethodRequest);
        }

    }

}
