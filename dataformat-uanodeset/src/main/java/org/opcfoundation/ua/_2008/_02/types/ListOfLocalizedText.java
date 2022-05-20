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
 * <p>Java-Klasse für ListOfLocalizedText complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfLocalizedText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalizedText" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfLocalizedText", propOrder = {
    "localizedText"
})
public class ListOfLocalizedText {

    @XmlElement(name = "LocalizedText", nillable = true)
    protected List<LocalizedText> localizedText;

    /**
     * Gets the value of the localizedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedText }
     * 
     * 
     */
    public List<LocalizedText> getLocalizedText() {
        if (localizedText == null) {
            localizedText = new ArrayList<LocalizedText>();
        }
        return this.localizedText;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfLocalizedText.Builder<_B> _other) {
        if (this.localizedText == null) {
            _other.localizedText = null;
        } else {
            _other.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
            for (LocalizedText _item: this.localizedText) {
                _other.localizedText.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfLocalizedText.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfLocalizedText.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfLocalizedText.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfLocalizedText.Builder<Void> builder() {
        return new ListOfLocalizedText.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfLocalizedText.Builder<_B> copyOf(final ListOfLocalizedText _other) {
        final ListOfLocalizedText.Builder<_B> _newBuilder = new ListOfLocalizedText.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfLocalizedText.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree localizedTextPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localizedText"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localizedTextPropertyTree!= null):((localizedTextPropertyTree == null)||(!localizedTextPropertyTree.isLeaf())))) {
            if (this.localizedText == null) {
                _other.localizedText = null;
            } else {
                _other.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
                for (LocalizedText _item: this.localizedText) {
                    _other.localizedText.add(((_item == null)?null:_item.newCopyBuilder(_other, localizedTextPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfLocalizedText.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfLocalizedText.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfLocalizedText.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfLocalizedText.Builder<_B> copyOf(final ListOfLocalizedText _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfLocalizedText.Builder<_B> _newBuilder = new ListOfLocalizedText.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfLocalizedText.Builder<Void> copyExcept(final ListOfLocalizedText _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfLocalizedText.Builder<Void> copyOnly(final ListOfLocalizedText _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfLocalizedText _storedValue;
        private List<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>> localizedText;

        public Builder(final _B _parentBuilder, final ListOfLocalizedText _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.localizedText == null) {
                        this.localizedText = null;
                    } else {
                        this.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
                        for (LocalizedText _item: _other.localizedText) {
                            this.localizedText.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfLocalizedText _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree localizedTextPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localizedText"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localizedTextPropertyTree!= null):((localizedTextPropertyTree == null)||(!localizedTextPropertyTree.isLeaf())))) {
                        if (_other.localizedText == null) {
                            this.localizedText = null;
                        } else {
                            this.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
                            for (LocalizedText _item: _other.localizedText) {
                                this.localizedText.add(((_item == null)?null:_item.newCopyBuilder(this, localizedTextPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfLocalizedText >_P init(final _P _product) {
            if (this.localizedText!= null) {
                final List<LocalizedText> localizedText = new ArrayList<LocalizedText>(this.localizedText.size());
                for (LocalizedText.Builder<ListOfLocalizedText.Builder<_B>> _item: this.localizedText) {
                    localizedText.add(_item.build());
                }
                _product.localizedText = localizedText;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "localizedText" hinzu.
         * 
         * @param localizedText
         *     Werte, die zur Eigenschaft "localizedText" hinzugefügt werden.
         */
        public ListOfLocalizedText.Builder<_B> addLocalizedText(final Iterable<? extends LocalizedText> localizedText) {
            if (localizedText!= null) {
                if (this.localizedText == null) {
                    this.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
                }
                for (LocalizedText _item: localizedText) {
                    this.localizedText.add(new LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localizedText" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param localizedText
         *     Neuer Wert der Eigenschaft "localizedText".
         */
        public ListOfLocalizedText.Builder<_B> withLocalizedText(final Iterable<? extends LocalizedText> localizedText) {
            if (this.localizedText!= null) {
                this.localizedText.clear();
            }
            return addLocalizedText(localizedText);
        }

        /**
         * Fügt Werte zur Eigenschaft "localizedText" hinzu.
         * 
         * @param localizedText
         *     Werte, die zur Eigenschaft "localizedText" hinzugefügt werden.
         */
        public ListOfLocalizedText.Builder<_B> addLocalizedText(LocalizedText... localizedText) {
            addLocalizedText(Arrays.asList(localizedText));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localizedText" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param localizedText
         *     Neuer Wert der Eigenschaft "localizedText".
         */
        public ListOfLocalizedText.Builder<_B> withLocalizedText(LocalizedText... localizedText) {
            withLocalizedText(Arrays.asList(localizedText));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "LocalizedText".
         * Mit {@link org.opcfoundation.ua._2008._02.types.LocalizedText.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "LocalizedText".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.LocalizedText.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public LocalizedText.Builder<? extends ListOfLocalizedText.Builder<_B>> addLocalizedText() {
            if (this.localizedText == null) {
                this.localizedText = new ArrayList<LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>>();
            }
            final LocalizedText.Builder<ListOfLocalizedText.Builder<_B>> localizedText_Builder = new LocalizedText.Builder<ListOfLocalizedText.Builder<_B>>(this, null, false);
            this.localizedText.add(localizedText_Builder);
            return localizedText_Builder;
        }

        @Override
        public ListOfLocalizedText build() {
            if (_storedValue == null) {
                return this.init(new ListOfLocalizedText());
            } else {
                return ((ListOfLocalizedText) _storedValue);
            }
        }

        public ListOfLocalizedText.Builder<_B> copyOf(final ListOfLocalizedText _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfLocalizedText.Builder<_B> copyOf(final ListOfLocalizedText.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfLocalizedText.Selector<ListOfLocalizedText.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfLocalizedText.Select _root() {
            return new ListOfLocalizedText.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private LocalizedText.Selector<TRoot, ListOfLocalizedText.Selector<TRoot, TParent>> localizedText = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.localizedText!= null) {
                products.put("localizedText", this.localizedText.init());
            }
            return products;
        }

        public LocalizedText.Selector<TRoot, ListOfLocalizedText.Selector<TRoot, TParent>> localizedText() {
            return ((this.localizedText == null)?this.localizedText = new LocalizedText.Selector<TRoot, ListOfLocalizedText.Selector<TRoot, TParent>>(this._root, this, "localizedText"):this.localizedText);
        }

    }

}
