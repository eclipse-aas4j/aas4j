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
 * <p>Java-Klasse für ListOfStatusCode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfStatusCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStatusCode", propOrder = {
    "statusCode"
})
public class ListOfStatusCode {

    @XmlElement(name = "StatusCode")
    protected List<StatusCode> statusCode;

    /**
     * Gets the value of the statusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusCode }
     * 
     * 
     */
    public List<StatusCode> getStatusCode() {
        if (statusCode == null) {
            statusCode = new ArrayList<StatusCode>();
        }
        return this.statusCode;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfStatusCode.Builder<_B> _other) {
        if (this.statusCode == null) {
            _other.statusCode = null;
        } else {
            _other.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
            for (StatusCode _item: this.statusCode) {
                _other.statusCode.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfStatusCode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfStatusCode.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfStatusCode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfStatusCode.Builder<Void> builder() {
        return new ListOfStatusCode.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfStatusCode.Builder<_B> copyOf(final ListOfStatusCode _other) {
        final ListOfStatusCode.Builder<_B> _newBuilder = new ListOfStatusCode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfStatusCode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            if (this.statusCode == null) {
                _other.statusCode = null;
            } else {
                _other.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
                for (StatusCode _item: this.statusCode) {
                    _other.statusCode.add(((_item == null)?null:_item.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfStatusCode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfStatusCode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfStatusCode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfStatusCode.Builder<_B> copyOf(final ListOfStatusCode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfStatusCode.Builder<_B> _newBuilder = new ListOfStatusCode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfStatusCode.Builder<Void> copyExcept(final ListOfStatusCode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfStatusCode.Builder<Void> copyOnly(final ListOfStatusCode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfStatusCode _storedValue;
        private List<StatusCode.Builder<ListOfStatusCode.Builder<_B>>> statusCode;

        public Builder(final _B _parentBuilder, final ListOfStatusCode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.statusCode == null) {
                        this.statusCode = null;
                    } else {
                        this.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
                        for (StatusCode _item: _other.statusCode) {
                            this.statusCode.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfStatusCode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        if (_other.statusCode == null) {
                            this.statusCode = null;
                        } else {
                            this.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
                            for (StatusCode _item: _other.statusCode) {
                                this.statusCode.add(((_item == null)?null:_item.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfStatusCode >_P init(final _P _product) {
            if (this.statusCode!= null) {
                final List<StatusCode> statusCode = new ArrayList<StatusCode>(this.statusCode.size());
                for (StatusCode.Builder<ListOfStatusCode.Builder<_B>> _item: this.statusCode) {
                    statusCode.add(_item.build());
                }
                _product.statusCode = statusCode;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "statusCode" hinzu.
         * 
         * @param statusCode
         *     Werte, die zur Eigenschaft "statusCode" hinzugefügt werden.
         */
        public ListOfStatusCode.Builder<_B> addStatusCode(final Iterable<? extends StatusCode> statusCode) {
            if (statusCode!= null) {
                if (this.statusCode == null) {
                    this.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
                }
                for (StatusCode _item: statusCode) {
                    this.statusCode.add(new StatusCode.Builder<ListOfStatusCode.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public ListOfStatusCode.Builder<_B> withStatusCode(final Iterable<? extends StatusCode> statusCode) {
            if (this.statusCode!= null) {
                this.statusCode.clear();
            }
            return addStatusCode(statusCode);
        }

        /**
         * Fügt Werte zur Eigenschaft "statusCode" hinzu.
         * 
         * @param statusCode
         *     Werte, die zur Eigenschaft "statusCode" hinzugefügt werden.
         */
        public ListOfStatusCode.Builder<_B> addStatusCode(StatusCode... statusCode) {
            addStatusCode(Arrays.asList(statusCode));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public ListOfStatusCode.Builder<_B> withStatusCode(StatusCode... statusCode) {
            withStatusCode(Arrays.asList(statusCode));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "StatusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "StatusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends ListOfStatusCode.Builder<_B>> addStatusCode() {
            if (this.statusCode == null) {
                this.statusCode = new ArrayList<StatusCode.Builder<ListOfStatusCode.Builder<_B>>>();
            }
            final StatusCode.Builder<ListOfStatusCode.Builder<_B>> statusCode_Builder = new StatusCode.Builder<ListOfStatusCode.Builder<_B>>(this, null, false);
            this.statusCode.add(statusCode_Builder);
            return statusCode_Builder;
        }

        @Override
        public ListOfStatusCode build() {
            if (_storedValue == null) {
                return this.init(new ListOfStatusCode());
            } else {
                return ((ListOfStatusCode) _storedValue);
            }
        }

        public ListOfStatusCode.Builder<_B> copyOf(final ListOfStatusCode _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfStatusCode.Builder<_B> copyOf(final ListOfStatusCode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfStatusCode.Selector<ListOfStatusCode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfStatusCode.Select _root() {
            return new ListOfStatusCode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, ListOfStatusCode.Selector<TRoot, TParent>> statusCode = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, ListOfStatusCode.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, ListOfStatusCode.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

    }

}
