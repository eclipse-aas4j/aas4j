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
 * <p>Java-Klasse für ListOfServerOnNetwork complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfServerOnNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerOnNetwork" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServerOnNetwork" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfServerOnNetwork", propOrder = {
    "serverOnNetwork"
})
public class ListOfServerOnNetwork {

    @XmlElement(name = "ServerOnNetwork", nillable = true)
    protected List<ServerOnNetwork> serverOnNetwork;

    /**
     * Gets the value of the serverOnNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverOnNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerOnNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerOnNetwork }
     * 
     * 
     */
    public List<ServerOnNetwork> getServerOnNetwork() {
        if (serverOnNetwork == null) {
            serverOnNetwork = new ArrayList<ServerOnNetwork>();
        }
        return this.serverOnNetwork;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfServerOnNetwork.Builder<_B> _other) {
        if (this.serverOnNetwork == null) {
            _other.serverOnNetwork = null;
        } else {
            _other.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
            for (ServerOnNetwork _item: this.serverOnNetwork) {
                _other.serverOnNetwork.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfServerOnNetwork.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfServerOnNetwork.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfServerOnNetwork.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfServerOnNetwork.Builder<Void> builder() {
        return new ListOfServerOnNetwork.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfServerOnNetwork.Builder<_B> copyOf(final ListOfServerOnNetwork _other) {
        final ListOfServerOnNetwork.Builder<_B> _newBuilder = new ListOfServerOnNetwork.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfServerOnNetwork.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree serverOnNetworkPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverOnNetwork"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverOnNetworkPropertyTree!= null):((serverOnNetworkPropertyTree == null)||(!serverOnNetworkPropertyTree.isLeaf())))) {
            if (this.serverOnNetwork == null) {
                _other.serverOnNetwork = null;
            } else {
                _other.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
                for (ServerOnNetwork _item: this.serverOnNetwork) {
                    _other.serverOnNetwork.add(((_item == null)?null:_item.newCopyBuilder(_other, serverOnNetworkPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfServerOnNetwork.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfServerOnNetwork.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfServerOnNetwork.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfServerOnNetwork.Builder<_B> copyOf(final ListOfServerOnNetwork _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfServerOnNetwork.Builder<_B> _newBuilder = new ListOfServerOnNetwork.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfServerOnNetwork.Builder<Void> copyExcept(final ListOfServerOnNetwork _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfServerOnNetwork.Builder<Void> copyOnly(final ListOfServerOnNetwork _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfServerOnNetwork _storedValue;
        private List<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>> serverOnNetwork;

        public Builder(final _B _parentBuilder, final ListOfServerOnNetwork _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.serverOnNetwork == null) {
                        this.serverOnNetwork = null;
                    } else {
                        this.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
                        for (ServerOnNetwork _item: _other.serverOnNetwork) {
                            this.serverOnNetwork.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfServerOnNetwork _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree serverOnNetworkPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverOnNetwork"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverOnNetworkPropertyTree!= null):((serverOnNetworkPropertyTree == null)||(!serverOnNetworkPropertyTree.isLeaf())))) {
                        if (_other.serverOnNetwork == null) {
                            this.serverOnNetwork = null;
                        } else {
                            this.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
                            for (ServerOnNetwork _item: _other.serverOnNetwork) {
                                this.serverOnNetwork.add(((_item == null)?null:_item.newCopyBuilder(this, serverOnNetworkPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfServerOnNetwork >_P init(final _P _product) {
            if (this.serverOnNetwork!= null) {
                final List<ServerOnNetwork> serverOnNetwork = new ArrayList<ServerOnNetwork>(this.serverOnNetwork.size());
                for (ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>> _item: this.serverOnNetwork) {
                    serverOnNetwork.add(_item.build());
                }
                _product.serverOnNetwork = serverOnNetwork;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "serverOnNetwork" hinzu.
         * 
         * @param serverOnNetwork
         *     Werte, die zur Eigenschaft "serverOnNetwork" hinzugefügt werden.
         */
        public ListOfServerOnNetwork.Builder<_B> addServerOnNetwork(final Iterable<? extends ServerOnNetwork> serverOnNetwork) {
            if (serverOnNetwork!= null) {
                if (this.serverOnNetwork == null) {
                    this.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
                }
                for (ServerOnNetwork _item: serverOnNetwork) {
                    this.serverOnNetwork.add(new ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverOnNetwork" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverOnNetwork
         *     Neuer Wert der Eigenschaft "serverOnNetwork".
         */
        public ListOfServerOnNetwork.Builder<_B> withServerOnNetwork(final Iterable<? extends ServerOnNetwork> serverOnNetwork) {
            if (this.serverOnNetwork!= null) {
                this.serverOnNetwork.clear();
            }
            return addServerOnNetwork(serverOnNetwork);
        }

        /**
         * Fügt Werte zur Eigenschaft "serverOnNetwork" hinzu.
         * 
         * @param serverOnNetwork
         *     Werte, die zur Eigenschaft "serverOnNetwork" hinzugefügt werden.
         */
        public ListOfServerOnNetwork.Builder<_B> addServerOnNetwork(ServerOnNetwork... serverOnNetwork) {
            addServerOnNetwork(Arrays.asList(serverOnNetwork));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverOnNetwork" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverOnNetwork
         *     Neuer Wert der Eigenschaft "serverOnNetwork".
         */
        public ListOfServerOnNetwork.Builder<_B> withServerOnNetwork(ServerOnNetwork... serverOnNetwork) {
            withServerOnNetwork(Arrays.asList(serverOnNetwork));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ServerOnNetwork".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ServerOnNetwork".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ServerOnNetwork.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ServerOnNetwork.Builder<? extends ListOfServerOnNetwork.Builder<_B>> addServerOnNetwork() {
            if (this.serverOnNetwork == null) {
                this.serverOnNetwork = new ArrayList<ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>>();
            }
            final ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>> serverOnNetwork_Builder = new ServerOnNetwork.Builder<ListOfServerOnNetwork.Builder<_B>>(this, null, false);
            this.serverOnNetwork.add(serverOnNetwork_Builder);
            return serverOnNetwork_Builder;
        }

        @Override
        public ListOfServerOnNetwork build() {
            if (_storedValue == null) {
                return this.init(new ListOfServerOnNetwork());
            } else {
                return ((ListOfServerOnNetwork) _storedValue);
            }
        }

        public ListOfServerOnNetwork.Builder<_B> copyOf(final ListOfServerOnNetwork _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfServerOnNetwork.Builder<_B> copyOf(final ListOfServerOnNetwork.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfServerOnNetwork.Selector<ListOfServerOnNetwork.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfServerOnNetwork.Select _root() {
            return new ListOfServerOnNetwork.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ServerOnNetwork.Selector<TRoot, ListOfServerOnNetwork.Selector<TRoot, TParent>> serverOnNetwork = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.serverOnNetwork!= null) {
                products.put("serverOnNetwork", this.serverOnNetwork.init());
            }
            return products;
        }

        public ServerOnNetwork.Selector<TRoot, ListOfServerOnNetwork.Selector<TRoot, TParent>> serverOnNetwork() {
            return ((this.serverOnNetwork == null)?this.serverOnNetwork = new ServerOnNetwork.Selector<TRoot, ListOfServerOnNetwork.Selector<TRoot, TParent>>(this._root, this, "serverOnNetwork"):this.serverOnNetwork);
        }

    }

}
