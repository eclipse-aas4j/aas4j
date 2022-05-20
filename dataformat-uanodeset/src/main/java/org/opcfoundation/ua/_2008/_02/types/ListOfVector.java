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
 * <p>Java-Klasse für ListOfVector complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfVector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vector" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Vector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfVector", propOrder = {
    "vector"
})
public class ListOfVector {

    @XmlElement(name = "Vector", nillable = true)
    protected List<Vector> vector;

    /**
     * Gets the value of the vector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vector }
     * 
     * 
     */
    public List<Vector> getVector() {
        if (vector == null) {
            vector = new ArrayList<Vector>();
        }
        return this.vector;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfVector.Builder<_B> _other) {
        if (this.vector == null) {
            _other.vector = null;
        } else {
            _other.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
            for (Vector _item: this.vector) {
                _other.vector.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfVector.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfVector.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfVector.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfVector.Builder<Void> builder() {
        return new ListOfVector.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfVector.Builder<_B> copyOf(final ListOfVector _other) {
        final ListOfVector.Builder<_B> _newBuilder = new ListOfVector.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfVector.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree vectorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("vector"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(vectorPropertyTree!= null):((vectorPropertyTree == null)||(!vectorPropertyTree.isLeaf())))) {
            if (this.vector == null) {
                _other.vector = null;
            } else {
                _other.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
                for (Vector _item: this.vector) {
                    _other.vector.add(((_item == null)?null:_item.newCopyBuilder(_other, vectorPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfVector.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfVector.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfVector.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfVector.Builder<_B> copyOf(final ListOfVector _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfVector.Builder<_B> _newBuilder = new ListOfVector.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfVector.Builder<Void> copyExcept(final ListOfVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfVector.Builder<Void> copyOnly(final ListOfVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfVector _storedValue;
        private List<Vector.Builder<ListOfVector.Builder<_B>>> vector;

        public Builder(final _B _parentBuilder, final ListOfVector _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.vector == null) {
                        this.vector = null;
                    } else {
                        this.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
                        for (Vector _item: _other.vector) {
                            this.vector.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfVector _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree vectorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("vector"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(vectorPropertyTree!= null):((vectorPropertyTree == null)||(!vectorPropertyTree.isLeaf())))) {
                        if (_other.vector == null) {
                            this.vector = null;
                        } else {
                            this.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
                            for (Vector _item: _other.vector) {
                                this.vector.add(((_item == null)?null:_item.newCopyBuilder(this, vectorPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfVector >_P init(final _P _product) {
            if (this.vector!= null) {
                final List<Vector> vector = new ArrayList<Vector>(this.vector.size());
                for (Vector.Builder<ListOfVector.Builder<_B>> _item: this.vector) {
                    vector.add(_item.build());
                }
                _product.vector = vector;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "vector" hinzu.
         * 
         * @param vector
         *     Werte, die zur Eigenschaft "vector" hinzugefügt werden.
         */
        public ListOfVector.Builder<_B> addVector(final Iterable<? extends Vector> vector) {
            if (vector!= null) {
                if (this.vector == null) {
                    this.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
                }
                for (Vector _item: vector) {
                    this.vector.add(new Vector.Builder<ListOfVector.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "vector" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param vector
         *     Neuer Wert der Eigenschaft "vector".
         */
        public ListOfVector.Builder<_B> withVector(final Iterable<? extends Vector> vector) {
            if (this.vector!= null) {
                this.vector.clear();
            }
            return addVector(vector);
        }

        /**
         * Fügt Werte zur Eigenschaft "vector" hinzu.
         * 
         * @param vector
         *     Werte, die zur Eigenschaft "vector" hinzugefügt werden.
         */
        public ListOfVector.Builder<_B> addVector(Vector... vector) {
            addVector(Arrays.asList(vector));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "vector" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param vector
         *     Neuer Wert der Eigenschaft "vector".
         */
        public ListOfVector.Builder<_B> withVector(Vector... vector) {
            withVector(Arrays.asList(vector));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Vector".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Vector.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Vector".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Vector.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Vector.Builder<? extends ListOfVector.Builder<_B>> addVector() {
            if (this.vector == null) {
                this.vector = new ArrayList<Vector.Builder<ListOfVector.Builder<_B>>>();
            }
            final Vector.Builder<ListOfVector.Builder<_B>> vector_Builder = new Vector.Builder<ListOfVector.Builder<_B>>(this, null, false);
            this.vector.add(vector_Builder);
            return vector_Builder;
        }

        @Override
        public ListOfVector build() {
            if (_storedValue == null) {
                return this.init(new ListOfVector());
            } else {
                return ((ListOfVector) _storedValue);
            }
        }

        public ListOfVector.Builder<_B> copyOf(final ListOfVector _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfVector.Builder<_B> copyOf(final ListOfVector.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfVector.Selector<ListOfVector.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfVector.Select _root() {
            return new ListOfVector.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Vector.Selector<TRoot, ListOfVector.Selector<TRoot, TParent>> vector = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.vector!= null) {
                products.put("vector", this.vector.init());
            }
            return products;
        }

        public Vector.Selector<TRoot, ListOfVector.Selector<TRoot, TParent>> vector() {
            return ((this.vector == null)?this.vector = new Vector.Selector<TRoot, ListOfVector.Selector<TRoot, TParent>>(this._root, this, "vector"):this.vector);
        }

    }

}
