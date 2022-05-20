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
 * <p>Java-Klasse für ListOfParsingResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfParsingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParsingResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ParsingResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfParsingResult", propOrder = {
    "parsingResult"
})
public class ListOfParsingResult {

    @XmlElement(name = "ParsingResult", nillable = true)
    protected List<ParsingResult> parsingResult;

    /**
     * Gets the value of the parsingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parsingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParsingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParsingResult }
     * 
     * 
     */
    public List<ParsingResult> getParsingResult() {
        if (parsingResult == null) {
            parsingResult = new ArrayList<ParsingResult>();
        }
        return this.parsingResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfParsingResult.Builder<_B> _other) {
        if (this.parsingResult == null) {
            _other.parsingResult = null;
        } else {
            _other.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
            for (ParsingResult _item: this.parsingResult) {
                _other.parsingResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfParsingResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfParsingResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfParsingResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfParsingResult.Builder<Void> builder() {
        return new ListOfParsingResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfParsingResult.Builder<_B> copyOf(final ListOfParsingResult _other) {
        final ListOfParsingResult.Builder<_B> _newBuilder = new ListOfParsingResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfParsingResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree parsingResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parsingResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parsingResultPropertyTree!= null):((parsingResultPropertyTree == null)||(!parsingResultPropertyTree.isLeaf())))) {
            if (this.parsingResult == null) {
                _other.parsingResult = null;
            } else {
                _other.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
                for (ParsingResult _item: this.parsingResult) {
                    _other.parsingResult.add(((_item == null)?null:_item.newCopyBuilder(_other, parsingResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfParsingResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfParsingResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfParsingResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfParsingResult.Builder<_B> copyOf(final ListOfParsingResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfParsingResult.Builder<_B> _newBuilder = new ListOfParsingResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfParsingResult.Builder<Void> copyExcept(final ListOfParsingResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfParsingResult.Builder<Void> copyOnly(final ListOfParsingResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfParsingResult _storedValue;
        private List<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>> parsingResult;

        public Builder(final _B _parentBuilder, final ListOfParsingResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.parsingResult == null) {
                        this.parsingResult = null;
                    } else {
                        this.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
                        for (ParsingResult _item: _other.parsingResult) {
                            this.parsingResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfParsingResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree parsingResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parsingResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parsingResultPropertyTree!= null):((parsingResultPropertyTree == null)||(!parsingResultPropertyTree.isLeaf())))) {
                        if (_other.parsingResult == null) {
                            this.parsingResult = null;
                        } else {
                            this.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
                            for (ParsingResult _item: _other.parsingResult) {
                                this.parsingResult.add(((_item == null)?null:_item.newCopyBuilder(this, parsingResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfParsingResult >_P init(final _P _product) {
            if (this.parsingResult!= null) {
                final List<ParsingResult> parsingResult = new ArrayList<ParsingResult>(this.parsingResult.size());
                for (ParsingResult.Builder<ListOfParsingResult.Builder<_B>> _item: this.parsingResult) {
                    parsingResult.add(_item.build());
                }
                _product.parsingResult = parsingResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "parsingResult" hinzu.
         * 
         * @param parsingResult
         *     Werte, die zur Eigenschaft "parsingResult" hinzugefügt werden.
         */
        public ListOfParsingResult.Builder<_B> addParsingResult(final Iterable<? extends ParsingResult> parsingResult) {
            if (parsingResult!= null) {
                if (this.parsingResult == null) {
                    this.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
                }
                for (ParsingResult _item: parsingResult) {
                    this.parsingResult.add(new ParsingResult.Builder<ListOfParsingResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parsingResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param parsingResult
         *     Neuer Wert der Eigenschaft "parsingResult".
         */
        public ListOfParsingResult.Builder<_B> withParsingResult(final Iterable<? extends ParsingResult> parsingResult) {
            if (this.parsingResult!= null) {
                this.parsingResult.clear();
            }
            return addParsingResult(parsingResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "parsingResult" hinzu.
         * 
         * @param parsingResult
         *     Werte, die zur Eigenschaft "parsingResult" hinzugefügt werden.
         */
        public ListOfParsingResult.Builder<_B> addParsingResult(ParsingResult... parsingResult) {
            addParsingResult(Arrays.asList(parsingResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parsingResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param parsingResult
         *     Neuer Wert der Eigenschaft "parsingResult".
         */
        public ListOfParsingResult.Builder<_B> withParsingResult(ParsingResult... parsingResult) {
            withParsingResult(Arrays.asList(parsingResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ParsingResult".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ParsingResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ParsingResult".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ParsingResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ParsingResult.Builder<? extends ListOfParsingResult.Builder<_B>> addParsingResult() {
            if (this.parsingResult == null) {
                this.parsingResult = new ArrayList<ParsingResult.Builder<ListOfParsingResult.Builder<_B>>>();
            }
            final ParsingResult.Builder<ListOfParsingResult.Builder<_B>> parsingResult_Builder = new ParsingResult.Builder<ListOfParsingResult.Builder<_B>>(this, null, false);
            this.parsingResult.add(parsingResult_Builder);
            return parsingResult_Builder;
        }

        @Override
        public ListOfParsingResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfParsingResult());
            } else {
                return ((ListOfParsingResult) _storedValue);
            }
        }

        public ListOfParsingResult.Builder<_B> copyOf(final ListOfParsingResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfParsingResult.Builder<_B> copyOf(final ListOfParsingResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfParsingResult.Selector<ListOfParsingResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfParsingResult.Select _root() {
            return new ListOfParsingResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ParsingResult.Selector<TRoot, ListOfParsingResult.Selector<TRoot, TParent>> parsingResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.parsingResult!= null) {
                products.put("parsingResult", this.parsingResult.init());
            }
            return products;
        }

        public ParsingResult.Selector<TRoot, ListOfParsingResult.Selector<TRoot, TParent>> parsingResult() {
            return ((this.parsingResult == null)?this.parsingResult = new ParsingResult.Selector<TRoot, ListOfParsingResult.Selector<TRoot, TParent>>(this._root, this, "parsingResult"):this.parsingResult);
        }

    }

}
