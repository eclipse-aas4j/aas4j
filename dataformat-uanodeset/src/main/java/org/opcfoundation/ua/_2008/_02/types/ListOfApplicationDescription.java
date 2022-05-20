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
 * <p>Java-Klasse für ListOfApplicationDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfApplicationDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfApplicationDescription", propOrder = {
    "applicationDescription"
})
public class ListOfApplicationDescription {

    @XmlElement(name = "ApplicationDescription", nillable = true)
    protected List<ApplicationDescription> applicationDescription;

    /**
     * Gets the value of the applicationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationDescription }
     * 
     * 
     */
    public List<ApplicationDescription> getApplicationDescription() {
        if (applicationDescription == null) {
            applicationDescription = new ArrayList<ApplicationDescription>();
        }
        return this.applicationDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfApplicationDescription.Builder<_B> _other) {
        if (this.applicationDescription == null) {
            _other.applicationDescription = null;
        } else {
            _other.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
            for (ApplicationDescription _item: this.applicationDescription) {
                _other.applicationDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfApplicationDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfApplicationDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfApplicationDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfApplicationDescription.Builder<Void> builder() {
        return new ListOfApplicationDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfApplicationDescription.Builder<_B> copyOf(final ListOfApplicationDescription _other) {
        final ListOfApplicationDescription.Builder<_B> _newBuilder = new ListOfApplicationDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfApplicationDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree applicationDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationDescriptionPropertyTree!= null):((applicationDescriptionPropertyTree == null)||(!applicationDescriptionPropertyTree.isLeaf())))) {
            if (this.applicationDescription == null) {
                _other.applicationDescription = null;
            } else {
                _other.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
                for (ApplicationDescription _item: this.applicationDescription) {
                    _other.applicationDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, applicationDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfApplicationDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfApplicationDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfApplicationDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfApplicationDescription.Builder<_B> copyOf(final ListOfApplicationDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfApplicationDescription.Builder<_B> _newBuilder = new ListOfApplicationDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfApplicationDescription.Builder<Void> copyExcept(final ListOfApplicationDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfApplicationDescription.Builder<Void> copyOnly(final ListOfApplicationDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfApplicationDescription _storedValue;
        private List<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>> applicationDescription;

        public Builder(final _B _parentBuilder, final ListOfApplicationDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.applicationDescription == null) {
                        this.applicationDescription = null;
                    } else {
                        this.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
                        for (ApplicationDescription _item: _other.applicationDescription) {
                            this.applicationDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfApplicationDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree applicationDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationDescriptionPropertyTree!= null):((applicationDescriptionPropertyTree == null)||(!applicationDescriptionPropertyTree.isLeaf())))) {
                        if (_other.applicationDescription == null) {
                            this.applicationDescription = null;
                        } else {
                            this.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
                            for (ApplicationDescription _item: _other.applicationDescription) {
                                this.applicationDescription.add(((_item == null)?null:_item.newCopyBuilder(this, applicationDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfApplicationDescription >_P init(final _P _product) {
            if (this.applicationDescription!= null) {
                final List<ApplicationDescription> applicationDescription = new ArrayList<ApplicationDescription>(this.applicationDescription.size());
                for (ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>> _item: this.applicationDescription) {
                    applicationDescription.add(_item.build());
                }
                _product.applicationDescription = applicationDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "applicationDescription" hinzu.
         * 
         * @param applicationDescription
         *     Werte, die zur Eigenschaft "applicationDescription" hinzugefügt werden.
         */
        public ListOfApplicationDescription.Builder<_B> addApplicationDescription(final Iterable<? extends ApplicationDescription> applicationDescription) {
            if (applicationDescription!= null) {
                if (this.applicationDescription == null) {
                    this.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
                }
                for (ApplicationDescription _item: applicationDescription) {
                    this.applicationDescription.add(new ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "applicationDescription" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param applicationDescription
         *     Neuer Wert der Eigenschaft "applicationDescription".
         */
        public ListOfApplicationDescription.Builder<_B> withApplicationDescription(final Iterable<? extends ApplicationDescription> applicationDescription) {
            if (this.applicationDescription!= null) {
                this.applicationDescription.clear();
            }
            return addApplicationDescription(applicationDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "applicationDescription" hinzu.
         * 
         * @param applicationDescription
         *     Werte, die zur Eigenschaft "applicationDescription" hinzugefügt werden.
         */
        public ListOfApplicationDescription.Builder<_B> addApplicationDescription(ApplicationDescription... applicationDescription) {
            addApplicationDescription(Arrays.asList(applicationDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "applicationDescription" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param applicationDescription
         *     Neuer Wert der Eigenschaft "applicationDescription".
         */
        public ListOfApplicationDescription.Builder<_B> withApplicationDescription(ApplicationDescription... applicationDescription) {
            withApplicationDescription(Arrays.asList(applicationDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ApplicationDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ApplicationDescription.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ApplicationDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ApplicationDescription.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public ApplicationDescription.Builder<? extends ListOfApplicationDescription.Builder<_B>> addApplicationDescription() {
            if (this.applicationDescription == null) {
                this.applicationDescription = new ArrayList<ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>>();
            }
            final ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>> applicationDescription_Builder = new ApplicationDescription.Builder<ListOfApplicationDescription.Builder<_B>>(this, null, false);
            this.applicationDescription.add(applicationDescription_Builder);
            return applicationDescription_Builder;
        }

        @Override
        public ListOfApplicationDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfApplicationDescription());
            } else {
                return ((ListOfApplicationDescription) _storedValue);
            }
        }

        public ListOfApplicationDescription.Builder<_B> copyOf(final ListOfApplicationDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfApplicationDescription.Builder<_B> copyOf(final ListOfApplicationDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfApplicationDescription.Selector<ListOfApplicationDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfApplicationDescription.Select _root() {
            return new ListOfApplicationDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ApplicationDescription.Selector<TRoot, ListOfApplicationDescription.Selector<TRoot, TParent>> applicationDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.applicationDescription!= null) {
                products.put("applicationDescription", this.applicationDescription.init());
            }
            return products;
        }

        public ApplicationDescription.Selector<TRoot, ListOfApplicationDescription.Selector<TRoot, TParent>> applicationDescription() {
            return ((this.applicationDescription == null)?this.applicationDescription = new ApplicationDescription.Selector<TRoot, ListOfApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "applicationDescription"):this.applicationDescription);
        }

    }

}
