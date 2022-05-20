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
 * <p>Java-Klasse für ListOfVariant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfVariant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Variant" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfVariant", propOrder = {
    "variant"
})
public class ListOfVariant {

    @XmlElement(name = "Variant")
    protected List<Variant> variant;

    /**
     * Gets the value of the variant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variant }
     * 
     * 
     */
    public List<Variant> getVariant() {
        if (variant == null) {
            variant = new ArrayList<Variant>();
        }
        return this.variant;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfVariant.Builder<_B> _other) {
        if (this.variant == null) {
            _other.variant = null;
        } else {
            _other.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
            for (Variant _item: this.variant) {
                _other.variant.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfVariant.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfVariant.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfVariant.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfVariant.Builder<Void> builder() {
        return new ListOfVariant.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfVariant.Builder<_B> copyOf(final ListOfVariant _other) {
        final ListOfVariant.Builder<_B> _newBuilder = new ListOfVariant.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfVariant.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree variantPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("variant"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(variantPropertyTree!= null):((variantPropertyTree == null)||(!variantPropertyTree.isLeaf())))) {
            if (this.variant == null) {
                _other.variant = null;
            } else {
                _other.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
                for (Variant _item: this.variant) {
                    _other.variant.add(((_item == null)?null:_item.newCopyBuilder(_other, variantPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfVariant.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfVariant.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfVariant.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfVariant.Builder<_B> copyOf(final ListOfVariant _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfVariant.Builder<_B> _newBuilder = new ListOfVariant.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfVariant.Builder<Void> copyExcept(final ListOfVariant _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfVariant.Builder<Void> copyOnly(final ListOfVariant _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfVariant _storedValue;
        private List<Variant.Builder<ListOfVariant.Builder<_B>>> variant;

        public Builder(final _B _parentBuilder, final ListOfVariant _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.variant == null) {
                        this.variant = null;
                    } else {
                        this.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
                        for (Variant _item: _other.variant) {
                            this.variant.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfVariant _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree variantPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("variant"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(variantPropertyTree!= null):((variantPropertyTree == null)||(!variantPropertyTree.isLeaf())))) {
                        if (_other.variant == null) {
                            this.variant = null;
                        } else {
                            this.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
                            for (Variant _item: _other.variant) {
                                this.variant.add(((_item == null)?null:_item.newCopyBuilder(this, variantPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfVariant >_P init(final _P _product) {
            if (this.variant!= null) {
                final List<Variant> variant = new ArrayList<Variant>(this.variant.size());
                for (Variant.Builder<ListOfVariant.Builder<_B>> _item: this.variant) {
                    variant.add(_item.build());
                }
                _product.variant = variant;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "variant" hinzu.
         * 
         * @param variant
         *     Werte, die zur Eigenschaft "variant" hinzugefügt werden.
         */
        public ListOfVariant.Builder<_B> addVariant(final Iterable<? extends Variant> variant) {
            if (variant!= null) {
                if (this.variant == null) {
                    this.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
                }
                for (Variant _item: variant) {
                    this.variant.add(new Variant.Builder<ListOfVariant.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "variant" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param variant
         *     Neuer Wert der Eigenschaft "variant".
         */
        public ListOfVariant.Builder<_B> withVariant(final Iterable<? extends Variant> variant) {
            if (this.variant!= null) {
                this.variant.clear();
            }
            return addVariant(variant);
        }

        /**
         * Fügt Werte zur Eigenschaft "variant" hinzu.
         * 
         * @param variant
         *     Werte, die zur Eigenschaft "variant" hinzugefügt werden.
         */
        public ListOfVariant.Builder<_B> addVariant(Variant... variant) {
            addVariant(Arrays.asList(variant));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "variant" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param variant
         *     Neuer Wert der Eigenschaft "variant".
         */
        public ListOfVariant.Builder<_B> withVariant(Variant... variant) {
            withVariant(Arrays.asList(variant));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Variant".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Variant".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends ListOfVariant.Builder<_B>> addVariant() {
            if (this.variant == null) {
                this.variant = new ArrayList<Variant.Builder<ListOfVariant.Builder<_B>>>();
            }
            final Variant.Builder<ListOfVariant.Builder<_B>> variant_Builder = new Variant.Builder<ListOfVariant.Builder<_B>>(this, null, false);
            this.variant.add(variant_Builder);
            return variant_Builder;
        }

        @Override
        public ListOfVariant build() {
            if (_storedValue == null) {
                return this.init(new ListOfVariant());
            } else {
                return ((ListOfVariant) _storedValue);
            }
        }

        public ListOfVariant.Builder<_B> copyOf(final ListOfVariant _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfVariant.Builder<_B> copyOf(final ListOfVariant.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfVariant.Selector<ListOfVariant.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfVariant.Select _root() {
            return new ListOfVariant.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Variant.Selector<TRoot, ListOfVariant.Selector<TRoot, TParent>> variant = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.variant!= null) {
                products.put("variant", this.variant.init());
            }
            return products;
        }

        public Variant.Selector<TRoot, ListOfVariant.Selector<TRoot, TParent>> variant() {
            return ((this.variant == null)?this.variant = new Variant.Selector<TRoot, ListOfVariant.Selector<TRoot, TParent>>(this._root, this, "variant"):this.variant);
        }

    }

}
