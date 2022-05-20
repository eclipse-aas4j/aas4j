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
 * <p>Java-Klasse für ListOfReferenceNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReferenceNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceNode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReferenceNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReferenceNode", propOrder = {
    "referenceNode"
})
public class ListOfReferenceNode {

    @XmlElement(name = "ReferenceNode", nillable = true)
    protected List<ReferenceNode> referenceNode;

    /**
     * Gets the value of the referenceNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNode }
     * 
     * 
     */
    public List<ReferenceNode> getReferenceNode() {
        if (referenceNode == null) {
            referenceNode = new ArrayList<ReferenceNode>();
        }
        return this.referenceNode;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReferenceNode.Builder<_B> _other) {
        if (this.referenceNode == null) {
            _other.referenceNode = null;
        } else {
            _other.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
            for (ReferenceNode _item: this.referenceNode) {
                _other.referenceNode.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReferenceNode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReferenceNode.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReferenceNode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReferenceNode.Builder<Void> builder() {
        return new ListOfReferenceNode.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReferenceNode.Builder<_B> copyOf(final ListOfReferenceNode _other) {
        final ListOfReferenceNode.Builder<_B> _newBuilder = new ListOfReferenceNode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReferenceNode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree referenceNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceNodePropertyTree!= null):((referenceNodePropertyTree == null)||(!referenceNodePropertyTree.isLeaf())))) {
            if (this.referenceNode == null) {
                _other.referenceNode = null;
            } else {
                _other.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
                for (ReferenceNode _item: this.referenceNode) {
                    _other.referenceNode.add(((_item == null)?null:_item.newCopyBuilder(_other, referenceNodePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReferenceNode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReferenceNode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReferenceNode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReferenceNode.Builder<_B> copyOf(final ListOfReferenceNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReferenceNode.Builder<_B> _newBuilder = new ListOfReferenceNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReferenceNode.Builder<Void> copyExcept(final ListOfReferenceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReferenceNode.Builder<Void> copyOnly(final ListOfReferenceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReferenceNode _storedValue;
        private List<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>> referenceNode;

        public Builder(final _B _parentBuilder, final ListOfReferenceNode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.referenceNode == null) {
                        this.referenceNode = null;
                    } else {
                        this.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
                        for (ReferenceNode _item: _other.referenceNode) {
                            this.referenceNode.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReferenceNode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree referenceNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceNode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceNodePropertyTree!= null):((referenceNodePropertyTree == null)||(!referenceNodePropertyTree.isLeaf())))) {
                        if (_other.referenceNode == null) {
                            this.referenceNode = null;
                        } else {
                            this.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
                            for (ReferenceNode _item: _other.referenceNode) {
                                this.referenceNode.add(((_item == null)?null:_item.newCopyBuilder(this, referenceNodePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReferenceNode >_P init(final _P _product) {
            if (this.referenceNode!= null) {
                final List<ReferenceNode> referenceNode = new ArrayList<ReferenceNode>(this.referenceNode.size());
                for (ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>> _item: this.referenceNode) {
                    referenceNode.add(_item.build());
                }
                _product.referenceNode = referenceNode;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "referenceNode" hinzu.
         * 
         * @param referenceNode
         *     Werte, die zur Eigenschaft "referenceNode" hinzugefügt werden.
         */
        public ListOfReferenceNode.Builder<_B> addReferenceNode(final Iterable<? extends ReferenceNode> referenceNode) {
            if (referenceNode!= null) {
                if (this.referenceNode == null) {
                    this.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
                }
                for (ReferenceNode _item: referenceNode) {
                    this.referenceNode.add(new ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceNode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceNode
         *     Neuer Wert der Eigenschaft "referenceNode".
         */
        public ListOfReferenceNode.Builder<_B> withReferenceNode(final Iterable<? extends ReferenceNode> referenceNode) {
            if (this.referenceNode!= null) {
                this.referenceNode.clear();
            }
            return addReferenceNode(referenceNode);
        }

        /**
         * Fügt Werte zur Eigenschaft "referenceNode" hinzu.
         * 
         * @param referenceNode
         *     Werte, die zur Eigenschaft "referenceNode" hinzugefügt werden.
         */
        public ListOfReferenceNode.Builder<_B> addReferenceNode(ReferenceNode... referenceNode) {
            addReferenceNode(Arrays.asList(referenceNode));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceNode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceNode
         *     Neuer Wert der Eigenschaft "referenceNode".
         */
        public ListOfReferenceNode.Builder<_B> withReferenceNode(ReferenceNode... referenceNode) {
            withReferenceNode(Arrays.asList(referenceNode));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReferenceNode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ReferenceNode.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReferenceNode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ReferenceNode.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ReferenceNode.Builder<? extends ListOfReferenceNode.Builder<_B>> addReferenceNode() {
            if (this.referenceNode == null) {
                this.referenceNode = new ArrayList<ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>>();
            }
            final ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>> referenceNode_Builder = new ReferenceNode.Builder<ListOfReferenceNode.Builder<_B>>(this, null, false);
            this.referenceNode.add(referenceNode_Builder);
            return referenceNode_Builder;
        }

        @Override
        public ListOfReferenceNode build() {
            if (_storedValue == null) {
                return this.init(new ListOfReferenceNode());
            } else {
                return ((ListOfReferenceNode) _storedValue);
            }
        }

        public ListOfReferenceNode.Builder<_B> copyOf(final ListOfReferenceNode _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReferenceNode.Builder<_B> copyOf(final ListOfReferenceNode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReferenceNode.Selector<ListOfReferenceNode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReferenceNode.Select _root() {
            return new ListOfReferenceNode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReferenceNode.Selector<TRoot, ListOfReferenceNode.Selector<TRoot, TParent>> referenceNode = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.referenceNode!= null) {
                products.put("referenceNode", this.referenceNode.init());
            }
            return products;
        }

        public ReferenceNode.Selector<TRoot, ListOfReferenceNode.Selector<TRoot, TParent>> referenceNode() {
            return ((this.referenceNode == null)?this.referenceNode = new ReferenceNode.Selector<TRoot, ListOfReferenceNode.Selector<TRoot, TParent>>(this._root, this, "referenceNode"):this.referenceNode);
        }

    }

}
