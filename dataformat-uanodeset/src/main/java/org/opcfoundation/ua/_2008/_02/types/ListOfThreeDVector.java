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
 * <p>Java-Klasse für ListOfThreeDVector complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfThreeDVector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThreeDVector" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ThreeDVector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfThreeDVector", propOrder = {
    "threeDVector"
})
public class ListOfThreeDVector {

    @XmlElement(name = "ThreeDVector", nillable = true)
    protected List<ThreeDVector> threeDVector;

    /**
     * Gets the value of the threeDVector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDVector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDVector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDVector }
     * 
     * 
     */
    public List<ThreeDVector> getThreeDVector() {
        if (threeDVector == null) {
            threeDVector = new ArrayList<ThreeDVector>();
        }
        return this.threeDVector;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfThreeDVector.Builder<_B> _other) {
        if (this.threeDVector == null) {
            _other.threeDVector = null;
        } else {
            _other.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
            for (ThreeDVector _item: this.threeDVector) {
                _other.threeDVector.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfThreeDVector.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfThreeDVector.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfThreeDVector.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfThreeDVector.Builder<Void> builder() {
        return new ListOfThreeDVector.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfThreeDVector.Builder<_B> copyOf(final ListOfThreeDVector _other) {
        final ListOfThreeDVector.Builder<_B> _newBuilder = new ListOfThreeDVector.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfThreeDVector.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree threeDVectorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDVector"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDVectorPropertyTree!= null):((threeDVectorPropertyTree == null)||(!threeDVectorPropertyTree.isLeaf())))) {
            if (this.threeDVector == null) {
                _other.threeDVector = null;
            } else {
                _other.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
                for (ThreeDVector _item: this.threeDVector) {
                    _other.threeDVector.add(((_item == null)?null:_item.newCopyBuilder(_other, threeDVectorPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfThreeDVector.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfThreeDVector.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfThreeDVector.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfThreeDVector.Builder<_B> copyOf(final ListOfThreeDVector _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfThreeDVector.Builder<_B> _newBuilder = new ListOfThreeDVector.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfThreeDVector.Builder<Void> copyExcept(final ListOfThreeDVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfThreeDVector.Builder<Void> copyOnly(final ListOfThreeDVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfThreeDVector _storedValue;
        private List<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>> threeDVector;

        public Builder(final _B _parentBuilder, final ListOfThreeDVector _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.threeDVector == null) {
                        this.threeDVector = null;
                    } else {
                        this.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
                        for (ThreeDVector _item: _other.threeDVector) {
                            this.threeDVector.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfThreeDVector _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree threeDVectorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDVector"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDVectorPropertyTree!= null):((threeDVectorPropertyTree == null)||(!threeDVectorPropertyTree.isLeaf())))) {
                        if (_other.threeDVector == null) {
                            this.threeDVector = null;
                        } else {
                            this.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
                            for (ThreeDVector _item: _other.threeDVector) {
                                this.threeDVector.add(((_item == null)?null:_item.newCopyBuilder(this, threeDVectorPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfThreeDVector >_P init(final _P _product) {
            if (this.threeDVector!= null) {
                final List<ThreeDVector> threeDVector = new ArrayList<ThreeDVector>(this.threeDVector.size());
                for (ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>> _item: this.threeDVector) {
                    threeDVector.add(_item.build());
                }
                _product.threeDVector = threeDVector;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDVector" hinzu.
         * 
         * @param threeDVector
         *     Werte, die zur Eigenschaft "threeDVector" hinzugefügt werden.
         */
        public ListOfThreeDVector.Builder<_B> addThreeDVector(final Iterable<? extends ThreeDVector> threeDVector) {
            if (threeDVector!= null) {
                if (this.threeDVector == null) {
                    this.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
                }
                for (ThreeDVector _item: threeDVector) {
                    this.threeDVector.add(new ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDVector" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param threeDVector
         *     Neuer Wert der Eigenschaft "threeDVector".
         */
        public ListOfThreeDVector.Builder<_B> withThreeDVector(final Iterable<? extends ThreeDVector> threeDVector) {
            if (this.threeDVector!= null) {
                this.threeDVector.clear();
            }
            return addThreeDVector(threeDVector);
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDVector" hinzu.
         * 
         * @param threeDVector
         *     Werte, die zur Eigenschaft "threeDVector" hinzugefügt werden.
         */
        public ListOfThreeDVector.Builder<_B> addThreeDVector(ThreeDVector... threeDVector) {
            addThreeDVector(Arrays.asList(threeDVector));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDVector" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param threeDVector
         *     Neuer Wert der Eigenschaft "threeDVector".
         */
        public ListOfThreeDVector.Builder<_B> withThreeDVector(ThreeDVector... threeDVector) {
            withThreeDVector(Arrays.asList(threeDVector));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ThreeDVector".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ThreeDVector.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ThreeDVector".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ThreeDVector.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public ThreeDVector.Builder<? extends ListOfThreeDVector.Builder<_B>> addThreeDVector() {
            if (this.threeDVector == null) {
                this.threeDVector = new ArrayList<ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>>();
            }
            final ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>> threeDVector_Builder = new ThreeDVector.Builder<ListOfThreeDVector.Builder<_B>>(this, null, false);
            this.threeDVector.add(threeDVector_Builder);
            return threeDVector_Builder;
        }

        @Override
        public ListOfThreeDVector build() {
            if (_storedValue == null) {
                return this.init(new ListOfThreeDVector());
            } else {
                return ((ListOfThreeDVector) _storedValue);
            }
        }

        public ListOfThreeDVector.Builder<_B> copyOf(final ListOfThreeDVector _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfThreeDVector.Builder<_B> copyOf(final ListOfThreeDVector.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfThreeDVector.Selector<ListOfThreeDVector.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfThreeDVector.Select _root() {
            return new ListOfThreeDVector.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ThreeDVector.Selector<TRoot, ListOfThreeDVector.Selector<TRoot, TParent>> threeDVector = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.threeDVector!= null) {
                products.put("threeDVector", this.threeDVector.init());
            }
            return products;
        }

        public ThreeDVector.Selector<TRoot, ListOfThreeDVector.Selector<TRoot, TParent>> threeDVector() {
            return ((this.threeDVector == null)?this.threeDVector = new ThreeDVector.Selector<TRoot, ListOfThreeDVector.Selector<TRoot, TParent>>(this._root, this, "threeDVector"):this.threeDVector);
        }

    }

}
