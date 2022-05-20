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
 * <p>Java-Klasse für ListOfSemanticChangeStructureDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSemanticChangeStructureDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SemanticChangeStructureDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SemanticChangeStructureDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSemanticChangeStructureDataType", propOrder = {
    "semanticChangeStructureDataType"
})
public class ListOfSemanticChangeStructureDataType {

    @XmlElement(name = "SemanticChangeStructureDataType", nillable = true)
    protected List<SemanticChangeStructureDataType> semanticChangeStructureDataType;

    /**
     * Gets the value of the semanticChangeStructureDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticChangeStructureDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticChangeStructureDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticChangeStructureDataType }
     * 
     * 
     */
    public List<SemanticChangeStructureDataType> getSemanticChangeStructureDataType() {
        if (semanticChangeStructureDataType == null) {
            semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType>();
        }
        return this.semanticChangeStructureDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSemanticChangeStructureDataType.Builder<_B> _other) {
        if (this.semanticChangeStructureDataType == null) {
            _other.semanticChangeStructureDataType = null;
        } else {
            _other.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
            for (SemanticChangeStructureDataType _item: this.semanticChangeStructureDataType) {
                _other.semanticChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSemanticChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSemanticChangeStructureDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSemanticChangeStructureDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSemanticChangeStructureDataType.Builder<Void> builder() {
        return new ListOfSemanticChangeStructureDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSemanticChangeStructureDataType.Builder<_B> copyOf(final ListOfSemanticChangeStructureDataType _other) {
        final ListOfSemanticChangeStructureDataType.Builder<_B> _newBuilder = new ListOfSemanticChangeStructureDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSemanticChangeStructureDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree semanticChangeStructureDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semanticChangeStructureDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semanticChangeStructureDataTypePropertyTree!= null):((semanticChangeStructureDataTypePropertyTree == null)||(!semanticChangeStructureDataTypePropertyTree.isLeaf())))) {
            if (this.semanticChangeStructureDataType == null) {
                _other.semanticChangeStructureDataType = null;
            } else {
                _other.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
                for (SemanticChangeStructureDataType _item: this.semanticChangeStructureDataType) {
                    _other.semanticChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, semanticChangeStructureDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSemanticChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSemanticChangeStructureDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSemanticChangeStructureDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSemanticChangeStructureDataType.Builder<_B> copyOf(final ListOfSemanticChangeStructureDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSemanticChangeStructureDataType.Builder<_B> _newBuilder = new ListOfSemanticChangeStructureDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSemanticChangeStructureDataType.Builder<Void> copyExcept(final ListOfSemanticChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSemanticChangeStructureDataType.Builder<Void> copyOnly(final ListOfSemanticChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSemanticChangeStructureDataType _storedValue;
        private List<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>> semanticChangeStructureDataType;

        public Builder(final _B _parentBuilder, final ListOfSemanticChangeStructureDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.semanticChangeStructureDataType == null) {
                        this.semanticChangeStructureDataType = null;
                    } else {
                        this.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
                        for (SemanticChangeStructureDataType _item: _other.semanticChangeStructureDataType) {
                            this.semanticChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSemanticChangeStructureDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree semanticChangeStructureDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semanticChangeStructureDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semanticChangeStructureDataTypePropertyTree!= null):((semanticChangeStructureDataTypePropertyTree == null)||(!semanticChangeStructureDataTypePropertyTree.isLeaf())))) {
                        if (_other.semanticChangeStructureDataType == null) {
                            this.semanticChangeStructureDataType = null;
                        } else {
                            this.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
                            for (SemanticChangeStructureDataType _item: _other.semanticChangeStructureDataType) {
                                this.semanticChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(this, semanticChangeStructureDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSemanticChangeStructureDataType >_P init(final _P _product) {
            if (this.semanticChangeStructureDataType!= null) {
                final List<SemanticChangeStructureDataType> semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType>(this.semanticChangeStructureDataType.size());
                for (SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>> _item: this.semanticChangeStructureDataType) {
                    semanticChangeStructureDataType.add(_item.build());
                }
                _product.semanticChangeStructureDataType = semanticChangeStructureDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "semanticChangeStructureDataType" hinzu.
         * 
         * @param semanticChangeStructureDataType
         *     Werte, die zur Eigenschaft "semanticChangeStructureDataType" hinzugefügt werden.
         */
        public ListOfSemanticChangeStructureDataType.Builder<_B> addSemanticChangeStructureDataType(final Iterable<? extends SemanticChangeStructureDataType> semanticChangeStructureDataType) {
            if (semanticChangeStructureDataType!= null) {
                if (this.semanticChangeStructureDataType == null) {
                    this.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
                }
                for (SemanticChangeStructureDataType _item: semanticChangeStructureDataType) {
                    this.semanticChangeStructureDataType.add(new SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "semanticChangeStructureDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param semanticChangeStructureDataType
         *     Neuer Wert der Eigenschaft "semanticChangeStructureDataType".
         */
        public ListOfSemanticChangeStructureDataType.Builder<_B> withSemanticChangeStructureDataType(final Iterable<? extends SemanticChangeStructureDataType> semanticChangeStructureDataType) {
            if (this.semanticChangeStructureDataType!= null) {
                this.semanticChangeStructureDataType.clear();
            }
            return addSemanticChangeStructureDataType(semanticChangeStructureDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "semanticChangeStructureDataType" hinzu.
         * 
         * @param semanticChangeStructureDataType
         *     Werte, die zur Eigenschaft "semanticChangeStructureDataType" hinzugefügt werden.
         */
        public ListOfSemanticChangeStructureDataType.Builder<_B> addSemanticChangeStructureDataType(SemanticChangeStructureDataType... semanticChangeStructureDataType) {
            addSemanticChangeStructureDataType(Arrays.asList(semanticChangeStructureDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "semanticChangeStructureDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param semanticChangeStructureDataType
         *     Neuer Wert der Eigenschaft "semanticChangeStructureDataType".
         */
        public ListOfSemanticChangeStructureDataType.Builder<_B> withSemanticChangeStructureDataType(SemanticChangeStructureDataType... semanticChangeStructureDataType) {
            withSemanticChangeStructureDataType(Arrays.asList(semanticChangeStructureDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SemanticChangeStructureDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SemanticChangeStructureDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SemanticChangeStructureDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SemanticChangeStructureDataType.Builder<? extends ListOfSemanticChangeStructureDataType.Builder<_B>> addSemanticChangeStructureDataType() {
            if (this.semanticChangeStructureDataType == null) {
                this.semanticChangeStructureDataType = new ArrayList<SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>>();
            }
            final SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>> semanticChangeStructureDataType_Builder = new SemanticChangeStructureDataType.Builder<ListOfSemanticChangeStructureDataType.Builder<_B>>(this, null, false);
            this.semanticChangeStructureDataType.add(semanticChangeStructureDataType_Builder);
            return semanticChangeStructureDataType_Builder;
        }

        @Override
        public ListOfSemanticChangeStructureDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSemanticChangeStructureDataType());
            } else {
                return ((ListOfSemanticChangeStructureDataType) _storedValue);
            }
        }

        public ListOfSemanticChangeStructureDataType.Builder<_B> copyOf(final ListOfSemanticChangeStructureDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSemanticChangeStructureDataType.Builder<_B> copyOf(final ListOfSemanticChangeStructureDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSemanticChangeStructureDataType.Selector<ListOfSemanticChangeStructureDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSemanticChangeStructureDataType.Select _root() {
            return new ListOfSemanticChangeStructureDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SemanticChangeStructureDataType.Selector<TRoot, ListOfSemanticChangeStructureDataType.Selector<TRoot, TParent>> semanticChangeStructureDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.semanticChangeStructureDataType!= null) {
                products.put("semanticChangeStructureDataType", this.semanticChangeStructureDataType.init());
            }
            return products;
        }

        public SemanticChangeStructureDataType.Selector<TRoot, ListOfSemanticChangeStructureDataType.Selector<TRoot, TParent>> semanticChangeStructureDataType() {
            return ((this.semanticChangeStructureDataType == null)?this.semanticChangeStructureDataType = new SemanticChangeStructureDataType.Selector<TRoot, ListOfSemanticChangeStructureDataType.Selector<TRoot, TParent>>(this._root, this, "semanticChangeStructureDataType"):this.semanticChangeStructureDataType);
        }

    }

}
