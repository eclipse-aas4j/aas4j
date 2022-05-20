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
 * <p>Java-Klasse für ListOfRelativePathElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfRelativePathElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelativePathElement" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RelativePathElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRelativePathElement", propOrder = {
    "relativePathElement"
})
public class ListOfRelativePathElement {

    @XmlElement(name = "RelativePathElement", nillable = true)
    protected List<RelativePathElement> relativePathElement;

    /**
     * Gets the value of the relativePathElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativePathElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativePathElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativePathElement }
     * 
     * 
     */
    public List<RelativePathElement> getRelativePathElement() {
        if (relativePathElement == null) {
            relativePathElement = new ArrayList<RelativePathElement>();
        }
        return this.relativePathElement;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfRelativePathElement.Builder<_B> _other) {
        if (this.relativePathElement == null) {
            _other.relativePathElement = null;
        } else {
            _other.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
            for (RelativePathElement _item: this.relativePathElement) {
                _other.relativePathElement.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfRelativePathElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfRelativePathElement.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfRelativePathElement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfRelativePathElement.Builder<Void> builder() {
        return new ListOfRelativePathElement.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfRelativePathElement.Builder<_B> copyOf(final ListOfRelativePathElement _other) {
        final ListOfRelativePathElement.Builder<_B> _newBuilder = new ListOfRelativePathElement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfRelativePathElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree relativePathElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePathElement"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathElementPropertyTree!= null):((relativePathElementPropertyTree == null)||(!relativePathElementPropertyTree.isLeaf())))) {
            if (this.relativePathElement == null) {
                _other.relativePathElement = null;
            } else {
                _other.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
                for (RelativePathElement _item: this.relativePathElement) {
                    _other.relativePathElement.add(((_item == null)?null:_item.newCopyBuilder(_other, relativePathElementPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfRelativePathElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfRelativePathElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfRelativePathElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfRelativePathElement.Builder<_B> copyOf(final ListOfRelativePathElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfRelativePathElement.Builder<_B> _newBuilder = new ListOfRelativePathElement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfRelativePathElement.Builder<Void> copyExcept(final ListOfRelativePathElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfRelativePathElement.Builder<Void> copyOnly(final ListOfRelativePathElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfRelativePathElement _storedValue;
        private List<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>> relativePathElement;

        public Builder(final _B _parentBuilder, final ListOfRelativePathElement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.relativePathElement == null) {
                        this.relativePathElement = null;
                    } else {
                        this.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
                        for (RelativePathElement _item: _other.relativePathElement) {
                            this.relativePathElement.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfRelativePathElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree relativePathElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePathElement"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathElementPropertyTree!= null):((relativePathElementPropertyTree == null)||(!relativePathElementPropertyTree.isLeaf())))) {
                        if (_other.relativePathElement == null) {
                            this.relativePathElement = null;
                        } else {
                            this.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
                            for (RelativePathElement _item: _other.relativePathElement) {
                                this.relativePathElement.add(((_item == null)?null:_item.newCopyBuilder(this, relativePathElementPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfRelativePathElement >_P init(final _P _product) {
            if (this.relativePathElement!= null) {
                final List<RelativePathElement> relativePathElement = new ArrayList<RelativePathElement>(this.relativePathElement.size());
                for (RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>> _item: this.relativePathElement) {
                    relativePathElement.add(_item.build());
                }
                _product.relativePathElement = relativePathElement;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "relativePathElement" hinzu.
         * 
         * @param relativePathElement
         *     Werte, die zur Eigenschaft "relativePathElement" hinzugefügt werden.
         */
        public ListOfRelativePathElement.Builder<_B> addRelativePathElement(final Iterable<? extends RelativePathElement> relativePathElement) {
            if (relativePathElement!= null) {
                if (this.relativePathElement == null) {
                    this.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
                }
                for (RelativePathElement _item: relativePathElement) {
                    this.relativePathElement.add(new RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "relativePathElement" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param relativePathElement
         *     Neuer Wert der Eigenschaft "relativePathElement".
         */
        public ListOfRelativePathElement.Builder<_B> withRelativePathElement(final Iterable<? extends RelativePathElement> relativePathElement) {
            if (this.relativePathElement!= null) {
                this.relativePathElement.clear();
            }
            return addRelativePathElement(relativePathElement);
        }

        /**
         * Fügt Werte zur Eigenschaft "relativePathElement" hinzu.
         * 
         * @param relativePathElement
         *     Werte, die zur Eigenschaft "relativePathElement" hinzugefügt werden.
         */
        public ListOfRelativePathElement.Builder<_B> addRelativePathElement(RelativePathElement... relativePathElement) {
            addRelativePathElement(Arrays.asList(relativePathElement));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "relativePathElement" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param relativePathElement
         *     Neuer Wert der Eigenschaft "relativePathElement".
         */
        public ListOfRelativePathElement.Builder<_B> withRelativePathElement(RelativePathElement... relativePathElement) {
            withRelativePathElement(Arrays.asList(relativePathElement));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "RelativePathElement".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.RelativePathElement.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "RelativePathElement".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.RelativePathElement.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public RelativePathElement.Builder<? extends ListOfRelativePathElement.Builder<_B>> addRelativePathElement() {
            if (this.relativePathElement == null) {
                this.relativePathElement = new ArrayList<RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>>();
            }
            final RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>> relativePathElement_Builder = new RelativePathElement.Builder<ListOfRelativePathElement.Builder<_B>>(this, null, false);
            this.relativePathElement.add(relativePathElement_Builder);
            return relativePathElement_Builder;
        }

        @Override
        public ListOfRelativePathElement build() {
            if (_storedValue == null) {
                return this.init(new ListOfRelativePathElement());
            } else {
                return ((ListOfRelativePathElement) _storedValue);
            }
        }

        public ListOfRelativePathElement.Builder<_B> copyOf(final ListOfRelativePathElement _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfRelativePathElement.Builder<_B> copyOf(final ListOfRelativePathElement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfRelativePathElement.Selector<ListOfRelativePathElement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfRelativePathElement.Select _root() {
            return new ListOfRelativePathElement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private RelativePathElement.Selector<TRoot, ListOfRelativePathElement.Selector<TRoot, TParent>> relativePathElement = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.relativePathElement!= null) {
                products.put("relativePathElement", this.relativePathElement.init());
            }
            return products;
        }

        public RelativePathElement.Selector<TRoot, ListOfRelativePathElement.Selector<TRoot, TParent>> relativePathElement() {
            return ((this.relativePathElement == null)?this.relativePathElement = new RelativePathElement.Selector<TRoot, ListOfRelativePathElement.Selector<TRoot, TParent>>(this._root, this, "relativePathElement"):this.relativePathElement);
        }

    }

}
