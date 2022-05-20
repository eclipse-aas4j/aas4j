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
 * <p>Java-Klasse für ListOfNodeReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfNodeReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeReference" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNodeReference", propOrder = {
    "nodeReference"
})
public class ListOfNodeReference {

    @XmlElement(name = "NodeReference", nillable = true)
    protected List<NodeReference> nodeReference;

    /**
     * Gets the value of the nodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeReference }
     * 
     * 
     */
    public List<NodeReference> getNodeReference() {
        if (nodeReference == null) {
            nodeReference = new ArrayList<NodeReference>();
        }
        return this.nodeReference;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfNodeReference.Builder<_B> _other) {
        if (this.nodeReference == null) {
            _other.nodeReference = null;
        } else {
            _other.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
            for (NodeReference _item: this.nodeReference) {
                _other.nodeReference.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfNodeReference.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfNodeReference.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfNodeReference.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfNodeReference.Builder<Void> builder() {
        return new ListOfNodeReference.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfNodeReference.Builder<_B> copyOf(final ListOfNodeReference _other) {
        final ListOfNodeReference.Builder<_B> _newBuilder = new ListOfNodeReference.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfNodeReference.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeReferencePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeReference"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeReferencePropertyTree!= null):((nodeReferencePropertyTree == null)||(!nodeReferencePropertyTree.isLeaf())))) {
            if (this.nodeReference == null) {
                _other.nodeReference = null;
            } else {
                _other.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
                for (NodeReference _item: this.nodeReference) {
                    _other.nodeReference.add(((_item == null)?null:_item.newCopyBuilder(_other, nodeReferencePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfNodeReference.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfNodeReference.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfNodeReference.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfNodeReference.Builder<_B> copyOf(final ListOfNodeReference _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfNodeReference.Builder<_B> _newBuilder = new ListOfNodeReference.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfNodeReference.Builder<Void> copyExcept(final ListOfNodeReference _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfNodeReference.Builder<Void> copyOnly(final ListOfNodeReference _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfNodeReference _storedValue;
        private List<NodeReference.Builder<ListOfNodeReference.Builder<_B>>> nodeReference;

        public Builder(final _B _parentBuilder, final ListOfNodeReference _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.nodeReference == null) {
                        this.nodeReference = null;
                    } else {
                        this.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
                        for (NodeReference _item: _other.nodeReference) {
                            this.nodeReference.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfNodeReference _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeReferencePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeReference"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeReferencePropertyTree!= null):((nodeReferencePropertyTree == null)||(!nodeReferencePropertyTree.isLeaf())))) {
                        if (_other.nodeReference == null) {
                            this.nodeReference = null;
                        } else {
                            this.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
                            for (NodeReference _item: _other.nodeReference) {
                                this.nodeReference.add(((_item == null)?null:_item.newCopyBuilder(this, nodeReferencePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfNodeReference >_P init(final _P _product) {
            if (this.nodeReference!= null) {
                final List<NodeReference> nodeReference = new ArrayList<NodeReference>(this.nodeReference.size());
                for (NodeReference.Builder<ListOfNodeReference.Builder<_B>> _item: this.nodeReference) {
                    nodeReference.add(_item.build());
                }
                _product.nodeReference = nodeReference;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeReference" hinzu.
         * 
         * @param nodeReference
         *     Werte, die zur Eigenschaft "nodeReference" hinzugefügt werden.
         */
        public ListOfNodeReference.Builder<_B> addNodeReference(final Iterable<? extends NodeReference> nodeReference) {
            if (nodeReference!= null) {
                if (this.nodeReference == null) {
                    this.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
                }
                for (NodeReference _item: nodeReference) {
                    this.nodeReference.add(new NodeReference.Builder<ListOfNodeReference.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeReference" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodeReference
         *     Neuer Wert der Eigenschaft "nodeReference".
         */
        public ListOfNodeReference.Builder<_B> withNodeReference(final Iterable<? extends NodeReference> nodeReference) {
            if (this.nodeReference!= null) {
                this.nodeReference.clear();
            }
            return addNodeReference(nodeReference);
        }

        /**
         * Fügt Werte zur Eigenschaft "nodeReference" hinzu.
         * 
         * @param nodeReference
         *     Werte, die zur Eigenschaft "nodeReference" hinzugefügt werden.
         */
        public ListOfNodeReference.Builder<_B> addNodeReference(NodeReference... nodeReference) {
            addNodeReference(Arrays.asList(nodeReference));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeReference" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodeReference
         *     Neuer Wert der Eigenschaft "nodeReference".
         */
        public ListOfNodeReference.Builder<_B> withNodeReference(NodeReference... nodeReference) {
            withNodeReference(Arrays.asList(nodeReference));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "NodeReference".
         * Mit {@link org.opcfoundation.ua._2008._02.types.NodeReference.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "NodeReference".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.NodeReference.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public NodeReference.Builder<? extends ListOfNodeReference.Builder<_B>> addNodeReference() {
            if (this.nodeReference == null) {
                this.nodeReference = new ArrayList<NodeReference.Builder<ListOfNodeReference.Builder<_B>>>();
            }
            final NodeReference.Builder<ListOfNodeReference.Builder<_B>> nodeReference_Builder = new NodeReference.Builder<ListOfNodeReference.Builder<_B>>(this, null, false);
            this.nodeReference.add(nodeReference_Builder);
            return nodeReference_Builder;
        }

        @Override
        public ListOfNodeReference build() {
            if (_storedValue == null) {
                return this.init(new ListOfNodeReference());
            } else {
                return ((ListOfNodeReference) _storedValue);
            }
        }

        public ListOfNodeReference.Builder<_B> copyOf(final ListOfNodeReference _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfNodeReference.Builder<_B> copyOf(final ListOfNodeReference.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfNodeReference.Selector<ListOfNodeReference.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfNodeReference.Select _root() {
            return new ListOfNodeReference.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private NodeReference.Selector<TRoot, ListOfNodeReference.Selector<TRoot, TParent>> nodeReference = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeReference!= null) {
                products.put("nodeReference", this.nodeReference.init());
            }
            return products;
        }

        public NodeReference.Selector<TRoot, ListOfNodeReference.Selector<TRoot, TParent>> nodeReference() {
            return ((this.nodeReference == null)?this.nodeReference = new NodeReference.Selector<TRoot, ListOfNodeReference.Selector<TRoot, TParent>>(this._root, this, "nodeReference"):this.nodeReference);
        }

    }

}
