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
 * <p>Java-Klasse für ListOfArgument complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfArgument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Argument" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Argument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfArgument", propOrder = {
    "argument"
})
public class ListOfArgument {

    @XmlElement(name = "Argument", nillable = true)
    protected List<Argument> argument;

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Argument }
     * 
     * 
     */
    public List<Argument> getArgument() {
        if (argument == null) {
            argument = new ArrayList<Argument>();
        }
        return this.argument;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfArgument.Builder<_B> _other) {
        if (this.argument == null) {
            _other.argument = null;
        } else {
            _other.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
            for (Argument _item: this.argument) {
                _other.argument.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfArgument.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfArgument.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfArgument.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfArgument.Builder<Void> builder() {
        return new ListOfArgument.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfArgument.Builder<_B> copyOf(final ListOfArgument _other) {
        final ListOfArgument.Builder<_B> _newBuilder = new ListOfArgument.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfArgument.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree argumentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("argument"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(argumentPropertyTree!= null):((argumentPropertyTree == null)||(!argumentPropertyTree.isLeaf())))) {
            if (this.argument == null) {
                _other.argument = null;
            } else {
                _other.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
                for (Argument _item: this.argument) {
                    _other.argument.add(((_item == null)?null:_item.newCopyBuilder(_other, argumentPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfArgument.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfArgument.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfArgument.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfArgument.Builder<_B> copyOf(final ListOfArgument _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfArgument.Builder<_B> _newBuilder = new ListOfArgument.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfArgument.Builder<Void> copyExcept(final ListOfArgument _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfArgument.Builder<Void> copyOnly(final ListOfArgument _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfArgument _storedValue;
        private List<Argument.Builder<ListOfArgument.Builder<_B>>> argument;

        public Builder(final _B _parentBuilder, final ListOfArgument _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.argument == null) {
                        this.argument = null;
                    } else {
                        this.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
                        for (Argument _item: _other.argument) {
                            this.argument.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfArgument _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree argumentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("argument"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(argumentPropertyTree!= null):((argumentPropertyTree == null)||(!argumentPropertyTree.isLeaf())))) {
                        if (_other.argument == null) {
                            this.argument = null;
                        } else {
                            this.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
                            for (Argument _item: _other.argument) {
                                this.argument.add(((_item == null)?null:_item.newCopyBuilder(this, argumentPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfArgument >_P init(final _P _product) {
            if (this.argument!= null) {
                final List<Argument> argument = new ArrayList<Argument>(this.argument.size());
                for (Argument.Builder<ListOfArgument.Builder<_B>> _item: this.argument) {
                    argument.add(_item.build());
                }
                _product.argument = argument;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "argument" hinzu.
         * 
         * @param argument
         *     Werte, die zur Eigenschaft "argument" hinzugefügt werden.
         */
        public ListOfArgument.Builder<_B> addArgument(final Iterable<? extends Argument> argument) {
            if (argument!= null) {
                if (this.argument == null) {
                    this.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
                }
                for (Argument _item: argument) {
                    this.argument.add(new Argument.Builder<ListOfArgument.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "argument" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param argument
         *     Neuer Wert der Eigenschaft "argument".
         */
        public ListOfArgument.Builder<_B> withArgument(final Iterable<? extends Argument> argument) {
            if (this.argument!= null) {
                this.argument.clear();
            }
            return addArgument(argument);
        }

        /**
         * Fügt Werte zur Eigenschaft "argument" hinzu.
         * 
         * @param argument
         *     Werte, die zur Eigenschaft "argument" hinzugefügt werden.
         */
        public ListOfArgument.Builder<_B> addArgument(Argument... argument) {
            addArgument(Arrays.asList(argument));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "argument" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param argument
         *     Neuer Wert der Eigenschaft "argument".
         */
        public ListOfArgument.Builder<_B> withArgument(Argument... argument) {
            withArgument(Arrays.asList(argument));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Argument".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Argument.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Argument".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Argument.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Argument.Builder<? extends ListOfArgument.Builder<_B>> addArgument() {
            if (this.argument == null) {
                this.argument = new ArrayList<Argument.Builder<ListOfArgument.Builder<_B>>>();
            }
            final Argument.Builder<ListOfArgument.Builder<_B>> argument_Builder = new Argument.Builder<ListOfArgument.Builder<_B>>(this, null, false);
            this.argument.add(argument_Builder);
            return argument_Builder;
        }

        @Override
        public ListOfArgument build() {
            if (_storedValue == null) {
                return this.init(new ListOfArgument());
            } else {
                return ((ListOfArgument) _storedValue);
            }
        }

        public ListOfArgument.Builder<_B> copyOf(final ListOfArgument _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfArgument.Builder<_B> copyOf(final ListOfArgument.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfArgument.Selector<ListOfArgument.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfArgument.Select _root() {
            return new ListOfArgument.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Argument.Selector<TRoot, ListOfArgument.Selector<TRoot, TParent>> argument = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.argument!= null) {
                products.put("argument", this.argument.init());
            }
            return products;
        }

        public Argument.Selector<TRoot, ListOfArgument.Selector<TRoot, TParent>> argument() {
            return ((this.argument == null)?this.argument = new Argument.Selector<TRoot, ListOfArgument.Selector<TRoot, TParent>>(this._root, this, "argument"):this.argument);
        }

    }

}
