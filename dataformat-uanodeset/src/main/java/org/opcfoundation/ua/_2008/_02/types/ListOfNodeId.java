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
 * <p>Java-Klasse für ListOfNodeId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNodeId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNodeId", propOrder = {
    "nodeId"
})
public class ListOfNodeId {

    @XmlElement(name = "NodeId", nillable = true)
    protected List<NodeId> nodeId;

    /**
     * Gets the value of the nodeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeId }
     * 
     * 
     */
    public List<NodeId> getNodeId() {
        if (nodeId == null) {
            nodeId = new ArrayList<NodeId>();
        }
        return this.nodeId;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNodeId.Builder<_B> _other) {
        if (this.nodeId == null) {
            _other.nodeId = null;
        } else {
            _other.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
            for (NodeId _item: this.nodeId) {
                _other.nodeId.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNodeId.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNodeId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNodeId.Builder<Void> builder() {
        return new ListOfNodeId.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNodeId.Builder<_B> copyOf(final ListOfNodeId _other) {
        final ListOfNodeId.Builder<_B> _newBuilder = new ListOfNodeId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNodeId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            if (this.nodeId == null) {
                _other.nodeId = null;
            } else {
                _other.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
                for (NodeId _item: this.nodeId) {
                    _other.nodeId.add(((_item == null)?null:_item.newCopyBuilder(_other, nodeIdPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNodeId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNodeId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNodeId.Builder<_B> copyOf(final ListOfNodeId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNodeId.Builder<_B> _newBuilder = new ListOfNodeId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNodeId.Builder<Void> copyExcept(final ListOfNodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNodeId.Builder<Void> copyOnly(final ListOfNodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNodeId _storedValue;
        private List<NodeId.Builder<ListOfNodeId.Builder<_B>>> nodeId;

        public Builder(final _B _parentBuilder, final ListOfNodeId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.nodeId == null) {
                        this.nodeId = null;
                    } else {
                        this.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
                        for (NodeId _item: _other.nodeId) {
                            this.nodeId.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNodeId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        if (_other.nodeId == null) {
                            this.nodeId = null;
                        } else {
                            this.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
                            for (NodeId _item: _other.nodeId) {
                                this.nodeId.add(((_item == null)?null:_item.newCopyBuilder(this, nodeIdPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNodeId >_P init(final _P _product) {
            if (this.nodeId!= null) {
                final List<NodeId> nodeId = new ArrayList<NodeId>(this.nodeId.size());
                for (NodeId.Builder<ListOfNodeId.Builder<_B>> _item: this.nodeId) {
                    nodeId.add(_item.build());
                }
                _product.nodeId = nodeId;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeId" hinzu.
         * 
         * @param nodeId
         *     Werte, die zur Eigenschaft "nodeId" hinzugefügt werden.
         */
        public ListOfNodeId.Builder<_B> addNodeId(final Iterable<? extends NodeId> nodeId) {
            if (nodeId!= null) {
                if (this.nodeId == null) {
                    this.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
                }
                for (NodeId _item: nodeId) {
                    this.nodeId.add(new NodeId.Builder<ListOfNodeId.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public ListOfNodeId.Builder<_B> withNodeId(final Iterable<? extends NodeId> nodeId) {
            if (this.nodeId!= null) {
                this.nodeId.clear();
            }
            return addNodeId(nodeId);
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeId" hinzu.
         * 
         * @param nodeId
         *     Werte, die zur Eigenschaft "nodeId" hinzugefügt werden.
         */
        public ListOfNodeId.Builder<_B> addNodeId(NodeId... nodeId) {
            addNodeId(Arrays.asList(nodeId));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public ListOfNodeId.Builder<_B> withNodeId(NodeId... nodeId) {
            withNodeId(Arrays.asList(nodeId));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NodeId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.NodeId.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NodeId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.NodeId.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public NodeId.Builder<? extends ListOfNodeId.Builder<_B>> addNodeId() {
            if (this.nodeId == null) {
                this.nodeId = new ArrayList<NodeId.Builder<ListOfNodeId.Builder<_B>>>();
            }
            final NodeId.Builder<ListOfNodeId.Builder<_B>> nodeId_Builder = new NodeId.Builder<ListOfNodeId.Builder<_B>>(this, null, false);
            this.nodeId.add(nodeId_Builder);
            return nodeId_Builder;
        }

        @Override
        public ListOfNodeId build() {
            if (_storedValue == null) {
                return this.init(new ListOfNodeId());
            } else {
                return ((ListOfNodeId) _storedValue);
            }
        }

        public ListOfNodeId.Builder<_B> copyOf(final ListOfNodeId _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNodeId.Builder<_B> copyOf(final ListOfNodeId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNodeId.Selector<ListOfNodeId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNodeId.Select _root() {
            return new ListOfNodeId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NodeId.Selector<TRoot, ListOfNodeId.Selector<TRoot, TParent>> nodeId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeId!= null) {
                products.put("nodeId", this.nodeId.init());
            }
            return products;
        }

        public NodeId.Selector<TRoot, ListOfNodeId.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new NodeId.Selector<TRoot, ListOfNodeId.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

    }

}
