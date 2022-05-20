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
 * <p>Java-Klasse für ListOfReferenceDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReferenceDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReferenceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReferenceDescription", propOrder = {
    "referenceDescription"
})
public class ListOfReferenceDescription {

    @XmlElement(name = "ReferenceDescription", nillable = true)
    protected List<ReferenceDescription> referenceDescription;

    /**
     * Gets the value of the referenceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceDescription }
     * 
     * 
     */
    public List<ReferenceDescription> getReferenceDescription() {
        if (referenceDescription == null) {
            referenceDescription = new ArrayList<ReferenceDescription>();
        }
        return this.referenceDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReferenceDescription.Builder<_B> _other) {
        if (this.referenceDescription == null) {
            _other.referenceDescription = null;
        } else {
            _other.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
            for (ReferenceDescription _item: this.referenceDescription) {
                _other.referenceDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReferenceDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReferenceDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReferenceDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReferenceDescription.Builder<Void> builder() {
        return new ListOfReferenceDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReferenceDescription.Builder<_B> copyOf(final ListOfReferenceDescription _other) {
        final ListOfReferenceDescription.Builder<_B> _newBuilder = new ListOfReferenceDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReferenceDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree referenceDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceDescriptionPropertyTree!= null):((referenceDescriptionPropertyTree == null)||(!referenceDescriptionPropertyTree.isLeaf())))) {
            if (this.referenceDescription == null) {
                _other.referenceDescription = null;
            } else {
                _other.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
                for (ReferenceDescription _item: this.referenceDescription) {
                    _other.referenceDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, referenceDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReferenceDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReferenceDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReferenceDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReferenceDescription.Builder<_B> copyOf(final ListOfReferenceDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReferenceDescription.Builder<_B> _newBuilder = new ListOfReferenceDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReferenceDescription.Builder<Void> copyExcept(final ListOfReferenceDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReferenceDescription.Builder<Void> copyOnly(final ListOfReferenceDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReferenceDescription _storedValue;
        private List<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>> referenceDescription;

        public Builder(final _B _parentBuilder, final ListOfReferenceDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.referenceDescription == null) {
                        this.referenceDescription = null;
                    } else {
                        this.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
                        for (ReferenceDescription _item: _other.referenceDescription) {
                            this.referenceDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReferenceDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree referenceDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceDescriptionPropertyTree!= null):((referenceDescriptionPropertyTree == null)||(!referenceDescriptionPropertyTree.isLeaf())))) {
                        if (_other.referenceDescription == null) {
                            this.referenceDescription = null;
                        } else {
                            this.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
                            for (ReferenceDescription _item: _other.referenceDescription) {
                                this.referenceDescription.add(((_item == null)?null:_item.newCopyBuilder(this, referenceDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReferenceDescription >_P init(final _P _product) {
            if (this.referenceDescription!= null) {
                final List<ReferenceDescription> referenceDescription = new ArrayList<ReferenceDescription>(this.referenceDescription.size());
                for (ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>> _item: this.referenceDescription) {
                    referenceDescription.add(_item.build());
                }
                _product.referenceDescription = referenceDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "referenceDescription" hinzu.
         * 
         * @param referenceDescription
         *     Werte, die zur Eigenschaft "referenceDescription" hinzugefügt werden.
         */
        public ListOfReferenceDescription.Builder<_B> addReferenceDescription(final Iterable<? extends ReferenceDescription> referenceDescription) {
            if (referenceDescription!= null) {
                if (this.referenceDescription == null) {
                    this.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
                }
                for (ReferenceDescription _item: referenceDescription) {
                    this.referenceDescription.add(new ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param referenceDescription
         *     Neuer Wert der Eigenschaft "referenceDescription".
         */
        public ListOfReferenceDescription.Builder<_B> withReferenceDescription(final Iterable<? extends ReferenceDescription> referenceDescription) {
            if (this.referenceDescription!= null) {
                this.referenceDescription.clear();
            }
            return addReferenceDescription(referenceDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "referenceDescription" hinzu.
         * 
         * @param referenceDescription
         *     Werte, die zur Eigenschaft "referenceDescription" hinzugefügt werden.
         */
        public ListOfReferenceDescription.Builder<_B> addReferenceDescription(ReferenceDescription... referenceDescription) {
            addReferenceDescription(Arrays.asList(referenceDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param referenceDescription
         *     Neuer Wert der Eigenschaft "referenceDescription".
         */
        public ListOfReferenceDescription.Builder<_B> withReferenceDescription(ReferenceDescription... referenceDescription) {
            withReferenceDescription(Arrays.asList(referenceDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReferenceDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ReferenceDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReferenceDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ReferenceDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public ReferenceDescription.Builder<? extends ListOfReferenceDescription.Builder<_B>> addReferenceDescription() {
            if (this.referenceDescription == null) {
                this.referenceDescription = new ArrayList<ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>>();
            }
            final ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>> referenceDescription_Builder = new ReferenceDescription.Builder<ListOfReferenceDescription.Builder<_B>>(this, null, false);
            this.referenceDescription.add(referenceDescription_Builder);
            return referenceDescription_Builder;
        }

        @Override
        public ListOfReferenceDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfReferenceDescription());
            } else {
                return ((ListOfReferenceDescription) _storedValue);
            }
        }

        public ListOfReferenceDescription.Builder<_B> copyOf(final ListOfReferenceDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReferenceDescription.Builder<_B> copyOf(final ListOfReferenceDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReferenceDescription.Selector<ListOfReferenceDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReferenceDescription.Select _root() {
            return new ListOfReferenceDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReferenceDescription.Selector<TRoot, ListOfReferenceDescription.Selector<TRoot, TParent>> referenceDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.referenceDescription!= null) {
                products.put("referenceDescription", this.referenceDescription.init());
            }
            return products;
        }

        public ReferenceDescription.Selector<TRoot, ListOfReferenceDescription.Selector<TRoot, TParent>> referenceDescription() {
            return ((this.referenceDescription == null)?this.referenceDescription = new ReferenceDescription.Selector<TRoot, ListOfReferenceDescription.Selector<TRoot, TParent>>(this._root, this, "referenceDescription"):this.referenceDescription);
        }

    }

}
