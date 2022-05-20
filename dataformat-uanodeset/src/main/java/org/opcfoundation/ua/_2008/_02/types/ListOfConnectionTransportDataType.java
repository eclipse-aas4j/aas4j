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
 * <p>Java-Klasse für ListOfConnectionTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfConnectionTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ConnectionTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfConnectionTransportDataType", propOrder = {
    "connectionTransportDataType"
})
public class ListOfConnectionTransportDataType {

    @XmlElement(name = "ConnectionTransportDataType", nillable = true)
    protected List<ConnectionTransportDataType> connectionTransportDataType;

    /**
     * Gets the value of the connectionTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTransportDataType }
     * 
     * 
     */
    public List<ConnectionTransportDataType> getConnectionTransportDataType() {
        if (connectionTransportDataType == null) {
            connectionTransportDataType = new ArrayList<ConnectionTransportDataType>();
        }
        return this.connectionTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfConnectionTransportDataType.Builder<_B> _other) {
        if (this.connectionTransportDataType == null) {
            _other.connectionTransportDataType = null;
        } else {
            _other.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
            for (ConnectionTransportDataType _item: this.connectionTransportDataType) {
                _other.connectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfConnectionTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfConnectionTransportDataType.Builder<Void> builder() {
        return new ListOfConnectionTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfConnectionTransportDataType.Builder<_B> copyOf(final ListOfConnectionTransportDataType _other) {
        final ListOfConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfConnectionTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfConnectionTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree connectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connectionTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionTransportDataTypePropertyTree!= null):((connectionTransportDataTypePropertyTree == null)||(!connectionTransportDataTypePropertyTree.isLeaf())))) {
            if (this.connectionTransportDataType == null) {
                _other.connectionTransportDataType = null;
            } else {
                _other.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
                for (ConnectionTransportDataType _item: this.connectionTransportDataType) {
                    _other.connectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, connectionTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfConnectionTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfConnectionTransportDataType.Builder<_B> copyOf(final ListOfConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfConnectionTransportDataType.Builder<_B> _newBuilder = new ListOfConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfConnectionTransportDataType.Builder<Void> copyExcept(final ListOfConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfConnectionTransportDataType.Builder<Void> copyOnly(final ListOfConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfConnectionTransportDataType _storedValue;
        private List<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>> connectionTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfConnectionTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.connectionTransportDataType == null) {
                        this.connectionTransportDataType = null;
                    } else {
                        this.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
                        for (ConnectionTransportDataType _item: _other.connectionTransportDataType) {
                            this.connectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfConnectionTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree connectionTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connectionTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionTransportDataTypePropertyTree!= null):((connectionTransportDataTypePropertyTree == null)||(!connectionTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.connectionTransportDataType == null) {
                            this.connectionTransportDataType = null;
                        } else {
                            this.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
                            for (ConnectionTransportDataType _item: _other.connectionTransportDataType) {
                                this.connectionTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, connectionTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfConnectionTransportDataType >_P init(final _P _product) {
            if (this.connectionTransportDataType!= null) {
                final List<ConnectionTransportDataType> connectionTransportDataType = new ArrayList<ConnectionTransportDataType>(this.connectionTransportDataType.size());
                for (ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>> _item: this.connectionTransportDataType) {
                    connectionTransportDataType.add(_item.build());
                }
                _product.connectionTransportDataType = connectionTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "connectionTransportDataType" hinzu.
         * 
         * @param connectionTransportDataType
         *     Werte, die zur Eigenschaft "connectionTransportDataType" hinzugefügt werden.
         */
        public ListOfConnectionTransportDataType.Builder<_B> addConnectionTransportDataType(final Iterable<? extends ConnectionTransportDataType> connectionTransportDataType) {
            if (connectionTransportDataType!= null) {
                if (this.connectionTransportDataType == null) {
                    this.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
                }
                for (ConnectionTransportDataType _item: connectionTransportDataType) {
                    this.connectionTransportDataType.add(new ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "connectionTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param connectionTransportDataType
         *     Neuer Wert der Eigenschaft "connectionTransportDataType".
         */
        public ListOfConnectionTransportDataType.Builder<_B> withConnectionTransportDataType(final Iterable<? extends ConnectionTransportDataType> connectionTransportDataType) {
            if (this.connectionTransportDataType!= null) {
                this.connectionTransportDataType.clear();
            }
            return addConnectionTransportDataType(connectionTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "connectionTransportDataType" hinzu.
         * 
         * @param connectionTransportDataType
         *     Werte, die zur Eigenschaft "connectionTransportDataType" hinzugefügt werden.
         */
        public ListOfConnectionTransportDataType.Builder<_B> addConnectionTransportDataType(ConnectionTransportDataType... connectionTransportDataType) {
            addConnectionTransportDataType(Arrays.asList(connectionTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "connectionTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param connectionTransportDataType
         *     Neuer Wert der Eigenschaft "connectionTransportDataType".
         */
        public ListOfConnectionTransportDataType.Builder<_B> withConnectionTransportDataType(ConnectionTransportDataType... connectionTransportDataType) {
            withConnectionTransportDataType(Arrays.asList(connectionTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ConnectionTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ConnectionTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ConnectionTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ConnectionTransportDataType.Builder<? extends ListOfConnectionTransportDataType.Builder<_B>> addConnectionTransportDataType() {
            if (this.connectionTransportDataType == null) {
                this.connectionTransportDataType = new ArrayList<ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>>();
            }
            final ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>> connectionTransportDataType_Builder = new ConnectionTransportDataType.Builder<ListOfConnectionTransportDataType.Builder<_B>>(this, null, false);
            this.connectionTransportDataType.add(connectionTransportDataType_Builder);
            return connectionTransportDataType_Builder;
        }

        @Override
        public ListOfConnectionTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfConnectionTransportDataType());
            } else {
                return ((ListOfConnectionTransportDataType) _storedValue);
            }
        }

        public ListOfConnectionTransportDataType.Builder<_B> copyOf(final ListOfConnectionTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfConnectionTransportDataType.Builder<_B> copyOf(final ListOfConnectionTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfConnectionTransportDataType.Selector<ListOfConnectionTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfConnectionTransportDataType.Select _root() {
            return new ListOfConnectionTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ConnectionTransportDataType.Selector<TRoot, ListOfConnectionTransportDataType.Selector<TRoot, TParent>> connectionTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.connectionTransportDataType!= null) {
                products.put("connectionTransportDataType", this.connectionTransportDataType.init());
            }
            return products;
        }

        public ConnectionTransportDataType.Selector<TRoot, ListOfConnectionTransportDataType.Selector<TRoot, TParent>> connectionTransportDataType() {
            return ((this.connectionTransportDataType == null)?this.connectionTransportDataType = new ConnectionTransportDataType.Selector<TRoot, ListOfConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "connectionTransportDataType"):this.connectionTransportDataType);
        }

    }

}
