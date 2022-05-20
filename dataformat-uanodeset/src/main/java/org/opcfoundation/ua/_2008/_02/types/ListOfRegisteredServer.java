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
 * <p>Java-Klasse für ListOfRegisteredServer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfRegisteredServer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegisteredServer" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RegisteredServer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRegisteredServer", propOrder = {
    "registeredServer"
})
public class ListOfRegisteredServer {

    @XmlElement(name = "RegisteredServer", nillable = true)
    protected List<RegisteredServer> registeredServer;

    /**
     * Gets the value of the registeredServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredServer }
     * 
     * 
     */
    public List<RegisteredServer> getRegisteredServer() {
        if (registeredServer == null) {
            registeredServer = new ArrayList<RegisteredServer>();
        }
        return this.registeredServer;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfRegisteredServer.Builder<_B> _other) {
        if (this.registeredServer == null) {
            _other.registeredServer = null;
        } else {
            _other.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
            for (RegisteredServer _item: this.registeredServer) {
                _other.registeredServer.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfRegisteredServer.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfRegisteredServer.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfRegisteredServer.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfRegisteredServer.Builder<Void> builder() {
        return new ListOfRegisteredServer.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfRegisteredServer.Builder<_B> copyOf(final ListOfRegisteredServer _other) {
        final ListOfRegisteredServer.Builder<_B> _newBuilder = new ListOfRegisteredServer.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfRegisteredServer.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree registeredServerPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("registeredServer"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(registeredServerPropertyTree!= null):((registeredServerPropertyTree == null)||(!registeredServerPropertyTree.isLeaf())))) {
            if (this.registeredServer == null) {
                _other.registeredServer = null;
            } else {
                _other.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
                for (RegisteredServer _item: this.registeredServer) {
                    _other.registeredServer.add(((_item == null)?null:_item.newCopyBuilder(_other, registeredServerPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfRegisteredServer.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfRegisteredServer.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfRegisteredServer.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfRegisteredServer.Builder<_B> copyOf(final ListOfRegisteredServer _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfRegisteredServer.Builder<_B> _newBuilder = new ListOfRegisteredServer.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfRegisteredServer.Builder<Void> copyExcept(final ListOfRegisteredServer _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfRegisteredServer.Builder<Void> copyOnly(final ListOfRegisteredServer _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfRegisteredServer _storedValue;
        private List<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>> registeredServer;

        public Builder(final _B _parentBuilder, final ListOfRegisteredServer _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.registeredServer == null) {
                        this.registeredServer = null;
                    } else {
                        this.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
                        for (RegisteredServer _item: _other.registeredServer) {
                            this.registeredServer.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfRegisteredServer _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree registeredServerPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("registeredServer"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(registeredServerPropertyTree!= null):((registeredServerPropertyTree == null)||(!registeredServerPropertyTree.isLeaf())))) {
                        if (_other.registeredServer == null) {
                            this.registeredServer = null;
                        } else {
                            this.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
                            for (RegisteredServer _item: _other.registeredServer) {
                                this.registeredServer.add(((_item == null)?null:_item.newCopyBuilder(this, registeredServerPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfRegisteredServer >_P init(final _P _product) {
            if (this.registeredServer!= null) {
                final List<RegisteredServer> registeredServer = new ArrayList<RegisteredServer>(this.registeredServer.size());
                for (RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>> _item: this.registeredServer) {
                    registeredServer.add(_item.build());
                }
                _product.registeredServer = registeredServer;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "registeredServer" hinzu.
         * 
         * @param registeredServer
         *     Werte, die zur Eigenschaft "registeredServer" hinzugefügt werden.
         */
        public ListOfRegisteredServer.Builder<_B> addRegisteredServer(final Iterable<? extends RegisteredServer> registeredServer) {
            if (registeredServer!= null) {
                if (this.registeredServer == null) {
                    this.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
                }
                for (RegisteredServer _item: registeredServer) {
                    this.registeredServer.add(new RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "registeredServer" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param registeredServer
         *     Neuer Wert der Eigenschaft "registeredServer".
         */
        public ListOfRegisteredServer.Builder<_B> withRegisteredServer(final Iterable<? extends RegisteredServer> registeredServer) {
            if (this.registeredServer!= null) {
                this.registeredServer.clear();
            }
            return addRegisteredServer(registeredServer);
        }

        /**
         * Fügt Werte zur Eigenschaft "registeredServer" hinzu.
         * 
         * @param registeredServer
         *     Werte, die zur Eigenschaft "registeredServer" hinzugefügt werden.
         */
        public ListOfRegisteredServer.Builder<_B> addRegisteredServer(RegisteredServer... registeredServer) {
            addRegisteredServer(Arrays.asList(registeredServer));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "registeredServer" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param registeredServer
         *     Neuer Wert der Eigenschaft "registeredServer".
         */
        public ListOfRegisteredServer.Builder<_B> withRegisteredServer(RegisteredServer... registeredServer) {
            withRegisteredServer(Arrays.asList(registeredServer));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "RegisteredServer".
         * Mit {@link org.opcfoundation.ua._2008._02.types.RegisteredServer.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "RegisteredServer".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.RegisteredServer.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public RegisteredServer.Builder<? extends ListOfRegisteredServer.Builder<_B>> addRegisteredServer() {
            if (this.registeredServer == null) {
                this.registeredServer = new ArrayList<RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>>();
            }
            final RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>> registeredServer_Builder = new RegisteredServer.Builder<ListOfRegisteredServer.Builder<_B>>(this, null, false);
            this.registeredServer.add(registeredServer_Builder);
            return registeredServer_Builder;
        }

        @Override
        public ListOfRegisteredServer build() {
            if (_storedValue == null) {
                return this.init(new ListOfRegisteredServer());
            } else {
                return ((ListOfRegisteredServer) _storedValue);
            }
        }

        public ListOfRegisteredServer.Builder<_B> copyOf(final ListOfRegisteredServer _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfRegisteredServer.Builder<_B> copyOf(final ListOfRegisteredServer.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfRegisteredServer.Selector<ListOfRegisteredServer.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfRegisteredServer.Select _root() {
            return new ListOfRegisteredServer.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private RegisteredServer.Selector<TRoot, ListOfRegisteredServer.Selector<TRoot, TParent>> registeredServer = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.registeredServer!= null) {
                products.put("registeredServer", this.registeredServer.init());
            }
            return products;
        }

        public RegisteredServer.Selector<TRoot, ListOfRegisteredServer.Selector<TRoot, TParent>> registeredServer() {
            return ((this.registeredServer == null)?this.registeredServer = new RegisteredServer.Selector<TRoot, ListOfRegisteredServer.Selector<TRoot, TParent>>(this._root, this, "registeredServer"):this.registeredServer);
        }

    }

}
