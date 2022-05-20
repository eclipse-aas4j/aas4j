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
 * <p>Java-Klasse für ListOfNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Node" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNode", propOrder = {
    "node"
})
public class ListOfNode {

    @XmlElement(name = "Node", nillable = true)
    protected List<Node> node;

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node }
     * 
     * 
     */
    public List<Node> getNode() {
        if (node == null) {
            node = new ArrayList<Node>();
        }
        return this.node;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNode.Builder<_B> _other) {
        if (this.node == null) {
            _other.node = null;
        } else {
            _other.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
            for (Node _item: this.node) {
                _other.node.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNode.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNode.Builder<Void> builder() {
        return new ListOfNode.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNode.Builder<_B> copyOf(final ListOfNode _other) {
        final ListOfNode.Builder<_B> _newBuilder = new ListOfNode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("node"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodePropertyTree!= null):((nodePropertyTree == null)||(!nodePropertyTree.isLeaf())))) {
            if (this.node == null) {
                _other.node = null;
            } else {
                _other.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
                for (Node _item: this.node) {
                    _other.node.add(((_item == null)?null:_item.newCopyBuilder(_other, nodePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNode.Builder<_B> copyOf(final ListOfNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNode.Builder<_B> _newBuilder = new ListOfNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNode.Builder<Void> copyExcept(final ListOfNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNode.Builder<Void> copyOnly(final ListOfNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNode _storedValue;
        private List<Node.Builder<ListOfNode.Builder<_B>>> node;

        public Builder(final _B _parentBuilder, final ListOfNode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.node == null) {
                        this.node = null;
                    } else {
                        this.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
                        for (Node _item: _other.node) {
                            this.node.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("node"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodePropertyTree!= null):((nodePropertyTree == null)||(!nodePropertyTree.isLeaf())))) {
                        if (_other.node == null) {
                            this.node = null;
                        } else {
                            this.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
                            for (Node _item: _other.node) {
                                this.node.add(((_item == null)?null:_item.newCopyBuilder(this, nodePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNode >_P init(final _P _product) {
            if (this.node!= null) {
                final List<Node> node = new ArrayList<Node>(this.node.size());
                for (Node.Builder<ListOfNode.Builder<_B>> _item: this.node) {
                    node.add(_item.build());
                }
                _product.node = node;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "node" hinzu.
         * 
         * @param node
         *     Werte, die zur Eigenschaft "node" hinzugefügt werden.
         */
        public ListOfNode.Builder<_B> addNode(final Iterable<? extends Node> node) {
            if (node!= null) {
                if (this.node == null) {
                    this.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
                }
                for (Node _item: node) {
                    this.node.add(new Node.Builder<ListOfNode.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "node" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param node
         *     Neuer Wert der Eigenschaft "node".
         */
        public ListOfNode.Builder<_B> withNode(final Iterable<? extends Node> node) {
            if (this.node!= null) {
                this.node.clear();
            }
            return addNode(node);
        }

        /**
         * Fügt Werte zur Eigenschaft "node" hinzu.
         * 
         * @param node
         *     Werte, die zur Eigenschaft "node" hinzugefügt werden.
         */
        public ListOfNode.Builder<_B> addNode(Node... node) {
            addNode(Arrays.asList(node));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "node" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param node
         *     Neuer Wert der Eigenschaft "node".
         */
        public ListOfNode.Builder<_B> withNode(Node... node) {
            withNode(Arrays.asList(node));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Node".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Node.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Node".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Node.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Node.Builder<? extends ListOfNode.Builder<_B>> addNode() {
            if (this.node == null) {
                this.node = new ArrayList<Node.Builder<ListOfNode.Builder<_B>>>();
            }
            final Node.Builder<ListOfNode.Builder<_B>> node_Builder = new Node.Builder<ListOfNode.Builder<_B>>(this, null, false);
            this.node.add(node_Builder);
            return node_Builder;
        }

        @Override
        public ListOfNode build() {
            if (_storedValue == null) {
                return this.init(new ListOfNode());
            } else {
                return ((ListOfNode) _storedValue);
            }
        }

        public ListOfNode.Builder<_B> copyOf(final ListOfNode _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNode.Builder<_B> copyOf(final ListOfNode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNode.Selector<ListOfNode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNode.Select _root() {
            return new ListOfNode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Node.Selector<TRoot, ListOfNode.Selector<TRoot, TParent>> node = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.node!= null) {
                products.put("node", this.node.init());
            }
            return products;
        }

        public Node.Selector<TRoot, ListOfNode.Selector<TRoot, TParent>> node() {
            return ((this.node == null)?this.node = new Node.Selector<TRoot, ListOfNode.Selector<TRoot, TParent>>(this._root, this, "node"):this.node);
        }

    }

}
