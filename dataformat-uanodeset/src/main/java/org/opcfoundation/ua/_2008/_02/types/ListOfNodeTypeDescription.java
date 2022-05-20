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
 * <p>Java-Klasse für ListOfNodeTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNodeTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeTypeDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeTypeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNodeTypeDescription", propOrder = {
    "nodeTypeDescription"
})
public class ListOfNodeTypeDescription {

    @XmlElement(name = "NodeTypeDescription", nillable = true)
    protected List<NodeTypeDescription> nodeTypeDescription;

    /**
     * Gets the value of the nodeTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeTypeDescription }
     * 
     * 
     */
    public List<NodeTypeDescription> getNodeTypeDescription() {
        if (nodeTypeDescription == null) {
            nodeTypeDescription = new ArrayList<NodeTypeDescription>();
        }
        return this.nodeTypeDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNodeTypeDescription.Builder<_B> _other) {
        if (this.nodeTypeDescription == null) {
            _other.nodeTypeDescription = null;
        } else {
            _other.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
            for (NodeTypeDescription _item: this.nodeTypeDescription) {
                _other.nodeTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNodeTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNodeTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNodeTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNodeTypeDescription.Builder<Void> builder() {
        return new ListOfNodeTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNodeTypeDescription.Builder<_B> copyOf(final ListOfNodeTypeDescription _other) {
        final ListOfNodeTypeDescription.Builder<_B> _newBuilder = new ListOfNodeTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNodeTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeTypeDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeTypeDescriptionPropertyTree!= null):((nodeTypeDescriptionPropertyTree == null)||(!nodeTypeDescriptionPropertyTree.isLeaf())))) {
            if (this.nodeTypeDescription == null) {
                _other.nodeTypeDescription = null;
            } else {
                _other.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
                for (NodeTypeDescription _item: this.nodeTypeDescription) {
                    _other.nodeTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, nodeTypeDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNodeTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNodeTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNodeTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNodeTypeDescription.Builder<_B> copyOf(final ListOfNodeTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNodeTypeDescription.Builder<_B> _newBuilder = new ListOfNodeTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNodeTypeDescription.Builder<Void> copyExcept(final ListOfNodeTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNodeTypeDescription.Builder<Void> copyOnly(final ListOfNodeTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNodeTypeDescription _storedValue;
        private List<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>> nodeTypeDescription;

        public Builder(final _B _parentBuilder, final ListOfNodeTypeDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.nodeTypeDescription == null) {
                        this.nodeTypeDescription = null;
                    } else {
                        this.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
                        for (NodeTypeDescription _item: _other.nodeTypeDescription) {
                            this.nodeTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNodeTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeTypeDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeTypeDescriptionPropertyTree!= null):((nodeTypeDescriptionPropertyTree == null)||(!nodeTypeDescriptionPropertyTree.isLeaf())))) {
                        if (_other.nodeTypeDescription == null) {
                            this.nodeTypeDescription = null;
                        } else {
                            this.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
                            for (NodeTypeDescription _item: _other.nodeTypeDescription) {
                                this.nodeTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this, nodeTypeDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNodeTypeDescription >_P init(final _P _product) {
            if (this.nodeTypeDescription!= null) {
                final List<NodeTypeDescription> nodeTypeDescription = new ArrayList<NodeTypeDescription>(this.nodeTypeDescription.size());
                for (NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>> _item: this.nodeTypeDescription) {
                    nodeTypeDescription.add(_item.build());
                }
                _product.nodeTypeDescription = nodeTypeDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeTypeDescription" hinzu.
         * 
         * @param nodeTypeDescription
         *     Werte, die zur Eigenschaft "nodeTypeDescription" hinzugefügt werden.
         */
        public ListOfNodeTypeDescription.Builder<_B> addNodeTypeDescription(final Iterable<? extends NodeTypeDescription> nodeTypeDescription) {
            if (nodeTypeDescription!= null) {
                if (this.nodeTypeDescription == null) {
                    this.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
                }
                for (NodeTypeDescription _item: nodeTypeDescription) {
                    this.nodeTypeDescription.add(new NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeTypeDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param nodeTypeDescription
         *     Neuer Wert der Eigenschaft "nodeTypeDescription".
         */
        public ListOfNodeTypeDescription.Builder<_B> withNodeTypeDescription(final Iterable<? extends NodeTypeDescription> nodeTypeDescription) {
            if (this.nodeTypeDescription!= null) {
                this.nodeTypeDescription.clear();
            }
            return addNodeTypeDescription(nodeTypeDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeTypeDescription" hinzu.
         * 
         * @param nodeTypeDescription
         *     Werte, die zur Eigenschaft "nodeTypeDescription" hinzugefügt werden.
         */
        public ListOfNodeTypeDescription.Builder<_B> addNodeTypeDescription(NodeTypeDescription... nodeTypeDescription) {
            addNodeTypeDescription(Arrays.asList(nodeTypeDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeTypeDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param nodeTypeDescription
         *     Neuer Wert der Eigenschaft "nodeTypeDescription".
         */
        public ListOfNodeTypeDescription.Builder<_B> withNodeTypeDescription(NodeTypeDescription... nodeTypeDescription) {
            withNodeTypeDescription(Arrays.asList(nodeTypeDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NodeTypeDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.NodeTypeDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NodeTypeDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.NodeTypeDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public NodeTypeDescription.Builder<? extends ListOfNodeTypeDescription.Builder<_B>> addNodeTypeDescription() {
            if (this.nodeTypeDescription == null) {
                this.nodeTypeDescription = new ArrayList<NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>>();
            }
            final NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>> nodeTypeDescription_Builder = new NodeTypeDescription.Builder<ListOfNodeTypeDescription.Builder<_B>>(this, null, false);
            this.nodeTypeDescription.add(nodeTypeDescription_Builder);
            return nodeTypeDescription_Builder;
        }

        @Override
        public ListOfNodeTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfNodeTypeDescription());
            } else {
                return ((ListOfNodeTypeDescription) _storedValue);
            }
        }

        public ListOfNodeTypeDescription.Builder<_B> copyOf(final ListOfNodeTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNodeTypeDescription.Builder<_B> copyOf(final ListOfNodeTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNodeTypeDescription.Selector<ListOfNodeTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNodeTypeDescription.Select _root() {
            return new ListOfNodeTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NodeTypeDescription.Selector<TRoot, ListOfNodeTypeDescription.Selector<TRoot, TParent>> nodeTypeDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeTypeDescription!= null) {
                products.put("nodeTypeDescription", this.nodeTypeDescription.init());
            }
            return products;
        }

        public NodeTypeDescription.Selector<TRoot, ListOfNodeTypeDescription.Selector<TRoot, TParent>> nodeTypeDescription() {
            return ((this.nodeTypeDescription == null)?this.nodeTypeDescription = new NodeTypeDescription.Selector<TRoot, ListOfNodeTypeDescription.Selector<TRoot, TParent>>(this._root, this, "nodeTypeDescription"):this.nodeTypeDescription);
        }

    }

}
